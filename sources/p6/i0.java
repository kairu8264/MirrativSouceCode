package p6;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public class i0 {
    public static String a(Context context) {
        String b10 = b(context);
        if (b10 == null) {
            return null;
        }
        return d(b10.toUpperCase(Locale.US));
    }

    public static String b(Context context) {
        String c10 = c("wlan0");
        if (c10 != null) {
            return c10;
        }
        String c11 = c("eth0");
        if (c11 != null) {
            return c11;
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                return macAddress;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) {
        try {
            StringBuilder sb2 = new StringBuilder(1000);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/net/" + str + "/address"), 1024);
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read != -1) {
                    sb2.append(String.valueOf(cArr, 0, read));
                } else {
                    bufferedReader.close();
                    return sb2.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        String replaceAll = str.replaceAll("\\s", "");
        if (TextUtils.isEmpty(replaceAll)) {
            return null;
        }
        return replaceAll;
    }
}
