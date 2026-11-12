public class Animal {

    private String nome;

    private int idade;

    private int patas;

    public Animal(String nome, int idade, int patas) {
        this.nome = nome;
        this.idade = idade;
        this.patas = patas;
    }

    public String emitirSom(){
        return "Som Genérico";
    }
    public void apresentar(){
        System.out.println("Nome do animal: " + nome);
        System.out.println("Idade que o animal apresenta: " + idade);
        System.out.println("Som: " + emitirSom());
        System.out.println("Quantidade de Patas: " + patas);
    }
}
