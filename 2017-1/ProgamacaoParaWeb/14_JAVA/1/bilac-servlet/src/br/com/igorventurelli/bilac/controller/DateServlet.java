package br.com.igorventurelli.bilac.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.igorventurelli.bilac.util.Constants;
import br.com.igorventurelli.bilac.util.PrintWriterUtil;

/**
 * This servlet is used only to retrive the system date and time
 * @author <a href="http://www.igorventurelli.com.br/">Igor Venturelli</a>
 * @since 1.0
 */
@WebServlet("/dateAndTime")
public class DateServlet extends HttpServlet {
	
	private String title;
	private String content;

	/**
	 * Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		buildTitleAndContent();
		response.setContentType(Constants.HTML_CONTENT_TYPE);
		PrintWriterUtil.createHTMLResponse(response.getWriter(), this.title, this.content);
	}

	/**
	 * Fill the title and content attributes
	 */
	private void buildTitleAndContent() {
		this.title = "<title>1</title>";
		this.content = "<h1>" + getDateTime() + "</h1>";
	}
	
	/**
	 * Return the Date and Time from system
	 * @return Date and Time as <code>dd/MM/yyyy HH:mm:ss</code>
	 */
	private String getDateTime() {
		return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
	}
}
