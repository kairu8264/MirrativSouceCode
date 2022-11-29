package bm;

import java.util.concurrent.TimeUnit;
import yl.m;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long f18543d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f18544e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final m f18545a = m.c();

    /* renamed from: b  reason: collision with root package name */
    public long f18546b;

    /* renamed from: c  reason: collision with root package name */
    public int f18547c;

    public static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (!c(i10)) {
            return f18543d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f18547c) + this.f18545a.e(), f18544e);
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f18547c != 0) {
            z10 = this.f18545a.a() > this.f18546b;
        }
        return z10;
    }

    public final synchronized void e() {
        this.f18547c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f18547c++;
        this.f18546b = this.f18545a.a() + a(i10);
    }
}
