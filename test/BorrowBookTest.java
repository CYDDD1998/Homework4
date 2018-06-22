package test;

import model.Book;
import model.Loan;
import model.Member;

public class BorrowBookTest {
    public static void main(String[] args) {
        //借书流程
        Book book = new Book();
        book.setId(1111);
        book.setIsbn("123456789");
        book.setTitle("JAVA");
        Member member = new Member();
        //book.setLoanTo(member);
        if (member.canLoan(book)) {
            Loan loan =member.loan(book);
            System.out.println(loan);
            member.getLoans().add(loan);
        }



    }
}
