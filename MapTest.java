import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//TreeMap() : 자동오름차순 정렬
		NavigableMap <String, String> map = new TreeMap<>();
		map.put("다", "3");
		map.put("바", "6");
		map.put("가", "1");
		map.put("라", "4");
		map.put("마", "5");
		map.put("나", "2");
		
		//오름차순 정렬(asc)
		map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		map.entrySet().forEach(x->System.out.println(x));
		map.forEach((x,y)->System.out.println(x+"="+y));
		
		//내림차순 정렬(desc)
		map.descendingKeySet().forEach(x->System.out.println(x+"="+map.get(x)));
		map.descendingMap().forEach((x,y)->System.out.println(x+"="+y));
		
		//일부분 추출
		map.subMap("다", "마").forEach((x,y)->System.out.println(x+"="+y));	//'다=3'에서 '마=5' 전 까지 추출 (다=3,라=5)
		map.subMap("다",true,"마",true).forEach((x,y)->System.out.println(x+"="+y)); //'다=3'에서 '마=5'까지 추출 (다=3,라=5,마=6)
		map.headMap("라").forEach((x,y)->System.out.println(x+"="+y)); //'라=4' 이전 요소 추출(가=1,나=2,다=3)
		map.headMap("라",true).forEach((x,y)->System.out.println(x+"="+y)); //이전부터 '라=4'까지 요소 추출(가=1,나=2,다=3,라=4)
		map.tailMap("마").forEach((x,y)->System.out.println(x+"="+y)); //'마=5'이전 요소 추출(가=1,나=2,다=3,라=4)
	}

}
