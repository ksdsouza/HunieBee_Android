/**
 * Utility File
 * <p>
 * Contains useful tools for both this, and future projects.
 * Created:      2016-02-23 @ 9:49 PM.
 * <p>
 * Last Updated: 2016-.3-18 @ 12:50 PM.
 *
 * @since 1.0.0
 */
package xkdawg.com.huniebee2;

import android.content.Context;
import android.util.DisplayMetrics;

import java.text.DecimalFormat;
import java.util.Random;

import static android.util.Log.d;
import static android.util.Log.e;
import static android.util.Log.i;
import static android.util.Log.v;
import static android.util.Log.w;

public class Util {
    /**
     * Debug
     *
     * Write a debug message to log
     * @since 1.0.0
     * @param index       app name, or whatever tag associated with message
     * @param message     message to be displayed
     * @return void
     */
    public static void debug(String index, String message) {
        d(index, message);
    }

    /**
     * Error
     *
     * Write an error message to log
     * @since 1.0.0
     * @param  index       app name, or whatever tag associated with message
     * @param  message     message to be displayed
     * @return void
     */
    public static void error(String index, String message) {
        e(index, message);
    }

    /**
     * Info
     *
     * Write an info message to log
     * @since 1.0.0
     * @param  index       app name, or whatever tag associated with message
     * @param  message     message to be displayed
     * @return void
     */
    public static void info(String index, String message) {
        i(index, message);
    }

    /**
     * Verbose
     *
     * Write a verbose message to log
     * @since 1.0.0
     * @param  index       app name, or whatever tag associated with message
     * @param  message     message to be displayed
     * @return void
     */
    public static void verbose(String index, String message) {
        v(index, message);
    }

    /**
     * Warning
     *
     * Write a warning message to log
     * @since 1.0.0
     * @param  index       app name, or whatever tag associated with message
     * @param  message     message to be displayed
     * @return void
     */
    public static void warning(String index, String message) {
        w(index, message);
    }

    /**
     * WTF
     *
     * Write a wtf message to log
     * @since 1.0.0
     * @param  index       app name, or whatever tag associated with message
     * @param  message     message to be displayed
     * @return void
     */
    public static void wtf(String index, String message) {
        android.util.Log.wtf(index, "wtf: " + message);
    }

    /**
     * Display-Independent-Pixels to Regular Pixels converter
     *
     * Converts dips to px.
     *
     * @since 1.0.0
     * @param  context      context of where the method was called from
     * @param  dp           dip that is to be converted
     * @return int          equivalent px value of dp
     */
    public static int dpToPx(Context context, int dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    /**
     * Regular Pixels to Display-Independent-Pixels converter
     *
     * Converts px to dips
     *
     * @since 1.0.0
     * @param  context      context of where the method was called from
     * @param  px           px that is to be converted
     * @return int          equivalent dp value of px
     */
    public int pxToDp(Context context, int px) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int dp = Math.round(px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return dp;
    }

    /**
     * Random
     *
     * Generates a random integer from 0 to i.
     *
     * @since 1.0.0
     * @param  i           upper limit of random number
     * @return int         random number that was generated
     */
    public static int Random(int i) {
        Random rand = new Random();
        return rand.nextInt(i);
    }

    /**
     * to Three Digit String
     *
     * Converts any integer into a string with at least three characters.
     * @since 1.0.0
     * @param num          number from 0-100 that is to be converted as a three character string
     * @return string      converted string
     */
    public static String to3Digit(int num) {
        String pattern = "000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String str = decimalFormat.format(num);
        return str;
    }

}
