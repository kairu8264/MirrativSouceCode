package c9;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.google.firebase.analytics.FirebaseAnalytics;
import ha.a;
import hf.v0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import r8.f1;
import r8.h1;
import uo.q0;
import uo.r0;

/* loaded from: classes.dex */
public final class k0 extends Fragment implements q0, AbsListView.OnScrollListener {
    public final we.f A0;
    public String B0;
    public View C0;
    public final wn.f D0;
    public final wn.f E0;
    public String F0;
    public boolean G0;
    public final wn.f H0;
    public final wn.f I0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ q0 f18930x0 = r0.b();

    /* renamed from: y0  reason: collision with root package name */
    public final AutoClearedValue f18931y0 = nd.a.a(this);

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f18932z0;
    public static final /* synthetic */ qo.h<Object>[] K0 = {jo.f0.d(new jo.s(k0.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/FragmentSearchUserBinding;", 0))};
    public static final a J0 = new a(null);
    public static final int L0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<Integer, Boolean, wn.v> {
        public b() {
            super(2);
        }

        public final void a(int i10, boolean z10) {
            UrgeUser item = k0.this.A0.getItem(i10);
            if (k0.this.o1()) {
                if (z10) {
                    k0.this.u3(i10, item.getUserId());
                } else {
                    k0.this.M3(i10, item.getUserId());
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, Boolean bool) {
            a(num.intValue(), bool.booleanValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {
        public c() {
            super(0);
        }

        public final void a() {
            k0 k0Var = k0.this;
            k0Var.I3(k0Var.F0);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.search.SearchUserFragment$onCreateView$7", f = "SearchUserFragment.kt", l = {133}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f18935w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.p<? extends Integer, ? extends Boolean, ? extends MRError>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k0 f18937w;

            public a(k0 k0Var) {
                this.f18937w = k0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.p<Integer, Boolean, ? extends MRError> pVar, ao.d<? super wn.v> dVar) {
                this.f18937w.A0.q(pVar.d().intValue(), pVar.e().booleanValue());
                MRError f10 = pVar.f();
                if (f10 instanceof MRError.Maintenance ? true : jo.p.c(f10, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f18937w.N2(), pVar.f());
                } else {
                    of.n nVar = of.n.f45411a;
                    Context N2 = this.f18937w.N2();
                    String message = pVar.f().getMessage();
                    if (message == null) {
                        message = this.f18937w.U0(h1.f49918a);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(N2, message, false);
                }
                return wn.v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18935w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.p<Integer, Boolean, MRError>> s10 = k0.this.A3().s();
                a aVar = new a(k0.this);
                this.f18935w = 1;
                if (s10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18938w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18939x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18940y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18938w = componentCallbacks;
            this.f18939x = aVar;
            this.f18940y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f18938w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f18939x, this.f18940y);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<c9.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18941w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18942x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18943y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18941w = componentCallbacks;
            this.f18942x = aVar;
            this.f18943y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c9.a, java.lang.Object] */
        @Override // io.a
        public final c9.a invoke() {
            ComponentCallbacks componentCallbacks = this.f18941w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(c9.a.class), this.f18942x, this.f18943y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18944w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18945x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18944w = componentCallbacks;
            this.f18945x = aVar;
            this.f18946y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f18944w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(v0.class), this.f18945x, this.f18946y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18947w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18948x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18949y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18947w = componentCallbacks;
            this.f18948x = aVar;
            this.f18949y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f18947w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(v0.class), this.f18948x, this.f18949y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18950w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f18950w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f18950w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18951w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f18951w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18951w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18952w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18953x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18954y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18955z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18952w = aVar;
            this.f18953x = aVar2;
            this.f18954y = aVar3;
            this.f18955z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18952w;
            vq.a aVar2 = this.f18953x;
            io.a aVar3 = this.f18954y;
            xq.a aVar4 = this.f18955z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18956w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f18956w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((androidx.lifecycle.v0) this.f18956w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public k0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f18932z0 = wn.g.b(iVar, new e(this, null, null));
        this.A0 = new we.f(null, true, false, false, true, 1, null);
        this.B0 = "";
        this.D0 = wn.g.b(iVar, new f(this, null, null));
        i iVar2 = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar2);
        this.E0 = androidx.fragment.app.e0.a(this, jo.f0.b(e0.class), new l(jVar), new k(iVar2, null, null, a10));
        this.F0 = "";
        this.G0 = true;
        this.H0 = wn.g.b(iVar, new g(this, null, null));
        this.I0 = wn.g.b(iVar, new h(this, null, null));
    }

    public static final void C3(k0 k0Var, AdapterView adapterView, View view, int i10, long j10) {
        jo.p.h(k0Var, "this$0");
        if (i10 >= k0Var.A0.getCount()) {
            return;
        }
        k0Var.L3(k0Var.A0.getItem(i10).getUserId(), k0Var.B0);
    }

    public static final void D3(k0 k0Var, String str, Bundle bundle) {
        jo.p.h(k0Var, "this$0");
        jo.p.h(str, "key");
        jo.p.h(bundle, "bundle");
        String string = bundle.getString("bundleKey");
        if (string != null) {
            k0Var.I3(string);
        }
    }

    public static final void E3(k0 k0Var, List list) {
        jo.p.h(k0Var, "this$0");
        we.f fVar = k0Var.A0;
        jo.p.g(list, "users");
        fVar.c(list);
    }

    public static final void F3(k0 k0Var, ha.a aVar) {
        jo.p.h(k0Var, "this$0");
        if (aVar instanceof a.d) {
            k0Var.v3().B.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            k0Var.v3().B.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.e) {
            k0Var.v3().B.b(new StatusView.b.d(k0Var.U0(h1.text_no_broadcast), 0.0f, 2, null));
        } else if ((aVar instanceof a.C0439a) && k0Var.G0) {
            StatusView statusView = k0Var.v3().B;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = k0Var.U0(h1.f49918a);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new c()));
        }
    }

    public static final void G3(k0 k0Var, wn.k kVar) {
        jo.p.h(k0Var, "this$0");
        if (!k0Var.o1()) {
            k0Var.K3((String) kVar.c(), ((Boolean) kVar.d()).booleanValue());
        }
        hf.b.f35490a.h();
        Context q02 = k0Var.q0();
        if (q02 != null) {
            FirebaseAnalytics.getInstance(q02).a("jdwii7", null);
        }
    }

    public final e0 A3() {
        return (e0) this.E0.getValue();
    }

    public final v0 B3() {
        return (v0) this.I0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        t8.c0 T = t8.c0.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        J3(T);
        this.C0 = D0().inflate(f1.f49900q, (ViewGroup) null);
        v3().C.setAdapter((ListAdapter) this.A0);
        v3().C.setOnScrollListener(this);
        v3().C.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: c9.f0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                k0.C3(k0.this, adapterView, view, i10, j10);
            }
        });
        if (bundle != null) {
            String string = bundle.getString("EXTRA_LAST_KEYWORD", "");
            jo.p.g(string, "savedInstanceState.getSt…g(EXTRA_LAST_KEYWORD, \"\")");
            this.F0 = string;
        }
        this.A0.p(new b());
        if (TextUtils.isEmpty(this.F0)) {
            this.F0 = "";
            y3();
        } else {
            I3(this.F0);
        }
        I0().h1(U0(h1.text_users), a1(), new androidx.fragment.app.v() { // from class: c9.g0
            @Override // androidx.fragment.app.v
            public final void a(String str, Bundle bundle2) {
                k0.D3(k0.this, str, bundle2);
            }
        });
        A3().r().i(a1(), new androidx.lifecycle.f0() { // from class: c9.i0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k0.E3(k0.this, (List) obj);
            }
        });
        A3().q().i(a1(), new androidx.lifecycle.f0() { // from class: c9.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k0.F3(k0.this, (ha.a) obj);
            }
        });
        A3().k().i(a1(), new androidx.lifecycle.f0() { // from class: c9.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k0.G3(k0.this, (wn.k) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        View u10 = v3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void H3(String str, int i10) {
        jo.p.h(str, "keyword");
        if (TextUtils.isEmpty(str) || i10 == 0) {
            return;
        }
        z3().g(this.B0, str, i10 > 1 ? Integer.valueOf(i10) : null);
    }

    public final void I3(String str) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.F0)) {
                return;
            }
            this.A0.d();
            this.F0 = "";
            y3();
            return;
        }
        this.F0 = str;
        this.B0 = Referer.Search.USER;
        this.G0 = true;
        this.A0.d();
        H3(str, 1);
    }

    public final void J3(t8.c0 c0Var) {
        this.f18931y0.a(this, K0[0], c0Var);
    }

    public final void K3(String str, boolean z10) {
        try {
            int count = this.A0.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                UrgeUser item = this.A0.getItem(i10);
                if (jo.p.c(item.getUserId(), str)) {
                    item.setFollowing(z10);
                    this.A0.notifyDataSetChanged();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void L3(String str, String str2) {
        if (!x3().i(str)) {
            v0 x32 = x3();
            FragmentManager p02 = p0();
            jo.p.g(p02, "childFragmentManager");
            if (!v0.c(x32, p02, str2, false, 4, null)) {
                return;
            }
        }
        jo.p.e(str2);
        String simpleName = k0.class.getSimpleName();
        jo.p.g(simpleName, "javaClass.simpleName");
        g9.a.j(str, str2, simpleName, "");
        if (jo.p.c(x3().x(), str)) {
            tb.c w32 = w3();
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            f3(w32.z0(N2));
            return;
        }
        tb.c w33 = w3();
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        f3(w33.s(N22, str, str2));
    }

    public final void M3(int i10, String str) {
        this.A0.q(i10, false);
        z3().i(this.B0, str, i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void b2(Bundle bundle) {
        jo.p.h(bundle, "outState");
        super.b2(bundle);
        bundle.putString("EXTRA_LAST_KEYWORD", this.F0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f18930x0.getCoroutineContext();
    }

    @dq.l
    public final void onEvent(nd.y yVar) {
        jo.p.h(yVar, "event");
        if (o1()) {
            return;
        }
        K3(yVar.a(), yVar.b());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        Integer f10;
        if (i12 != i10 + i11 || jo.p.c(A3().q().f(), a.b.f34695b) || (f10 = A3().n().f()) == null) {
            return;
        }
        int intValue = f10.intValue();
        this.G0 = false;
        H3(this.F0, intValue);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }

    public final void u3(int i10, String str) {
        v0 B3 = B3();
        FragmentManager p02 = p0();
        jo.p.g(p02, "childFragmentManager");
        if (v0.c(B3, p02, this.B0 + Referer.FOLLOW, false, 4, null)) {
            this.A0.q(i10, true);
            z3().h(this.B0, str, i10);
        }
    }

    public final t8.c0 v3() {
        return (t8.c0) this.f18931y0.b(this, K0[0]);
    }

    public final tb.c w3() {
        return (tb.c) this.f18932z0.getValue();
    }

    public final v0 x3() {
        return (v0) this.H0.getValue();
    }

    public final void y3() {
        this.B0 = Referer.Search.RECOMMEND_USERS;
        this.G0 = true;
        this.A0.d();
        z3().f(this.B0);
    }

    public final c9.a z3() {
        return (c9.a) this.D0.getValue();
    }
}
