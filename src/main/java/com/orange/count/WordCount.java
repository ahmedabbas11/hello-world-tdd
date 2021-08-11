package com.orange.count;

public class WordCount {

    public int count(String phrase) {
        return phrase.split("[\\s,]").length;
    }
}
