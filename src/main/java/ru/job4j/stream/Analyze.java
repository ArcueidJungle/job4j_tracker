package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(p -> p.subjects()
                        .stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(Double.NaN);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
            return stream.map(s -> new Tuple(s.name(),
                            s.subjects()
                            .stream()
                            .mapToInt(Subject::score)
                            .average()
                            .orElse(Double.NaN)))
                    .toList();
        }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name,
                        LinkedHashMap:: new, Collectors.averagingDouble(Subject::score)))
                .entrySet().stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(s -> new Tuple(s.name(), s.subjects().stream()
                        .mapToInt(Subject::score)
                        .sum()))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(new Tuple("Default", 0D));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(p -> p.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(s -> new Tuple(s.getKey(), s.getValue()))
                .max(Comparator.comparing(Tuple::score))
                .orElse(new Tuple("Default", 0D));
    }
}