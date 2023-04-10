function deleteMenu() {
    let currentCount = parseInt($('#total-menu-count').text());
    let deleteCount = parseInt($(this).parent().prev().children().eq(1).children().eq(1).val());
    $('#total-menu-count').text(String(currentCount - deleteCount));
    let deletePrice = parseInt($(this).prev().children().eq(0).text());
    let currentPrice = parseInt($('#total-menu-price').text());
    $('#total-menu-price').text(String(currentPrice - deletePrice));
    
    $(this).parent().parent().remove();
}

function changeMenuCount() {
    let currentVal = parseInt($('[name="menu-count"]').val());
    if($(this).attr('name') == 'menu-minus') {
        if(currentVal == 1) return;
        $(this).next().attr('value', currentVal - 1);
    } else if($(this).attr('name') == 'menu-plus') {
        if(currentVal == 9) return;
        $(this).prev().attr('value', currentVal + 1);
    }
   
}

function selectMenuListChange() {
    let totalCount = 0;
    let totalPrice = 0;
    let selectMenuBoxLength = $('.select-menu-box').length;
    let selectMenuBox = $($('.select-menu-box')[0]);

    console.log(selectMenuBox);
    console.log(selectMenuBoxLength);
}


$(function() {
    $('.order-accordion > *:nth-child(even)').not($('.accordion-first')).hide();

    $('.next-step').click(function() {
        let parentClass = $(this).parent().parent().attr('class');
        if(parentClass == 'accordion-first') {
            $('.accordion-first').hide(500);
            if($('#reserv').is(':checked')) {
                $('.accordion-second').show(500);
            } else {
                $('.accordion-third').show(500);
            }
        } else {
            $(this).parent().parent().hide(500);
            $('.accordion-fourth').show(500);
        }
    })

    $('.prev-step').click(function() {
        let parentClass = $(this).parent().parent().attr('class');
        if(parentClass == 'accordion-fourth') {
            $('.accordion-fourth').hide(500);
            if($('#reserv').is(':checked')) {
                $('.accordion-second').show(500);
            } else {
                $('.accordion-third').show(500);
            }
        } else {
            $(this).parent().parent().hide(500);
            $('.accordion-first').show(500);
        }
    })


    $('[type="radio"]').click(function() {
        if($('#deliv').is(':checked')) {
            $('#main-address').removeAttr('disabled');
            $('#sub-address').removeAttr('disabled');
            $('#address-search').removeAttr('disabled');
        } else {
            $('#main-address').attr('disabled', true);
            $('#sub-address').attr('disabled', true);
            $('#address-search').attr('disabled', true);
        }
    });

    $('#branch-office > div > label').click(function() {
        $(this).parent().css({'backgroundColor' : '#F67A3E'}).siblings().css({'backgroundColor' : '#FFF'});

    });
    
    $('#branch-office > div').on({
        'mouseover' : function() {
            $(this).css({'backgroundColor' : '#F67A3E'})
        },
        'mouseleave' : function() {
            if(!$(this).children().first().is(':checked')) {
                $(this).css({'backgroundColor' : '#FFF'})
            }
        }
    })

    $('.seat-map > div > label').click(function() {
        let person = $('[name="personnel"]').val();
        let checkedSeat = $('.seat:checked').length;

        if(person == checkedSeat) return;

        if($(this).prev().is(':checked')) {
            $(this).parent().css({'backgroundColor' : '#FFF'});
        } else {
            $(this).parent().css({'backgroundColor' : '#F67A3E'});
        }
    });

    $('.seat-map > div').on({
        'mouseover' : function() {
            $(this).css({'backgroundColor' : '#F67A3E'})
        },
        'mouseleave' : function() {
            if(!$(this).children().first().is(':checked')) {
                $(this).css({'backgroundColor' : '#FFF'})
            }
        }
    });

    $('.seat').change(function() {
        let person = $('[name="personnel"]').val();
        let checkedSeat = $('.seat:checked').length;

        if(person == checkedSeat) {
            $('.seat:not(:checked)').attr("disabled", "disabled");
        } else {
            $('.seat').removeAttr("disabled");
        }
    });

    $('#personnel').change(function() {
        $('.seat').prop("checked", false);
        $('.seat').parent().css({'backgroundColor' : '#FFF'});
        $('.seat').removeAttr("disabled");
    });
    
    $('#menu-board > ul > li').click(function() {
        $(this).css({'backgroundColor' : '#F67A3E'}).siblings().css({'backgroundColor' : '#FFF'});
    })


    $('#menu-board').tabs();

    $('.menu-delete').click(deleteMenu);






    
    $('[name="option1"], [name="option2"]').change(function() {
        $(this).parent().css({'border' : '3px solid #F67A3E'}).siblings().css({'border' : 'none'});
    });


    var mainMenu;
    var price = 0;
    $('.can-side').click(function() {
        mainMenu = $(this).children('p:nth-of-type(1)').text();
        price = parseInt($(this).children('p:nth-of-type(2)').text());
        $('#modal-main-container1').show();
        $('#modal-background').show();
    });

    $('#modal-background, .cancel').click(function() {
        $(this).parent().parent().hide();
        $('#modal-background').hide();
        $('.modal-content-box').css({'border' : 'none'});
    });
    
    $('#modal-main-container1 .complate').click(function() {
        $('#modal-main-container1').hide();
        $('#modal-main-container2').show();
    });
    
    $('#modal-main-container2 .complate').click(function() {
        $('#modal-main-container2').hide();
        $('#modal-background').hide();
       
        let selectedOption1 = $('[name="option1"]:checked').next().children('p:nth-of-type(1)').text();
        price += parseInt($('[name="option1"]:checked').next().children('p:nth-of-type(2)').text());
        let selectedOption2 = $('[name="option2"]:checked').next().children('p:nth-of-type(1)').text();
        price += parseInt($('[name="option2"]:checked').next().children('p:nth-of-type(2)').text());
        
        let tag = '<div calss="select-menu-box"><div class="select-menu-info"><div class="select-menu-name"><p class="main-menu">-' + mainMenu + '</p><p class="sub-option">' + selectedOption1 + '</p><p class="sub-option">' + selectedOption2 + '</p></div><div class="select-menu-count"><button type="button" name="menu-minus">-</button><input type="text" name="menu-count" value="1" readonly><button type="button" name="menu-plus">+</button></div></div><div class="select-menu-price"><span><span class="select-menu-box-price">' + price + '</span>원</span><span class="menu-delete">X</span></div></div>';
        
        $('#select-menu-list').prepend(tag);
        $('.menu-delete').click(deleteMenu);
        $('.modal-content-box').css({'border' : 'none'});
        $('.select-menu-count > button').click(changeMenuCount);

        let currentCount = parseInt($('#total-menu-count').text());
        $('#total-menu-count').text(String(currentCount + 1));
        let currentPrice = parseInt($('#total-menu-price').text());
        $('#total-menu-price').text(String(currentPrice + parseInt(price)));
    });












});
