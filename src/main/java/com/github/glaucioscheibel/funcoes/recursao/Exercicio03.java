package com.github.glaucioscheibel.funcoes.recursao;

import java.util.Scanner;

public class Exercicio03 {
    public static int mdc(int x, int y) {
        if (y == 0) {
            return x;
        }
        return mdc(y, x % y);
    }

    static void main() {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("X: ");
        x = input.nextInt();
        System.out.print("Y: ");
        y = input.nextInt();
        System.out.printf("O máximo divisor comum de %d e %d é %d%n", x, y, mdc(x, y));
        input.close();
    }
}
