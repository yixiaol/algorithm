package algorithm.recursion;

/**
 * 递归实现阶乘
 * @author yixl
 *
 */
public class RecursionFactorial {

	public static void main(String[] args) {
		int x = 5;
		int res = fact(x);
		System.out.println(res);
	}
	
	/**
	 * 阶乘算法
	 * @return
	 */
	public static int fact(int x){
		if( x == 1){
			return 1;
		}else {
			return x * fact(x - 1);
		}
	}
}
