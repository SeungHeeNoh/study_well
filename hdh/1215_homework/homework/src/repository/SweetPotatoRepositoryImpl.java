package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import vo.Potato;
import vo.SweetPotato;
import vo.Vegetable;

public class SweetPotatoRepositoryImpl implements SweetPotatoRepository {
	
	private List<Vegetable> vegetableField;
	
	public SweetPotatoRepositoryImpl() {
		vegetableField = new ArrayList<>();
		vegetableField.add(new SweetPotato("고구마", "밤고구마", 600));
		vegetableField.add(new SweetPotato("고구마", "호박고구마", 580));
		vegetableField.add(new SweetPotato("고구마", "밤고구마", 150));
		vegetableField.add(new SweetPotato("고구마", "밤고구마", 333));
		vegetableField.add(new SweetPotato("고구마", "호박고구마", 320));
		vegetableField.add(new SweetPotato("고구마", "호박고구마", 610));

		vegetableField.add(new Potato("감자", "봄감자", 200, "경기 여주"));
		vegetableField.add(new Potato("감자", "봄감자", 580, "전북 김제"));
		vegetableField.add(new Potato("감자", "봄감자", 150, "전남 보성"));
		vegetableField.add(new Potato("감자", "봄감자", 333, "경남 밀양"));
		vegetableField.add(new Potato("감자", "고랭지 감자", 320, "강원도 평창"));
		vegetableField.add(new Potato("감자", "가을 감자", 610, "제주"));
	}

	@Override
	public List<? extends Vegetable> filter(String group, Predicate<Vegetable> predicate) {
		Predicate<Vegetable> groupPredicate = (vegetable) -> vegetable.getGroup().equals(group);
		return vegetableField.stream().filter(groupPredicate.and(predicate)).collect(Collectors.toList());
	}
	
}
