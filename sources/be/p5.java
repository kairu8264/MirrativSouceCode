package be;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.net.api.Referer;
import java.util.HashMap;
import jf.b0;
import tb.c;

/* loaded from: classes2.dex */
public final class p5 extends androidx.fragment.app.e {
    public static final a U0 = new a(null);
    public static final int V0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final b S0;
    public o5 T0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p5 a(String str) {
            jo.p.h(str, "url");
            p5 p5Var = new p5();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_URL", str);
            p5Var.V2(bundle);
            return p5Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(p5.this, 12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<HashMap<String, String>> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final HashMap<String, String> invoke() {
            Context N2 = p5.this.N2();
            jo.p.g(N2, "requireContext()");
            return xn.n0.g(wn.q.a("x-idfv", of.n.c(N2)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            p5.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse;
            jo.p.h(webView, "view");
            g9.a.g("webview redirect url:" + str);
            if (str == null || (parse = Uri.parse(str)) == null) {
                return true;
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ((so.n.q("http", scheme, true) || so.n.q("https", scheme, true)) && p5.this.F3().checkDomainWhiteList(host)) {
                String b10 = of.n.f45411a.b(p5.this.F3(), str);
                g9.a.g("webview redirect url+auth:" + b10);
                if (b10 != null) {
                    webView.loadUrl(b10, p5.this.D3());
                    return false;
                }
                return false;
            } else if (so.n.q("mirr", scheme, true)) {
                nd.r0.f42205a.b().a(str);
                p5.this.I3(parse);
                return true;
            } else {
                if (p5.this.g1()) {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    of.n nVar = of.n.f45411a;
                    Context N2 = p5.this.N2();
                    jo.p.g(N2, "requireContext()");
                    if (nVar.d(N2, intent)) {
                        p5.this.f3(intent);
                    }
                }
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18045w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18046x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18045w = componentCallbacks;
            this.f18046x = aVar;
            this.f18047y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f18045w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f18046x, this.f18047y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18048w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18049x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18050y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18048w = componentCallbacks;
            this.f18049x = aVar;
            this.f18050y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f18048w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f18049x, this.f18050y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18051w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18052x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18051w = componentCallbacks;
            this.f18052x = aVar;
            this.f18053y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f18051w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f18052x, this.f18053y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<String> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = p5.this.M2().getString("EXTRA_KEY_URL");
            jo.p.e(string);
            return string;
        }
    }

    public p5() {
        super(nd.b1.dialog_fragment_web_view_pop_up);
        this.N0 = wn.g.a(new c());
        this.O0 = wn.g.a(new i());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new f(this, null, null));
        this.Q0 = wn.g.b(iVar, new g(this, null, null));
        this.R0 = wn.g.b(iVar, new h(this, null, null));
        this.S0 = new b();
    }

    public final HashMap<String, String> D3() {
        return (HashMap) this.N0.getValue();
    }

    public final tb.c E3() {
        return (tb.c) this.R0.getValue();
    }

    public final ServerConfig F3() {
        return (ServerConfig) this.Q0.getValue();
    }

    public final String G3() {
        return (String) this.O0.getValue();
    }

    public final of.k H3() {
        return (of.k) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.T0 = null;
        super.I1();
    }

    public final void I3(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            Context q02 = q0();
            if (q02 != null) {
                String uri2 = uri.toString();
                jo.p.g(uri2, "uri.toString()");
                jf.b0 a10 = H3().a(uri2);
                if (a10 instanceof b0.j0) {
                    n3();
                } else if (a10 instanceof b0.i0) {
                    if (((b0.i0) a10).c()) {
                        FragmentManager I0 = I0();
                        tb.a i10 = c.a.i(E3(), ((b0.i0) a10).b(), Referer.WEBVIEW, true, false, 8, null);
                        i10.a().z3(I0, i10.b());
                        return;
                    }
                    f3(HandleUrlSchemeActivity.f25127b0.a(q02, Referer.DEEPLINK, a10));
                } else if (a10 instanceof b0.l0) {
                } else {
                    f3(HandleUrlSchemeActivity.f25127b0.a(q02, Referer.DEEPLINK, a10));
                    n3();
                }
            }
        } catch (ClassCastException e10) {
            g9.a.c(e10);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void J3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.k5 T = ae.k5.T(view);
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new d());
        T.C.setOutlineProvider(this.S0);
        T.C.setClipToOutline(true);
        WebSettings settings = T.D.getSettings();
        jo.p.g(settings, "binding.webView.settings");
        J3(settings);
        T.D.setLayerType(2, null);
        T.D.setWebViewClient(new e());
        WebSettings settings2 = T.D.getSettings();
        jo.p.g(settings2, "binding.webView.settings");
        J3(settings2);
        HashMap<String, String> D3 = D3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        D3.put("x-idfv", of.n.c(N2));
        String b10 = of.n.f45411a.b(F3(), G3());
        g9.a.g("webview url:" + G3());
        g9.a.g("webview url+auth:" + b10);
        if (b10 != null) {
            T.D.loadUrl(b10, D3());
        }
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        o5 o5Var = this.T0;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.T0 = context instanceof o5 ? (o5) context : null;
    }
}
