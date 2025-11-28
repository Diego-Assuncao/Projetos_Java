package Projetos.Desafio03;

public class Main {
    public static void main(String[] args) {
        //criando o objeto e definindo os metodos
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Defender a aldeia da folha de 5 ninjas invasores";
        Sasuke.nivelDificuldade = "Nível Médio";
        Sasuke.statusMissao = "70% Concluída";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.mostrarInformacoes();
    }
}
