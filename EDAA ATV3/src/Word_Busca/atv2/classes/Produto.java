package Word_Busca.atv2.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Produto {
    private String name;
    private Double price;
    private LocalDate date;

    public Produto(String name, Double price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateAsString = getDate().format(df);
        return String.format("%s - R$%.2f - %s", getName(), getPrice(), dateAsString);
    }
}
