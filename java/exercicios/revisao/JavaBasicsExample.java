package revisao;

public  class  JavaBasicsExample { 

    public  static  void  main (String[] args) { 
        // Exemplo de Operadores 
        int  a  =  10 ; 
        int  b  =  5 ;
        float result = 0; 
        
        result = a / b; // Operador de divisão
         System.out.println( "Divisão: " + result); 
        
        result = a % b; // Operador de módulo
         System.out.println( "Módulo: " + result); 

        // Exemplo de Tipos de Dados Não Primitivos 
        String  str  =  "Olá, Mundo!" ; // String
         System.out.println( "String: " + str); 
        
        boolean  flag  =  true ; // boolean
         System.out.println( "Boolean: " + flag); 

        // Exemplo de Instruções de Controle 
        int  age  =  20 ; 
        if (age >= 18 ) { 
            System.out.println( "Você é um adulto." ); 
        } else { 
            System.out.println( "Você é menor de idade." ); 
        } 

        // Exemplo de Laços 
        int  count  =  5 ; 
        System.out.println( "Contando de 1 a " + count + ":" ); 
        for ( int  i  =  1 ; i <= count; i++) { 
            System.out.println(i); 
        } 

        // Exemplo de loop while 
        int  i  =  1 ; 
        System.out.println( "Contando de 1 a " + count + " usando o loop while:" ); 
        while (i <= count) { 
            System.out.println(i); 
            i++; 
        } 

        // Exemplo de loop do-while
         i = 1 ; 
        System.out.println( "Contando de 1 a " + count + " usando o loop do-while:" ); 
        do { 
            System.out.println(i); 
            i++; 
        } while (i <= count); 
    } 
}