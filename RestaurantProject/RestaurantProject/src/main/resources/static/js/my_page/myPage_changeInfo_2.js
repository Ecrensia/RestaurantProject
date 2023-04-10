$(function(){ 

    $(".btn2").click(function(){
      $(".modal1").fadeIn();
    });
    
    $(".modal1_button").click(function(){
      $(".modal1").fadeOut();
    });


    
    $("#change_box_1").hide();
    $(".btn_change1").click(function(){
        $("#change_box_1").show();
    });
    $(".btn_change1_btn").click(function(){
        $("#change_box_1").hide();
    });

    $("#change_box_2").hide();
    $(".btn_change2").click(function(){
        $("#change_box_2").show();
    });
    
  });