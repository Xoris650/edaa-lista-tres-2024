package PDF_Busca.Atv6_8.Classes;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d", getName(), getAge());
    }
}
