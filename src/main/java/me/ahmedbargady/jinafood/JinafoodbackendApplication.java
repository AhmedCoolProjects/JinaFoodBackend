package me.ahmedbargady.jinafood;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.ahmedbargady.jinafood.service.FilesStorageService;

@SpringBootApplication
public class JinafoodbackendApplication implements CommandLineRunner {

	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(JinafoodbackendApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		// storageService.deleteAll();
		storageService.init();
	}

}
