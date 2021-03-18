package com.abc.handler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class Hello implements Tag {

	PageContext pageContext;
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext = pageContext;
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doStartTag() throws JspException {

		try {
			JspWriter out = pageContext.getOut();

			out.println("<h1 style='color:red; text-align:center;'>Aradhay Brilliance Center</h1>");
			out.println("<h2 style='color:blue; text-align:center;'>Hello " + name + "</h2>");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

}
