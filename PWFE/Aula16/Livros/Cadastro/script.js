function Add(){
   let id =document.querySelector("#Livro_id").value
   let nome =document.querySelector("#Livro_nome").value
   let autor =document.querySelector("#Livro_autor").value
   let editora =document.querySelector("#Livro_editora").value
   let idioma =document.querySelector("#Livro_idioma").value
   let Img =document.querySelector("#Livro_img").value
   let Lanc =document.querySelector("#Livro_lancamento").value

   let data = Lanc.split("-");
    let dataformatada = (data[2] + "-" + data[1] + "-" + data[0])

   let pgs =document.querySelector("#Livro_pgs").value
   let est =document.querySelector("#Livro_estoque").value
   let pre=document.querySelector("#Livro_preco").value

   

   let obj = {
       "id": parseInt(id),
       "titulo": nome,
       "autor": autor,
       "editora": editora,
       "idioma": idioma,
       "urlImagem": Img,
       "lancamento": dataformatada,
       "numeroPaginas":parseInt(pgs),
       "estoque":parseInt(est),
       "preco": parseFloat(pre)


       
   }
   console.log(obj)
  
   let url = "http://10.87.207.2:8080/api/livro";
   fetch(url,{
    method:"POST",
    body:JSON.stringify(obj)
}).then(res=> {return res.json()})
.then(data => {
    console.log(data)
}).catch(error=>{console.log(error)});
}
