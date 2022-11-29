package ai;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class zs extends ct<wt> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f13087b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13088c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z80 f13089d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bt f13090e;

    public zs(bt btVar, Context context, String str, z80 z80Var) {
        this.f13090e = btVar;
        this.f13087b = context;
        this.f13088c = str;
        this.f13089d = z80Var;
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ wt a() {
        bt.f(this.f13087b, "native_ad");
        return new jw();
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ wt b() throws RemoteException {
        rd0 rd0Var;
        wt utVar;
        xr xrVar;
        ox.a(this.f13087b);
        if (((Boolean) ft.c().c(ox.W6)).booleanValue()) {
            try {
                IBinder M1 = ((xt) xj0.a(this.f13087b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", ys.f12718a)).M1(yh.b.h1(this.f13087b), this.f13088c, this.f13089d, 213806000);
                if (M1 == null) {
                    return null;
                }
                IInterface queryLocalInterface = M1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof wt) {
                    utVar = (wt) queryLocalInterface;
                } else {
                    utVar = new ut(M1);
                }
                return utVar;
            } catch (RemoteException | zzcgw | NullPointerException e10) {
                this.f13090e.f2481h = pd0.c(this.f13087b);
                rd0Var = this.f13090e.f2481h;
                rd0Var.b(e10, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        xrVar = this.f13090e.f2475b;
        return xrVar.c(this.f13087b, this.f13088c, this.f13089d);
    }

    @Override // ai.ct
    public final /* bridge */ /* synthetic */ wt c(ku kuVar) throws RemoteException {
        return kuVar.v5(yh.b.h1(this.f13087b), this.f13088c, this.f13089d, 213806000);
    }
}
