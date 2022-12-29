package repository;

import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public interface SweetPotatoRepository {

	List<SweetPotato> filterByType(String type);

	List<SweetPotato> filterGreaterThan(int weight);

	List<SweetPotato> filterByLessThan(int weight);

	List<SweetPotato> filterGreaterThanAndType(int weight, String type);

	List<SweetPotato> filter(Predicate<SweetPotato> p);
}
