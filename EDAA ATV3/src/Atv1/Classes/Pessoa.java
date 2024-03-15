package Atv1.Classes;

import Atv1.Interface.GenericPerson;

import java.util.Random;

public class Pessoa implements GenericPerson {
    private String name;
    private Integer age;

    public Pessoa(String name){
        this.name = name;
        this.age = new Random().nextInt(101);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public int comparePersonAge(GenericPerson person) {
        Pessoa pessoa = (Pessoa) person;
        if(this.age < pessoa.getAge()){
            return -1;
        }else if(this.age > pessoa.getAge()){
            return 1;
        }
        return 0;
    }

    public char[] stringToArray(String s){
        char[] arr = new char[s.length()];
        for(int i =0; i < s.length(); i++){
            arr[i] = s.toLowerCase().charAt(i);
        }
        return arr;
    }
    public int comparePersonChar(GenericPerson person){
        Pessoa pessoa = (Pessoa) person;
        char[] arr1 = stringToArray(pessoa.getName());
        char[] arr2 = stringToArray(getName());

        for(int i = 0; i < arr1.length; i++){
            if((int)arr1[i] > (int)arr2[i]){
                return -1;
            }else if((int)arr1[i] < (int)arr2[i]){
                return 1;
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d", getName(), getAge());
    }


}
