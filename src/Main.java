import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
       int[] numbers4 = new int[3];
       numbers4[0] = 10;
       for (int i = 0; i % 2 == 0; i = i+1){
           System.out.println(Arrays.toString(numbers4));
       }

    }

    private static void task3() {
        ///дополнено в задаче 1
    }

    public static void task1 () {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.print(", " + numbers[2] + ", " + numbers[1] + ", " + numbers[0]);

        double[] numbers2 = {1.57, 7.654, 9.986};
        System.out.println("       " +
                "           ");
        System.out.print(numbers2[0] + ", " + numbers2[1] + ", " + numbers2[2] + " " +
                " ");
        System.out.println(", " + numbers2[2] + ", " + numbers2[1] + ", " + numbers2[0] + ". ");

        int[] numbers3 = new int [2];
        numbers3[0] = 1;
        numbers3[1] = 2;
        System.out.print(numbers3[0] + ", " + numbers3[1] + ". ");
        System.out.print(", " + numbers3[1] + ", " + numbers3[0] + ". ");
        }



    public static void task2 () {
        //// есть в задаче выше


    }
}