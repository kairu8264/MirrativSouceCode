package com.dena.mirrativ.catalog.search;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Outline;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c9.e0;
import c9.n;
import com.dena.mirrativ.catalog.search.SearchAppFragment;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.net.api.Referer;
import ha.a;
import hf.c;
import hf.v0;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import r8.f1;
import r8.h1;
import t8.w;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes.dex */
public final class SearchAppFragment extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public String C0;
    public final wn.f D0;
    public final wn.f E0;
    public String F0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ q0 f20738x0 = r0.b();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f20739y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public int f20740z0;
    public static final /* synthetic */ qo.h<Object>[] H0 = {f0.d(new s(SearchAppFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/FragmentSearchAppBinding;", 0))};
    public static final a G0 = new a(null);
    public static final int I0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            p.h(view, "view");
            p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(SearchAppFragment.this, 12));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.l<c.a, v> {
        public c() {
            super(1);
        }

        public final void a(c.a aVar) {
            p.h(aVar, "it");
            if (SearchAppFragment.this.o1()) {
                v0 y32 = SearchAppFragment.this.y3();
                FragmentManager p02 = SearchAppFragment.this.p0();
                p.g(p02, "childFragmentManager");
                if (v0.c(y32, p02, SearchAppFragment.this.F0, false, 4, null)) {
                    SearchAppFragment.this.w3().c(SearchAppFragment.this.F0, aVar, !aVar.h());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.l<c.a, v> {
        public d() {
            super(1);
        }

        public final void a(c.a aVar) {
            p.h(aVar, "it");
            if (SearchAppFragment.this.o1()) {
                SearchAppFragment searchAppFragment = SearchAppFragment.this;
                AppPageActivity.a aVar2 = AppPageActivity.f25660c0;
                androidx.fragment.app.h L2 = searchAppFragment.L2();
                p.g(L2, "requireActivity()");
                searchAppFragment.f3(aVar2.a(L2, aVar.d(), SearchAppFragment.this.F0, aVar.c()));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(c.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RecyclerView.u {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Integer f10;
            p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = SearchAppFragment.this.v3().B.getLayoutManager();
            p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).l2() != SearchAppFragment.this.f20740z0 - 1 || p.c(SearchAppFragment.this.x3().p().f(), a.b.f34695b) || (f10 = SearchAppFragment.this.x3().m().f()) == null) {
                return;
            }
            int intValue = f10.intValue();
            SearchAppFragment searchAppFragment = SearchAppFragment.this;
            searchAppFragment.E3(searchAppFragment.C0, intValue, true);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<v> {
        public f() {
            super(0);
        }

        public final void a() {
            SearchAppFragment searchAppFragment = SearchAppFragment.this;
            searchAppFragment.F3(searchAppFragment.C0);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<c9.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20746w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20747x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20748y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20746w = componentCallbacks;
            this.f20747x = aVar;
            this.f20748y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c9.a, java.lang.Object] */
        @Override // io.a
        public final c9.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20746w;
            return gq.a.a(componentCallbacks).c(f0.b(c9.a.class), this.f20747x, this.f20748y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20749w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20750x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20751y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20749w = componentCallbacks;
            this.f20750x = aVar;
            this.f20751y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f20749w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f20750x, this.f20751y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<hf.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20752w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20753x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20754y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20752w = componentCallbacks;
            this.f20753x = aVar;
            this.f20754y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d, java.lang.Object] */
        @Override // io.a
        public final hf.d invoke() {
            ComponentCallbacks componentCallbacks = this.f20752w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d.class), this.f20753x, this.f20754y);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20755w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f20755w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20755w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20756w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f20756w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f20756w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20757w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20758x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20759y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20760z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20757w = aVar;
            this.f20758x = aVar2;
            this.f20759y = aVar3;
            this.f20760z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20757w;
            vq.a aVar2 = this.f20758x;
            io.a aVar3 = this.f20759y;
            xq.a aVar4 = this.f20760z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20761w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f20761w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((androidx.lifecycle.v0) this.f20761w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public SearchAppFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new g(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.B0 = androidx.fragment.app.e0.a(this, f0.b(e0.class), new m(kVar), new l(jVar, null, null, a10));
        this.C0 = "";
        this.D0 = wn.g.b(iVar, new h(this, null, null));
        this.E0 = wn.g.b(iVar, new i(this, null, null));
        this.F0 = "";
    }

    public static final void B3(SearchAppFragment searchAppFragment, List list) {
        p.h(searchAppFragment, "this$0");
        searchAppFragment.f20740z0 = list.size();
        if (searchAppFragment.z3()) {
            return;
        }
        RecyclerView.h adapter = searchAppFragment.v3().B.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null) {
            nVar.d(list);
        }
    }

    public static final void C3(SearchAppFragment searchAppFragment, String str, Bundle bundle) {
        p.h(searchAppFragment, "this$0");
        p.h(str, "<anonymous parameter 0>");
        p.h(bundle, "bundle");
        String string = bundle.getString("bundleKey");
        if (string != null) {
            searchAppFragment.F3(string);
        }
    }

    public static final void D3(SearchAppFragment searchAppFragment, ha.a aVar) {
        p.h(searchAppFragment, "this$0");
        if (aVar instanceof a.d) {
            searchAppFragment.v3().C.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            searchAppFragment.v3().C.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.e) {
            searchAppFragment.v3().C.b(new StatusView.b.d(searchAppFragment.U0(h1.text_no_broadcast), 0.0f, 2, null));
        } else if ((aVar instanceof a.C0439a) && searchAppFragment.f20740z0 == 0) {
            StatusView statusView = searchAppFragment.v3().C;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = searchAppFragment.U0(h1.f49918a);
                p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new f()));
        }
    }

    public final void A3() {
        this.F0 = Referer.Search.RECOMMEND_APPS;
        RecyclerView.h adapter = v3().B.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null) {
            nVar.d(null);
        }
        this.f20740z0 = 0;
        w3().e(this.F0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, f1.fragment_search_app, viewGroup, false);
        p.g(e10, "inflate(inflater, R.layo…ch_app, container, false)");
        G3((w) e10);
        View u10 = v3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    public final void E3(String str, int i10, boolean z10) {
        p.h(str, "keyword");
        if (TextUtils.isEmpty(str) || i10 == 0) {
            return;
        }
        w3().d(this.F0, str, i10 > 1 ? Integer.valueOf(i10) : null, z10, true);
    }

    public final void F3(String str) {
        if (TextUtils.isEmpty(str)) {
            this.C0 = "";
            A3();
            return;
        }
        this.C0 = str;
        this.F0 = Referer.Search.APP;
        u3().a(this.F0);
        RecyclerView.h adapter = v3().B.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null) {
            nVar.d(null);
        }
        this.f20740z0 = 0;
        E3(str, 1, false);
    }

    public final void G3(w wVar) {
        this.f20739y0.a(this, H0[0], wVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        p.h(bundle, "outState");
        super.b2(bundle);
        bundle.putString("EXTRA_LAST_KEYWORD", this.C0);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        if (bundle != null) {
            String string = bundle.getString("EXTRA_LAST_KEYWORD", "");
            p.g(string, "savedInstanceState.getSt…g(EXTRA_LAST_KEYWORD, \"\")");
            this.C0 = string;
        }
        RecyclerView recyclerView = v3().B;
        final Context context = v3().u().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.dena.mirrativ.catalog.search.SearchAppFragment$onViewCreated$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return true;
            }
        });
        v3().B.setOutlineProvider(new b());
        v3().B.setClipToOutline(true);
        RecyclerView recyclerView2 = v3().B;
        n nVar = new n(false, null);
        nVar.h(new c());
        nVar.g(new d());
        recyclerView2.setAdapter(nVar);
        v3().B.k(new e());
        if (TextUtils.isEmpty(this.C0)) {
            this.C0 = "";
            A3();
        } else {
            F3(this.C0);
        }
        x3().j().i(a1(), new androidx.lifecycle.f0() { // from class: c9.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SearchAppFragment.B3(SearchAppFragment.this, (List) obj);
            }
        });
        I0().h1(U0(h1.text_search_app), a1(), new androidx.fragment.app.v() { // from class: c9.i
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle2) {
                SearchAppFragment.C3(SearchAppFragment.this, str, bundle2);
            }
        });
        x3().p().i(a1(), new androidx.lifecycle.f0() { // from class: c9.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SearchAppFragment.D3(SearchAppFragment.this, (ha.a) obj);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f20738x0.getCoroutineContext();
    }

    public final hf.d u3() {
        return (hf.d) this.E0.getValue();
    }

    public final w v3() {
        return (w) this.f20739y0.b(this, H0[0]);
    }

    public final c9.a w3() {
        return (c9.a) this.A0.getValue();
    }

    public final e0 x3() {
        return (e0) this.B0.getValue();
    }

    public final v0 y3() {
        return (v0) this.D0.getValue();
    }

    public final boolean z3() {
        androidx.fragment.app.h j02;
        return h1() || m1() || (j02 = j0()) == null || j02.isFinishing();
    }
}
