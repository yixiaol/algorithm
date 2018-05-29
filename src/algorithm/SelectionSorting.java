package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择排序
 * @author yixl
 *
 */
public class SelectionSorting {

	public static void main(String[] args) {
		List<Integer> sortList = new ArrayList<Integer>();
		
		sortList.add(5);
		sortList.add(4);
		sortList.add(2);
		sortList.add(10);
		sortList.add(8);
		sortList.add(6);
		sortList.add(2);
		
		
		List<Integer> res = selectionSort(sortList);
		System.out.println(res);
	}
	
	/**
	 * 
	 */
	public static List<Integer> selectionSort(List<Integer> sortList){
		List<Integer> res = new ArrayList<Integer>();
		int smallestIndex = 0;
		for(int i = sortList.size() - 1; i >= 0; i--){
			smallestIndex = getSmallest(sortList);
			res.add(sortList.get(smallestIndex));
			sortList.remove(smallestIndex );
		}
		
		
		return res;
	}
	
	/**
	 * 查找最新元素的下标
	 * @return
	 */
	public static int getSmallest(List<Integer> sortList){
		int smallest = Integer.valueOf(sortList.get(0));
		int smallestIndex = 0;
		for(int i = 0; i < sortList.size() ; i ++){
			if(sortList.get(i) < smallest){
				smallest = sortList.get(i);
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}

}
