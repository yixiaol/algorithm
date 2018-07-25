package algorithm.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 快速排序（使用递归实现）
 * @author yixl
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		List<Integer> sortArray = new ArrayList<Integer>();
		
		sortArray.add(4);
		sortArray.add(3);
		sortArray.add(2);
		sortArray.add(7);
		sortArray.add(9);
		sortArray.add(6);
		sortArray.add(8);
		
		List<Integer> res = quickSort(sortArray);
		
		System.out.println(res);
		
	}
	
	/**
	 * 快速排序
	 * @param sortArray
	 * @return
	 */
	public static List<Integer> quickSort(List<Integer> sortArray){
		List<Integer> resArray = new ArrayList<Integer>();
		if(sortArray.size() < 2){
			return sortArray;
		}else{
			int baseNum = sortArray.get(0);
			
			List<Integer> less= new ArrayList<Integer>();
			List<Integer> greater= new ArrayList<Integer>();
			Map<String,List<Integer>> res = compareWithBase(sortArray, baseNum);
			less = res.get("less");
			greater = res.get("greater");
			
			resArray.addAll(quickSort(less)) ;
			resArray.add(baseNum);
			resArray.addAll(quickSort(greater)) ;
			
			return resArray;
		}
	}

	/**
	 * 将待排序的元素分为两组（大于基准值的一组，小于基准值的一组）
	 * @param sortArray
	 * @param baseNum
	 * @return
	 */
	private static Map<String,List<Integer>> compareWithBase(List<Integer> sortArray,int baseNum){
		List<Integer> less= new ArrayList<Integer>();
		List<Integer> greater= new ArrayList<Integer>();
		Map<String,List<Integer>> res = new HashMap<String,List<Integer>>(); 
		
		//循环从1开始，0已经作为基准值
		for(int i = 1;i < sortArray.size(); i ++ ){
			int sortNum = sortArray.get(i);
			if(sortNum <= baseNum){
				less.add(sortNum);
			}else{
				greater.add(sortNum);
			}
		}

		res.put("less", less);
		res.put("greater", greater);
		
		return res;
	}
}
