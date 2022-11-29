package ld;

import ae.o5;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import kq.a;
import ud.m1;

/* loaded from: classes2.dex */
public final class r extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public static final /* synthetic */ qo.h<Object>[] T0 = {jo.f0.d(new jo.s(r.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogHandoverCodeBinding;", 0))};
    public static final a S0 = new a(null);
    public static final int U0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r a() {
            return new r();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<m1> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f40074w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final m1 invoke() {
            return (m1) new t0.d().a(m1.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<String, wn.v> {
        public c() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            r.this.J3().n(str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40076w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40077x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40076w = componentCallbacks;
            this.f40077x = aVar;
            this.f40078y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld.t] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f40076w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(t.class), this.f40077x, this.f40078y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40079w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40080x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40081y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40079w = componentCallbacks;
            this.f40080x = aVar;
            this.f40081y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f40079w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f40080x, this.f40081y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40082w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40082w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f40082w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40083w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f40083w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40083w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40084w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40085x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40086y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f40087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40084w = aVar;
            this.f40085x = aVar2;
            this.f40086y = aVar3;
            this.f40087z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40084w;
            vq.a aVar2 = this.f40085x;
            io.a aVar3 = this.f40086y;
            xq.a aVar4 = this.f40087z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(i1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40088w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f40088w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f40088w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public r() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        f fVar = new f(this);
        xq.a a10 = gq.a.a(this);
        g gVar = new g(fVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(i1.class), new i(gVar), new h(fVar, null, null, a10));
        this.Q0 = wn.g.b(iVar, new e(this, null, null));
        this.R0 = wn.g.a(b.f40074w);
    }

    public static final void M3(r rVar, String str) {
        jo.p.h(rVar, "this$0");
        if (str == null) {
            return;
        }
        androidx.lifecycle.e0<Boolean> f10 = rVar.H3().f();
        boolean z10 = true;
        if (!(str.length() > 0) || str.length() != 4) {
            z10 = false;
        }
        f10.p(Boolean.valueOf(z10));
    }

    public static final void N3(r rVar, wn.v vVar) {
        jo.p.h(rVar, "this$0");
        if (vVar == null) {
            return;
        }
        String f10 = rVar.K3().s().f();
        if (f10 != null) {
            ld.b.O0.a(f10).z3(rVar.O2(), "HandoverCodeCompleteDialog");
        }
        rVar.m3();
    }

    public static final void Q3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        rVar.m3();
    }

    public static final void R3(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        String f10 = rVar.K3().s().f();
        if (f10 != null) {
            rVar.J3().p(f10);
        }
    }

    public final o5 G3() {
        return (o5) this.N0.b(this, T0[0]);
    }

    public final m1 H3() {
        return (m1) this.R0.getValue();
    }

    public final MRLogger I3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final t J3() {
        return (t) this.O0.getValue();
    }

    public final i1 K3() {
        return (i1) this.P0.getValue();
    }

    public final void L3() {
        K3().s().i(this, new androidx.lifecycle.f0() { // from class: ld.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r.M3(r.this, (String) obj);
            }
        });
        K3().w().i(this, new androidx.lifecycle.f0() { // from class: ld.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r.N3(r.this, (wn.v) obj);
            }
        });
    }

    public final void O3(o5 o5Var) {
        this.N0.a(this, T0[0], o5Var);
    }

    public final void P3() {
        G3().B.setOnClickListener(new View.OnClickListener() { // from class: ld.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.Q3(r.this, view);
            }
        });
        G3().E.setOnClickListener(new View.OnClickListener() { // from class: ld.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.R3(r.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        G3().F.m();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.J, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        O3((o5) e10);
        G3().M(this);
        G3().T(H3());
        G3().F.setListener(new c());
        P3();
        L3();
        MRLogger I3 = I3();
        MRLog.Companion companion = MRLog.Companion;
        I3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_DATA_INHERIT_TAP).build());
        Dialog dialog = new Dialog(N2(), nc.j.f41904g);
        dialog.setContentView(G3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nc.b.B);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(5);
        }
        return dialog;
    }
}
