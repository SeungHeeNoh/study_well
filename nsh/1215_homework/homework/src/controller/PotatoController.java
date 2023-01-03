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

	public List<Potato> filterByType(List<Potato> sweetPotatoField, String type) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> type.equals(potato.getType()));
	}

	public List<Potato> filterGreaterThan(List<Potato> sweetPotatoField, int weight) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> potato.getWeight() > weight);
	}
	
	public List<Potato> filterByLessThan(List<Potato> sweetPotatoField, int weight) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> potato.getWeight() < weight);
	}
	
	public List<Potato> filterGreaterThanAndType(List<Potato> sweetPotatoField, int weight, String type) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> potato.getWeight() > weight && type.equals(potato.getType()));
	}

	public List<Potato> filterByOrigin(List<Potato> sweetPotatoField, String origin) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> origin.equals(potato.getOrigin()));
	}

	public List<Potato> filterByNotType(List<Potato> sweetPotatoField, String type) {
		return hardyPlantService.filter(sweetPotatoField, (Potato potato) -> !type.equals(potato.getType()));
	}
}
