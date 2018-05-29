package algorithm;

import java.util.List;

/**
 * 二分法查找
 * @author yixl
 *
 */
public class Dichotomy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	/**
	 * 二分查找
	 * @param list  有序的list
	 * @param item  要查找的元素
	 * @return
	 */
	public static String binarySearch(List<Integer> list,int item){
		int low = 0; 
		int high = list.size() - 1; //low和high用于跟踪要在其中查找的列表部分
		
		int mid = 0;
		int guess = 0;
		while (low <= high){  //查找范围没有缩小到1就继续
			
			mid = (low + high)/2;   //取中间元素
			guess = list.get(mid);
			
			if(guess == item){  //找到了要找的元素
				return String.valueOf(mid);  //返回找到的元素的位置
			}else if(guess < item){  // 猜的数字小了，将low的值从中间数开始
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return null;
	}
}
