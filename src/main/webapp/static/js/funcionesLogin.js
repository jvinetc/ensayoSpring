$(document).ready(function(){
    $("#formLogin").validate({
        errorElement: 'span',
	errorClass: 'help-inline',
	rules: {
	    usuUsername: {
                required: true
            },
            usuPass:{
                required:true
            }
        },
        messages:{
            usuUsername: {
                required: "Ingrese Nombre de Usuario"
            },
            usuPass:{
                required:"Ingrese Password"
            }
        },
        highlight: function (e) {
            $(e).closest('.control-group').removeClass('info').addClass('error');
	}
    });
});


