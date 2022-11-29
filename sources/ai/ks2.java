package ai;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class ks2 {

    /* renamed from: f  reason: collision with root package name */
    public static ks2 f6346f;

    /* renamed from: a  reason: collision with root package name */
    public float f6347a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public final cs2 f6348b;

    /* renamed from: c  reason: collision with root package name */
    public final as2 f6349c;

    /* renamed from: d  reason: collision with root package name */
    public bs2 f6350d;

    /* renamed from: e  reason: collision with root package name */
    public ds2 f6351e;

    public ks2(cs2 cs2Var, as2 as2Var) {
        this.f6348b = cs2Var;
        this.f6349c = as2Var;
    }

    public static ks2 a() {
        if (f6346f == null) {
            f6346f = new ks2(new cs2(), new as2());
        }
        return f6346f;
    }

    public final void b(Context context) {
        this.f6350d = new bs2(new Handler(), context, new zr2(), this, null);
    }

    public final void c() {
        fs2.a().g(this);
        fs2.a().c();
        if (fs2.a().e()) {
            ht2.f().g();
        }
        this.f6350d.a();
    }

    public final void d() {
        ht2.f().h();
        fs2.a().d();
        this.f6350d.b();
    }

    public final void e(float f10) {
        this.f6347a = f10;
        if (this.f6351e == null) {
            this.f6351e = ds2.a();
        }
        for (sr2 sr2Var : this.f6351e.f()) {
            sr2Var.g().j(f10);
        }
    }

    public final float f() {
        return this.f6347a;
    }
}
