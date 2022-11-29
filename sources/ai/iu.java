package ai;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class iu extends k2 implements ku {
    public iu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // ai.ku
    public final ec0 A5(yh.a aVar, z80 z80Var, int i10) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(15, i02);
        ec0 R5 = dc0.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.ku
    public final qc0 P(yh.a aVar) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        Parcel s02 = s0(8, i02);
        qc0 R5 = pc0.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.ku
    public final ni0 V4(yh.a aVar, z80 z80Var, int i10) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(14, i02);
        ni0 R5 = mi0.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.ku
    public final au d2(yh.a aVar, fs fsVar, String str, z80 z80Var, int i10) throws RemoteException {
        au ytVar;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(2, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            ytVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof au) {
                ytVar = (au) queryLocalInterface;
            } else {
                ytVar = new yt(readStrongBinder);
            }
        }
        s02.recycle();
        return ytVar;
    }

    @Override // ai.ku
    public final au e2(yh.a aVar, fs fsVar, String str, int i10) throws RemoteException {
        au ytVar;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        i02.writeString(str);
        i02.writeInt(213806000);
        Parcel s02 = s0(10, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            ytVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof au) {
                ytVar = (au) queryLocalInterface;
            } else {
                ytVar = new yt(readStrongBinder);
            }
        }
        s02.recycle();
        return ytVar;
    }

    @Override // ai.ku
    public final au h3(yh.a aVar, fs fsVar, String str, z80 z80Var, int i10) throws RemoteException {
        au ytVar;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        m2.d(i02, fsVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(1, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            ytVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof au) {
                ytVar = (au) queryLocalInterface;
            } else {
                ytVar = new yt(readStrongBinder);
            }
        }
        s02.recycle();
        return ytVar;
    }

    @Override // ai.ku
    public final sf0 i3(yh.a aVar, String str, z80 z80Var, int i10) throws RemoteException {
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(12, i02);
        sf0 R5 = rf0.R5(s02.readStrongBinder());
        s02.recycle();
        return R5;
    }

    @Override // ai.ku
    public final wt v5(yh.a aVar, String str, z80 z80Var, int i10) throws RemoteException {
        wt utVar;
        Parcel i02 = i0();
        m2.f(i02, aVar);
        i02.writeString(str);
        m2.f(i02, z80Var);
        i02.writeInt(213806000);
        Parcel s02 = s0(3, i02);
        IBinder readStrongBinder = s02.readStrongBinder();
        if (readStrongBinder == null) {
            utVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof wt) {
                utVar = (wt) queryLocalInterface;
            } else {
                utVar = new ut(readStrongBinder);
            }
        }
        s02.recycle();
        return utVar;
    }
}
