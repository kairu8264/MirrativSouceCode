package ak;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class n extends dk.g {
    public final /* synthetic */ int A;
    public final /* synthetic */ c0 B;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f13543x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f13544y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ jk.o f13545z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c0 c0Var, jk.o oVar, int i10, String str, jk.o oVar2, int i11) {
        super(oVar);
        this.B = c0Var;
        this.f13543x = i10;
        this.f13544y = str;
        this.f13545z = oVar2;
        this.A = i11;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle B;
        Bundle i10;
        try {
            rVar = this.B.f13323d;
            str = this.B.f13320a;
            B = c0.B(this.f13543x, this.f13544y);
            i10 = c0.i();
            ((dk.l0) rVar.e()).o1(str, B, i10, new x(this.B, this.f13545z, this.f13543x, this.f13544y, this.A));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
