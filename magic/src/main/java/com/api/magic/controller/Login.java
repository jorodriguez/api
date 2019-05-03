package com.api.magic.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public class Login {
	//Permite la conexion unicamente para peticiones HEAD GET (https://howtodoinjava.com/spring5/webmvc/spring-mvc-cors-configuration/)
	@CrossOrigin(origins = "*", allowedHeaders = "GET")
	@RestController
	public class Test {
		
		/*@Autowired
		private CmlService cmlService;
		
		@RequestMapping(value ="/cml", method=RequestMethod.GET)
		public ResponseEntity<List<CmlDto>> getLecturasCml() {
			
			List<CmlDto> lista = cmlService.getLecturasCml(new Date());
			
			ResponseEntity<List<CmlDto>> respuesta = new ResponseEntity<List<CmlDto>>(lista,HttpStatus.OK);
			
			return respuesta;*/
		
		}
}
