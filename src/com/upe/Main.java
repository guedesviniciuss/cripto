package com.upe;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cryptography cryptography = new Cryptography(5);

        Scanner read = new Scanner(System.in);
        System.out.printf("Digite o password:\n");
        String password = read.next();

        String encryptedPassword = cryptography.encrypte(password);
        System.out.println(encryptedPassword);

        System.out.printf("Digite o password encriptografado password:\n");
        String newPassword = read.next();

        System.out.println(cryptography.decrypt(newPassword));
    }
}
