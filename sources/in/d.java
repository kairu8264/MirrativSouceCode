package in;

import android.util.Log;

/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public int f36905a = 4;

    @Override // in.h
    public void a(String str, String str2) {
        f(str, str2, null);
    }

    @Override // in.h
    public void b(String str, String str2) {
        d(str, str2, null);
    }

    @Override // in.h
    public void c(String str, String str2, Throwable th2) {
        if (e(str, 6)) {
            Log.e(str, str2, th2);
        }
    }

    public void d(String str, String str2, Throwable th2) {
        if (e(str, 3)) {
            Log.d(str, str2, th2);
        }
    }

    public boolean e(String str, int i10) {
        return this.f36905a <= i10;
    }

    public void f(String str, String str2, Throwable th2) {
        if (e(str, 5)) {
            Log.w(str, str2, th2);
        }
    }
}
