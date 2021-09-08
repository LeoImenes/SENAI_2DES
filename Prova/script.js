var table = document.querySelector("#dados");

var task = document.querySelector("#input");

function btn_create() {
    let row = document.createElement("tr");

    for (let i = 0; i < 1; i++) {
        let col = document.createElement("td");
        let data = [task.value]

        col.innerHTML = data[i];

        row.appendChild(col);
    }

    task.value = "";

    let Alert = document.createElement("button");
    Alert.innerHTML = "<img src = 'img/alert.png'>";

    Alert.addEventListener("click", () => {
        btn_alert(buttonAlert);
    });

    let Alert = document.createElement("td");
    Alert.appendChild(buttonAlert);

    row.appendChild(Alert);


    let butTrash = document.createElement("button");
    butTrash.innerHTML = "<img src = 'img/trash.png'>";

    butTrash.addEventListener("click", () => {
        btn_trash(butTrash);
    });

    let colTrash = document.createElement("td");
    colTrash.appendChild(buttonTrash);

    row.appendChild(colTrash);

    table.appendChild(row);
}

function btn_alert(e) {
    e.parentNode.parentNode.setAttribute("bgcolor", "#FF7878")
}

function btn_trash(e) {
    e.parentNode.parentNode.remove();
}
