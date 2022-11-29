package ak;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l extends dk.g {
    public final /* synthetic */ l0 A;
    public final /* synthetic */ c0 B;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List f13513x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Map f13514y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ jk.o f13515z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c0 c0Var, jk.o oVar, List list, Map map, jk.o oVar2, l0 l0Var) {
        super(oVar);
        this.B = c0Var;
        this.f13513x = list;
        this.f13514y = map;
        this.f13515z = oVar2;
        this.A = l0Var;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        t1 t1Var;
        i3 i3Var;
        ArrayList x10 = c0.x(this.f13513x);
        try {
            rVar = this.B.f13323d;
            str = this.B.f13320a;
            Bundle p10 = c0.p(this.f13514y);
            c0 c0Var = this.B;
            jk.o oVar = this.f13515z;
            t1Var = c0Var.f13321b;
            i3Var = this.B.f13322c;
            ((dk.l0) rVar.e()).R0(str, x10, p10, new a0(c0Var, oVar, t1Var, i3Var, this.A));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "getPackStates(%s)", this.f13513x);
            this.f13515z.d(new RuntimeException(e10));
        }
    }
}
