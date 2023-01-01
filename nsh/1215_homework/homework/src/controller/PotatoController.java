package controller;

import java.util.List;

import service.SweetPotatoService;
import service.SweetPotatoServiceImpl;
import vo.Potato;

public class PotatoController {
	private final SweetPotatoService sweetPotatoService;
	
	public PotatoController() {
		sweetPotatoService = new SweetPotatoServiceImpl();
	}

	public List<Potato> filterByType(String type) {
		return sweetPotatoService.filterPotatos((Potato potato) -> type.equals(potato.getType()));
	}

	public List<Potato> filterGreaterThan(int weight) {
		return sweetPotatoService.filterPotatos((Potato potato) -> potato.getWeight() > weight);
	}
	
	public List<Potato> filterByLessThan(int weight) {
		return sweetPotatoService.filterPotatos((Potato potato) -> potato.getWeight() < weight);
	}
	
	public List<Potato> filterGreaterThanAndType(int weight, String type) {
		return sweetPotatoService.filterPotatos((Potato potato) -> potato.getWeight() > weight && type.equals(potato.getType()));
	}

	public List<Potato> filterByOrigin(String origin) {
		return sweetPotatoService.filterPotatos((Potato potato) -> origin.equals(potato.getOrigin()));
	}

	public List<Potato> filterByNotType(String type) {
		return sweetPotatoService.filterPotatos((Potato potato) -> !type.equals(potato.getType()));
	}
}
