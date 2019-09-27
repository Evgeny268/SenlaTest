package task05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task05 {
    public static final int MAXN = 100;
    public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите N");
        int count = Integer.parseInt(reader.readLine());
        if (count>MAXN){
            System.out.println("N нельзя устанавливать больше "+MAXN+". Програмно устанавливаем N значение "+MAXN);
            count = MAXN;
        }
        for (int i = 0; i < count; i++) {
            if (isPalindrom(i)) System.out.println(i);
        }
    }

    public static boolean isPalindrom(int value){
        return new StringBuilder(String.valueOf(value)).reverse().toString().equals(String.valueOf(value));
    }
}
