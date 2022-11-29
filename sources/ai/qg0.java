package ai;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qg0 implements wg0 {

    /* renamed from: m  reason: collision with root package name */
    public static final List<Future<Void>> f8927m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f8928n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final xl3 f8929a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, sm3> f8930b;

    /* renamed from: e  reason: collision with root package name */
    public final Context f8933e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8934f;

    /* renamed from: g  reason: collision with root package name */
    public final tg0 f8935g;

    /* renamed from: l  reason: collision with root package name */
    public final sg0 f8940l;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f8931c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f8932d = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final Object f8936h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public HashSet<String> f8937i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public boolean f8938j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8939k = false;

    public qg0(Context context, zj0 zj0Var, tg0 tg0Var, String str, sg0 sg0Var, byte[] bArr) {
        rh.p.j(tg0Var, "SafeBrowsing config is not present.");
        this.f8933e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8930b = new LinkedHashMap<>();
        this.f8940l = sg0Var;
        this.f8935g = tg0Var;
        for (String str2 : tg0Var.A) {
            this.f8937i.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.f8937i.remove("cookie".toLowerCase(Locale.ENGLISH));
        xl3 E = wm3.E();
        E.E(9);
        E.s(str);
        E.t(str);
        yl3 B = zl3.B();
        String str3 = this.f8935g.f10284w;
        if (str3 != null) {
            B.r(str3);
        }
        E.u(B.n());
        um3 B2 = vm3.B();
        B2.t(xh.c.a(this.f8933e).g());
        String str4 = zj0Var.f13013w;
        if (str4 != null) {
            B2.r(str4);
        }
        long a10 = nh.e.f().a(this.f8933e);
        if (a10 > 0) {
            B2.s(a10);
        }
        E.B(B2.n());
        this.f8929a = E;
    }

    @Override // ai.wg0
    public final void A(String str) {
        synchronized (this.f8936h) {
            if (str == null) {
                this.f8929a.z();
            } else {
                this.f8929a.y(str);
            }
        }
    }

    @Override // ai.wg0
    public final void a(String str, Map<String, String> map, int i10) {
        synchronized (this.f8936h) {
            if (i10 == 3) {
                this.f8939k = true;
            }
            if (this.f8930b.containsKey(str)) {
                if (i10 == 3) {
                    this.f8930b.get(str).v(rm3.a(3));
                }
                return;
            }
            sm3 D = tm3.D();
            int a10 = rm3.a(i10);
            if (a10 != 0) {
                D.v(a10);
            }
            D.r(this.f8930b.size());
            D.s(str);
            cm3 B = fm3.B();
            if (this.f8937i.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.f8937i.contains(key.toLowerCase(Locale.ENGLISH))) {
                        am3 B2 = bm3.B();
                        B2.r(oh3.Q(key));
                        B2.s(oh3.Q(value));
                        B.r(B2.n());
                    }
                }
            }
            D.t(B.n());
            this.f8930b.put(str, D);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ai.wg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            ai.tg0 r0 = r7.f8935g
            boolean r0 = r0.f10286y
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.f8938j
            if (r0 == 0) goto Lc
            return
        Lc:
            wg.t.d()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            ai.uj0.d(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            ai.uj0.f(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            ai.uj0.d(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            ai.vg0.a(r8)
            return
        L75:
            r7.f8938j = r0
            ai.lg0 r8 = new ai.lg0
            r8.<init>(r7, r1)
            yg.d2.V(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qg0.b(android.view.View):void");
    }

    @Override // ai.wg0
    public final boolean d() {
        return vh.n.f() && this.f8935g.f10286y && !this.f8938j;
    }

    public final /* synthetic */ s43 e(Map map) throws Exception {
        sm3 sm3Var;
        s43 j10;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f8936h) {
                            int length = optJSONArray.length();
                            synchronized (this.f8936h) {
                                sm3Var = this.f8930b.get(str);
                            }
                            if (sm3Var == null) {
                                String valueOf = String.valueOf(str);
                                vg0.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    sm3Var.u(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                this.f8934f = (length > 0) | this.f8934f;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (jz.f5980b.e().booleanValue()) {
                    uj0.b("Failed to get SafeBrowsing metadata", e10);
                }
                return j43.c(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f8934f) {
            synchronized (this.f8936h) {
                this.f8929a.E(10);
            }
        }
        boolean z10 = this.f8934f;
        if ((z10 && this.f8935g.C) || ((this.f8939k && this.f8935g.B) || (!z10 && this.f8935g.f10287z))) {
            synchronized (this.f8936h) {
                for (sm3 sm3Var2 : this.f8930b.values()) {
                    this.f8929a.w(sm3Var2.n());
                }
                this.f8929a.C(this.f8931c);
                this.f8929a.D(this.f8932d);
                if (vg0.b()) {
                    String r10 = this.f8929a.r();
                    String x10 = this.f8929a.x();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(r10).length() + 53 + String.valueOf(x10).length());
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(r10);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(x10);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (tm3 tm3Var : this.f8929a.v()) {
                        sb3.append("    [");
                        sb3.append(tm3Var.C());
                        sb3.append("] ");
                        sb3.append(tm3Var.B());
                    }
                    vg0.a(sb3.toString());
                }
                s43<String> b10 = new yg.s0(this.f8933e).b(1, this.f8935g.f10285x, null, this.f8929a.n().L());
                if (vg0.b()) {
                    b10.c(ng0.f7323w, hk0.f4878a);
                }
                j10 = j43.j(b10, og0.f7763a, hk0.f4883f);
            }
            return j10;
        }
        return j43.a(null);
    }

    @Override // ai.wg0
    public final void f() {
        synchronized (this.f8936h) {
            this.f8930b.keySet();
            s43 a10 = j43.a(Collections.emptyMap());
            p33 p33Var = new p33(this) { // from class: ai.mg0

                /* renamed from: a  reason: collision with root package name */
                public final qg0 f6935a;

                {
                    this.f6935a = this;
                }

                @Override // ai.p33
                public final s43 a(Object obj) {
                    return this.f6935a.e((Map) obj);
                }
            };
            t43 t43Var = hk0.f4883f;
            s43 i10 = j43.i(a10, p33Var, t43Var);
            s43 h10 = j43.h(i10, 10L, TimeUnit.SECONDS, hk0.f4881d);
            j43.p(i10, new pg0(this, h10), t43Var);
            f8927m.add(h10);
        }
    }

    public final /* synthetic */ void g(Bitmap bitmap) {
        mh3 f10 = oh3.f();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, f10);
        synchronized (this.f8936h) {
            xl3 xl3Var = this.f8929a;
            km3 B = mm3.B();
            B.s(f10.a());
            B.r("image/png");
            B.t(2);
            xl3Var.A(B.n());
        }
    }

    @Override // ai.wg0
    public final tg0 zzb() {
        return this.f8935g;
    }
}
