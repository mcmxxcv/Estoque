package Aplicativo;

import Entidade.Produto;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Produto p2 = new Produto("TV1", 1000.25);
        Scanner sc = new Scanner(System.in);      
        p2.saida();
        System.out.print("Informe qtd add produtos: ");
        int qtd = sc.nextInt();
        p2.addProduto(qtd);
        System.out.print("Informe qtd rem produtos: ");
        qtd = sc.nextInt();
        p2.remProduto(qtd);
        p2.saida();
    }
}
