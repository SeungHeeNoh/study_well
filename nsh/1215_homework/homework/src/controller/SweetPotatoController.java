package controller;

import java.util.List;

import service.HardyPlantService;
import service.HardyPlantServiceImpl;
import vo.SweetPotato;

public class SweetPotatoController {
	private final HardyPlantService hardyPlantService;
	
	public SweetPotatoController() {
		hardyPlantService = new HardyPlantServiceImpl();
	}

	public List<SweetPotato> filterByType(List<SweetPotato> field, String type) {
		return hardyPlantService.filter(field, (SweetPotato sweetPotato) -> type.equals(sweetPotato.getType()));
	}

	public List<SweetPotato> filterByWeightGreaterThan(List<SweetPotato> field, int weight) {
		return hardyPlantService.filter(field, (SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight);
	}
	
	public List<SweetPotato> filterByLessThan(List<SweetPotato> field, int weight) {
		return hardyPlantService.filter(field, (SweetPotato sweetPotato) -> sweetPotato.getWeight() < weight);
	}
	
	public List<SweetPotato> filterByWeightGreaterThanAndType(List<SweetPotato> field, int weight, String type) {
		return hardyPlantService.filter(field, (SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight && type.equals(sweetPotato.getType()));
	}
}
