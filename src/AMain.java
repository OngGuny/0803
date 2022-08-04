
public class AMain {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		 Student [] array = new Student[2];
		 
		 
		 
		 AInput input = new AInput();      input.input(array);
		 ACalc calc = new ACalc();         calc.calc(array);
		 ASort sort = new ASort();         sort.BubbleSorting(array);   //계산 후 출력전에 sort
		 ARanking rank = new ARanking();
		 rank.selectionSorting(array);
		 AOutput output = new AOutput();   output.output(array);
		System.out.println("성적관리프로그램 끝");
	}

}
