package ex_25_Enum;

public class Lab_RealTIme_Example {
    public static void main(String[] args) {
        System.out.println(env.Dev.getUrl());
        System.out.println(env.prod.getUrl());
        System.out.println(env.test.getUrl());
    }
}

//env enum file is created separately

