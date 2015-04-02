package com.wicky.demo;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
    
    public void index() throws HttpException, IOException {
        render("/index.jsp");
    }
    
    public void notfound() throws HttpException, IOException {
    	render("/404.html");
    }
    
}
