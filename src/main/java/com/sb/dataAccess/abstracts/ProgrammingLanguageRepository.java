package com.sb.dataAccess.abstracts;

import com.sb.entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id) throws Exception;

    void create(ProgrammingLanguage programmingLanguage) throws Exception;

    ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) throws Exception;

    ProgrammingLanguage delete(int id) throws Exception;

}
