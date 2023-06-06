package top.guoziyang.mydb.backend.utils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * RandomUtil
 */
public class RandomUtil {
    public static byte[] randomBytes(int length) {
        Random r = new SecureRandom();
        byte[] buf = new byte[length];
        r.nextBytes(buf);
        return buf;
    }
}
