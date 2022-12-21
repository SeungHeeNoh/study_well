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
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		return sweetPotatoRepository.filterGreaterThanAndType(weight, type);
	}

	@Override
	public List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate) {
		return sweetPotatoRepository.filterSweetPotatos(predicate);
	}

}
