package demo.image.loader.services;

import demo.image.loader.utils.FileLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ImageInfoServiceImpl implements ImageInfoService {
    private final String IMAGES_INFO_URL = "https://s3.amazonaws.com/shielddevtest/photo.txt";
    private final String EMPTY_RESULT = "";

    @Override
    public String loadImageInfo() {
        try {
            return FileLoader.loadFileContent(IMAGES_INFO_URL);
        } catch (IOException e) {
            e.printStackTrace();
            return EMPTY_RESULT;
        }
    }
}
