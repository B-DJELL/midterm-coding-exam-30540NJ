package string.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {

    @Test
    public void testAnagram() {
        String s1 = "CAT";
        String s2 = "ACT";

        boolean currentResult = Anagram.compareTwo(s1, s2);
        // boolean ExpectedResault =true;
        Assert.assertTrue(currentResult);
        System.out.println("test  anagram passed ");

    }

    @Test
    public void testAnagram1() {
        String s1 = "cat";
        String s2 = "madam";

        boolean currentResult = Anagram.compareTwo(s1, s2);
        // boolean ExpectedResault =true;
        Assert.assertTrue(currentResult);
        System.out.println("test  anagram 1 passed ");

    }

    @Test
    public void testDetermineLargest() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> currentMap = DetermineLargestWord.findTheLargestWord(s);
        Map<Integer, String> currentRes = DetermineLargestWord.resValue(currentMap);
        Map<Integer, String> Expected = new HashMap<>();
        Expected.put(7, "biological");
        boolean key = currentRes.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest passed ");


    }

    @Test
    public void testDetermineLargest1() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> currentMap = DetermineLargestWord.findTheLargestWord(s);
        Map<Integer, String> currentRes = DetermineLargestWord.resValue(currentMap);
        Map<Integer, String> Expected = new HashMap<>();
        Expected.put(10, "biological");
        boolean key = currentRes.equals(Expected);
        Assert.assertTrue(key);
        System.out.println("test determine largest 1 passed ");


    }

    @Test
    public void testDuplicateWord() {
        String st = "Java is a programming Language . Java is also an Island of Indonesia. Java is widely used language";
        ArrayList<String> Current = DuplicateWord.duplicatedWord(st);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("java", "is", "language"));
        Assert.assertTrue(Current.equals(expected));
        System.out.println("test duplicate word passed");


    }
}