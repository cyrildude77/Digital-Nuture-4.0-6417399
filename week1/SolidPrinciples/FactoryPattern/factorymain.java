package FactoryPattern;
import java.util.*;
public class factorymain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i]= sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(data));
        algorithm algo = DSAFactory.getAlgorithm("sort");
        algo.execute(data);  // Bubble Sort Output

        Arrays.sort(data);
        algorithm searchAlgo = DSAFactory.getAlgorithm("search");
        searchAlgo.execute(data);  //  Binary Search Output
    }
}
