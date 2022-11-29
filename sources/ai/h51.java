package ai;

import com.google.android.gms.internal.ads.zzdkm;
import java.util.Set;

/* loaded from: classes3.dex */
public final class h51 extends ja1<l51> implements z41 {
    public h51(Set<gc1<l51>> set) {
        super(set);
    }

    @Override // ai.z41
    public final void d() {
        C0(g51.f4344a);
    }

    @Override // ai.z41
    public final void j0(final zzdkm zzdkmVar) {
        if (((Boolean) ft.c().c(ox.X6)).booleanValue()) {
            C0(new ia1(zzdkmVar) { // from class: ai.f51

                /* renamed from: a  reason: collision with root package name */
                public final zzdkm f3948a;

                {
                    this.f3948a = zzdkmVar;
                }

                @Override // ai.ia1
                public final void a(Object obj) {
                    ((l51) obj).n(tm2.d(12, this.f3948a.getMessage(), null));
                }
            });
        }
    }

    @Override // ai.z41
    public final void y(final sr srVar) {
        C0(new ia1(srVar) { // from class: ai.e51

            /* renamed from: a  reason: collision with root package name */
            public final sr f3540a;

            {
                this.f3540a = srVar;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((l51) obj).n(this.f3540a);
            }
        });
    }
}
