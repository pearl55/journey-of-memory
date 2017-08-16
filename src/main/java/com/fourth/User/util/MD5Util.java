package com.fourth.User.util;

import java.security.MessageDigest;

/**
 * Created by a on 2017/8/13.
 */
public class MD5Util {

    public final static String MD5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', 'o', 'M', 's', 'a', 'f',
                '5', '6', '7', '8', 's', 'F', 'e', 'P', 'a', 'W',
                'A', 'B', 'C', 'D', 'E', 'F', 'L', 'l', 'G', 'g' };
        try {
            byte[] btInput = s.getBytes();

            //获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");

            //使用指定的字节更新摘要
            mdInst.update(btInput);

            //获得密文
            byte[] md = mdInst.digest();

            //把密文转换成十六进制的字符串形式
            int j = md.length;   // 记录md的长度
            char str[] = new char[j * 2];   // 存储结果用
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];  //数组中对应的十六进制数放入str中
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);   // 返回加密后的字符串
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;    // 如果有异常返回null
        }
    }

}
