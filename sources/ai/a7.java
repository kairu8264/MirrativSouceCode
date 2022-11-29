package ai;

import android.content.Context;
import android.os.Looper;

@Deprecated
/* loaded from: classes3.dex */
public final class a7 {

    /* renamed from: a */
    public final Context f1759a;

    /* renamed from: b */
    public final x6 f1760b;

    /* renamed from: c */
    public final v9 f1761c;

    /* renamed from: d */
    public ur3 f1762d;

    /* renamed from: e */
    public final mp3 f1763e;

    /* renamed from: f */
    public x4 f1764f;

    /* renamed from: g */
    public final ds3 f1765g;

    /* renamed from: h */
    public final o11 f1766h;

    /* renamed from: i */
    public final Looper f1767i;

    /* renamed from: j */
    public final lc3 f1768j;

    /* renamed from: k */
    public final y6 f1769k;

    /* renamed from: l */
    public boolean f1770l;

    /* renamed from: m */
    public final a3 f1771m;

    @Deprecated
    public a7(Context context, x6 x6Var) {
        iv3 iv3Var = new iv3();
        or3 or3Var = new or3(context);
        oo3 oo3Var = new oo3(context, iv3Var);
        b3 b3Var = new b3();
        ls3 c10 = ls3.c(context);
        v9 v9Var = v9.f11007a;
        o11 o11Var = new o11(v9Var);
        this.f1759a = context;
        this.f1760b = x6Var;
        this.f1762d = or3Var;
        this.f1763e = oo3Var;
        this.f1764f = b3Var;
        this.f1765g = c10;
        this.f1766h = o11Var;
        this.f1767i = sb.P();
        this.f1768j = lc3.f6517c;
        this.f1769k = y6.f12462g;
        this.f1771m = new a3(0.97f, 1.03f, 1000L, 1.0E-7f, y2.b(20L), y2.b(500L), 0.999f, null);
        this.f1761c = v9Var;
    }

    public static /* synthetic */ Context a(a7 a7Var) {
        return a7Var.f1759a;
    }

    public static /* synthetic */ x6 b(a7 a7Var) {
        return a7Var.f1760b;
    }

    public static /* synthetic */ v9 c(a7 a7Var) {
        return a7Var.f1761c;
    }

    public static /* synthetic */ ur3 d(a7 a7Var) {
        return a7Var.f1762d;
    }

    public static /* synthetic */ mp3 e(a7 a7Var) {
        return a7Var.f1763e;
    }

    public static /* synthetic */ x4 f(a7 a7Var) {
        return a7Var.f1764f;
    }

    public static /* synthetic */ ds3 g(a7 a7Var) {
        return a7Var.f1765g;
    }

    public static /* synthetic */ o11 h(a7 a7Var) {
        return a7Var.f1766h;
    }

    public static /* synthetic */ Looper i(a7 a7Var) {
        return a7Var.f1767i;
    }

    public static /* synthetic */ lc3 j(a7 a7Var) {
        return a7Var.f1768j;
    }

    public static /* synthetic */ y6 k(a7 a7Var) {
        return a7Var.f1769k;
    }

    public static /* synthetic */ a3 o(a7 a7Var) {
        return a7Var.f1771m;
    }

    @Deprecated
    public final a7 l(ur3 ur3Var) {
        u9.d(!this.f1770l);
        this.f1762d = ur3Var;
        return this;
    }

    @Deprecated
    public final a7 m(x4 x4Var) {
        u9.d(!this.f1770l);
        this.f1764f = x4Var;
        return this;
    }

    @Deprecated
    public final e7 n() {
        u9.d(!this.f1770l);
        this.f1770l = true;
        return new e7(this);
    }
}
