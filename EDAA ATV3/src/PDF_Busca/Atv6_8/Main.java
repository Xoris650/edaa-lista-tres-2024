package PDF_Busca.Atv6_8;

import PDF_Busca.Atv6_8.Classes.Pessoa;

import java.util.ArrayList;

public class Main {

    public static void printResult(Pessoa result){
        if (result != null){
            System.out.printf("As pessoas encontradas foram: %s", result.getName());
        }else{
            System.out.print("Ninguem foi encontrado.");
        }
        System.out.println("\n---------------------");
    }
    public static void printResult(ArrayList<Pessoa> result){
        if (result != null){
            System.out.println("A pessoa encontrada foi:");
            for(Pessoa p : result){
                System.out.printf("%s, com %d anos\n", p.getName(), p.getAge());
            }
        }else{
            System.out.print("Ninguem foi encontrado.");
        }
        System.out.println("---------------------");
    }
    public static ArrayList<Pessoa> searchOverAge(Pessoa[] list, int age){

        ArrayList<Pessoa> peopleList = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            if (list[i].getAge() > age){
                peopleList.add(list[i]);
            }
        }
        return peopleList;
    }
    public static Pessoa searchByAge(Pessoa[] list, int age){
        for(int i = 0; i < list.length; i++){
            if(list[i].getAge() == age){
                return list[i];
            }
        }
        return null;
    }
    public static void main(String[] args) throws InterruptedException {
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);
        Pessoa[] listaPessoas = { vinicius, daniela,
                ana, carla,
                daniel, felipe,
                pedro, patricia,
                rafael, marcela, amanda };
        System.out.println("Esse codigo tem delay proposital, para a melhor visualização individual das atividades\n");
        Thread.sleep(2000);
        Pessoa result = searchByAge(listaPessoas,100);
        System.out.println("Buscando quem tem 100 anos...");
        Thread.sleep(3000);
        printResult(result);
        System.out.println("Buscando quem tem mais de 30 anos...");
        Thread.sleep(3000);
        ArrayList<Pessoa> resultList = searchOverAge(listaPessoas,30);
        printResult(resultList);
        Thread.sleep(3000);
        System.out.println("Agora mudando todas as idades para 18 anos");
        for(Pessoa p : listaPessoas){
            p.setAge(18);
            System.out.println(p);
        }

    }

}
