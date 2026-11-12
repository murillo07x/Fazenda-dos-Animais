public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, int patas) {
        super(nome, idade, patas);
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }
}
