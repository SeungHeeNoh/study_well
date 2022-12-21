package repository;

import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public interface SweetPotatoRepository {

	List<SweetPotato> filterByLessThan(int weight);

	List<SweetPotato> filterGreaterThanAndType(int weight, String type);

	List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate);
}
