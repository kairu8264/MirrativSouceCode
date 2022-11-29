package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes3.dex */
public abstract class ct<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final ku f2923a;

    static {
        ku iuVar;
        ku kuVar = null;
        try {
            Object newInstance = bt.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                uj0.f("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof ku) {
                        iuVar = (ku) queryLocalInterface;
                    } else {
                        iuVar = new iu(iBinder);
                    }
                    kuVar = iuVar;
                }
            }
        } catch (Exception unused) {
            uj0.f("Failed to instantiate ClientApi class.");
        }
        f2923a = kuVar;
    }

    public abstract T a();

    public abstract T b() throws RemoteException;

    public abstract T c(ku kuVar) throws RemoteException;

    public final T d(Context context, boolean z10) {
        boolean z11;
        T e10;
        if (!z10) {
            dt.a();
            if (!nj0.l(context, nh.g.f43544a)) {
                uj0.a("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = z10 | (!(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)));
        ox.a(context);
        if (yy.f12764a.e().booleanValue()) {
            z11 = false;
        } else if (yy.f12765b.e().booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z13;
            z11 = false;
        }
        if (z12) {
            e10 = e();
            if (e10 == null && !z11) {
                e10 = f();
            }
        } else {
            T f10 = f();
            if (f10 == null) {
                if (dt.e().nextInt(kz.f6408a.e().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(ActionLogBase.ACTION, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    dt.a().e(context, dt.d().f13013w, "gmob-apps", bundle, true);
                }
            }
            e10 = f10 == null ? e() : f10;
        }
        return e10 == null ? a() : e10;
    }

    public final T e() {
        ku kuVar = f2923a;
        if (kuVar == null) {
            uj0.f("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(kuVar);
        } catch (RemoteException e10) {
            uj0.g("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    public final T f() {
        try {
            return b();
        } catch (RemoteException e10) {
            uj0.g("Cannot invoke remote loader.", e10);
            return null;
        }
    }
}
