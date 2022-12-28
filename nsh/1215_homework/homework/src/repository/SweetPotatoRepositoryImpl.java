package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public class SweetPotatoRepositoryImpl implements SweetPotatoRepository {
	
	private List<SweetPotato> sweetPotatoField;
	private List<Potato> potatoField;
	
	public SweetPotatoRepositoryImpl() {
		sweetPotatoField = new ArrayList<>();
		sweetPotatoField.add(new SweetPotato("밤고구마", 600));
		sweetPotatoField.add(new SweetPotato("호박고구마", 580));
		sweetPotatoField.add(new SweetPotato("밤고구마", 150));
		sweetPotatoField.add(new SweetPotato("밤고구마", 333));
		sweetPotatoField.add(new SweetPotato("호박고구마", 320));
		sweetPotatoField.add(new SweetPotato("호박고구마", 610));

		potatoField = new ArrayList<>();
		potatoField.add(new Potato("봄감자", 200, "경기 여주"));
		potatoField.add(new Potato("봄감자", 580, "전북 김제"));
		potatoField.add(new Potato("봄감자", 150, "전남 보성"));
		potatoField.add(new Potato("봄감자", 333, "경남 밀양"));
		potatoField.add(new Potato("고랭지 감자", 320, "강원도 평창"));
		potatoField.add(new Potato("가을 감자", 610, "제주"));
	}

	@Override
	public List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate) {
		List<SweetPotato> resultList = new ArrayList<>();

		for (SweetPotato sweetPotato : sweetPotatoField) {
			if (predicate.test(sweetPotato)) {
				resultList.add(sweetPotato);
			}
		}

		return resultList;
	}
}
