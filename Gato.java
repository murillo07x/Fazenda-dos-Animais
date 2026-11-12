public class Gato extends Animal{

    public Gato(String nome, int idade, int patas) {
        super(nome, idade, patas);
    }

    @Override
    public String emitirSom() {
        return "Miauu!";
    }
}
