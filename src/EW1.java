import java.util.*;

public class EW1 {
    public static void main(String[] args) {
        //создал массив длиною в 100 и добавил цифры от 1-100
        int[] masiv = new int[100];
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = i + 1;
        }


        // создал Хэшсет и закинул в него четные числа из Массива

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0) {
                set.add(masiv[i]);
            }
        }

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
        // как то вот так числа которые деляться на 5 и так же четные это 10 20 30 40 50 60 70 80 90 100
        // они в начале ликед листа так как добавили их вначале а потом уже остальные нечетные

        //Но у меня появилась идея которую я ща реализую!
        //есть массив из 1 - 100 я хочу его закинуть в линкед лист в условиях нету что мы их не можем
        // использовать :D

        // Заполняю Линкед Тест и сразу закидываю числа Кратные 2 и 5
        LinkedList<Integer> test = new LinkedList<>();
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 == 0 && masiv[i] % 5 == 0) {
                test.addFirst(masiv[i]);
            } else if (masiv[i] % 2 == 0 && masiv[i] % 5 != 0) {
                test.addLast(masiv[i]);
            }
        }
        // Далее беру LinkedHashset но создаю от HashSet и закидываю туда наш тест
        HashSet<Integer>hashSet = new LinkedHashSet<>(test);
        for (Integer i : hashSet) {
            System.out.println(i);
        }
    }
}

