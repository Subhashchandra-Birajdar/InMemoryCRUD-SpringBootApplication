package com.sb.wepApi.controllers;

import com.sb.business.abstracts.ProgrammingLanguageService;
import com.sb.entity.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        super();
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/getById{id}")
    public ProgrammingLanguage getById(@PathVariable int id) throws Exception {
        return programmingLanguageService.getById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.create(programmingLanguage);
    }

    @PutMapping("/update")
    public ProgrammingLanguage update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        return programmingLanguageService.update(programmingLanguage);
    }

    @DeleteMapping("/delete{id}")
    public ProgrammingLanguage delete(@PathVariable int id) throws Exception {
        return programmingLanguageService.delete(id);
    }

}
