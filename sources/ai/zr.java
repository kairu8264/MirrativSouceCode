package ai;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class zr extends RemoteCreator<bu> {

    /* renamed from: c  reason: collision with root package name */
    public rd0 f13076c;

    public zr() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ bu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof bu) {
            return (bu) queryLocalInterface;
        }
        return new bu(iBinder);
    }

    public final au c(Context context, fs fsVar, String str, z80 z80Var, int i10) {
        au ytVar;
        au ytVar2;
        ox.a(context);
        if (((Boolean) ft.c().c(ox.W6)).booleanValue()) {
            try {
                IBinder M1 = ((bu) xj0.a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", yr.f12710a)).M1(yh.b.h1(context), fsVar, str, z80Var, 213806000, i10);
                if (M1 == null) {
                    return null;
                }
                IInterface queryLocalInterface = M1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof au) {
                    ytVar = (au) queryLocalInterface;
                } else {
                    ytVar = new yt(M1);
                }
                return ytVar;
            } catch (RemoteException | zzcgw | NullPointerException e10) {
                rd0 c10 = pd0.c(context);
                this.f13076c = c10;
                c10.b(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                uj0.i("#007 Could not call remote method.", e10);
                return null;
            }
        }
        try {
            IBinder M12 = b(context).M1(yh.b.h1(context), fsVar, str, z80Var, 213806000, i10);
            if (M12 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = M12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof au) {
                ytVar2 = (au) queryLocalInterface2;
            } else {
                ytVar2 = new yt(M12);
            }
            return ytVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e11) {
            uj0.b("Could not create remote AdManager.", e11);
            return null;
        }
    }
}
