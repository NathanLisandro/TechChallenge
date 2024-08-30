package org.resolution;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma string para inverter: ");
    String input = scanner.nextLine();
    scanner.close();

    String inverso = inverterString(input);
    System.out.println("String invertida: " + inverso);
}

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }

}
