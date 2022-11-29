package ak;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class h extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f13379x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ jk.o f13380y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ c0 f13381z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c0 c0Var, jk.o oVar, String str, jk.o oVar2) {
        super(oVar);
        this.f13381z = c0Var;
        this.f13379x = str;
        this.f13380y = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle B;
        Bundle i10;
        try {
            rVar = this.f13381z.f13323d;
            str = this.f13381z.f13320a;
            B = c0.B(0, this.f13379x);
            i10 = c0.i();
            ((dk.l0) rVar.e()).K1(str, B, i10, new z(this.f13381z, this.f13380y));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "removePack(%s)", this.f13379x);
        }
    }
}
