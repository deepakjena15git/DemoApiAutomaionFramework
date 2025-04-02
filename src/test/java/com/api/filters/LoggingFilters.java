package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter {
	
	Logger logger = LogManager.getLogger(LoggingFilters.class) ;

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		     logRequest(requestSpec);
		     Response response = ctx.next(requestSpec, responseSpec);
		     logResponse(response);
		return response;
	}
	
	public void logRequest(FilterableRequestSpecification request) {
		
		logger.info("Base URI :: " + request.getBaseUri());
		logger.info("Request Header :: " + request.getHeaders());
		logger.info("Request Body :: " + request.getBody());
	}
	
	public void logResponse(Response response) {
		
		logger.info("Status Code :: " + response.getStatusCode());
		logger.info("Reponse Body :: " + response.getBody().asPrettyString());
		logger.info("Response Header :: " + response.getHeaders());
		
	}
}
