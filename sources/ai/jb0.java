package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jb0 extends xa0 {

    /* renamed from: w  reason: collision with root package name */
    public final RtbAdapter f5681w;

    /* renamed from: x  reason: collision with root package name */
    public ah.l f5682x;

    /* renamed from: y  reason: collision with root package name */
    public ah.q f5683y;

    /* renamed from: z  reason: collision with root package name */
    public String f5684z = "";

    public jb0(RtbAdapter rtbAdapter) {
        this.f5681w = rtbAdapter;
    }

    public static final Bundle T5(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        uj0.f(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
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
                return bundle2;
            }
            return bundle;
        } catch (JSONException e10) {
            uj0.d("", e10);
            throw new RemoteException();
        }
    }

    public static final boolean U5(as asVar) {
        if (asVar.B) {
            return true;
        }
        dt.a();
        return nj0.k();
    }

    public static final String V5(String str, as asVar) {
        String str2 = asVar.Q;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // ai.ya0
    public final void A3(String str, String str2, as asVar, yh.a aVar, va0 va0Var, f90 f90Var) throws RemoteException {
        try {
            this.f5681w.loadRtbRewardedAd(new ah.r((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), this.f5684z), new ib0(this, va0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render rewarded ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final void R2(String str, String str2, as asVar, yh.a aVar, sa0 sa0Var, f90 f90Var) throws RemoteException {
        w5(str, str2, asVar, aVar, sa0Var, f90Var, null);
    }

    public final Bundle S5(as asVar) {
        Bundle bundle;
        Bundle bundle2 = asVar.I;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f5681w.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // ai.ya0
    public final void U3(String str, String str2, as asVar, yh.a aVar, pa0 pa0Var, f90 f90Var) throws RemoteException {
        try {
            this.f5681w.loadRtbInterstitialAd(new ah.m((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), this.f5684z), new fb0(this, pa0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render interstitial ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final void W4(String str, String str2, as asVar, yh.a aVar, ma0 ma0Var, f90 f90Var, fs fsVar) throws RemoteException {
        try {
            this.f5681w.loadRtbBannerAd(new ah.h((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), rg.w.a(fsVar.A, fsVar.f4174x, fsVar.f4173w), this.f5684z), new db0(this, ma0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render banner ad.", th2);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ai.ya0
    public final void X1(yh.a aVar, String str, Bundle bundle, Bundle bundle2, fs fsVar, bb0 bb0Var) throws RemoteException {
        char c10;
        rg.b bVar;
        try {
            hb0 hb0Var = new hb0(this, bb0Var);
            RtbAdapter rtbAdapter = this.f5681w;
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
            } else if (c10 == 3) {
                bVar = rg.b.REWARDED_INTERSTITIAL;
            } else if (c10 == 4) {
                bVar = rg.b.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            ah.j jVar = new ah.j(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(jVar);
            rtbAdapter.collectSignals(new ch.a((Context) yh.b.z0(aVar), arrayList, bundle, rg.w.a(fsVar.A, fsVar.f4174x, fsVar.f4173w)), hb0Var);
        } catch (Throwable th2) {
            uj0.d("Error generating signals for RTB", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final lb0 a() throws RemoteException {
        return lb0.p(this.f5681w.getVersionInfo());
    }

    @Override // ai.ya0
    public final void d3(String str, String str2, as asVar, yh.a aVar, ma0 ma0Var, f90 f90Var, fs fsVar) throws RemoteException {
        try {
            this.f5681w.loadRtbInterscrollerAd(new ah.h((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), rg.w.a(fsVar.A, fsVar.f4174x, fsVar.f4173w), this.f5684z), new eb0(this, ma0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render interscroller ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final pv e() {
        RtbAdapter rtbAdapter = this.f5681w;
        if (rtbAdapter instanceof ah.y) {
            try {
                return ((ah.y) rtbAdapter).getVideoController();
            } catch (Throwable th2) {
                uj0.d("", th2);
            }
        }
        return null;
    }

    @Override // ai.ya0
    public final lb0 f() throws RemoteException {
        return lb0.p(this.f5681w.getSDKVersionInfo());
    }

    @Override // ai.ya0
    public final boolean h4(yh.a aVar) throws RemoteException {
        ah.q qVar = this.f5683y;
        if (qVar != null) {
            try {
                qVar.a((Context) yh.b.z0(aVar));
                return true;
            } catch (Throwable th2) {
                uj0.d("", th2);
                return true;
            }
        }
        return false;
    }

    @Override // ai.ya0
    public final void h5(String str, String str2, as asVar, yh.a aVar, va0 va0Var, f90 f90Var) throws RemoteException {
        try {
            this.f5681w.loadRtbRewardedInterstitialAd(new ah.r((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), this.f5684z), new ib0(this, va0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render rewarded interstitial ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final void r0(String str) {
        this.f5684z = str;
    }

    @Override // ai.ya0
    public final void w5(String str, String str2, as asVar, yh.a aVar, sa0 sa0Var, f90 f90Var, a00 a00Var) throws RemoteException {
        try {
            this.f5681w.loadRtbNativeAd(new ah.o((Context) yh.b.z0(aVar), str, T5(str2), S5(asVar), U5(asVar), asVar.G, asVar.C, asVar.P, V5(str2, asVar), this.f5684z, a00Var), new gb0(this, sa0Var, f90Var));
        } catch (Throwable th2) {
            uj0.d("Adapter failed to render native ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // ai.ya0
    public final boolean y0(yh.a aVar) throws RemoteException {
        ah.l lVar = this.f5682x;
        if (lVar != null) {
            try {
                lVar.a((Context) yh.b.z0(aVar));
                return true;
            } catch (Throwable th2) {
                uj0.d("", th2);
                return true;
            }
        }
        return false;
    }
}
