import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor!");
        int firstParam = scan.nextInt();
        System.out.println("Digite o segundo valor!");
        int secondParam = scan.nextInt();
        try {
            count(firstParam, secondParam);
        } catch (ParameterInvalidExceptions e) {
            System.out.println(e);
        }
        scan.close();
    }

    static void count(int firstParam, int secondParam) throws ParameterInvalidExceptions {
        if (firstParam >= secondParam) {
            throw new ParameterInvalidExceptions("Segundo parametro deve ser maior que o primeiro");
        }

        int score = secondParam - firstParam;
        for (int i = 0; i < score; i++) {
            System.out.println(i+1);
        }
    }
}
