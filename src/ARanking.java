//selection sorting 
public class ARanking {
	void selectionSorting(Student[] array) {
		for (int i = 0; i < array.length - 1; i++) {// 학생 2명 0 1 
			for (int j = i+1; j < array.length; j++) { //0다음 1과 비교= i와 i+1  그래서 범위에서도 하나더해진거 
				if (array[i].tot>array[j].tot) {
					array[j].ranking++;
				}else if(array[i].tot<array[j].tot) {
					array[i].ranking++;
				}
			}
		}
		
	}
}      