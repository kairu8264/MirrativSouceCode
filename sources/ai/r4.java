package ai;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class r4 {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final String f9333a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<String> f9334b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f9335c;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 57);
        sb2.append("ExoPlayerLib/2.15.0 (Linux; Android ");
        sb2.append(str);
        sb2.append(") ExoPlayerLib/2.15.0");
        f9333a = sb2.toString();
        f9334b = new HashSet<>();
        f9335c = "goog.exo.core";
    }

    public static synchronized String a() {
        String str;
        synchronized (r4.class) {
            str = f9335c;
        }
        return str;
    }
}
