package Projetos.Desafio03;
//Criando uma subclasse que herda os metodos e atributos da classe Ninja
public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e a minha habilidade " + habilidadeEspecial + " foi ativada");
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
