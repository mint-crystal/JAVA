package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaExam {

	public static void main(String[] args) {
		String foods[] = {"파", "양파", "보리", "콩", "오징어", "고등어", "밀", "삼치", "귀리", "광어"};
		String seaFoods[] = {"오징어", "멸치", "광어", "삼치", "가자미", "우럭", "꽁치", "문어", "고등어"};
		String grains[] = {"쌀", "보리", "밀", "귀리", "콩", "팥", "수수", "조", "기장"};
		
		List<String> foodList = Arrays.asList(foods);
		List<String> seaFoodList = Arrays.asList(seaFoods);
		List<String> grainList = Arrays.asList(grains);
		
		foodList.stream()
						//.filter(e->seaFoodList.contains(e))	//해상물 추출
						//.filter(e->!seaFoodList.contains(e))	//비 해산물 추출
						.filter(e->grainList.contains(e))		//곡류 추출
						//.filter(e->!grainList.contains(e))	//비 곡류 추출
						.collect(Collectors.groupingBy(x->seaFoodList.contains(x)))
						.get(false)
						.stream()
						.sorted()
						//.anyMatch(e->!grantList.contains(e))
						//.forEach(x->System.out.println(x));
						.forEach(System.out::println);
	}

}
