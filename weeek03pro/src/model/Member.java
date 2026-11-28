package model;

public class Member implements Comparable<Member> {

    protected String name;
    protected int borrowedCount;
    protected int maxBorrowLimit;

    public Member(String name, int maxBorrowLimit) {
        this.name = name;
        this.maxBorrowLimit = maxBorrowLimit;
        this.borrowedCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    public void incrementBorrowedCount() {
        borrowedCount++;
    }

    @Override
    public int compareTo(Member other) {
        return Integer.compare(
                other.borrowedCount,
                this.borrowedCount
        );
    }
}