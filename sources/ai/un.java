package ai;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgw;

/* loaded from: classes3.dex */
public final class un {

    /* renamed from: a  reason: collision with root package name */
    public wb f10758a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10759b;

    public un() {
    }

    public un(Context context) {
        ox.a(context);
        if (((Boolean) ft.c().c(ox.f8056o3)).booleanValue()) {
            try {
                this.f10758a = (wb) xj0.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", rn.f9506a);
                yh.b.h1(context);
                this.f10758a.b4(yh.b.h1(context), "GMA_SDK");
                this.f10759b = true;
            } catch (RemoteException | zzcgw | NullPointerException unused) {
                uj0.a("Cannot dynamite load clearcut");
            }
        }
    }
}
