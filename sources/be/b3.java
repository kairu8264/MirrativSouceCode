package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.viewpager.widget.ViewPager;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.Serializable;
import kq.a;

/* loaded from: classes2.dex */
public final class b3 extends com.google.android.material.bottomsheet.b implements uo.q0 {
    public final /* synthetic */ uo.q0 O0 = uo.r0.b();
    public final wn.f P0 = wn.g.a(new k());
    public final wn.f Q0 = wn.g.a(new c());
    public final wn.f R0 = wn.g.a(new b());
    public final wn.f S0;
    public final wn.f T0;
    public nf.h0 U0;
    public d3 V0;
    public final AutoClearedValue W0;
    public static final /* synthetic */ qo.h<Object>[] Y0 = {jo.f0.d(new jo.s(b3.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/BottomSheetDialogFragmentLiveGiftRankingBinding;", 0))};
    public static final a X0 = new a(null);
    public static final int Z0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: be.b3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0122a {
            Hidden,
            GroupShotButton,
            DressUpButton
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b3 a(String str, String str2, EnumC0122a enumC0122a) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "liveId");
            jo.p.h(enumC0122a, "fabState");
            b3 b3Var = new b3();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_ID", str2);
            bundle.putSerializable("EXTRA_KEY_FAB_STATE", enumC0122a);
            b3Var.V2(bundle);
            return b3Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<a.EnumC0122a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final a.EnumC0122a invoke() {
            Serializable serializable = b3.this.M2().getSerializable("EXTRA_KEY_FAB_STATE");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.dialog.LiveGiftRankingBottomSheetDialogFragment.Companion.FabState");
            return (a.EnumC0122a) serializable;
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
            String string = b3.this.M2().getString("EXTRA_KEY_LIVE_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17674w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f17674w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17674w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17674w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17675w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f17675w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17675w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17676w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17677x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17678y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17679z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17676w = aVar;
            this.f17677x = aVar2;
            this.f17678y = aVar3;
            this.f17679z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17676w;
            vq.a aVar2 = this.f17677x;
            io.a aVar3 = this.f17678y;
            xq.a aVar4 = this.f17679z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17680w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f17680w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17680w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends androidx.fragment.app.u {
        public h(FragmentManager fragmentManager) {
            super(fragmentManager, 1);
        }

        @Override // j5.a
        public int c() {
            return 4;
        }

        @Override // androidx.fragment.app.u
        public Fragment q(int i10) {
            if (b3.this.U3(i10) == jf.x.CHEER) {
                return gf.n0.G0.a(b3.this.V3(), b3.this.T3(), null);
            }
            return gf.p0.F0.a(b3.this.V3(), b3.this.T3(), b3.this.U3(i10));
        }

        @Override // j5.a
        /* renamed from: t */
        public String e(int i10) {
            String U0;
            if (i10 == 0) {
                U0 = b3.this.U0(nd.f1.text_gift_ranking_now);
            } else if (i10 == 1) {
                U0 = b3.this.U0(nd.f1.text_gift_ranking_today);
            } else if (i10 == 2) {
                U0 = b3.this.U0(nd.f1.text_gift_ranking_this_month);
            } else if (i10 == 3) {
                U0 = b3.this.U0(nd.f1.f41981o2);
            } else {
                throw new IllegalArgumentException("存在しないpositionです");
            }
            jo.p.g(U0, "when (position) {\n      …ositionです\")\n            }");
            return U0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends ViewPager.n {
        public i() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            dq.c.c().l(new c3(b3.this.U3(i10)));
            if (i10 != 0 || !b3.this.S3().g() || b3.this.R3() != a.EnumC0122a.GroupShotButton) {
                if (i10 != 0 || b3.this.R3() != a.EnumC0122a.DressUpButton) {
                    b3.this.Q3().D.l();
                    return;
                }
                FloatingActionButton floatingActionButton = b3.this.Q3().D;
                floatingActionButton.setImageResource(nd.y0.ic_dress_up_with_text);
                floatingActionButton.t();
                return;
            }
            FloatingActionButton floatingActionButton2 = b3.this.Q3().D;
            floatingActionButton2.setImageResource(nd.y0.ic_live_gift_ranking_fab_group_shot_settings);
            floatingActionButton2.t();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17684a;

            static {
                int[] iArr = new int[a.EnumC0122a.values().length];
                iArr[a.EnumC0122a.DressUpButton.ordinal()] = 1;
                iArr[a.EnumC0122a.GroupShotButton.ordinal()] = 2;
                iArr[a.EnumC0122a.Hidden.ordinal()] = 3;
                f17684a = iArr;
            }
        }

        public j() {
            super(1);
        }

        public final void a(View view) {
            d3 d3Var;
            jo.p.h(view, "it");
            int i10 = a.f17684a[b3.this.R3().ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && (d3Var = b3.this.V0) != null) {
                    d3Var.C();
                    return;
                }
                return;
            }
            d3 d3Var2 = b3.this.V0;
            if (d3Var2 != null) {
                d3Var2.q1();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
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
            String string = b3.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17686w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17687x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17688y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17686w = componentCallbacks;
            this.f17687x = aVar;
            this.f17688y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f17686w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f17687x, this.f17688y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17689w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17690x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17691y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17689w = componentCallbacks;
            this.f17690x = aVar;
            this.f17691y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f17689w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f17690x, this.f17691y);
        }
    }

    public b3() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new l(this, null, null));
        this.T0 = wn.g.b(iVar, new m(this, null, null));
        this.W0 = nd.a.a(this);
    }

    public static final void X3(b3 b3Var, View view) {
        jo.p.h(b3Var, "this$0");
        b3Var.W3().c1(true);
        b3Var.Q3().G.setVisibility(8);
        b3Var.Q3().F.setVisibility(8);
        b3Var.Q3().E.setVisibility(8);
    }

    public static final void Y3(b3 b3Var, Integer num) {
        jo.p.h(b3Var, "this$0");
        if (b3Var.R3() != a.EnumC0122a.GroupShotButton) {
            return;
        }
        FloatingActionButton floatingActionButton = b3Var.Q3().D;
        jo.p.g(num, "it");
        floatingActionButton.setEnabled(num.intValue() > 0);
    }

    public static final void Z3(b3 b3Var, DialogInterface dialogInterface) {
        jo.p.h(b3Var, "this$0");
        b3Var.c4();
    }

    public static final void a4(b3 b3Var, View view) {
        jo.p.h(b3Var, "this$0");
        b3Var.m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        d dVar = new d(this);
        xq.a a10 = gq.a.a(this);
        e eVar = new e(dVar);
        this.U0 = (nf.h0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.h0.class), new g(eVar), new f(dVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, nd.b1.bottom_sheet_dialog_fragment_live_gift_ranking, viewGroup, false);
        jo.p.g(e10, "inflate(\n            inf…          false\n        )");
        b4((ae.i0) e10);
        Q3().I.setText(U0(jo.p.c(V3(), Referer.BROADCAST_AVATAR) ? nd.f1.text_viewers_gift_ranking_receive_title : nd.f1.text_viewers_gift_ranking_give_title));
        Q3().J.setAdapter(new h(p0()));
        Q3().J.c(new i());
        Q3().H.setupWithViewPager(Q3().J);
        a.EnumC0122a R3 = R3();
        a.EnumC0122a enumC0122a = a.EnumC0122a.GroupShotButton;
        boolean z10 = R3 == enumC0122a && !W3().B0() && S3().g();
        Q3().G.setVisibility(z10 ? 0 : 8);
        Q3().F.setVisibility(z10 ? 0 : 8);
        Q3().E.setVisibility(z10 ? 0 : 8);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: be.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b3.X3(b3.this, view);
            }
        };
        Q3().F.setOnClickListener(onClickListener);
        Q3().E.setOnClickListener(onClickListener);
        if (S3().g() && R3() == enumC0122a) {
            FloatingActionButton floatingActionButton = Q3().D;
            floatingActionButton.setImageResource(nd.y0.ic_live_gift_ranking_fab_group_shot_settings);
            floatingActionButton.t();
        } else if (R3() == a.EnumC0122a.DressUpButton) {
            FloatingActionButton floatingActionButton2 = Q3().D;
            floatingActionButton2.setImageResource(nd.y0.ic_dress_up_with_text);
            floatingActionButton2.t();
        } else {
            Q3().D.l();
        }
        FloatingActionButton floatingActionButton3 = Q3().D;
        jo.p.g(floatingActionButton3, "binding.groupShotFloatingActionButton");
        yd.g1.a(floatingActionButton3, new j());
        nf.h0 h0Var = this.U0;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        h0Var.A().i(this, new androidx.lifecycle.f0() { // from class: be.a3
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                b3.Y3(b3.this, (Integer) obj);
            }
        });
        Dialog p32 = p3();
        if (p32 != null) {
            p32.setOnShowListener(new DialogInterface.OnShowListener() { // from class: be.x2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    b3.Z3(b3.this, dialogInterface);
                }
            });
        }
        Q3().B.setOnClickListener(new View.OnClickListener() { // from class: be.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b3.a4(b3.this, view);
            }
        });
        View u10 = Q3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.V0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final ae.i0 Q3() {
        return (ae.i0) this.W0.b(this, Y0[0]);
    }

    public final a.EnumC0122a R3() {
        return (a.EnumC0122a) this.R0.getValue();
    }

    public final nf.k S3() {
        return (nf.k) this.T0.getValue();
    }

    public final String T3() {
        return (String) this.Q0.getValue();
    }

    public final jf.x U3(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return jf.x.CHEER;
                    }
                    throw new IllegalArgumentException("存在しないpositionです");
                }
                return jf.x.MONTHLY;
            }
            return jf.x.DAILY;
        }
        return jf.x.LIVE;
    }

    public final String V3() {
        return (String) this.P0.getValue();
    }

    public final kf.v W3() {
        return (kf.v) this.S0.getValue();
    }

    public final void b4(ae.i0 i0Var) {
        this.W0.a(this, Y0[0], i0Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(nd.z0.f42369y3)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    public final void c4() {
        int b10 = O0().getDisplayMetrics().heightPixels - de.e.b(this, 64);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(Q3().C);
        cVar.l(Q3().J.getId(), b10 - de.e.b(this, 112));
        cVar.c(Q3().C);
        Dialog p32 = p3();
        jo.p.f(p32, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) p32).findViewById(nd.z0.f42369y3);
        if (findViewById != null) {
            BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
            jo.p.g(c02, "from(bottomSheet)");
            c02.z0(3);
            c02.v0(b10);
            findViewById.setBackgroundColor(c3.a.d(N2(), 17170445));
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        c4();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.V0 = context instanceof d3 ? (d3) context : null;
    }
}
