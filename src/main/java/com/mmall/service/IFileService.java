package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: fanhao
 * @Date: 2018/9/19 23:39
 * @Version 1.0
 */
public interface IFileService {

    String upload(MultipartFile file, String path);

}
