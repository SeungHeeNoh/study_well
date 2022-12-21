package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public class SweetPotatoRepositoryImpl implements SweetPotatoRepository {
	
	private List<SweetPotato> SweetPotatoField;
	
	public SweetPotatoRepositoryImpl() {
		SweetPotatoField = new ArrayList<>();
		SweetPotatoField.add(new SweetPotato("밤고구마", 600));
		SweetPotatoField.add(new SweetPotato("호박고구마", 580));
		SweetPotatoField.add(new SweetPotato("밤고구마", 150));
		SweetPotatoField.add(new SweetPotato("밤고구마", 333));
		SweetPotatoField.add(new SweetPotato("호박고구마", 320));
		SweetPotatoField.add(new SweetPotato("호박고구마", 610));
	}

	/* 오늘은 고구마 판매점 네번째 출근날!!!
	 * 오늘 업무로 특정 무게 초과이면서 특정 타입인 고구마만 골라내는 로직 개발 업무를 받았다.
	 * 
	 * 음 이건 위에 메소드랑 첫 번째 메소드랑 섞인 그런 함수인데... 이래도 되는건가...?
	 */
	@Override
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		List<SweetPotato> resultList = new ArrayList<SweetPotato>();

		for (SweetPotato sweetPotato : SweetPotatoField) {
			if (sweetPotato.getWeight() > weight && sweetPotato.getType().equals(type)) {
				resultList.add(sweetPotato);
			}
		}

		return resultList;
	}

	/* 오늘은 고구마 판매점 다섯번 째 출근날!!!
	 * 오늘은... 특정 무게 이하이면서 특정 타입인 고구마만 골라내는 로직 개발 업무를 받았다.
	 * 
	 * 
	 * 음.. 안되겠다. 이건 DRY원칙을 어기는 거니까 리팩토링해서 반복되는 코드를 해결해보자!
	 */

	@Override
	public List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate) {
		List<SweetPotato> resultList = new ArrayList<>();

		for (SweetPotato sweetPotato : SweetPotatoField) {
			if (predicate.test(sweetPotato)) {
				resultList.add(sweetPotato);
			}
		}

		return resultList;
	}
}
