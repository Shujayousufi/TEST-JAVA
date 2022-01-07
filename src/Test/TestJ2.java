package Test;

public class TestJ2 {

	public static void main(String[] args) {
		double x = 4;
		double y = 10;
		System.out.println(y/x);
		int [] data = {4,5,66,444,2222,-33,2};
		System.out.println(maxValue(data));
		System.out.println(minValue(data));
		System.out.println(sumValue(data));
		System.out.println(avgValue(data));
	}
	public static int maxValue(int [] data) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	public static int minValue(int [] data) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	public static int sumValue(int [] data) {
		int sum =0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	public static double avgValue(int [] data) {
		double avg = (double) sumValue(data)/ data.length;
		return avg;
	}
}
