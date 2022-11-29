package em;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f30721d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f30722a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30723b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30724c;

    public p0(String str, String str2) {
        this.f30722a = d(str2, str);
        this.f30723b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f30724c = sb2.toString();
    }

    public static p0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new p0(split[0], split[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f30721d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f30723b;
    }

    public String c() {
        return this.f30722a;
    }

    public String e() {
        return this.f30724c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return this.f30722a.equals(p0Var.f30722a) && this.f30723b.equals(p0Var.f30723b);
        }
        return false;
    }

    public int hashCode() {
        return rh.n.b(this.f30723b, this.f30722a);
    }
}
