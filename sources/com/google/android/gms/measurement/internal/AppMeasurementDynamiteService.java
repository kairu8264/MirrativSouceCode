package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import hi.e1;
import hi.i1;
import hi.l1;
import hi.n1;
import hi.o1;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import pi.b5;
import pi.d6;
import pi.g7;
import pi.h6;
import pi.h7;
import pi.h8;
import pi.i7;
import pi.i9;
import pi.ia;
import pi.ja;
import pi.k6;
import pi.ka;
import pi.la;
import pi.m6;
import pi.ma;
import pi.o7;
import pi.s;
import pi.u;
import rh.p;
import s.a;
import yh.b;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends e1 {

    /* renamed from: w  reason: collision with root package name */
    public b5 f27294w = null;

    /* renamed from: x  reason: collision with root package name */
    public final Map<Integer, d6> f27295x = new a();

    @Override // hi.f1
    public void beginAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.f27294w.x().j(str, j10);
    }

    @Override // hi.f1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f27294w.I().h0(str, str2, bundle);
    }

    @Override // hi.f1
    public void clearMeasurementEnabled(long j10) throws RemoteException {
        zzb();
        this.f27294w.I().J(null);
    }

    @Override // hi.f1
    public void endAdUnitExposure(String str, long j10) throws RemoteException {
        zzb();
        this.f27294w.x().k(str, j10);
    }

    @Override // hi.f1
    public void generateEventId(i1 i1Var) throws RemoteException {
        zzb();
        long r02 = this.f27294w.N().r0();
        zzb();
        this.f27294w.N().H(i1Var, r02);
    }

    @Override // hi.f1
    public void getAppInstanceId(i1 i1Var) throws RemoteException {
        zzb();
        this.f27294w.a().y(new h6(this, i1Var));
    }

    @Override // hi.f1
    public void getCachedAppInstanceId(i1 i1Var) throws RemoteException {
        zzb();
        s0(i1Var, this.f27294w.I().X());
    }

    @Override // hi.f1
    public void getConditionalUserProperties(String str, String str2, i1 i1Var) throws RemoteException {
        zzb();
        this.f27294w.a().y(new ja(this, i1Var, str, str2));
    }

    @Override // hi.f1
    public void getCurrentScreenClass(i1 i1Var) throws RemoteException {
        zzb();
        s0(i1Var, this.f27294w.I().Y());
    }

    @Override // hi.f1
    public void getCurrentScreenName(i1 i1Var) throws RemoteException {
        zzb();
        s0(i1Var, this.f27294w.I().Z());
    }

    @Override // hi.f1
    public void getGmpAppId(i1 i1Var) throws RemoteException {
        String str;
        zzb();
        i7 I = this.f27294w.I();
        if (I.f48285a.O() != null) {
            str = I.f48285a.O();
        } else {
            try {
                str = o7.c(I.f48285a.F(), "google_app_id", I.f48285a.R());
            } catch (IllegalStateException e10) {
                I.f48285a.r().p().b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        s0(i1Var, str);
    }

    @Override // hi.f1
    public void getMaxUserProperties(String str, i1 i1Var) throws RemoteException {
        zzb();
        this.f27294w.I().S(str);
        zzb();
        this.f27294w.N().G(i1Var, 25);
    }

    @Override // hi.f1
    public void getTestFlag(i1 i1Var, int i10) throws RemoteException {
        zzb();
        if (i10 == 0) {
            this.f27294w.N().I(i1Var, this.f27294w.I().a0());
        } else if (i10 == 1) {
            this.f27294w.N().H(i1Var, this.f27294w.I().W().longValue());
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f27294w.N().G(i1Var, this.f27294w.I().V().intValue());
            } else if (i10 != 4) {
            } else {
                this.f27294w.N().B(i1Var, this.f27294w.I().T().booleanValue());
            }
        } else {
            ia N = this.f27294w.N();
            double doubleValue = this.f27294w.I().U().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(TopicConstant.EXTEND_AAC_RAW, doubleValue);
            try {
                i1Var.g0(bundle);
            } catch (RemoteException e10) {
                N.f48285a.r().v().b("Error returning double value to wrapper", e10);
            }
        }
    }

    @Override // hi.f1
    public void getUserProperties(String str, String str2, boolean z10, i1 i1Var) throws RemoteException {
        zzb();
        this.f27294w.a().y(new h8(this, i1Var, str, str2, z10));
    }

    @Override // hi.f1
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // hi.f1
    public void initialize(yh.a aVar, o1 o1Var, long j10) throws RemoteException {
        b5 b5Var = this.f27294w;
        if (b5Var == null) {
            this.f27294w = b5.H((Context) p.i((Context) b.z0(aVar)), o1Var, Long.valueOf(j10));
        } else {
            b5Var.r().v().a("Attempting to initialize multiple times");
        }
    }

    @Override // hi.f1
    public void isDataCollectionEnabled(i1 i1Var) throws RemoteException {
        zzb();
        this.f27294w.a().y(new ka(this, i1Var));
    }

    @Override // hi.f1
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        zzb();
        this.f27294w.I().q(str, str2, bundle, z10, z11, j10);
    }

    @Override // hi.f1
    public void logEventAndBundle(String str, String str2, Bundle bundle, i1 i1Var, long j10) throws RemoteException {
        Bundle bundle2;
        zzb();
        p.e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f27294w.a().y(new h7(this, i1Var, new u(str2, new s(bundle), "app", j10), str));
    }

    @Override // hi.f1
    public void logHealthData(int i10, String str, yh.a aVar, yh.a aVar2, yh.a aVar3) throws RemoteException {
        zzb();
        this.f27294w.r().E(i10, true, false, str, aVar == null ? null : b.z0(aVar), aVar2 == null ? null : b.z0(aVar2), aVar3 != null ? b.z0(aVar3) : null);
    }

    @Override // hi.f1
    public void onActivityCreated(yh.a aVar, Bundle bundle, long j10) throws RemoteException {
        zzb();
        g7 g7Var = this.f27294w.I().f47938c;
        if (g7Var != null) {
            this.f27294w.I().m();
            g7Var.onActivityCreated((Activity) b.z0(aVar), bundle);
        }
    }

    @Override // hi.f1
    public void onActivityDestroyed(yh.a aVar, long j10) throws RemoteException {
        zzb();
        g7 g7Var = this.f27294w.I().f47938c;
        if (g7Var != null) {
            this.f27294w.I().m();
            g7Var.onActivityDestroyed((Activity) b.z0(aVar));
        }
    }

    @Override // hi.f1
    public void onActivityPaused(yh.a aVar, long j10) throws RemoteException {
        zzb();
        g7 g7Var = this.f27294w.I().f47938c;
        if (g7Var != null) {
            this.f27294w.I().m();
            g7Var.onActivityPaused((Activity) b.z0(aVar));
        }
    }

    @Override // hi.f1
    public void onActivityResumed(yh.a aVar, long j10) throws RemoteException {
        zzb();
        g7 g7Var = this.f27294w.I().f47938c;
        if (g7Var != null) {
            this.f27294w.I().m();
            g7Var.onActivityResumed((Activity) b.z0(aVar));
        }
    }

    @Override // hi.f1
    public void onActivitySaveInstanceState(yh.a aVar, i1 i1Var, long j10) throws RemoteException {
        zzb();
        g7 g7Var = this.f27294w.I().f47938c;
        Bundle bundle = new Bundle();
        if (g7Var != null) {
            this.f27294w.I().m();
            g7Var.onActivitySaveInstanceState((Activity) b.z0(aVar), bundle);
        }
        try {
            i1Var.g0(bundle);
        } catch (RemoteException e10) {
            this.f27294w.r().v().b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // hi.f1
    public void onActivityStarted(yh.a aVar, long j10) throws RemoteException {
        zzb();
        if (this.f27294w.I().f47938c != null) {
            this.f27294w.I().m();
            Activity activity = (Activity) b.z0(aVar);
        }
    }

    @Override // hi.f1
    public void onActivityStopped(yh.a aVar, long j10) throws RemoteException {
        zzb();
        if (this.f27294w.I().f47938c != null) {
            this.f27294w.I().m();
            Activity activity = (Activity) b.z0(aVar);
        }
    }

    @Override // hi.f1
    public void performAction(Bundle bundle, i1 i1Var, long j10) throws RemoteException {
        zzb();
        i1Var.g0(null);
    }

    @Override // hi.f1
    public void registerOnMeasurementEventListener(l1 l1Var) throws RemoteException {
        d6 d6Var;
        zzb();
        synchronized (this.f27295x) {
            d6Var = this.f27295x.get(Integer.valueOf(l1Var.d()));
            if (d6Var == null) {
                d6Var = new ma(this, l1Var);
                this.f27295x.put(Integer.valueOf(l1Var.d()), d6Var);
            }
        }
        this.f27294w.I().w(d6Var);
    }

    @Override // hi.f1
    public void resetAnalyticsData(long j10) throws RemoteException {
        zzb();
        this.f27294w.I().x(j10);
    }

    public final void s0(i1 i1Var, String str) {
        zzb();
        this.f27294w.N().I(i1Var, str);
    }

    @Override // hi.f1
    public void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f27294w.r().p().a("Conditional user property must not be null");
        } else {
            this.f27294w.I().D(bundle, j10);
        }
    }

    @Override // hi.f1
    public void setConsent(Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.f27294w.I().H(bundle, j10);
    }

    @Override // hi.f1
    public void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        zzb();
        this.f27294w.I().E(bundle, -20, j10);
    }

    @Override // hi.f1
    public void setCurrentScreen(yh.a aVar, String str, String str2, long j10) throws RemoteException {
        zzb();
        this.f27294w.K().D((Activity) b.z0(aVar), str, str2);
    }

    @Override // hi.f1
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        zzb();
        i7 I = this.f27294w.I();
        I.g();
        I.f48285a.a().y(new k6(I, z10));
    }

    @Override // hi.f1
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final i7 I = this.f27294w.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        I.f48285a.a().y(new Runnable() { // from class: pi.i6
            @Override // java.lang.Runnable
            public final void run() {
                i7.this.o(bundle2);
            }
        });
    }

    @Override // hi.f1
    public void setEventInterceptor(l1 l1Var) throws RemoteException {
        zzb();
        la laVar = new la(this, l1Var);
        if (this.f27294w.a().B()) {
            this.f27294w.I().I(laVar);
        } else {
            this.f27294w.a().y(new i9(this, laVar));
        }
    }

    @Override // hi.f1
    public void setInstanceIdProvider(n1 n1Var) throws RemoteException {
        zzb();
    }

    @Override // hi.f1
    public void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        zzb();
        this.f27294w.I().J(Boolean.valueOf(z10));
    }

    @Override // hi.f1
    public void setMinimumSessionDuration(long j10) throws RemoteException {
        zzb();
    }

    @Override // hi.f1
    public void setSessionTimeoutDuration(long j10) throws RemoteException {
        zzb();
        i7 I = this.f27294w.I();
        I.f48285a.a().y(new m6(I, j10));
    }

    @Override // hi.f1
    public void setUserId(String str, long j10) throws RemoteException {
        zzb();
        if (str != null && str.length() == 0) {
            this.f27294w.r().v().a("User ID must be non-empty");
        } else {
            this.f27294w.I().M(null, "_id", str, true, j10);
        }
    }

    @Override // hi.f1
    public void setUserProperty(String str, String str2, yh.a aVar, boolean z10, long j10) throws RemoteException {
        zzb();
        this.f27294w.I().M(str, str2, b.z0(aVar), z10, j10);
    }

    @Override // hi.f1
    public void unregisterOnMeasurementEventListener(l1 l1Var) throws RemoteException {
        d6 remove;
        zzb();
        synchronized (this.f27295x) {
            remove = this.f27295x.remove(Integer.valueOf(l1Var.d()));
        }
        if (remove == null) {
            remove = new ma(this, l1Var);
        }
        this.f27294w.I().O(remove);
    }

    @EnsuresNonNull({"scion"})
    public final void zzb() {
        if (this.f27294w == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
