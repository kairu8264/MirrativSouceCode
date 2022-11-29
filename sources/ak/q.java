package ak;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class q extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ jk.o f13588x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ c0 f13589y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c0 c0Var, jk.o oVar, jk.o oVar2) {
        super(oVar);
        this.f13589y = c0Var;
        this.f13588x = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle i10;
        try {
            rVar = this.f13589y.f13324e;
            str = this.f13589y.f13320a;
            i10 = c0.i();
            ((dk.l0) rVar.e()).e1(str, i10, new v(this.f13589y, this.f13588x));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "keepAlive", new Object[0]);
        }
    }
}
