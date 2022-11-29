package u;

import l0.z1;

/* loaded from: classes.dex */
public final class n0<S> {

    /* renamed from: a  reason: collision with root package name */
    public final l0.s0 f54078a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.s0 f54079b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.s0 f54080c;

    public n0(S s10) {
        l0.s0 e10;
        l0.s0 e11;
        l0.s0 e12;
        e10 = z1.e(s10, null, 2, null);
        this.f54078a = e10;
        e11 = z1.e(s10, null, 2, null);
        this.f54079b = e11;
        e12 = z1.e(Boolean.FALSE, null, 2, null);
        this.f54080c = e12;
    }

    public final S a() {
        return (S) this.f54078a.getValue();
    }

    public final void b(S s10) {
        this.f54078a.setValue(s10);
    }

    public final void c(boolean z10) {
        this.f54080c.setValue(Boolean.valueOf(z10));
    }
}
