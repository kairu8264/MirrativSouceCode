package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class p71 extends ja1<r71> implements r71 {
    public p71(Set<gc1<r71>> set) {
        super(set);
    }

    @Override // ai.r71
    public final void s(final ie0 ie0Var) {
        C0(new ia1(ie0Var) { // from class: ai.n71

            /* renamed from: a  reason: collision with root package name */
            public final ie0 f7221a;

            {
                this.f7221a = ie0Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((r71) obj).s(this.f7221a);
            }
        });
    }

    @Override // ai.r71
    public final void u(final sl2 sl2Var) {
        C0(new ia1(sl2Var) { // from class: ai.o71

            /* renamed from: a  reason: collision with root package name */
            public final sl2 f7678a;

            {
                this.f7678a = sl2Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((r71) obj).u(this.f7678a);
            }
        });
    }
}
