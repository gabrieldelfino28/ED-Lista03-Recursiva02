package view;

import controller.NumRepetidoController;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumRepetidoController n = new NumRepetidoController();

        int Num1;
        int Num2;

        do {
            System.out.println("Informe um valor entre 10 e 999999: ");
            Num1 = scan.nextInt();
            if(Num1 < 10 || Num1 > 999999){
                System.out.println("Erro, tente novamente.");
            }
        }while(Num1 < 10 || Num1 > 999999);

        do{
            System.out.println("Informe um valor entre 0 e 9: ");
            Num2 = scan.nextInt();
            if(Num2 < 0 || Num2 > 9){
                System.out.println("Erro, tente novamente.");
            }
        }while(Num2 < 0 || Num2 > 9);

        int cont=0;
        int res = n.FuncNum(Num1,Num2,cont);

        System.out.println("O número "+Num2+" aparece cerca de "+res+" vezes no número "+ Num1);
    }
}
