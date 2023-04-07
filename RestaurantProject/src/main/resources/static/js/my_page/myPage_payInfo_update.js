$( function() {
    $( ".allToS" ).accordion();


    var cardNumber = document.getElementById('card_number');
    cardNumber.onkeyup = function(event){
    event = event || window.event;
    var _val = this.value.trim();
    this.value = autoHypenCard(_val) ;
};
    function autoHypenCard(str){
      str = str.replace(/[^0-9]/g, '');
      var tmp = '';
      if( str.length < 4){
          return str;
      }
      else if(str.length < 8){
          tmp += str.substr(0, 4);
          tmp += '-';
          tmp += str.substr(4,4);
          return tmp;
      }else if(str.length < 12){
          tmp += str.substr(0, 4);
          tmp += '-';
          tmp += str.substr(4, 4);
          tmp += '-';
          tmp += str.substr(8,4);
          return tmp;
      }else if(str.length < 17) {

          tmp += str.substr(0, 4);
          tmp += '-';
          tmp += str.substr(4, 4);
          tmp += '-';
          tmp += str.substr(8,4);
          tmp += '-';
          tmp += str.substr(12,4);
          return tmp;
      }
      return str;
    }



    var cardDate = document.getElementById('card_date');
    cardDate.onkeyup = function(event){
    event = event || window.event;
    var _val = this.value.trim();
    this.value = autoHypenCardDate(_val) ;
};
    function autoHypenCardDate(str){
      str = str.replace(/[^0-9]/g, '');
      var tmp = '';
      if( str.length < 2){
          return str;
      }
      else if(str.length < 4){
          tmp += str.substr(0, 2);
          tmp += '/';
          tmp += str.substr(2,2);
          return tmp;
      }
      return str;
    }

    $(function(){ 

        $(".btn2").click(function(){
          $(".modal1").fadeIn();
        });
        
        $(".modal1_button").click(function(){
          $(".modal1").fadeOut();
        });
    

    });
  });


  
