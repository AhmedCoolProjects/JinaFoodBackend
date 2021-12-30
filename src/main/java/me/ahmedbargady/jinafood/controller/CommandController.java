package me.ahmedbargady.jinafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.ahmedbargady.jinafood.model.Command;
import me.ahmedbargady.jinafood.service.CommandService;

@RestController

@RequestMapping("/api/v1/command")
public class CommandController {

    private final CommandService commandService;

    public CommandService getCommandService() {
        return commandService;
    }

    public CommandController(CommandService commandService) {
        super();
        this.commandService = commandService;
    }

    @GetMapping("/id/{id}")
    public Optional<Command> get(@PathVariable String id) {
        return commandService.get(id);
    }

    @GetMapping
    public List<Command> getall() {
        return commandService.getall();
    }

    @PostMapping("/add")
    public Command add(@RequestBody Command c) {
        return commandService.add(c);
    }

    @PostMapping("/update")
    public Command update(@RequestBody Command c) {
        return commandService.update(c);
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return commandService.delete(id);
    }

}
