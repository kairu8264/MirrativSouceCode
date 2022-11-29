package hi;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yh.a;

/* loaded from: classes3.dex */
public abstract class e1 extends p0 implements f1 {
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static f1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof f1 ? (f1) queryLocalInterface : new d1(iBinder);
    }

    @Override // hi.p0
    public final boolean i0(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        i1 g1Var;
        i1 i1Var = null;
        i1 i1Var2 = null;
        i1 i1Var3 = null;
        l1 l1Var = null;
        l1 l1Var2 = null;
        l1 l1Var3 = null;
        i1 i1Var4 = null;
        i1 i1Var5 = null;
        i1 i1Var6 = null;
        i1 i1Var7 = null;
        i1 i1Var8 = null;
        i1 i1Var9 = null;
        n1 n1Var = null;
        i1 i1Var10 = null;
        i1 i1Var11 = null;
        i1 i1Var12 = null;
        i1 i1Var13 = null;
        switch (i10) {
            case 1:
                initialize(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (o1) q0.a(parcel, o1.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR), q0.f(parcel), q0.f(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    g1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    g1Var = queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new g1(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, g1Var, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), q0.f(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean f10 = q0.f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var = queryLocalInterface2 instanceof i1 ? (i1) queryLocalInterface2 : new g1(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, f10, i1Var);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var13 = queryLocalInterface3 instanceof i1 ? (i1) queryLocalInterface3 : new g1(readStrongBinder3);
                }
                getMaxUserProperties(readString5, i1Var13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) q0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) q0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var12 = queryLocalInterface4 instanceof i1 ? (i1) queryLocalInterface4 : new g1(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, i1Var12);
                break;
            case 11:
                setMeasurementEnabled(q0.f(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var11 = queryLocalInterface5 instanceof i1 ? (i1) queryLocalInterface5 : new g1(readStrongBinder5);
                }
                getCurrentScreenName(i1Var11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var10 = queryLocalInterface6 instanceof i1 ? (i1) queryLocalInterface6 : new g1(readStrongBinder6);
                }
                getCurrentScreenClass(i1Var10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    n1Var = queryLocalInterface7 instanceof n1 ? (n1) queryLocalInterface7 : new m1(readStrongBinder7);
                }
                setInstanceIdProvider(n1Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var9 = queryLocalInterface8 instanceof i1 ? (i1) queryLocalInterface8 : new g1(readStrongBinder8);
                }
                getCachedAppInstanceId(i1Var9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var8 = queryLocalInterface9 instanceof i1 ? (i1) queryLocalInterface9 : new g1(readStrongBinder9);
                }
                getAppInstanceId(i1Var8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var7 = queryLocalInterface10 instanceof i1 ? (i1) queryLocalInterface10 : new g1(readStrongBinder10);
                }
                getGmpAppId(i1Var7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var6 = queryLocalInterface11 instanceof i1 ? (i1) queryLocalInterface11 : new g1(readStrongBinder11);
                }
                generateEventId(i1Var6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), (Bundle) q0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                yh.a s02 = a.AbstractBinderC1060a.s0(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var5 = queryLocalInterface12 instanceof i1 ? (i1) queryLocalInterface12 : new g1(readStrongBinder12);
                }
                onActivitySaveInstanceState(s02, i1Var5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) q0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var4 = queryLocalInterface13 instanceof i1 ? (i1) queryLocalInterface13 : new g1(readStrongBinder13);
                }
                performAction(bundle2, i1Var4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()), a.AbstractBinderC1060a.s0(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var3 = queryLocalInterface14 instanceof l1 ? (l1) queryLocalInterface14 : new j1(readStrongBinder14);
                }
                setEventInterceptor(l1Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var2 = queryLocalInterface15 instanceof l1 ? (l1) queryLocalInterface15 : new j1(readStrongBinder15);
                }
                registerOnMeasurementEventListener(l1Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l1Var = queryLocalInterface16 instanceof l1 ? (l1) queryLocalInterface16 : new j1(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(l1Var);
                break;
            case 37:
                initForTests(q0.b(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var3 = queryLocalInterface17 instanceof i1 ? (i1) queryLocalInterface17 : new g1(readStrongBinder17);
                }
                getTestFlag(i1Var3, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(q0.f(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    i1Var2 = queryLocalInterface18 instanceof i1 ? (i1) queryLocalInterface18 : new g1(readStrongBinder18);
                }
                isDataCollectionEnabled(i1Var2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) q0.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) q0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) q0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
