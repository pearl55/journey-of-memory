package com.fourth.community.service;

import com.fourth.community.bean.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 染熙 on 2017/8/13.
 */
public interface PictureService {
    PictureResult uploadFile(MultipartFile uploadFile);
}
