package algorithm.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 广度优先搜索
 * @author yixl
 *
 */
public class BreadthFirstSearch {

	public static void main(String[] args){
		Map<String,List<String>> graph = new HashMap<String,List<String>>();
		
		List<String> you = new ArrayList<String>();
		you.add("alice");
		you.add("bob");
		you.add("claire");
		graph.put("you", you);
		
		List<String> bob = new ArrayList<String>();
		bob.add("anuj");
		bob.add("peggy");
		graph.put("bob", bob);
		
		List<String> alice = new ArrayList<String>();
		alice.add("peggy");
		graph.put("alice", alice);
		
		List<String> claire = new ArrayList<String>();
		claire.add("thom");
		claire.add("jonny");
		graph.put("claire", claire);
		
		search("you", graph);
	}
	
	/**
	 * 搜索
	 * @param name 人名
	 * @param graph 将图用map表示
	 */
	private static void search(String name,Map<String,List<String>> graph){
		//将带搜索的人加入队列
		List<String> searchQueue = new ArrayList<String>();
		List<String> searched = new ArrayList<String>();
		
		searchQueue.addAll(graph.get(name));
		
		String personName = null;
		for(int i = 0; i < searchQueue.size(); i++){
			personName = searchQueue.get(i);
			
			//排除重复检查的情况，防止死循环
			if(!searched.contains(personName)){
				if(personIsSeller(personName)){
					System.out.println("找到芒果商，姓名：" + personName);
					return;
				}else{
					if(null != graph.get(personName)){
						searchQueue.addAll(graph.get(personName));
					}
					searched.add(personName);
				}
			}
		}
		
	}
	
	/**
	 * 判断是否芒果商(以m结尾就是)
	 * @param name
	 * @return
	 */
	private static boolean personIsSeller(String name){
		if(name.endsWith("m")){
			return true;
		}
		return false;
	}
}
