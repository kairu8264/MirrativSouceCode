package xk;

import android.util.Log;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f60366c = new f("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    public final String f60367a;

    /* renamed from: b  reason: collision with root package name */
    public int f60368b = 4;

    public f(String str) {
        this.f60367a = str;
    }

    public static f f() {
        return f60366c;
    }

    public final boolean a(int i10) {
        return this.f60368b <= i10 || Log.isLoggable(this.f60367a, i10);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f60367a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f60367a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f60367a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f60367a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f60367a, str, th2);
        }
    }
}
