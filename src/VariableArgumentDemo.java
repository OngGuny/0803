
public class VariableArgumentDemo {
public static void main(String[] args) {
	int a =5; //argument
	mymethod(7,"Hello",'A',89.5,false); // 갯수는 ...으로 받는다. 타입도 다양하다면? 자바의 모든 객체의 부모인 Object 사용  
}
static void mymethod(Object...array) { //parameter
//	for(int i=0;i<array.length;i++) {
//		System.out.println(array[i]);
//	}
	for(Object i : array) {
		System.out.println(i);
	}
	
}
}
