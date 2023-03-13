package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {
        int a = 2;
        int b= 5;
        System.out.println("Hello World!" + (a+b));

        Gato gato = new Gato("Roberto Carlos", "Preto", 2);

        System.out.println(gato);
    }

}
