window.addEventListener('load',main)

function main() {

    $.ajax({
            type: "GET",
            url: 'http://localhost:8080/welcome/get/json',
            headers: {"Authorization": localStorage.getItem('Authentication')},
            contentType: "application/json",
            accepts: { json: "application/json"},
            success: function (data) {
                alert("Hello" + data);
                checkRole("client");
            },
            fail: function (role, username, errorThrown) {
                console.log(role);
                console.log(username);
                console.log(errorThrown);
                alert('request failed');
            }
        })


    function checkRole() {
        switch ("client") {
            case "client":
                $("div.client").show();
                $("div.navbarclient").show();
                break;
            case "bank":
                $("div.bank").show();
                $("div.navbarbank").show();
                break;
            case "administrator":
                $("div.administrator").show();
                $("div.navbaradmin").show()
                break;
            default:
                console.log('This is not a valid user role');
        }
    }
}