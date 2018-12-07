public class Sorts {
	/**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
	public static void selectionSort(int[] ary) {
		int minIndex = 0; //initialize index of min value
		for (int i = 0; i < ary.length; i++) {
			minIndex = i; //reset minIndex
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

	/**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
	public static void bubbleSort(int[] data){
		for (int i = 0; i < data.length - 1; i++) { //(n-1)) runs
			//System.out.println("RUN"+(i+1));
			for (int j = 0; j < data.length - (i + 1); j++) {
				int swapped = data[j];
				//swap pair of numbers if first one is bigger
				if (data[j] > data[j + 1]) {
					data[j] = data[j + 1];
					data[j + 1] = swapped;
				}
				//System.out.println(""+data[j]+", "+data[j+1]);
			}
		}
	}
}
