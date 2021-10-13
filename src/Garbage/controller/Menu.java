package Garbage.controller;

import Garbage.repository.Storage;
import Garbage.service.GroupService;
import Garbage.service.StudentService;
import Garbage.service.UniversityService;
import Garbage.service.impl.GroupServiceImpl;
import Garbage.service.impl.StudentServiceImpl;
import Garbage.service.impl.UniversityGroupImpl;

public class Menu {
    public static void menu() {
        Storage storage = new Storage();
        StudentService studentService = new StudentServiceImpl();
        GroupService groupService = new GroupServiceImpl();
        UniversityService universityService = new UniversityGroupImpl();
        int i = 0;
        System.out.println("1 - ....");
        System.out.println("2 - ....");
        System.out.println("3 - ....");
        System.out.println("4 - ....");
        System.out.println("5 - ....");
        System.out.println("6 - ....");
        System.out.println("7 - ....");
        System.out.println("8 - ....");
        switch (i) {
            case 5 :
                universityService.removeGroup(4, "BSUIR", storage);
        }
    }
}
