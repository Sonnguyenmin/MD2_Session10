package bkap;

import java.util.Comparator;

public class StudentClassNameComparator implements Comparator<BkapStudent> {

    @Override
    public int compare(BkapStudent o1, BkapStudent o2) {
        return (int) (o2.getScholarShip() - o1.getScholarShip());
    }
}
