package ak;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class x extends r<Void> {
    public final int A;
    public final /* synthetic */ c0 B;

    /* renamed from: y  reason: collision with root package name */
    public final int f13708y;

    /* renamed from: z  reason: collision with root package name */
    public final String f13709z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, jk.o<Void> oVar, int i10, String str, int i11) {
        super(c0Var, oVar);
        this.B = c0Var;
        this.f13708y = i10;
        this.f13709z = str;
        this.A = i11;
    }

    @Override // ak.r, dk.n0
    public final void g0(Bundle bundle) {
        dk.r rVar;
        dk.f fVar;
        rVar = this.B.f13323d;
        rVar.s(this.f13609w);
        int i10 = bundle.getInt("error_code");
        fVar = c0.f13318g;
        fVar.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i10));
        int i11 = this.A;
        if (i11 > 0) {
            this.B.l(this.f13708y, this.f13709z, i11 - 1);
        }
    }
}
