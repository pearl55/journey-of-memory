/**   
* @Title: PictureServiceImpl.java 
* @Package com.bwie.ssm.service.impl 
* @Description: TODO
* @author 朱梦光
* @date 2017年8月10日 上午10:09:08 
* @version V1.0   
*/

package com.fourth.community.service.imp;

import com.fourth.community.bean.PictureResult;
import com.fourth.community.service.PictureService;
import com.fourth.community.unit.FtpUtil;
import com.fourth.community.unit.IDUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PictureServiceImpl implements PictureService {
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private Integer FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;

	/**
	 * @Title: uploadFile @Description: TODO @param @return @throws
	 */
	@Override
	public PictureResult uploadFile(MultipartFile uploadFile) {
		PictureResult result2 =null;
		try {
			// 生成一个新的文件名
			// 取出原始文件名
			String oldName = uploadFile.getOriginalFilename();

			// 生成新文件名
			// UUID uuid = UUID.randomUUID();
			String newName = IDUtils.genImageName();

			newName = newName + oldName.substring(oldName.indexOf("."));

			// 图片上传
			String imagePath = new DateTime().toString("/yyyy/MM/dd");
			boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH,
					imagePath, newName, uploadFile.getInputStream());
			// 返回结果
			if(!result){
				  result2 = new PictureResult(1, null,"文件上传失败");
				return result2;
			}
			return  result2 = new PictureResult(0, IMAGE_BASE_URL+imagePath+"/"+newName);

		} catch (IOException e) {
			
			  result2 = new PictureResult(1, null,"文件上传失败");
				return result2;
		}

	
	}

}
