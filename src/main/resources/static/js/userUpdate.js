function toUpdate(o){
    var id=$(o).val();
    $.get("findUserById.action",{"id":id },function(user){
        var id=$("#id").val(user.id);
        var deng=$("#deng").val(user.deng);
        var password=$("#password1").val(user.password);
        var heda=$("#head").val(user.head);
        var username=$("#username").val(user.username);
        var sign=$("#sign").val(user.sign);
        var address=$("#address").val(user.address);
    },"json")
}

function originalPassword() {
    var password=$("#password1").val();
    $.post("findUserByPassword.action",{"password":password},function (data) {
        if(data==1){
            $("#mess").html("<font color='#6b8e23'>密码正确，请填写新密码吧</font>");
            $("#password2").removeAttr("disabled");
            $("#password").removeAttr("disabled");
            $("#updateButton").removeAttr("disabled");
            $("#mess.font").remove();
        }else{
            $("#mess").html("<font color='red'>密码错误</font>");
            $("#password2").attr({"disabled":"disabled"});
            $("#password").attr({"disabled":"disabled"});
            $("#updateButton").attr({"disabled":"disabled"});
        }
    },"json")
}

function determinePassword(){
    var password2=$("#password2").val();
    var password=$("#password").val();
    if(password2==password){
        $("#updateButton").removeAttr("disabled");
    }else{
        $("#mess2").html("<font color='red'>两次密码不一致</font>");
        $("#updateButton").attr({"disabled":"disabled"});
    }
}

