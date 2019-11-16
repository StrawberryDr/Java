package com.bit.operation;

import com.bit.book.BookList;
import java.util.*;

public interface IOperation {
    Scanner scanner  = new Scanner(System.in);
    void work(BookList bookList);
}
