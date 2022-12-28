package controller;

import java.util.List;
import java.util.function.Predicate;

import service.SweetPotatoService;
import service.SweetPotatoServiceImpl;
import vo.SweetPotato;

public class SweetPotatoController {
	private final SweetPotatoService SweetPotatoService;
	
	public SweetPotatoController() {
		SweetPotatoService = new SweetPotatoServiceImpl();
	}
	
	public List<SweetPotato> filter(Predicate<SweetPotato> filters) {
		return SweetPotatoService.filter(filters);
	}
}
