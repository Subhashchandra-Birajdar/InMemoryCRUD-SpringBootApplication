package com.sb.business.abstracts;

import com.sb.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id) throws Exception;

    void create(ProgrammingLanguage programmingLanguage) throws Exception;

    ProgrammingLanguage update(ProgrammingLanguage programmingLanguage)throws Exception;

    ProgrammingLanguage delete(int id) throws Exception;

}
