package jp.co.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleNishiApplication {

	public static void main(String[] args) {
		System.out.println("デプロイとサーバー起動を行います");
		SpringApplication.run(GitSampleNishiApplication.class, args);
	}
}
