import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> Arr = Arrays.asList(10, 150, 0, -200, 1000, 18);
        Set<Integer> outputArr = new TreeSet<>(Arr);
        System.out.print("Original Array : ");
        for (int i : Arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        for (int i : outputArr) {
            System.out.print(i+" ");
        }
    }
}