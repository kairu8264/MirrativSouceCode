package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import be.s;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.MRUrl;
import kq.a;
import p.d;

/* loaded from: classes2.dex */
public final class r extends e.g implements s.b {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0;
    public final wn.f P0;
    public boolean Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1 */
    public final wn.f f18064a1;

    /* renamed from: b1 */
    public final wn.f f18065b1;

    /* renamed from: d1 */
    public static final /* synthetic */ qo.h<Object>[] f18062d1 = {jo.f0.d(new jo.s(r.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogAppUserIdSettingBinding;", 0))};

    /* renamed from: c1 */
    public static final a f18061c1 = new a(null);

    /* renamed from: e1 */
    public static final int f18063e1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ r b(a aVar, String str, String str2, boolean z10, String str3, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, int i12, Object obj) {
            return aVar.a(str, str2, z10, str3, z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? nd.f1.text_view_game_id_add_app_title_v2 : i10, (i12 & 128) != 0 ? nd.f1.text_view_game_id_add_app_title_landscape_v2 : i11, (i12 & 256) != 0 ? true : z13, (i12 & 512) != 0 ? false : z14);
        }

        public final r a(String str, String str2, boolean z10, String str3, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "appUserIdLabel");
            jo.p.h(str3, "appUserId");
            r rVar = new r();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putString("EXTRA_APP_USER_ID_LABEL", str2);
            bundle.putString("EXTRA_APP_USER_ID", str3);
            bundle.putBoolean("EXTRA_IS_APP_USER_ID_HIDDEN", z10);
            bundle.putBoolean("EXTRA_IS_PUBLISHED_USER_ID", z11);
            bundle.putBoolean("EXTRA_SHOW_KEYBOARD", z12);
            bundle.putInt("EXTRA_TITLE_RESOURCE_ID", i10);
            bundle.putInt("EXTRA_LANDSCAPE_TITLE_RESOURCE_ID", i11);
            bundle.putBoolean("EXTRA_IS_VISIBLE_STREAMING_LABEL", z13);
            bundle.putBoolean("EXTRA_IS_VISIBLE_REGISTER_APP_USER_ID_NOTICE", z14);
            rVar.V2(bundle);
            return rVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = r.this.M2().getString("EXTRA_APP_USER_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return r.this.M2().getString("EXTRA_APP_USER_ID_LABEL");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(r.this.M2().getBoolean("EXTRA_IS_APP_USER_ID_HIDDEN"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(r.this.M2().getBoolean("EXTRA_IS_PUBLISHED_USER_ID"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(r.this.M2().getBoolean("EXTRA_IS_VISIBLE_REGISTER_APP_USER_ID_NOTICE"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(r.this.M2().getBoolean("EXTRA_IS_VISIBLE_STREAMING_LABEL"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(r.this.M2().getInt("EXTRA_LANDSCAPE_TITLE_RESOURCE_ID"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = r.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(1);
            r.this = r1;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String f10 = r.this.M3().f().f();
            if (f10 == null) {
                return;
            }
            String obj = r.this.N3().D.getText().toString();
            if (f10.length() > 0) {
                if (obj.length() > 0) {
                    dq.c.c().l(new ce.i(f10, obj, false));
                    of.j.f45405a.c(r.this.N2(), r.this.N3().u());
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements TextWatcher {
        public k() {
            r.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "s");
            r.this.M3().E().m(Boolean.valueOf(editable.toString().length() > 0));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<wn.v> {

        /* renamed from: w */
        public static final l f18076w = new l();

        public l() {
            super(0);
        }

        public final void a() {
            dq.c.c().l(ce.f.f19320a);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<wn.v> {

        /* renamed from: w */
        public static final m f18077w = new m();

        public m() {
            super(0);
        }

        public final void a() {
            dq.c.c().l(ce.h.f19322a);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<MRLogger> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f18078w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f18079x;

        /* renamed from: y */
        public final /* synthetic */ io.a f18080y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18078w = componentCallbacks;
            this.f18079x = aVar;
            this.f18080y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f18078w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f18079x, this.f18080y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<nd.i1> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f18081w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f18082x;

        /* renamed from: y */
        public final /* synthetic */ io.a f18083y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18081w = componentCallbacks;
            this.f18082x = aVar;
            this.f18083y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f18081w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f18082x, this.f18083y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<od.b> {

        /* renamed from: w */
        public final /* synthetic */ ComponentCallbacks f18084w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f18085x;

        /* renamed from: y */
        public final /* synthetic */ io.a f18086y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18084w = componentCallbacks;
            this.f18085x = aVar;
            this.f18086y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f18084w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f18085x, this.f18086y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kq.a> {

        /* renamed from: w */
        public final /* synthetic */ Fragment f18087w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Fragment fragment) {
            super(0);
            this.f18087w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f18087w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f18087w.L2());
        }
    }

    /* renamed from: be.r$r */
    /* loaded from: classes2.dex */
    public static final class C0124r extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w */
        public final /* synthetic */ io.a f18088w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0124r(io.a aVar) {
            super(0);
            this.f18088w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18088w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<t0.b> {

        /* renamed from: w */
        public final /* synthetic */ io.a f18089w;

        /* renamed from: x */
        public final /* synthetic */ vq.a f18090x;

        /* renamed from: y */
        public final /* synthetic */ io.a f18091y;

        /* renamed from: z */
        public final /* synthetic */ xq.a f18092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18089w = aVar;
            this.f18090x = aVar2;
            this.f18091y = aVar3;
            this.f18092z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18089w;
            vq.a aVar2 = this.f18090x;
            io.a aVar3 = this.f18091y;
            xq.a aVar4 = this.f18092z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w */
        public final /* synthetic */ io.a f18093w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f18093w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18093w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u() {
            super(0);
            r.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(r.this.M2().getInt("EXTRA_TITLE_RESOURCE_ID"));
        }
    }

    public r() {
        q qVar = new q(this);
        xq.a a10 = gq.a.a(this);
        C0124r c0124r = new C0124r(qVar);
        this.O0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.j.class), new t(c0124r), new s(qVar, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new n(this, null, null));
        this.R0 = wn.g.b(iVar, new o(this, null, null));
        this.S0 = wn.g.b(iVar, new p(this, null, null));
        this.T0 = wn.g.a(new i());
        this.U0 = wn.g.a(new c());
        this.V0 = wn.g.a(new b());
        this.W0 = wn.g.a(new d());
        this.X0 = wn.g.a(new e());
        this.Y0 = wn.g.a(new u());
        this.Z0 = wn.g.a(new h());
        this.f18064a1 = wn.g.a(new g());
        this.f18065b1 = wn.g.a(new f());
    }

    public static final void Z3(r rVar, Boolean bool) {
        jo.p.h(rVar, "this$0");
        if (!bool.booleanValue() || jo.p.c(rVar.M3().F().f(), Boolean.TRUE)) {
            return;
        }
        rVar.N3().D.requestFocus();
        of.j.e(of.j.f45405a, rVar.N2(), rVar.N3().D, 0, 4, null);
    }

    public static final void a4(r rVar, Boolean bool) {
        jo.p.h(rVar, "this$0");
        if (jo.p.c(rVar.M3().C().f(), Boolean.FALSE)) {
            return;
        }
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            return;
        }
        rVar.N3().D.requestFocus();
        of.j.e(of.j.f45405a, rVar.N2(), rVar.N3().D, 0, 4, null);
    }

    public static final void d4(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        rVar.m3();
    }

    public static final void e4(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        p.d a10 = new d.a().a();
        jo.p.g(a10, "builder.build()");
        a10.a(rVar.N2(), MRUrl.GameId.INSTANCE.getUriValue());
        MRLogger Q3 = rVar.Q3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_HELP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setTargetId(rVar.M3().f().f());
        builder.setPageId(rVar.R3());
        Q3.sendLog(builder.build());
    }

    public static final void f4(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        dq.c.c().l(ce.g.f19321a);
        rVar.n3();
    }

    public static final void g4(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        dq.c.c().l(ce.d.f19318a);
        rVar.n3();
    }

    public static final void h4(r rVar, View view) {
        jo.p.h(rVar, "this$0");
        dq.c.c().l(ce.e.f19319a);
        rVar.n3();
    }

    public final String K3() {
        return (String) this.V0.getValue();
    }

    public final String L3() {
        return (String) this.U0.getValue();
    }

    public final ud.j M3() {
        return (ud.j) this.O0.getValue();
    }

    public final ae.q0 N3() {
        return (ae.q0) this.N0.b(this, f18062d1[0]);
    }

    public final od.b O3() {
        return (od.b) this.S0.getValue();
    }

    public final int P3() {
        return ((Number) this.Z0.getValue()).intValue();
    }

    public final MRLogger Q3() {
        return (MRLogger) this.P0.getValue();
    }

    public final String R3() {
        return (String) this.T0.getValue();
    }

    public final nd.i1 S3() {
        return (nd.i1) this.R0.getValue();
    }

    public final boolean T3() {
        if (S3().a().c()) {
            if (V3()) {
                return true;
            }
            if (K3().length() == 0) {
                return false;
            }
            return !W3();
        }
        return false;
    }

    public final int U3() {
        return ((Number) this.Y0.getValue()).intValue();
    }

    public final boolean V3() {
        return ((Boolean) this.W0.getValue()).booleanValue();
    }

    public final boolean W3() {
        return ((Boolean) this.X0.getValue()).booleanValue();
    }

    public final boolean X3() {
        return ((Boolean) this.f18065b1.getValue()).booleanValue();
    }

    public final boolean Y3() {
        return ((Boolean) this.f18064a1.getValue()).booleanValue();
    }

    @Override // be.s.b
    public void a(be.s sVar) {
        jo.p.h(sVar, "dialog");
        if (T3()) {
            O3().V();
            this.Q0 = true;
        }
        N3().u().setVisibility(0);
    }

    public final void b4(ae.q0 q0Var) {
        this.N0.a(this, f18062d1[0], q0Var);
    }

    public final void c4(boolean z10) {
        int b10;
        if (O0().getConfiguration().orientation == 2) {
            b10 = de.e.b(this, 470);
            M3().x().p(Integer.valueOf(P3()));
        } else {
            b10 = de.e.b(this, 280);
            M3().x().p(Integer.valueOf(U3()));
        }
        ud.j M3 = M3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        M3.R(N2, L3(), K3().length() == 0 ? true : W3());
        ud.j M32 = M3();
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        M32.S(N22, L3(), V3());
        M3().P().p(Boolean.valueOf(Y3()));
        M3().L().p(Boolean.valueOf(X3()));
        M3().G().p(Boolean.valueOf(W3()));
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_app_user_id_setting, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        b4((ae.q0) e10);
        N3().T(M3());
        N3().M(this);
        N3().E.setOnClickListener(new View.OnClickListener() { // from class: be.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.d4(r.this, view);
            }
        });
        N3().L.setOnClickListener(new View.OnClickListener() { // from class: be.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.e4(r.this, view);
            }
        });
        AppCompatTextView appCompatTextView = N3().T;
        jo.p.g(appCompatTextView, "binding.registerAppUserIdTextView");
        yd.g1.a(appCompatTextView, new j());
        N3().D.addTextChangedListener(new k());
        N3().K.setOnClickListener(new View.OnClickListener() { // from class: be.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.f4(r.this, view);
            }
        });
        N3().G.setOnClickListener(new View.OnClickListener() { // from class: be.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.g4(r.this, view);
            }
        });
        N3().H.setOnClickListener(new View.OnClickListener() { // from class: be.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.h4(r.this, view);
            }
        });
        N3().U.setClickedCopyAppUserIdButtonListener(l.f18076w);
        N3().M.setClickedJoinMultiButtonListener(m.f18077w);
        Dialog p32 = p3();
        if (p32 != null) {
            p32.setContentView(N3().u());
            if (z10) {
                N3().u().setVisibility(8);
            }
            Window window = p32.getWindow();
            if (window != null) {
                window.setLayout(b10, -2);
            }
        }
    }

    @Override // be.s.b
    public void h(be.s sVar) {
        jo.p.h(sVar, "dialog");
        n3();
    }

    @Override // androidx.fragment.app.e
    public void m3() {
        of.j.f45405a.c(N2(), N3().D);
        super.m3();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        c4(false);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (T3() && this.Q0) {
            O3().J();
        }
    }

    @Override // e.g, androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        super.t1(bundle);
        if (T3()) {
            s.a aVar = be.s.Q0;
            String L3 = L3();
            if (L3 == null) {
                L3 = "";
            }
            be.s a10 = aVar.a(L3);
            a10.D3(this);
            a10.z3(I0(), "AppUserIdWarningDialog");
        }
        c4(T3());
        if (M2().getBoolean("EXTRA_SHOW_KEYBOARD")) {
            M3().C().i(this, new androidx.lifecycle.f0() { // from class: be.p
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    r.Z3(r.this, (Boolean) obj);
                }
            });
            M3().F().i(this, new androidx.lifecycle.f0() { // from class: be.q
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    r.a4(r.this, (Boolean) obj);
                }
            });
        }
    }
}
