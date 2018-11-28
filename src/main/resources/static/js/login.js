

$("#submit").click(function () {
    $.ajax({
        type: "POST",
        dataType:"json",
        url:"/user/login",
        data: {
            username: $("#inputUsername").val(),
            password: $("#inputPassword").val()
        },
        async: false,
        success: function (data) {
            if(data.success){
                alert(data.message);
            }else {
                alert(data.message);
            }
        }
    });
});