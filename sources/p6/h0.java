package p6;

import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h0 implements z {

    /* renamed from: d  reason: collision with root package name */
    public static String f45960d = "Error formating log message: %s, with params: %s";

    /* renamed from: a  reason: collision with root package name */
    public g0 f45961a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45963c = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45962b = false;

    public h0() {
        a(g0.INFO, false);
    }

    @Override // p6.z
    public void a(g0 g0Var, boolean z10) {
        if (this.f45962b) {
            return;
        }
        this.f45961a = g0Var;
        this.f45963c = z10;
    }

    @Override // p6.z
    public void b(String str, Object... objArr) {
        if (!this.f45963c && this.f45961a.androidLogLevel <= 5) {
            try {
                Log.w("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p6.z
    public void c(String str, Object... objArr) {
        if (!this.f45963c && this.f45961a.androidLogLevel <= 6) {
            try {
                Log.e("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p6.z
    public void d(String str, Object... objArr) {
        if (!this.f45963c && this.f45961a.androidLogLevel <= 3) {
            try {
                Log.d("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p6.z
    public void e() {
        this.f45962b = true;
    }

    @Override // p6.z
    public void f(String str, Object... objArr) {
        if (this.f45961a.androidLogLevel <= 5) {
            try {
                Log.w("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p6.z
    public void g(String str, Object... objArr) {
        if (!this.f45963c && this.f45961a.androidLogLevel <= 2) {
            try {
                Log.v("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p6.z
    public void h(String str, Object... objArr) {
        if (!this.f45963c && this.f45961a.androidLogLevel <= 4) {
            try {
                Log.i("Adjust", c1.k(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", c1.k(f45960d, str, Arrays.toString(objArr)));
            }
        }
    }
}
