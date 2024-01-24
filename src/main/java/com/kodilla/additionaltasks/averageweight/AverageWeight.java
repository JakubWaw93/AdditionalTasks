package com.kodilla.additionaltasks.averageweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageWeight {

    public static double averageWithWeight(List<Integer> grades, List<Integer> weights) throws GradeOutOfBoundariesException, WeightOutOfBoundaries, CollectionsSizeNotEqualException, EmptyCollectionException {
        double result = 0;
        double weightSum = 0;
        if (grades.size() > 0 && weights.size() > 0) {
            if (grades.size() == weights.size()) {
                for (int i = 0; i < grades.size(); i++) {
                    if (grades.get(i) >= 1 && grades.get(i) <= 6) {
                        if (weights.get(i) >= 1 && grades.get(i) <= 10) {
                            result += grades.get(i) * (weights.get(i));
                            weightSum += weights.get(i);
                        } else {
                            throw new WeightOutOfBoundaries("Incorrect weight of grade");
                        }
                    } else {
                        throw new GradeOutOfBoundariesException("Incorrect grade");
                    }
                }
            } else {
                throw new CollectionsSizeNotEqualException("Collections size is not the same");
            }
        } else {
            throw new EmptyCollectionException("Collection is empty");
        }
        result = result / weightSum;
        return result;
    }

    public static double averageWeightExceptionHandler(List<Integer> grades, List<Integer> weights) {
        double result=-1;
        try {
            result = averageWithWeight(grades, weights);
        } catch (GradeOutOfBoundariesException | WeightOutOfBoundaries |
                 CollectionsSizeNotEqualException | EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(3);
        grades.add(1);
        grades.add(1);
        grades.add(5);
        grades.add(6);
        grades.add(4);
        List<Integer> weights = new ArrayList<>();
        weights.add(4);
        weights.add(6);
        weights.add(8);
        weights.add(4);
        weights.add(4);
        weights.add(10);

        double result = averageWeightExceptionHandler(grades, weights);
        System.out.println(result);

    }
}
