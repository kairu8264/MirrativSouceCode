package ai;

import ai.d41;
import com.google.android.gms.internal.ads.zzeap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pi2<R extends d41<? extends u01>> {

    /* renamed from: a  reason: collision with root package name */
    public final kn2 f8436a;

    /* renamed from: b  reason: collision with root package name */
    public final R f8437b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8438c;

    /* renamed from: d  reason: collision with root package name */
    public oi2 f8439d;

    public pi2(kn2 kn2Var, R r10, Executor executor) {
        this.f8436a = kn2Var;
        this.f8437b = r10;
        this.f8438c = executor;
    }

    public final s43<oi2> c() {
        s43 f10;
        oi2 oi2Var = this.f8439d;
        if (oi2Var == null) {
            if (!iz.f5450a.e().booleanValue()) {
                oi2 oi2Var2 = new oi2(null, e(), null);
                this.f8439d = oi2Var2;
                f10 = j43.a(oi2Var2);
            } else {
                f10 = j43.f(j43.j(z33.E(this.f8437b.q().f(this.f8436a.c())), new mi2(this), this.f8438c), zzeap.class, new li2(this), this.f8438c);
            }
            return j43.j(f10, ki2.f6241a, this.f8438c);
        }
        return j43.a(oi2Var);
    }

    @Deprecated
    public final un2 e() {
        yl2 d02 = this.f8437b.d0();
        return this.f8436a.d(d02.f12650d, d02.f12652f, d02.f12656j);
    }
}
