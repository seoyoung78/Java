package ch05homework;

public class Exerxise08 {

	public static void main(String[] args) {
		int[][] arry = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				sum += arry[i][j];
			}
		}
		avg = (double) sum / (arry[0].length + arry[1].length + arry[2].length );
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}
