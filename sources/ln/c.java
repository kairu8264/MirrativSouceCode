package ln;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class c {
    public static TreeMap<String, String> a(String str, boolean z10) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2) {
                if (z10) {
                    treeMap.put(d(split[0]), d(split[1]));
                } else {
                    treeMap.put(split[0], split[1]);
                }
            } else if (!TextUtils.isEmpty(split[0])) {
                if (z10) {
                    treeMap.put(d(split[0]), "");
                } else {
                    treeMap.put(split[0], "");
                }
            }
        }
        return treeMap;
    }

    public static TreeMap<String, String> b(URI uri, boolean z10) {
        return a(uri.getRawQuery(), z10);
    }

    public static String c(String str) {
        int i10;
        if (str == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String e10 = e(str);
        int length = e10.length();
        int i11 = 0;
        while (i11 < length) {
            char charAt = e10.charAt(i11);
            if (charAt == '*') {
                sb2.append("%2A");
            } else if (charAt == '+') {
                sb2.append("%20");
            } else if (charAt == '%' && (i10 = i11 + 2) < length && e10.charAt(i11 + 1) == '7' && e10.charAt(i10) == 'E') {
                sb2.append('~');
                i11 = i10;
            } else {
                sb2.append(charAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }
}
