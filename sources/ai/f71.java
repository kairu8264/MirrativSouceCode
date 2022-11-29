package ai;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class f71 extends ja1<h71> implements p51, v61 {

    /* renamed from: x  reason: collision with root package name */
    public final fl2 f3957x;

    /* renamed from: y  reason: collision with root package name */
    public final AtomicBoolean f3958y;

    public f71(Set<gc1<h71>> set, fl2 fl2Var) {
        super(set);
        this.f3958y = new AtomicBoolean();
        this.f3957x = fl2Var;
    }

    public final /* synthetic */ void S0(h71 h71Var) throws Exception {
        h71Var.p(this.f3957x.f4083b0);
    }

    @Override // ai.p51
    public final void f() {
        int i10 = this.f3957x.f4082b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }

    @Override // ai.v61
    public final void i0() {
        if (this.f3957x.f4082b == 1) {
            zzb();
        }
    }

    public final void zzb() {
        hs hsVar;
        if (((Boolean) ft.c().c(ox.A5)).booleanValue() && this.f3958y.compareAndSet(false, true) && (hsVar = this.f3957x.f4083b0) != null && hsVar.f4952w == 3) {
            C0(new ia1(this) { // from class: ai.e71

                /* renamed from: a  reason: collision with root package name */
                public final f71 f3577a;

                {
                    this.f3577a = this;
                }

                @Override // ai.ia1
                public final void a(Object obj) {
                    this.f3577a.S0((h71) obj);
                }
            });
        }
    }
}
