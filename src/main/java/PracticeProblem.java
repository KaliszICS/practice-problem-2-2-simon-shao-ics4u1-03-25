import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
	}
	
public static int[] compareSearch(int[] array, int number){
	Arrays.sort(array);
int[] counters = new int[] {0, 0};
int counterS = 0;
int counterB = 0;
for (int s = 0; s<array.length; s++){
counterS++;
if (number == array[s]){
	s = array.length;
}
}
int low =0;
int high = array.length-1;
int mid;
while (low<=high){
	mid = (low+high)/2;
	counterB++;
	if (number == array[mid]){
		low = high+1;
	}
	else if (number > array[mid]){
		low = mid+1;
	}
	else{
		high = mid-1;
	}
}

counters[0] = counterS;
counters[1] = counterB;
return counters;
}

public static int[] compareStringSearch(String[] array, String word){
	Arrays.sort(array);
	int[] counters = new int[] {0, 0};
	int counterS = 0;
	int counterB = 0;
	for (int s = 0; s<array.length; s++){
	counterS++;
	if (word== array[s]){
		s = array.length;
	}
	}
	int low =0;
	int high = array.length-1;
	int mid;
	while (low<=high){
		mid = (low+high)/2;
		counterB++;
		if (word == array[mid]){
			low = high+1;
		}
		else if (word.compareTo(array[mid])>0){
			low = mid+1;
		}
		else{
			high = mid-1;
		}
	}
	
	counters[0] = counterS;
	counters[1] = counterB;
	return counters;
	}
}
