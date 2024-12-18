package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

// Classe que contém a lógica de negócios relacionada aos produtos
public class ProductService {

    // Método que calcula a soma filtrada de produtos com base em um critério
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0; // Inicializa a soma como zero
        // Itera sobre cada produto na lista
        for (Product p : list) {
            // Verifica se o produto atende ao critério definido pelo Predicate
            if (criteria.test(p)) {
                sum += p.getPrice(); // Se sim, adiciona o preço do produto à soma
            }
        }
        return sum; // Retorna a soma total
    }
}