package md;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupMenu;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.y;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.MutualFollowee;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.unity.UnityReceiverKt;
import ie.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import nd.i1;
import pc.g1;
import ud.y4;

/* loaded from: classes2.dex */
public final class c1 extends androidx.fragment.app.e implements f.b {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final d1 X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final wn.f f40869a1;

    /* renamed from: c1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f40867c1 = {jo.f0.d(new jo.s(c1.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/DialogUserProfileBinding;", 0))};

    /* renamed from: b1  reason: collision with root package name */
    public static final a f40866b1 = new a(null);

    /* renamed from: d1  reason: collision with root package name */
    public static final int f40868d1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c1 a(String str, String str2, boolean z10, boolean z11) {
            jo.p.h(str, "userId");
            jo.p.h(str2, "referer");
            c1 c1Var = new c1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str2);
            bundle.putString("EXTRA_USER_ID", str);
            bundle.putBoolean("EXTRA_KICKABLE", z10);
            bundle.putBoolean("EXTRA_IS_SHOW_PROFILE_ENABLED", z11);
            c1Var.V2(bundle);
            return c1Var;
        }

        public final c1 b(String str, String str2, boolean z10, boolean z11, String str3) {
            jo.p.h(str, "userId");
            jo.p.h(str2, "referer");
            jo.p.h(str3, "streamerId");
            c1 c1Var = new c1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str2);
            bundle.putString("EXTRA_STREAMER_ID", str3);
            bundle.putString("EXTRA_USER_ID", str);
            bundle.putBoolean("EXTRA_KICKABLE", z10);
            bundle.putBoolean("EXTRA_IS_SHOW_PROFILE_ENABLED", z11);
            c1Var.V2(bundle);
            return c1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(c1.this.M2().getBoolean("EXTRA_IS_SHOW_PROFILE_ENABLED"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {
        public c() {
            super(0);
        }

        public final void a() {
            MRLogger c42 = c1.this.c4();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHEER_FUNCTION_LP_IMP);
            builder.setTargetId(MRLog.TARGET_ID_IMP);
            builder.setPageId("view_profile");
            c42.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = c1.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.u {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            List<App.AppParams> f10;
            String f11;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (f10 = c1.this.j4().i().f()) == null || (f11 = c1.this.j4().s().f()) == null || jo.p.c(c1.this.j4().E().f(), Boolean.TRUE)) {
                return;
            }
            if ((f11.length() == 0) || f10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            c1.this.i4().u(f11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            Boolean f10 = c1.this.j4().D().f();
            if (f10 == null) {
                return;
            }
            if (f10.booleanValue()) {
                c1.this.i4().B();
            } else {
                c1.this.i4().r();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40875w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40876x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40875w = componentCallbacks;
            this.f40876x = aVar;
            this.f40877y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f40875w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f40876x, this.f40877y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40878w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40879x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40880y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40878w = componentCallbacks;
            this.f40879x = aVar;
            this.f40880y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f40878w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f40879x, this.f40880y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40881w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40882x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40883y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40881w = componentCallbacks;
            this.f40882x = aVar;
            this.f40883y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f40881w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f40882x, this.f40883y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40884w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40885x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40886y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40884w = componentCallbacks;
            this.f40885x = aVar;
            this.f40886y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f40884w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f40885x, this.f40886y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40887w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40888x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40887w = componentCallbacks;
            this.f40888x = aVar;
            this.f40889y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f40887w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f40888x, this.f40889y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40890w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40891x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40890w = componentCallbacks;
            this.f40891x = aVar;
            this.f40892y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f40890w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f40891x, this.f40892y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40893w = componentCallbacks;
            this.f40894x = aVar;
            this.f40895y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f40893w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f40894x, this.f40895y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40896w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f40896w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f40896w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40897w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f40897w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40897w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40898w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40899x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40900y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f40901z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40898w = aVar;
            this.f40899x = aVar2;
            this.f40900y = aVar3;
            this.f40901z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40898w;
            vq.a aVar2 = this.f40899x;
            io.a aVar3 = this.f40900y;
            xq.a aVar4 = this.f40901z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.t0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40902w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar) {
            super(0);
            this.f40902w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f40902w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40903w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Fragment fragment) {
            super(0);
            this.f40903w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f40903w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40904w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar) {
            super(0);
            this.f40904w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40904w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40905w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40906x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40907y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f40908z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40905w = aVar;
            this.f40906x = aVar2;
            this.f40907y = aVar3;
            this.f40908z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40905w;
            vq.a aVar2 = this.f40906x;
            io.a aVar3 = this.f40907y;
            xq.a aVar4 = this.f40908z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.o0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40909w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar) {
            super(0);
            this.f40909w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f40909w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<String> {
        public v() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = c1.this.M2().getString("EXTRA_USER_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<uq.a> {
        public w() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(c1.this.g4(), Referer.PROFILE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<uq.a> {
        public x() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(c1.this.g4());
        }
    }

    public c1() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new g(this, null, null));
        this.P0 = wn.g.a(new v());
        this.Q0 = wn.g.a(new d());
        this.R0 = wn.g.a(new b());
        this.S0 = wn.g.b(iVar, new h(this, null, null));
        w wVar = new w();
        n nVar = new n(this);
        xq.a a10 = gq.a.a(this);
        o oVar = new o(nVar);
        this.T0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.t0.class), new q(oVar), new p(nVar, null, wVar, a10));
        x xVar = new x();
        r rVar = new r(this);
        xq.a a11 = gq.a.a(this);
        s sVar = new s(rVar);
        this.U0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.o0.class), new u(sVar), new t(rVar, null, xVar, a11));
        this.V0 = wn.g.b(iVar, new i(this, null, null));
        this.W0 = wn.g.b(iVar, new j(this, null, null));
        this.X0 = new d1();
        this.Y0 = wn.g.b(iVar, new k(this, null, null));
        this.Z0 = wn.g.b(iVar, new l(this, null, null));
        this.f40869a1 = wn.g.b(iVar, new m(this, null, null));
    }

    public static final void D4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        if (!jo.p.c(c1Var.Z3().I0().f(), Boolean.TRUE) && c1Var.m4()) {
            if (c1Var.l4()) {
                c1Var.L4();
            } else {
                c1Var.M4();
            }
        }
    }

    public static final void E4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        c1Var.Q4();
    }

    public static final void F4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        c1Var.m3();
    }

    public static final void G4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        c1Var.U4();
    }

    public static final void H4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        if (jo.p.c(c1Var.Z3().I0().f(), Boolean.TRUE) || !c1Var.m4() || jo.p.c(c1Var.e4(), Referer.PROFILE)) {
            return;
        }
        if (c1Var.l4()) {
            c1Var.T4();
        } else {
            c1Var.S4();
        }
    }

    public static final void I4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        if (!jo.p.c(c1Var.Z3().I0().f(), Boolean.TRUE) && c1Var.m4()) {
            if (c1Var.l4()) {
                c1Var.T4();
            } else {
                c1Var.S4();
            }
        }
    }

    public static final void J4(c1 c1Var, View view) {
        jo.p.h(c1Var, "this$0");
        if (!jo.p.c(c1Var.Z3().I0().f(), Boolean.TRUE) && c1Var.m4()) {
            if (c1Var.l4()) {
                c1Var.N4();
            } else {
                c1Var.O4();
            }
        }
    }

    public static final boolean R4(c1 c1Var, MenuItem menuItem) {
        jo.p.h(c1Var, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == nc.e.f41821d3) {
            c1Var.z4();
            return true;
        } else if (itemId == nc.e.f41819b3) {
            c1Var.K4();
            return true;
        } else if (itemId == nc.e.item_unblock) {
            c1Var.V4();
            return true;
        } else if (itemId == nc.e.item_kick) {
            c1Var.P4();
            return true;
        } else {
            return true;
        }
    }

    public static final void o4(c1 c1Var, String str) {
        jo.p.h(c1Var, "this$0");
        if (str == null) {
            return;
        }
        c1Var.X0.B().p(Boolean.valueOf(!jo.p.c(str, c1Var.g4())));
        c1Var.X0.D().p(Boolean.valueOf(!jo.p.c(str, c1Var.g4())));
    }

    public static final void p4(c1 c1Var, UserProfile userProfile) {
        String str;
        jo.p.h(c1Var, "this$0");
        if (userProfile == null) {
            return;
        }
        d1 d1Var = c1Var.X0;
        boolean c10 = jo.p.c(userProfile.getUserId(), c1Var.d4().Y0());
        if (userProfile.getBirthday().length() == 4) {
            int i10 = nc.i.P4;
            String substring = userProfile.getBirthday().substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = userProfile.getBirthday().substring(2);
            jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
            str = c1Var.V0(i10, substring, substring2);
        } else {
            str = "";
        }
        jo.p.g(str, "if (userProfile.birthday…                } else \"\"");
        d1Var.a(userProfile, c10, str);
        androidx.lifecycle.e0<List<String>> o10 = c1Var.X0.o();
        List<RibbonResponse> ribbons = userProfile.getRibbons();
        ArrayList arrayList = new ArrayList(xn.t.u(ribbons, 10));
        for (RibbonResponse ribbonResponse : ribbons) {
            arrayList.add(ribbonResponse.getImageUrl());
        }
        o10.p(arrayList);
        if (userProfile.isBlocked()) {
            c1Var.X0.B().p(Boolean.FALSE);
        }
        MutualFolloweeView mutualFolloweeView = c1Var.Y3().Q;
        MutualFollowee mutualFollowees = userProfile.getMutualFollowees();
        if (mutualFollowees == null) {
            mutualFollowees = new MutualFollowee(xn.s.k(), "");
        }
        mutualFolloweeView.b(mutualFollowees);
    }

    public static final void q4(c1 c1Var, Integer num) {
        jo.p.h(c1Var, "this$0");
        c1Var.X0.i().p(num);
    }

    public static final void r4(c1 c1Var, Boolean bool) {
        jo.p.h(c1Var, "this$0");
        if (bool != null) {
            bool.booleanValue();
            c1Var.X0.v().p(bool);
        }
    }

    public static final void s4(c1 c1Var, List list) {
        jo.p.h(c1Var, "this$0");
        jo.p.g(list, "apps");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.AppParams appParams = (App.AppParams) it.next();
            arrayList.add(new ud.c(appParams.getAppId(), appParams.getIconUrl(), null, 4, null));
        }
        c1Var.X0.x().p(Boolean.valueOf(!arrayList.isEmpty()));
        c1Var.X0.b().p(arrayList);
    }

    public static final void t4(c1 c1Var, MRError mRError) {
        jo.p.h(c1Var, "this$0");
        if (mRError == null) {
            return;
        }
        c1Var.k4(mRError);
    }

    public static final void u4(c1 c1Var, Boolean bool) {
        jo.p.h(c1Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            pe.b.f47398a1.a(c1Var.e4(), false, true).z3(c1Var.p0(), "RegistrationDialog");
        }
    }

    public static final void v4(c1 c1Var, MRError mRError) {
        jo.p.h(c1Var, "this$0");
        if (mRError == null) {
            return;
        }
        c1Var.k4(mRError);
    }

    public static final void w4(c1 c1Var, y4 y4Var) {
        jo.p.h(c1Var, "this$0");
        UserProfileYellStatusConditionView userProfileYellStatusConditionView = c1Var.Y3().f46415d0;
        jo.p.g(y4Var, "it");
        userProfileYellStatusConditionView.a(y4Var, new c());
    }

    public static final void x4(c1 c1Var, List list) {
        jo.p.h(c1Var, "this$0");
        RecyclerView recyclerView = c1Var.Y3().W;
        jo.p.g(list, "it");
        recyclerView.setAdapter(new rd.w0(list));
    }

    public static final void y4(c1 c1Var, List list) {
        jo.p.h(c1Var, "this$0");
        RecyclerView.h adapter = c1Var.Y3().B.getAdapter();
        rd.c cVar = adapter instanceof rd.c ? (rd.c) adapter : null;
        if (cVar == null) {
            return;
        }
        jo.p.g(list, "it");
        cVar.h(list);
    }

    public final void A4(g1 g1Var) {
        this.N0.a(this, f40867c1[0], g1Var);
    }

    public final void B4() {
        Y3().W.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b10 = de.e.b(this, 4);
        int b11 = de.e.b(this, 16);
        Y3().W.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        Y3().B.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b12 = de.e.b(this, 8);
        int b13 = de.e.b(this, 16);
        Y3().B.g(new p001if.c(b12, b13, 0, b13, 0, 0));
    }

    public final void C4() {
        Y3().B.k(new e());
        FollowView followView = Y3().L;
        jo.p.g(followView, "binding.followView");
        yd.g1.a(followView, new f());
        Y3().R.setOnClickListener(new View.OnClickListener() { // from class: md.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.E4(c1.this, view);
            }
        });
        Y3().J.setOnClickListener(new View.OnClickListener() { // from class: md.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.F4(c1.this, view);
            }
        });
        Y3().X.setOnClickListener(new View.OnClickListener() { // from class: md.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.G4(c1.this, view);
            }
        });
        Y3().T.setOnClickListener(new View.OnClickListener() { // from class: md.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.H4(c1.this, view);
            }
        });
        Y3().f46412a0.setOnClickListener(new View.OnClickListener() { // from class: md.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.I4(c1.this, view);
            }
        });
        Y3().O.setOnClickListener(new View.OnClickListener() { // from class: md.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.J4(c1.this, view);
            }
        });
        Y3().N.setOnClickListener(new View.OnClickListener() { // from class: md.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c1.D4(c1.this, view);
            }
        });
    }

    public final void K4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41871a);
        jo.p.g(U0, "getString(R.string.block_confirmation_viewer)");
        f.a.b(aVar, U0, U0(nc.i.f41891u), null, null, false, 24, null).z3(p0(), "DIALOG_TAG_BLOCK_CONFIRM");
    }

    public final void L4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41893v3);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nc.i.f41874c6), U0(nc.i.f41888r4), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_FOLLOWER_CONFIRM");
    }

    public final void M4() {
        tb.c a42 = a4();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(a42.I(N2, g4(), 1));
    }

    public final void N4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41893v3);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nc.i.f41874c6), U0(nc.i.f41888r4), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_FOLLOWING_CONFIRM");
    }

    public final void O4() {
        tb.c a42 = a4();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(a42.I(N2, g4(), 0));
    }

    public final void P4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41872c1);
        String U02 = U0(nc.i.f41890t3);
        String U03 = U0(nc.i.f41887r3);
        String U04 = U0(nc.i.B);
        jo.p.g(U0, "getString(R.string.text_confirm_kick)");
        aVar.a(U0, U03, U04, U02, false).z3(p0(), "DIALOG_TAG_KICK_CONFIRM");
    }

    public final void Q4() {
        PopupMenu popupMenu = new PopupMenu(N2(), Y3().R);
        popupMenu.getMenuInflater().inflate(nc.g.popup_profile_menu, popupMenu.getMenu());
        boolean z10 = false;
        po.i t10 = po.n.t(0, popupMenu.getMenu().size());
        ArrayList arrayList = new ArrayList(xn.t.u(t10, 10));
        Iterator<Integer> it = t10.iterator();
        while (it.hasNext()) {
            arrayList.add(popupMenu.getMenu().getItem(((xn.i0) it).b()));
        }
        ArrayList<MenuItem> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            MenuItem menuItem = (MenuItem) next;
            if (!jo.p.c(menuItem.getTitle().toString(), U0(nc.i.text_kickout)) && !jo.p.c(menuItem.getTitle().toString(), U0(nc.i.f41891u))) {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(next);
            }
        }
        for (MenuItem menuItem2 : arrayList2) {
            String obj = menuItem2.getTitle().toString();
            SpannableString spannableString = new SpannableString(obj);
            spannableString.setSpan(new ForegroundColorSpan(c3.a.d(N2(), nc.b.D)), 0, obj.length(), 0);
            menuItem2.setTitle(spannableString);
        }
        UserProfile f10 = j4().B().f();
        if (f10 != null && f10.isBlocking()) {
            z10 = true;
        }
        if (z10) {
            popupMenu.getMenu().removeItem(nc.e.f41819b3);
        } else {
            popupMenu.getMenu().removeItem(nc.e.item_unblock);
        }
        if (!jo.p.c(d4().Y0(), h4().T4()) || !M2().getBoolean("EXTRA_KICKABLE")) {
            popupMenu.getMenu().removeItem(nc.e.item_kick);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: md.z0
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem3) {
                boolean R4;
                R4 = c1.R4(c1.this, menuItem3);
                return R4;
            }
        });
        popupMenu.show();
    }

    public final void S4() {
        if (jo.p.c(g4(), h4().T4())) {
            tb.c a42 = a4();
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            f3(a42.z0(N2));
            return;
        }
        tb.c a43 = a4();
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        f3(a43.s(N22, g4(), e4()));
    }

    public final void T4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41893v3);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nc.i.f41874c6), U0(nc.i.f41888r4), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_PROFILE_CONFIRM");
    }

    public final void U4() {
        String f10 = this.X0.p().f();
        if (f10 == null) {
            return;
        }
        if (f10.length() == 0) {
            return;
        }
        Context q02 = q0();
        of.n.r(q02, "https://twitter.com/" + f10);
    }

    public final void V4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nc.i.f41877f1);
        jo.p.g(U0, "getString(R.string.text_confirmation_unblock)");
        f.a.b(aVar, U0, U0(nc.i.U5), null, null, false, 24, null).z3(p0(), "DIALOG_TAG_UNBLOCK_CONFIRM");
    }

    public final g1 Y3() {
        return (g1) this.N0.b(this, f40867c1[0]);
    }

    public final nf.c Z3() {
        return (nf.c) this.Z0.getValue();
    }

    public final tb.c a4() {
        return (tb.c) this.O0.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        String f10;
        jo.p.h(str, "tag");
        switch (str.hashCode()) {
            case -192091037:
                if (str.equals("DIALOG_TAG_KICK_CONFIRM") && (f10 = d4().s0().f()) != null) {
                    i4().s(f10);
                    return;
                }
                return;
            case -124208750:
                if (str.equals("DIALOG_TAG_BLOCK_CONFIRM")) {
                    i4().n();
                    return;
                }
                return;
            case 919010764:
                if (str.equals("DIALOG_TAG_SHOW_FOLLOWING_CONFIRM")) {
                    O4();
                    return;
                }
                return;
            case 1006235492:
                if (str.equals("DIALOG_TAG_SHOW_PROFILE_CONFIRM")) {
                    S4();
                    n3();
                    return;
                }
                return;
            case 1207304517:
                if (str.equals("DIALOG_TAG_SHOW_FOLLOWER_CONFIRM")) {
                    M4();
                    return;
                }
                return;
            case 1382370969:
                if (str.equals("DIALOG_TAG_UNBLOCK_CONFIRM")) {
                    i4().A();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final hf.d0 b4() {
        return (hf.d0) this.W0.getValue();
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final MRLogger c4() {
        return (MRLogger) this.f40869a1.getValue();
    }

    public final nf.z d4() {
        return (nf.z) this.V0.getValue();
    }

    public final String e4() {
        return (String) this.Q0.getValue();
    }

    public final i1 f4() {
        return (i1) this.Y0.getValue();
    }

    public final String g4() {
        return (String) this.P0.getValue();
    }

    public final kf.x h4() {
        return (kf.x) this.S0.getValue();
    }

    public final od.t0 i4() {
        return (od.t0) this.T0.getValue();
    }

    public final nf.o0 j4() {
        return (nf.o0) this.U0.getValue();
    }

    public final void k4(MRError mRError) {
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(N2(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(N2(), mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(N2());
        }
    }

    public final boolean l4() {
        return (jo.p.c(f4().a().b(), UnityReceiverKt.EMOMO) || jo.p.c(f4().a().b(), "braodcasting") || d4().s0().f() == null) ? false : true;
    }

    public final boolean m4() {
        return ((Boolean) this.R0.getValue()).booleanValue();
    }

    public final void n4() {
        j4().v().i(this, new androidx.lifecycle.f0() { // from class: md.p0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.o4(c1.this, (String) obj);
            }
        });
        j4().B().i(this, new androidx.lifecycle.f0() { // from class: md.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.p4(c1.this, (UserProfile) obj);
            }
        });
        j4().n().i(this, new androidx.lifecycle.f0() { // from class: md.o0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.q4(c1.this, (Integer) obj);
            }
        });
        j4().D().i(this, new androidx.lifecycle.f0() { // from class: md.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.r4(c1.this, (Boolean) obj);
            }
        });
        j4().i().i(this, new androidx.lifecycle.f0() { // from class: md.s0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.s4(c1.this, (List) obj);
            }
        });
        j4().k().i(this, new androidx.lifecycle.f0() { // from class: md.a1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.t4(c1.this, (MRError) obj);
            }
        });
        j4().r().i(this, new androidx.lifecycle.f0() { // from class: md.n0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.u4(c1.this, (Boolean) obj);
            }
        });
        j4().m().i(this, new androidx.lifecycle.f0() { // from class: md.b1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.v4(c1.this, (MRError) obj);
            }
        });
        j4().A().i(this, new androidx.lifecycle.f0() { // from class: md.k0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.w4(c1.this, (y4) obj);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        String f10;
        te.c f11;
        String e10;
        ViewDataBinding e11 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.dialog_user_profile, null, false);
        jo.p.g(e11, "inflate(\n            Lay…          false\n        )");
        A4((g1) e11);
        Y3().M(this);
        Y3().T(this.X0);
        this.X0.o().i(this, new androidx.lifecycle.f0() { // from class: md.q0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.x4(c1.this, (List) obj);
            }
        });
        Y3().B.setAdapter(new rd.c());
        this.X0.b().i(this, new androidx.lifecycle.f0() { // from class: md.r0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c1.y4(c1.this, (List) obj);
            }
        });
        B4();
        C4();
        n4();
        i4().x();
        i4().w();
        od.t0 i42 = i4();
        String e42 = e4();
        String g42 = g4();
        if (jo.p.c(e4(), Referer.BROADCAST_AVATAR)) {
            f10 = b4().c();
        } else {
            f10 = d4().s0().f();
            if (f10 == null) {
                f10 = "";
            }
        }
        i42.p(e42, g42, f10, (jo.p.c(e4(), Referer.BROADCAST_AVATAR) || (f11 = d4().S0().f()) == null || (e10 = f11.e()) == null) ? "" : e10, jo.p.c(h4().T4(), g4()), M2().getString("EXTRA_STREAMER_ID"));
        MRLogger c42 = c4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_PROFILE);
        builder.setTargetId(g4());
        String f12 = d4().s0().f();
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f12 != null ? f12 : "")));
        c42.sendLog(builder.build());
        Dialog dialog = new Dialog(N2(), nc.j.f41904g);
        dialog.setContentView(Y3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nc.b.B);
        }
        return dialog;
    }

    public final void z4() {
        dq.c.c().l(new y.c(g4(), e4()));
    }
}
