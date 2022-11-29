package gf;

import ae.u6;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.c3;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.base.WebViewActivity;
import ha.a;
import java.io.Serializable;
import java.util.List;
import kq.a;
import nd.f1;
import org.greenrobot.eventbus.ThreadMode;
import tb.c;
import ud.x1;

/* loaded from: classes2.dex */
public final class n0 extends Fragment implements uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public nf.t D0;
    public final AutoClearedValue E0;
    public final wn.f F0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33422x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33423y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33424z0;
    public static final /* synthetic */ qo.h<Object>[] H0 = {jo.f0.d(new jo.s(n0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentLiveGiftCheerUsersBinding;", 0))};
    public static final a G0 = new a(null);
    public static final int I0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n0 a(String str, String str2, String str3) {
            jo.p.h(str, "referer");
            n0 n0Var = new n0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_ID", str2);
            bundle.putString("EXTRA_KEY_USER_ID", str3);
            bundle.putSerializable("EXTRA_KEY_RANKING_TYPE", jf.x.CHEER);
            n0Var.V2(bundle);
            return n0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return n0.this.M2().getString("EXTRA_KEY_LIVE_ID");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33426w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f33426w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f33426w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33427w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f33427w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33427w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33428w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33429x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33430y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33431z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33428w = aVar;
            this.f33429x = aVar2;
            this.f33430y = aVar3;
            this.f33431z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33428w;
            vq.a aVar2 = this.f33429x;
            io.a aVar3 = this.f33430y;
            xq.a aVar4 = this.f33431z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.t.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33432w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f33432w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33432w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<x1.e, wn.v> {
        public g() {
            super(1);
        }

        public final void a(x1.e eVar) {
            jo.p.h(eVar, "it");
            tb.c s32 = n0.this.s3();
            String w32 = n0.this.w3();
            if (w32 == null) {
                w32 = "";
            }
            tb.a j10 = c.a.j(s32, w32, eVar.c(), n0.this.v3(), false, false, 16, null);
            j10.a().z3(n0.this.p0(), j10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(x1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<x1.a, wn.v> {
        public h() {
            super(1);
        }

        public final void a(x1.a aVar) {
            jo.p.h(aVar, "it");
            n0 n0Var = n0.this;
            WebViewActivity.a aVar2 = WebViewActivity.X;
            Context N2 = n0Var.N2();
            jo.p.g(N2, "requireContext()");
            n0Var.f3(WebViewActivity.a.b(aVar2, N2, aVar.b(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(x1.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            n0.this.q3().d(n0.this.v3(), n0.this.t3(), n0.this.w3());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<jf.x> {
        public j() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final jf.x invoke() {
            Serializable serializable = n0.this.M2().getSerializable("EXTRA_KEY_RANKING_TYPE");
            jo.p.e(serializable);
            return (jf.x) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<String> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = n0.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<od.u> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33439x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33438w = componentCallbacks;
            this.f33439x = aVar;
            this.f33440y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.u] */
        @Override // io.a
        public final od.u invoke() {
            ComponentCallbacks componentCallbacks = this.f33438w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.u.class), this.f33439x, this.f33440y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33441w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33442x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33443y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33441w = componentCallbacks;
            this.f33442x = aVar;
            this.f33443y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f33441w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f33442x, this.f33443y);
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
            return n0.this.M2().getString("EXTRA_KEY_USER_ID");
        }
    }

    public n0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f33423y0 = wn.g.b(iVar, new l(this, null, null));
        this.f33424z0 = wn.g.a(new k());
        this.A0 = wn.g.a(new b());
        this.B0 = wn.g.a(new n());
        this.C0 = wn.g.a(new j());
        this.E0 = nd.a.a(this);
        this.F0 = wn.g.b(iVar, new m(this, null, null));
    }

    public static final void x3(n0 n0Var, List list) {
        jo.p.h(n0Var, "this$0");
        RecyclerView.h adapter = n0Var.r3().D.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LiveGiftCheerUserAdapter");
        ((rd.j0) adapter).d(list);
    }

    public static final void y3(n0 n0Var, ha.a aVar) {
        jo.p.h(n0Var, "this$0");
        boolean z10 = false;
        if (aVar instanceof a.d) {
            n0Var.r3().E.b(StatusView.b.c.f20791w);
            n0Var.r3().D.setVisibility(0);
        } else if (aVar instanceof a.b) {
            n0Var.r3().E.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            nf.t tVar = null;
            if (aVar instanceof a.e) {
                n0Var.r3().E.b(new StatusView.b.d(n0Var.U0(f1.text_gift_ranking_cheer_empty_disply), 0.0f, 2, null));
                n0Var.r3().D.setVisibility(0);
            } else if (aVar instanceof a.C0439a) {
                nf.t tVar2 = n0Var.D0;
                if (tVar2 == null) {
                    jo.p.v("store");
                } else {
                    tVar = tVar2;
                }
                List<x1> f10 = tVar.g().f();
                if ((f10 == null || f10.isEmpty()) ? true : true) {
                    StatusView statusView = n0Var.r3().E;
                    String message = ((a.C0439a) aVar).b().getMessage();
                    if (message == null) {
                        message = n0Var.U0(f1.f41966c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    statusView.b(new StatusView.b.a(message, new i()));
                    n0Var.r3().D.setVisibility(8);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        d dVar = new d(cVar);
        this.D0 = (nf.t) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.t.class), new f(dVar), new e(cVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        u6 T = u6.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(\n            inf…          false\n        )");
        z3(T);
        dq.c.c().p(this);
        View u10 = r3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        dq.c.c().r(this);
        super.H1();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        r3().D.setLayoutManager(new LinearLayoutManager(N2()));
        r3().D.setAdapter(new rd.j0());
        RecyclerView.h adapter = r3().D.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LiveGiftCheerUserAdapter");
        ((rd.j0) adapter).i(new g());
        RecyclerView.h adapter2 = r3().D.getAdapter();
        jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LiveGiftCheerUserAdapter");
        ((rd.j0) adapter2).j(new h());
        nf.t tVar = this.D0;
        nf.t tVar2 = null;
        if (tVar == null) {
            jo.p.v("store");
            tVar = null;
        }
        tVar.g().i(a1(), new androidx.lifecycle.f0() { // from class: gf.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n0.x3(n0.this, (List) obj);
            }
        });
        nf.t tVar3 = this.D0;
        if (tVar3 == null) {
            jo.p.v("store");
        } else {
            tVar2 = tVar3;
        }
        tVar2.h().i(a1(), new androidx.lifecycle.f0() { // from class: gf.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n0.y3(n0.this, (ha.a) obj);
            }
        });
        q3().d(v3(), t3(), w3());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33422x0.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c3 c3Var) {
        jo.p.h(c3Var, "event");
        r3().D.setNestedScrollingEnabled(u3() == c3Var.a());
    }

    public final od.u q3() {
        return (od.u) this.f33423y0.getValue();
    }

    public final u6 r3() {
        return (u6) this.E0.b(this, H0[0]);
    }

    public final tb.c s3() {
        return (tb.c) this.F0.getValue();
    }

    public final String t3() {
        return (String) this.A0.getValue();
    }

    public final jf.x u3() {
        return (jf.x) this.C0.getValue();
    }

    public final String v3() {
        return (String) this.f33424z0.getValue();
    }

    public final String w3() {
        return (String) this.B0.getValue();
    }

    public final void z3(u6 u6Var) {
        this.E0.a(this, H0[0], u6Var);
    }
}
