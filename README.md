<h1> Agendinha ^~^ </h1>

<p> Projeto bem simples utilizando spring para ilustrar alguns conceitos </p>

#### Este readme ainda está em construção xD

=================

<p align="center">
 <a href="#sobre">Sobre</a> •
 <a href="#libs">Dependências</a> •
 <a href="#app">Application Properties</a> • 
 <a href="#h2config">Configurar o H2 console</a> • 
 <a href="#tecnologias">Tecnologias</a> •
 <a href="#features">Features</a> • 
</p>

<a id="sobre"> </a>
## Sobre

<p> Aplicação bem básica utilizando o framework spring, resolvi construí-la para poder testar alguns tecnlogias de front-end para consumir esta api. </p>

<a id="libs"> </a>
## Bibliotecas

<p> 
  Abaixo listarei as depêndencias mas, lembre-se que todas elas estão no arquivo pom.xml
  <ol>
    <li> Spring boot starter web </li>
    <li> Spring data jpa </li>
    <li> Spring devtools </li>
    <li> Lombok </li>
    <li> Jackson core </li>
    <li> H2 database </li>
  </ol>
  Acredito que a grande maioria saiba mas, vou listar a finalidade das 3 últimas dependências listadas.
  <ul>
    <li>
      <b> Lombok </b> --> Utilizei o lombok pois, particularmente não gosto de ficar reescrecendo código e está lib é uma "mão na roda" quando o assunto
      é código boilerplate. Com ela consigo gerar todos os getters e setters das minhas classes apenas utilizando as famosas annotations, 
      lembrando que o lombok não serve apenas para isso mas, por se tratar de uma aplicação minúscula seu uso foi basicamente para isso.
    </li>
    <li> 
      <b> Jackson core </b> --> Essa biblioteca faz uns milagres bem shows de bola como por exemplo tranformar "magicamente" um retorno de um objeto
      em end points do controlador para o formato json ou xml (depende de como a api é construída e de como o cliente solicita o formato dos dados). 
      Acredito que essa lib não seja apenas isso, mas como não sou expert nela utilizo-a apenas para esta finalidade.
    </li>
    <li>
      <b> H2 database </b> --> Resolvi testar esse banco e acabei gostando bastante por ele ser bem "simples" (não recomendo para projetos grandes, apenas para estudos 
      ou algo do gênero). Com isso acabei ganhando uns minutos no desenvolvimento da api. No inicio utilizei ele no modo memória (o que acabou sendo bem triste, pois
      como utilizei o devtools sempre que eu salvava algum arquivo do projeto o banco era zerado TT). Após esse perrengue resolvi utilizar o modo arquivo desse banco
      e com isso não tive mais o problema do banco ficar resetando sempre.
    </li>
  </ul>
</p>

<a id="app"> </a>
## Application properties

<p>
  Como essa foi a primeira vez que utilizei o H2, e tive algumas dificuldades, resolvi colocar aqui como configurei meu arquivo de propriedades.
  
   ```
    spring.h2.console.enabled=true
    spring.h2.console.path=/h2-console
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:h2:file:C:/h2/agenda;DB_CLOSE_ON_EXIT=FALSE	
  ```
  
  A primeira linha diz respeito ao acesso do console do h2 se está habilitado(true) ou não(false);
  A segunda linha especifica o end point que o console do h2 poderá ser acessado;
  A terceira linha significa que eu sempre quero continuar com os dados do banco(update) ou se eu quero inicar o banco zerado(create);
  A quarta e última linha é a url do banco neste caso eu optei por utilizar o h2 no modo file storage então a url ficar daquele jeitão.
  <ul>
    <li> <b> jdbc </b> -> Java Database Connector </li>
    <li> <b> h2 </b> -> Banco que estou utilizando </li>
    <li> <b> file </b> -> Modo arquivo, ou seja, quando reinicio a aplicação não perco os dados anteriormente salvos </li>
    <li> <b> C:/h2/agenda </b> -> Caminho onde estou salvando os arquivos desta base lembrando que, o último nome após a ultima "/" será o nome do seu banco </li>
    <li> <b> DB_CLOSE_ON_EXIT=FALSE </b> -> Não fechar o banco ao encerrar a execução da aplicação </li>
  </ul>
</p>

<a id="h2config"> </a>
## Configurar o H2 console

  <p> 
    1 - É preciso executar a aplicação spring para pode acessar o console do h2.
        Após, se seguiu a mesma configuração da <a href="#app"> application properties 		</a>, 
        digite localhost:8080/h2-console no seu navegador
        como mostra a próxima imagem.
  </p>

    ![Alt text](https://drive.google.com/file/d/1EQXHkTEFyy0WIGVvX-iGrp5ERYAKCUR3/view?usp=sharing)


<a id="features"> </a>
## Features

<p>

  - [X] - Listar contatos
  - [X] - Buscar contatos por id
  - [X] - Adicionar contatos
  - [X] - Editar contatos
  - [X] - Excluir contatos
  
</p>

 
  
 
