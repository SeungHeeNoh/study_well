package controller;

import java.util.List;

import vo.Potato;

public interface HardyPlantController {
	public <T> List<T> filterByType(List<T> field, String type);
}
