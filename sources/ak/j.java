package ak;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class j extends dk.g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List f13465x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ jk.o f13466y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ c0 f13467z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c0 c0Var, jk.o oVar, List list, jk.o oVar2) {
        super(oVar);
        this.f13467z = c0Var;
        this.f13465x = list;
        this.f13466y = oVar2;
    }

    @Override // dk.g
    public final void a() {
        dk.f fVar;
        dk.r rVar;
        String str;
        Bundle i10;
        ArrayList x10 = c0.x(this.f13465x);
        try {
            rVar = this.f13467z.f13323d;
            str = this.f13467z.f13320a;
            i10 = c0.i();
            ((dk.l0) rVar.e()).v3(str, x10, i10, new s(this.f13467z, this.f13466y));
        } catch (RemoteException e10) {
            fVar = c0.f13318g;
            fVar.c(e10, "cancelDownloads(%s)", this.f13465x);
        }
    }
}
