package be;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.webkit.WebView;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.AutoClearedValue;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k1 extends androidx.fragment.app.e {
    public final wn.f N0;
    public final AutoClearedValue O0;
    public final wn.f P0;
    public final b Q0;
    public static final /* synthetic */ qo.h<Object>[] S0 = {jo.f0.d(new jo.s(k1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogEmomoRunGiftInfoBinding;", 0))};
    public static final a R0 = new a(null);
    public static final int T0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k1 a(String str) {
            jo.p.h(str, "url");
            k1 k1Var = new k1();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_URL", str);
            k1Var.V2(bundle);
            return k1Var;
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
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(k1.this, 12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends androidx.activity.e {
        public c() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            if (k1.this.D3().E.canGoBack()) {
                return;
            }
            k1.this.n3();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17952w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17953x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17954y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17952w = componentCallbacks;
            this.f17953x = aVar;
            this.f17954y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f17952w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f17953x, this.f17954y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k1.this.M2().getString("EXTRA_URL");
            jo.p.e(string);
            return string;
        }
    }

    public k1() {
        super(nd.b1.dialog_emomo_run_gift_info);
        this.N0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
        this.O0 = nd.a.a(this);
        this.P0 = wn.g.a(new e());
        this.Q0 = new b();
    }

    public static final void G3(k1 k1Var, View view) {
        jo.p.h(k1Var, "this$0");
        k1Var.n3();
    }

    public final ae.v0 D3() {
        return (ae.v0) this.O0.b(this, S0[0]);
    }

    public final ServerConfig E3() {
        return (ServerConfig) this.N0.getValue();
    }

    public final String F3() {
        return (String) this.P0.getValue();
    }

    public final void H3(ae.v0 v0Var) {
        this.O0.a(this, S0[0], v0Var);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        ae.v0 T = ae.v0.T(view);
        jo.p.g(T, "bind(view)");
        H3(T);
        L2().c1().a(a1(), new c());
        D3().E.loadUrl(F3());
        D3().E.getSettings().setJavaScriptEnabled(true);
        D3().E.getSettings().setDomStorageEnabled(true);
        D3().E.getSettings().setLoadWithOverviewMode(true);
        D3().E.getSettings().setUseWideViewPort(true);
        D3().E.getSettings().setUserAgentString(ApiUtil.INSTANCE.userAgent());
        String b10 = of.n.f45411a.b(E3(), F3());
        if (b10 != null) {
            WebView webView = D3().E;
            HashMap hashMap = new HashMap();
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            hashMap.put("x-idfv", of.n.c(N2));
            wn.v vVar = wn.v.f59242a;
            webView.loadUrl(b10, hashMap);
        }
        D3().D.setOutlineProvider(this.Q0);
        D3().D.setClipToOutline(true);
        D3().B.setOnClickListener(new View.OnClickListener() { // from class: be.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k1.G3(k1.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int b10;
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(D3().C);
        if (O0().getConfiguration().orientation == 2) {
            b10 = de.e.b(this, 280);
        } else {
            b10 = de.e.b(this, 480);
        }
        cVar.l(D3().D.getId(), b10);
        cVar.c(D3().C);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
