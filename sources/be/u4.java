package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.MutualFolloweeView;
import com.dena.mirrorman.customview.RoundedButtonView;
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

/* loaded from: classes2.dex */
public final class u4 extends androidx.fragment.app.e implements f.b {
    public static final a Y0 = new a(null);
    public static final int Z0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public v4 P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final ud.q3 U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u4 a(String str, String str2) {
            jo.p.h(str, "userId");
            jo.p.h(str2, "referer");
            u4 u4Var = new u4();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str2);
            bundle.putString("EXTRA_USER_ID", str);
            u4Var.V2(bundle);
            return u4Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = u4.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.u {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            List<App.AppParams> f10;
            String f11;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (f10 = u4.this.a4().i().f()) == null || (f11 = u4.this.a4().s().f()) == null || jo.p.c(u4.this.a4().E().f(), Boolean.TRUE)) {
                return;
            }
            if ((f11.length() == 0) || f10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            u4.this.Z3().u(f11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            Boolean f10 = u4.this.a4().D().f();
            if (f10 == null) {
                return;
            }
            if (f10.booleanValue()) {
                u4.this.Z3().B();
            } else {
                u4.this.Z3().r();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            u4.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18218w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18219x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18218w = componentCallbacks;
            this.f18219x = aVar;
            this.f18220y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f18218w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f18219x, this.f18220y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18222x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18223y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18221w = componentCallbacks;
            this.f18222x = aVar;
            this.f18223y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f18221w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f18222x, this.f18223y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18224w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18225x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18226y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18224w = componentCallbacks;
            this.f18225x = aVar;
            this.f18226y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f18224w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f18225x, this.f18226y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18227w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18228x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18227w = componentCallbacks;
            this.f18228x = aVar;
            this.f18229y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f18227w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f18228x, this.f18229y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18230w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18231x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18230w = componentCallbacks;
            this.f18231x = aVar;
            this.f18232y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f18230w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f18231x, this.f18232y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18233w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f18233w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f18233w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18234w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f18234w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18234w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18235w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18236x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18237y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18238z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18235w = aVar;
            this.f18236x = aVar2;
            this.f18237y = aVar3;
            this.f18238z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18235w;
            vq.a aVar2 = this.f18236x;
            io.a aVar3 = this.f18237y;
            xq.a aVar4 = this.f18238z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.t0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18239w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f18239w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18239w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18240w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f18240w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f18240w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18241w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f18241w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18241w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18242w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18243x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18244y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18245z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18242w = aVar;
            this.f18243x = aVar2;
            this.f18244y = aVar3;
            this.f18245z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18242w;
            vq.a aVar2 = this.f18243x;
            io.a aVar3 = this.f18244y;
            xq.a aVar4 = this.f18245z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.o0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18246w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f18246w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18246w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<String> {
        public s() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = u4.this.M2().getString("EXTRA_USER_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<uq.a> {
        public t() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(u4.this.X3(), Referer.PROFILE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<uq.a> {
        public u() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(u4.this.X3());
        }
    }

    public u4() {
        super(nd.b1.dialog_fragment_shooter_matched_user_profile);
        this.N0 = wn.g.a(new b());
        this.O0 = wn.g.a(new s());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new f(this, null, null));
        t tVar = new t();
        k kVar = new k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(kVar);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.t0.class), new n(lVar), new m(kVar, null, tVar, a10));
        u uVar = new u();
        o oVar = new o(this);
        xq.a a11 = gq.a.a(this);
        p pVar = new p(oVar);
        this.S0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.o0.class), new r(pVar), new q(oVar, null, uVar, a11));
        this.T0 = wn.g.b(iVar, new g(this, null, null));
        this.U0 = new ud.q3();
        this.V0 = wn.g.b(iVar, new h(this, null, null));
        this.W0 = wn.g.b(iVar, new i(this, null, null));
        this.X0 = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void e4(u4 u4Var, Boolean bool) {
        jo.p.h(u4Var, "this$0");
        if (bool != null) {
            bool.booleanValue();
            u4Var.U0.u().p(bool);
        }
    }

    public static final void f4(u4 u4Var, ae.q4 q4Var, List list) {
        jo.p.h(u4Var, "this$0");
        jo.p.h(q4Var, "$binding");
        jo.p.g(list, "apps");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.AppParams appParams = (App.AppParams) it.next();
            arrayList.add(new ud.c(appParams.getAppId(), appParams.getIconUrl(), null, 4, null));
        }
        u4Var.U0.w().p(Boolean.valueOf(!arrayList.isEmpty()));
        RecyclerView.h adapter = q4Var.B.getAdapter();
        rd.c cVar = adapter instanceof rd.c ? (rd.c) adapter : null;
        if (cVar == null) {
            return;
        }
        cVar.h(arrayList);
    }

    public static final void g4(u4 u4Var, MRError mRError) {
        jo.p.h(u4Var, "this$0");
        if (mRError == null) {
            return;
        }
        u4Var.b4(mRError);
    }

    public static final void h4(u4 u4Var, Boolean bool) {
        jo.p.h(u4Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            pe.b.f47398a1.a(u4Var.V3(), false, true).z3(u4Var.p0(), "RegistrationDialog");
        }
    }

    public static final void i4(u4 u4Var, MRError mRError) {
        jo.p.h(u4Var, "this$0");
        if (mRError == null) {
            return;
        }
        u4Var.b4(mRError);
    }

    public static final void j4(ae.q4 q4Var, List list) {
        jo.p.h(q4Var, "$binding");
        RecyclerView recyclerView = q4Var.Y;
        jo.p.g(list, "it");
        recyclerView.setAdapter(new rd.w0(list));
    }

    public static final void k4(u4 u4Var, String str) {
        jo.p.h(u4Var, "this$0");
        if (str == null) {
            return;
        }
        u4Var.U0.z().p(Boolean.valueOf(!jo.p.c(str, u4Var.X3())));
        u4Var.U0.B().p(Boolean.valueOf(!jo.p.c(str, u4Var.X3())));
    }

    public static final void l4(u4 u4Var, ae.q4 q4Var, UserProfile userProfile) {
        String str;
        jo.p.h(u4Var, "this$0");
        jo.p.h(q4Var, "$binding");
        if (userProfile == null) {
            return;
        }
        ud.q3 q3Var = u4Var.U0;
        Context N2 = u4Var.N2();
        jo.p.g(N2, "requireContext()");
        boolean c10 = jo.p.c(userProfile.getUserId(), u4Var.U3().Y0());
        if (userProfile.getBirthday().length() == 4) {
            int i10 = nd.f1.J3;
            String substring = userProfile.getBirthday().substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = userProfile.getBirthday().substring(2);
            jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
            str = u4Var.V0(i10, substring, substring2);
        } else {
            str = "";
        }
        jo.p.g(str, "if (userProfile.birthday…                } else \"\"");
        q3Var.a(N2, userProfile, c10, str);
        androidx.lifecycle.e0<List<String>> o10 = u4Var.U0.o();
        List<RibbonResponse> ribbons = userProfile.getRibbons();
        ArrayList arrayList = new ArrayList(xn.t.u(ribbons, 10));
        for (RibbonResponse ribbonResponse : ribbons) {
            arrayList.add(ribbonResponse.getImageUrl());
        }
        o10.p(arrayList);
        if (userProfile.isBlocked()) {
            u4Var.U0.z().p(Boolean.FALSE);
        }
        MutualFolloweeView mutualFolloweeView = q4Var.R;
        MutualFollowee mutualFollowees = userProfile.getMutualFollowees();
        if (mutualFollowees == null) {
            mutualFollowees = new MutualFollowee(xn.s.k(), "");
        }
        mutualFolloweeView.b(mutualFollowees);
    }

    public static final void m4(u4 u4Var, Integer num) {
        jo.p.h(u4Var, "this$0");
        u4Var.U0.h().p(num);
    }

    public static final void p4(u4 u4Var, View view) {
        jo.p.h(u4Var, "this$0");
        u4Var.A4();
    }

    public static final void q4(u4 u4Var, View view) {
        jo.p.h(u4Var, "this$0");
        if (jo.p.c(u4Var.S3().I0().f(), Boolean.TRUE)) {
            return;
        }
        if (u4Var.c4()) {
            u4Var.z4();
        } else {
            u4Var.y4();
        }
    }

    public static final void r4(u4 u4Var, View view) {
        jo.p.h(u4Var, "this$0");
        if (jo.p.c(u4Var.S3().I0().f(), Boolean.TRUE)) {
            return;
        }
        if (u4Var.c4()) {
            u4Var.z4();
        } else {
            u4Var.y4();
        }
    }

    public static final void s4(u4 u4Var, View view) {
        jo.p.h(u4Var, "this$0");
        if (jo.p.c(u4Var.S3().I0().f(), Boolean.TRUE)) {
            return;
        }
        if (u4Var.c4()) {
            u4Var.w4();
        } else {
            u4Var.x4();
        }
    }

    public static final void t4(u4 u4Var, View view) {
        jo.p.h(u4Var, "this$0");
        if (jo.p.c(u4Var.S3().I0().f(), Boolean.TRUE)) {
            return;
        }
        if (u4Var.c4()) {
            u4Var.u4();
        } else {
            u4Var.v4();
        }
    }

    public final void A4() {
        String f10 = this.U0.p().f();
        if (f10 == null) {
            return;
        }
        if (f10.length() == 0) {
            return;
        }
        Context q02 = q0();
        of.n.r(q02, "https://twitter.com/" + f10);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    public final nf.c S3() {
        return (nf.c) this.W0.getValue();
    }

    public final tb.c T3() {
        return (tb.c) this.X0.getValue();
    }

    public final nf.z U3() {
        return (nf.z) this.T0.getValue();
    }

    public final String V3() {
        return (String) this.N0.getValue();
    }

    public final nd.i1 W3() {
        return (nd.i1) this.V0.getValue();
    }

    public final String X3() {
        return (String) this.O0.getValue();
    }

    public final kf.x Y3() {
        return (kf.x) this.Q0.getValue();
    }

    public final od.t0 Z3() {
        return (od.t0) this.R0.getValue();
    }

    public final nf.o0 a4() {
        return (nf.o0) this.S0.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        int hashCode = str.hashCode();
        if (hashCode == 919010764) {
            if (str.equals("DIALOG_TAG_SHOW_FOLLOWING_CONFIRM")) {
                x4();
            }
        } else if (hashCode != 1006235492) {
            if (hashCode == 1207304517 && str.equals("DIALOG_TAG_SHOW_FOLLOWER_CONFIRM")) {
                v4();
            }
        } else if (str.equals("DIALOG_TAG_SHOW_PROFILE_CONFIRM")) {
            y4();
            n3();
        }
    }

    public final void b4(MRError mRError) {
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

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final boolean c4() {
        return (jo.p.c(W3().a().b(), UnityReceiverKt.EMOMO) || jo.p.c(W3().a().b(), "braodcasting") || U3().s0().f() == null) ? false : true;
    }

    public final void d4(final ae.q4 q4Var) {
        this.U0.o().i(this, new androidx.lifecycle.f0() { // from class: be.p4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.j4(ae.q4.this, (List) obj);
            }
        });
        a4().v().i(a1(), new androidx.lifecycle.f0() { // from class: be.i4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.k4(u4.this, (String) obj);
            }
        });
        a4().B().i(a1(), new androidx.lifecycle.f0() { // from class: be.j4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.l4(u4.this, q4Var, (UserProfile) obj);
            }
        });
        a4().n().i(a1(), new androidx.lifecycle.f0() { // from class: be.h4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.m4(u4.this, (Integer) obj);
            }
        });
        a4().D().i(a1(), new androidx.lifecycle.f0() { // from class: be.s4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.e4(u4.this, (Boolean) obj);
            }
        });
        a4().i().i(a1(), new androidx.lifecycle.f0() { // from class: be.k4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.f4(u4.this, q4Var, (List) obj);
            }
        });
        a4().k().i(a1(), new androidx.lifecycle.f0() { // from class: be.q4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.g4(u4.this, (MRError) obj);
            }
        });
        a4().r().i(a1(), new androidx.lifecycle.f0() { // from class: be.t4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.h4(u4.this, (Boolean) obj);
            }
        });
        a4().m().i(a1(), new androidx.lifecycle.f0() { // from class: be.r4
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u4.i4(u4.this, (MRError) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.q4 T = ae.q4.T(view);
        T.V(this.U0);
        T.M(a1());
        jo.p.g(T, "binding");
        n4(T);
        o4(T);
        d4(T);
        Z3().x();
        Z3().w();
    }

    public final void n4(ae.q4 q4Var) {
        q4Var.Y.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b10 = de.e.b(this, 4);
        int b11 = de.e.b(this, 16);
        q4Var.Y.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        q4Var.B.setAdapter(new rd.c());
        q4Var.B.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        int b12 = de.e.b(this, 8);
        int b13 = de.e.b(this, 16);
        q4Var.B.g(new p001if.c(b12, b13, 0, b13, 0, 0));
    }

    public final void o4(ae.q4 q4Var) {
        q4Var.B.k(new c());
        FollowView followView = q4Var.K;
        jo.p.g(followView, "binding.followView");
        yd.g1.a(followView, new d());
        RoundedButtonView roundedButtonView = q4Var.S;
        jo.p.g(roundedButtonView, "binding.okButtonView");
        yd.g1.a(roundedButtonView, new e());
        q4Var.Z.setOnClickListener(new View.OnClickListener() { // from class: be.m4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u4.p4(u4.this, view);
            }
        });
        q4Var.V.setOnClickListener(new View.OnClickListener() { // from class: be.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u4.q4(u4.this, view);
            }
        });
        q4Var.f1467c0.setOnClickListener(new View.OnClickListener() { // from class: be.l4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u4.r4(u4.this, view);
            }
        });
        q4Var.N.setOnClickListener(new View.OnClickListener() { // from class: be.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u4.s4(u4.this, view);
            }
        });
        q4Var.M.setOnClickListener(new View.OnClickListener() { // from class: be.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u4.t4(u4.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    public final void u4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nd.f1.S2);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nd.f1.S5), U0(nd.f1.f41985p3), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_FOLLOWER_CONFIRM");
    }

    public final void v4() {
        tb.c T3 = T3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(T3.I(N2, X3(), 1));
    }

    public final void w4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nd.f1.S2);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nd.f1.S5), U0(nd.f1.f41985p3), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_FOLLOWING_CONFIRM");
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof v4 ? (v4) context : null;
    }

    public final void x4() {
        tb.c T3 = T3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(T3.I(N2, X3(), 0));
    }

    public final void y4() {
        if (jo.p.c(X3(), Y3().T4())) {
            tb.c T3 = T3();
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            f3(T3.z0(N2));
            return;
        }
        tb.c T32 = T3();
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        f3(T32.s(N22, X3(), V3()));
    }

    public final void z4() {
        f.a aVar = ie.f.V0;
        String U0 = U0(nd.f1.S2);
        jo.p.g(U0, "getString(R.string.text_leave_live_confirm)");
        f.a.b(aVar, U0, U0(nd.f1.S5), U0(nd.f1.f41985p3), null, false, 24, null).z3(p0(), "DIALOG_TAG_SHOW_PROFILE_CONFIRM");
    }
}
