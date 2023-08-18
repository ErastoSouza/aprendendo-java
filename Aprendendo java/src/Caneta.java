public class Caneta {
String modelo;
String cor;
float ponta;
int carga;
boolean tampada;    

void status(){
    System.out.println("modelo: "+ this.modelo);
    System.out.println("uma caneta: "+ this.cor);
    System.out.println("esta tampada? "+ this.tampada);
    System.out.println("carga: "+this.carga);
    System.out.println("ponta: "+this.ponta);

}

void rabiscar(){
    if (this.tampada==true){
        System.out.println("ERRO: a caneta esta tampada");
    }
    else{
        System.out.println("estou rabiscando");
    }
}

void tampar(){
    this.tampada=true;


}

void destampar(){
    this.tampada = false;



}
}
