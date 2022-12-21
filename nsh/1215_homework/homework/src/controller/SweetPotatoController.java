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
		return SweetPotatoService.filterSweetPotatos((SweetPotato sweetPotato) -> type.equals(sweetPotato.getType()));
	}

	public List<SweetPotato> filterGreaterThan(int weight) {
		return SweetPotatoService.filterSweetPotatos((SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight);
	}
	
	public List<SweetPotato> filterByLessThan(int weight) {
		return SweetPotatoService.filterSweetPotatos((SweetPotato sweetPotato) -> sweetPotato.getWeight() < weight);
	}
	
	public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
		return SweetPotatoService.filterSweetPotatos((SweetPotato sweetPotato) -> sweetPotato.getWeight() > weight && type.equals(sweetPotato.getType()));
	}
}
