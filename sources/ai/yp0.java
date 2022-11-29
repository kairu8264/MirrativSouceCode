package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzaat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class yp0 extends WebViewClient implements fr0 {
    public static final /* synthetic */ int Y = 0;
    public or A;
    public xg.q B;
    public dr0 C;
    public er0 D;
    public q20 E;
    public s20 F;
    public nc1 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public xg.x M;
    public yb0 N;
    public wg.b O;
    public tb0 P;
    public wg0 Q;
    public fr2 R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public final HashSet<String> W;
    public View.OnAttachStateChangeListener X;

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f12694w;

    /* renamed from: x  reason: collision with root package name */
    public final qn f12695x;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap<String, List<r30<? super rp0>>> f12696y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f12697z;

    public yp0(rp0 rp0Var, qn qnVar, boolean z10) {
        yb0 yb0Var = new yb0(rp0Var, rp0Var.D0(), new xw(rp0Var.getContext()));
        this.f12696y = new HashMap<>();
        this.f12697z = new Object();
        this.f12695x = qnVar;
        this.f12694w = rp0Var;
        this.J = z10;
        this.N = yb0Var;
        this.P = null;
        this.W = new HashSet<>(Arrays.asList(((String) ft.c().c(ox.U3)).split(",")));
    }

    public static WebResourceResponse u() {
        if (((Boolean) ft.c().c(ox.f8109v0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean z(boolean z10, rp0 rp0Var) {
        return (!z10 || rp0Var.q().g() || rp0Var.H().equals("interstitial_mb")) ? false : true;
    }

    public final boolean A() {
        boolean z10;
        synchronized (this.f12697z) {
            z10 = this.K;
        }
        return z10;
    }

    public final boolean B() {
        boolean z10;
        synchronized (this.f12697z) {
            z10 = this.L;
        }
        return z10;
    }

    @Override // ai.fr0
    public final void E0(boolean z10) {
        synchronized (this.f12697z) {
            this.K = true;
        }
    }

    @Override // ai.fr0
    public final void H0(boolean z10) {
        synchronized (this.f12697z) {
            this.L = z10;
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener K() {
        synchronized (this.f12697z) {
        }
        return null;
    }

    @Override // ai.fr0
    public final void L0(or orVar, q20 q20Var, xg.q qVar, s20 s20Var, xg.x xVar, boolean z10, u30 u30Var, wg.b bVar, ac0 ac0Var, wg0 wg0Var, ey1 ey1Var, fr2 fr2Var, pp1 pp1Var, nq2 nq2Var, s30 s30Var, nc1 nc1Var) {
        wg.b bVar2 = bVar == null ? new wg.b(this.f12694w.getContext(), wg0Var, null) : bVar;
        this.P = new tb0(this.f12694w, ac0Var);
        this.Q = wg0Var;
        if (((Boolean) ft.c().c(ox.C0)).booleanValue()) {
            p0("/adMetadata", new p20(q20Var));
        }
        if (s20Var != null) {
            p0("/appEvent", new r20(s20Var));
        }
        p0("/backButton", q30.f8788j);
        p0("/refresh", q30.f8789k);
        p0("/canOpenApp", q30.f8780b);
        p0("/canOpenURLs", q30.f8779a);
        p0("/canOpenIntents", q30.f8781c);
        p0("/close", q30.f8782d);
        p0("/customClose", q30.f8783e);
        p0("/instrument", q30.f8792n);
        p0("/delayPageLoaded", q30.f8794p);
        p0("/delayPageClosed", q30.f8795q);
        p0("/getLocationInfo", q30.f8796r);
        p0("/log", q30.f8785g);
        p0("/mraid", new y30(bVar2, this.P, ac0Var));
        yb0 yb0Var = this.N;
        if (yb0Var != null) {
            p0("/mraidLoaded", yb0Var);
        }
        p0("/open", new d40(bVar2, this.P, ey1Var, pp1Var, nq2Var));
        p0("/precache", new go0());
        p0("/touch", q30.f8787i);
        p0("/video", q30.f8790l);
        p0("/videoMeta", q30.f8791m);
        if (ey1Var != null && fr2Var != null) {
            p0("/click", hm2.a(ey1Var, fr2Var, nc1Var));
            p0("/httpTrack", hm2.b(ey1Var, fr2Var));
        } else {
            p0("/click", q30.b(nc1Var));
            p0("/httpTrack", q30.f8784f);
        }
        if (wg.t.a().g(this.f12694w.getContext())) {
            p0("/logScionEvent", new x30(this.f12694w.getContext()));
        }
        if (u30Var != null) {
            p0("/setInterstitialProperties", new t30(u30Var, null));
        }
        if (s30Var != null) {
            if (((Boolean) ft.c().c(ox.f8067p6)).booleanValue()) {
                p0("/inspectorNetworkExtras", s30Var);
            }
        }
        this.A = orVar;
        this.B = qVar;
        this.E = q20Var;
        this.F = s20Var;
        this.M = xVar;
        this.O = bVar2;
        this.G = nc1Var;
        this.H = z10;
        this.R = fr2Var;
    }

    public final ViewTreeObserver.OnScrollChangedListener M() {
        synchronized (this.f12697z) {
        }
        return null;
    }

    @Override // ai.fr0
    public final void M0(Uri uri) {
        String str;
        String path = uri.getPath();
        List<r30<? super rp0>> list = this.f12696y.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) ft.c().c(ox.T3)).booleanValue() && this.W.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) ft.c().c(ox.V3)).intValue()) {
                    if (path.length() != 0) {
                        str = "Parsing gmsg query params on BG thread: ".concat(path);
                    } else {
                        str = new String("Parsing gmsg query params on BG thread: ");
                    }
                    yg.p1.k(str);
                    j43.p(wg.t.d().T(uri), new wp0(this, list, path, uri), hk0.f4882e);
                    return;
                }
            }
            wg.t.d();
            y(yg.d2.r(uri), list, path);
            return;
        }
        yg.p1.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (!((Boolean) ft.c().c(ox.f7943a5)).booleanValue() || wg.t.h().e() == null) {
            return;
        }
        final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
        hk0.f4878a.execute(new Runnable(substring) { // from class: ai.up0

            /* renamed from: w  reason: collision with root package name */
            public final String f10787w;

            {
                this.f10787w = substring;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str2 = this.f10787w;
                int i10 = yp0.Y;
                wg.t.h().e().e(str2);
            }
        });
    }

    @Override // ai.fr0
    public final void P(er0 er0Var) {
        this.D = er0Var;
    }

    public final void R() {
        if (this.C != null && ((this.S && this.U <= 0) || this.T || this.I)) {
            if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue() && this.f12694w.l() != null) {
                vx.a(this.f12694w.l().c(), this.f12694w.h(), "awfllc");
            }
            dr0 dr0Var = this.C;
            boolean z10 = false;
            if (!this.T && !this.I) {
                z10 = true;
            }
            dr0Var.b(z10);
            this.C = null;
        }
        this.f12694w.L();
    }

    public final void U(xg.e eVar, boolean z10) {
        boolean T = this.f12694w.T();
        boolean z11 = z(T, this.f12694w);
        boolean z12 = true;
        if (!z11 && z10) {
            z12 = false;
        }
        l0(new AdOverlayInfoParcel(eVar, z11 ? null : this.A, T ? null : this.B, this.M, this.f12694w.m(), this.f12694w, z12 ? null : this.G));
    }

    public final void Z(yg.v0 v0Var, ey1 ey1Var, pp1 pp1Var, nq2 nq2Var, String str, String str2, int i10) {
        rp0 rp0Var = this.f12694w;
        l0(new AdOverlayInfoParcel(rp0Var, rp0Var.m(), v0Var, ey1Var, pp1Var, nq2Var, str, str2, i10));
    }

    public final WebResourceResponse a(String str, Map<String, String> map) {
        ym f10;
        try {
            if (dz.f3458a.e().booleanValue() && this.R != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.R.b(str);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String a10 = ci0.a(str, this.f12694w.getContext(), this.V);
            if (!a10.equals(str)) {
                return v(a10, map);
            }
            bn p10 = bn.p(Uri.parse(str));
            if (p10 != null && (f10 = wg.t.j().f(p10)) != null && f10.zza()) {
                return new WebResourceResponse("", "", f10.p());
            }
            if (tj0.j() && zy.f13275b.e().booleanValue()) {
                return v(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e10) {
            wg.t.h().k(e10, "AdWebViewClient.interceptRequest");
            return u();
        }
    }

    @Override // ai.fr0
    public final wg.b b() {
        return this.O;
    }

    public final void b0(boolean z10, int i10, boolean z11) {
        boolean z12 = z(this.f12694w.T(), this.f12694w);
        boolean z13 = true;
        if (!z12 && z11) {
            z13 = false;
        }
        or orVar = z12 ? null : this.A;
        xg.q qVar = this.B;
        xg.x xVar = this.M;
        rp0 rp0Var = this.f12694w;
        l0(new AdOverlayInfoParcel(orVar, qVar, xVar, rp0Var, z10, i10, rp0Var.m(), z13 ? null : this.G));
    }

    @Override // ai.fr0
    public final void b1(dr0 dr0Var) {
        this.C = dr0Var;
    }

    public final void c(boolean z10) {
        this.H = false;
    }

    @Override // ai.fr0
    public final boolean d() {
        boolean z10;
        synchronized (this.f12697z) {
            z10 = this.J;
        }
        return z10;
    }

    public final void e0(boolean z10, int i10, String str, boolean z11) {
        boolean T = this.f12694w.T();
        boolean z12 = z(T, this.f12694w);
        boolean z13 = true;
        if (!z12 && z11) {
            z13 = false;
        }
        or orVar = z12 ? null : this.A;
        xp0 xp0Var = T ? null : new xp0(this.f12694w, this.B);
        q20 q20Var = this.E;
        s20 s20Var = this.F;
        xg.x xVar = this.M;
        rp0 rp0Var = this.f12694w;
        l0(new AdOverlayInfoParcel(orVar, xp0Var, q20Var, s20Var, xVar, rp0Var, z10, i10, str, rp0Var.m(), z13 ? null : this.G));
    }

    public final void f(boolean z10) {
        this.V = z10;
    }

    @Override // ai.fr0
    public final void g() {
        wg0 wg0Var = this.Q;
        if (wg0Var != null) {
            WebView I = this.f12694w.I();
            if (o3.c0.U(I)) {
                s(I, wg0Var, 10);
                return;
            }
            t();
            vp0 vp0Var = new vp0(this, wg0Var);
            this.X = vp0Var;
            ((View) this.f12694w).addOnAttachStateChangeListener(vp0Var);
        }
    }

    @Override // ai.fr0
    public final void i() {
        synchronized (this.f12697z) {
        }
        this.U++;
        R();
    }

    @Override // ai.fr0
    public final void j() {
        this.U--;
        R();
    }

    public final void j0(boolean z10, int i10, String str, String str2, boolean z11) {
        boolean T = this.f12694w.T();
        boolean z12 = z(T, this.f12694w);
        boolean z13 = true;
        if (!z12 && z11) {
            z13 = false;
        }
        or orVar = z12 ? null : this.A;
        xp0 xp0Var = T ? null : new xp0(this.f12694w, this.B);
        q20 q20Var = this.E;
        s20 s20Var = this.F;
        xg.x xVar = this.M;
        rp0 rp0Var = this.f12694w;
        l0(new AdOverlayInfoParcel(orVar, xp0Var, q20Var, s20Var, xVar, rp0Var, z10, i10, str, str2, rp0Var.m(), z13 ? null : this.G));
    }

    @Override // ai.fr0
    public final void k() {
        qn qnVar = this.f12695x;
        if (qnVar != null) {
            qnVar.c(10005);
        }
        this.T = true;
        R();
        this.f12694w.destroy();
    }

    @Override // ai.fr0
    public final void k0(int i10, int i11, boolean z10) {
        yb0 yb0Var = this.N;
        if (yb0Var != null) {
            yb0Var.h(i10, i11);
        }
        tb0 tb0Var = this.P;
        if (tb0Var != null) {
            tb0Var.j(i10, i11, false);
        }
    }

    public final void l0(AdOverlayInfoParcel adOverlayInfoParcel) {
        xg.e eVar;
        tb0 tb0Var = this.P;
        boolean k10 = tb0Var != null ? tb0Var.k() : false;
        wg.t.c();
        xg.o.a(this.f12694w.getContext(), adOverlayInfoParcel, !k10);
        wg0 wg0Var = this.Q;
        if (wg0Var != null) {
            String str = adOverlayInfoParcel.H;
            if (str == null && (eVar = adOverlayInfoParcel.f27150w) != null) {
                str = eVar.f60264x;
            }
            wg0Var.A(str);
        }
    }

    @Override // ai.fr0
    public final void m0(int i10, int i11) {
        tb0 tb0Var = this.P;
        if (tb0Var != null) {
            tb0Var.l(i10, i11);
        }
    }

    public final /* synthetic */ void n() {
        this.f12694w.O();
        xg.n d02 = this.f12694w.d0();
        if (d02 != null) {
            d02.C();
        }
    }

    @Override // ai.or
    public final void onAdClicked() {
        or orVar = this.A;
        if (orVar != null) {
            orVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        yg.p1.k(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            M0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f12697z) {
            if (this.f12694w.c0()) {
                yg.p1.k("Blank page loaded, 1...");
                this.f12694w.r0();
                return;
            }
            this.S = true;
            er0 er0Var = this.D;
            if (er0Var != null) {
                er0Var.zzb();
                this.D = null;
            }
            R();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.I = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f12694w.I0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final /* synthetic */ void p(View view, wg0 wg0Var, int i10) {
        s(view, wg0Var, i10 - 1);
    }

    public final void p0(String str, r30<? super rp0> r30Var) {
        synchronized (this.f12697z) {
            List<r30<? super rp0>> list = this.f12696y.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f12696y.put(str, list);
            }
            list.add(r30Var);
        }
    }

    public final void s(final View view, final wg0 wg0Var, final int i10) {
        if (!wg0Var.d() || i10 <= 0) {
            return;
        }
        wg0Var.b(view);
        if (wg0Var.d()) {
            yg.d2.f61866i.postDelayed(new Runnable(this, view, wg0Var, i10) { // from class: ai.sp0

                /* renamed from: w  reason: collision with root package name */
                public final yp0 f9893w;

                /* renamed from: x  reason: collision with root package name */
                public final View f9894x;

                /* renamed from: y  reason: collision with root package name */
                public final wg0 f9895y;

                /* renamed from: z  reason: collision with root package name */
                public final int f9896z;

                {
                    this.f9893w = this;
                    this.f9894x = view;
                    this.f9895y = wg0Var;
                    this.f9896z = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9893w.p(this.f9894x, this.f9895y, this.f9896z);
                }
            }, 100L);
        }
    }

    public final void s0(String str, r30<? super rp0> r30Var) {
        synchronized (this.f12697z) {
            List<r30<? super rp0>> list = this.f12696y.get(str);
            if (list == null) {
                return;
            }
            list.remove(r30Var);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        yg.p1.k(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            M0(parse);
        } else {
            if (this.H && webView == this.f12694w.I()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    or orVar = this.A;
                    if (orVar != null) {
                        orVar.onAdClicked();
                        wg0 wg0Var = this.Q;
                        if (wg0Var != null) {
                            wg0Var.A(str);
                        }
                        this.A = null;
                    }
                    nc1 nc1Var = this.G;
                    if (nc1Var != null) {
                        nc1Var.zzb();
                        this.G = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f12694w.I().willNotDraw()) {
                try {
                    u w10 = this.f12694w.w();
                    if (w10 != null && w10.a(parse)) {
                        Context context = this.f12694w.getContext();
                        rp0 rp0Var = this.f12694w;
                        parse = w10.e(parse, context, (View) rp0Var, rp0Var.g());
                    }
                } catch (zzaat unused) {
                    String valueOf2 = String.valueOf(str);
                    uj0.f(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                wg.b bVar = this.O;
                if (bVar != null && !bVar.b()) {
                    this.O.c(str);
                } else {
                    U(new xg.e("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                uj0.f(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        }
        return true;
    }

    public final void t() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.X;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f12694w).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final WebResourceResponse v(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        String str2;
        String str3;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        wg.t.d().M(this.f12694w.getContext(), this.f12694w.m().f13013w, false, httpURLConnection, false, 60000);
                        tj0 tj0Var = new tj0(null);
                        tj0Var.a(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        tj0Var.c(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                uj0.f("Protocol is null");
                                return u();
                            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                if (protocol.length() != 0) {
                                    str3 = "Unsupported scheme: ".concat(protocol);
                                } else {
                                    str3 = new String("Unsupported scheme: ");
                                }
                                uj0.f(str3);
                                return u();
                            } else {
                                if (headerField.length() != 0) {
                                    str2 = "Redirecting to ".concat(headerField);
                                } else {
                                    str2 = new String("Redirecting to ");
                                }
                                uj0.a(str2);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            wg.t.d();
            return yg.d2.s(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void w0(String str, vh.o<r30<? super rp0>> oVar) {
        synchronized (this.f12697z) {
            List<r30<? super rp0>> list = this.f12696y.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (r30<? super rp0> r30Var : list) {
                if (oVar.apply(r30Var)) {
                    arrayList.add(r30Var);
                }
            }
            list.removeAll(arrayList);
        }
    }

    @Override // ai.fr0
    public final void x() {
        synchronized (this.f12697z) {
            this.H = false;
            this.J = true;
            hk0.f4882e.execute(new Runnable(this) { // from class: ai.tp0

                /* renamed from: w  reason: collision with root package name */
                public final yp0 f10365w;

                {
                    this.f10365w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10365w.n();
                }
            });
        }
    }

    public final void x0() {
        wg0 wg0Var = this.Q;
        if (wg0Var != null) {
            wg0Var.f();
            this.Q = null;
        }
        t();
        synchronized (this.f12697z) {
            this.f12696y.clear();
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.H = false;
            this.J = false;
            this.K = false;
            this.M = null;
            this.O = null;
            this.N = null;
            tb0 tb0Var = this.P;
            if (tb0Var != null) {
                tb0Var.i(true);
                this.P = null;
            }
            this.R = null;
        }
    }

    public final void y(Map<String, String> map, List<r30<? super rp0>> list, String str) {
        String str2;
        if (yg.p1.m()) {
            if (str.length() != 0) {
                str2 = "Received GMSG: ".concat(str);
            } else {
                str2 = new String("Received GMSG: ");
            }
            yg.p1.k(str2);
            for (String str3 : map.keySet()) {
                String str4 = map.get(str3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb2.append("  ");
                sb2.append(str3);
                sb2.append(": ");
                sb2.append(str4);
                yg.p1.k(sb2.toString());
            }
        }
        for (r30<? super rp0> r30Var : list) {
            r30Var.a(this.f12694w, map);
        }
    }

    @Override // ai.nc1
    public final void zzb() {
        nc1 nc1Var = this.G;
        if (nc1Var != null) {
            nc1Var.zzb();
        }
    }
}
