package r9;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RemainingKandumeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kq.a;

/* loaded from: classes.dex */
public final class p1 extends androidx.fragment.app.e {
    public vb.p O0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public ClosetAvatar T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {jo.f0.d(new jo.s(p1.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentEmomoDressUpShopBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;
    public final q2 N0 = new q2();
    public final AutoClearedValue P0 = nd.a.a(this);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p1 a() {
            return new p1();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.p pVar = p1.this.O0;
            if (pVar != null) {
                pVar.h();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            p1.this.L3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MRLogger J3 = p1.this.J3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_KANDUME_HELP_CLICK);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, "shop_purchase")));
            J3.sendLog(builder.build());
            be.f2.O0.a().z3(p1.this.O2(), "KandumeInfoDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends androidx.recyclerview.widget.k {
        public e(p1 p1Var, Context context) {
            super(context, 1);
            n(new InsetDrawable(c3.a.f(p1Var.N2(), q9.f.vertical_orientation_divider_very_light_pink), de.e.b(p1Var, 12), 0, 0, 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<Integer, wn.v> {
        public f() {
            super(1);
        }

        public final void a(int i10) {
            p1.this.N3(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50450w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50451x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50452y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50450w = componentCallbacks;
            this.f50451x = aVar;
            this.f50452y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50450w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50451x, this.f50452y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50453w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50454x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50453w = componentCallbacks;
            this.f50454x = aVar;
            this.f50455y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f50453w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f50454x, this.f50455y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50456w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f50456w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50456w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50456w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50457w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f50457w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50457w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50458w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50459x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50460y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50461z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50458w = aVar;
            this.f50459x = aVar2;
            this.f50460y = aVar3;
            this.f50461z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50458w;
            vq.a aVar2 = this.f50459x;
            io.a aVar3 = this.f50460y;
            xq.a aVar4 = this.f50461z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50462w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f50462w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50462w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public p1() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new g(this, null, null));
        i iVar2 = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar2);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new l(jVar), new k(iVar2, null, null, a10));
        this.S0 = wn.g.b(iVar, new h(this, null, null));
    }

    public static final void K3(p1 p1Var, Integer num) {
        jo.p.h(p1Var, "this$0");
        RemainingKandumeView remainingKandumeView = p1Var.G3().H;
        jo.p.g(num, "it");
        remainingKandumeView.setRemainingKandume(num.intValue());
    }

    public final s9.c0 G3() {
        return (s9.c0) this.P0.b(this, V0[0]);
    }

    public final od.e H3() {
        return (od.e) this.S0.getValue();
    }

    public final nf.f I3() {
        return (nf.f) this.R0.getValue();
    }

    public final MRLogger J3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final void L3() {
        List<ud.q> b10 = this.N0.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b10) {
            if (((ud.q) obj).q()) {
                arrayList.add(obj);
            }
        }
        ke.a aVar = new ke.a(arrayList);
        MRLogger J3 = J3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_PURCHASE_CLICK);
        builder.setPayload(xn.r.d(companion.selectItemIds(aVar)));
        J3.sendLog(builder.build());
        int M3 = M3();
        Integer f10 = I3().q0().f();
        if (f10 == null) {
            f10 = 0;
        }
        int intValue = f10.intValue();
        vb.p pVar = this.O0;
        if (pVar != null) {
            pVar.y2(aVar, M3 > intValue);
        }
    }

    public final int M3() {
        List<ud.q> b10 = this.N0.b();
        ArrayList<ud.q> arrayList = new ArrayList();
        for (Object obj : b10) {
            if (((ud.q) obj).q()) {
                arrayList.add(obj);
            }
        }
        int i10 = 0;
        for (ud.q qVar : arrayList) {
            i10 += qVar.b();
        }
        return i10;
    }

    public final void N3(int i10) {
        int i11;
        ud.q qVar = this.N0.b().get(i10);
        if (qVar.l().e() == jf.m0.COMPANION && qVar.l() != jf.k0.COMPANION) {
            Iterator<ud.q> it = this.N0.b().iterator();
            int i12 = 0;
            while (true) {
                i11 = -1;
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next().l() == jf.k0.COMPANION) {
                    break;
                }
                i12++;
            }
            if (i12 >= 0) {
                Iterator<ud.q> it2 = this.N0.b().iterator();
                int i13 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ud.q next = it2.next();
                    if (next.l() == jf.k0.COMPANION && next.q()) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
                if (i11 < 0) {
                    return;
                }
            }
        }
        boolean z10 = qVar.l() == jf.k0.COMPANION && qVar.q();
        q2 q2Var = this.N0;
        List<ud.q> b10 = q2Var.b();
        ArrayList arrayList = new ArrayList(xn.t.u(b10, 10));
        int i14 = 0;
        for (Object obj : b10) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                xn.s.t();
            }
            ud.q qVar2 = (ud.q) obj;
            if (i14 == i10) {
                qVar2.I(!qVar2.q());
                if (qVar2.q()) {
                    H3().g(qVar2.j(), qVar2.i(), qVar2.E());
                    qVar2.G(false);
                }
            }
            if (z10 && qVar2.l().e() == jf.m0.COMPANION) {
                qVar2.I(false);
            }
            arrayList.add(qVar2);
            i14 = i15;
        }
        q2Var.g(arrayList);
        P3();
    }

    public final void O3(s9.c0 c0Var) {
        this.P0.a(this, V0[0], c0Var);
    }

    public final void P3() {
        int i10;
        G3().I.setText(String.valueOf(M3()));
        List<ud.q> b10 = this.N0.b();
        if ((b10 instanceof Collection) && b10.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            for (ud.q qVar : b10) {
                if (qVar.q() && (i10 = i10 + 1) < 0) {
                    xn.s.s();
                }
            }
        }
        if (i10 > 0) {
            G3().G.setBackground(c3.a.f(N2(), q9.f.bg_shop_kandume_round_20));
            G3().G.setEnabled(true);
            return;
        }
        G3().G.setBackground(c3.a.f(N2(), q9.f.bg_disable));
        G3().G.setEnabled(false);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), q9.h.dialog_fragment_emomo_dress_up_shop, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        O3((s9.c0) e10);
        ClosetAvatar R = I3().R();
        if (R != null) {
            this.T0 = R;
        }
        AppCompatImageView appCompatImageView = G3().D;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new b());
        ConstraintLayout constraintLayout = G3().G;
        jo.p.g(constraintLayout, "binding.purchaseButton");
        yd.g1.a(constraintLayout, new c());
        RemainingKandumeView remainingKandumeView = G3().H;
        jo.p.g(remainingKandumeView, "binding.remainingKandumeView");
        yd.g1.a(remainingKandumeView, new d());
        G3().F.setLayoutManager(new LinearLayoutManager(N2(), 1, false));
        G3().F.g(new e(this, N2()));
        G3().F.setAdapter(this.N0);
        List<ud.q> f10 = I3().E().f();
        if (f10 != null) {
            this.N0.g(f10);
        }
        this.N0.h(new f());
        I3().q0().i(this, new androidx.lifecycle.f0() { // from class: r9.o1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                p1.K3(p1.this, (Integer) obj);
            }
        });
        P3();
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(G3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof vb.p ? (vb.p) context : null;
    }
}
