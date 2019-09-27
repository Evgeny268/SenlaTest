package task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Task02 {
    public static BufferedReader reader = null;
    public static void main(String []args){
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выбор режима работы программы\n" +
                "1 - Использовать методы встроенного класса BigInteger\n" +
                "2 - Использовать написанный алгоритм");
        int choise = 0;
        try {
            choise = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Некорректный ввод пункта меню");
            System.exit(-1);
        }
        switch (choise){
            case 1:
                mode1();
                break;
            case 2:
                mode2();
                break;
            default:
                System.out.println("Нет такого пункта меню");
        }
    }

    /*
        Вариант работы программы со втроенными классами BigInteger
     */
    public static void mode1(){
        BigInteger a;
        BigInteger b;
        while (true){
            try {
                System.out.println("Введите первое целое число");
                a = new BigInteger(reader.readLine());
                System.out.println("Введите второе целое число");
                b = new BigInteger(reader.readLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Допускается ввод только целых чисел. Попробуйте ввести числа ещё раз");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Что-то пошло не так");
                System.exit(-1);
            }
        }
        BigInteger gcd = a.gcd(b);
        BigInteger nok = (a.multiply(b)).divide(gcd); //НОК(a, b) = a * b / НОД(a, b)
        System.out.println("Наибольший общий делитель: "+gcd);
        System.out.println("Наименьшее общее кратное: "+nok);
    }

    /*
        Вариант работы программы, который использует написанный алгоритм
     */
    public static void mode2(){
        int a = 0;
        int b = 0;
        while (true){
            try {
                System.out.println("Введите первое целое число");
                a = Integer.parseInt(reader.readLine());
                System.out.println("Введите второе целое число");
                b = Integer.parseInt(reader.readLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Допускается ввод только целых чисел. Попробуйте ввести числа ещё раз");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Что-то пошло не так");
                System.exit(-1);
            }
        }
        int gcd = findGCD(a,b);
        int nok = (a*b)/gcd; //НОК(a, b) = a * b / НОД(a, b)
        System.out.println("Наибольший общий делитель: "+gcd);
        System.out.println("Наименьшее общее кратное: "+nok);
    }

    /**
     * Нахождение наибольшего общего делителя
     * @param a - первое число
     * @param b - второе число
     * @return - полученный НОД
     */
    public static int findGCD(int a, int b){
        if (a<0) a*=-1;
        if (b<0) b*=-1;
        if (a<b){
            int temp = b;
            b = a;
            a = temp;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            if (a%i== 0 && b%i == 0)
                result = i;
        }
        return result;
    }
}
