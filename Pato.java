public class Pato extends Animal{

    public Pato(String nome, int idade, int patas) {
        super(nome, idade, patas);
    }

    @Override
    public String emitirSom() {
        return "Quack!";
    }
}
