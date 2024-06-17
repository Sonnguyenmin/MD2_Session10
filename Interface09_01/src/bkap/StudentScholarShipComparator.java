package bkap;

import java.util.Comparator;

public class StudentScholarShipComparator implements Comparator<BkapStudent> {
    @Override
    public int compare(BkapStudent o1, BkapStudent o2) {
        return o1.getClassName().compareTo(o2.getClassName());
    }
}
