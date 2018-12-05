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
			//reset minIndex
			minIndex = i;

			//find min value from i to the end
			for (int j = i; j < ary.length; j++) {
				if (ary[j] <= ary[minIndex]) {
					minIndex = j;
				}
			}

			//swap that index and index i
			int swapped = ary[i];
			ary[i] = ary[minIndex];
			ary[minIndex] = swapped;
		}
	}
}