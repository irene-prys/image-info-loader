package demo.image.loader.controllers;

import demo.image.loader.services.ImageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ImageInfoController {

    @Autowired
    private ImageInfoService imageLoaderService;

    @RequestMapping("/load-info")
    @ResponseBody
    public String loadInfo() throws IOException {
        return imageLoaderService.loadImageInfo();
    }

    @RequestMapping({"/image", "/"})
    public String index() {
        return "index";
    }
}
