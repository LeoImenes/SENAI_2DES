var username = document.querySelector("#username");
const url = "https://jsonplaceholder.typicode.com/posts?userId=" + localStorage.getItem("id");
const list = document.querySelector(".list");

username.innerHTML = localStorage.getItem("name");

fetch(url).then(resp => {
    return resp.json();
}).then(data => {
    data.forEach(post =>{
        let item = document.querySelector(".item").cloneNode(true);
        item.classList.remove("model");
        item.querySelector("h1").innerHTML = post.title;
        item.querySelector("h3").innerHTML = post.body;
        list.appendChild(item);
    })
}).catch(error => {
    console.log(error);
})

function toAlbuns(){
    window.location.href = "/albuns";
}
function toPosts(){
    window.location.href = "/post";
}