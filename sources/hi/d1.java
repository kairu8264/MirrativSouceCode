package hi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class d1 extends o0 implements f1 {
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // hi.f1
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeLong(j10);
        z0(23, i02);
    }

    @Override // hi.f1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.d(i02, bundle);
        z0(9, i02);
    }

    @Override // hi.f1
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeLong(j10);
        z0(24, i02);
    }

    @Override // hi.f1
    public final void generateEventId(i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, i1Var);
        z0(22, i02);
    }

    @Override // hi.f1
    public final void getCachedAppInstanceId(i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, i1Var);
        z0(19, i02);
    }

    @Override // hi.f1
    public final void getConditionalUserProperties(String str, String str2, i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.e(i02, i1Var);
        z0(10, i02);
    }

    @Override // hi.f1
    public final void getCurrentScreenClass(i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, i1Var);
        z0(17, i02);
    }

    @Override // hi.f1
    public final void getCurrentScreenName(i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, i1Var);
        z0(16, i02);
    }

    @Override // hi.f1
    public final void getGmpAppId(i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, i1Var);
        z0(21, i02);
    }

    @Override // hi.f1
    public final void getMaxUserProperties(String str, i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        q0.e(i02, i1Var);
        z0(6, i02);
    }

    @Override // hi.f1
    public final void getUserProperties(String str, String str2, boolean z10, i1 i1Var) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.c(i02, z10);
        q0.e(i02, i1Var);
        z0(5, i02);
    }

    @Override // hi.f1
    public final void initialize(yh.a aVar, o1 o1Var, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        q0.d(i02, o1Var);
        i02.writeLong(j10);
        z0(1, i02);
    }

    @Override // hi.f1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.d(i02, bundle);
        q0.c(i02, z10);
        q0.c(i02, z11);
        i02.writeLong(j10);
        z0(2, i02);
    }

    @Override // hi.f1
    public final void logHealthData(int i10, String str, yh.a aVar, yh.a aVar2, yh.a aVar3) throws RemoteException {
        Parcel i02 = i0();
        i02.writeInt(5);
        i02.writeString(str);
        q0.e(i02, aVar);
        q0.e(i02, aVar2);
        q0.e(i02, aVar3);
        z0(33, i02);
    }

    @Override // hi.f1
    public final void onActivityCreated(yh.a aVar, Bundle bundle, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        q0.d(i02, bundle);
        i02.writeLong(j10);
        z0(27, i02);
    }

    @Override // hi.f1
    public final void onActivityDestroyed(yh.a aVar, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeLong(j10);
        z0(28, i02);
    }

    @Override // hi.f1
    public final void onActivityPaused(yh.a aVar, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeLong(j10);
        z0(29, i02);
    }

    @Override // hi.f1
    public final void onActivityResumed(yh.a aVar, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeLong(j10);
        z0(30, i02);
    }

    @Override // hi.f1
    public final void onActivitySaveInstanceState(yh.a aVar, i1 i1Var, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        q0.e(i02, i1Var);
        i02.writeLong(j10);
        z0(31, i02);
    }

    @Override // hi.f1
    public final void onActivityStarted(yh.a aVar, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeLong(j10);
        z0(25, i02);
    }

    @Override // hi.f1
    public final void onActivityStopped(yh.a aVar, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeLong(j10);
        z0(26, i02);
    }

    @Override // hi.f1
    public final void performAction(Bundle bundle, i1 i1Var, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.d(i02, bundle);
        q0.e(i02, i1Var);
        i02.writeLong(j10);
        z0(32, i02);
    }

    @Override // hi.f1
    public final void registerOnMeasurementEventListener(l1 l1Var) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, l1Var);
        z0(35, i02);
    }

    @Override // hi.f1
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.d(i02, bundle);
        i02.writeLong(j10);
        z0(8, i02);
    }

    @Override // hi.f1
    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.d(i02, bundle);
        i02.writeLong(j10);
        z0(44, i02);
    }

    @Override // hi.f1
    public final void setCurrentScreen(yh.a aVar, String str, String str2, long j10) throws RemoteException {
        Parcel i02 = i0();
        q0.e(i02, aVar);
        i02.writeString(str);
        i02.writeString(str2);
        i02.writeLong(j10);
        z0(15, i02);
    }

    @Override // hi.f1
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel i02 = i0();
        q0.c(i02, z10);
        z0(39, i02);
    }

    @Override // hi.f1
    public final void setUserProperty(String str, String str2, yh.a aVar, boolean z10, long j10) throws RemoteException {
        Parcel i02 = i0();
        i02.writeString(str);
        i02.writeString(str2);
        q0.e(i02, aVar);
        q0.c(i02, z10);
        i02.writeLong(j10);
        z0(4, i02);
    }
}
