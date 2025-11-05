package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("A", "B", "A"));
        System.out.println(strings.toArray());


    }
}
