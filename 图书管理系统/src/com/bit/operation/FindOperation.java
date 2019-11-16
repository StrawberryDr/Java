package com.bit.operation;
import com.bit.book.Book;
import com.bit.book.BookList;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("请输入要查找书籍的名称：");
        String name = scanner.next();
        int i = 0;
        for(i = 0;i < bookList.getSize();i++){
            if(bookList.getBook(i).name.equals(name)){
                System.out.println("已找到"+bookList.getBook(i));
                break;
            }
        }
        if(i >= bookList.getSize()){
            System.out.println("没有此书籍");
            return;
        }
        System.out.println("查找完毕");
    }
}
