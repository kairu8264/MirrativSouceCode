package ai;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import wf.e;

/* loaded from: classes3.dex */
public final class da0<NETWORK_EXTRAS extends wf.e, SERVER_PARAMETERS extends MediationServerParameters> extends b90 {

    /* renamed from: w  reason: collision with root package name */
    public final wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> f3189w;

    /* renamed from: x  reason: collision with root package name */
    public final NETWORK_EXTRAS f3190x;

    public da0(wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f3189w = bVar;
        this.f3190x = network_extras;
    }

    public static final boolean S5(as asVar) {
        if (asVar.B) {
            return true;
        }
        dt.a();
        return nj0.k();
    }

    @Override // ai.c90
    public final void A2(yh.a aVar, as asVar, String str, String str2, f90 f90Var) throws RemoteException {
        wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3189w;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            uj0.f(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        uj0.a("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f3189w).requestInterstitialAd(new ga0(f90Var), (Activity) yh.b.z0(aVar), R5(str), ha0.b(asVar, S5(asVar)), this.f3190x);
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final void C2(yh.a aVar, fs fsVar, as asVar, String str, String str2, f90 f90Var) {
    }

    @Override // ai.c90
    public final k90 D0() {
        return null;
    }

    @Override // ai.c90
    public final lb0 G() {
        return null;
    }

    @Override // ai.c90
    public final void J1(boolean z10) {
    }

    @Override // ai.c90
    public final boolean N() {
        return false;
    }

    @Override // ai.c90
    public final pv O() {
        return null;
    }

    @Override // ai.c90
    public final lb0 Q() {
        return null;
    }

    @Override // ai.c90
    public final void Q1(yh.a aVar, as asVar, String str, String str2, f90 f90Var, a00 a00Var, List<String> list) {
    }

    public final SERVER_PARAMETERS R5(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f3189w.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.a(hashMap);
                return newInstance;
            }
            return null;
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final void V2(yh.a aVar, kf0 kf0Var, List<String> list) {
    }

    @Override // ai.c90
    public final i90 W() {
        return null;
    }

    @Override // ai.c90
    public final void Z4(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
    }

    @Override // ai.c90
    public final yh.a a() throws RemoteException {
        wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3189w;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            uj0.f(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return yh.b.h1(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final l90 d0() {
        return null;
    }

    @Override // ai.c90
    public final void d5(yh.a aVar) {
    }

    @Override // ai.c90
    public final void e() throws RemoteException {
        wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3189w;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            uj0.f(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        uj0.a("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f3189w).showInterstitial();
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final void e5(yh.a aVar, fs fsVar, as asVar, String str, f90 f90Var) throws RemoteException {
        s3(aVar, fsVar, asVar, str, null, f90Var);
    }

    @Override // ai.c90
    public final void h() throws RemoteException {
        try {
            this.f3189w.destroy();
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final void i2(yh.a aVar) throws RemoteException {
    }

    @Override // ai.c90
    public final void i4(yh.a aVar, as asVar, String str, kf0 kf0Var, String str2) throws RemoteException {
    }

    @Override // ai.c90
    public final void j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.c90
    public final void k() throws RemoteException {
        throw new RemoteException();
    }

    @Override // ai.c90
    public final void k4(as asVar, String str, String str2) {
    }

    @Override // ai.c90
    public final boolean l() {
        return true;
    }

    @Override // ai.c90
    public final Bundle m() {
        return new Bundle();
    }

    @Override // ai.c90
    public final void m3(as asVar, String str) {
    }

    @Override // ai.c90
    public final void p() {
    }

    @Override // ai.c90
    public final Bundle q() {
        return new Bundle();
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
        vf.c cVar;
        wf.b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f3189w;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            uj0.f(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        uj0.a("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f3189w;
            ga0 ga0Var = new ga0(f90Var);
            Activity activity = (Activity) yh.b.z0(aVar);
            SERVER_PARAMETERS R5 = R5(str);
            int i10 = 0;
            vf.c[] cVarArr = {vf.c.f57307b, vf.c.f57308c, vf.c.f57309d, vf.c.f57310e, vf.c.f57311f, vf.c.f57312g};
            while (true) {
                if (i10 < 6) {
                    if (cVarArr[i10].b() == fsVar.A && cVarArr[i10].a() == fsVar.f4174x) {
                        cVar = cVarArr[i10];
                        break;
                    }
                    i10++;
                } else {
                    cVar = new vf.c(rg.w.a(fsVar.A, fsVar.f4174x, fsVar.f4173w));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(ga0Var, activity, R5, cVar, ha0.b(asVar, S5(asVar)), this.f3190x);
        } catch (Throwable th2) {
            uj0.d("", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.c90
    public final void t0(yh.a aVar) throws RemoteException {
    }

    @Override // ai.c90
    public final d10 u() {
        return null;
    }

    @Override // ai.c90
    public final void u3(yh.a aVar, as asVar, String str, f90 f90Var) throws RemoteException {
    }

    @Override // ai.c90
    public final void w4(yh.a aVar, h50 h50Var, List<l50> list) throws RemoteException {
    }

    @Override // ai.c90
    public final o90 x() {
        return null;
    }
}
