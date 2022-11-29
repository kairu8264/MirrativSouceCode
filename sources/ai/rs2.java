package ai;

import android.os.Build;
import android.webkit.WebView;
import com.dena.mirrorman.clientlog.logs.LogBase;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class rs2 {

    /* renamed from: a  reason: collision with root package name */
    public pt2 f9575a;

    /* renamed from: b  reason: collision with root package name */
    public long f9576b;

    /* renamed from: c  reason: collision with root package name */
    public int f9577c;

    public rs2() {
        k();
        this.f9575a = new pt2(null);
    }

    public void a() {
    }

    public void b() {
        this.f9575a.clear();
    }

    public final void c(WebView webView) {
        this.f9575a = new pt2(webView);
    }

    public final WebView d() {
        return this.f9575a.get();
    }

    public final boolean e() {
        return this.f9575a.get() != null;
    }

    public final void f(String str, long j10) {
        if (j10 >= this.f9576b) {
            this.f9577c = 2;
            js2.a().e(d(), str);
        }
    }

    public final void g(String str, long j10) {
        if (j10 < this.f9576b || this.f9577c == 3) {
            return;
        }
        this.f9577c = 3;
        js2.a().e(d(), str);
    }

    public void h(sr2 sr2Var, qr2 qr2Var) {
        i(sr2Var, qr2Var, null);
    }

    public final void i(sr2 sr2Var, qr2 qr2Var, JSONObject jSONObject) {
        String h10 = sr2Var.h();
        JSONObject jSONObject2 = new JSONObject();
        vs2.c(jSONObject2, "environment", "app");
        vs2.c(jSONObject2, "adSessionType", qr2Var.i());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("; ");
        sb2.append(str2);
        vs2.c(jSONObject3, "deviceType", sb2.toString());
        vs2.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        vs2.c(jSONObject3, LogBase.OS, "Android");
        vs2.c(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        vs2.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        vs2.c(jSONObject4, "partnerName", qr2Var.c().b());
        vs2.c(jSONObject4, "partnerVersion", qr2Var.c().c());
        vs2.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        vs2.c(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        vs2.c(jSONObject5, "appId", hs2.a().b().getApplicationContext().getPackageName());
        vs2.c(jSONObject2, "app", jSONObject5);
        if (qr2Var.g() != null) {
            vs2.c(jSONObject2, "contentUrl", qr2Var.g());
        }
        vs2.c(jSONObject2, "customReferenceData", qr2Var.h());
        JSONObject jSONObject6 = new JSONObject();
        Iterator<yr2> it = qr2Var.d().iterator();
        if (!it.hasNext()) {
            js2.a().c(d(), h10, jSONObject2, jSONObject6, jSONObject);
        } else {
            it.next();
            throw null;
        }
    }

    public final void j(float f10) {
        js2.a().f(d(), f10);
    }

    public final void k() {
        this.f9576b = System.nanoTime();
        this.f9577c = 1;
    }
}
