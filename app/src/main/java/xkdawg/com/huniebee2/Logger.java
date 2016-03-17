package xkdawg.com.huniebee2;

import static android.util.Log.d;
import static android.util.Log.e;
import static android.util.Log.i;
import static android.util.Log.v;
import static android.util.Log.w;

/**
 * This file was created by xkdawg.
 * File created on 2016-02-23 @ 9:49 PM.
 * This file allows for a quick way to write to the android log.
 */
public class Logger {
    public static void debug(String index, String message) {
        d(index, message);
    }

    public static void error(String index, String message) {
        e(index, message);
    }

    public static void info(String index, String message) {
        i(index, message);
    }

    public static void verbose(String index, String message) {
        v(index, message);
    }

    public static void warning(String index, String message) {
        w(index, message);
    }

    public static void wtf(String index, String message) {
        android.util.Log.wtf(index, "wtf: message");
    }
}
