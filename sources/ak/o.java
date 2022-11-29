package ak;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class o extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f13558x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ jk.o f13559y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ c0 f13560z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c0 c0Var, jk.o oVar, int i10, jk.o oVar2) {
        super(oVar);
        this.f13560z = c0Var;
        this.f13558x = i10;
        this.f13559y = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle j10;
        Bundle i10;
        try {
            rVar = this.f13560z.f13323d;
            str = this.f13560z.f13320a;
            j10 = c0.j(this.f13558x);
            i10 = c0.i();
            ((dk.l0) rVar.e()).B1(str, j10, i10, new y(this.f13560z, this.f13559y));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
