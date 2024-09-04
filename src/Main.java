import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Задача 1: Четное или нечетное число
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
//        System.out.println(in.nextInt()%2==0?"Четное":"Нечетное");

//        Задача 2: Минимальное из трех чисел
//        Условие:
//        Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.
//        int[] mas=new int[3];
//        for(int i=0;i<3;i++){
//            mas[i]=in.nextInt();
//        }
//        System.out.println("Минимальное число - "+Arrays.stream(mas).min().getAsInt());

//        Задача 3: Таблица умножения
//        Условие:
//        Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
//for (int y=1;y<=10;y++){
//    System.out.println(y*5);
//}

//        Задача 4: Сумма чисел от 1 до N
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.

//        int sum=0;
//        int max=in.nextInt();
//        for (int i = 1; i <= max; i++) {
//            sum=sum+i;
//        }
//        System.out.println(sum);

//        Задача 5: Число Фибоначчи
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.

//       int one=0;
//       int two=1;
//       int max=in.nextInt();
//       for (int i = 0; i <max-2 ; i++) {
//            one=two+one;
//            one=two+one;
//            two=one-two;
//            one=one-two;
//
//        }
//        System.out.println(max==1?one:two);

//                Задача 6: Проверка простого числа
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).
//
//        int num=in.nextInt();
//        String error="Число является простым";
//        for (int i = 2; i <=num/2 ; i++) {
//            if (num%i==0) {
//                error="Число не является простым";
//                break;
//            }
//        }
//        System.out.println(error);
//
//        Задача 7: Обратный порядок чисел
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.
//
//        int sum=0;
//      int max=in.nextInt();
//       for (int i = max; i >= 1; i--) {
//           System.out.println(i);
//       }

//
//                Задача 8: Сумма четных чисел
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).
//        int sum=0;
//        int start=in.nextInt();
//                int finish=in.nextInt();
//        for (int i = start; i <=finish ; i++) {
//            if (i%2==0) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//                Задача 9: Реверс строки
//        Условие:
//        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.

//String startLength=in.nextLine();
//        for (int i = startLength.length()-1; i >=0 ; i--) {
//
//            System.out.print(startLength.charAt(i));
//        }

//        Задача 10: Количество цифр в числе
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.

//        int quanty=1;
//        int num=in.nextInt();
//        while (num>=10){
//            num=num/10;
//            quanty++;
//        }
//        System.out.println(quanty);

//        Задача 11: Факториал числа
//        Условие:
//        Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).

//        int num=in.nextInt();
//        int factorial=1;
//        for (int i = 1; i <= num; i++) {
//            factorial=factorial*i;
//        }
//        System.out.println(factorial);

//        Задача 12: Сумма цифр числа
//        Условие:
//        Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.
//        int num=in.nextInt();
//        int result=0;
//        while(num>10){
//            result+=num%10;
//            num=num/10;
//        }
//result+=num;
//        System.out.println(result);
//

//        Задача 13: Палиндром
//        Условие:
//        Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом
//        (читается одинаково слева направо и справа налево).
//        String  test=in.nextLine();
//        String answer="Строка палиндром";
//        for (int i = 0; i <test.length()/2; i++) {
//            if (test.charAt(i)!=test.charAt(test.length()-1-i)){
//                answer="Строка не палиндром";
//                break;
//            }
//        }
//        System.out.println(answer);

//        Задача 14: Найти максимальное число в массиве
//        Условие:
//        Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.

//    int heigth=in.nextInt();
//    int max=0;
//    int[] mas=new int[heigth];
//        for (int i = 0; i < heigth; i++) {
//            mas[i]=in.nextInt();
//            if (i == 0) {
//                max=mas[i];
//            }
//            if (max<mas[i]) {
//                max=mas[i];
//            }
//
//        }
//        System.out.println(max);


//                Задача 15: Сумма всех элементов массива
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.
//        int heigth=in.nextInt();
//    int sum =0;
//    int[] mas=new int[heigth];
//        for (int i = 0; i < heigth; i++) {
//            mas[i]=in.nextInt();
//            sum+=mas[i];
//        }
//        System.out.println(sum);


//                Задача 16: Количество положительных и отрицательных чисел
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.

//        int heigth = in.nextInt();
//        int plus = 0;
//        int minus = 0;
//        int[] mas = new int[heigth];
//        for (int i = 0; i < heigth; i++) {
//            mas[i] = in.nextInt();
//            if (mas[i]>0) {
//                plus++;
//            }
//            else{
//                minus++;
//            }
//        }
//        System.out.println("Положительных "+plus);
//        System.out.println("Отрицательных "+minus);


//        Задача 17: Простые числа в диапазоне
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).


//        int start = in.nextInt();
//        int finish = in.nextInt();
//        boolean tip=true;
//        for (int i = start; i <= finish; i++) {
//
//        for (int j = 2; j <=i/2 ; j++) {
//            if (i%j==0) {
//                tip=false;
//                break;
//            }
//        }
//            if ( tip) {
//                System.out.print(i+"\t");
//            }
//            tip=true;
//        }


//                Задача 18: Подсчет гласных и согласных в строке
//        Условие:
//        Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.

//        String A="ауоиэыяюеё";
//        int aword=0;
//        int bword=0;
//
//        String strok=in.nextLine().toLowerCase();
//        for (int i = 0; i <strok.length() ; i++) {
//            if(A.contains(Character.toString(strok.charAt(i)))){
//                aword++;
//            }
//            else {
//                bword++;
//            }
//        }
//        System.out.println("Количество гласных "+aword);
//        System.out.println("Количество согласных "+bword);


//                Задача 19: Перестановка слов в строке
//        Условие:
//        Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.
//        String strok=in.nextLine().toLowerCase();
//        String[] revStrok=strok.split(" ");
//        for (int i = revStrok.length-1; i >=0 ; i--) {
//            System.out.print(revStrok[i]+" ");
//        }

//                Задача 20: Число Армстронга
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).
//        int num = in.nextInt();
//        int num1 = num;
//        int pow = String.valueOf(num).length();
//        double sum = 0;
//        while (num > 10) {
//            sum += Math.pow(num % 10, pow);
//            num = num / 10;
//        }
//        sum += Math.pow(num, pow);
//        if ((int) sum == num1) {
//            System.out.println("Число Армстронга");
//        } else {
//            System.out.println("Не число Армстронга");
//        }
//
//    }
//}