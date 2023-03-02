import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Command> stack = new Stack<>();

        Command MasDiez = new MasDiez();
        Command PorDos = new PorDos();
        Command MasUno = new MasUno();

        int counter = 0;

        int option = 0;

        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opcion:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Suma 10 al contador");
            System.out.println("4. Deshacer ultimo cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter = MasUno.execute(counter);
                    stack.add(MasUno);
                    break;
                case 2:
                    counter = PorDos.execute(counter);
                    stack.add(PorDos);
                    break;
                case 3:
                    counter = MasDiez.execute(counter);
                    stack.add(MasDiez);
                    break;
                case 4:
                    try {
                        Command undo = stack.pop();
                        if (undo != null) {
                            counter = undo.unexecute(counter);
                        }
                    } catch (EmptyStackException e) {
                        System.out.println("No hay más operaciones por deshacer");
                    }
                    break;
            }
        }
    }
}