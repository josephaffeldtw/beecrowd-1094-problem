import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Experiments experiments = new Experiments();

        int quantTests = input.nextInt();

        if (quantTests > 0 && quantTests < 15){
            for(int i=0; i<quantTests; i++){
                int amount = input.nextInt();
                String type = input.next();

                experiments.calculateCobaias(amount, type);
            }
            experiments.output();
        } else {
            System.out.print("quantidade de testes não permitida " + quantTests);
        }
    }
}