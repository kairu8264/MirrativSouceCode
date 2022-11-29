package qb;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.e0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hb.b2;
import hb.t1;
import hb.w1;
import hb.x1;
import hb.y1;
import hf.v0;
import ie.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import nf.z;
import o3.c0;
import tb.c;
import ud.a;
import ud.c2;
import ud.d2;
import ud.e2;
import ud.f2;
import xn.a0;
import yd.g1;

/* loaded from: classes2.dex */
public final class q extends com.google.android.material.bottomsheet.b implements f.b {
    public s P0;
    public c2 R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public static final /* synthetic */ qo.h<Object>[] Y0 = {f0.d(new jo.s(q.class, "binding", "getBinding()Lcom/dena/mirrativ/player/databinding/BottomSheetDialogFragmentLiveInfoBinding;", 0))};
    public static final a X0 = new a(null);
    public static final int Z0 = 8;
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f Q0 = wn.g.a(b.f48909w);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q a(String str) {
            jo.p.h(str, "referer");
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            qVar.V2(bundle);
            return qVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<qb.r> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f48909w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final qb.r invoke() {
            return (qb.r) new t0.d().a(qb.r.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i9.a f48910w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ q f48911x;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ q f48912w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar) {
                super(0);
                this.f48912w = qVar;
            }

            public final void a() {
                String g10;
                MRLogger e42 = this.f48912w.e4();
                MRLog.Companion companion = MRLog.Companion;
                q qVar = this.f48912w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_YELL_VIEW_YELL_RANK_LIST_IMP);
                builder.setPageId(Referer.LIVE_VIEW);
                te.c f10 = qVar.f4().j1().f();
                builder.setTargetId(f10 != null ? f10.g() : null);
                e42.sendLog(builder.build());
                te.c f11 = this.f48912w.f4().j1().f();
                if (f11 == null || (g10 = f11.g()) == null) {
                    return;
                }
                q qVar2 = this.f48912w;
                tb.a i02 = qVar2.c4().i0(qVar2.g4(), g10);
                i02.a().z3(qVar2.p0(), i02.b());
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i9.a aVar, q qVar) {
            super(2);
            this.f48910w = aVar;
            this.f48911x = qVar;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                i9.b.a(null, this.f48910w, new a(this.f48911x), iVar, i9.a.C << 3, 1);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
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
            String string = q.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<String, wn.v> {
        public e() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            tb.a i10 = c.a.i(q.this.c4(), str, q.this.g4(), false, false, 12, null);
            i10.a().z3(q.this.p0(), i10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            s sVar = q.this.P0;
            if (sVar != null) {
                sVar.W1();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements View.OnLayoutChangeListener {
        public g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (q.this.b4().B.getLineCount() > 3 || q.this.b4().B.getLayout().getEllipsisCount(q.this.b4().B.getLineCount() - 1) > 0) {
                q.this.b4().O.setVisibility(0);
                q.this.b4().D.setVisibility(8);
                return;
            }
            q.this.b4().O.setVisibility(8);
            q.this.b4().D.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            q.this.i4(linearLayoutManager.l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (Integer.MAX_VALUE == q.this.b4().B.getMaxLines()) {
                q.this.b4().B.setMaxLines(3);
                q.this.b4().O.setText(q.this.O0().getString(b2.W));
                return;
            }
            g5.b bVar = new g5.b();
            bVar.b0(300L);
            bVar.c(q.this.b4().B.getId());
            bVar.c(q.this.b4().Q.getId());
            g5.o.a(q.this.b4().Q, bVar);
            q.this.b4().B.setMaxLines(Integer.MAX_VALUE);
            q.this.b4().O.setText(q.this.O0().getString(b2.f34729s));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        public j() {
            super(1);
        }

        public final void a(View view) {
            String g10;
            jo.p.h(view, "it");
            te.c f10 = q.this.f4().j1().f();
            if (f10 == null || (g10 = f10.g()) == null) {
                return;
            }
            tb.a i10 = c.a.i(q.this.c4(), g10, q.this.g4(), false, false, 8, null);
            i10.a().z3(q.this.p0(), i10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<View, wn.v> {
        public k() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            q.this.E4();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {
        public l() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s sVar = q.this.P0;
            if (sVar != null) {
                sVar.v();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s sVar = q.this.P0;
            if (sVar != null) {
                sVar.h2();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            String g10;
            jo.p.h(view, "it");
            te.c f10 = q.this.f4().j1().f();
            if (f10 == null || (g10 = f10.g()) == null) {
                return;
            }
            tb.a i10 = c.a.i(q.this.c4(), g10, q.this.g4(), false, false, 8, null);
            i10.a().z3(q.this.p0(), i10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f48924w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f48925x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f48926y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f48924w = componentCallbacks;
            this.f48925x = aVar;
            this.f48926y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f48924w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f48925x, this.f48926y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f48927w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f48928x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f48929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f48927w = componentCallbacks;
            this.f48928x = aVar;
            this.f48929y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f48927w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f48928x, this.f48929y);
        }
    }

    /* renamed from: qb.q$q  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0740q extends jo.q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f48930w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f48931x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f48932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0740q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f48930w = componentCallbacks;
            this.f48931x = aVar;
            this.f48932y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final z invoke() {
            ComponentCallbacks componentCallbacks = this.f48930w;
            return gq.a.a(componentCallbacks).c(f0.b(z.class), this.f48931x, this.f48932y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f48933w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f48934x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f48935y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f48933w = componentCallbacks;
            this.f48934x = aVar;
            this.f48935y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f48933w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f48934x, this.f48935y);
        }
    }

    public q() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new o(this, null, null));
        this.T0 = wn.g.b(iVar, new p(this, null, null));
        this.U0 = wn.g.b(iVar, new C0740q(this, null, null));
        this.V0 = wn.g.a(new d());
        this.W0 = wn.g.b(iVar, new r(this, null, null));
    }

    public static final void B4(q qVar, View view) {
        jo.p.h(qVar, "this$0");
        qVar.C4();
    }

    public static final boolean D4(q qVar, MenuItem menuItem) {
        s sVar;
        jo.p.h(qVar, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == w1.O1) {
            f.a aVar = ie.f.V0;
            String U0 = qVar.U0(b2.f34714a);
            jo.p.g(U0, "getString(R.string.block_confirmation_viewer)");
            f.a.b(aVar, U0, qVar.U0(b2.f34722n), null, null, false, 24, null).z3(qVar.p0(), "DIALOG_TAG_BLOCK_CONFIRM");
            return true;
        } else if (itemId != w1.Q1 || (sVar = qVar.P0) == null) {
            return true;
        } else {
            sVar.n0();
            return true;
        }
    }

    public static final void k4(q qVar, String str) {
        jo.p.h(qVar, "this$0");
        if (jo.p.c(str, "")) {
            qVar.b4().O.setVisibility(8);
        }
        qVar.b4().B.setText(str);
    }

    public static final void l4(q qVar, te.c cVar) {
        jo.p.h(qVar, "this$0");
        if (cVar == null) {
            return;
        }
        qVar.d4().l().p(cVar.f());
        qVar.d4().p().p(cVar.e());
        qVar.d4().o().p(cVar.g());
        qVar.d4().f().p(cVar.c());
        qVar.d4().s().p(Boolean.valueOf(cVar.c().length() > 0));
        qVar.d4().r().p(Boolean.valueOf(cVar.d()));
        qVar.d4().u().p(Boolean.valueOf(!jo.p.c(cVar.g(), qVar.h4().x())));
        qVar.d4().g().p(cVar.b());
    }

    public static final void m4(q qVar, String str) {
        jo.p.h(qVar, "this$0");
        c2 c2Var = qVar.R0;
        e0<String> c10 = c2Var != null ? c2Var.c() : null;
        if (c10 == null) {
            return;
        }
        c10.p(str);
    }

    public static final void n4(q qVar, Integer num) {
        jo.p.h(qVar, "this$0");
        qVar.d4().m().p(num);
    }

    public static final void o4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        if (bool != null) {
            bool.booleanValue();
            qVar.d4().r().p(bool);
        }
    }

    public static final void p4(q qVar, Boolean bool) {
        jo.p.h(qVar, "this$0");
        c2 c2Var = qVar.R0;
        e0<Boolean> d10 = c2Var != null ? c2Var.d() : null;
        if (d10 == null) {
            return;
        }
        d10.p(bool);
    }

    public static final void q4(q qVar, List list) {
        Collection k10;
        jo.p.h(qVar, "this$0");
        List<ud.a> f10 = qVar.d4().j().f();
        if (f10 != null) {
            k10 = new ArrayList();
            for (Object obj : f10) {
                ud.a aVar = (ud.a) obj;
                if ((aVar.getType() == a.EnumC0862a.LOADING || aVar.getType() == a.EnumC0862a.LIVE_VIEWERS_INFO || aVar.getType() == a.EnumC0862a.LIVE_VIEWER) ? false : true) {
                    k10.add(obj);
                }
            }
        } else {
            k10 = xn.s.k();
        }
        te.c f11 = qVar.f4().j1().f();
        if (f11 == null) {
            return;
        }
        e2 e2Var = new e2(f11.getOnlineUserNum(), f11.getTotalViewerNum(), null, 4, null);
        e0<List<ud.a>> j10 = qVar.d4().j();
        List p02 = a0.p0(k10, e2Var);
        jo.p.g(list, "viewers");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d2.a aVar2 = d2.G;
            Resources resources = qVar.N2().getResources();
            jo.p.g(resources, "requireContext().resources");
            arrayList.add(aVar2.a((LiveViewingUser) it.next(), resources));
        }
        j10.p(a0.o0(p02, arrayList));
        qVar.d4().t().p(Boolean.valueOf(!f11.isPrivate()));
    }

    public static final void r4(q qVar, App.AppParams appParams) {
        jo.p.h(qVar, "this$0");
        if (appParams == null) {
            return;
        }
        c2 c2Var = qVar.R0;
        e0<String> b10 = c2Var != null ? c2Var.b() : null;
        if (b10 != null) {
            b10.p(appParams.getTitle());
        }
        c2 c2Var2 = qVar.R0;
        e0<String> a10 = c2Var2 != null ? c2Var2.a() : null;
        if (a10 == null) {
            return;
        }
        a10.p(appParams.getIconUrl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
        if ((r1.length() > 0) == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s4(qb.q r4, com.dena.mirrorman.net.api.response.user.UserProfile r5) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r4, r0)
            if (r5 != 0) goto L8
            return
        L8:
            qb.r r0 = r4.d4()
            androidx.lifecycle.e0 r0 = r0.r()
            boolean r1 = r5.isFollowing()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.p(r1)
            qb.r r0 = r4.d4()
            androidx.lifecycle.e0 r0 = r0.q()
            boolean r1 = r5.isFollower()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.p(r1)
            qb.r r0 = r4.d4()
            androidx.lifecycle.e0 r0 = r0.h()
            int r1 = r5.getFollowingNum()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.p(r1)
            qb.r r0 = r4.d4()
            androidx.lifecycle.e0 r0 = r0.i()
            int r1 = r5.getFollowerNum()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.p(r1)
            qb.r r0 = r4.d4()
            androidx.lifecycle.e0 r0 = r0.v()
            java.lang.String r1 = r5.getTwitterScreenName()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L70
            int r1 = r1.length()
            if (r1 <= 0) goto L6c
            r1 = r2
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != r2) goto L70
            goto L71
        L70:
            r2 = r3
        L71:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.p(r1)
            qb.r r4 = r4.d4()
            androidx.lifecycle.e0 r4 = r4.n()
            java.lang.String r5 = r5.getTwitterScreenName()
            r4.p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.q.s4(qb.q, com.dena.mirrorman.net.api.response.user.UserProfile):void");
    }

    public static final void t4(q qVar, i9.a aVar) {
        jo.p.h(qVar, "this$0");
        if (aVar == null) {
            return;
        }
        qVar.b4().E.setVisibility(aVar.c() ? 0 : 8);
        qVar.b4().E.setContent(s0.c.c(226384057, true, new c(aVar, qVar)));
    }

    public static final void w4(q qVar, List list) {
        jo.p.h(qVar, "this$0");
        RecyclerView recyclerView = qVar.b4().P;
        jo.p.g(list, "bindModels");
        qb.b bVar = new qb.b(list);
        bVar.f(new e());
        bVar.d(new f());
        recyclerView.setAdapter(bVar);
    }

    public static final void x4(q qVar, DialogInterface dialogInterface) {
        jo.p.h(qVar, "this$0");
        qVar.z4();
    }

    public final void A4() {
        b4().P.k(new h());
        AppCompatTextView appCompatTextView = b4().B;
        jo.p.g(appCompatTextView, "binding.bioTextView");
        if (c0.V(appCompatTextView) && !appCompatTextView.isLayoutRequested()) {
            if (b4().B.getLineCount() > 3 || b4().B.getLayout().getEllipsisCount(b4().B.getLineCount() - 1) > 0) {
                b4().O.setVisibility(0);
                b4().D.setVisibility(8);
            } else {
                b4().O.setVisibility(8);
                b4().D.setVisibility(0);
            }
        } else {
            appCompatTextView.addOnLayoutChangeListener(new g());
        }
        AppCompatButton appCompatButton = b4().O;
        jo.p.g(appCompatButton, "binding.readMoreBio");
        g1.a(appCompatButton, new i());
        AppCompatImageView appCompatImageView = b4().N;
        jo.p.g(appCompatImageView, "binding.profileImageView");
        g1.a(appCompatImageView, new j());
        AppCompatImageView appCompatImageView2 = b4().U;
        jo.p.g(appCompatImageView2, "binding.twitterImageView");
        g1.a(appCompatImageView2, new k());
        FollowView followView = b4().H;
        jo.p.g(followView, "binding.followView");
        g1.a(followView, new l());
        ConstraintLayout constraintLayout = b4().R;
        jo.p.g(constraintLayout, "binding.shareContainer");
        g1.a(constraintLayout, new m());
        b4().M.setOnClickListener(new View.OnClickListener() { // from class: qb.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.B4(q.this, view);
            }
        });
        AppCompatTextView appCompatTextView2 = b4().X;
        jo.p.g(appCompatTextView2, "binding.userNameTextView");
        g1.a(appCompatTextView2, new n());
    }

    public final void C4() {
        PopupMenu popupMenu = new PopupMenu(N2(), b4().M);
        popupMenu.getMenuInflater().inflate(y1.popup_live_menu, popupMenu.getMenu());
        MenuItem findItem = popupMenu.getMenu().findItem(w1.O1);
        if (findItem != null) {
            jo.p.g(findItem, "findItem(R.id.item_block)");
            String obj = findItem.getTitle().toString();
            SpannableString spannableString = new SpannableString(obj);
            spannableString.setSpan(new ForegroundColorSpan(c3.a.d(N2(), t1.f34976q)), 0, obj.length(), 0);
            findItem.setTitle(spannableString);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: qb.i
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean D4;
                D4 = q.D4(q.this, menuItem);
                return D4;
            }
        });
        popupMenu.show();
    }

    public final void E4() {
        String f10 = d4().n().f();
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
        s sVar = this.P0;
        if (sVar != null) {
            sVar.d0();
        }
        this.P0 = null;
        super.I1();
    }

    @Override // ie.f.b
    public void b(String str) {
        s sVar;
        jo.p.h(str, "tag");
        if (!jo.p.c(str, "DIALOG_TAG_BLOCK_CONFIRM") || (sVar = this.P0) == null) {
            return;
        }
        sVar.i2();
    }

    public final kb.f b4() {
        return (kb.f) this.O0.b(this, Y0[0]);
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(w1.f35020p0)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    public final tb.c c4() {
        return (tb.c) this.T0.getValue();
    }

    public final qb.r d4() {
        return (qb.r) this.Q0.getValue();
    }

    public final MRLogger e4() {
        return (MRLogger) this.W0.getValue();
    }

    public final z f4() {
        return (z) this.U0.getValue();
    }

    public final String g4() {
        return (String) this.V0.getValue();
    }

    public final v0 h4() {
        return (v0) this.S0.getValue();
    }

    public final void i4(int i10) {
        Integer f10;
        List<ud.a> f11 = d4().j().f();
        if (f11 == null || (f10 = f4().d1().f()) == null) {
            return;
        }
        int intValue = f10.intValue();
        if (jo.p.c(f4().M1().f(), Boolean.TRUE) || intValue < 1 || f11.size() > i10 + 10) {
            return;
        }
        d4().j().p(a0.p0(f11, new f2(null, 1, null)));
        s sVar = this.P0;
        if (sVar != null) {
            sVar.M0(intValue);
        }
    }

    public final void j4() {
        d4().f().i(this, new androidx.lifecycle.f0() { // from class: qb.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.k4(q.this, (String) obj);
            }
        });
        f4().j1().i(this, new androidx.lifecycle.f0() { // from class: qb.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.l4(q.this, (te.c) obj);
            }
        });
        f4().W0().i(this, new androidx.lifecycle.f0() { // from class: qb.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.m4(q.this, (String) obj);
            }
        });
        f4().B1().i(this, new androidx.lifecycle.f0() { // from class: qb.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.n4(q.this, (Integer) obj);
            }
        });
        f4().g1().i(this, new androidx.lifecycle.f0() { // from class: qb.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.o4(q.this, (Boolean) obj);
            }
        });
        f4().N1().i(this, new androidx.lifecycle.f0() { // from class: qb.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.p4(q.this, (Boolean) obj);
            }
        });
        f4().E1().i(this, new androidx.lifecycle.f0() { // from class: qb.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.q4(q.this, (List) obj);
            }
        });
        f4().r0().i(this, new androidx.lifecycle.f0() { // from class: qb.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.r4(q.this, (App.AppParams) obj);
            }
        });
        f4().h1().i(this, new androidx.lifecycle.f0() { // from class: qb.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.s4(q.this, (UserProfile) obj);
            }
        });
        f4().i1().i(this, new androidx.lifecycle.f0() { // from class: qb.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.t4(q.this, (i9.a) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        z4();
    }

    @Override // androidx.fragment.app.e
    public int q3() {
        return hb.c2.f34741d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u4() {
        ud.b2 b2Var;
        te.c f10 = f4().j1().f();
        if (f10 == null) {
            return;
        }
        if (f10.getApp() != null) {
            c2 c2Var = new c2(null, null, null, null, null, 31, null);
            e0<String> b10 = c2Var.b();
            App.AppParams app = f10.getApp();
            b10.p(app != null ? app.getTitle() : null);
            e0<String> a10 = c2Var.a();
            App.AppParams app2 = f10.getApp();
            a10.p(app2 != null ? app2.getIconUrl() : null);
            c2Var.c().p(f10.getTitle());
            c2Var.d().p(Boolean.valueOf(jo.p.c(f4().N1().f(), Boolean.TRUE)));
            this.R0 = c2Var;
            b2Var = c2Var;
        } else {
            String title = f10.getTitle();
            if (title == null) {
                title = "";
            }
            b2Var = new ud.b2(title, null, 2, null);
        }
        d4().j().p(xn.s.m(b2Var, new f2(null, 1, null)));
        s sVar = this.P0;
        if (sVar != null) {
            sVar.g2();
        }
    }

    public final void v4(kb.f fVar) {
        this.O0.a(this, Y0[0], fVar);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof s ? (s) context : null;
    }

    @Override // e.g, androidx.fragment.app.e
    public void y3(Dialog dialog, int i10) {
        WindowManager.LayoutParams attributes;
        jo.p.h(dialog, "dialog");
        WindowManager.LayoutParams layoutParams = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), x1.bottom_sheet_dialog_fragment_live_info, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        v4((kb.f) e10);
        b4().M(this);
        b4().T(d4());
        d4().j().i(this, new androidx.lifecycle.f0() { // from class: qb.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                q.w4(q.this, (List) obj);
            }
        });
        y4();
        A4();
        j4();
        u4();
        dialog.setContentView(b4().u());
        Window window = dialog.getWindow();
        if (window != null) {
            Window window2 = dialog.getWindow();
            if (window2 != null && (attributes = window2.getAttributes()) != null) {
                attributes.dimAmount = 0.0f;
                attributes.flags |= 2;
                layoutParams = attributes;
            }
            window.setAttributes(layoutParams);
        }
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qb.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                q.x4(q.this, dialogInterface);
            }
        });
    }

    public final void y4() {
        b4().P.setLayoutManager(new LinearLayoutManager(N2()));
        int b10 = de.e.b(this, 16);
        int b11 = de.e.b(this, 64);
        b4().P.g(new p001if.c(de.e.b(this, 8), 0, b10, 0, b11, 0, 32, null));
    }

    public final void z4() {
        Window window;
        FrameLayout frameLayout;
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(w1.f35020p0)) == null) {
            return;
        }
        frameLayout.setBackgroundResource(17170445);
        int i10 = O0().getConfiguration().orientation;
        if (i10 == 1) {
            int i11 = (int) (O0().getDisplayMetrics().heightPixels * 0.8d);
            b4().F.setLayoutParams(new FrameLayout.LayoutParams(-1, i11));
            BottomSheetBehavior.c0(frameLayout).v0(i11);
            frameLayout.getParent().getParent().requestLayout();
        } else if (i10 != 2) {
        } else {
            ConstraintLayout constraintLayout = b4().F;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(de.e.b(this, 360), -1);
            layoutParams.gravity = 8388613;
            constraintLayout.setLayoutParams(layoutParams);
            BottomSheetBehavior.c0(frameLayout).v0(O0().getDisplayMetrics().heightPixels);
            frameLayout.getParent().getParent().requestLayout();
        }
    }
}
