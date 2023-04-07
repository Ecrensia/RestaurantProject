
$(function(){
  $(".modal_button").click(function(){
      $(".modal").show();
    });
    
    $(".close").click(function(){
      $(".modal").hide();
    });
    
});
$(function(){
  $(".connect_btn").click(function(){
      $('.modal_sub').show();
    });
  
    $('.sub_close').click(function(){
      $(".modal_sub").hide();
    });
});