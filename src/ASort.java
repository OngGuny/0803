// 내림차순으로 정리한다. 평균은 실수. 실수로는 정확하지않기 떄문에 실수로 비교하지 않는다. 평균말고 총점으로 랭킹 
public class ASort {
	void BubbleSorting(Student[] array) {

		for (int i = 0; i < array.length - 1; i++) { // bubble소팅은 i,j길이같아서 쉽다. 갯수 -1 해주고.
			for (int j = 0; j < array.length - 1; j++) { // 내림차순이니까 큰수가 앞으로 와야한다. 뒷번호가 크면 바꾼다.
				if (array[j].tot < array[j + 1].tot) { // 뒷사람이 클때,
					Student t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}

	}
}
