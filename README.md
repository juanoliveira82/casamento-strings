<h1 align="center">Casamento de Strings</h1>
<h4 align="center">Implementação de Casamento de Strings com Autômatos Finitos</h4>

<p align="center">
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  
  <a href="#-funcionamento">Funcionamento</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
  <a href="#-utilização">Utilização</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-autor">Autor</a>
</p>

<p align="center">
  <br/>
  <img src="https://i.imgur.com/i9jFLYY.png" width="350"/>
  <img src="https://i.imgur.com/UqFN0nj.png" width="350"/>
  <img src="https://i.imgur.com/ux2Jjl0.png" width="350"/>
  <br/>
</p>

## 💻 Projeto

As funções implementadas foram: 

- Subpalavra (contém);
- Prefixo;
- Sufixo.

Trabalho da disciplina de Teoria da Computação [UENP]

## 🚀 Tecnologias

Implementação realizada com a linguagem de programação [Java](https://www.oracle.com/java/) na [IDE NetBeans](https://netbeans.org/).

## 📖 Funcionamento

O programa recebe uma palavra para ser analisada e um outra palavra para verificação se esta seria um prefixo, sufixo, ou se está contida na palavra de análise.

Ambas as strings recebidas são tratadas como um vetor de caracteres, assim, possibilitando a comparação de suas letras individualmente, como um autômato faria.

A cada comparação de caracter o programa verifica se deve continuar ou não, caso não deva continuar, então ele retorna entrada inválida, caso ele passe por todas as comparações com sucesso, a entrada é considerada correta.

## 📋 Utilização

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina o Java (Release ou SDK):

### Rodando o programa por linha de comando.

Primeiro faça o download do arquivo "CasamentoDeStrings.jar" do [Release](https://github.com/juanoliveira82/casamento-strings/releases) do projeto.

Para poder executar o projeto na linha de comando, acesse um terminal e vá para a pasta onde foi baixado o arquivo Java, e digite o seguinte:
```
java -jar "CasamentoDeStrings.jar"
```

## 👨‍💻 Autor

[Juan Carlos Cardoso de Oliveira](https://github.com/juanoliveira82) - Estudante do curso de Ciência da Computação na Universidade Estadual do Norte do Paraná (UENP).
