function deleteMenu() {
    $(this).parent().parent().remove();
}

$(function() {    
    $('.order-accordion > *:nth-child(even)').not($('.accordion-first')).hide();
    
    $('.next-step').click(function() {
        $(this).parent().parent().hide(500).next().next().show(500);
    })
    
    $('.prev-step').click(function() {
        $(this).parent().parent().hide(500).prev().prev().show(500);
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
    
    $('#menu-board').tabs();

    $('.menu-delete').click(deleteMenu);






    
    $('[name="option1"], [name="option2"]').change(function() {
        $(this).parent().css({'border' : '3px solid #F67A3E'}).siblings().css({'border' : 'none'});
    });


    var mainMenu;
    $('#tab_all_menu > div').click(function() {
        mainMenu = $(this).children('p:nth-of-type(1)').text();
        $('#modal-main-container1').show();
        $('#modal-background').show();
    });

    $('#modal-background, .cancel').click(function() {
        $('#modal-main-container1').hide();
        $('#modal-background').hide();
    });
    
    $('#modal-main-container1 .complate').click(function() {
        $('#modal-main-container1').hide();
        $('#modal-main-container2').show();
    });
    
    $('#modal-main-container2 .complate').click(function() {
        $('#modal-main-container2').hide();
        $('#modal-background').hide();
        let selectedOption1 = $('[name="option1"]:checked').next().children('p:nth-of-type(1)').text();
        let selectedOption2 = $('[name="option2"]:checked').next().children('p:nth-of-type(1)').text();
        let tag = '<div><p class="main-menu">-'+mainMenu+'<span class="menu-delete">X</span></p><p class="sub-option">'+selectedOption1+'</p><p class="sub-option">'+selectedOption2+'</p></div>';
        $('#select-menu-list').prepend(tag);
        $('.menu-delete').click(deleteMenu);
    });












});
