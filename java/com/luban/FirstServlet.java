package com.luban;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator fenghao
 * @description
 * @date 2020/6/4 19:16
 */


public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("测试");
        ServletInputStream inputStream = req.getInputStream();
        byte[] bytes = new byte[100];
        int n;
        while ((n = inputStream.read()) > 0) {
            System.out.println(new String(bytes, 0, n));
        }
    }
}
