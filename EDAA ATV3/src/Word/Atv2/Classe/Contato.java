package Word.Atv2.Classe;

import java.util.Random;

public class Contato {
    /*

     */
    private String nome;
    private String phoneNumber;

    public Contato(String name) {
        int[] ddds = {61, 62, 64, 65, 66, 67, 82, 71, 73, 74, 75, 77, 85, 88, 83, 81, 87, 86, 89, 84, 79, 68, 96, 92, 97, 91,
                93, 94, 69, 95, 63, 27, 28, 31, 32, 33, 34, 35, 37, 38, 21, 22, 24, 11, 12, 13, 14, 15, 16, 17, 18, 19, 41,
                42, 43, 44, 45, 46, 51, 53, 54, 55, 47, 48, 49};
        this.nome = name;
        setPhoneNumber(ddds[new Random().nextInt(ddds.length)]);
    }

    public String getNome() {
        return nome;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(int ddd) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            temp.append(new Random().nextInt(9));
        }
        String number = temp.toString();
        this.phoneNumber = String.format("(%d)9 %s-%s", ddd, number.substring(0,4),number.substring(4));
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getNome(), getPhoneNumber());
    }
}
