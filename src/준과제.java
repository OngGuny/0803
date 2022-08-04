import java.util.Arrays;

/* 행렬 A - 	1 2
 * 			3 4
 * 			5 6
 * 행
 * 행렬 B    	7 8
 * A+B=? A*B=? 
 * 
 * a+b = 6	8
 * 		 10	12
 * a*b = 5+14	6+16
 * 		 15+28	18+32  
 */
public class 준과제 {
public static void main(String[] args) {
	int [][] a= {{1,2},
				 {3,4},
				 
				};
	int [][] b = {{5,6},
				  {7,8},
				};
	
	int [][] sum= new int[2][2];
	int [][] sum2= new int[2][2];
	
	//주소변수로 메소드 실행
	matrixAdd(a, b, sum);
	System.out.println("행렬의 합");
	matrixPrint(sum);
	System.out.println("행렬의 곱");
	matrixMult(a, b, sum2);
	matrixPrint(sum2);
	
	}
static void matrixAdd(int [][]A,int[][]B,int[][]results) {
	for(int i=0;i<A.length;i++) {
		for(int j =0;j<A.length;j++) {
			results[i][j]=A[i][j]+B[i][j];
		}
	}
}
static void matrixPrint(int[][]results) {
	for(int i=0;i<results.length;i++) {
		System.out.println(Arrays.toString(results[i]));
		
	}
	
}
static void matrixMult(int[][]a,int[][]b,int [][]results2) {
	for(int i=0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			for(int k=0;k<a.length;k++) {
			results2[i][j]+=a[i][k]*b[k][j]; // 규칙성 찾고 변수 늘려주기. 
		}
		}
}
	}
}// 큰 메소드 3개 만들어 놓고 각각 역할을 부여한다. 

