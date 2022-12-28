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
	public List<SweetPotato> filter(Predicate<SweetPotato> filters) {
		return sweetPotatoRepository.filter(filters);
	}

	

}
