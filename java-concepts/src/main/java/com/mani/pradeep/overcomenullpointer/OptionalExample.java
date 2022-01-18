package com.mani.pradeep.overcomenullpointer;

import org.springframework.validation.annotation.Validated;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalExample {




    public Double calculateAverageGrade(@Validated Map<String, List<Integer>> gradeList,
                                        String studentName) throws Exception {

        Optional.ofNullable(gradeList.get(studentName))
                .map(list -> list.stream().collect(Collectors.averagingDouble(x -> x)))
                .orElseThrow(() -> new Exception("Student Not found" + studentName));


        return 0.0;
    }

    public static void main(String[] args) {
        final var list = Arrays.asList(1, 2, null, 3, null, 4);
        list.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::print);


    }


/**
 * In order to use CollectionUtilsand MapUtils, you need to add the
 * following dependency to build.gradle file:
 * implementation org.apache.commons:commons-collections4:4.4
 *
 * and for StringUtils you will need:
 * implementation org.apache.commons:commons-lang3:3.0
 *
 * Apache Commons
 * CollectionUtils
 * MapUtils
 * StringUtils
 *
 *
 *    this.id = Objects.requireNonNull(id, "id is required");
 *         this.name = Objects.requireNonNullElse(name, "hayley");
 *         this.classes = Objects.requireNonNullElseGet(classes, ArrayList::new);
 *         this.teacherMap = Objects.requireNonNullElseGet(teacherMap, HashMap::new);
 *
 *
 *Objects.requireNonNullElse(students, List.<Student>of())
 *                 .stream()
 *                 .filter(Objects::nonNull)
 *                 .map(Student::getName)
 *                 .collect(Collectors.toList());
 */
}
