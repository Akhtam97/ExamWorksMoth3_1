import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EW1 {
    public static void main(String[] args) {
        //создал массив длиною в 100 и добавил цифры от 1-100
        int[] masiv = new int[100];
        int a = 1;
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = i + a;
        }


        // создал Хэшсет и закинул в него четные числа из Массива

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                set.add(masiv[i]);
            }
        }
        System.out.println(set);

        //отсортивровка Hashset не возможен т.к. в нем нет индексов однако мы можем воспользоваться treeSet
        // он отсортирует в проядке возрастания
        // но если нам нужно в своем порядке можем взять List - ы или LinkedHashSet так как он запоминает какой
        // какой очередью вы добавляете

        // например

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0 && masiv[i] % 5 == 0) {
                set2.add(masiv[i]);
            }
        }

        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0 && masiv[i] % 5 != 0) {
                set2.add(masiv[i]);
            }
        }
        System.out.println(set2);
        // как то вот так числа которые деляться на 5 и так же четные это 10 20 30 40 50 60 70 80 90 100
        // они в начале ликед листа так как добавили их вначале а потом уже остальные нечетные
    }
}

