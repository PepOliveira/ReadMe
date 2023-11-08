# Recreio Da Esperança
## Versão: 1.0 
## Status do Projeto: ✔️ Concluído ⚠️ Espera ❌ Cancelado
## Tópicos
🔹 Descrição do projeto 

🔹 Funcionalidades

🔹 Distribuição

🔹 Pré-requisitos

🔹 Como rodar a aplicação

🔹 Testes realizados

🔹 Banco de Dados

🔹 Linguagens, dependências e libs utilizadas

🔹 Novas Recursos

🔹 Resolvendo problemas

🔹 Recursos inseridos 

🔹 Desenvolvedores/Contribuintes

🔹 Informações Extras


...

Insira os tópicos do README em links para facilitar a navegação do leitor

## Descrição do projeto

 Nosso projeto tem como principal foco ajudar instituições carentes, buscando aumentar as doações de brinquedos que não são mais utilizados, para que possam ser entregues às crianças e adolescentes dessas instituições que precisam.

## Funcionalidades ⚙️
✔️ Funcionalidade 1

✔️ Funcionalidade 2

✔️ Funcionalidade 3

✔️ Funcionalidade 4

## Distribuição
O código fonte está disponibilizado na seção Master do Github. E também o Formato .zip do código fonte: [Código Fonte - Recreio da Esperança.zip](https://github.com/PepOliveira/ReadMe/files/13292232/Codigo.Fonte.-.Recreio.da.Esperanca.zip)


## Pré-requisitos ⚠️    
- MySQL , NetBeans ;

## Como rodar a aplicação 
O projeto deve ser utilizado somente para a doação de brinquedos para crianças e jovens carentes,visando conectar o doador e instituição diretamente

## Testes realizados
Criação da tela de login do sistema - Recreio da Esperança;
A aplicação foi testada pelo autor para a validação do banco de dados
![Tela de login](https://github.com/PepOliveira/ReadMe/assets/143531571/95c8be60-b4d8-46e8-a76a-098667ca9de8)



## Banco de Dados 🗂️
Banco de dados do Sistema Recreio da Esperança
CREATE DATABASE Recreio_Da_Esperanca;
USE Recreio_Da_Esperanca;

CREATE TABLE login (
nome varchar(50),
email varchar (50),
senha varchar (50)
);

CREATE TABLE brinquedo (
nome varchar(50),
usuario varchar(50),
telefone varchar (20),
descricao varchar(100)
);

INSERT INTO login (nome, email, senha) 	VALUES ('João Pedro', 'joaopedro@gmail.com', 'joao17');

SELECT nome AS 'Doador',
email AS 'Email do Doador',
senha AS 'Senha'
FROM login;

SELECT nome AS 'Doador', 
usuario AS 'Email do Doador', 
telefone AS 'Telefone do Doador' ,
descricao AS 'Brinquedo Doado'
FROM brinquedo;



## Linguagens, dependencias e libs utilizadas 📚

XML
...
Liste as tecnologias utilizadas no projeto que não forem reconhecidas pelo Github

## Resolvendo Problemas 
Resolver como iremos realizar validações e testes com a instiuição de acolhimento, tais como retornar seus feedback

## Recursos de inseridos 🧰
Desenvolvimento da aba principal do nosso projeto juntamente
Conexão entre banco de dados e o programa

📝 Tarefa 1 -  Inserir caixa de diálogo para descrição do brinquedo ✔️
![Descrição](https://github.com/PepOliveira/ReadMe/assets/143531571/e60d3b2c-ef46-4fcc-bc72-0826b7cc880c)


📝 Tarefa 2 - Visualização da instituição de acolhimento que receberá a doação ✔️
![InstituiçãoTela](https://github.com/PepOliveira/ReadMe/assets/143531571/2242776d-6fba-4a4e-a819-ad9bc77c09b5)


📝 Tarefa 3 - Visualização de doação realizada com sucesso ✔️
![DoçãoSucesso](https://github.com/PepOliveira/ReadMe/assets/143531571/c39df261-155c-4e55-b0c7-bbff556ce0c7)


📝 Tarefa 4 -  Conexão do projeto com o banco de dados ✔️

## Desenvolvedores/Contribuintes:
João Pedro Timo Angelotti Pinto
João Victor Rafael Rodrigues
Pedro Denzi Takemura Junior
Pedro Henrique dos Santos de Oliveira

## Licença
The MIT License (MIT)

## Copyright ©️ 2023 - Recreio da Esperança
