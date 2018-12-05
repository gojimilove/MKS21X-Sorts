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
		int[] baddies = {-1, 6, 3999, 20, -37, -92, 3, 169, 3, 6};
		System.out.println("original array:");
		printArray(baddies);
		Sorts.selectionsort(baddies);
		System.out.println("sorted array:");
		printArray(baddies);
		System.out.println("==========");
	}
}