package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class x41 extends ja1<y41> implements y41 {
    public x41(Set<gc1<y41>> set) {
        super(set);
    }

    @Override // ai.y41
    public final void z(final sr srVar) {
        C0(new ia1(srVar) { // from class: ai.w41

            /* renamed from: a  reason: collision with root package name */
            public final sr f11486a;

            {
                this.f11486a = srVar;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((y41) obj).z(this.f11486a);
            }
        });
    }
}
