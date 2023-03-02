package com.upes.devopsproj.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.upes.devopsproj.entity.Product;
import com.upes.devopsproj.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	
	public void configureRepositoryConfiguration(RepositoryRestConfiguration config)
	{
		  HttpMethod[] theUnsupportedActions= {HttpMethod.PUT,HttpMethod.POST, HttpMethod.DELETE};
		  
		  config.getExposureConfiguration()
		  .forDomainType(Product.class )
		  .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		  .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		  
//product category
		  config.getExposureConfiguration()
		  .forDomainType(ProductCategory.class )
		  .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		  .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		  
		  
		  
		  
		  


	}
	
	

}
