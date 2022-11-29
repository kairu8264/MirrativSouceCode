package gf;

import ae.g7;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.net.api.Referer;
import java.util.HashMap;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.b1;
import tb.c;

/* loaded from: classes2.dex */
public final class y0 extends Fragment implements uo.q0 {
    public static final a I0 = new a(null);
    public static final int J0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final androidx.activity.result.c<Intent> G0;
    public z0 H0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33515x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33516y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33517z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y0 a(String str, String str2) {
            jo.p.h(str, "url");
            y0 y0Var = new y0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_URL", str);
            bundle.putString("EXTRA_KEY_REFERER", str2);
            y0Var.V2(bundle);
            return y0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<HashMap<String, String>> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final HashMap<String, String> invoke() {
            Context N2 = y0.this.N2();
            jo.p.g(N2, "requireContext()");
            return xn.n0.g(wn.q.a("x-idfv", of.n.c(N2)));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends WebViewClient {
        public c() {
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
            if ((so.n.q("http", scheme, true) || so.n.q("https", scheme, true)) && y0.this.r3().checkDomainWhiteList(host)) {
                String b10 = of.n.f45411a.b(y0.this.r3(), str);
                g9.a.g("webview redirect url+auth:" + b10);
                if (b10 != null) {
                    webView.loadUrl(b10, y0.this.o3());
                }
            } else if (so.n.q("mirr", scheme, true)) {
                nd.r0.f42205a.b().a(str);
                y0.this.v3(parse);
                return true;
            } else if (y0.this.g1()) {
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                of.n nVar = of.n.f45411a;
                Context N2 = y0.this.N2();
                jo.p.g(N2, "requireContext()");
                if (nVar.d(N2, intent)) {
                    y0.this.f3(intent);
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.WebViewFragment$onViewCreated$3", f = "WebViewFragment.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33520w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g7 f33522y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Long> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g7 f33523w;

            @co.f(c = "com.dena.mirrorman.fragment.WebViewFragment$onViewCreated$3$1", f = "WebViewFragment.kt", l = {154}, m = "emit")
            /* renamed from: gf.y0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0404a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f33524w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f33525x;

                /* renamed from: z  reason: collision with root package name */
                public int f33527z;

                public C0404a(ao.d<? super C0404a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f33525x = obj;
                    this.f33527z |= Integer.MIN_VALUE;
                    return a.this.a(0L, this);
                }
            }

            public a(g7 g7Var) {
                this.f33523w = g7Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(long r5, ao.d<? super wn.v> r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof gf.y0.d.a.C0404a
                    if (r0 == 0) goto L13
                    r0 = r7
                    gf.y0$d$a$a r0 = (gf.y0.d.a.C0404a) r0
                    int r1 = r0.f33527z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f33527z = r1
                    goto L18
                L13:
                    gf.y0$d$a$a r0 = new gf.y0$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f33525x
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f33527z
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f33524w
                    gf.y0$d$a r5 = (gf.y0.d.a) r5
                    wn.m.b(r7)
                    goto L44
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    wn.m.b(r7)
                    r0.f33524w = r4
                    r0.f33527z = r3
                    java.lang.Object r5 = uo.b1.a(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    r5 = r4
                L44:
                    ae.g7 r5 = r5.f33523w
                    android.webkit.WebView r5 = r5.B
                    r5.reload()
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: gf.y0.d.a.a(long, ao.d):java.lang.Object");
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Long l10, ao.d dVar) {
                return a(l10.longValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g7 g7Var, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f33522y = g7Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f33522y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33520w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Long> g10 = y0.this.s3().g();
                a aVar = new a(this.f33522y);
                this.f33520w = 1;
                if (g10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
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
            return y0.this.M2().getString("EXTRA_KEY_REFERER");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<od.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33529w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33530x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33531y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33529w = componentCallbacks;
            this.f33530x = aVar;
            this.f33531y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.u0] */
        @Override // io.a
        public final od.u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f33529w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.u0.class), this.f33530x, this.f33531y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33532w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33533x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33534y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33532w = componentCallbacks;
            this.f33533x = aVar;
            this.f33534y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f33532w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f33533x, this.f33534y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33535w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33536x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33535w = componentCallbacks;
            this.f33536x = aVar;
            this.f33537y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f33535w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f33536x, this.f33537y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33538w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33539x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33540y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33538w = componentCallbacks;
            this.f33539x = aVar;
            this.f33540y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f33538w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f33539x, this.f33540y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33541w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f33541w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f33541w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33542w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f33542w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33542w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33543w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33544x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33545y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33546z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33543w = aVar;
            this.f33544x = aVar2;
            this.f33545y = aVar3;
            this.f33546z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33543w;
            vq.a aVar2 = this.f33544x;
            io.a aVar3 = this.f33545y;
            xq.a aVar4 = this.f33546z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.q0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33547w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f33547w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33547w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<String> {
        public n() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = y0.this.M2().getString("EXTRA_KEY_URL");
            jo.p.e(string);
            return string;
        }
    }

    public y0() {
        super(b1.fragment_web_view);
        this.f33515x0 = new da.j();
        this.f33516y0 = wn.g.a(new b());
        this.f33517z0 = wn.g.a(new e());
        this.A0 = wn.g.a(new n());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new f(this, null, null));
        this.C0 = wn.g.b(iVar, new g(this, null, null));
        this.D0 = wn.g.b(iVar, new h(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.E0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.q0.class), new m(kVar), new l(jVar, null, null, a10));
        this.F0 = wn.g.b(iVar, new i(this, null, null));
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: gf.x0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                y0.w3(y0.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…oadWithDelay(1000L)\n    }");
        this.G0 = I2;
    }

    public static final void w3(y0 y0Var, androidx.activity.result.a aVar) {
        jo.p.h(y0Var, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        y0Var.n3().a(1000L);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.H0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        g7 T = g7.T(view);
        WebSettings settings = T.B.getSettings();
        jo.p.g(settings, "binding.webView.settings");
        x3(settings);
        T.B.setLayerType(2, null);
        T.B.setWebViewClient(new c());
        WebSettings settings2 = T.B.getSettings();
        jo.p.g(settings2, "binding.webView.settings");
        x3(settings2);
        HashMap<String, String> o32 = o3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        o32.put("x-idfv", of.n.c(N2));
        String b10 = of.n.f45411a.b(r3(), t3());
        g9.a.g("webview url:" + t3());
        g9.a.g("webview url+auth:" + b10);
        if (b10 != null) {
            T.B.loadUrl(b10, o3());
        }
        uo.l.d(this, null, null, new d(T, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33515x0.getCoroutineContext();
    }

    public final od.u0 n3() {
        return (od.u0) this.B0.getValue();
    }

    public final HashMap<String, String> o3() {
        return (HashMap) this.f33516y0.getValue();
    }

    public final tb.c p3() {
        return (tb.c) this.F0.getValue();
    }

    public final String q3() {
        return (String) this.f33517z0.getValue();
    }

    public final ServerConfig r3() {
        return (ServerConfig) this.D0.getValue();
    }

    public final nf.q0 s3() {
        return (nf.q0) this.E0.getValue();
    }

    public final String t3() {
        return (String) this.A0.getValue();
    }

    public final of.k u3() {
        return (of.k) this.C0.getValue();
    }

    public final void v3(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            Context q02 = q0();
            if (q02 != null) {
                String uri2 = uri.toString();
                jo.p.g(uri2, "uri.toString()");
                jf.b0 a10 = u3().a(uri2);
                if (a10 instanceof b0.j0) {
                    z0 z0Var = this.H0;
                    if (z0Var != null) {
                        z0Var.a();
                        return;
                    }
                    return;
                }
                boolean z10 = a10 instanceof b0.i0;
                String str = Referer.DEEPLINK;
                if (z10) {
                    if (((b0.i0) a10).c()) {
                        tb.c p32 = p3();
                        String b10 = ((b0.i0) a10).b();
                        String q32 = q3();
                        if (q32 == null) {
                            q32 = Referer.WEBVIEW;
                        }
                        tb.a i10 = c.a.i(p32, b10, q32, true, false, 8, null);
                        i10.a().z3(p0(), i10.b());
                        return;
                    }
                    androidx.activity.result.c<Intent> cVar = this.G0;
                    HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                    String q33 = q3();
                    if (q33 != null) {
                        str = q33;
                    }
                    cVar.a(aVar.a(q02, str, a10));
                } else if (a10 instanceof b0.l0) {
                } else {
                    androidx.activity.result.c<Intent> cVar2 = this.G0;
                    HandleUrlSchemeActivity.a aVar2 = HandleUrlSchemeActivity.f25127b0;
                    String q34 = q3();
                    if (q34 != null) {
                        str = q34;
                    }
                    cVar2.a(aVar2.a(q02, str, a10));
                    z0 z0Var2 = this.H0;
                    if (z0Var2 != null) {
                        z0Var2.a();
                    }
                }
            }
        } catch (ClassCastException e10) {
            g9.a.c(e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.H0 = context instanceof z0 ? (z0) context : null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void x3(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }
}
