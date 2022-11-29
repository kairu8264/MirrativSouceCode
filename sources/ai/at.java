package ai;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class at extends ct<sf0> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f1993b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1994c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z80 f1995d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bt f1996e;

    public at(bt btVar, Context context, String str, z80 z80Var) {
        this.f1996e = btVar;
        this.f1993b = context;
        this.f1994c = str;
        this.f1995d = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ sf0 a() {
        bt.f(this.f1993b, "rewarded");
        return new nw();
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ sf0 b() throws RemoteException {
        return fg0.a(this.f1993b, this.f1994c, this.f1995d);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ sf0 c(ku kuVar) throws RemoteException {
        return kuVar.i3(yh.b.h1(this.f1993b), this.f1994c, this.f1995d, 213806000);
    }
}
