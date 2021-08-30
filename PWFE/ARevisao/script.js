var cartas = ["css.jpeg", "css.jpeg", "js.jpeg", "js.jpeg", "htlm.jpeg", "htlm.jpeg", "python.jpeg", "python.jpeg"]

function flipCard(qual) {



    let card = document.getElementById(qual.id);
    card.frente = cartas[Math.floor(Math.random() * 8)];
    card.verso = "verso.jpeg"

    card.setAttribute("style", "background-image: url('../assets/" + card.frente + "')");
}