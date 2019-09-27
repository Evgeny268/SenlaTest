package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число");
        int value;
        while (true) {
            try {
                String text = reader.readLine();
                value = Integer.parseInt(text);
                break;
            }catch (NumberFormatException e){
                System.out.println("Допускается ввод только целых чисел. Попробуйте ввести число ещё раз");
            } catch (IOException e) {
                System.out.println("Что-то пошло не так");
                return;
            }
        }
        if (value%2==0){
            System.out.println("Число четное");
        }else {
            System.out.println("Число не четное");
        }
        if (isSimple(value)){
            System.out.println("Число простое");
        }else {
            System.out.println("Число составное");
        }
    }

    /**
     * Проверка числа на простоту
     * @param val - входное значение
     * @return - true - если число простое, иначе false
     */
    public static boolean isSimple(int val){
        if (val<0) val*=-1;
        for (int i = 2; i <= val / 2; i++) {
            if (val%i == 0) return false;
        }
        return true;
    }
}
