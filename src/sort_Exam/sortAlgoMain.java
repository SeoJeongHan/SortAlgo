package sort_Exam;

import sort_Exam.quick.impl.QuickSortImpl;

public class sortAlgoMain {
	
	private static int[] arrList = { 3, 2, 38, 5, 47, 15, 36, 26, 27, 44, 46, 4, 19, 50, 48};
	
	public static int[] getArrList() {
		return arrList;
	}


	public static void setArrList(int[] arrList) {
		sortAlgoMain.arrList = arrList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSortImpl quickSort = new QuickSortImpl();
		quickSort.sortList(getArrList(), getArrList().length);
		
        for(int i=0; i<getArrList().length; i++){
            System.out.println("data["+i+"] : "+getArrList()[i]);
        }
		
	}

}
