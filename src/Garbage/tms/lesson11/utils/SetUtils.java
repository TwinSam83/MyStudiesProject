package Garbage.tms.lesson11.utils;

import java.util.HashSet;
import java.util.Set;

public final class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T>... sets) {
        Set<T> resultSet = new HashSet<>();
        for (Set<T> set : sets) {
            resultSet.addAll(set);
        }
        return resultSet;
    }

    public static <T> Set<T> intersect(Set<T> basicSet, Set<T>... sets) {
        for (Set<T> set : sets) {
            basicSet.retainAll(set);
        }
        return basicSet;
    }
}
