package org.sbgrt.orgaappbackend.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringTools {

    public static String randomString50() {
        return RandomStringUtils.random(50, true, true);
    }
}
