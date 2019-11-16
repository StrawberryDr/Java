package com.bit.operation;

import com.bit.book.*;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("请输入要删除书籍的名称：");
        String name = scanner.next();
        //不会从bookList中删除——》isBorrowed置为true
        //1.看这本书是否存在
        int i = 0;
        for(i = 0;i < bookList.getSize();i++){
            if(bookList.getBook(i).name.equals(name)){
                break;
            }
        }
        if(i >= bookList.getSize()){
            System.out.println("没有此书籍");
            return;
        }
        for(int j = i;j < bookList.getSize()-1;j++){
            Book nextBook = bookList.getBook(j+1);
            bookList.setBooks(j,nextBook);
        }
        bookList.setSize(bookList.getSize()-1);
    }
}
