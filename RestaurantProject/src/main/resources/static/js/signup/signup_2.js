$(function() {
   
    $('#check_btn').click(function(){
        
        if($("#check_btn").is(':checked')) {
            $("input[name=chk]").prop("checked", true);
        } else {
            $("input[name=chk]").prop("checked", false);
        }
        
    });

    $(document).on("click", "input:checkbox[name=chk]", function(e) {
	
        var chks = document.getElementsByName("chk");
        var chksChecked = 0;
        
        for(var i=0; i<chks.length; i++) {
            var chk = chks[i];
            
            if(chk.checked) {
                chksChecked++;
            }
        }
        
        if(chks.length == chksChecked){
            $("#check_btn").prop("checked", true);
        }else{
            $("#check_btn").prop("checked",false);
        }
        
    });

    // modal 팝업
    $(function(){ 

        $(".btn1").click(function(){
          $(".modal1").fadeIn();
        });
        
        $(".modal1_button").click(function(){
          $(".modal1").fadeOut();
        });
        
      });

      $(function(){ 

        $(".btn2").click(function(){
          $(".modal2").fadeIn();
        });
        
        $(".modal2_button").click(function(){
          $(".modal2").fadeOut();
        });
        
      });
      
      // 필수체크 
      $(function(){
        $('[type = "button"]').click(function(){
          if($("#check_btn1").is(":checked")&&
             $("#check_btn2").is(":checked")){
              location.href="/signup3";
          }else{
            alert("필수 동의 사항이 체크되지 않았습니다.")
          }
        })
      });
    



});
