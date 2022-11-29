package ak;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class m extends dk.g {
    public final /* synthetic */ int A;
    public final /* synthetic */ jk.o B;
    public final /* synthetic */ c0 C;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f13527x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f13528y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f13529z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c0 c0Var, jk.o oVar, int i10, String str, String str2, int i11, jk.o oVar2) {
        super(oVar);
        this.C = c0Var;
        this.f13527x = i10;
        this.f13528y = str;
        this.f13529z = str2;
        this.A = i11;
        this.B = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle i10;
        try {
            rVar = this.C.f13323d;
            str = this.C.f13320a;
            Bundle m10 = c0.m(this.f13527x, this.f13528y, this.f13529z, this.A);
            i10 = c0.i();
            ((dk.l0) rVar.e()).Y0(str, m10, i10, new w(this.C, this.B));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
