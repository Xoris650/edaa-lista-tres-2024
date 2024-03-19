package Word.Atv3.Classe;

import java.util.Random;

public class Produto {
    private String name;
    private Double price;

    public Produto(String name){
        this.name = name;
        this.price = new Random().nextDouble(1000);
    }
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
