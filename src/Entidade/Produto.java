package Entidade;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;        
    }
    
    public Produto(String nome, int quantidade,double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public void saida(){
        System.out.println("Nome: " + nome
                + ", quantidade: " + quantidade
                + ", preço: R$" + preco
                + ", valor estoque: R$" + valorEstoque());
    }    
    public void entrada(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe nome: ");
        nome = sc.nextLine();
        System.out.print("Informe quantidade: ");
        quantidade = sc.nextInt();
        System.out.print("Informe preço: R$");
        preco = sc.nextDouble();
    }
    public double valorEstoque(){
        return preco * quantidade;
    }
    public void addProduto(int quantidade){
        this.quantidade += quantidade;
        //this.quantidade = this.quantidade + quantidade
    }
    public void remProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
