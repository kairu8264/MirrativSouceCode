package ai;

import com.google.android.gms.internal.ads.zzeeg;

/* loaded from: classes3.dex */
public final class s32 implements f61 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9700a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ uy1 f9701b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ mk0 f9702c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t32 f9703d;

    public s32(t32 t32Var, uy1 uy1Var, mk0 mk0Var) {
        this.f9703d = t32Var;
        this.f9701b = uy1Var;
        this.f9702c = mk0Var;
    }

    @Override // ai.f61
    public final synchronized void Z(sr srVar) {
        this.f9700a = true;
        c(srVar);
    }

    @Override // ai.f61
    public final void a(int i10) {
        if (this.f9700a) {
            return;
        }
        c(new sr(i10, t32.e(this.f9701b.f10878a, i10), "undefined", null, null));
    }

    @Override // ai.f61
    public final synchronized void b(int i10, String str) {
        if (this.f9700a) {
            return;
        }
        this.f9700a = true;
        if (str == null) {
            str = t32.e(this.f9701b.f10878a, i10);
        }
        c(new sr(i10, str, "undefined", null, null));
    }

    public final void c(sr srVar) {
        this.f9702c.e(new zzeeg(true == ((Boolean) ft.c().c(ox.M3)).booleanValue() ? 3 : 1, srVar));
    }

    @Override // ai.f61
    public final synchronized void zza() {
        this.f9702c.d(null);
    }
}
