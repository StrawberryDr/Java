package com.bit;

import com.bit.book.Book;
import com.bit.book.BookList;
import com.bit.usr.Admin;
import com.bit.usr.NormalUser;
import com.bit.usr.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String name = scanner.next();
        System.out.println("请输入你的身份(1:管理员  0：普通用户)");
        int who = scanner.nextInt();
        if(who == 1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args){
        BookList bookList = new BookList();


        while (true){
            User user = login();
            int ret = user.menu();
            user.doOperation(ret,bookList);
        }
    }
}
