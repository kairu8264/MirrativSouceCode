package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xs extends ct<au> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f12097b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fs f12098c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f12099d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z80 f12100e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ bt f12101f;

    public xs(bt btVar, Context context, fs fsVar, String str, z80 z80Var) {
        this.f12101f = btVar;
        this.f12097b = context;
        this.f12098c = fsVar;
        this.f12099d = str;
        this.f12100e = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au a() {
        bt.f(this.f12097b, "interstitial");
        return new lw();
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au b() throws RemoteException {
        zr zrVar;
        zrVar = this.f12101f.f2474a;
        return zrVar.c(this.f12097b, this.f12098c, this.f12099d, this.f12100e, 2);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au c(ku kuVar) throws RemoteException {
        return kuVar.d2(yh.b.h1(this.f12097b), this.f12098c, this.f12099d, this.f12100e, 213806000);
    }
}
