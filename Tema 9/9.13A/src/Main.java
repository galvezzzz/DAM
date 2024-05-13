import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Futbolista[] futbolistas = {
                new Futbolista("77523495R", "Aurelio", 18, 5),
                new Futbolista("77523495M", "Miguel", 20, 9),
                new Futbolista("77777777T", "José", 32, 2),
                new Futbolista("71290475H", "David", 12, 15),
                new Futbolista("71093583Y", "Rafael", 26, 7)
        };

        Arrays.sort(futbolistas);

        System.out.println(Arrays.deepToString(futbolistas));

    }
}