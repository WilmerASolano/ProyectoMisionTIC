package calculadora;

public class Operaciones {

    public Operaciones() {
    }
    
    public long sumar(long n1, long n2){
        return n1+n2;
    }
    
    public long sumar(long[] listaNumeros){
        long resultado = 0;
        for(long num: listaNumeros){
            resultado += num;
        }
        return resultado;
    }
    
    public long restar(long n1, long n2){
        return n1 - n2;
    }
    
    public long multiplicar(long n1, long n2){
        return n1*n2;
    }
    
    public long multiplicar(long[] listaNumeros){
        long resultado = 1;
        for(long num: listaNumeros){
            resultado *= num;
        }
        return resultado;
    }
    
    public double dividir(long n1, long n2){
        try {
            return n1/n2;
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}
