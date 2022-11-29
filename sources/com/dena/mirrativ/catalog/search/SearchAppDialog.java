package com.dena.mirrativ.catalog.search;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c9.e0;
import c9.n;
import com.dena.mirrativ.catalog.search.SearchAppDialog;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import ha.a;
import io.l;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import r8.f1;
import r8.h1;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes.dex */
public final class SearchAppDialog extends androidx.fragment.app.e implements q0 {
    public int P0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {f0.d(new s(SearchAppDialog.class, "binding", "getBinding()Lcom/dena/mirrativ/catalog/databinding/DialogFragmentSearchAppBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;
    public final /* synthetic */ q0 N0 = r0.b();
    public final AutoClearedValue O0 = nd.a.a(this);
    public String Q0 = "";

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final SearchAppDialog a(String str) {
            SearchAppDialog searchAppDialog = new SearchAppDialog();
            Bundle bundle = new Bundle();
            bundle.putString("appId", str);
            searchAppDialog.V2(bundle);
            return searchAppDialog;
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
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(SearchAppDialog.this, 12));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements l<String, v> {
        public c() {
            super(1);
        }

        public final void a(String str) {
            p.h(str, "appId");
            SearchAppDialog.this.I0().g1("SearchLiveWithApp", k3.b.a(wn.q.a("bundleKey", str)));
            SearchAppDialog.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends RecyclerView.u {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Integer f10;
            p.h(recyclerView, "recyclerView");
            RecyclerView.p layoutManager = SearchAppDialog.this.O3().B.getLayoutManager();
            p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (((LinearLayoutManager) layoutManager).l2() != SearchAppDialog.this.P0 - 1 || p.c(SearchAppDialog.this.Q3().o().f(), a.b.f34695b) || (f10 = SearchAppDialog.this.Q3().l().f()) == null) {
                return;
            }
            int intValue = f10.intValue();
            SearchAppDialog searchAppDialog = SearchAppDialog.this;
            searchAppDialog.Y3(searchAppDialog.Q0, intValue, true);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<v> {
        public e() {
            super(0);
        }

        public final void a() {
            if (p.c(SearchAppDialog.this.Q0, "")) {
                SearchAppDialog.this.R3();
                return;
            }
            SearchAppDialog searchAppDialog = SearchAppDialog.this;
            searchAppDialog.Y3(searchAppDialog.Q0, 1, false);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<c9.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20725w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20726x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20727y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20725w = componentCallbacks;
            this.f20726x = aVar;
            this.f20727y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [c9.a, java.lang.Object] */
        @Override // io.a
        public final c9.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20725w;
            return gq.a.a(componentCallbacks).c(f0.b(c9.a.class), this.f20726x, this.f20727y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<hf.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20728w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20729x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20730y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20728w = componentCallbacks;
            this.f20729x = aVar;
            this.f20730y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d, java.lang.Object] */
        @Override // io.a
        public final hf.d invoke() {
            ComponentCallbacks componentCallbacks = this.f20728w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d.class), this.f20729x, this.f20730y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20731w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f20731w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20731w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20732w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f20732w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20732w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20733w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20734x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20735y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20736z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20733w = aVar;
            this.f20734x = aVar2;
            this.f20735y = aVar3;
            this.f20736z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20733w;
            vq.a aVar2 = this.f20734x;
            io.a aVar3 = this.f20735y;
            xq.a aVar4 = this.f20736z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20737w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f20737w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20737w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public SearchAppDialog() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R0 = wn.g.b(iVar, new f(this, null, null));
        h hVar = new h(this);
        xq.a a10 = gq.a.a(this);
        i iVar2 = new i(hVar);
        this.S0 = androidx.fragment.app.e0.a(this, f0.b(e0.class), new k(iVar2), new j(hVar, null, null, a10));
        this.T0 = wn.g.b(iVar, new g(this, null, null));
    }

    public static final void S3(SearchAppDialog searchAppDialog, View view) {
        p.h(searchAppDialog, "this$0");
        searchAppDialog.m3();
    }

    public static final boolean T3(SearchAppDialog searchAppDialog, TextView textView, int i10, KeyEvent keyEvent) {
        p.h(searchAppDialog, "this$0");
        if (i10 == 3) {
            String obj = searchAppDialog.O3().G.getText().toString();
            RecyclerView.h adapter = searchAppDialog.O3().B.getAdapter();
            n nVar = adapter instanceof n ? (n) adapter : null;
            if (nVar != null) {
                nVar.d(null);
            }
            searchAppDialog.P0 = 0;
            searchAppDialog.Y3(obj, 1, false);
            searchAppDialog.Q0 = obj;
            of.j jVar = of.j.f45405a;
            Dialog p32 = searchAppDialog.p3();
            jVar.c(p32 != null ? p32.getContext() : null, searchAppDialog.O3().G);
        }
        return true;
    }

    public static final void U3(SearchAppDialog searchAppDialog, View view) {
        p.h(searchAppDialog, "this$0");
        searchAppDialog.I0().g1("SearchLiveWithApp", k3.b.a(wn.q.a("bundleKey", "")));
        searchAppDialog.m3();
    }

    public static final void V3(SearchAppDialog searchAppDialog, List list) {
        p.h(searchAppDialog, "this$0");
        searchAppDialog.P0 = list.size();
        RecyclerView.h adapter = searchAppDialog.O3().B.getAdapter();
        n nVar = adapter instanceof n ? (n) adapter : null;
        if (nVar != null) {
            nVar.d(list);
        }
    }

    public static final void W3(SearchAppDialog searchAppDialog, ha.a aVar) {
        p.h(searchAppDialog, "this$0");
        if (aVar instanceof a.d) {
            searchAppDialog.O3().J.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            searchAppDialog.O3().J.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.e) {
            searchAppDialog.O3().J.b(new StatusView.b.d(searchAppDialog.U0(h1.text_no_broadcast), 0.0f, 2, null));
        } else if ((aVar instanceof a.C0439a) && searchAppDialog.P0 == 0) {
            StatusView statusView = searchAppDialog.O3().J;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = searchAppDialog.U0(h1.f49918a);
                p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new e()));
        }
    }

    public static final boolean X3(Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        p.h(dialog, "$this_apply");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            dialog.dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final hf.d N3() {
        return (hf.d) this.T0.getValue();
    }

    public final t8.k O3() {
        return (t8.k) this.O0.b(this, V0[0]);
    }

    public final c9.a P3() {
        return (c9.a) this.R0.getValue();
    }

    public final e0 Q3() {
        return (e0) this.S0.getValue();
    }

    public final void R3() {
        this.P0 = 0;
        N3().a(Referer.Search.RECOMMEND_APPS);
        P3().e("", false);
    }

    public final void Y3(String str, int i10, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            RecyclerView.h adapter = O3().B.getAdapter();
            n nVar = adapter instanceof n ? (n) adapter : null;
            if (nVar != null) {
                nVar.d(null);
            }
        }
        if (i10 == 0) {
            return;
        }
        P3().d(Referer.Search.LIVE, str, i10 > 1 ? Integer.valueOf(i10) : null, z10, false);
    }

    public final void Z3(t8.k kVar) {
        this.O0.a(this, V0[0], kVar);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(true);
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), f1.dialog_fragment_search_app, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        Z3((t8.k) e10);
        O3().F.setOnClickListener(new View.OnClickListener() { // from class: c9.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchAppDialog.S3(SearchAppDialog.this, view);
            }
        });
        O3().G.setText(this.Q0);
        O3().G.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c9.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean T3;
                T3 = SearchAppDialog.T3(SearchAppDialog.this, textView, i10, keyEvent);
                return T3;
            }
        });
        Bundle n02 = n0();
        String string = n02 != null ? n02.getString("appId") : null;
        O3().E.setVisibility(string == null || string.length() == 0 ? 8 : 0);
        O3().E.setOnClickListener(new View.OnClickListener() { // from class: c9.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchAppDialog.U3(SearchAppDialog.this, view);
            }
        });
        RecyclerView recyclerView = O3().B;
        final Context context = O3().u().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.dena.mirrativ.catalog.search.SearchAppDialog$onCreateDialog$4
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                return true;
            }
        });
        O3().B.setOutlineProvider(new b());
        O3().B.setClipToOutline(true);
        RecyclerView recyclerView2 = O3().B;
        n nVar = new n(true, string);
        nVar.i(new c());
        recyclerView2.setAdapter(nVar);
        O3().B.k(new d());
        R3();
        Q3().i().i(this, new androidx.lifecycle.f0() { // from class: c9.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SearchAppDialog.V3(SearchAppDialog.this, (List) obj);
            }
        });
        Q3().o().i(this, new androidx.lifecycle.f0() { // from class: c9.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SearchAppDialog.W3(SearchAppDialog.this, (ha.a) obj);
            }
        });
        final Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(O3().u());
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: c9.c
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean X3;
                X3 = SearchAppDialog.X3(dialog, dialogInterface, i10, keyEvent);
                return X3;
            }
        });
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
