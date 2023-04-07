$(function(){
    let selectFlag = false;
    $('#all-select').click(function(){

        if(selectFlag){
            $('#list-inventory input').prop("checked", false);
            selectFlag = false;
        }else{
            $('#list-inventory input').prop("checked", true);
            selectFlag = true;
        }
        console.log(selectFlag);
    });
});