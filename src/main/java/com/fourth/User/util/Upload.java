package com.fourth.User.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by a on 2017/8/13.
 */
public class Upload {
    /*
	 * 上传的方法
	 */
    public static String getUpload(HttpServletRequest request,
                                   MultipartFile file) throws Exception {
        if (file.getOriginalFilename().length() > 0) {
            String fileName = "/static/" + "img/" + Uid.getUuid()
                    + file.getOriginalFilename();
            System.out.println(fileName);
            File files = new File(request.getRealPath("") + fileName);
            file.transferTo(files);
            return fileName;
        }
        return null;
    }

    /*
     * 多文件上传的方法
     */
    public static List<String> getUploads(HttpServletRequest request,
                                          MultipartFile[] file) throws Exception {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < file.length; i++) {
            if (file[i].getOriginalFilename().length() > 0
                    && file[i].getOriginalFilename() != "") {
                String fileName = "/" + "carImg/" + Uid.getUuid()
                        + file[i].getOriginalFilename();
                System.out.println(fileName);
                list.add(fileName);
                File files = new File(request.getRealPath("") + fileName);
                file[i].transferTo(files);
            }

        }
        return list;
    }
}
