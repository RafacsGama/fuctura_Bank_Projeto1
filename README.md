<h1>Descrevendo a atividade.</h1>
Este projeto consiste em um sistema bancário com cinco classes e uma
classe de teste, onde implementei a programação orientada a objetos visando 
concluir o primeiro módulo do curso de java da Escola Fuctura de Tecnologia.
<h2>Requisitos do projeto</h2>
Projeto #1 → FucturaBank
Desenvolva um sistema bancário com as seguintes especificações:
Uma classe abstrata Contas. 
Atributos:
Número da Conta, Nome do Titular, Saldo Disponível
Métodos:
Exibir Dados, Depositar, Exibir Saldo das Contas(Conta-Corrente e Conta Poupança)
Getters e Setters
Uma classe Conta-Corrente que herda da classe Contas.
A classe Conta-Corrente, além dos atributos e métodos herdados, deverá conter um
método para Sacar e para Aplicar valores na Conta-Poupança.
Uma classe Conta-Poupança que herda da classe Contas.
A classe Conta-Poupança, além dos atributos e métodos herdados, deverá conter um
método para Resgatar valores da Conta-Poupança para a Conta-Corrente.
Cada operação realizada (saque, depósito, aplicação e resgate) deverá ter uma confirmação.
Por exemplo, ao realizar um saque, informar que o saque foi feito com sucesso.
O projeto precisará de uma classe Principal, que contenha o método main. Nesta classe
será feita a criação de objetos, chamadas de métodos e atribuição de valores aos atributos. 

OBSERVAÇÕES: 
1. O atributo saldo não deverá ser alterado diretamente. Será preciso criar um método para sua
manipulação.
2. A primeira ação que deverá ser feita é o cadastro de uma conta. Implemente uma lógica para
a criação da da Conta do cliente. Solicite ao cliente(usuário) o nome do titular e crie um número
aleatório para a conta.
3. No momento do cadastro, deverá ser perguntado ao cliente(usuário) se deseja fazer um
depósito inicial. As contas poderão ser criadas com saldo R$ 0.00 ou com o valor de depósito
inicial. 
4. A Conta-Poupança não aceitará saques e depósitos diretamente. Para que seja possível
depositar ou sacar da Conta-Poupança, implemente uma lógica utilizando os métodos para
resgate e aplicação, respectivamente.
