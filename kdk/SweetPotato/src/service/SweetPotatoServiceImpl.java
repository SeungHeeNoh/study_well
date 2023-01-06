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
		return sweetPotatoRepository.filterByType(type);
	}

	@Override
	public List<SweetPotato> filterGreaterThan(int weight) {
		return sweetPotatoRepository.filterGreaterThan(weight);
	}

	@Override
	public List<SweetPotato> filterByLessThan(int weight) {
		return sweetPotatoRepository.filterByLessThan(weight);
	}

	@Override
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		return sweetPotatoRepository.filterGreaterThanAndType(weight, type);
	}

	@Override
	public <T> List<T> filter(Class<T> cls, Predicate<T> p) {
		return sweetPotatoRepository.filter(cls, p);
	}

}
