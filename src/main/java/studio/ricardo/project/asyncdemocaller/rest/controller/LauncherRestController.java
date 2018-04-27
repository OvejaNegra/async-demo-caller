package studio.ricardo.project.asyncdemocaller.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/launcher")
@Slf4j
public class LauncherRestController {

	@GetMapping("/{number}")
	public String launchApp(@PathVariable long number) {
		RestTemplate restTemplate = new RestTemplate();
		for (int i = 0; i < number; i++) {
			String response = restTemplate.getForObject("http://localhost:8080/message/" + i, String.class);
			log.info(response);
		}
		return "done launcher for " + number;
	}
}
