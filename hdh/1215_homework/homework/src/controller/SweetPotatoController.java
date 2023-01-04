package controller;

import java.util.List;

import service.SweetPotatoService;
import service.SweetPotatoServiceImpl;
import vo.Vegetable;

public class SweetPotatoController {
	private final SweetPotatoService SweetPotatoService;
	
	public SweetPotatoController() {
		SweetPotatoService = new SweetPotatoServiceImpl();
	}

	public List<? extends Vegetable> filterByType(String group, String type, boolean isSame) {
		return SweetPotatoService.filterByType(group, type, isSame);
	}

	public List<? extends Vegetable> filterGreaterThan(String group, int weight) {
		return SweetPotatoService.filterGreaterThan(group, weight);
	}
	
	public List<? extends Vegetable> filterByLessThan(String group, int weight) {
		return SweetPotatoService.filterByLessThan(group, weight);
	}
	
	public List<? extends Vegetable> filterGreaterThanAndType(String group, int weight, String type) {
		return SweetPotatoService.filterGreaterThanAndType(group, weight, type);
	}

	public List<? extends Vegetable> filterOrigin(String group, String origin) {
		return SweetPotatoService.filterOrigin(group, origin);
	}
	
}
