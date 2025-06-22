package FactoryPattern;
import java.util.*;
public class BinarySearch implements algorithm {
    public void execute(int[] arr) {
        System.out.print("Enter the target element to search: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.print(" Searching for "+target+ " using Binary Search: ");
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}