package be;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.response.App;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import kq.a;

/* loaded from: classes2.dex */
public final class i extends com.google.android.material.bottomsheet.b {
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f P0;
    public static final /* synthetic */ qo.h<Object>[] R0 = {jo.f0.d(new jo.s(i.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/BottomSheetDialogFragmentAppUserDetailBinding;", 0))};
    public static final a Q0 = new a(null);
    public static final int S0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(App.AppParams appParams) {
            jo.p.h(appParams, "app");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_APP", appParams);
            iVar.V2(bundle);
            return iVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17910w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f17910w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17910w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17910w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17911w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f17911w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17911w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17912w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17913x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17914y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17915z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17912w = aVar;
            this.f17913x = aVar2;
            this.f17914y = aVar3;
            this.f17915z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17912w;
            vq.a aVar2 = this.f17913x;
            io.a aVar3 = this.f17914y;
            xq.a aVar4 = this.f17915z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.i.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17916w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f17916w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17916w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public i() {
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.i.class), new e(cVar), new d(bVar, null, null, a10));
    }

    public static final void N3(App.AppParams appParams, i iVar, View view) {
        jo.p.h(appParams, "$app");
        jo.p.h(iVar, "this$0");
        dq.c.c().l(new ce.b(appParams.getAppId()));
        iVar.m3();
    }

    public static final void O3(App.AppParams appParams, i iVar, View view) {
        jo.p.h(appParams, "$app");
        jo.p.h(iVar, "this$0");
        dq.c.c().l(new ce.a(appParams.getAppId()));
        iVar.m3();
    }

    public static final void P3(App.AppParams appParams, i iVar, View view) {
        jo.p.h(appParams, "$app");
        jo.p.h(iVar, "this$0");
        dq.c.c().l(new ce.c(appParams.getAppId(), jf.a.GAME_ID, iVar.L3().G.isChecked()));
    }

    public static final void Q3(App.AppParams appParams, i iVar, View view) {
        jo.p.h(appParams, "$app");
        jo.p.h(iVar, "this$0");
        dq.c.c().l(new ce.c(appParams.getAppId(), jf.a.URL, iVar.L3().I.isChecked()));
    }

    public static final void R3(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        iVar.m3();
    }

    public final ud.i K3() {
        return (ud.i) this.P0.getValue();
    }

    public final ae.e0 L3() {
        return (ae.e0) this.O0.b(this, R0[0]);
    }

    public final void M3(ae.e0 e0Var) {
        this.O0.a(this, R0[0], e0Var);
    }

    public final void S3() {
        Window window;
        FrameLayout frameLayout;
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(nd.z0.f42369y3)) == null) {
            return;
        }
        frameLayout.setBackgroundResource(17170445);
        if (O0().getConfiguration().orientation == 2) {
            BottomSheetBehavior.c0(frameLayout).v0(O0().getDisplayMetrics().heightPixels);
            frameLayout.getParent().getParent().requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        S3();
    }

    @Override // e.g, androidx.fragment.app.e
    public void y3(Dialog dialog, int i10) {
        jo.p.h(dialog, "dialog");
        ae.e0 T = ae.e0.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        M3(T);
        L3().M(this);
        L3().V(K3());
        Serializable serializable = M2().getSerializable("EXTRA_APP");
        jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.App.AppParams");
        final App.AppParams appParams = (App.AppParams) serializable;
        L3().E.setOnClickListener(new View.OnClickListener() { // from class: be.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.N3(App.AppParams.this, this, view);
            }
        });
        L3().D.setOnClickListener(new View.OnClickListener() { // from class: be.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.O3(App.AppParams.this, this, view);
            }
        });
        L3().G.setOnClickListener(new View.OnClickListener() { // from class: be.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.P3(App.AppParams.this, this, view);
            }
        });
        L3().I.setOnClickListener(new View.OnClickListener() { // from class: be.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.Q3(App.AppParams.this, this, view);
            }
        });
        L3().B.setOnClickListener(new View.OnClickListener() { // from class: be.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.R3(i.this, view);
            }
        });
        dialog.setContentView(L3().u());
        S3();
    }
}
