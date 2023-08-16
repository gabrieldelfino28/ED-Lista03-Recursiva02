package controller;

public class NumRepetidoController {
    public NumRepetidoController() {
        super();
    }

    public int FuncNum(int N1, int N2, int cont) {
        //Condição de parada -> quando N1 chegar a 0, encerra a pilha e retorna o valor
        //do contador cont.
        if (N1 == 0) {
            return cont;
        }
        if (N1 % 10 == N2) {
            cont+=1;
        }
        N1 /= 10;
        return FuncNum(N1, N2, cont);
        /*
           A função recebe os valores informados pelo usuário (N1 e N2) e um contador do main
           como parâmetros.
           A função funciona da seguinte forma: N1 será reduzido por 10, a cada nova chamada,
           ou seja, N é reduzido a cada dígito a cada nova chamada da função, dentro dela é
           verificado se o resto desta divisão é igual ao valor de N2, se sim é adicionado 1
           no contador.
           E esse processo se repete até a função chegar na sua condição de parada e retornar
           o valor de repetições do número N2.
         */
    }
}
