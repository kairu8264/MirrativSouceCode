package ad;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import com.dena.mirrativ.customview.StatusView;
import ha.a;
import kotlin.KotlinNothingValueException;
import kq.a;

/* loaded from: classes2.dex */
public final class e2 extends Fragment {
    public static final a C0 = new a(null);
    public static final int D0 = 8;
    public final wn.f A0;
    public final wn.f B0;

    /* renamed from: x0  reason: collision with root package name */
    public pc.a2 f980x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f981y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f982z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e2 a() {
            return new e2();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractTermsFragment$observeStoreValues$3", f = "ContractTermsFragment.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f983w;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractTermsFragment$observeStoreValues$3$1", f = "ContractTermsFragment.kt", l = {76}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f985w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e2 f986x;

            /* renamed from: ad.e2$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0022a implements xo.d<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ e2 f987w;

                public C0022a(e2 e2Var) {
                    this.f987w = e2Var;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                    this.f987w.C3(a1.f951z0.a(false), "ContractCompeteFragment");
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e2 e2Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f986x = e2Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f986x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f985w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<wn.v> g10 = this.f986x.t3().g();
                    C0022a c0022a = new C0022a(this.f986x);
                    this.f985w = 1;
                    if (g10.a(c0022a, this) == c10) {
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

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f983w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.o g10 = e2.this.a1().g();
                jo.p.g(g10, "viewLifecycleOwner.lifecycle");
                o.c cVar = o.c.STARTED;
                a aVar = new a(e2.this, null);
                this.f983w = 1;
                if (RepeatOnLifecycleKt.a(g10, cVar, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e2.this.s3().c("contract.terms");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            e2.this.r3().d();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            e2.this.r3().e();
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (url == null) {
                return true;
            }
            String host = url.getHost();
            if (host == null) {
                host = "";
            }
            if (so.n.C(host, "href", false, 2, null)) {
                e2.this.f3(new Intent("android.intent.action.VIEW", url));
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<w0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f990w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f991x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f992y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f990w = componentCallbacks;
            this.f991x = aVar;
            this.f992y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ad.w0, java.lang.Object] */
        @Override // io.a
        public final w0 invoke() {
            ComponentCallbacks componentCallbacks = this.f990w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(w0.class), this.f991x, this.f992y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f993w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f994x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f995y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f993w = componentCallbacks;
            this.f994x = aVar;
            this.f995y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ad.t1] */
        @Override // io.a
        public final t1 invoke() {
            ComponentCallbacks componentCallbacks = this.f993w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(t1.class), this.f994x, this.f995y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f996w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f996w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f996w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f996w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f997w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f997w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f997w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f998w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f999x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1000y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1001z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f998w = aVar;
            this.f999x = aVar2;
            this.f1000y = aVar3;
            this.f1001z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f998w;
            vq.a aVar2 = this.f999x;
            io.a aVar3 = this.f1000y;
            xq.a aVar4 = this.f1001z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(y1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1002w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f1002w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1002w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1003w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f1003w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f1003w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1004w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f1004w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1004w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1005w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1006x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1007y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1005w = aVar;
            this.f1006x = aVar2;
            this.f1007y = aVar3;
            this.f1008z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1005w;
            vq.a aVar2 = this.f1006x;
            io.a aVar3 = this.f1007y;
            xq.a aVar4 = this.f1008z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(x1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1009w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f1009w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1009w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public e2() {
        super(nc.f.fragment_contract_terms);
        g gVar = new g(this);
        xq.a a10 = gq.a.a(this);
        h hVar = new h(gVar);
        this.f981y0 = androidx.fragment.app.e0.a(this, jo.f0.b(y1.class), new j(hVar), new i(gVar, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f982z0 = wn.g.b(iVar, new e(this, null, null));
        this.A0 = wn.g.b(iVar, new f(this, null, null));
        k kVar = new k(this);
        xq.a a11 = gq.a.a(this);
        l lVar = new l(kVar);
        this.B0 = androidx.fragment.app.e0.a(this, jo.f0.b(x1.class), new n(lVar), new m(kVar, null, null, a11));
    }

    public static final boolean A3(e2 e2Var, MenuItem menuItem) {
        jo.p.h(e2Var, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            e2Var.L2().finish();
            return false;
        }
        return true;
    }

    public static final void B3(e2 e2Var, View view) {
        jo.p.h(e2Var, "this$0");
        e2Var.I0().R0();
    }

    public static final void w3(e2 e2Var, ha.a aVar) {
        jo.p.h(e2Var, "this$0");
        pc.a2 a2Var = e2Var.f980x0;
        pc.a2 a2Var2 = null;
        if (a2Var == null) {
            jo.p.v("binding");
            a2Var = null;
        }
        a2Var.C.b(jo.p.c(aVar, a.b.f34695b) ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
        pc.a2 a2Var3 = e2Var.f980x0;
        if (a2Var3 == null) {
            jo.p.v("binding");
            a2Var3 = null;
        }
        WebView webView = a2Var3.D;
        jo.p.g(webView, "binding.termsWebview");
        webView.setVisibility(aVar.a() ^ true ? 0 : 8);
        pc.a2 a2Var4 = e2Var.f980x0;
        if (a2Var4 == null) {
            jo.p.v("binding");
        } else {
            a2Var2 = a2Var4;
        }
        AppCompatButton appCompatButton = a2Var2.B;
        jo.p.g(appCompatButton, "binding.startButton");
        appCompatButton.setVisibility(aVar.a() ^ true ? 0 : 8);
    }

    public static final void x3(e2 e2Var, String str) {
        jo.p.h(e2Var, "this$0");
        pc.a2 a2Var = e2Var.f980x0;
        if (a2Var == null) {
            jo.p.v("binding");
            a2Var = null;
        }
        a2Var.D.loadUrl(str);
    }

    public final void C3(Fragment fragment, String str) {
        I0().k().r(((FragmentContainerView) L2().findViewById(nc.e.fragment_container_view)).getId(), fragment).g(str).i();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.a2 T = pc.a2.T(view);
        jo.p.g(T, "bind(view)");
        this.f980x0 = T;
        y3();
        z3();
        v3();
        pc.a2 a2Var = this.f980x0;
        pc.a2 a2Var2 = null;
        if (a2Var == null) {
            jo.p.v("binding");
            a2Var = null;
        }
        TextView textView = (TextView) a2Var.E.B.findViewById(nc.e.B6);
        if (textView != null) {
            textView.setText(U0(nc.i.text_contract_step_1_terms));
        }
        pc.a2 a2Var3 = this.f980x0;
        if (a2Var3 == null) {
            jo.p.v("binding");
            a2Var3 = null;
        }
        a2Var3.B.setText(U0(nc.i.text_contract_step_1_agree_terms_and_contract));
        pc.a2 a2Var4 = this.f980x0;
        if (a2Var4 == null) {
            jo.p.v("binding");
        } else {
            a2Var2 = a2Var4;
        }
        AppCompatButton appCompatButton = a2Var2.B;
        jo.p.g(appCompatButton, "binding.startButton");
        yd.g1.a(appCompatButton, new c());
    }

    public final w0 r3() {
        return (w0) this.f982z0.getValue();
    }

    public final t1 s3() {
        return (t1) this.A0.getValue();
    }

    public final x1 t3() {
        return (x1) this.B0.getValue();
    }

    public final y1 u3() {
        return (y1) this.f981y0.getValue();
    }

    public final void v3() {
        u3().i().i(a1(), new androidx.lifecycle.f0() { // from class: ad.c2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e2.w3(e2.this, (ha.a) obj);
            }
        });
        u3().j().i(a1(), new androidx.lifecycle.f0() { // from class: ad.d2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e2.x3(e2.this, (String) obj);
            }
        });
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new b(null), 3, null);
    }

    public final void y3() {
        pc.a2 a2Var = this.f980x0;
        if (a2Var == null) {
            jo.p.v("binding");
            a2Var = null;
        }
        a2Var.D.setWebViewClient(new d());
    }

    public final void z3() {
        pc.a2 a2Var = this.f980x0;
        if (a2Var == null) {
            jo.p.v("binding");
            a2Var = null;
        }
        Toolbar toolbar = a2Var.E.B;
        toolbar.inflateMenu(nc.g.contract_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: ad.b2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean A3;
                A3 = e2.A3(e2.this, menuItem);
                return A3;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ad.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e2.B3(e2.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
    }
}
