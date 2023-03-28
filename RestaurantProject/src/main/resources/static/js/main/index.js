$(function() {
    let index = 1;

    $('.left').click(function() {
        $('#gallery-img-box > img:last-child').css({'marginLeft' : '-1100px'}).insertBefore('#gallery-img-box > img:first-child');
        $('#gallery-img-box > img:first-child').animate({'marginLeft' : '0px'}, 1000);
        
        index--;
        if(index == 0) index = 4;
        $(`#gallery-map > div:nth-child(${index})`).addClass("gallery-selected").siblings().removeClass("gallery-selected");
    });

    $('.right').click(function() {
        $('#gallery-img-box > img:first-child').animate({'marginLeft' : '-1100px'}, 1000, function() {
            $('#gallery-img-box > img:first-child').insertAfter('#gallery-img-box > img:last-child').css({'marginLeft' : '0px'});
        });

        index++;
        if(index == 5) index = 1;
        $(`#gallery-map > div:nth-child(${index})`).addClass("gallery-selected").siblings().removeClass("gallery-selected");
    });
});