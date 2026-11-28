package service;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<LibraryItem> items = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void lend(Loanable thing, Member member) {
        thing.loan(member);
    }

    public void reserveIfPossible(LibraryItem item, Member member) {

        if (item instanceof Reservable r) {
            r.reserve(member);
        } else {
            System.out.println(item.getTitle() + " cannot be reserved.");
        }
    }

    public void printMembersByActivity() {

        List<Member> copy = new ArrayList<>(members);

        Collections.sort(copy);

        for (Member m : copy) {
            System.out.println(
                    m.getName() + " (" +
                            m.getBorrowedCount() +
                            " borrowed)"
            );
        }
    }
}