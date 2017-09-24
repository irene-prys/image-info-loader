package demo.image.loader.controllers;

import demo.image.loader.services.ImageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ImageInfoController {

    @Autowired
    private ImageInfoService imageLoaderService;

    @RequestMapping("/load-info")
    public String loadInfo() throws IOException {
        return imageLoaderService.loadImageInfo();
    }
}
