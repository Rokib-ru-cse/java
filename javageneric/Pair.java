//package javageneric;
//
//import java.util.Comparator;
//
//public class Pair<T extends Comparable<T>, U> implements Comparable<Pair<T, U>> {
//    public T first;
//    public U second;
//
//    public Pair() {
//    }
//
//    public Pair(T first, U second) {
//        this.first = first;
//        this.second = second;
//    }
//
//    public T getFirst() {
//        return first;
//    }
//
//    public void setFirst(T first) {
//        this.first = first;
//    }
//
//    public U getSecond() {
//        return second;
//    }
//
//    public void setSecond(U second) {
//        this.second = second;
//    }
//
//    @Override
//    public int compareTo(Pair<T, U> other) {
//        int firstComparison = this.first.compareTo(other.getFirst());
//        if (firstComparison != 0) {
//            return firstComparison;
//        }
//        if (this.second instanceof Comparable && other.getSecond() instanceof Comparable) {
//            Comparable<U> thisSecond = (Comparable<U>) this.second;
//            return thisSecond.compareTo(other.getSecond());
//        }
//        return 0;
//    }
//}
