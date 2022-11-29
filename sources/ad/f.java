package ad;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.a;
import java.util.List;
import kq.a;

/* loaded from: classes2.dex */
public final class f extends Fragment {

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f1011x0;

    /* renamed from: y0  reason: collision with root package name */
    public j f1012y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final a f1010z0 = new a(null);
    public static final int A0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a() {
            return new f();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1013w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f1013w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f1013w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1014w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f1014w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1014w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1015w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1016x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1017y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1018z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1015w = aVar;
            this.f1016x = aVar2;
            this.f1017y = aVar3;
            this.f1018z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1015w;
            vq.a aVar2 = this.f1016x;
            io.a aVar3 = this.f1017y;
            xq.a aVar4 = this.f1018z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1019w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f1019w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1019w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* renamed from: ad.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0023f extends jo.q implements io.l<bd.a, wn.v> {
        public C0023f() {
            super(1);
        }

        public final void a(bd.a aVar) {
            jo.p.h(aVar, "it");
            if (aVar instanceof a.C0113a) {
                f.this.L2().setResult(-1, new Intent().putExtra("KEY_SELECTED_BANK", aVar));
                f.this.L2().finish();
            } else if (aVar instanceof a.c) {
                f.this.I0().k().r(((FragmentContainerView) f.this.L2().findViewById(nc.e.f41831k2)).getId(), p.B0.a(aVar.a(), ((a.c) aVar).c())).g("BankListFragment").i();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(bd.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<ad.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1021w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1022x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1023y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1021w = componentCallbacks;
            this.f1022x = aVar;
            this.f1023y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ad.a] */
        @Override // io.a
        public final ad.a invoke() {
            ComponentCallbacks componentCallbacks = this.f1021w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ad.a.class), this.f1022x, this.f1023y);
        }
    }

    public f() {
        super(nc.f.fragment_bank_index);
        this.f1011x0 = wn.g.b(wn.i.SYNCHRONIZED, new g(this, null, null));
    }

    public static final void o3(pc.i1 i1Var, List list) {
        jo.p.h(i1Var, "$binding");
        RecyclerView.h adapter = i1Var.B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.BankIndexAdapter");
        ((ad.c) adapter).d(list);
    }

    public static final boolean r3(f fVar, MenuItem menuItem) {
        jo.p.h(fVar, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            fVar.L2().finish();
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        p3((j) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(j.class), new e(cVar), new d(bVar, null, null, a10)).getValue()));
        l3().c();
        super.A1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.i1 T = pc.i1.T(view);
        ad.c cVar = new ad.c();
        T.B.setLayoutManager(new LinearLayoutManager(N2()));
        T.B.setAdapter(cVar);
        cVar.h(new C0023f());
        jo.p.g(T, "binding");
        q3(T);
        n3(T);
    }

    public final ad.a l3() {
        return (ad.a) this.f1011x0.getValue();
    }

    public final j m3() {
        j jVar = this.f1012y0;
        if (jVar != null) {
            return jVar;
        }
        jo.p.v("store");
        return null;
    }

    public final void n3(final pc.i1 i1Var) {
        m3().f().i(a1(), new androidx.lifecycle.f0() { // from class: ad.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                f.o3(pc.i1.this, (List) obj);
            }
        });
    }

    public final void p3(j jVar) {
        jo.p.h(jVar, "<set-?>");
        this.f1012y0 = jVar;
    }

    public final void q3(pc.i1 i1Var) {
        Toolbar toolbar = i1Var.C.B;
        toolbar.inflateMenu(nc.g.bank_select_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: ad.d
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean r32;
                r32 = f.r3(f.this, menuItem);
                return r32;
            }
        });
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(nc.i.text_contract_bank_select_title));
        textView.setTextColor(c3.a.d(N2(), nc.b.F));
        toolbar.setBackgroundResource(nc.h.f41869c);
    }
}
