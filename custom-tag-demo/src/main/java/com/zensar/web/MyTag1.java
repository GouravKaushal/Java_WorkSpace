package com.zensar.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag1 extends TagSupport {
	private int number;


	public void setNumber(int number) {
		this.number = number;
	}

@Override
public int doStartTag() throws JspException {
	JspWriter out = pageContext.getOut();// returns the instance of JspWriter
	try {
		out.print(number*number);// printing date and time using JspWriter
	} catch (Exception e) {
		System.out.println(e);
	}
	return SKIP_BODY;
}
}
