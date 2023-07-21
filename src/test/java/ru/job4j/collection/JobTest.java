package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenAscByName() {
        Comparator<Job> cmpAscName = new JobSortByName();
        int rsl = cmpAscName.compare(new Job("Alex", 21),
                new Job("Sergey", 20));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(new Job("Alex", 21),
                new Job("Sergey", 20));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenJobDownPriority() {
        Job jobs1 = new Job("Владимир", 1);
        Job jobs2 = new Job("Анна", 4);
        Job jobs3 = new Job("Генадий", 7);
        List<Job> list = new ArrayList<>();
        list.add(jobs1);
        list.add(jobs2);
        list.add(jobs3);
        Collections.sort(list, new JobDescByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(jobs3);
        expected.add(jobs2);
        expected.add(jobs1);
        assertThat(list).containsSequence(expected);
    }

    @Test
    public void whenJobUpPriority() {
        Job jobs1 = new Job("Владимир", 9);
        Job jobs2 = new Job("Анна", 4);
        Job jobs3 = new Job("Генадий", 7);
        List<Job> list = new ArrayList<>();
        list.add(jobs1);
        list.add(jobs2);
        list.add(jobs3);
        Collections.sort(list, new JobSortByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(jobs2);
        expected.add(jobs3);
        expected.add(jobs1);
        assertThat(list).containsSequence(expected);
    }

    @Test
    public void whenUpNameOrUpPriority() {
        Comparator<Job> comb = new JobSortByName().thenComparing(new JobSortByPriority());
        int rsl = comb.compare(
                new Job("Alla", 1),
                new Job("Alla", 4)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDownNameOrDownPriority() {
        Comparator<Job> comb = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = comb.compare(
                new Job("Alla", 3),
                new Job("Alla", 6)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
