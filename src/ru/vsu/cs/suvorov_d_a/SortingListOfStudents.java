package ru.vsu.cs.suvorov_d_a;

import ru.vsu.cs.suvorov_d_a.utils.ListUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingListOfStudents {
    public static List<List<String>> sortList(List<List<String>> list) {
        List<StudentsProfile> studentsProfileList = toStudentsList(list);
        studentsProfileList.sort(Comparator.comparing(StudentsProfile::getCourse)
                .thenComparing(StudentsProfile::getGroup).thenComparing(StudentsProfile::getFullName));

        List<List<String>> sortedList = new ArrayList<>();

        for (StudentsProfile studentCase : studentsProfileList) {
            List<String> count = studentsToStringList(studentCase);
            sortedList.add(count);
        }
        return sortedList;
    }

    private static List<String> studentsToStringList(StudentsProfile studentsProfile) {
        String str = studentsProfile.toString();
        return ListUtils.toList(str);
    }

    private static List<StudentsProfile> toStudentsList(List<List<String>> list) {
        List<StudentsProfile> newList = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            newList.add(i, new StudentsProfile(list.get(i)));
        }
        return newList;
    }
}