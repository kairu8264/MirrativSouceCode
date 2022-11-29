package ra;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import java.util.List;
import java.util.Locale;
import jf.g0;
import jo.f0;
import jo.q;
import jo.s;
import kq.a;
import od.b0;
import uo.q0;
import uo.r0;
import wn.v;
import xn.r;
import yd.g1;

/* loaded from: classes2.dex */
public final class e extends Fragment implements q0 {
    public final wn.f A0;
    public final AutoClearedValue B0;
    public n C0;
    public final wn.f D0;
    public final wn.f E0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f50576x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f50577y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f50578z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {f0.d(new s(e.class, "binding", "getBinding()Lcom/dena/mirrativ/notification/databinding/FragmentNoticeCampaignBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a() {
            return new e();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e.this.o3().b(g0.RECOMMEND.e());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e.this.o3().b(g0.EMOMO.e());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e.this.o3().b(g0.APP.e());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* renamed from: ra.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0772e extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50582w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50583x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0772e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50582w = componentCallbacks;
            this.f50583x = aVar;
            this.f50584y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50582w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f50583x, this.f50584y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<b0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50585w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50586x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50587y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50585w = componentCallbacks;
            this.f50586x = aVar;
            this.f50587y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b0] */
        @Override // io.a
        public final b0 invoke() {
            ComponentCallbacks componentCallbacks = this.f50585w;
            return gq.a.a(componentCallbacks).c(f0.b(b0.class), this.f50586x, this.f50587y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50588w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50589x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50588w = componentCallbacks;
            this.f50589x = aVar;
            this.f50590y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f50588w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f50589x, this.f50590y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50591w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50592x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50591w = componentCallbacks;
            this.f50592x = aVar;
            this.f50593y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f50591w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f50592x, this.f50593y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50594w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f50594w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f50594w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50595w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f50595w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f50595w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50596w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50597x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50598y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50599z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50596w = aVar;
            this.f50597x = aVar2;
            this.f50598y = aVar3;
            this.f50599z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50596w;
            vq.a aVar2 = this.f50597x;
            io.a aVar3 = this.f50598y;
            xq.a aVar4 = this.f50599z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(p.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50600w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f50600w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f50600w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public e() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f50577y0 = wn.g.b(iVar, new C0772e(this, null, null));
        this.f50578z0 = wn.g.b(iVar, new f(this, null, null));
        i iVar2 = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar2);
        this.A0 = e0.a(this, f0.b(p.class), new l(jVar), new k(iVar2, null, null, a10));
        this.B0 = nd.a.a(this);
        this.D0 = wn.g.b(iVar, new g(this, null, null));
        this.E0 = wn.g.b(iVar, new h(this, null, null));
    }

    public static final void u3(e eVar, Integer num) {
        jo.p.h(eVar, "this$0");
        jo.p.g(num, "it");
        eVar.y3(num.intValue());
    }

    public static final void v3(e eVar, Boolean bool) {
        jo.p.h(eVar, "this$0");
        View view = eVar.p3().H;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void w3(e eVar, Boolean bool) {
        jo.p.h(eVar, "this$0");
        View view = eVar.p3().F;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void x3(e eVar, Boolean bool) {
        jo.p.h(eVar, "this$0");
        View view = eVar.p3().C;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int intValue;
        jo.p.h(layoutInflater, "inflater");
        sa.c T = sa.c.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        z3(T);
        RoundedButtonView roundedButtonView = p3().G;
        jo.p.g(roundedButtonView, "binding.recommendButton");
        g1.a(roundedButtonView, new b());
        RoundedButtonView roundedButtonView2 = p3().E;
        jo.p.g(roundedButtonView2, "binding.emomoButton");
        g1.a(roundedButtonView2, new c());
        RoundedButtonView roundedButtonView3 = p3().B;
        jo.p.g(roundedButtonView3, "binding.appButton");
        g1.a(roundedButtonView3, new d());
        t3().f().i(a1(), new androidx.lifecycle.f0() { // from class: ra.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e.u3(e.this, (Integer) obj);
            }
        });
        t3().i().i(a1(), new androidx.lifecycle.f0() { // from class: ra.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e.v3(e.this, (Boolean) obj);
            }
        });
        t3().h().i(a1(), new androidx.lifecycle.f0() { // from class: ra.a
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e.w3(e.this, (Boolean) obj);
            }
        });
        t3().g().i(a1(), new androidx.lifecycle.f0() { // from class: ra.b
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                e.x3(e.this, (Boolean) obj);
            }
        });
        o3().a();
        Boolean f10 = t3().i().f();
        Boolean bool = Boolean.TRUE;
        if (jo.p.c(f10, bool)) {
            intValue = g0.RECOMMEND.e();
        } else if (jo.p.c(t3().h().f(), bool)) {
            intValue = g0.EMOMO.e();
        } else if (jo.p.c(t3().g().f(), bool)) {
            intValue = g0.APP.e();
        } else {
            Integer f11 = r3().o().f();
            if (f11 == null) {
                f11 = 0;
            }
            intValue = f11.intValue();
        }
        o3().b(intValue);
        View u10 = p3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        r0.d(this, null, 1, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f50576x0.getCoroutineContext();
    }

    public final b0 o3() {
        return (b0) this.f50578z0.getValue();
    }

    public final sa.c p3() {
        return (sa.c) this.B0.b(this, G0[0]);
    }

    public final od.p q3() {
        return (od.p) this.D0.getValue();
    }

    public final nf.o r3() {
        return (nf.o) this.E0.getValue();
    }

    public final MRLogger s3() {
        return (MRLogger) this.f50577y0.getValue();
    }

    public final p t3() {
        return (p) this.A0.getValue();
    }

    public final void y3(int i10) {
        Boolean bool;
        n a10;
        int i11 = 0;
        List m10 = xn.s.m(p3().G, p3().E, p3().B);
        int size = m10.size();
        while (i11 < size) {
            ((RoundedButtonView) m10.get(i11)).setAlpha(i11 == i10 ? 1.0f : 0.25f);
            i11++;
        }
        g0 g0Var = g0.RECOMMEND;
        if (i10 == g0Var.e()) {
            bool = t3().i().f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        } else if (i10 == g0.EMOMO.e()) {
            bool = t3().h().f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        } else if (i10 == g0.APP.e()) {
            bool = t3().g().f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
        } else {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (i10 == g0Var.e()) {
            a10 = n.I0.a(g0Var);
        } else {
            g0 g0Var2 = g0.EMOMO;
            if (i10 == g0Var2.e()) {
                a10 = n.I0.a(g0Var2);
            } else {
                g0 g0Var3 = g0.APP;
                a10 = i10 == g0Var3.e() ? n.I0.a(g0Var3) : null;
            }
        }
        this.C0 = a10;
        if (a10 != null) {
            p0().k().r(qa.o.f48877f, a10).i();
            MRLogger s32 = s3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_NOTICE_CAMPAIGN_TAB_VIEW);
            String lowerCase = a10.A3().name().toLowerCase(Locale.ROOT);
            jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            builder.setTargetId(lowerCase);
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, booleanValue ? "new" : "")));
            s32.sendLog(builder.build());
        }
        q3().n(i10);
    }

    public final void z3(sa.c cVar) {
        this.B0.a(this, G0[0], cVar);
    }
}
