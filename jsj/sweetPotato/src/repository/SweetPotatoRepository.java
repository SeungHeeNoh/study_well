package repository;

import java.util.List;

import vo.SweetPotato;

public interface SweetPotatoRepository {

	List<SweetPotato> filter(Predicate<SweetPotato> predicate);
	
}
