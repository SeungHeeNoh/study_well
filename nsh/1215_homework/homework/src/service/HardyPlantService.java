package service;

import java.util.List;
import java.util.function.Predicate;

public interface HardyPlantService {
	<T> List<T> filter(List<T> field, Predicate<T> predicate);
}
