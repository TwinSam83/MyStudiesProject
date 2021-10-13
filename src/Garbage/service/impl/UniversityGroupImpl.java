package Garbage.service.impl;

import Garbage.entity.Group;
import Garbage.entity.University;
import Garbage.repository.Storage;
import Garbage.service.UniversityService;

import java.util.ArrayList;
import java.util.List;

public class UniversityGroupImpl implements UniversityService {

    @Override
    public void addUniversity(University university, Storage storage) {

    }

    @Override
    public void removeUniversity(String name, Storage storage) {
        if (name != null && !name.isEmpty()) {
            List<University> universityList = storage.getUniversityList();
            if (universityList != null && !universityList.isEmpty()) {
                for (University university : universityList) {
                    if (university.getName().equalsIgnoreCase(name)) {
                        universityList.remove(university);
                        System.out.println("Успешно удален");
                        break;
                    }
                }
            } else {
                System.out.println("Список университетов пуст");
            }
        } else {
            System.out.println("Название университета пустое");
        }
    }

    @Override
    public List<University> findAllUniversities(Storage storage) {
        List<University> universityList = storage.getUniversityList();
        if (universityList != null && !universityList.isEmpty()) {
            return universityList;
        }
        System.out.println("Список университетов пуст");
        return null;
    }

    @Override
    public University findByName(String name, Storage storage) {
        if (name != null && !name.isEmpty()) {
            List<University> universityList = storage.getUniversityList();
            if (universityList != null && !universityList.isEmpty()) {
                for (University university : universityList) {
                    if (university.getName().equals(name)) {
                        return university;
                    }
                }
            } else {
                System.out.println("Пустой список");
            }
        } else {
            System.out.println("Неправильное имя");
        }
        return null;
    }

    @Override
    public void addGroupToUniversity(Group group, String name, Storage storage) {
        if (name != null && !name.isEmpty()) {
            if (group != null) {
                List<University> universityList = storage.getUniversityList();
                if (universityList != null && !universityList.isEmpty()) {
                    for (University universityIt : universityList) {
                        if (universityIt.getName().equals(name)) {
                            List<Group> groupList = universityIt.getGroupList();
                            if (groupList == null) {
                                groupList = new ArrayList<>();
                            }
                            groupList.add(group);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void removeGroup(int id, String name, Storage storage) {
        if (id > 0) {
            if (name != null && !name.isEmpty()) {
                List<University> universityList = storage.getUniversityList();
                if (universityList != null && !universityList.isEmpty()) {
                    for (University university : universityList) {
                        if (university.getName().equals(name)) {
                            List<Group> groupList = university.getGroupList();
                            if (groupList == null || groupList.isEmpty()) {
                                return;
                            }
                            for (Group group : groupList) {
                                if (group.getId() == id) {
                                    university.getGroupList().remove(group);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
