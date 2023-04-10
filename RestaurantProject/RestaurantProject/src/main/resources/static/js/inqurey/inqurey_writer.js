function telCheck(){
    let tel = document.querySelector('#tel');
    
    if(isNaN(tel.value)){
        if(tel.classList.contains('true'))
            tel.classList.remove('true');
        if(!tel.classList.contains('false'))
            tel.classList.add('false')
        return false;
    }
    if(tel.value.length < 10 || tel.value.length > 11){
        if(tel.classList.contains('true'))
            tel.classList.remove('true');
        if(!tel.classList.contains('false'))
            tel.classList.add('false');
        return false;
    }
    if(tel.classList.contains('false'))
        tel.classList.remove('false');
    if(!tel.classList.contains('true'))
        tel.classList.add('true');

    return true;

}

$(function(){
    $('#mail').change(function(){
        let input = $('#mail  option:selected').text();
        if(input != '직접 입력'){
             $('.mail_write').prop('value', input);
        }else{
            $('.mail_write').prop('value', '');

        }

    });
});
$(function(){
    $('.chk').click(function(){
        let chk = $(this).eq(1)
    });
});