package tasks4;
//Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//        Реализовать 2 варианта:
//        ●использовать конструкцию if для определения кратности
//        (цикл с шагом 1, i = i + 1);
//        ●без использования конструкции if (шаг цикла на ваше усмотрение).

public class Zadacha3 {
    public static void main(String[] args) {
        System.out.println("Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.");

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
        System.out.println("====================================");
        for (int i = 40; i <= 60 ; i = i + 4) {
            System.out.println(i);
        }
    }
}