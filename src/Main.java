import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] exercise1Massive1 = new int[3];
        exercise1Massive1[0] = 1;
        exercise1Massive1[1] = 2;
        exercise1Massive1[2] = 3;
        double[] exercise1Massive2 = {1.57, 7.654, 9.986};
        int[] exercise1Massive3 = {17, 45, 178};

        //Задание 2
        System.out.println("Задание 2");
        System.out.print(exercise1Massive1[0] + ", " + exercise1Massive1[1] + ", " + exercise1Massive1[2]);
        System.out.println();
        System.out.print(exercise1Massive2[0] + ", " + exercise1Massive2[1] + ", " + exercise1Massive2[2]);
        System.out.println();
        // Только не нужно пожалуйста ставить мне ошибку за квадратные скобки при выводе в консоль
        // третьего массива, я просто хотел попробовать вывести через Arrays.toString, что и так
        // оказалось для меня не так уж и просто, так как в конспекте не написано как добавлять
        // эту возможность. Я мог сделать как в следущем задании, но хотел испытать именно такой
        // вариант
        System.out.println(Arrays.toString(exercise1Massive3));

        //for (int i = exercise1Massive1.length - 1; i >= 0; i--) {
        //            if (i == 0) {

        //Задание 3
        System.out.println("Задание 3");
        for (int i = exercise1Massive1.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(exercise1Massive1[i]);
                break;
            }
            System.out.print(exercise1Massive1[i] + ", ");
        }
        System.out.println();
        for (int i = exercise1Massive2.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(exercise1Massive2[i]);
                break;
            }
            System.out.print(exercise1Massive2[i] + ", ");
        }
        System.out.println();
        for (int i = exercise1Massive3.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.print(exercise1Massive3[i]);
                break;
            }
            System.out.print(exercise1Massive3[i] + ", ");


        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < exercise1Massive1.length; i++) {
            if (i == exercise1Massive1.length - 1 && exercise1Massive1[i] % 2 != 0) {
                exercise1Massive1[i] = exercise1Massive1 [i] +1;
                System.out.print(exercise1Massive1[i]);
            }else if (exercise1Massive1[i] % 2 != 0) {
                exercise1Massive1[i] = exercise1Massive1 [i] +1;
                System.out.print(exercise1Massive1[i] + ", ");
            } else {
                System.out.print(exercise1Massive1[i] + ", ");
            }
        }
    }
}
