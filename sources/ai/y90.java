package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzcoh;
import com.google.android.gms.internal.ads.zzcoi;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y90 extends b90 {
    public View A;
    public ah.l B;
    public ah.v C;
    public ah.q D;
    public ah.k E;
    public final String F = "";

    /* renamed from: w  reason: collision with root package name */
    public final Object f12483w;

    /* renamed from: x  reason: collision with root package name */
    public aa0 f12484x;

    /* renamed from: y  reason: collision with root package name */
    public kf0 f12485y;

    /* renamed from: z  reason: collision with root package name */
    public yh.a f12486z;

    public y90(ah.a aVar) {
        this.f12483w = aVar;
    }

    public static final boolean T5(as asVar) {
        if (asVar.B) {
            return true;
        }
        dt.a();
        return nj0.k();
    }

    public static final String U5(String str, as asVar) {
        String str2 = asVar.Q;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // ai.c90
    public final void A2(yh.a aVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f12483w;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof ah.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = ah.a.class.getCanonicalName();
            String canonicalName3 = this.f12483w.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb2.append(canonicalName);
            sb2.append(" or ");
            sb2.append(canonicalName2);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName3);
            uj0.f(sb2.toString());
            throw new RemoteException();
        }
        uj0.a("Requesting interstitial ad from adapter.");
        Object obj2 = this.f12483w;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List<String> list = asVar.A;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = asVar.f1984x;
                q90 q90Var = new q90(j10 == -1 ? null : new Date(j10), asVar.f1986z, hashSet, asVar.G, T5(asVar), asVar.C, asVar.N, asVar.P, U5(str, asVar));
                Bundle bundle = asVar.I;
                mediationInterstitialAdapter.requestInterstitialAd((Context) yh.b.z0(aVar), new aa0(f90Var), R5(str, asVar, str2), q90Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } finally {
            }
        } else if (obj2 instanceof ah.a) {
            try {
                ((ah.a) obj2).loadInterstitialAd(new ah.m((Context) yh.b.z0(aVar), "", R5(str, asVar, str2), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), this.F), new v90(this, f90Var));
            } finally {
            }
        }
    }

    @Override // ai.c90
    public final void C2(yh.a aVar, fs fsVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            uj0.a("Requesting interscroller ad from adapter.");
            try {
                ah.a aVar2 = (ah.a) this.f12483w;
                aVar2.loadInterscrollerAd(new ah.h((Context) yh.b.z0(aVar), "", R5(str, asVar, str2), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), rg.w.c(fsVar.A, fsVar.f4174x), ""), new r90(this, f90Var, aVar2));
                return;
            } catch (Exception e10) {
                uj0.d("", e10);
                throw new RemoteException();
            }
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final k90 D0() {
        return null;
    }

    @Override // ai.c90
    public final lb0 G() {
        Object obj = this.f12483w;
        if (obj instanceof ah.a) {
            return lb0.p(((ah.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // ai.c90
    public final void J1(boolean z10) throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.u) {
            try {
                ((ah.u) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                uj0.d("", th2);
                return;
            }
        }
        String canonicalName = ah.u.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.a(sb2.toString());
    }

    @Override // ai.c90
    public final boolean N() {
        return false;
    }

    @Override // ai.c90
    public final pv O() {
        Object obj = this.f12483w;
        if (obj instanceof ah.y) {
            try {
                return ((ah.y) obj).getVideoController();
            } catch (Throwable th2) {
                uj0.d("", th2);
            }
        }
        return null;
    }

    @Override // ai.c90
    public final lb0 Q() {
        Object obj = this.f12483w;
        if (obj instanceof ah.a) {
            return lb0.p(((ah.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // ai.c90
    public final void Q1(yh.a aVar, as asVar, String str, String str2, f90 f90Var, a00 a00Var, List<String> list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f12483w;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof ah.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = ah.a.class.getCanonicalName();
            String canonicalName3 = this.f12483w.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb2.append(canonicalName);
            sb2.append(" or ");
            sb2.append(canonicalName2);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName3);
            uj0.f(sb2.toString());
            throw new RemoteException();
        }
        uj0.a("Requesting native ad from adapter.");
        Object obj2 = this.f12483w;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List<String> list2 = asVar.A;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j10 = asVar.f1984x;
                ca0 ca0Var = new ca0(j10 == -1 ? null : new Date(j10), asVar.f1986z, hashSet, asVar.G, T5(asVar), asVar.C, a00Var, list, asVar.N, asVar.P, U5(str, asVar));
                Bundle bundle = asVar.I;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f12484x = new aa0(f90Var);
                mediationNativeAdapter.requestNativeAd((Context) yh.b.z0(aVar), this.f12484x, R5(str, asVar, str2), ca0Var, bundle2);
            } finally {
            }
        } else if (obj2 instanceof ah.a) {
            try {
                ((ah.a) obj2).loadNativeAd(new ah.o((Context) yh.b.z0(aVar), "", R5(str, asVar, str2), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), this.F, a00Var), new w90(this, f90Var));
            } finally {
            }
        }
    }

    public final Bundle R5(String str, as asVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        uj0.a(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f12483w instanceof AdMobAdapter) {
                bundle.putString(AdMobAdapter.AD_JSON_PARAMETER, str2);
                if (asVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", asVar.C);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    public final Bundle S5(as asVar) {
        Bundle bundle;
        Bundle bundle2 = asVar.I;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f12483w.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // ai.c90
    public final void V2(yh.a aVar, kf0 kf0Var, List<String> list) throws RemoteException {
        uj0.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // ai.c90
    public final i90 W() {
        ah.k kVar = this.E;
        if (kVar != null) {
            return new z90(kVar);
        }
        return null;
    }

    @Override // ai.c90
    public final void Z4(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            uj0.a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((ah.a) this.f12483w).loadRewardedInterstitialAd(new ah.r((Context) yh.b.z0(aVar), "", R5(str, asVar, null), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), ""), new x90(this, f90Var));
                return;
            } catch (Exception e10) {
                uj0.d("", e10);
                throw new RemoteException();
            }
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final yh.a a() throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return yh.b.h1(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                uj0.d("", th2);
                throw new RemoteException();
            }
        } else if (obj instanceof ah.a) {
            return yh.b.h1(this.A);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = ah.a.class.getCanonicalName();
            String canonicalName3 = this.f12483w.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb2.append(canonicalName);
            sb2.append(" or ");
            sb2.append(canonicalName2);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName3);
            uj0.f(sb2.toString());
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final l90 d0() {
        return null;
    }

    @Override // ai.c90
    public final void d5(yh.a aVar) throws RemoteException {
        Object obj = this.f12483w;
        if (!(obj instanceof ah.a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = ah.a.class.getCanonicalName();
            String canonicalName3 = this.f12483w.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb2.append(canonicalName);
            sb2.append(" or ");
            sb2.append(canonicalName2);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName3);
            uj0.f(sb2.toString());
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            e();
        } else {
            uj0.a("Show interstitial ad from adapter.");
            ah.l lVar = this.B;
            if (lVar != null) {
                lVar.a((Context) yh.b.z0(aVar));
            } else {
                uj0.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    @Override // ai.c90
    public final void e() throws RemoteException {
        if (this.f12483w instanceof MediationInterstitialAdapter) {
            uj0.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f12483w).showInterstitial();
                return;
            } catch (Throwable th2) {
                uj0.d("", th2);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final void e5(yh.a aVar, fs fsVar, as asVar, String str, f90 f90Var) throws RemoteException {
        s3(aVar, fsVar, asVar, str, null, f90Var);
    }

    @Override // ai.c90
    public final void h() throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.f) {
            try {
                ((ah.f) obj).onDestroy();
            } catch (Throwable th2) {
                uj0.d("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // ai.c90
    public final void i2(yh.a aVar) throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            uj0.a("Show rewarded ad from adapter.");
            ah.q qVar = this.D;
            if (qVar != null) {
                qVar.a((Context) yh.b.z0(aVar));
                return;
            } else {
                uj0.c("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final void i4(yh.a aVar, as asVar, String str, kf0 kf0Var, String str2) throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.a) {
            this.f12486z = aVar;
            this.f12485y = kf0Var;
            kf0Var.L(yh.b.h1(obj));
            return;
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final void j() throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.f) {
            try {
                ((ah.f) obj).onPause();
            } catch (Throwable th2) {
                uj0.d("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // ai.c90
    public final void k() throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.f) {
            try {
                ((ah.f) obj).onResume();
            } catch (Throwable th2) {
                uj0.d("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // ai.c90
    public final void k4(as asVar, String str, String str2) throws RemoteException {
        Object obj = this.f12483w;
        if (obj instanceof ah.a) {
            u3(this.f12486z, asVar, str, new ba0((ah.a) obj, this.f12485y));
            return;
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final boolean l() throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            return this.f12485y != null;
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final Bundle m() {
        Object obj = this.f12483w;
        if (!(obj instanceof zzcoi)) {
            String canonicalName = zzcoi.class.getCanonicalName();
            String canonicalName2 = this.f12483w.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            uj0.f(sb2.toString());
            return new Bundle();
        }
        return ((zzcoi) obj).getInterstitialAdapterInfo();
    }

    @Override // ai.c90
    public final void m3(as asVar, String str) throws RemoteException {
        k4(asVar, str, null);
    }

    @Override // ai.c90
    public final void p() throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            ah.q qVar = this.D;
            if (qVar != null) {
                qVar.a((Context) yh.b.z0(this.f12486z));
                return;
            } else {
                uj0.c("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // ai.c90
    public final Bundle q() {
        Object obj = this.f12483w;
        if (!(obj instanceof zzcoh)) {
            String canonicalName = zzcoh.class.getCanonicalName();
            String canonicalName2 = this.f12483w.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            uj0.f(sb2.toString());
            return new Bundle();
        }
        return ((zzcoh) obj).zza();
    }

    @Override // ai.c90
    public final Bundle r() {
        return new Bundle();
    }

    @Override // ai.c90
    public final void r4(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
        A2(aVar, asVar, str, null, f90Var);
    }

    @Override // ai.c90
    public final void s3(yh.a aVar, fs fsVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        rg.g a10;
        RemoteException remoteException;
        Object obj = this.f12483w;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof ah.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = ah.a.class.getCanonicalName();
            String canonicalName3 = this.f12483w.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb2.append(canonicalName);
            sb2.append(" or ");
            sb2.append(canonicalName2);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName3);
            uj0.f(sb2.toString());
            throw new RemoteException();
        }
        uj0.a("Requesting banner ad from adapter.");
        if (fsVar.J) {
            a10 = rg.w.b(fsVar.A, fsVar.f4174x);
        } else {
            a10 = rg.w.a(fsVar.A, fsVar.f4174x, fsVar.f4173w);
        }
        rg.g gVar = a10;
        Object obj2 = this.f12483w;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List<String> list = asVar.A;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j10 = asVar.f1984x;
                q90 q90Var = new q90(j10 == -1 ? null : new Date(j10), asVar.f1986z, hashSet, asVar.G, T5(asVar), asVar.C, asVar.N, asVar.P, U5(str, asVar));
                Bundle bundle = asVar.I;
                mediationBannerAdapter.requestBannerAd((Context) yh.b.z0(aVar), new aa0(f90Var), R5(str, asVar, str2), gVar, q90Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } finally {
            }
        } else if (obj2 instanceof ah.a) {
            try {
                ((ah.a) obj2).loadBannerAd(new ah.h((Context) yh.b.z0(aVar), "", R5(str, asVar, str2), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), gVar, this.F), new u90(this, f90Var));
            } finally {
            }
        }
    }

    @Override // ai.c90
    public final void t0(yh.a aVar) throws RemoteException {
        Context context = (Context) yh.b.z0(aVar);
        Object obj = this.f12483w;
        if (obj instanceof ah.t) {
            ((ah.t) obj).a(context);
        }
    }

    @Override // ai.c90
    public final d10 u() {
        aa0 aa0Var = this.f12484x;
        if (aa0Var != null) {
            tg.f u10 = aa0Var.u();
            if (u10 instanceof e10) {
                return ((e10) u10).b();
            }
            return null;
        }
        return null;
    }

    @Override // ai.c90
    public final void u3(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
        if (this.f12483w instanceof ah.a) {
            uj0.a("Requesting rewarded ad from adapter.");
            try {
                ((ah.a) this.f12483w).loadRewardedAd(new ah.r((Context) yh.b.z0(aVar), "", R5(str, asVar, null), S5(asVar), T5(asVar), asVar.G, asVar.C, asVar.P, U5(str, asVar), ""), new x90(this, f90Var));
                return;
            } catch (Exception e10) {
                uj0.d("", e10);
                throw new RemoteException();
            }
        }
        String canonicalName = ah.a.class.getCanonicalName();
        String canonicalName2 = this.f12483w.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        uj0.f(sb2.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ai.c90
    public final void w4(yh.a aVar, h50 h50Var, List<l50> list) throws RemoteException {
        char c10;
        rg.b bVar;
        if (this.f12483w instanceof ah.a) {
            t90 t90Var = new t90(this, h50Var);
            ArrayList arrayList = new ArrayList();
            for (l50 l50Var : list) {
                String str = l50Var.f6483w;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals(MRLog.TARGET_TYPE_BANNER)) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 == 0) {
                    bVar = rg.b.BANNER;
                } else if (c10 == 1) {
                    bVar = rg.b.INTERSTITIAL;
                } else if (c10 == 2) {
                    bVar = rg.b.REWARDED;
                } else if (c10 != 3) {
                    bVar = c10 != 4 ? null : rg.b.NATIVE;
                } else {
                    bVar = rg.b.REWARDED_INTERSTITIAL;
                }
                if (bVar != null) {
                    arrayList.add(new ah.j(bVar, l50Var.f6484x));
                }
            }
            ((ah.a) this.f12483w).initialize((Context) yh.b.z0(aVar), t90Var, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // ai.c90
    public final o90 x() {
        ah.v vVar;
        ah.v t10;
        Object obj = this.f12483w;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof ah.a) || (vVar = this.C) == null) {
                return null;
            }
            return new ia0(vVar);
        }
        aa0 aa0Var = this.f12484x;
        if (aa0Var == null || (t10 = aa0Var.t()) == null) {
            return null;
        }
        return new ia0(t10);
    }

    public y90(ah.f fVar) {
        this.f12483w = fVar;
    }
}
