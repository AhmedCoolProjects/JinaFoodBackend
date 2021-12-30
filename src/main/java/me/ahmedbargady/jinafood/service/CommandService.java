package me.ahmedbargady.jinafood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.ahmedbargady.jinafood.model.Command;
import me.ahmedbargady.jinafood.repository.CommandRepository;

@Service
public class CommandService {

    @Autowired
    private final CommandRepository commandRepository;

    public CommandService(CommandRepository commandRepository) {
        super();
        this.commandRepository = commandRepository;

    }

    public Optional<Command> get(String id) {
        return commandRepository.findById(id);
    }

    public List<Command> getall() {
        return commandRepository.findAll();
    }

    public Command add(Command c) {
        return commandRepository.save(c);
    }

    public String delete(String id) {
        commandRepository.deleteById(id);
        return "Deleted";
    }

    public Command update(Command c) {
        return commandRepository.save(c);
    }

}
