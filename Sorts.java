public class Sorts {
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