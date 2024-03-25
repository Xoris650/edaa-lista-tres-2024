package Word.Atv3.Classe;

import java.util.Random;

public class Produto {
    private String name;
    private Double price;

    /**
     * Construtor de um produto com valor aleatorio
     * @author Gabriel Evaristo
     * @param name Nome do produto a ser criado
     */
    public Produto(String name){
        this.name = name;
        this.price = new Random().nextDouble(1000);
    }

    /**
     * Construtor de um produto com valor predeterminado
     * @author Gabriel Evaristo
     * @param name Nome do produto a ser criado
     * @param price Preço do produto a ser criado
     */
    public Produto(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return String.format("Produto: %s - R$%.2f", getName(), getPrice());
    }
}
