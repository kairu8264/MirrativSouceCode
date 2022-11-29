package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class rs extends ct<ni0> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f9548b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z80 f9549c;

    public rs(bt btVar, Context context, z80 z80Var) {
        this.f9548b = context;
        this.f9549c = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ni0 a() {
        return null;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ni0 b() throws RemoteException {
        try {
            return ((qi0) xj0.a(this.f9548b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", qs.f9075a)).w0(yh.b.h1(this.f9548b), this.f9549c, 213806000);
        } catch (RemoteException | zzcgw | NullPointerException unused) {
            return null;
        }
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ ni0 c(ku kuVar) throws RemoteException {
        return kuVar.V4(yh.b.h1(this.f9548b), this.f9549c, 213806000);
    }
}
