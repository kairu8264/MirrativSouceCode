package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zp3 implements qq3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f13071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ cq3 f13072b;

    public zp3(cq3 cq3Var, int i10) {
        this.f13072b = cq3Var;
        this.f13071a = i10;
    }

    @Override // ai.qq3
    public final int a(long j10) {
        return this.f13072b.t(this.f13071a, j10);
    }

    @Override // ai.qq3
    public final void b() throws IOException {
        this.f13072b.V(this.f13071a);
    }

    @Override // ai.qq3
    public final int c(w4 w4Var, a4 a4Var, int i10) {
        return this.f13072b.X(this.f13071a, w4Var, a4Var, i10);
    }

    @Override // ai.qq3
    public final boolean zzb() {
        return this.f13072b.U(this.f13071a);
    }
}
