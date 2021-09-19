var body = document.querySelector("body");

function LoadData(e) {
    let file = e.files[0];


    let fr = new FileReader();

    fr.onload = () => {
        let data = JSON.parse(fr.result);
        console.log(data)
        var i = 0
        for (i; i < data.length; i++) {
            GenerateHTML(data[i]);
        }

    };
    fr.readAsText(file);
}

function GenerateHTML(data) {
    let div = document.createElement("div")
    div.className = "filmes"

    let nome = document.createElement("h2");
    nome.innerHTML = data.nome

    let genero = document.createElement("h3");
    genero.innerHTML = data.genero

    let ano = document.createElement("h3");
    ano.innerHTML = data.ano


    let img = document.createElement("img");
    img.src = data.cartaz

    div.appendChild(nome);
    div.appendChild(genero);
    div.appendChild(ano);
    div.appendChild(img);
    body.appendChild(div);

    console.log(data)

}