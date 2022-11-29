package ad;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.a;
import java.util.List;
import kq.a;

/* loaded from: classes2.dex */
public final class p extends Fragment {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public q A0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f1248x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f1249y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f1250z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p a(String str, int i10) {
            jo.p.h(str, "indexTitle");
            p pVar = new p();
            pVar.V2(k3.b.a(wn.q.a("EXTRA_INDEX_TITLE", str), wn.q.a("EXTRA_INDEX", Integer.valueOf(i10))));
            return pVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Integer> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(p.this.M2().getInt("EXTRA_INDEX"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = p.this.M2().getString("EXTRA_INDEX_TITLE");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1253w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f1253w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f1253w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1254w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f1254w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1254w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1255w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1256x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1257y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1255w = aVar;
            this.f1256x = aVar2;
            this.f1257y = aVar3;
            this.f1258z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1255w;
            vq.a aVar2 = this.f1256x;
            io.a aVar3 = this.f1257y;
            xq.a aVar4 = this.f1258z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(q.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1259w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f1259w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1259w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<bd.a, wn.v> {
        public h() {
            super(1);
        }

        public final void a(bd.a aVar) {
            jo.p.h(aVar, "it");
            if (aVar instanceof a.C0113a) {
                p.this.L2().setResult(-1, new Intent().putExtra("KEY_SELECTED_BANK", aVar));
                p.this.L2().finish();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(bd.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1261w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1262x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1263y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1261w = componentCallbacks;
            this.f1262x = aVar;
            this.f1263y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ad.k] */
        @Override // io.a
        public final k invoke() {
            ComponentCallbacks componentCallbacks = this.f1261w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(k.class), this.f1262x, this.f1263y);
        }
    }

    public p() {
        super(nc.f.fragment_bank_list);
        this.f1248x0 = wn.g.a(new c());
        this.f1249y0 = wn.g.a(new b());
        this.f1250z0 = wn.g.b(wn.i.SYNCHRONIZED, new i(this, null, null));
    }

    public static final void r3(pc.k1 k1Var, List list) {
        jo.p.h(k1Var, "$binding");
        RecyclerView.h adapter = k1Var.B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.BankIndexAdapter");
        ((ad.c) adapter).d(list);
    }

    public static final boolean u3(p pVar, MenuItem menuItem) {
        jo.p.h(pVar, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            pVar.L2().finish();
            return false;
        }
        return true;
    }

    public static final void v3(p pVar, View view) {
        jo.p.h(pVar, "this$0");
        pVar.I0().R0();
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        d dVar = new d(this);
        xq.a a10 = gq.a.a(this);
        e eVar = new e(dVar);
        s3((q) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(q.class), new g(eVar), new f(dVar, null, null, a10)).getValue()));
        m3().c(n3());
        super.A1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        pc.k1 T = pc.k1.T(view);
        jo.p.g(T, "binding");
        t3(T);
        T.B.setLayoutManager(new LinearLayoutManager(N2()));
        RecyclerView recyclerView = T.B;
        ad.c cVar = new ad.c();
        cVar.h(new h());
        recyclerView.setAdapter(cVar);
        q3(T);
        super.e2(view, bundle);
    }

    public final k m3() {
        return (k) this.f1250z0.getValue();
    }

    public final int n3() {
        return ((Number) this.f1249y0.getValue()).intValue();
    }

    public final String o3() {
        return (String) this.f1248x0.getValue();
    }

    public final q p3() {
        q qVar = this.A0;
        if (qVar != null) {
            return qVar;
        }
        jo.p.v("store");
        return null;
    }

    public final void q3(final pc.k1 k1Var) {
        p3().f().i(a1(), new androidx.lifecycle.f0() { // from class: ad.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                p.r3(pc.k1.this, (List) obj);
            }
        });
    }

    public final void s3(q qVar) {
        jo.p.h(qVar, "<set-?>");
        this.A0 = qVar;
    }

    public final void t3(pc.k1 k1Var) {
        Toolbar toolbar = k1Var.C.B;
        toolbar.inflateMenu(nc.g.bank_select_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: ad.n
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean u32;
                u32 = p.u3(p.this, menuItem);
                return u32;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ad.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.v3(p.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        textView.setVisibility(0);
        textView.setText(o3());
        textView.setTextColor(c3.a.d(N2(), nc.b.F));
        toolbar.setBackgroundResource(nc.h.f41869c);
    }
}
