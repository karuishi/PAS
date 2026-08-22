package revisao;

// Abstração: Classe abstrata 
abstract  class  Shape { 
    abstract  void  draw () ; 
} 

// Encapsulamento: Classe com membros de dados privados e métodos públicos 
class  Circle  extends  Shape { 
    private  double radius; 

    public  Circle ( double radius) { 
        this.radius = radius; 
    } 

    // Dados encapsulados acessados ​​por meio de métodos públicos 
    public  double  getRadius () { 
        return radius; 
    } 

    public  void  setRadius ( double radius) { 
        this.radius = radius; 
    } 

    // Abstração: Sobrescrever método abstrato para fornecer implementação 
    @Override 
    void  draw () { 
        System.out.println( "Desenhando um Círculo" ); 
    } 
} 

// Herança: Classe que herda de outra classe 
class  Rectangle  extends  Shape { 
    // Abstração: Sobrescrever método abstrato para fornecer implementação 
    @Override 
    void  draw () { 
        System.out.println( "Desenhando um Retângulo" ); 
    } 
} 

// Polimorfismo: Classe com sobrecarga de métodos 
class  Drawing { 
    // Polimorfismo: Sobrecarga de métodos 
    public  void  drawShape (Shape shape) { 
        shape.draw(); 
    } 

    // Sobrecarga de métodos 
    public  void  drawShape (Circle circle) { 
        System.out.println( "Desenhando um círculo com raio: " + circle.getRadius()); 
    } 
} 

public  class  OOPExample { 
    public  static  void  main (String[] args) { 
        // Encapsulamento: Criando um objeto da classe Circle e definindo o raio 
        Circle  circle  =  new  Circle ( 5.0 ); 

        // Abstração: Desenhando um círculo
         circle.draw(); 

        // Encapsulamento: Acessando o raio usando o método público
         System.out.println( "Raio do círculo: " + circle.getRadius());

        // Encapsulamento: Definindo o novo raio
         circle.setRadius( 7.0 ); 

        // Abstração: Desenhando o círculo após definir o novo raio
         circle.draw(); 

        // Herança: Criando um objeto da classe Rectangle 
        Rectangle  rectangle  =  new  Rectangle (); 

        // Abstração: Desenhando o retângulo
         rectangle.draw(); 

        // Polimorfismo: Criando um objeto da classe Drawing 
        Drawing  drawing  =  new  Drawing (); 

        // Polimorfismo: Desenhando a forma
         drawing.drawShape(circle); 
    } 
}