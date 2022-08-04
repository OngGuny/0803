/*1+(1+2)+(1+2+3) ... (1+...+100) 풀어보기. 메소드 사용해서 
 * 
 */

public class Practise {
public static void main(String[] args) {
	int sum=0;
	for(int i =0;i<=100;i++) {
		sum+=calc2(i);
	}
	Calc1(3);
	Calc3(3);
	System.out.println("what??"+sum);
}



static void Calc1(int a) {
	int sum=0;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
		sum+=j;
		}
	}System.out.println(sum);
}






static int calc2(int b) {
	int sum=0;
	for(int i = 0;i<=b;i++) {
		sum+=i;
	}
	return sum;
}
static void Calc3 (int b) {
	int sum=0;
	for(int i = 1;i<=100;i++) {
		sum+=i;
	}System.out.println(sum);
}
}
