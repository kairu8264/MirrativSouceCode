package yg;

import ai.ft;
import ai.ls1;
import ai.ms1;
import ai.ox;
import ai.s43;
import ai.uj0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f61846a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public String f61847b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f61848c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f61849d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f61850e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f61851f = "";

    /* renamed from: g  reason: collision with root package name */
    public ms1 f61852g;

    public static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", wg.t.d().P(context, str2));
        s43<String> b10 = new s0(context).b(0, str, hashMap, null);
        try {
            return b10.get(((Integer) ft.c().c(ox.f8000h3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            String valueOf = String.valueOf(str);
            uj0.d(valueOf.length() != 0 ? "Interrupted while retrieving a response from: ".concat(valueOf) : new String("Interrupted while retrieving a response from: "), e10);
            b10.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            String valueOf2 = String.valueOf(str);
            uj0.d(valueOf2.length() != 0 ? "Timeout while retrieving a response from: ".concat(valueOf2) : new String("Timeout while retrieving a response from: "), e11);
            b10.cancel(true);
            return null;
        } catch (Exception e12) {
            String valueOf3 = String.valueOf(str);
            uj0.d(valueOf3.length() != 0 ? "Error retrieving a response from: ".concat(valueOf3) : new String("Error retrieving a response from: "), e12);
            return null;
        }
    }

    public final void a(ms1 ms1Var) {
        this.f61852g = ms1Var;
    }

    public final ms1 b() {
        return this.f61852g;
    }

    public final void c(Context context) {
        ms1 ms1Var;
        if (!((Boolean) ft.c().c(ox.E6)).booleanValue() || (ms1Var = this.f61852g) == null) {
            return;
        }
        ms1Var.k(new x(this, context), ls1.DEBUG_MENU);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            ai.gx<java.lang.String> r0 = ai.ox.f7976e3
            ai.mx r1 = ai.ft.c()
            java.lang.Object r0 = r1.c(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            ai.uj0.a(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.f61851f = r6     // Catch: org.json.JSONException -> L83
            ai.gx<java.lang.Boolean> r6 = ai.ox.E6     // Catch: org.json.JSONException -> L83
            ai.mx r1 = ai.ft.c()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.c(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f61851f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f61851f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r0
            goto L67
        L66:
            r6 = r1
        L67:
            r3.j(r6)     // Catch: org.json.JSONException -> L83
            ai.fj0 r2 = wg.t.h()     // Catch: org.json.JSONException -> L83
            yg.r1 r2 = r2.p()     // Catch: org.json.JSONException -> L83
            if (r1 == r6) goto L76
            java.lang.String r5 = ""
        L76:
            r2.i(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.f61846a
            monitor-enter(r5)
            r3.f61848c = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            ai.uj0.g(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.a0.d(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean e(Context context, String str, String str2) {
        String o10 = o(context, p(context, (String) ft.c().c(ox.f7984f3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o10)) {
            uj0.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(new JSONObject(o10.trim()).optString("debug_mode"));
            j(equals);
            if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
                r1 p10 = wg.t.h().p();
                if (true != equals) {
                    str = "";
                }
                p10.i(str);
            }
            return equals;
        } catch (JSONException e10) {
            uj0.g("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final void f(Context context, String str, String str2) {
        wg.t.d();
        d2.x(context, p(context, (String) ft.c().c(ox.f7968d3), str, str2));
    }

    public final boolean g(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        uj0.a("Sending troubleshooting signals to the server.");
        h(context, str, str2, str3);
        return true;
    }

    public final void h(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) ft.c().c(ox.f7992g3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        wg.t.d();
        d2.n(context, str, buildUpon.build().toString());
    }

    public final String i() {
        String str;
        synchronized (this.f61846a) {
            str = this.f61848c;
        }
        return str;
    }

    public final void j(boolean z10) {
        synchronized (this.f61846a) {
            this.f61850e = z10;
            if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
                wg.t.h().p().r(z10);
                ms1 ms1Var = this.f61852g;
                if (ms1Var != null) {
                    ms1Var.b(z10);
                }
            }
        }
    }

    public final boolean k() {
        boolean z10;
        synchronized (this.f61846a) {
            z10 = this.f61850e;
        }
        return z10;
    }

    public final void l(boolean z10) {
        synchronized (this.f61846a) {
            this.f61849d = z10;
        }
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f61846a) {
            z10 = this.f61849d;
        }
        return z10;
    }

    public final void n(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            uj0.e("Can not create dialog without Activity Context");
        } else {
            d2.f61866i.post(new z(this, context, str, z10, z11));
        }
    }

    public final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f61846a) {
            if (TextUtils.isEmpty(this.f61847b)) {
                wg.t.d();
                try {
                    str5 = new String(vh.l.d(context.openFileInput("debug_signals_id.txt"), true), C.UTF8_NAME);
                } catch (IOException unused) {
                    uj0.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f61847b = str5;
                if (TextUtils.isEmpty(str5)) {
                    wg.t.d();
                    this.f61847b = UUID.randomUUID().toString();
                    wg.t.d();
                    String str6 = this.f61847b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(C.UTF8_NAME));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        uj0.d("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f61847b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
