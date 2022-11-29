package ai;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wq1 extends m40 {

    /* renamed from: w  reason: collision with root package name */
    public final zq1 f11716w;

    /* renamed from: x  reason: collision with root package name */
    public final uq1 f11717x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<Long, pq1> f11718y = new HashMap();

    public wq1(zq1 zq1Var, uq1 uq1Var) {
        this.f11716w = zq1Var;
        this.f11717x = uq1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static as R5(Map<String, String> map) {
        char c10;
        bs bsVar = new bs();
        String str = map.get("ad_request");
        if (str == null) {
            return bsVar.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        bsVar.b(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        bsVar.c(arrayList);
                        break;
                    case 2:
                        bsVar.d(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (jsonReader.nextBoolean()) {
                            bsVar.e(1);
                            break;
                        } else {
                            bsVar.e(0);
                            break;
                        }
                    case 4:
                        if (jsonReader.nextBoolean()) {
                            bsVar.f(1);
                            break;
                        } else {
                            bsVar.f(0);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!rg.s.f51377e.contains(nextString)) {
                            break;
                        } else {
                            bsVar.g(nextString);
                            break;
                        }
                    case 6:
                        bsVar.h(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            uj0.a("Ad Request json was malformed, parsing ended early.");
        }
        as a10 = bsVar.a();
        Bundle bundle2 = a10.I.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a10.f1985y;
            a10.I.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new as(a10.f1983w, a10.f1984x, bundle2, a10.f1986z, a10.A, a10.B, a10.C, a10.D, a10.E, a10.F, a10.G, a10.H, a10.I, a10.J, a10.K, a10.L, a10.M, a10.N, a10.O, a10.P, a10.Q, a10.R, a10.S, a10.T);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L29;
     */
    @Override // ai.n40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.wq1.H(java.lang.String):void");
    }

    @Override // ai.n40
    public final void a() {
        this.f11718y.clear();
    }
}
