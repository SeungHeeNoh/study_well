package repository;

import java.util.List;
import java.util.function.Predicate;
import vo.SweetPotato;

public interface SweetPotatoRepository {

	List<SweetPotato> filter(Predicate<SweetPotato> predicate);

}
