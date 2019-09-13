package com.ealanta;

import java.time.LocalDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Timer {
	
	@GetMapping("/time")
	public LocalDateTime getTime() {
		return LocalDateTime.now();
	}
	
	@GetMapping(value="/",produces=MediaType.TEXT_PLAIN_VALUE)
	public String lanndingPage() {
		return getTime().toString();
	}
}
