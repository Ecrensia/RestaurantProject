$(function(){ 
    $(".madal1").hide();
    $(".btn2").click(function(){
      $(".modal1").fadeIn();
    });
    
    $(".modal1_button").click(function(){
      $(".modal1").fadeOut();
    });
    
  });