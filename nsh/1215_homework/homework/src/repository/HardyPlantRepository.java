package repository;

import java.util.List;
import java.util.function.Predicate;

public interface HardyPlantRepository {

	<T> List<T> filter(List<T> field, Predicate<T> predicate);
}
