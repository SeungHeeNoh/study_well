package controller;

import java.util.List;

import service.HardyPlantService;
import service.HardyPlantServiceImpl;
import vo.Potato;

public class PotatoController {
	private final HardyPlantService hardyPlantService;
	
	public PotatoController() {
		hardyPlantService = new HardyPlantServiceImpl();
	}

	public List<Potato> filterByType(List<Potato> field, String type) {
		return hardyPlantService.filter(field, (Potato potato) -> type.equals(potato.getType()));
	}

	public List<Potato> filterByWeightGreaterThan(List<Potato> field, int weight) {
		return hardyPlantService.filter(field, (Potato potato) -> potato.getWeight() >= weight);
	}

	public List<Potato> filterByOrigin(List<Potato> field, String origin) {
		return hardyPlantService.filter(field, (Potato potato) -> origin.equals(potato.getOrigin()));
	}

	public List<Potato> filterByNotType(List<Potato> field, String type) {
		return hardyPlantService.filter(field, (Potato potato) -> !type.equals(potato.getType()));
	}
}
