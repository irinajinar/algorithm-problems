package org.example.removeShortWords;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveShortWords {
    //Remove words too short:
    public static void main(String[] args) throws Exception {
        //Let the user choose how many words they want to input:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserate the number of words do you want to introduce into arrayList: ");
        int numberOfWords = scanner.nextInt();
        //Read that many words
        System.out.println("Introduce " + numberOfWords + " words: ");

        ArrayList<String> words = new ArrayList<>(numberOfWords);

        for (int i = 0; i < numberOfWords; i++) {
            String word = scanner.next();
            words.add(word);
        }
        System.out.println(words);
        System.out.println("Please, introduce the minLength: ");
        int minLength = scanner.nextInt();
        System.out.println(removeShortWords(words, minLength));
    }

    //Let the user choose a number bigger than 0
    public static ArrayList<String> removeShortWords(ArrayList<String> words, int minLength) throws Exception {
//        ArrayList<String> newList = new ArrayList<>();
//        for (int i = 0; i < words.size(); i++) {
//            if (words.get(i).length() > minLength) {
//                newList.add(words.get(i));
//
//            }
//        }
//        return newList;
        if(words == null){
            throw new Exception("Words list cannot be null");
        }
        ArrayList<String> list = (ArrayList) words.clone();
        for (String word : words) {
            if (word.length() < minLength) {
                list.remove(word);
            }
        }
        return list;

    }
}


//Remove all words from the ArrayList that are shorter than the given number


//            //Let the user choose how many words they want to input:
//
//            //Read that many words
//
//            //Let the user choose a number bigger than 0
//            //Remove all words from the ArrayList that are shorter than the given number
//
//        }
