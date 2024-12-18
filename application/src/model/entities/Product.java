package model.entities;

// Classe que representa um produto com nome e preço
public class Product {

    private String name; // Nome do produto
    private Double price; // Preço do produto

    // Construtor da classe Product
    public Product(String name, Double price) {
        this.name = name; // Inicializa o nome do produto
        this.price = price; // Inicializa o preço do produto
    }

    // Método para obter o nome do produto
    public String getName() {
        return name;
    }

    // Método para definir o nome do produto
    public void setName(String name) {
        this.name = name;
    }

    // Método para obter o preço do produto
    public Double getPrice() {
        return price;
    }

    // Método para definir o preço do produto
    public void setPrice(Double price) {
        this.price = price;
    }

    // Método para representar o produto como uma string
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price); // Retorna o nome e preço formatado
    }
}