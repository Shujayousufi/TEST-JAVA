package Test;

public class TestJ2 {
	//Thanks for the last changes.
	public static void main(String[] args) {
		double x = 4;
		double y = 10;
		System.out.println(y / x);
		int[] data = { 4, 5, 66, 444, 2222, -33, 2 };
		System.out.println(maxValue(data));
		System.out.println(minValue(data));
		System.out.println(sumValue(data));
		System.out.println(avgValue(data));
		System.out.println("second Max: " +secondMaxValue(data));
		System.out.println("second Min: " +secondMinValue(data));
	}

	public static int maxValue(int[] data) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

	public static int minValue(int[] data) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	public static int sumValue(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public static double avgValue(int[] data) {
		double avg = (double) sumValue(data) / data.length;
		avg = Math.round(avg * 100.0) / 100.0;
		return avg;
	}
	public static int secondMinValue(int[] data) {
		int secondMin = Integer.MAX_VALUE;
		int min = minValue(data);
		for (int i = 0; i < data.length; i++) {
			if (min < data[i] && secondMin > data[i]) {
				secondMin = data[i];
			}
		}
		return secondMin;
	}
	public static int secondMaxValue(int[] data) {
		int secondMax = Integer.MIN_VALUE;
		int max = maxValue(data);
		for (int i = 0; i < data.length; i++) {
			if (max > data[i] && secondMax < data[i]) {
				secondMax = data[i];
			}
		}
		return secondMax;
	}
	
}
