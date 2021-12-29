package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Table;
import me.ahmedbargady.jinafood.repository.TableRepository;

@Service
public class TableService {
    @Autowired
    private final TableRepository tableRepository;

    public TableRepository getTableRepository() {
        return tableRepository;
    }

    public Optional<Table> get(String id) {
        return tableRepository.findById(id);
    }

    public TableService(TableRepository tableRepository) {
        super();
        this.tableRepository = tableRepository;
    }

    public List<Table> getall() {
        return tableRepository.findAll();
    }

    public Table add(Table e) {
        return tableRepository.save(e);
    }

    public String delete(String id) {
        tableRepository.deleteById(id);
        return "Done";

    }
}
