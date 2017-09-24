package demo.image.loader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ImageInfoLoaderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ImageInfoLoaderApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ImageInfoLoaderApplication.class);
    }

}
