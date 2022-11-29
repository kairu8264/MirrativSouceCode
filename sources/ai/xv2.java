package ai;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzfjm;

/* loaded from: classes3.dex */
public final class xv2 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12323a;

    /* renamed from: b  reason: collision with root package name */
    public yv2 f12324b;

    public xv2(Context context, String str, String str2) {
        yv2 yv2Var;
        try {
            try {
                try {
                    IBinder d10 = DynamiteModule.e(context, DynamiteModule.f27228b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d10 == null) {
                        yv2Var = null;
                    } else {
                        IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof yv2) {
                            yv2Var = (yv2) queryLocalInterface;
                        } else {
                            yv2Var = new yv2(d10);
                        }
                    }
                    this.f12324b = yv2Var;
                    this.f12324b.B4(yh.b.h1(context), str, null);
                    this.f12323a = true;
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                } catch (Exception e10) {
                    throw new zzfjm(e10);
                }
            } catch (Exception e11) {
                throw new zzfjm(e11);
            }
        } catch (RemoteException | zzfjm | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
        }
    }

    public final vv2 a(byte[] bArr) {
        return new vv2(this, bArr, null);
    }
}
