$(function() {
	$('.alert_id').hide();
	// $('.id_input').focus(function(){
	//     $('.alert_id').show();
	// });
	// $('.id_input').blur(function(){
	//     $('.alert_id').hide();
	// });

	$('.id_input').on({
		'focus': function() {
			$('.alert_id').show();
		},
		'focusout': function() {
			$('.alert_id').hide();
		}
	});

	$('.alert_pw1').hide();
	$('.pw_input').on({
		'focus': function() {
			$('.alert_pw1').show();
		},
		'focusout': function() {
			$('.alert_pw1').hide();
		}
	});

	$('.alert_pw2').hide();
	$('.pw_chk').focusout(function() {
		let pw_input = document.querySelector('.pw_input');
		let pw_chk = document.querySelector('.pw_chk');

		if (pw_input.value != pw_chk.value) {
			$('.alert_pw2').show();
		} else {
			$('.alert_pw2').hide();
		}

	});

	$('.unselect_birthday').click(function() {

		if ($('.unselect_birthday').is(':checked')) {
			$('.select_birthday').prop("disabled", true);
		} else {
			$('.select_birthday').prop("disabled", false);
		}
	});

	// modal popup
	// $(".modal").hide();

	$(".submit_button").click(function() {
		$(".modal").show();
	});
	

	$(".modal_button").click(function() {
		$(".modal").hide();
	});
	
	

	$(".chk").click(function() {
		
		$.ajax({
			url: '/id/chk/' + $(".id_input").val(),
			type: 'post',
			dataType: 'json',
			success: function(r) {
				alert(r.msg);
			}
		})
	});
	
	//?????????????????????????????????????????????
	$(".submit_button").click(function(){
		if($("#idChk").value() != idUnChk){
			alert("아이디 중복체크를 확인하세요.")
		}else{
			location.href="/signupSuccess";
		}
	});


});


function telCheck() {
	let tel = document.querySelector('#tel');

	if (isNaN(tel.value)) {
		if (tel.classList.contains('true'))
			tel.classList.remove('true');
		if (!tel.classList.contains('false'))
			tel.classList.add('false')
		return false;
	}
	if (tel.value.length < 10 || tel.value.length > 11) {
		if (tel.classList.contains('true'))
			tel.classList.remove('true');
		if (!tel.classList.contains('false'))
			tel.classList.add('false');
		return false;
	}
	if (tel.classList.contains('false'))
		tel.classList.remove('false');
	if (!tel.classList.contains('true'))
		tel.classList.add('true');

	return true;
}
window.onload = () => {
	let tel = document.querySelector('#tel');
	tel.onkeyup = telCheck;

}




