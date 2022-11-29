package ai;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class sl {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f9863a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f9864b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f9864b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static long b(String str, String str2) {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 28);
                sb2.append("Unexpected Content-Length [");
                sb2.append(str);
                sb2.append("]");
                Log.e("HttpUtil", sb2.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f9863a.matcher(str2);
        if (matcher.matches()) {
            try {
                String group = matcher.group(2);
                Objects.requireNonNull(group);
                long parseLong = Long.parseLong(group);
                String group2 = matcher.group(1);
                Objects.requireNonNull(group2);
                long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                if (j10 < 0) {
                    return parseLong2;
                }
                if (j10 != parseLong2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
                    sb3.append("Inconsistent headers [");
                    sb3.append(str);
                    sb3.append("] [");
                    sb3.append(str2);
                    sb3.append("]");
                    Log.w("HttpUtil", sb3.toString());
                    return Math.max(j10, parseLong2);
                }
                return j10;
            } catch (NumberFormatException unused2) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb4.append("Unexpected Content-Range [");
                sb4.append(str2);
                sb4.append("]");
                Log.e("HttpUtil", sb4.toString());
                return j10;
            }
        }
        return j10;
    }
}
