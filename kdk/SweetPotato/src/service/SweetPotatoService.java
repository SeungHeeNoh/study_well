package service;

import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public interface SweetPotatoService {

	List<SweetPotato> filterByType(String type);

	List<SweetPotato> filterGreaterThan(int weight);

	List<SweetPotato> filterByLessThan(int weight);

	List<SweetPotato> filterGreaterThanAndType(int weight, String type);

    <T> List<T> filter(Class<T> cls, Predicate<T> p);
	
}
