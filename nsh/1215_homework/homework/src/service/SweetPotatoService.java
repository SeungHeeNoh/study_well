package service;

import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public interface SweetPotatoService {

	List<SweetPotato> filterGreaterThan(int weight);

	List<SweetPotato> filterByLessThan(int weight);

	List<SweetPotato> filterGreaterThanAndType(int weight, String type);

	List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate);
}
