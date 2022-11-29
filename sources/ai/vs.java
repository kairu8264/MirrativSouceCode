package ai;

import android.content.Context;
import android.os.RemoteException;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes3.dex */
public final class vs extends ct<au> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f11170b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fs f11171c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f11172d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z80 f11173e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ bt f11174f;

    public vs(bt btVar, Context context, fs fsVar, String str, z80 z80Var) {
        this.f11174f = btVar;
        this.f11170b = context;
        this.f11171c = fsVar;
        this.f11172d = str;
        this.f11173e = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au a() {
        bt.f(this.f11170b, MRLog.TARGET_TYPE_BANNER);
        return new lw();
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au b() throws RemoteException {
        zr zrVar;
        zrVar = this.f11174f.f2474a;
        return zrVar.c(this.f11170b, this.f11171c, this.f11172d, this.f11173e, 1);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ au c(ku kuVar) throws RemoteException {
        return kuVar.h3(yh.b.h1(this.f11170b), this.f11171c, this.f11172d, this.f11173e, 213806000);
    }
}
