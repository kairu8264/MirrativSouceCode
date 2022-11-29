package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class m61 extends ja1<o61> implements o61 {
    public m61(Set<gc1<o61>> set) {
        super(set);
    }

    @Override // ai.o61
    public final void Z(final u01 u01Var) {
        C0(new ia1(u01Var) { // from class: ai.l61

            /* renamed from: a  reason: collision with root package name */
            public final u01 f6488a;

            {
                this.f6488a = u01Var;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((o61) obj).Z(this.f6488a);
            }
        });
    }
}
