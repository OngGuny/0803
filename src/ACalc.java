
public class ACalc {
     void calc(Student[] array) {
    	 for(int i = 0; i<array.length;i++) {
	    array[i].tot=array[i].kor+array[i].eng+array[i].mat;
	    array[i].avg=array[i].tot/3.;
	       switch((int)(array[i].avg/10)) {
	         case 10:
	         case 9:	array[i].grade='A'; break;
	         case 8:	array[i].grade='B'; break;
	         case 7:	array[i].grade='C'; break;
	         case 6:	array[i].grade='D'; break;
		       default: array[i].grade='F'; 
	}
}
}
}