package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Table;
import me.ahmedbargady.jinafood.service.TableService;

@RestController
@CrossOrigin(origins = "https://jinafood.vercel.app")
@RequestMapping("/api/v1/table")
public class TableController {

    private final TableService tableService;

    public TableService getTableService() {
        return tableService;
    }

    public TableController(TableService tableService) {
        super();
        this.tableService = tableService;
    }

    @GetMapping("/id/{id}")
    public Optional<Table> get(@PathVariable String id) {
        return tableService.get(id);
    }

    @GetMapping
    public List<Table> getall() {
        return tableService.getall();
    }

    @PostMapping("/add")
    public Table add(@RequestBody Table p) {
        return tableService.add(p);
    }

    @PostMapping("/update")
    public Table update(@RequestBody Table p) {
        return tableService.update(p);
    }

    @GetMapping("/delete/{id}")
    public String delelte(@PathVariable String id) {
        return tableService.delete(id);
    }

}
