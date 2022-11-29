package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class c71 extends ja1<xg.q> implements xg.q {
    public c71(Set<gc1<xg.q>> set) {
        super(set);
    }

    @Override // xg.q
    public final synchronized void B4() {
        C0(a71.f1774a);
    }

    @Override // xg.q
    public final synchronized void D5(final int i10) {
        C0(new ia1(i10) { // from class: ai.w61

            /* renamed from: a  reason: collision with root package name */
            public final int f11502a;

            {
                this.f11502a = i10;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((xg.q) obj).D5(this.f11502a);
            }
        });
    }

    @Override // xg.q
    public final synchronized void c() {
        C0(y61.f12468a);
    }

    @Override // xg.q
    public final synchronized void d() {
        C0(x61.f11876a);
    }

    @Override // xg.q
    public final synchronized void f4() {
        C0(z61.f12893a);
    }

    @Override // xg.q
    public final synchronized void s0() {
        C0(b71.f2259a);
    }
}
