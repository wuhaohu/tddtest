package com.junit.demo;

import java.util.ArrayList;
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

        if (word.length() >= 2) {
            for (int i = 0; i < word.length(); i++) {
                String head = new StringBuffer(word).substring(i, i + 1).toString();
                String tail = new StringBuffer(word).replace(i, i + 1, "").toString();
                List<String> recurseTail = recurseArrange(tail);
                for (String tailGroup : recurseTail) {
                    result.add(head + tailGroup);
                }
            }
        }


        return result;
    }

}
