package demo.image.loader.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FileLoader {
    public static String loadFileContent(String urlStr) throws IOException {
        URL imageInfoUrl = new URL(urlStr);
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(imageInfoUrl.openStream()));
        StringBuilder responseStrBuilder = new StringBuilder();

        String inputStr;
        while ((inputStr = streamReader.readLine()) != null) {
            responseStrBuilder.append(inputStr.replace("\uFEFF", "") );//replace the BOM with the empty string
        }
        return responseStrBuilder.toString();
    }
}
