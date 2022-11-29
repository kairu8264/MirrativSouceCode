package ph;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import ph.n;

/* loaded from: classes3.dex */
public final class u0 extends n {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n.a f47561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(n.a aVar, nh.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.f47561d = aVar;
    }

    @Override // ph.n
    public final void b(a.b bVar, vi.h hVar) throws RemoteException {
        l lVar;
        lVar = this.f47561d.f47531a;
        lVar.a(bVar, hVar);
    }
}
