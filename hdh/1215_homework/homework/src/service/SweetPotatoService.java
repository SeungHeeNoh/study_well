package service;

import java.util.List;
import vo.Vegetable;

public interface SweetPotatoService {

	List<? extends Vegetable> filterByType(String group, String type, boolean isSame);

	List<? extends Vegetable> filterGreaterThan(String group, int weight);

	List<? extends Vegetable> filterByLessThan(String group, int weight);

	List<? extends Vegetable> filterGreaterThanAndType(String group, int weight, String type);

	List<? extends Vegetable> filterOrigin(String group, String origin);
	
}
