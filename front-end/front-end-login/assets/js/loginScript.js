
let loginFormStatus = "";

let driverLogForm = $("#driverLogForm");
let userLogForm = $("#userLogForm");
let adminLogForm = $("#adminLogForm");
let selectForm = $("#selectForm");

let userRegForm = $("#userRegForm");
let driverRegForm = $("#driverRegForm");
let adminRegForm = $("#adminRegForm");

function setVisibleFalseAll() {
    console.log("asas")

    selectForm.css('display', 'flex')
    userLogForm.css('display', 'none')
    adminLogForm.css('display', 'none')
    driverLogForm.css('display', 'none')
    userRegForm.css('display', 'none')
    driverRegForm.css('display', 'none')
    adminRegForm.css('display', 'none')
}

setVisibleFalseAll();


$(".openUserLog").click(function (){
    loginFormStatus = "user_login";

    driverLogForm.css('display','none')
    userLogForm.css('display','flex')
    userRegForm.css('display','none')
    selectForm.css('display','none')
});

$(".openDriverLog").click(function (){
    loginFormStatus = "driver_login";

    userLogForm.css('display','none')
    driverLogForm.css('display','flex')
    driverRegForm.css('display','none')
    selectForm.css('display','none')
});

$("#openUserReg").click(function (){
    loginFormStatus = "user_reg";

    userLogForm.css('display', 'none')
    userRegForm.css('display', 'flex')
});

$(".openDriverReg").click(function () {
    loginFormStatus = "driver_reg";

    driverLogForm.css('display', 'none')
    driverRegForm.css('display', 'flex')
});

$(".openAdminReg").click(function () {
    loginFormStatus = "admin_reg";

    driverLogForm.css('display', 'none')
    driverRegForm.css('display', 'none')
    adminRegForm
        .css('display', 'flex')
});

