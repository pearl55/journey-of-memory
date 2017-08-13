package com.fourth.User.util;

import java.util.UUID;

/**
 * Created by a on 2017/8/13.
 */
public class Uid {
    public static String getUuid() {
        return UUID.randomUUID().toString();
    }
}
