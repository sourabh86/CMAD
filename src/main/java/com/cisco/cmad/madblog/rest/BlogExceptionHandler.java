package com.cisco.cmad.madblog.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.cisco.cmad.madblog.api.BlogException;

public class BlogExceptionHandler implements ExceptionMapper<BlogException> {

	@Override
	public Response toResponse(BlogException arg0) {
		return Response.status(500).build();
	}

}
