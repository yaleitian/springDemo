package com.springmvc.controller;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/uploadfile")
public class uploadontroller {
    static Logger logger = Logger.getLogger( uploadontroller.class );
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public  String showUploadFilePage() {
        return "/file";
    }

    @RequestMapping(value = "/beginUpload",method = RequestMethod.POST)
    public String beginUpload(@RequestParam("file") MultipartFile file) throws IOException{
        if (!file.isEmpty()) {
            //System.out.println("uploading file:{}" + file.getOriginalFilename());
            logger.debug( "uploadling file : {}" + file.getOriginalFilename() );
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File( "/Users/lees/Downloads/work/ ",System.currentTimeMillis() + file.getOriginalFilename() ));
        }
         return "/successfile";
    }
}
