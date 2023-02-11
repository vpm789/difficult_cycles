public class Main {
    public static void main(String[] args) {
        task4();
        task5();
    }

    private static void task4() {
        System.out.println("");
        System.out.println("Задача №4");
        /*
        Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping,
        а если число делится на 5 без остатка, вывести pong.
        Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        Допускается наличие пустых строк в выводе.
        - Вывод должен быть следующий:
        1:
        2:
        3: ping
        4:
        5: pong
        6: ping
        7:
        8:
        9: ping
        10: pong
        11:
        12: ping
        13:
        14:
        15: ping pong
        16:
        */
        int i = 1;
        while (i <= 30) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else {
                System.out.println(i + ":");
            }
            i++;
        }
    }

    private static void task5() {
        System.out.println("");
        System.out.println("Задача №5");
        /*Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        – Каждое следующее число равняется сумме двух предыдущих.
        Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        Должно получиться следующее:
        0 1 1 2 3 5 8 13 21 34
        */
        var value = 0;
        var preValue = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(value + " ");
            value = value + preValue;
            preValue = value - preValue;
        }

    }
}