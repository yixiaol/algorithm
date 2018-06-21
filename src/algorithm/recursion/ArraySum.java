package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现 数组相加
 * @author yixl
 */
public class ArraySum {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		System.out.println(sumArray(intList));
	}
	
	/**
	 * 数组求和
	 * @param intArray
	 * @return
	 */
	public static int sumArray(List<Integer> intArray){
		if(intArray.size() == 0){
			return 0;
		}else{
			
			int a = intArray.get(0);
			intArray.remove(0);
			return a + sumArray(intArray);
		}
	}
	

}
