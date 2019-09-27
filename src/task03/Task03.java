package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task03 {
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение");
        String text = null;
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Что-то пошло не так");
        }
        String []array = text.split(" ");
        System.out.println("Кол-во слов в предложении: "+array.length);
        System.out.println("Делаем каждую первую букву слова заглавной..");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0,1).toUpperCase()+array[i].substring(1);
            System.out.print(array[i]+" ");
        }
        System.out.println("\nОтсортированные по алфавиту:");
        ArrayList<String> words= new ArrayList<>();
        Collections.addAll(words, array);
        Collections.sort(words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
