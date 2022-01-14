db.collection("profilelist").orderBy("createAPI", "desc").get()
.then(function(collection){
    console.log("data:",collection)
    collection.forEach(function(doc){
        var profileData = doc.data()
        var name = profileData.name
        var age = profileData.age
        var img = profileData.image
        var grade = profileData.grade
        console.log("profile:",profileData)
        var col = `
            <div class="col-md-4 col-lg-3 col-sm-6 cardobj
            ">
                <div class="card">
                    <img src ="${img}" class="card-img-top">
                    <div class="card-body">
                        <h4>${name}</h4>
                        ${age}</br>
                        ${grade}</br>
                    </div>
                </div>
            </div>
        `
        $("#profileRow").append(col)
    })
})
.catch(function(err){
    console.log("Error:",err)
})

$("#createprofileForm").submit(function(event){
    event.preventDefault();
    console.log("Form is submitted")
    var profile = {
        name : $("#createprofileName").val(),
        age : $("#createprofileage").val(),
        grade : $("#createprofilegrade").val(),
        image : $("#createprofileImage").val(),
        createAPI : new Date()
    }
    console.log("profile:",profile)
    db.collection("profilelist").add(profile)
    .then(function(){
        alert("Profile created successfully!")
    })
    .catch(function(err){
        console.log("Error:",err)
        alert("Error")
    })
})

$("#loginForm").submit(function(event){
    event.preventDefault();
    var mail = $("#loginEmail").val()
    var password = $("#loginPassword").val()
    console.log(mail, password)
    firebase.auth().signInWithEmailAndPassword(mail, password)
    .then((user) => { 
        console.log(user)
        alert("Login success!")
        $("#link_Login").addClass("d-none")
        $("#link_SignUp").addClass("d-none")
        $("#link_SignOut").removeClass("d-none")
        $("#loginModal").modal("hide")
        $("#link_create").removeClass("d-none")
    })
    .catch((error) => {
        var errorCode = error.code;
        var errorMessage = error.message;
        alert(errorMessage)
    });
})

$("#signUpForm").submit(function(event){
    event.preventDefault();
    var mail = $("#signUpEmail").val()
    var password = $("#signUpPassword").val()
    console.log(mail, password)
    
    firebase.auth().createUserWithEmailAndPassword(mail, password)
    .then((user) => { 
        console.log(user)
        alert("Sign Up success!")
        $("#link_Login").addClass("d-none")
        $("#link_SignUp").addClass("d-none")
        $("#link_SignOut").removeClass("d-none")
        $("#signUpModal").modal("hide")
        $("#link_create").removeClass("d-none")
    })
    .catch((error) => {
        var errorCode = error.code;
        var errorMessage = error.message;
        alert(errorMessage)
    });
})

function signout() {
    $("#link_Login").removeClass("d-none")
    $("#link_SignUp").removeClass("d-none")
    $("#link_SignOut").addClass("d-none")
    $("#link_create").addClass("d-none")
}