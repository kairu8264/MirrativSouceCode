package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class wc1 extends ja1<h40> implements h40 {
    public wc1(Set<gc1<h40>> set) {
        super(set);
    }

    @Override // ai.h40
    public final void b() {
        C0(vc1.f11020a);
    }

    @Override // ai.h40
    public final void p0(final lf0 lf0Var) {
        C0(new ia1(lf0Var) { // from class: ai.uc1

            /* renamed from: a  reason: collision with root package name */
            public final lf0 f10672a;

            {
                this.f10672a = lf0Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((h40) obj).p0(this.f10672a);
            }
        });
    }

    @Override // ai.h40
    public final synchronized void zza() {
        C0(tc1.f10233a);
    }
}
