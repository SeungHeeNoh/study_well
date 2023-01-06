package repository;

import java.util.List;
import java.util.function.Predicate;
import vo.Vegetable;

public interface SweetPotatoRepository {

	List<? extends Vegetable> filter(String group, Predicate<Vegetable> predicate);
	
}
