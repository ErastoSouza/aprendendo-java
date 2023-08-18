public class Calculadora {
    float variavel1;
    float variavel2;


    void soma(){
        float soma=this.variavel1+this.variavel2;
        System.out.println("Sua soma eh: "+soma);
    }

    void subtracao(){
        float sub=this.variavel1-this.variavel2;
        System.out.println("sua subtracao eh: "+sub);
    }

    void multiplicacao(){
        float  multi= this.variavel1*this.variavel2;
        System.out.println("sua multiplicacao eh: "+multi);
    }

    void divisao(){
        float divi= this.variavel1/this.variavel2;
        System.out.println("sua divisao eh: "+divi);
    }
}
