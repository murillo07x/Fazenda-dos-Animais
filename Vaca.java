public class Vaca extends Animal{

    public Vaca(String nome, int idade, int patas) {
        super(nome, idade, patas);
    }

    @Override
    public String emitirSom() {
        return "Muuuuuu!";
    }
}
