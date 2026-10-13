package org.example.healthtracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class HealthLogController {

    @Autowired
    private HealthLogRepository repository;

    @PostMapping
    public HealtLog saveLog(@RequestBody HealtLog log) {
        return repository.save(log);
    }

    @GetMapping
    public List<HealtLog> getAllLogs() {
        return repository.findAll();
    }
}