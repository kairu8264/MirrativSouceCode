package ld;

import ae.s5;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import ie.b;
import kq.a;
import ud.l1;

/* loaded from: classes2.dex */
public final class m extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public static final /* synthetic */ qo.h<Object>[] T0 = {jo.f0.d(new jo.s(m.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogHandoverCodeConfirmBinding;", 0))};
    public static final a S0 = new a(null);
    public static final int U0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(String str, String str2, boolean z10) {
            jo.p.h(str, "token");
            jo.p.h(str2, "secretToken");
            m mVar = new m();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TWITTER_ACCESS_TOKEN", str);
            bundle.putString("EXTRA_TWITTER_SECRET_TOKEN", str2);
            bundle.putBoolean("EXTRA_SHOW_URGE_USERS", z10);
            mVar.V2(bundle);
            return mVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<l1> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f40039w = new b();

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final l1 invoke() {
            return (l1) new t0.d().a(l1.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<String, wn.v> {
        public c() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            m.this.P3().n(str);
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
        public final /* synthetic */ ComponentCallbacks f40041w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40042x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40041w = componentCallbacks;
            this.f40042x = aVar;
            this.f40043y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld.t] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f40041w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(t.class), this.f40042x, this.f40043y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40044w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40045x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40046y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40044w = componentCallbacks;
            this.f40045x = aVar;
            this.f40046y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f40044w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.p.class), this.f40045x, this.f40046y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f40047w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40047w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f40047w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40048w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f40048w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f40048w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40049w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40050x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40051y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f40052z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f40049w = aVar;
            this.f40050x = aVar2;
            this.f40051y = aVar3;
            this.f40052z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f40049w;
            vq.a aVar2 = this.f40050x;
            io.a aVar3 = this.f40051y;
            xq.a aVar4 = this.f40052z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(i1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f40053w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f40053w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f40053w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public m() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        f fVar = new f(this);
        xq.a a10 = gq.a.a(this);
        g gVar = new g(fVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(i1.class), new i(gVar), new h(fVar, null, null, a10));
        this.Q0 = wn.g.b(iVar, new e(this, null, null));
        this.R0 = wn.g.a(b.f40039w);
    }

    public static final void S3(m mVar, MRError mRError) {
        jo.p.h(mVar, "this$0");
        if (mRError == null) {
            return;
        }
        of.n.f45411a.l(mVar.q0(), mRError);
    }

    public static final void T3(m mVar, wn.v vVar) {
        jo.p.h(mVar, "this$0");
        if (vVar == null) {
            return;
        }
        of.n.z(mVar.q0());
    }

    public static final void U3(m mVar, Boolean bool) {
        jo.p.h(mVar, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            b.a aVar = ie.b.P0;
            String U02 = mVar.U0(nc.i.text_dialog_pass_code_locked);
            jo.p.g(U02, "getString(R.string.text_dialog_pass_code_locked)");
            aVar.a(U02, mVar.U0(nc.i.f41885p2), mVar.U0(nc.i.E4)).z3(mVar.O2(), "locked");
            mVar.m3();
        }
    }

    public static final void V3(m mVar, String str) {
        jo.p.h(mVar, "this$0");
        if (str == null) {
            return;
        }
        androidx.lifecycle.e0<Boolean> h10 = mVar.O3().h();
        boolean z10 = true;
        if (!(str.length() > 0) || str.length() != 4) {
            z10 = false;
        }
        h10.p(Boolean.valueOf(z10));
    }

    public static final void W3(Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
    }

    public static final void X3(m mVar, wn.v vVar) {
        jo.p.h(mVar, "this$0");
        if (vVar == null) {
            return;
        }
        mVar.P3().q();
        mVar.N3().m();
        mVar.m3();
    }

    public static final void Y3(m mVar, MRError mRError) {
        jo.p.h(mVar, "this$0");
        if (mRError != null) {
            if (mRError instanceof MRError.Failure) {
                of.n.f45411a.B(mVar.q0(), ((MRError.Failure) mRError).getErrorMessage(), false);
            } else if (mRError instanceof MRError.Network) {
                of.n.z(mVar.q0());
            } else {
                if (mRError instanceof MRError.Banned ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.ForceUpdate) {
                    return;
                }
                boolean z10 = mRError instanceof MRError.Maintenance;
            }
        }
    }

    public static final void Z3(m mVar, String str) {
        jo.p.h(mVar, "this$0");
        jo.p.g(str, "it");
        if (str.length() == 0) {
            return;
        }
        mVar.M3().E.k();
        mVar.O3().f().p(str);
        mVar.O3().g().p(Integer.valueOf(c3.a.d(mVar.N2(), nc.b.f41798r)));
    }

    public static final void c4(m mVar, View view) {
        jo.p.h(mVar, "this$0");
        mVar.m3();
    }

    public static final void d4(m mVar, View view) {
        jo.p.h(mVar, "this$0");
        String f10 = mVar.Q3().s().f();
        if (f10 != null) {
            t P3 = mVar.P3();
            String string = mVar.M2().getString("EXTRA_TWITTER_ACCESS_TOKEN");
            jo.p.e(string);
            String string2 = mVar.M2().getString("EXTRA_TWITTER_SECRET_TOKEN");
            jo.p.e(string2);
            P3.m(Referer.SETTINGS, string, string2, mVar.M2().getBoolean("EXTRA_SHOW_URGE_USERS"), f10);
        }
    }

    public final s5 M3() {
        return (s5) this.N0.b(this, T0[0]);
    }

    public final od.p N3() {
        return (od.p) this.Q0.getValue();
    }

    public final l1 O3() {
        return (l1) this.R0.getValue();
    }

    public final t P3() {
        return (t) this.O0.getValue();
    }

    public final i1 Q3() {
        return (i1) this.P0.getValue();
    }

    public final void R3() {
        Q3().s().i(this, new androidx.lifecycle.f0() { // from class: ld.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.V3(m.this, (String) obj);
            }
        });
        Q3().z().i(this, l.f40037a);
        Q3().v().i(this, new androidx.lifecycle.f0() { // from class: ld.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.X3(m.this, (wn.v) obj);
            }
        });
        Q3().r().i(this, new androidx.lifecycle.f0() { // from class: ld.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.Y3(m.this, (MRError) obj);
            }
        });
        Q3().m().i(this, new androidx.lifecycle.f0() { // from class: ld.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.Z3(m.this, (String) obj);
            }
        });
        Q3().n().i(this, new androidx.lifecycle.f0() { // from class: ld.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.S3(m.this, (MRError) obj);
            }
        });
        Q3().l().i(this, new androidx.lifecycle.f0() { // from class: ld.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.T3(m.this, (wn.v) obj);
            }
        });
        Q3().t().i(this, new androidx.lifecycle.f0() { // from class: ld.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.U3(m.this, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        M3().E.m();
    }

    public final void a4(s5 s5Var) {
        this.N0.a(this, T0[0], s5Var);
    }

    public final void b4() {
        M3().B.setOnClickListener(new View.OnClickListener() { // from class: ld.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.c4(m.this, view);
            }
        });
        M3().D.setOnClickListener(new View.OnClickListener() { // from class: ld.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.d4(m.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.L, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        a4((s5) e10);
        M3().M(this);
        M3().T(O3());
        M3().E.setListener(new c());
        O3().f().p(U0(nc.i.text_pass_code_input_detail));
        O3().g().p(Integer.valueOf(c3.a.d(N2(), nc.b.C)));
        b4();
        R3();
        Dialog dialog = new Dialog(N2(), nc.j.f41904g);
        dialog.setContentView(M3().u());
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
