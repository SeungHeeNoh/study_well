package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public class SweetPotatoRepositoryImpl implements SweetPotatoRepository {
	
	private List<SweetPotato> sweetPotatoField;
	
	public SweetPotatoRepositoryImpl() {
		sweetPotatoField = new ArrayList<>();
		sweetPotatoField.add(new SweetPotato("밤고구마", 600));
		sweetPotatoField.add(new SweetPotato("호박고구마", 580));
		sweetPotatoField.add(new SweetPotato("밤고구마", 150));
		sweetPotatoField.add(new SweetPotato("밤고구마", 333));
		sweetPotatoField.add(new SweetPotato("호박고구마", 320));
		sweetPotatoField.add(new SweetPotato("호박고구마", 610));
	}

	@Override
	public List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate) {
		List<SweetPotato> resultList = new ArrayList<>();

		for (SweetPotato sweetPotato : sweetPotatoField) {
			if (predicate.test(sweetPotato)) {
				resultList.add(sweetPotato);
			}
		}

		return resultList;
	}
}
