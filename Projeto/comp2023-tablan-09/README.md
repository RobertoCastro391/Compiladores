# Tema **TabLan**, grupo **tablan-09**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | email | Participação |  Contribuições |
|:---:|:---|:---|:---:|:---:|
| 107658 | MARIA RAFAELA ALVES ABRUNHOSA | maria.abrunhosa@ua.pt | 18% | primary-grammar; secondary-grammar; secondary-interpretation/secondary-code-generation; testing;|
| 107826 | MARTA OLIVEIRA INÁCIO | marta.oliveira.inacio@ua.pt | 18% | primary-grammar; code-generation; testing;|
| 108193 | MATILDE MOITAL PORTUGAL SAMPAIO TEIXEIRA | matilde.teixeira@ua.pt | 10% | primary-grammar; primary-semantic-analysis; testing;|
| 107133 | ROBERTO ROLÃO DE CASTRO | robertorcastro@ua.pt | 18% | primary-grammar; code-generation; testing;|
| 108796 | SARA FIGUEIREDO ALMEIDA | sarafalmeida@ua.pt | 18% | primary-grammar;code-generation; testing;|
| 108307 | TIAGO CARIDADE GOMES | tiagocgomes@ua.pt | 18% | primary-grammar; secondary-grammar; secondary-interpretation/secondary-code-generation; testing; |

## Estrutura do repositório

- **src** - deve conter todo o código fonte do projeto.

- **doc** -- deve conter toda a documentação adicional a este README.

- **examples** -- deve conter os exemplos ilustrativos das linguagens criadas.

    - Estes exemplos devem conter comentários (no formato aceite pelas linguagens),
      que os tornem auto-explicativos.

<br />

# **Relatório**

<br />

## **Introdução**
---
O objetivo geral deste projeto é, a partir do desenvolvimento de uma linguagem de programação Tablan compilada, permitir a criação de programas equivalentes ao programa a compilar numa linguagem de programação genérica que é, no nosso caso, Java. Neste contexto, a linguagem Tablan representa uma linguagem de manipulação avançada de tabelas.

Desta forma, é possível declarar tabelas, aceitar operações, output de texto, adicionar linhas e coluna, introduzir cabeçalhos, iterar pelas linhas da tabela e converter dados já existentes inteiro, real e text.

Para desenvolver esta linguagem, utilizámos ANTLR4 para contrução da árvore sintática e geração dos visitors necessários, usámos Java como linguagem de programação para criar um compilador para a nossa linguagem Tablan e um String Template para tornar isto possível funcionando este como um tradutor da nossa linguagem para Java, auxiliando assim na geração de código em Java.

<br />
<br />

## **1. Linguagem Principal**
---
### **Definição em ANTLR4**
A raiz deste projeto é o Tablan.g4, a gramática principal. Esta define-se como uma sequência de zero ou mais instruções, sendo que cada instruction pode gerar cinco diferentes símbolos sintáticos. 

    program: (instruction? ';')*;
        instruction: define_table           
                  | declare_variable       
                  | loop                   
                  | print                  
                  | assignment             
                  ;

### **Tipos de Dados**
Quanto ao tipo de dados implementados, os exemplos faziam uso de tipos como:

  - **integer**, que corresponde a números inteiros como 3;
  - **text**, que corresponde a strings como "ola" e
  - **real**, que corresponde a double, ou seja, a um número real como 3.0.

### **Controlo de fluxo**
  
  <br />

  - **loop** -> do tipo **for in** e caracteriza-se por iterar todos os elementos de um uma tabela

  <br />
  
  ### Gramática:
    loop: 'for' ID 'in' ID 'do' (instruction? ':')* 'end' ;

  ### Aplicado no exemplo2.tl:
    for elem in t do -- iterate table lines
      elem.name := elem.name + ":";
      println "|",elem.name, "|", elem.number, "|";
    end;
  
  <br />

  ### **Utilização de comentários**
  Todos os **comentários** desenvolvidos definem-se como:
    
    COMMENT: '--' .*? '\n' -> skip;
  
  <br />
  
  ### **Declarações**
  Existem diferentes maneiras de declarar uma variável, podendo esta declaração ser feita de uma das seguintes maneiras:

    assignment: ID ':=' expr 
              | column ':=' expr
              | column '->' element_name
              | table_type 
              | expr 
              ;
  
  <br />
  
  ### **Expressões**
  Para além das declarações e do que foi apresentado anteriormente temos as expressões que podem tomar a forma de:

  - **criar** uma nova tabela recorrendo a uma coluna;
  - uma expressão dentro de parêntesis;
  - uma coluna;
  - uma expressão que representa o uso de um cabeçalho de uma tabela como cabeçalho dela mesma ou de outra:

    ```expr 'using' selection ('.' selection )*   #ExprUsing```

  - definir o tamanho de uma coluna;
  - um tipo de dados (integer, text, real);
  - um leitor de um literal;
  - operações entre expressões (*,/,+,-);
  - um literal que pode ser NUMBER ou STRING;
  - um vetor que consiste na representação do valor de uma linha numa determinada coluna:

    ```["One", c], onde "One" será o valor da linha a ser introduzido na coluna c```

  - um ID, identificador, que pode defenir uma tabela.

  <br />

  Para além destas, existem regras que definem prints, a declaração inicial de uma tabela, e como são considerados os NUMBER, STRING e WS, entre outros.

  <br />

  ### **Análise semântica**
  // ....

  <br />
  <br />
  <br />

  ## **2. Classe Table -> TableGeral**
  ---

  A classe TableGeral existe para facilitar a criação de um novo objeto do tipo Table para que seja mais fácil de o manipular, ou seja, implementado os métodos necessários para que seja possível manipular as tabelas adicionando colunas, linhas, etc.

  ### **Tipos de dados criados**
  Criaram-se, inicialmente, três HashMaps, um ArrayList e uma String que vai guardar o nome da tabela caso exista. Inicializa-se, também uma variável int denominada countnull que conta a quantidade de vezes em que aparece o vetor [] para, posteriormente, adicionar o número correspondente a este count de linhas vazias no fim da tabela desejada.
  Quanto aos HashMaps e ArrayList:

    1. HashMap<String,String> header = new HashMap<>();             //[name(id) : "Name"(nome da coluna)]
    2. HashMap<String, String> column_types = new HashMap<>();      //[name(id) : type]
    3. HashMap<String, ArrayList<Object>> table = new HashMap<>();  //[name(id) : [lines]]
    4. ArrayList<String> headername = new ArrayList<>();

  O HashMap 1. header guarda associado ao id de uma coluna, por exemplo "number", o nome desejado para a coluna, que pode ser "Número:".

  No HashMap 2. column_types é guardado o tipo da coluna associado ao id da mesma.

  O HashMap 3. table representa uma tabela onde se tem um ArrayList de linhas para cada coluna;

  Por fim, o ArrayList 4. headername guarda todos os nomes das colunas.

  São definidos três construtores para esta classe, onde:

  - um construtor não apresenta argumentos de entrada;

  - o segundo construtor tem um ```LikedHashMap<String, ArrayList<String>>``` como argumento de entrada que representa as primeiras ações dos exemplos:

    ```
    type table ATable {
      name: text -> "Name:"; -- the final [optional] part indicates the textual view of the column (that is, what must be printed as the header of the table)
      number: integer;
    };
    ```
  - o terceiro construtor admite como argumento de entrada o nome da tabela.

  Foram, também, implementados, alguns getters e setters de forma a tornar mais fácil o acesso a certos de dados das tabelas.

  <br />
  
  ### **Operações com tabelas**
  Explorados os exemplos para se conseguir criar, não só a primeira e segunda gramática como a classe Table, foram estudadas algumas operações com tabelas que deveriam ser suportadas.
  Para isto, foram implementados os seguintes métodos dentro da classe TableGeral:

  - método **removeColumn** que permite remover uma coluna da tabela;
  - método **addColumn** que permite adicionar uma nova coluna à tabela;
  - método **addColumnName** que adiciona um nome desejado para identificar uma coluna da tabela;
  - método **printLineByLine** que printa a tabela com uma determinada formatação;
  - método **add** adiciona a informação contida num vetor, para isso invoca a **addLine**;
  - método **addLine** que adiciona uma linha à tabela;
  -método **writeToFile** é responsável pela apresentenção da tabela quando é necessário imprimi-la, é necessário ter em conta que este método tanto imprime a tabela no terminal como num ficheiro **csv** previamente passado.

<br />
<br />
<br />

## 3. Linguagem Secundária

A linguagem secundária serve de mediador entre o import da linguagem primária e um ficheiro que descreve uma tabela de uma base de dados. É executada na chamada ao comando ImportFile e contém de igual forma a definição da estrutura base de qualquer table (**TabelGeral**). 

Para começar, a gramática foi definida de forma a verificar se as linhas possuiam qualquer tipo de elemento de divisão ( ```,``` ou ```;;``` ), dividindo desta forma o conteudo de cada coluna, podendo ser qualquer conjunto alfanumérico conveniente e o tipo de dados tem que ser obrigatoriamente um dos seguintes: ***int***, ***text*** ou ***string***. Entre cada um destes dados deve sempre existir um dos separadores de forma a estruturar as colunas diferentes. e vim preencher uma coisinha shshshshshshshshhs

#### Análise semântica e interpretação
O ficheiro **ReadMain** tem como principal objetivo a leitura do ficheiro que lhe é passado de modo a invocar a **ReadFile**. Este visitor é o responsável pela contrução da table. O *visitLine* divide as colunas pela expressão identicada, e após essa divisão é realizada a contrução da tabela em si com toda a informção disponibilizada no ficheiro, colocandos nas respetivas colunas, neste caso num arraylist que irá conter todas as linhas, formando uma estrutura do tipo ***key->column.identifier value-> Lines (ArrayList)>***, é de notar ainda que existem outras estruturas que estruturam a tabela:

    HashMap<String,String> header = new HashMap<>();             //[name(id) : "Name"(nome da coluna)]
    HashMap<String, String> column_types = new HashMap<>();      //[name(id) : type]
    HashMap<String, ArrayList<Object>> table = new HashMap<>();  //[name(id) : [lines]]
    ArrayList<String> headername = new ArrayList<>();            //[ids da coluna]
    String name_table;                                           // Nome da tabela

Todas as tabelas terão estas estruturas bases que vão ser manipulas pelas funções que que já foram referidas em cima.
Acrescento ainda que os ficehiros podem ter ou não a informação do cabeçalho, caso não tenham esta estrutura está desenhada para aceitar uma tabela já criada onde serão aprenas inseridos os dados lidos (```if (table.getHeadername().isEmpty())```).

***Exemplo de um ficheiro aceite pela linguagem Secundária com cabeçalho (list1.csv):***
```
number,name
1,One
2,Two
3,Three
4,Four
5,Five
6,Six
7,Seven
```

***Exemplo de um ficheiro aceite pela linguagem Secundária sem cabeçalho (list2.csv):***
```
1,One
2,Two
3,Three
4,Four
5,Five
6,Six
7,Seven
```
<br />
<br />
<br />

## 4. Linguagem: Destino
#### Geração de código
Para a compilação e geração de código foi utilizada a ferramenta *String Template*, apresentada nas aulas teóricas, cujo principal objetivo é gerar o código-fonte da linguagem. De notar que este código só é gerado após compilação.
Quando as verificações da análise semântica são terminadas, a linguagem procede à compilação através de um *visitor* (***Compiler.java***). É neste ficheiro onde são introduzidas as instruções indicadas pelo utilizador no ficheiro *template.stg*, é introduzido também um *STGroupFile* que faz a renderização do *String Template* com o código *java* final pronto para ser executado, de acordo com as regras implementadas pelo grupo.

<br />
<br />
<br />

## 5. Compiler e String template
#### Compiler.java
Tal como referido no ponto anterior a compilação da linguagem foi executada pelo *visitor* (***Compiler.java***). O seu funcionamento baseia-se no uso de uma árvore sintática, na qual os seus nós são percorridos pelo *visitor* de modo a fazer a proceder à renderização da linguagem. Em cada *nó* visitado o *visitor* executa diversas instruções. Da esquerda para a direita o *visitor* percorre a árvore até aos seus nós terminais, quando este são atingidos é devolvido um elemento do tipo *String Template* que foi chamado passando-lhe elementos que vão permitir a renderização da linguagem na linguagem destino desejada.

#### String Template
Para uma conversão da linguagem base Antlr4 para uma linguagem secundária, Java, recorremos a String Templates. Nestes foram definidas as operações principais estabelecidas na gramática. Assim para processar as múltiplas instruções foi utilizado um 
ArrayList, onde seriam guardadas as instruções para serem analisadas posteriormente por métodos para analisar instruções separadas. Além disto, para conseguirmos definir o tipo da tabela foi efetuado um mecanismo de herança (extends) para com que  tabela principal. Para outros métodos, como definição do nome da tabela e adicionar linhas, por exemplo, foram utilizados métodos da classa Table.java. Noutros casos ocorria simplesmente a declaração usando a sintaxe apropriada (<>), para chamar estes atributos. Em casos com mais do que uam hipoteses para a forma como seria constituído recorremos a condições if-else


## Compilação e execução

Quanto à compilação e execução, estes são possíveis através dos ficheiros build, compile e run situados na pasta examples, tal como solicitado. Como resultado, será impresso no terminal o resultado esperado. No entanto, este resultado apenas totalmente alcançado para o exemplo 1.

<br />
<br />
<br />

## Conclusão

Desta forma, concluímos que a maioria dos objetivos propostos no Nível Mínimo foram atingidos, faltando implementar a verificação semântica do sistema de tipos e concluir a compilação dos exemplos 2 e 3.

<br />
<br />
<br />

## Contribuições

- Descritas na tabela inicial.