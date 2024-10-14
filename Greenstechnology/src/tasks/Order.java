package tasks;

import java.util.Scanner;

public class Order {

    public static int[] Ascending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        Ascending(arr);
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Elements:");
        int n = sc.nextInt();

        System.out.println("Enter the Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;

        while (flag) {
            System.out.println("Enter your choice: \n 1. Show all Elements in Ascending Order \n 2. Select Element From Ascending Order Array \n 3. Select First and Last No in Ascending Order Array \n 4. Show all Elements in Descending Order \n 5. Select Element From Descending Order Array \n 6. Select First and Last No in Descending Order Array \n 7. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Elements in Ascending Order:");
                    Ascending(arr);
                    for (int i : arr) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the Index:");
                    int index = sc.nextInt();
                    Ascending(arr);
                    if (index >= 0 && index < arr.length) {
                        System.out.println("The Element is: " + arr[index]);
                    } else {
                        System.out.println("Invalid Index.");
                    }
                    break;

                case 3:
                    Ascending(arr);
                    System.out.println("The First and Last Nos are: " + arr[0] + " and " + arr[arr.length - 1]);
                    break;

                case 4:
                    System.out.println("Elements in Descending Order:");
                    reverse(arr);
                    for (int i : arr) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Enter the Index:");
                    index = sc.nextInt();
                    reverse(arr);
                    if (index >= 0 && index < arr.length) {
                        System.out.println("The Element is: " + arr[index]);
                    } else {
                        System.out.println("Invalid Index.");
                    }
                    break;

                case 6:
                    reverse(arr);
                    System.out.println("The First and Last Nos are: " + arr[0] + " and " + arr[arr.length - 1]);
                    break;

                case 7:
                    flag = false;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
