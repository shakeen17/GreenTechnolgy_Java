package testjava1;



public class BubbleSort {
public static void main(String[] args) {
	int[] arr = {10,4,5,3,8,2,9,1,7,6};

	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr.length - 1; j++) {
			if(arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	for(int i : arr) {
		System.out.print(i + " ");
	}
	
}
}
