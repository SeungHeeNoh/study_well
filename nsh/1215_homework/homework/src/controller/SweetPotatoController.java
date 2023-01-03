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

	public List<SweetPotato> filterByType(List<SweetPotato> sweetPotatoField, String type) {
		return hardyPlantService.filter(sweetPotatoField, (SweetPotato sweetPotato) -> type.equals(sweetPotato.getType()));
	}

	public List<SweetPotato> filterGreaterThan(List<SweetPotato> sweetPotatoField, int weight) {
		return hardyPlantService.filter(sweetPotatoField, (SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight);
	}
	
	public List<SweetPotato> filterByLessThan(List<SweetPotato> sweetPotatoField, int weight) {
		return hardyPlantService.filter(sweetPotatoField, (SweetPotato sweetPotato) -> sweetPotato.getWeight() < weight);
	}
	
	public List<SweetPotato> filterGreaterThanAndType(List<SweetPotato> sweetPotatoField, int weight, String type) {
		return hardyPlantService.filter(sweetPotatoField, (SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight && type.equals(sweetPotato.getType()));
	}
}
