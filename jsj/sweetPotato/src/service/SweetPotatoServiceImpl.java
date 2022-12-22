package service;

import java.util.List;

import repository.SweetPotatoRepository;
import repository.SweetPotatoRepositoryImpl;
import vo.SweetPotato;

public class SweetPotatoServiceImpl implements SweetPotatoService {
    private final SweetPotatoRepository sweetPotatoRepository;

    public SweetPotatoServiceImpl() {
        sweetPotatoRepository = new SweetPotatoRepositoryImpl();
    }

    @Override
    public List<SweetPotato> filterByType(String type) {
        return sweetPotatoRepository.filter(sweetPotato -> type.equals(sweetPotato.getType()));
    }

    @Override
    public List<SweetPotato> filterGreaterThan(int weight) {
        return sweetPotatoRepository.filter(sweetPotato -> sweetPotato.getWeight() > weight);
    }

    @Override
    public List<SweetPotato> filterByLessThan(int weight) {
        return sweetPotatoRepository.filter(sweetPotato -> sweetPotato.getWeight() < weight);
    }

    @Override
    public List<SweetPotato> filterGreaterThanAndType(int weight, String type) {
        return sweetPotatoRepository
                .filter(sweetPotato -> sweetPotato.getWeight() > weight && sweetPotato.getType().equals(type));
    }

}
