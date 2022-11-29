package ak;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Map f13491x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ jk.o f13492y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ c0 f13493z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c0 c0Var, jk.o oVar, Map map, jk.o oVar2) {
        super(oVar);
        this.f13493z = c0Var;
        this.f13491x = map;
        this.f13492y = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        try {
            rVar = this.f13493z.f13323d;
            str = this.f13493z.f13320a;
            ((dk.l0) rVar.e()).K2(str, c0.p(this.f13491x), new u(this.f13493z, this.f13492y));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "syncPacks", new Object[0]);
            this.f13492y.d(new RuntimeException(e10));
        }
    }
}
