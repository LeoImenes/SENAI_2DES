function Ex1(){
    let num = [5,3,8,7,2,4]
    for(let i = 0; i<num.length; i++){
        console.log(Math.pow(num[i],2))
    }
}
Ex1()
 console.log("\n")

function Ex2(){
    let n_par=0;
    let somapar=0;
    let n_impar=0;
    let somaimpar=0;
    let num = [5,3,8,7,2,4]
    
    for(let i = 0; i<num.length; i++){
        if(num[i]%2 == 0){
            n_par++;
            somapar += num[i]
            
            
            
        }else{
            n_impar++;
            somaimpar += num[i]
           
            
        }
        console.log("pares",n_par)
        console.log("Soma dos pares", somapar)
        console.log("Impares", n_impar)
        console.log("Soma dos impares",somaimpar)
    }
}
Ex2()
