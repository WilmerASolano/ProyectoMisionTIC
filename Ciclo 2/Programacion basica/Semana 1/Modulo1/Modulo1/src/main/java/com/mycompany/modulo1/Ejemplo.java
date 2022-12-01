package com.mycompany.modulo1;

import java.util.Scanner;

public class Ejemplo {
    public static void main (String args[]){
        Scanner entradaDatos = new Scanner(System.in);
        
        /*
        System.out.println("Hello JAVA World");
        System.out.println("Digite su nombre: ");
        
        String nombre = entradaDatos.next();
        System.out.println("Su nombre es " + nombre + ", Bienvenido al mundo JAVA");
        
        int edad = 0;
        System.out.println("Digitar la edad: ");
        edad = entradaDatos.nextInt();
        if ( edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es MENOR de edad");
        }
        
        System.out.println("Digite su Sexo [f|m]: ");
        String sexo = entradaDatos.next();
        if (sexo.toLowerCase().equals("m") ){
            System.out.println("Sexo Masculino");
        }else if (sexo.toLowerCase().equals("f")){
            System.out.println("Sexo Femenino");
        }else{
            System.out.println("Sexo Indeterminado");
        }
        
        System.out.println("Digite su tipo de documento: ");
        String tipoDoc = entradaDatos.next();
        switch(tipoDoc){
            case "c":    // if (tipoDoc == "c")
                System.out.println("Su documento es tipo Cedula ");
                break;
            case "t":
                System.out.println("Su documento es tipo Tarjeta de identidad ");
                break;
            default:
                System.out.println("Su documento es indeterminado");
                break;
        }
        */
        /*
        // Utiliznado la clase cuenta;
        System.out.println("Digite el numero de cuenta: ");
        String num = entradaDatos.next();
        
        System.out.println("Digite el Saldo de cuenta: ");
        double valor = entradaDatos.nextDouble();
        
        System.out.println("Digite el Tipo de cuenta: ");
        String tipo = entradaDatos.next();
        */
        
        // Instanciar una cuenta
        // mDeclarar la variable de Tipo Cuenta
        /*
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumero(num);
        cuenta1.setSaldo(valor);
        cuenta1.setTipo(tipo);
        
        Cuenta cuenta2 = new Cuenta(num, valor, tipo);
        
        //Acceder información de los objetos
        System.out.println("Los datod de la cuenta #2 son: ");
        System.out.println("Su numeero de cuenta es: " + cuenta2.getNumero());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta2.getTipo());
        
        // Consignar
        cuenta2.consignar(1250);
        
        System.out.println("SU nuevo saldo es : " + cuenta2.getSaldo());
        */
        
        //Ciclos
        //Para
        for(int cont=0; cont <= 10; cont++){
            System.out.println("Contado " + cont);
        }
                
        //Mientras
        int cont = 0;
        while (cont <= 10) {
            System.out.println("Otro contador " + cont);
            cont++;
        }
        
        // Operadores Lógicos
        // AND  =>>> &&
        // OR   =>>> ||   (Pipe)
        // Negación  ==>     ! (admiración)
        int edad = 50;
        System.out.println("Digite su sexo;");
        char sexo = 'm';   /// caracter
        if (edad == 50 && sexo == 'm'){
            System.out.println("Usted es un Adulto Mayor");
        }
        
        if (sexo == 'm' || sexo == 'f'){
            System.out.println("Su sexo es masculino o femenino");
        }else{
            System.out.println("Digito un sexo que no existe");
        }
        
        //Negación  =>> !
        boolean tieneHambre=true;
        
        System.out.println("Tiene hambre ?" + tieneHambre);
        
        System.out.println("despues de comer, tien hambre? " + !tieneHambre);
        
    }   
}

