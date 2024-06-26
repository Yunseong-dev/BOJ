package boj_3052;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            arr.add(scanner.nextInt() % 42);
        }

        Set<Integer> set = new HashSet<Integer>(arr);

        System.out.println(set.size());
        scanner.close();
    }
}

