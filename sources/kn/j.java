package kn;

import android.net.Uri;
import android.os.Build;
import java.text.Normalizer;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f38906a;

    public j() {
        this("https://api.twitter.com");
    }

    public static String b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('/');
        sb2.append(str2);
        sb2.append(' ');
        String str3 = Build.MODEL;
        sb2.append(str3);
        sb2.append('/');
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(" (");
        sb2.append(Build.MANUFACTURER);
        sb2.append(';');
        sb2.append(str3);
        sb2.append(';');
        sb2.append(Build.BRAND);
        sb2.append(';');
        sb2.append(Build.PRODUCT);
        sb2.append(')');
        return d(sb2.toString());
    }

    public static String d(String str) {
        return e(Normalizer.normalize(str, Normalizer.Form.NFD));
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt > 31 && charAt < 127) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public Uri.Builder a(String... strArr) {
        Uri.Builder buildUpon = Uri.parse(c()).buildUpon();
        if (strArr != null) {
            for (String str : strArr) {
                buildUpon.appendPath(str);
            }
        }
        return buildUpon;
    }

    public String c() {
        return this.f38906a;
    }

    public j(String str) {
        this.f38906a = str;
    }
}
