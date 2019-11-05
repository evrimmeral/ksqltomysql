package com.ksqltomysql.iopsksqltomysql.controller;

import com.ksqltomysql.iopsksqltomysql.entity.FiveMinutesAggData;
import com.ksqltomysql.iopsksqltomysql.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ksqltomysql.iopsksqltomysql.repository.FiveMinutesAggDataRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AggDataController {
    @Autowired
    private FiveMinutesAggDataRepository fiveMinutesAggDataRepository;

    @GetMapping("/aggData")
    public List<FiveMinutesAggData> getAllNotes() {
        return fiveMinutesAggDataRepository.findAll();
    }

    @PostMapping("/aggData")
    public FiveMinutesAggData createNote(@Valid @RequestBody FiveMinutesAggData note) {
        return fiveMinutesAggDataRepository.save(note);
    }

    @GetMapping("/aggData/{id}")
    public FiveMinutesAggData getNoteById(@PathVariable(value = "id") Long aggDataId) {
        return fiveMinutesAggDataRepository.findById(aggDataId)
                .orElseThrow(() -> new ResourceNotFoundException("AggData", "id", aggDataId));
    }


}
