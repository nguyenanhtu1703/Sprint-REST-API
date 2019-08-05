package com.nguyenanhtu.error;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CustomGlobalExceptionHandler {
	@ExceptionHandler
	public void springHandleNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.NOT_FOUND.value());
	}
	
	@ExceptionHandler(BookUnSuportedFieldPathException.class)
	public void springUnSupportedFieldPatch(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.METHOD_NOT_ALLOWED.value());
	}
}

class BookUnSuportedFieldPathException extends Exception {
	public BookUnSuportedFieldPathException() {
	}
}





