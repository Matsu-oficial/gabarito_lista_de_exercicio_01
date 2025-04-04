package exercicio_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(21, 46, 5);
        Hora h2 = new Hora(7, 23, 41);
        Hora h3 = new Hora(13, 643, 235);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());
    }

}
