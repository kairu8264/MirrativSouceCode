package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class ws extends ct<au> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f11732b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fs f11733c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f11734d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bt f11735e;

    public ws(bt btVar, Context context, fs fsVar, String str) {
        this.f11735e = btVar;
        this.f11732b = context;
        this.f11733c = fsVar;
        this.f11734d = str;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au a() {
        bt.f(this.f11732b, "search");
        return new lw();
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au b() throws RemoteException {
        zr zrVar;
        zrVar = this.f11735e.f2474a;
        return zrVar.c(this.f11732b, this.f11733c, this.f11734d, null, 3);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au c(ku kuVar) throws RemoteException {
        return kuVar.e2(yh.b.h1(this.f11732b), this.f11733c, this.f11734d, 213806000);
    }
}
