public class Sorts {
	public static void printArray(int[]ary) {
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
			if (i < ary.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n\n");
	}

	public static void selectionsort(int[] ary) {
		int minIndex = 0; //initialize index of min value 
		for (int i = 0; i < ary.length; i++) {
			//find min value from i to the end
			for (int j = i; j < ary.length; j++) {
				if (ary[j] <= ary[minIndex]) {
					minIndex = j;
					
				}
			}
			System.out.println("Index: "+minIndex);
			System.out.println("Value: "+ary[minIndex]);
			//swap that index and index i
			System.out.println("\n"+ary[i]);
			System.out.println(""+ary[minIndex]);
			printArray(ary);
			int swapped = ary[i];
			ary[i] = ary[minIndex];
			ary[minIndex] = swapped;
			printArray(ary);
		}
	}
}