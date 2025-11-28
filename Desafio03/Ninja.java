package Projetos.Desafio03;
//criando a classe principal e definindo seus atributos
public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missão: "+missao);
        System.out.println("Nível da Missão: "+nivelDificuldade);
        System.out.println("Status da Missão: "+statusMissao);
    }
}
