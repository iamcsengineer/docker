package com.anirudh.microservices.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/docker-image")
	public String getDocker() {
		return "Docker Image Created V2";
	}
}
