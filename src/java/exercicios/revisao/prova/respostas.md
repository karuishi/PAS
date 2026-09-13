1. 
    Sobrecarga: Ocorre quando múltiplos métodos em uma mesma classe possuem o mesmo nome mas assinaturas diferentes - variação nos parâmetros. Utilizado em situações que uma subclasse precisa utilizar um método herdado de uma superclasse, porém com informações a mais ou a menos.

    Sobreposição: Ocorre quando a subclasse reescreve um método herdado de uma superclasse. utilizado quando o comportamento desejado são diferentes mas compartilham o mesmo nome, contudo, bloco interno diferente.

    Na classe Carro, os métodos autonomia() e autonomia(int x) são um exemplo de Sobrecarga (mesmo nome, parâmetros diferentes no mesmo escopo). A Sobreposição (Overriding) ocorre nas subclasses (CarroGasolina, CarroAlcool, CarroFlex), implementam o método void Consumo() herdado da classe pai abstrata (Carro), onde apresentam blocos internos distintos.

2.   
    1) V. upcasting válido, aplicando polimorfismo.
    2) F. CarroFlex e CarroGasolina são classes "irmãs". Como não há relação de herança entre elas não é possível ocorrer instância entre elas.
    3) F. a classe "Carro" é abstrata e não deve ser instanciada.
    4) V. Instanciação normal.
    5) V. Retorna o consumo de CarroAlcool.
    6) F. Chamada inválida devido a instanciação inválida.
    7) F. Além do erro de instanciação na Linha 3, a chamada do método na tabela carece do ponto e vírgula ; obrigatório em Java
    8) F. A classe Carro ou  CarroGasolina não possui nenhuma assinatura do método autonomia que receba dois parâmetros inteiros.
    9) V. O objeto referenciado por c foi instanciado como CarroAlcool na Linha 1, portanto, o downcasting explícito para CarroAlcool é válido e permite acessar o método com segurança.

3.
  Instâncias não são possíveis, pois, o único objetivo das classes abstratas é servir de molde, incompleto, para os objetos. Agora, uma variável do tipo de uma classe abstrata é criada com o objetivo de referenciar, em memória, instâncias de qualquer uma de suas subclasses concretas.

4.  
    imagine uma classe ContaBancaria com o atributo private double saldo.

    Redução de acoplamento: Classes externas não podem acessar ou alterar o saldo diretamente. Elas dependem exclusivamente de métodos públicos como depositar(double valor) e sacar(double valor). Se a forma como o saldo é calculado mudar internamente, as outras classes do sistema não quebram.

    Redução de complexidade: A classe que herda e usa ContaBancaria não precisa entender as regras de negócio de validação de saldo negativo; ela apenas chama o método sacar() e lida com o retorno.
5. 
    Classe:
        Serve como uma estrutura estática (molde) para os objetos, definindo os atributos (estados) e métodos (comportamentos) compartilhados.  
    Objetos:
        É uma instância de uma classe alocada em memória (referência),que possui o seu próprio estado (valores específicos de atributos) e comportamentos, identidade única e ciclo de vida finito.

6. 
    Todas essas classes herdarão de uma superclasse chamada FormasGeometricas, onde o método abstrato calculoArea() está sendo declarado. Contudo, cada uma dessas subclasses irá realizar override, por conta dos cálculos de suas respectivas areas serem únicos. O polimorfismo permite que o sistema trate objetos de diferentes tipos de maneira uniforme. Por exemplo, você pode ter uma List<FormasGeometricas> misturando triângulos e hexágonos, e iterar sobre ela chamando calculoArea() para todos, sem precisar verificar o tipo específico de cada objeto usando ifs ou switches (estruturas condicionais).

7. 
    A abstração é o princípio de focar nos aspectos essenciais de uma entidade e ignorar os detalhes irrelevantes para o contexto. A motivação para o surgimento do paradigma OO foi a necessidade de gerenciar a complexidade crescente dos softwares. Ao utilizar a abstração para modelar entidades do mundo real em Classes e Objetos, os programadores conseguiram aproximar a semântica do código à lógica do negócio, facilitando a visualização, a manutenção e a reutilização estrutural.

8. 
    Programação Orientada a Objetos: Baseia-se em objetos que agrupam estado (dados/atributos) e comportamento (métodos). Geralmente faz uso intenso de estados mutáveis (variáveis que mudam de valor ao longo do tempo) e programação imperativa (dizendo "como" o computador deve fazer os passos).

    Programação Funcional: Baseia-se na avaliação de funções puras no sentido matemático. Ela enfatiza a imutabilidade dos dados (uma vez criada, uma estrutura não é alterada, cria-se uma nova com as modificações) e evita mudanças de estado ou efeitos colaterais, utilizando uma abordagem declarativa (focada em "o que" deve ser feito).