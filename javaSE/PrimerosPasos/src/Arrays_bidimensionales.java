
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[2][3];
		
		matrix[0][0] = 15;
		matrix[0][1] = 10;
		matrix[0][2] = 19;
		
		matrix[1][0] = 21;
		matrix[1][1] = 18;		
		matrix[1][2] = 9;
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
