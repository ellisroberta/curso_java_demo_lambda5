package appication;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        // Define o formato da localização para uso de ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria uma lista para armazenar produtos
        List<Product> list = new ArrayList<>();

        // Adiciona produtos à lista
        list.add(new Product("Tv", 900.00)); // Produto: TV com preço 900.00
        list.add(new Product("Mouse", 50.00)); // Produto: Mouse com preço 50.00
        list.add(new Product("Tablet", 350.50)); // Produto: Tablet com preço 350.50
        list.add(new Product("HD Case", 80.90)); // Produto: HD Case com preço 80.90

        // Cria uma instância do serviço de produtos
        ProductService ps = new ProductService();

        // Chama o método filteredSum passando a lista e uma expressão lambda como critério
        // A expressão lambda verifica se o nome do produto começa com a letra 'T'
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        // Imprime o resultado da soma formatado com duas casas decimais
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}