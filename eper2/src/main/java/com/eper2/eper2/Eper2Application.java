package com.eper2.eper2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@SpringBootApplication
public class Eper2Application {

    @Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Permitir todas as origens
        config.addAllowedMethod("*"); // Permitir todos os métodos (GET, POST, etc.)
        config.addAllowedHeader("*"); // Permitir todos os cabeçalhos
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}

    public static void main(String[] args) {
        SpringApplication.run(Eper2Application.class, args);
    }

    @RestController
    public static class HelloController {
    
        @GetMapping("/")
        public  String[] getMethodName() {

            
            String[] produtos = new String[3];
            produtos[0] = "TV Samsung";
            produtos[1] = "Apple Iphone";      
            produtos[2] = "Coluna bluetooth";




            return produtos;
        }
       

        @GetMapping("/um/{n}")
        @CrossOrigin(origins = "http://localhost8081")
        public  String getMethodName2(@PathVariable Integer n) {

            
            String[] produtosnn = new String[3];
            produtosnn[0] = "TV Samsung";
            produtosnn[1] = "Apple Iphone";      
            produtosnn[2] = "Coluna bluetooth";

            String R= produtosnn[n];
            System.out.print(R);


            return R;
        }
        @PostMapping("/")
        public String postMethodName() {
            return "Hello World, postou ";
        }
        @DeleteMapping("/")
        public String deleteMethodName() {
            return "Hello World, deletetou ";
        }
      
    }






}


























