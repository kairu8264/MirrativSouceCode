package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class o70 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7674a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Object f7675b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public y70 f7676c;

    /* renamed from: d  reason: collision with root package name */
    public y70 f7677d;

    public static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final y70 a(Context context, zj0 zj0Var) {
        y70 y70Var;
        synchronized (this.f7675b) {
            if (this.f7677d == null) {
                this.f7677d = new y70(c(context), zj0Var, lz.f6729b.e());
            }
            y70Var = this.f7677d;
        }
        return y70Var;
    }

    public final y70 b(Context context, zj0 zj0Var) {
        y70 y70Var;
        synchronized (this.f7674a) {
            if (this.f7676c == null) {
                this.f7676c = new y70(c(context), zj0Var, (String) ft.c().c(ox.f7937a));
            }
            y70Var = this.f7676c;
        }
        return y70Var;
    }
}
