package service;

import java.util.List;
import java.util.function.Predicate;

import repository.SweetPotatoRepository;
import repository.SweetPotatoRepositoryImpl;
import vo.SweetPotato;

public class SweetPotatoServiceImpl implements SweetPotatoService {
	private final SweetPotatoRepository sweetPotatoRepository;
	
	public SweetPotatoServiceImpl() {
		sweetPotatoRepository = new SweetPotatoRepositoryImpl();
	}

	@Override
	public List<SweetPotato> filterByType(String type) {
		Predicate<SweetPotato> sameType = (sweetPotato) -> sweetPotato.getType().equals(type);
		return sweetPotatoRepository.filter(sameType);
	}

	@Override
	public List<SweetPotato> filterGreaterThan(int weight) {
		Predicate<SweetPotato> greaterThan = (sweetPotato) -> sweetPotato.getWeight() > weight;
		return sweetPotatoRepository.filter(greaterThan);
	}

	@Override
	public List<SweetPotato> filterByLessThan(int weight) {
		Predicate<SweetPotato> lessThan = (sweetPotato) -> sweetPotato.getWeight() < weight;
		return sweetPotatoRepository.filter(lessThan);
	}

	@Override
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		Predicate<SweetPotato> greaterThan = (sweetPotato) -> sweetPotato.getWeight() > weight;
		Predicate<SweetPotato> greaterThanAndSameType = greaterThan.and((sweetPotato) -> sweetPotato.getType().equals(type));
		return sweetPotatoRepository.filter(greaterThanAndSameType);
	}

	

}
