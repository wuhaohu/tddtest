package com.junit.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsApiImpl implements AnagramsApi {
    public List<String> recurseArrange(String word) {

        List<String> result = new ArrayList<String>();

        if (word.length() == 0) {
            result.add("");
        }

        if (word.length() == 1) {
            result.add(word);
        }

        if (word.length() == 2) {
            result.add(word);
            result.add(new StringBuffer(word).reverse().toString());
        }

        if (word.length() > 2) {
            char[] word_convert_array = word.toCharArray();
            result = allArrange(word_convert_array, 0, word_convert_array.length - 1);
        }


        return result;
    }

//    static List<String> allArrange(char[] word_convert_array, int start, int end){
//
//        List<String> result = new ArrayList<String>();
//        StringBuffer cache = new StringBuffer();
//
//        if(start == end){
//            for (int i = 0; i < word_convert_array.length; i++) {
//                cache.append(word_convert_array[i]);
//                result.add(cache.toString());
//            }
//        }else{
//            for (int i = start; i <= end; i++) {
//                swap(word_convert_array,i,start);
//                allArrange(word_convert_array,start+1,end);
//                swap(word_convert_array,i,start);
//
//            }
//        }
//        return result;
//    }
//
//    static void swap(char[] word_convert_array,int a, int b){
//        char tmp =  word_convert_array[a];
//        word_convert_array[a] = word_convert_array[b];
//        word_convert_array[b] = word_convert_array[tmp];
//    }

    List<String> allArrange(char[] arrayA, int start, int end) {
        List<String> result = new ArrayList<String>();
//        StringBuffer cache = new StringBuffer();
        if (start == end) {
            System.out.print(String.valueOf(arrayA));
        } else {
            for (int i = start; i <= end; i++) {
                swap(arrayA, i, start);
                result.add(String.valueOf(arrayA));
                allArrange(arrayA, start + 1, end);
                swap(arrayA, i, start);
            }
        }

        for (String cache : result) {
            System.out.print(cache);
        }

        return result;
    }

    //交换数组m位置和n位置上的值
    void swap(char[] arrayA, int m, int n) {
        char temp = arrayA[m];
        arrayA[m] = arrayA[n];
        arrayA[n] = temp;
    }
}
