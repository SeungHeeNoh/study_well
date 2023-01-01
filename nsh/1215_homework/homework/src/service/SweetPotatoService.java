package service;

import java.util.List;
import java.util.function.Predicate;

import vo.Potato;
import vo.SweetPotato;

public interface SweetPotatoService {

	List<SweetPotato> filterSweetPotatos(Predicate<SweetPotato> predicate);

	List<Potato> filterPotatos(Predicate<Potato> predicate);
}
