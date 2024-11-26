package hust.soict.ite6.oop.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter array elements ");
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        /*array sorting*/
        Arrays.sort(a);
        
        System.out.println("Array after sort:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        System.out.println("Summary of array elements: " + sum);
        System.out.println("Average value of array: " + (double) sum / n);

        scanner.close(); // Close the scanner to avoid resource leak
    }
}
