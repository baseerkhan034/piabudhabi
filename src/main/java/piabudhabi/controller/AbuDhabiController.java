package piabudhabi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbuDhabiController {
	@GetMapping(value="/testResults", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> sayHello(@RequestParam String name) {
		
		return new ResponseEntity<String>("Test Results for: "+name, HttpStatus.OK);
    }
}
