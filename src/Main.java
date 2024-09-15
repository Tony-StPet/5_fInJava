// первй пример - простая функция
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("первй пример - простая функция");
        func0();
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {
            func0();
        }
        System.out.println("---------------___________________");
        func1();
        System.out.println("функция powerCalculator " + powerCalculator(5, 3));
        // другой способ
        System.out.println("второй способ powerCalculator____________________");
        double number = 2.5;
        int power = 3;
        double callResult = powerCalculator(number, power);
        System.out.println(callResult);

        System.out.println("третий момент");
        int result3 = func2();
        System.out.println("Результат вызова функции: " + result3);
// _______________________________________________________
        System.out.println("четвертый момент  ________________________");
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        b = scanner.nextInt();

        int sum = func3(a, b);
        System.out.println("Результат вызова функции сложения чисел а и б: " + sum);

// _______________________________________________________

        // Домашнее задание ФУНКЦИИ
        System.out.println("_______________________________________________________");
        System.out.println("Домашнее задание 1:");

        String s = inputOneWord();
        System.out.println("Сколько раз вывести это слово? :");
        int x = scanner.nextInt();
        funcTask1(s,x);
        String s1 = inputOneWord();
        funcTask1(s1,4);

        System.out.println("Домашнее задание 2:");
        String s2 = inputOneWord();
        System.out.println("Сколько раз вывести это слово? :");
        int x2 = scanner.nextInt();
        funcTask2(s2,x2);

        System.out.println("Домашнее задание 3:");
        System.out.println("Сколько раз вывести слово ОЙ? :");
        int num = scanner.nextInt();
        funcTask3(num);

        System.out.println("Домашнее задание 4:");
        funcTask4();

        System.out.println("Домашнее задание 5: работа с массивом");
        funcTask5();
    }
// закончилось тело МЭЙН
//_____________________________________________________________________________________________________________________
//_____________________________________________________________________________________________________________________


    public static void func0(){
        System.out.println("это примитивная функция");
    }

    public static void func1(){
        System.out.println("Это тоже довольно простая функция:");
        System.out.println("в ней несколько шагов,");
        System.out.println("но нет никаких параметров.");
    }
    public static double powerCalculator(double base, int exponent) {
        double functionResult = Math.pow(base, exponent);
        return functionResult;
    }
    public static int func2() {
        System.out.println("это примитивная функция");
        return 42;
    }
    public static int func3(int x, int y) {
        int result = x + y;
        System.out.println("это  функция");
        return result;
    }

    //________________________________________________________________
//________________________________________________________________
// ДОМАШНЯЯ РАБОТА - Функции

    //вывести String несколько раз
    public static void funcTask1(String s, int x){
        for (int i = 0; i < x; i++) {
            System.out.printf(s + " ");
        }

        System.out.println(" ");
    }

    //вывести слово которое ввел пользователь
    public static String inputOneWord(){
        System.out.println("введите 1 слово");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        return word;
    }

    //вывести слово несколько раз
    public static void funcTask2(String s2, int x2){
        int count = 0;
        while (count < x2){
            System.out.printf(s2 + " ");
            count++;
        }

        System.out.println(" ");
    }

    //вывести слово Ой по увеличению в строке
    public static void funcTask3( int x3){
        String word = "Ой";

        for (int i = 0; i < x3; i++) {

            for (int j = 0; j <= i; j++){
                System.out.printf(word);
            }
            System.out.println(" ");
        }
    }

    //вывести массив String в зависимости от условий, построчно
    public static void funcTask4() {
        String[] words = {"Мария", "Екатерина", "Александра", "Анна", "Иван", "Гарсиа", "Мария", "Наталья"};
        for (int i = words.length-1; i>=0; i--) {
            char targetLetter1 = 'а';
            char targetLetter2 = 'я';

            if (words[i].endsWith(String.valueOf(targetLetter1))) {
                funcTask1(words[i], 2);}

            if (words[i].endsWith(String.valueOf(targetLetter2))){
                funcTask1(words[i], 3);}

            if (!words[i].endsWith(String.valueOf(targetLetter1)) && !words[i].endsWith(String.valueOf(targetLetter2))){
                funcTask1(words[i], 1);}
        }
    }

    //вывести массив цифр и операции с ними
    public static void funcTask5() {
        int[] numbers = new int[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа в массив :  ");
        for (int i = 0; i < 7; i++) {
           numbers[i] = scanner.nextInt(); // Заполняем массив числами
        }

        System.out.println("Вывести массив numbers: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Используем метод : цикл сравнения 0 элемента с i элементом");
        System.out.println("Поиск минимального числа в массиве");

        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Минимальное число: " + minValue);

        System.out.println("Используем метод :  Stream API");
        System.out.println("Поиск максимального числа в массиве");
        int maxValue = java.util.stream.IntStream.of(numbers).max().orElse(Integer.MAX_VALUE);
        System.out.println("Максимальное число: " + maxValue);

        // встроенный метод Math.round() в комбинации с потоками и методом average() из Java 8 Stream API.
        System.out.println("Используем метод :  встроенный");
        System.out.println("Поиск среднеарифметического числа в массиве");
        double averageValue = Arrays.stream(numbers).average().orElse(0.0); // поиск среднего
        double roundedAverage = Math.round(averageValue * 10.0) / 10.0; // округление
        System.out.println("Среднеарифметическое число: " + roundedAverage);

        int counterMoreAverageValue = 0;
        int counterLessAverageValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > roundedAverage){
                counterMoreAverageValue++;}
            if (numbers[i] < roundedAverage){
                counterLessAverageValue++;}
        }
        System.out.println("количество чисел в массиве, которые больше среднего: " + counterMoreAverageValue);
        System.out.println("количество чисел в массиве, которые меньше среднего: " + counterLessAverageValue);
    }

}

