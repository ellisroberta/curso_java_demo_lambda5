# Exemplo de Cálculo de Soma de Preços Filtrados

## Introdução
Este projeto é um exemplo simples em Java que demonstra como calcular a soma dos preços de produtos com base em um critério
específico. Neste caso, a soma é calculada apenas para os produtos cujo nome começa com a letra "T". O projeto ilustra o
conceito de programação funcional, permitindo que funções sejam passadas como argumentos para outras funções.

## Estrutura do Projeto
O projeto é dividido em três classes principais:

- **Program**: Classe principal onde a execução do programa acontece.
- **Product**: Representa um produto com um nome e um preço.
- **ProductService**: Contém a lógica de negócios, incluindo o método para calcular a soma filtrada.

## Dependências
    Este projeto é construído em Java e não possui dependências externas. Certifique-se de ter o JDK instalado em seu sistema.

## Como Funciona

1. Classe `Product`
   A classe `Product` é responsável por armazenar as informações de cada produto. Ela possui:

   - Atributos:
     - `name`: O nome do produto.
     - `price`: O preço do produto.
   - Métodos:
     - Construtor para inicializar o produto.
     - Métodos getters e setters para acessar e modificar os atributos.
     - Método `toString` para representar o produto como uma string.

2. Classe `ProductService`
   A classe `ProductService` contém o método `filteredSum`, que realiza a soma dos preços dos produtos com base em um critério fornecido.
   
    - Parâmetros:
      - `List<Product> list:` A lista de produtos.
      - `Predicate<Product> criteria`: Uma função que define o critério de filtragem.

3. Classe `Program`
   A classe `Program` é onde a execução do programa acontece. Abaixo está um resumo do que acontece no método `main`:
    - Inicializa uma lista de produtos.
    - Adiciona produtos à lista.
    - Chama o método `filteredSum` passando uma expressão lambda que filtra os produtos cujo nome começa com "T".
    - Imprime a soma total dos preços filtrados.

## Execução

Para executar o projeto:
1. Certifique-se de ter o JDK instalado.
2. Compile as classes Java.
3. Execute a classe `Program`.

## Conclusão
Este projeto exemplifica como utilizar programação funcional em Java para realizar operações sobre coleções de forma
eficiente e legível. A passagem de funções como argumentos permite criar códigos mais flexíveis e reutilizáveis.