package service;

import java.util.List;
import java.util.function.Predicate;

import vo.SweetPotato;

public interface SweetPotatoService {

	List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate);
}
