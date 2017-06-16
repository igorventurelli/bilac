package br.com.igorventurelli.bilac.util;

import java.io.PrintWriter;

/**
 * Utilitary class to write HTML response for Servlets
 * @author <a href="http://www.igorventurelli.com.br/">Igor Venturelli</a>
 * @since 1.0
 */
public final class PrintWriterUtil {
	
	/**
	 * Creates a HTML response for the content passed as parameters and close the <code>PrintWriter</code>
	 * @param writer from the Http Response
	 * @param title in HTML. Example: <code><title>This is a Title!</title></code>
	 * @param contentHTML to be filled in HTML response. This must cames in HTML
	 */
	public static void createHTMLResponse(final PrintWriter writer, final String titleHTML, final String contentHTML) {
		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<head>");
		writer.println(titleHTML);
		writer.println("</head>");
		writer.println("<body>");
		writer.println(contentHTML);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
}
