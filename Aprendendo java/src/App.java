public class App {
    /*public static void main(String[] args) throws Exception {
       Caneta c1= new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.status();
        c1.tampar();
        c1.rabiscar();

        Caneta c2=new Caneta();
        c2.cor="vermelha";
        c2.ponta=1.0f;
        c2.tampada=true;

        c2.destampar();
        c2.rabiscar();
    }*/
    public static  void main(String[] args){

        Calculadora c1= new Calculadora();
        c1.variavel1=10;
        c1.variavel2=5;

        c1.soma();
        c1.subtracao();
        c1.multiplicacao();
        c1.divisao();
    }
}

