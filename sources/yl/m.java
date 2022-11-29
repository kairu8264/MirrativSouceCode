package yl;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final long f62065b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f62066c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static m f62067d;

    /* renamed from: a  reason: collision with root package name */
    public final cm.a f62068a;

    public m(cm.a aVar) {
        this.f62068a = aVar;
    }

    public static m c() {
        return d(cm.b.a());
    }

    public static m d(cm.a aVar) {
        if (f62067d == null) {
            f62067d = new m(aVar);
        }
        return f62067d;
    }

    public static boolean g(String str) {
        return f62066c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f62068a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(am.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f62065b;
    }
}
