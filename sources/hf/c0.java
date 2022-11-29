package hf;

import android.content.Context;
import android.os.Build;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import nd.f1;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35523a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f35524b;

    public c0(Context context, e0 e0Var) {
        jo.p.h(context, "applicationContext");
        jo.p.h(e0Var, "networkHelper");
        this.f35523a = context;
        this.f35524b = e0Var;
    }

    public final Map<String, String> a() {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        long currentTimeMillis = System.currentTimeMillis();
        wn.k[] kVarArr = new wn.k[11];
        kVarArr[0] = wn.q.a("User-Agent", ApiUtil.INSTANCE.userAgent());
        if (language == null) {
            language = "ja-JP";
        } else {
            jo.p.g(country, "country");
            if (country.length() > 0) {
                language = language + '-' + country;
            }
        }
        kVarArr[1] = wn.q.a("Accept-Language", language);
        kVarArr[2] = wn.q.a("HTTP_X_TIMEZONE", TimeZone.getDefault().getID());
        kVarArr[3] = wn.q.a("x-idfv", of.n.c(this.f35523a));
        kVarArr[4] = wn.q.a("x-ad", of.n.k());
        kVarArr[5] = wn.q.a("x-hw", Build.HARDWARE);
        kVarArr[6] = wn.q.a("x-network-status", String.valueOf(this.f35524b.b()));
        kVarArr[7] = wn.q.a("x-os-push", b3.m.d(this.f35523a).a() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        StringBuilder sb2 = new StringBuilder();
        long j10 = 1000;
        sb2.append(currentTimeMillis / j10);
        sb2.append('.');
        sb2.append(currentTimeMillis % j10);
        kVarArr[8] = wn.q.a("x-client-unixtime", sb2.toString());
        String a10 = p6.e.a();
        if (a10 == null) {
            a10 = "";
        }
        kVarArr[9] = wn.q.a("x-adjust-adid", a10);
        kVarArr[10] = wn.q.a("x-unity-framework", this.f35523a.getString(f1.f41977k));
        return xn.n0.h(kVarArr);
    }
}
