package service;

import java.util.List;
import java.util.function.Predicate;

import repository.SweetPotatoRepository;
import repository.SweetPotatoRepositoryImpl;
import vo.SweetPotato;
import vo.Vegetable;

public class SweetPotatoServiceImpl implements SweetPotatoService {
	private final SweetPotatoRepository sweetPotatoRepository;
	
	public SweetPotatoServiceImpl() {
		sweetPotatoRepository = new SweetPotatoRepositoryImpl();
	}

	@Override
	public List<? extends Vegetable> filterByType(String group, String type, boolean isSame) {
		Predicate<Vegetable> sameType = (vegetable) -> vegetable.getType().equals(type);
		if (!isSame) {
			sameType = sameType.negate();
		}
		
		return sweetPotatoRepository.filter(group, sameType);
	}

	@Override
	public List<? extends Vegetable> filterGreaterThan(String group, int weight) {
		Predicate<Vegetable> greaterThan = (vegetable) -> vegetable.getWeight() > weight;
		return sweetPotatoRepository.filter(group, greaterThan);
	}

	@Override
	public List<? extends Vegetable> filterByLessThan(String group, int weight) {
		Predicate<Vegetable> lessThan = (vegetable) -> vegetable.getWeight() < weight;
		return sweetPotatoRepository.filter(group, lessThan);
	}

	@Override
	public List<? extends Vegetable> filterGreaterThanAndType(String group, int weight, String type) {
		Predicate<Vegetable> greaterThan = (vegetable) -> vegetable.getWeight() > weight;
		Predicate<Vegetable> greaterThanAndSameType = greaterThan.and((vegetable) -> vegetable.getType().equals(type));
		return sweetPotatoRepository.filter(group, greaterThanAndSameType);
	}

	@Override
	public List<? extends Vegetable> filterOrigin(String group, String origin) {
		Predicate<Vegetable> sameOrigin = (vegetable) -> vegetable.getOrigin().equals(origin);
		return sweetPotatoRepository.filter(group, sameOrigin);
	}	

}
