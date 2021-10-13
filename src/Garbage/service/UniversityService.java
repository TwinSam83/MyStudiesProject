package Garbage.service;

import Garbage.entity.Group;
import Garbage.entity.University;
import Garbage.repository.Storage;

import java.util.List;

public interface UniversityService {
    void addUniversity(University university, Storage storage);

    void removeUniversity(String name, Storage storage);

    List<University> findAllUniversities(Storage storage);

    University findByName(String name, Storage storage);

    void addGroupToUniversity(Group group, String name, Storage storage);

    void removeGroup(int id, String name, Storage storage);
}
