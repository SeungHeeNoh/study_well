package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HardyPlantRepositoryImpl implements HardyPlantRepository {
	
	@Override
	public <T> List<T> filter(List<T> field, Predicate<T> predicate) {
		List<T> resultList = new ArrayList<>();

		for (T sweetPotato : field) {
			if (predicate.test(sweetPotato)) {
				resultList.add(sweetPotato);
			}
		}

		return resultList;
	}
}
