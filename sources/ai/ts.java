package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class ts extends ct<ec0> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f10401b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z80 f10402c;

    public ts(bt btVar, Context context, z80 z80Var) {
        this.f10401b = context;
        this.f10402c = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ec0 a() {
        return null;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ec0 b() throws RemoteException {
        try {
            return ((hc0) xj0.a(this.f10401b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", ss.f9935a)).w0(yh.b.h1(this.f10401b), this.f10402c, 213806000);
        } catch (RemoteException | zzcgw | NullPointerException unused) {
            return null;
        }
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ec0 c(ku kuVar) throws RemoteException {
        return kuVar.A5(yh.b.h1(this.f10401b), this.f10402c, 213806000);
    }
}
