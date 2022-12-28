package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public class SweetPotatoRepositoryImpl implements SweetPotatoRepository {
	
	private List<SweetPotato> SweetPotatoField;
	
	public SweetPotatoRepositoryImpl() {
		SweetPotatoField = new ArrayList<>();
		SweetPotatoField.add(new SweetPotato("밤고구마", 600));
		SweetPotatoField.add(new SweetPotato("호박고구마", 580));
		SweetPotatoField.add(new SweetPotato("밤고구마", 150));
		SweetPotatoField.add(new SweetPotato("밤고구마", 333));
		SweetPotatoField.add(new SweetPotato("호박고구마", 320));
		SweetPotatoField.add(new SweetPotato("호박고구마", 610));
	}
	
	public List<SweetPotato> filter(Predicate<SweetPotato> filters) {
		List<SweetPotato> result = new ArrayList<SweetPotato>();
		for(SweetPotato sweetPotato : SweetPotatoField) {
			if (filters.test(sweetPotato)) {
				result.add(sweetPotato);
			}
		}
		return result;
		
	}
	
}
