package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;
import java.io.FileNotFoundException;
import java.util.List;
import ru.vsu.cs.suvorov_d_a.utils.ListUtils;

public class TestOfSortingStudentsLists {

    @Test
    public void testSortingStudentsWithFullNamesA() throws FileNotFoundException {
        List<List<String>> testingInputList = ListUtils.loadStringList2FromFile("testSrc/testCase/testFullNameA.txt");
        List<List<String>> actualList = SortingListOfStudents.sortList(testingInputList);
        List<List<String>> correctOutputList = ListUtils.loadStringList2FromFile("testSrc/testResult/answerFullNameA.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testSortingStudentsWithFullNamesB() throws FileNotFoundException {
        List<List<String>> testingInputList = ListUtils.loadStringList2FromFile("testSrc/testCase/testFullNameB.txt");
        List<List<String>> actualList = SortingListOfStudents.sortList(testingInputList);
        List<List<String>> correctOutputList = ListUtils.loadStringList2FromFile("testSrc/testResult/answerFullNameB.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testSortingStudentsWithTheSameCourses() throws FileNotFoundException {
        List<List<String>> testingInputList = ListUtils.loadStringList2FromFile("testSrc/testCase/testSameCourses.txt");
        List<List<String>> actualList = SortingListOfStudents.sortList(testingInputList);
        List<List<String>> correctOutputList = ListUtils.loadStringList2FromFile("testSrc/testResult/answerSameCourses.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testSortingStudentsWithTheSameGroups() throws FileNotFoundException {
        List<List<String>> testingInputList = ListUtils.loadStringList2FromFile("testSrc/testCase/testSameGroups.txt");
        List<List<String>> actualList = SortingListOfStudents.sortList(testingInputList);
        List<List<String>> correctOutputList = ListUtils.loadStringList2FromFile("testSrc/testResult/answerSameGroups.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }

    @Test
    public void testSortingStudentsWithTheSameGroupsAndCourses() throws FileNotFoundException {
        List<List<String>> testingInputList = ListUtils.loadStringList2FromFile("testSrc/testCase/testSameGroupsAndCourses.txt");
        List<List<String>> actualList = SortingListOfStudents.sortList(testingInputList);
        List<List<String>> correctOutputList = ListUtils.loadStringList2FromFile("testSrc/testResult/answerSameGroupsAndCourses.txt");

        Assert.assertEquals(correctOutputList, actualList);
    }
}