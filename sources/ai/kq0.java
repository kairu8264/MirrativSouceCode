package ai;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class kq0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, rp0 {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f6309w0 = 0;
    public wg.l A;
    public final wg.a B;
    public final DisplayMetrics C;
    public final float D;
    public fl2 E;
    public kl2 F;
    public boolean G;
    public boolean H;
    public yp0 I;
    public xg.n J;
    public yh.a K;
    public ir0 L;
    public final String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Boolean R;
    public boolean S;
    public final String T;
    public nq0 U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public yz f6310a0;

    /* renamed from: b0  reason: collision with root package name */
    public vz f6311b0;

    /* renamed from: c0  reason: collision with root package name */
    public jm f6312c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f6313d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f6314e0;

    /* renamed from: f0  reason: collision with root package name */
    public ay f6315f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ay f6316g0;

    /* renamed from: h0  reason: collision with root package name */
    public ay f6317h0;

    /* renamed from: i0  reason: collision with root package name */
    public final by f6318i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f6319j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6320k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f6321l0;

    /* renamed from: m0  reason: collision with root package name */
    public xg.n f6322m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6323n0;

    /* renamed from: o0  reason: collision with root package name */
    public final yg.n1 f6324o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f6325p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6326q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6327r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6328s0;

    /* renamed from: t0  reason: collision with root package name */
    public Map<String, fo0> f6329t0;

    /* renamed from: u0  reason: collision with root package name */
    public final WindowManager f6330u0;

    /* renamed from: v0  reason: collision with root package name */
    public final qn f6331v0;

    /* renamed from: w  reason: collision with root package name */
    public final hr0 f6332w;

    /* renamed from: x  reason: collision with root package name */
    public final u f6333x;

    /* renamed from: y  reason: collision with root package name */
    public final oy f6334y;

    /* renamed from: z  reason: collision with root package name */
    public final zj0 f6335z;

    public kq0(hr0 hr0Var, ir0 ir0Var, String str, boolean z10, boolean z11, u uVar, oy oyVar, zj0 zj0Var, ey eyVar, wg.l lVar, wg.a aVar, qn qnVar, fl2 fl2Var, kl2 kl2Var) {
        super(hr0Var);
        kl2 kl2Var2;
        this.G = false;
        this.H = false;
        this.S = true;
        this.T = "";
        this.f6325p0 = -1;
        this.f6326q0 = -1;
        this.f6327r0 = -1;
        this.f6328s0 = -1;
        this.f6332w = hr0Var;
        this.L = ir0Var;
        this.M = str;
        this.P = z10;
        this.f6333x = uVar;
        this.f6334y = oyVar;
        this.f6335z = zj0Var;
        this.A = lVar;
        this.B = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f6330u0 = windowManager;
        wg.t.d();
        DisplayMetrics f02 = yg.d2.f0(windowManager);
        this.C = f02;
        this.D = f02.density;
        this.f6331v0 = qnVar;
        this.E = fl2Var;
        this.F = kl2Var;
        this.f6324o0 = new yg.n1(hr0Var.a(), this, this, null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            uj0.d("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(wg.t.d().P(hr0Var, zj0Var.f13013w));
        wg.t.f().a(getContext(), settings);
        setDownloadListener(this);
        q1();
        if (vh.n.d()) {
            addJavascriptInterface(new sq0(this, new rq0(this) { // from class: ai.pq0

                /* renamed from: a  reason: collision with root package name */
                public final rp0 f8500a;

                {
                    this.f8500a = this;
                }

                @Override // ai.rq0
                public final void a(Uri uri) {
                    yp0 l12 = ((kq0) this.f8500a).l1();
                    if (l12 == null) {
                        uj0.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        l12.M0(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        v1();
        by byVar = new by(new ey(true, "make_wv", this.M));
        this.f6318i0 = byVar;
        byVar.c().a(null);
        if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue() && (kl2Var2 = this.F) != null && kl2Var2.f6277b != null) {
            byVar.c().d("gqi", this.F.f6277b);
        }
        byVar.c();
        ay f10 = ey.f();
        this.f6316g0 = f10;
        byVar.a("native:view_create", f10);
        this.f6317h0 = null;
        this.f6315f0 = null;
        wg.t.f().c(hr0Var);
        wg.t.h().m();
    }

    @Override // ai.rp0
    public final synchronized void A0(int i10) {
        xg.n nVar = this.J;
        if (nVar != null) {
            nVar.Z5(i10);
        }
    }

    @Override // ai.n60
    public final void B(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        i1(sb2.toString());
    }

    @Override // ai.rp0
    public final void B0() {
        throw null;
    }

    @Override // ai.rp0
    public final synchronized xg.n C() {
        return this.f6322m0;
    }

    @Override // ai.em0
    public final synchronized fo0 C0(String str) {
        Map<String, fo0> map = this.f6329t0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // ai.rp0, ai.ip0
    public final fl2 D() {
        return this.E;
    }

    @Override // ai.rp0
    public final Context D0() {
        return this.f6332w.b();
    }

    @Override // ai.rp0, ai.oq0
    public final kl2 E() {
        return this.F;
    }

    @Override // ai.rp0
    public final void F() {
        throw null;
    }

    @Override // ai.rp0
    public final synchronized void F0(boolean z10) {
        xg.n nVar = this.J;
        if (nVar != null) {
            nVar.X5(this.I.d(), z10);
        } else {
            this.N = z10;
        }
    }

    @Override // ai.rp0, ai.cr0
    public final View G() {
        return this;
    }

    @Override // ai.xq0
    public final void G0(boolean z10, int i10, String str, boolean z11) {
        this.I.e0(z10, i10, str, z11);
    }

    @Override // ai.rp0
    public final synchronized String H() {
        return this.M;
    }

    @Override // ai.rp0
    public final WebView I() {
        return this;
    }

    @Override // ai.rp0
    public final boolean I0(final boolean z10, final int i10) {
        destroy();
        this.f6331v0.b(new pn(z10, i10) { // from class: ai.hq0

            /* renamed from: a  reason: collision with root package name */
            public final boolean f4929a;

            /* renamed from: b  reason: collision with root package name */
            public final int f4930b;

            {
                this.f4929a = z10;
                this.f4930b = i10;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                boolean z11 = this.f4929a;
                int i11 = this.f4930b;
                int i12 = kq0.f6309w0;
                mr C = nr.C();
                if (C.r() != z11) {
                    C.s(z11);
                }
                C.t(i11);
                fpVar.A(C.n());
            }
        });
        this.f6331v0.c(10003);
        return true;
    }

    @Override // ai.rp0, ai.em0
    public final synchronized void J(nq0 nq0Var) {
        if (this.U != null) {
            uj0.c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.U = nq0Var;
        }
    }

    @Override // ai.rp0
    public final void J0(int i10) {
        if (i10 == 0) {
            vx.a(this.f6318i0.c(), this.f6316g0, "aebb2");
        }
        p1();
        this.f6318i0.c();
        this.f6318i0.c().d("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.f6335z.f13013w);
        j0("onhide", hashMap);
    }

    @Override // ai.em0
    public final int K() {
        return this.f6320k0;
    }

    @Override // ai.rp0
    public final synchronized void K0(yh.a aVar) {
        this.K = aVar;
    }

    @Override // ai.rp0
    public final void L() {
        if (this.f6317h0 == null) {
            this.f6318i0.c();
            ay f10 = ey.f();
            this.f6317h0 = f10;
            this.f6318i0.a("native:view_load", f10);
        }
    }

    @Override // ai.em0
    public final int M() {
        return this.f6321l0;
    }

    @Override // ai.em0
    public final void N(int i10) {
        this.f6320k0 = i10;
    }

    @Override // ai.rp0
    public final boolean N0() {
        return false;
    }

    @Override // ai.rp0
    public final void O() {
        this.f6324o0.b();
    }

    @Override // ai.rp0
    public final WebViewClient O0() {
        return this.I;
    }

    @Override // ai.rp0
    public final synchronized boolean P0() {
        return this.N;
    }

    @Override // ai.rp0
    public final void Q() {
        p1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6335z.f13013w);
        j0("onhide", hashMap);
    }

    @Override // ai.rp0
    public final void Q0(fl2 fl2Var, kl2 kl2Var) {
        this.E = fl2Var;
        this.F = kl2Var;
    }

    @Override // ai.rp0
    public final synchronized void R0(jm jmVar) {
        this.f6312c0 = jmVar;
    }

    @Override // ai.rp0
    public final synchronized yz S() {
        return this.f6310a0;
    }

    @Override // ai.xq0
    public final void S0(boolean z10, int i10, String str, String str2, boolean z11) {
        this.I.j0(z10, i10, str, str2, z11);
    }

    @Override // ai.rp0
    public final synchronized boolean T() {
        return this.P;
    }

    @Override // ai.xq0
    public final void T0(boolean z10, int i10, boolean z11) {
        this.I.b0(z10, i10, z11);
    }

    @Override // ai.vk
    public final void U(uk ukVar) {
        boolean z10;
        synchronized (this) {
            z10 = ukVar.f10736j;
            this.V = z10;
        }
        w1(z10);
    }

    @Override // ai.em0
    public final synchronized void U0(int i10) {
        this.f6319j0 = i10;
    }

    @Override // ai.rp0
    public final void V() {
        setBackgroundColor(0);
    }

    @Override // ai.rp0
    public final synchronized boolean V0() {
        return this.f6313d0 > 0;
    }

    @Override // ai.rp0
    public final void W() {
        if (this.f6315f0 == null) {
            vx.a(this.f6318i0.c(), this.f6316g0, "aes2");
            this.f6318i0.c();
            ay f10 = ey.f();
            this.f6315f0 = f10;
            this.f6318i0.a("native:view_show", f10);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f6335z.f13013w);
        j0("onshow", hashMap);
    }

    @Override // ai.rp0
    public final synchronized void W0(boolean z10) {
        this.S = z10;
    }

    @Override // ai.rp0
    public final s43<String> X() {
        oy oyVar = this.f6334y;
        return oyVar == null ? j43.a(null) : oyVar.b();
    }

    @Override // ai.rp0
    public final synchronized void X0(xg.n nVar) {
        this.f6322m0 = nVar;
    }

    @Override // ai.rp0
    public final void Y(boolean z10) {
        this.I.f(z10);
    }

    @Override // ai.rp0
    public final void Y0(String str, r30<? super rp0> r30Var) {
        yp0 yp0Var = this.I;
        if (yp0Var != null) {
            yp0Var.s0(str, r30Var);
        }
    }

    @Override // ai.em0
    public final void Z(int i10) {
        this.f6321l0 = i10;
    }

    @Override // ai.rp0
    public final synchronized void Z0(String str, String str2, String str3) {
        String str4;
        if (!c0()) {
            String[] strArr = new String[1];
            String str5 = (String) ft.c().c(ox.K);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e10) {
                uj0.g("Unable to build MRAID_ENV", e10);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, yq0.a(str2, strArr), "text/html", C.UTF8_NAME, null);
            return;
        }
        uj0.f("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // ai.em0
    public final sl0 a() {
        return null;
    }

    @Override // ai.rp0
    public final synchronized void a0(xg.n nVar) {
        this.J = nVar;
    }

    @Override // ai.rp0
    public final void a1(String str, vh.o<r30<? super rp0>> oVar) {
        yp0 yp0Var = this.I;
        if (yp0Var != null) {
            yp0Var.w0(str, oVar);
        }
    }

    @Override // ai.em0
    public final void b0(boolean z10) {
        this.I.c(false);
    }

    @Override // ai.z50
    public final void c(String str, JSONObject jSONObject) {
        String str2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        String sb3 = sb2.toString();
        if (sb3.length() != 0) {
            str2 = "Dispatching AFMA event: ".concat(sb3);
        } else {
            str2 = new String("Dispatching AFMA event: ");
        }
        uj0.a(str2);
        i1(sb2.toString());
    }

    @Override // ai.rp0
    public final synchronized boolean c0() {
        return this.O;
    }

    @Override // ai.rp0
    public final void c1(String str, r30<? super rp0> r30Var) {
        yp0 yp0Var = this.I;
        if (yp0Var != null) {
            yp0Var.p0(str, r30Var);
        }
    }

    @Override // ai.rp0
    public final synchronized xg.n d0() {
        return this.J;
    }

    @Override // android.webkit.WebView, ai.rp0
    public final synchronized void destroy() {
        v1();
        this.f6324o0.c();
        xg.n nVar = this.J;
        if (nVar != null) {
            nVar.zzb();
            this.J.l();
            this.J = null;
        }
        this.K = null;
        this.I.x0();
        this.f6312c0 = null;
        this.A = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.O) {
            return;
        }
        wg.t.z().d(this);
        u1();
        this.O = true;
        if (((Boolean) ft.c().c(ox.f7963c7)).booleanValue()) {
            yg.p1.k("Initiating WebView self destruct sequence in 3...");
            yg.p1.k("Loading blank page in WebView, 2...");
            n1("about:blank");
            return;
        }
        yg.p1.k("Destroying the WebView immediately...");
        r0();
    }

    @Override // ai.rp0, ai.em0
    public final synchronized nq0 e() {
        return this.U;
    }

    @Override // ai.em0
    public final void e0(int i10) {
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!c0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        uj0.i("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // ai.rp0
    public final synchronized void f0(yz yzVar) {
        this.f6310a0 = yzVar;
    }

    public final boolean f1() {
        int i10;
        int i11;
        boolean z10 = false;
        if (this.I.d() || this.I.A()) {
            dt.a();
            DisplayMetrics displayMetrics = this.C;
            int o10 = nj0.o(displayMetrics, displayMetrics.widthPixels);
            dt.a();
            DisplayMetrics displayMetrics2 = this.C;
            int o11 = nj0.o(displayMetrics2, displayMetrics2.heightPixels);
            Activity a10 = this.f6332w.a();
            if (a10 == null || a10.getWindow() == null) {
                i10 = o10;
                i11 = o11;
            } else {
                wg.t.d();
                int[] t10 = yg.d2.t(a10);
                dt.a();
                int o12 = nj0.o(this.C, t10[0]);
                dt.a();
                i11 = nj0.o(this.C, t10[1]);
                i10 = o12;
            }
            int i12 = this.f6326q0;
            if (i12 == o10 && this.f6325p0 == o11 && this.f6327r0 == i10 && this.f6328s0 == i11) {
                return false;
            }
            if (i12 != o10 || this.f6325p0 != o11) {
                z10 = true;
            }
            this.f6326q0 = o10;
            this.f6325p0 = o11;
            this.f6327r0 = i10;
            this.f6328s0 = i11;
            new zb0(this, "").g(o10, o11, i10, i11, this.C.density, this.f6330u0.getDefaultDisplay().getRotation());
            return z10;
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.O) {
                    this.I.x0();
                    wg.t.z().d(this);
                    u1();
                    t1();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // ai.rp0, ai.tq0, ai.em0
    public final Activity g() {
        return this.f6332w.a();
    }

    @Override // ai.rp0
    public final synchronized void g0(boolean z10) {
        xg.n nVar;
        int i10 = this.f6313d0 + (true != z10 ? -1 : 1);
        this.f6313d0 = i10;
        if (i10 > 0 || (nVar = this.J) == null) {
            return;
        }
        nVar.M();
    }

    public final synchronized void g1(String str) {
        if (c0()) {
            uj0.f("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // ai.em0
    public final ay h() {
        return this.f6316g0;
    }

    @Override // ai.rp0
    public final void h0(Context context) {
        this.f6332w.setBaseContext(context);
        this.f6324o0.a(this.f6332w.a());
    }

    @TargetApi(19)
    public final synchronized void h1(String str, ValueCallback<String> valueCallback) {
        if (c0()) {
            uj0.f("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // ai.rp0, ai.em0
    public final wg.a i() {
        return this.B;
    }

    @Override // ai.rp0
    public final /* bridge */ /* synthetic */ fr0 i0() {
        return this.I;
    }

    public final void i1(String str) {
        if (vh.n.f()) {
            if (k1() == null) {
                o1();
            }
            if (k1().booleanValue()) {
                h1(str, null);
                return;
            } else {
                g1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
                return;
            }
        }
        g1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
    }

    @Override // ai.em0
    public final void j() {
        xg.n d02 = d0();
        if (d02 != null) {
            d02.K();
        }
    }

    @Override // ai.z50
    public final void j0(String str, Map<String, ?> map) {
        try {
            c(str, wg.t.d().Q(map));
        } catch (JSONException unused) {
            uj0.f("Could not convert parameters to JSON.");
        }
    }

    public final void j1(Boolean bool) {
        synchronized (this) {
            this.R = bool;
        }
        wg.t.h().f(bool);
    }

    @Override // ai.em0
    public final synchronized String k() {
        return this.T;
    }

    public final synchronized Boolean k1() {
        return this.R;
    }

    @Override // ai.rp0, ai.em0
    public final by l() {
        return this.f6318i0;
    }

    @Override // ai.n60
    public final void l0(String str, JSONObject jSONObject) {
        B(str, jSONObject.toString());
    }

    public final yp0 l1() {
        return this.I;
    }

    @Override // android.webkit.WebView, ai.rp0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (c0()) {
            uj0.f("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, ai.rp0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (c0()) {
            uj0.f("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, ai.rp0
    public final synchronized void loadUrl(String str) {
        if (c0()) {
            uj0.f("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // ai.rp0, ai.br0, ai.em0
    public final zj0 m() {
        return this.f6335z;
    }

    @Override // ai.em0
    public final synchronized String n() {
        kl2 kl2Var = this.F;
        if (kl2Var != null) {
            return kl2Var.f6277b;
        }
        return null;
    }

    @Override // ai.rp0
    public final synchronized void n0(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        xg.n nVar = this.J;
        if (nVar != null) {
            nVar.Y5(z10);
        }
    }

    public final synchronized void n1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th2) {
            wg.t.h().k(th2, "AdWebViewImpl.loadUrlUnsafe");
            uj0.g("Could not call loadUrl in destroy(). ", th2);
        }
    }

    @Override // ai.rp0, ai.em0
    public final synchronized void o(String str, fo0 fo0Var) {
        if (this.f6329t0 == null) {
            this.f6329t0 = new HashMap();
        }
        this.f6329t0.put(str, fo0Var);
    }

    @Override // ai.rp0
    public final synchronized yh.a o0() {
        return this.K;
    }

    public final synchronized void o1() {
        Boolean g10 = wg.t.h().g();
        this.R = g10;
        if (g10 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                j1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                j1(Boolean.FALSE);
            }
        }
    }

    @Override // ai.or
    public final void onAdClicked() {
        yp0 yp0Var = this.I;
        if (yp0Var != null) {
            yp0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!c0()) {
            this.f6324o0.d();
        }
        boolean z10 = this.V;
        yp0 yp0Var = this.I;
        if (yp0Var != null && yp0Var.A()) {
            if (!this.W) {
                this.I.K();
                this.I.M();
                this.W = true;
            }
            f1();
            z10 = true;
        }
        w1(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yp0 yp0Var;
        synchronized (this) {
            if (!c0()) {
                this.f6324o0.e();
            }
            super.onDetachedFromWindow();
            if (this.W && (yp0Var = this.I) != null && yp0Var.A() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.I.K();
                this.I.M();
                this.W = false;
            }
        }
        w1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            wg.t.d();
            yg.d2.p(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            uj0.a(sb2.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (c0()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean f12 = f1();
        xg.n d02 = d0();
        if (d02 == null || !f12) {
            return;
        }
        d02.T5();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2 A[Catch: all -> 0x01e8, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:45:0x0086, B:43:0x0080, B:48:0x0093, B:50:0x009b, B:52:0x00ad, B:55:0x00b4, B:57:0x00d0, B:59:0x00d8, B:58:0x00d4, B:62:0x00dd, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:79:0x0119, B:81:0x0120, B:86:0x0128, B:88:0x013a, B:90:0x0148, B:99:0x015d, B:101:0x01aa, B:102:0x01ae, B:104:0x01b5, B:109:0x01c2, B:111:0x01c8, B:112:0x01cb, B:114:0x01cf, B:115:0x01d8, B:118:0x01e3), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a A[Catch: all -> 0x01e8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:45:0x0086, B:43:0x0080, B:48:0x0093, B:50:0x009b, B:52:0x00ad, B:55:0x00b4, B:57:0x00d0, B:59:0x00d8, B:58:0x00d4, B:62:0x00dd, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:79:0x0119, B:81:0x0120, B:86:0x0128, B:88:0x013a, B:90:0x0148, B:99:0x015d, B:101:0x01aa, B:102:0x01ae, B:104:0x01b5, B:109:0x01c2, B:111:0x01c8, B:112:0x01cb, B:114:0x01cf, B:115:0x01d8, B:118:0x01e3), top: B:124:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015d A[Catch: all -> 0x01e8, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:45:0x0086, B:43:0x0080, B:48:0x0093, B:50:0x009b, B:52:0x00ad, B:55:0x00b4, B:57:0x00d0, B:59:0x00d8, B:58:0x00d4, B:62:0x00dd, B:65:0x00e2, B:67:0x00ea, B:70:0x00f5, B:79:0x0119, B:81:0x0120, B:86:0x0128, B:88:0x013a, B:90:0x0148, B:99:0x015d, B:101:0x01aa, B:102:0x01ae, B:104:0x01b5, B:109:0x01c2, B:111:0x01c8, B:112:0x01cb, B:114:0x01cf, B:115:0x01d8, B:118:0x01e3), top: B:124:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kq0.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, ai.rp0
    public final void onPause() {
        if (c0()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            uj0.d("Could not pause webview.", e10);
        }
    }

    @Override // android.webkit.WebView, ai.rp0
    public final void onResume() {
        if (c0()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            uj0.d("Could not resume webview.", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.I.A() || this.I.B()) {
            u uVar = this.f6333x;
            if (uVar != null) {
                uVar.d(motionEvent);
            }
            oy oyVar = this.f6334y;
            if (oyVar != null) {
                oyVar.a(motionEvent);
            }
        } else {
            synchronized (this) {
                yz yzVar = this.f6310a0;
                if (yzVar != null) {
                    yzVar.a(motionEvent);
                }
            }
        }
        if (c0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // ai.em0
    public final synchronized int p() {
        return this.f6319j0;
    }

    @Override // wg.l
    public final synchronized void p0() {
        wg.l lVar = this.A;
        if (lVar != null) {
            lVar.p0();
        }
    }

    public final void p1() {
        vx.a(this.f6318i0.c(), this.f6316g0, "aeh2");
    }

    @Override // ai.rp0, ai.zq0
    public final synchronized ir0 q() {
        return this.L;
    }

    @Override // ai.rp0
    public final synchronized void q0(vz vzVar) {
        this.f6311b0 = vzVar;
    }

    public final synchronized void q1() {
        fl2 fl2Var = this.E;
        if (fl2Var != null && fl2Var.f4099j0) {
            uj0.a("Disabling hardware acceleration on an overlay.");
            r1();
            return;
        }
        if (!this.P && !this.L.g()) {
            if (Build.VERSION.SDK_INT < 18) {
                uj0.a("Disabling hardware acceleration on an AdView.");
                r1();
                return;
            }
            uj0.a("Enabling hardware acceleration on an AdView.");
            s1();
            return;
        }
        uj0.a("Enabling hardware acceleration on an overlay.");
        s1();
    }

    @Override // ai.rp0
    public final synchronized jm r() {
        return this.f6312c0;
    }

    @Override // ai.rp0
    public final synchronized void r0() {
        yg.p1.k("Destroying WebView!");
        t1();
        yg.d2.f61866i.post(new jq0(this));
    }

    public final synchronized void r1() {
        if (!this.Q) {
            setLayerType(1, null);
        }
        this.Q = true;
    }

    @Override // wg.l
    public final synchronized void s0() {
        wg.l lVar = this.A;
        if (lVar != null) {
            lVar.s0();
        }
    }

    public final synchronized void s1() {
        if (this.Q) {
            setLayerType(0, null);
        }
        this.Q = false;
    }

    @Override // android.webkit.WebView, ai.rp0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof yp0) {
            this.I = (yp0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (c0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            uj0.d("Could not stop loading webview.", e10);
        }
    }

    @Override // ai.xq0
    public final void t(xg.e eVar, boolean z10) {
        this.I.U(eVar, z10);
    }

    @Override // ai.rp0
    public final synchronized void t0(boolean z10) {
        boolean z11 = this.P;
        this.P = z10;
        q1();
        if (z10 != z11) {
            if (!((Boolean) ft.c().c(ox.L)).booleanValue() || !this.L.g()) {
                new zb0(this, "").f(true != z10 ? "default" : "expanded");
            }
        }
    }

    public final synchronized void t1() {
        if (this.f6323n0) {
            return;
        }
        this.f6323n0 = true;
        wg.t.h().n();
    }

    @Override // ai.em0
    public final int u() {
        return getMeasuredWidth();
    }

    @Override // ai.rp0
    public final synchronized boolean u0() {
        return this.S;
    }

    public final synchronized void u1() {
        Map<String, fo0> map = this.f6329t0;
        if (map != null) {
            for (fo0 fo0Var : map.values()) {
                fo0Var.release();
            }
        }
        this.f6329t0 = null;
    }

    @Override // ai.n60
    public final void v(String str) {
        throw null;
    }

    @Override // ai.rp0
    public final synchronized void v0(ir0 ir0Var) {
        this.L = ir0Var;
        requestLayout();
    }

    public final void v1() {
        by byVar = this.f6318i0;
        if (byVar == null) {
            return;
        }
        ey c10 = byVar.c();
        tx e10 = wg.t.h().e();
        if (e10 != null) {
            e10.b(c10);
        }
    }

    @Override // ai.rp0, ai.ar0
    public final u w() {
        return this.f6333x;
    }

    @Override // ai.xq0
    public final void w0(yg.v0 v0Var, ey1 ey1Var, pp1 pp1Var, nq2 nq2Var, String str, String str2, int i10) {
        this.I.Z(v0Var, ey1Var, pp1Var, nq2Var, str, str2, i10);
    }

    public final void w1(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z10 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        j0("onAdVisibilityChanged", hashMap);
    }

    @Override // ai.em0
    public final synchronized void y() {
        vz vzVar = this.f6311b0;
        if (vzVar != null) {
            vzVar.zza();
        }
    }

    @Override // ai.em0
    public final void y0(boolean z10, long j10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z10 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("duration", Long.toString(j10));
        j0("onCacheAccessComplete", hashMap);
    }

    @Override // ai.em0
    public final int z() {
        return getMeasuredHeight();
    }

    @Override // ai.nc1
    public final void zzb() {
        yp0 yp0Var = this.I;
        if (yp0Var != null) {
            yp0Var.zzb();
        }
    }
}
