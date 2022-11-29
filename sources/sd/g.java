package sd;

import ae.m5;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.net.api.Referer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.b0;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kf.x;
import nd.b1;
import nd.r0;
import nd.x0;
import of.k;
import oq.a;
import qo.h;
import so.n;
import tb.c;
import wn.i;

/* loaded from: classes2.dex */
public class g extends androidx.fragment.app.e implements oq.a {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final HashMap<String, String> R0;
    public final wn.f S0;
    public String T0;
    public static final /* synthetic */ h<Object>[] V0 = {f0.d(new s(g.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentWebviewBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(String str, Boolean bool) {
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_URL", str);
            bundle.putBoolean("ARG_NEEDS_CLOSE", p.c(bool, Boolean.TRUE));
            gVar.V2(bundle);
            return gVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void A(DialogInterface dialogInterface);
    }

    /* loaded from: classes2.dex */
    public static final class c extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, mm.c> f52660a = new LinkedHashMap();

        public c() {
        }

        public final mm.c a(String str) {
            if (str == null) {
                return null;
            }
            if (this.f52660a.containsKey(str)) {
                return this.f52660a.get(str);
            }
            mm.c e10 = gm.c.c().e(str, "GET");
            p.g(e10, "getInstance().newHttpMet…rformance.HttpMethod.GET)");
            e10.b("userId", g.this.L3().T4());
            e10.c(200);
            this.f52660a.put(str, e10);
            return e10;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            mm.c a10 = a(str);
            if (a10 == null) {
                return;
            }
            a10.f();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            mm.c a10 = a(str);
            if (a10 == null) {
                return;
            }
            a10.e();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String mimeType;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            boolean z10 = true;
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                z10 = false;
            }
            if (z10) {
                Uri url = webResourceRequest.getUrl();
                mm.c a10 = a(url != null ? url.toString() : null);
                if (a10 == null) {
                    return;
                }
                if (webResourceResponse != null) {
                    a10.c(webResourceResponse.getStatusCode());
                }
                if (webResourceResponse == null || (mimeType = webResourceResponse.getMimeType()) == null) {
                    return;
                }
                a10.d(mimeType);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse;
            p.h(webView, "view");
            g9.a.g("webview redirect url:" + str);
            if (str == null || (parse = Uri.parse(str)) == null) {
                return true;
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            parse.getPath();
            if ((n.q("http", scheme, true) || n.q("https", scheme, true)) && g.this.J3().checkDomainWhiteList(host)) {
                String b10 = of.n.f45411a.b(g.this.J3(), str);
                g9.a.g("webview redirect url+auth:" + b10);
                if (b10 != null) {
                    webView.loadUrl(b10, g.this.R0);
                    return false;
                }
                return false;
            } else if (n.q("mirr", scheme, true)) {
                r0.f42205a.b().a(str);
                g.this.M3(parse);
                return true;
            } else {
                if (g.this.g1()) {
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    of.n nVar = of.n.f45411a;
                    Context N2 = g.this.N2();
                    p.g(N2, "requireContext()");
                    if (nVar.d(N2, intent)) {
                        g.this.f3(intent);
                    }
                }
                return true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f52662w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52663x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52664y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f52662w = componentCallbacks;
            this.f52663x = aVar;
            this.f52664y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f52662w;
            return gq.a.a(componentCallbacks).c(f0.b(k.class), this.f52663x, this.f52664y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f52665w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52666x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52667y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f52665w = componentCallbacks;
            this.f52666x = aVar;
            this.f52667y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f52665w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f52666x, this.f52667y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f52668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f52668w = componentCallbacks;
            this.f52669x = aVar;
            this.f52670y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f52668w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f52669x, this.f52670y);
        }
    }

    /* renamed from: sd.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0805g extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f52671w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f52672x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f52673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0805g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f52671w = componentCallbacks;
            this.f52672x = aVar;
            this.f52673y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f52671w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f52672x, this.f52673y);
        }
    }

    public g() {
        i iVar = i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        this.P0 = wn.g.b(iVar, new e(this, null, null));
        this.Q0 = wn.g.b(iVar, new f(this, null, null));
        this.R0 = new HashMap<>();
        this.S0 = wn.g.b(iVar, new C0805g(this, null, null));
    }

    public static final void O3(g gVar, View view) {
        p.h(gVar, "this$0");
        gVar.m3();
    }

    public static final boolean Q3(Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        p.h(dialog, "$this_apply");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            dialog.dismiss();
            return true;
        }
        return false;
    }

    public static final void T3(g gVar, View view) {
        p.h(gVar, "this$0");
        gVar.m3();
    }

    public final m5 H3() {
        return (m5) this.N0.b(this, V0[0]);
    }

    public final tb.c I3() {
        return (tb.c) this.S0.getValue();
    }

    public final ServerConfig J3() {
        return (ServerConfig) this.P0.getValue();
    }

    public final k K3() {
        return (k) this.O0.getValue();
    }

    public final x L3() {
        return (x) this.Q0.getValue();
    }

    public final void M3(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            Context q02 = q0();
            if (q02 != null) {
                String uri2 = uri.toString();
                p.g(uri2, "uri.toString()");
                b0 a10 = K3().a(uri2);
                if (a10 instanceof b0.j0) {
                    n3();
                } else if (a10 instanceof b0.i0) {
                    if (((b0.i0) a10).c()) {
                        FragmentManager A0 = A0();
                        if (A0 != null) {
                            tb.a i10 = c.a.i(I3(), ((b0.i0) a10).b(), Referer.WEBVIEW, true, false, 8, null);
                            i10.a().z3(A0, i10.b());
                            return;
                        }
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

    public final void N3() {
        Bundle n02 = n0();
        this.T0 = n02 != null ? n02.getString("ARG_URL") : null;
        H3().D.setOnClickListener(new View.OnClickListener() { // from class: sd.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.O3(g.this, view);
            }
        });
        H3().C.setBackgroundColor(0);
        H3().C.setWebViewClient(new c());
        WebSettings settings = H3().C.getSettings();
        p.g(settings, "binding.webview.settings");
        P3(settings);
        HashMap<String, String> hashMap = this.R0;
        Context N2 = N2();
        p.g(N2, "requireContext()");
        hashMap.put("x-idfv", of.n.c(N2));
        String b10 = of.n.f45411a.b(J3(), this.T0);
        g9.a.g("webview url:" + this.T0);
        g9.a.g("webview url+auth:" + b10);
        if (b10 != null) {
            H3().C.loadUrl(b10, this.R0);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void P3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    public final void R3(m5 m5Var) {
        this.N0.a(this, V0[0], m5Var);
    }

    public final void S3() {
        Window window;
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Bundle n02 = n0();
        Boolean valueOf = n02 != null ? Boolean.valueOf(n02.getBoolean("ARG_NEEDS_CLOSE")) : null;
        p.e(valueOf);
        if (valueOf.booleanValue()) {
            H3().B.setVisibility(0);
            H3().B.setOnClickListener(new View.OnClickListener() { // from class: sd.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.T3(g.this, view);
                }
            });
            ViewGroup.LayoutParams layoutParams = H3().C.getLayoutParams();
            layoutParams.width = O0().getDimensionPixelOffset(x0.dialog_web_view_width);
            layoutParams.height = O0().getDimensionPixelOffset(x0.dialog_web_view_height);
            H3().C.setLayoutParams(layoutParams);
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        S3();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        androidx.fragment.app.h j02 = j0();
        if (j02 instanceof b) {
            ((b) j02).A(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_webview, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        R3((m5) e10);
        N3();
        S3();
        final Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(H3().u());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: sd.d
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean Q3;
                Q3 = g.Q3(dialog, dialogInterface, i10, keyEvent);
                return Q3;
            }
        });
        return dialog;
    }
}
