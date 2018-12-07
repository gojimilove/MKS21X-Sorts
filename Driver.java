public class Driver {
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

	public static void main(String[] args) {
		System.out.println("==========\nSELECTIONSORTED:\n");
		int[] selection = {-1, 6, 3999, 20, -37, -92, 3, 169, 3, 6};
		System.out.println("original array:");
		printArray(selection);
		Sorts.selectionSort(selection);
		System.out.println("sorted array:");
		printArray(selection);
		System.out.println("==========");

		System.out.println("BUBBLESORTED:\n");
		int[] bubbles = {5, 1, 12, -5, 16};
		System.out.println("original array:");
		printArray(bubbles);
		Sorts.bubbleSort(bubbles);
		System.out.println("sorted array:");
		printArray(bubbles);
		System.out.println("==========");
	}
}
