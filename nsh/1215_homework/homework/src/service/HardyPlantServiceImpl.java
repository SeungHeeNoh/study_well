package service;

import java.util.List;
import java.util.function.Predicate;

import repository.HardyPlantRepository;
import repository.HardyPlantRepositoryImpl;

public class HardyPlantServiceImpl implements HardyPlantService {
	private final HardyPlantRepository hardyPlantRepository;
	
	public HardyPlantServiceImpl() {
		hardyPlantRepository = new HardyPlantRepositoryImpl();
	}

	@Override
	public <T> List<T> filter(List<T> field, Predicate<T> predicate) {
		return hardyPlantRepository.filter(field, predicate);
	}
}
