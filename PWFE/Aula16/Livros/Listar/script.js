const url = "http://10.87.207.2:8080/api/livros"
const list = document.querySelector(".lista_livros");

fetch(url).then(resp => {
    return resp.json();
}).then(data => {
    data.forEach(livro =>{
        let item = document.querySelector(".livro").cloneNode(true);
        item.querySelector("p").innerHTML = livro.titulo;
        item.querySelector("img").src = livro.urlImagem;

        list.appendChild(item);
    })
}).catch(error => {
    console.log(error);
})