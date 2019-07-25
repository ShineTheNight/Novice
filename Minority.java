import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Minority  {

	public int minor(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
			for(int i = 0; i<arr.length; i++) {
				if(map.containsKey(arr[i])) {
					map.replace(arr[i], map.get(arr[i])+1);
				}
				else map.put(arr[i], 1);
			}
			int Unpopular = Integer.MAX_VALUE;
			for(int x: map.keySet()) {
				if(map.get(x)<Unpopular) 
					Unpopular = x;
							}
			return Unpopular;
	}

}
