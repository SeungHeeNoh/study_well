package controller;

import java.util.List;

import service.SweetPotatoService;
import service.SweetPotatoServiceImpl;
import vo.SweetPotato;

public class SweetPotatoController {
	private final SweetPotatoService SweetPotatoService;
	
	public SweetPotatoController() {
		SweetPotatoService = new SweetPotatoServiceImpl();
	}

	public List<SweetPotato> filterByType(String type) {
		return SweetPotatoService.filterByType(type);
	}

	public List<SweetPotato> filterGreaterThan(int weight) {
		return SweetPotatoService.filterGreaterThan(weight);
	}
	
	public List<SweetPotato> filterByLessThan(int weight) {
		return SweetPotatoService.filterByLessThan(weight);
	}
	
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		return SweetPotatoService.filterGreaterThanAndType(weight, type);
	}
}
