package kc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import jo.f0;
import kq.a;

/* loaded from: classes2.dex */
public final class g extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final kc.a O0 = new kc.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    public final wn.f P0;
    public final wn.f Q0;
    public static final /* synthetic */ qo.h<Object>[] S0 = {f0.d(new jo.s(g.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogCollabSettingBinding;", 0))};
    public static final a R0 = new a(null);
    public static final int T0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a() {
            return new g();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f38564w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38565x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f38564w = componentCallbacks;
            this.f38565x = aVar;
            this.f38566y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f38564w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.w.class), this.f38565x, this.f38566y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f38567w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f38567w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f38567w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38568w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f38568w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f38568w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38569w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38570x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38571y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f38572z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f38569w = aVar;
            this.f38570x = aVar2;
            this.f38571y = aVar3;
            this.f38572z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f38569w;
            vq.a aVar2 = this.f38570x;
            io.a aVar3 = this.f38571y;
            xq.a aVar4 = this.f38572z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(jc.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38573w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f38573w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f38573w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public g() {
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        d dVar = new d(cVar);
        this.P0 = e0.a(this, f0.b(jc.f.class), new f(dVar), new e(cVar, null, null, a10));
        this.Q0 = wn.g.b(wn.i.SYNCHRONIZED, new b(this, null, null));
    }

    public static final void L3(g gVar, View view) {
        jo.p.h(gVar, "this$0");
        gVar.O0.r(1);
        gVar.H3().r(1);
    }

    public static final void M3(g gVar, View view) {
        jo.p.h(gVar, "this$0");
        gVar.O0.r(2);
        gVar.H3().r(2);
    }

    public static final void N3(g gVar, View view) {
        jo.p.h(gVar, "this$0");
        gVar.O0.r(3);
        gVar.H3().r(3);
    }

    public static final void O3(g gVar, CompoundButton compoundButton, boolean z10) {
        jo.p.h(gVar, "this$0");
        gVar.O0.b().m(Boolean.valueOf(z10));
        gVar.H3().q(z10);
    }

    public static final void P3(g gVar, View view) {
        jo.p.h(gVar, "this$0");
        gVar.m3();
    }

    public final ac.q G3() {
        return (ac.q) this.N0.b(this, S0[0]);
    }

    public final jc.f H3() {
        return (jc.f) this.P0.getValue();
    }

    public final nf.w I3() {
        return (nf.w) this.Q0.getValue();
    }

    public final void J3(ac.q qVar) {
        this.N0.a(this, S0[0], qVar);
    }

    public final void K3() {
        G3().G.setOnClickListener(new View.OnClickListener() { // from class: kc.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.L3(g.this, view);
            }
        });
        G3().M.setOnClickListener(new View.OnClickListener() { // from class: kc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.M3(g.this, view);
            }
        });
        G3().J.setOnClickListener(new View.OnClickListener() { // from class: kc.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.N3(g.this, view);
            }
        });
        G3().C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kc.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                g.O3(g.this, compoundButton, z10);
            }
        });
        G3().B.setOnClickListener(new View.OnClickListener() { // from class: kc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.P3(g.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.dialog_collab_setting, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        J3((ac.q) e10);
        G3().M(this);
        G3().T(this.O0);
        kc.a aVar = this.O0;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        aVar.a(N2, I3().f(), I3().b());
        K3();
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(G3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
