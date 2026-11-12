import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pato p1 = new Pato("Pato Donald", 25, 2);
        Pato p2 = new Pato("Tio Patinhas", 72, 2);
        Vaca v1 = new Vaca("Mimosa", 7, 4);
        Gato g1 = new Gato("Jeremias", 3, 4);
        Cachorro c1 = new Cachorro("Saracura", 10, 4);


        System.out.println("FAZENDA DOS ANIMAIS");
        // Forma Manual seria assim : System.out.println("O pato se chama: " + p1.getNome() + " e tem: " + p1.getIdade() + " anos");
        p1.apresentar();

        p2.apresentar();

        v1.apresentar();

        g1.apresentar();

        c1.apresentar();


    }
}
