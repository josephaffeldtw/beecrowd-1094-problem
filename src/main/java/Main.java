import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Experiments experiments = new Experiments();

        System.out.println("\n Digite os valores de entrada: ");
        int quantTests = Integer.parseInt(input.readLine());

        if (quantTests > 0 && quantTests < 15){
            for(int i=0; i<quantTests; i++){
                String line = input.readLine();

                String[] infos = line.split(" ");

                int amount = Integer.parseInt(infos[0]);
                String type = infos[1];

                experiments.calculateCobaias(amount, type);
            }
            experiments.output();
        } else {
            System.out.println("quantidade de testes não permitida " + quantTests);
        }
    }
}