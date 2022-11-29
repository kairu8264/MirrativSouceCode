package ak;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i extends dk.g {
    public final /* synthetic */ List A;
    public final /* synthetic */ c0 B;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List f13407x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Map f13408y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ jk.o f13409z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c0 c0Var, jk.o oVar, List list, Map map, jk.o oVar2, List list2) {
        super(oVar);
        this.B = c0Var;
        this.f13407x = list;
        this.f13408y = map;
        this.f13409z = oVar2;
        this.A = list2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        t1 t1Var;
        i3 i3Var;
        ArrayList x10 = c0.x(this.f13407x);
        try {
            rVar = this.B.f13323d;
            str = this.B.f13320a;
            Bundle p10 = c0.p(this.f13408y);
            c0 c0Var = this.B;
            jk.o oVar = this.f13409z;
            t1Var = c0Var.f13321b;
            i3Var = this.B.f13322c;
            ((dk.l0) rVar.e()).g3(str, x10, p10, new b0(c0Var, oVar, t1Var, i3Var, this.A));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "startDownload(%s)", this.f13407x);
            this.f13409z.d(new RuntimeException(e10));
        }
    }
}
