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

	@Override
    public List<SweetPotato> filter(Predicate<SweetPotato> predicate) {
        List<SweetPotato> resultList = new ArrayList<SweetPotato>();
        
        for (SweetPotato sweetPotato : SweetPotatoField) {
            if (predicate.test(sweetPotato)) {
                resultList.add(sweetPotato);
            }
        }
        return resultList;
    }
}
