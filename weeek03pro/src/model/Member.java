package model;

public class Member {

    private String memberId;
    private String name;
    private int maxBorrowLimit;

    public Member(String memberId, String name, int maxBorrowLimit) {
        this.memberId = memberId;
        this.name = name;
        this.maxBorrowLimit = maxBorrowLimit;
    }

    @Override
    public String toString() {
        return "Member{id='" + memberId +
                "', name='" + name +
                "', limit=" + maxBorrowLimit + "}";
    }
}