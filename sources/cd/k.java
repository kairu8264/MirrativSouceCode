package cd;

import ad.r0;
import ad.s0;
import ad.t0;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import bd.a;
import cd.a0;
import cd.k;
import com.dena.mirrativ.mirrativapi.user.ContractBank;
import com.dena.mirrativ.user.mypage.contract.BankSelectActivity;
import com.dena.mirrativ.user.mypage.contract.edit_identificatoin.JapanPostalBankCaptionActivity;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.Serializable;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import pc.s1;
import uo.q0;
import yd.g1;

/* loaded from: classes2.dex */
public final class k extends Fragment implements t0 {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public final FragmentRunner A0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f19218x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f19219y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f19220z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(r0 r0Var, c0 c0Var) {
            jo.p.h(r0Var, "confirmViewBindModel");
            jo.p.h(c0Var, "editType");
            k kVar = new k();
            kVar.V2(k3.b.a(wn.q.a("EXTRA_BIND_MODEL", r0Var), wn.q.a("EXTRA_EDIT_BANK_ACCOUNT_TYPE", c0Var)));
            return kVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<a0> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final a0 invoke() {
            a0.a aVar = a0.f19160g;
            Parcelable parcelable = k.this.M2().getParcelable("EXTRA_BIND_MODEL");
            if (parcelable != null) {
                Serializable serializable = k.this.M2().getSerializable("EXTRA_EDIT_BANK_ACCOUNT_TYPE");
                jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.edit_identificatoin.EditIdentificationType");
                Resources O0 = k.this.O0();
                jo.p.g(O0, "resources");
                return aVar.a((r0) parcelable, (c0) serializable, O0);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k kVar = k.this;
            JapanPostalBankCaptionActivity.a aVar = JapanPostalBankCaptionActivity.O;
            Context N2 = kVar.N2();
            jo.p.g(N2, "requireContext()");
            kVar.f3(aVar.a(N2));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountFragment$observeValues$4", f = "ContractEditBankAccountFragment.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19223w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k f19225w;

            /* renamed from: cd.k$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0146a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ k f19226w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0146a(k kVar) {
                    super(0);
                    this.f19226w = kVar;
                }

                public static final void c(k kVar, DialogInterface dialogInterface, int i10) {
                    jo.p.h(kVar, "this$0");
                    kVar.L2().finish();
                }

                public final void b() {
                    this.f19226w.L2().setResult(-1, new Intent().putExtra("RESULT_EDIT_BANK_ACCOUNT_KYC_INFO", this.f19226w.v3().h().f()));
                    a.C0045a b10 = new a.C0045a(this.f19226w.N2(), nc.j.ContractAlertDialog).f(nc.i.text_contract_edit_bank_account_finish).b(false);
                    int i10 = nc.i.E4;
                    final k kVar = this.f19226w;
                    b10.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: cd.l
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            k.d.a.C0146a.c(k.this, dialogInterface, i11);
                        }
                    }).create().show();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    b();
                    return wn.v.f59242a;
                }
            }

            public a(k kVar) {
                this.f19225w = kVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f19225w.A0.c(new C0146a(this.f19225w));
                return wn.v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f19223w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> i11 = k.this.v3().i();
                a aVar = new a(k.this);
                this.f19223w = 1;
                if (i11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountFragment$observeValues$5", f = "ContractEditBankAccountFragment.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19227w;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditBankAccountFragment$observeValues$5$1", f = "ContractEditBankAccountFragment.kt", l = {151}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f19229w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k f19230x;

            /* renamed from: cd.k$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0147a implements xo.d<String> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ k f19231w;

                public C0147a(k kVar) {
                    this.f19231w = kVar;
                }

                public static final void g(DialogInterface dialogInterface, int i10) {
                }

                @Override // xo.d
                /* renamed from: d */
                public final Object emit(String str, ao.d<? super wn.v> dVar) {
                    new a.C0045a(this.f19231w.N2(), nc.j.ContractAlertDialog).g(str).setPositiveButton(nc.i.E4, cd.m.f19249w).create().show();
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f19230x = kVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f19230x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f19229w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<String> k10 = this.f19230x.v3().k();
                    C0147a c0147a = new C0147a(this.f19230x);
                    this.f19229w = 1;
                    if (k10.a(c0147a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f19227w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.o g10 = k.this.a1().g();
                jo.p.g(g10, "viewLifecycleOwner.lifecycle");
                o.c cVar = o.c.STARTED;
                a aVar = new a(k.this, null);
                this.f19227w = 1;
                if (RepeatOnLifecycleKt.a(g10, cVar, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends androidx.activity.e {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k f19233w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(0);
                this.f19233w = kVar;
            }

            public final void a() {
                if (this.f19233w.I0().k0() == 1) {
                    this.f19233w.L2().finish();
                } else {
                    this.f19233w.I0().R0();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public f() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            k kVar = k.this;
            kVar.C3(new a(kVar));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ha.a f10 = k.this.v3().l().f();
            boolean z10 = true;
            if (f10 == null || !f10.a()) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            s0.U0.a(null, r0.B.a(k.this.u3().b(), k.this.u3().d().c()), k.this.u3().c()).z3(k.this.p0(), "ConfirmContractEditIdentificationDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.c<Intent> f19235w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k f19236x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.activity.result.c<Intent> cVar, k kVar) {
            super(1);
            this.f19235w = cVar;
            this.f19236x = kVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            androidx.activity.result.c<Intent> cVar = this.f19235w;
            BankSelectActivity.a aVar = BankSelectActivity.P;
            Context N2 = this.f19236x.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            if (k.this.I0().k0() == 1) {
                k.this.L2().finish();
            } else {
                k.this.I0().R0();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<cd.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19238w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19239x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19238w = componentCallbacks;
            this.f19239x = aVar;
            this.f19240y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, cd.a] */
        @Override // io.a
        public final cd.a invoke() {
            ComponentCallbacks componentCallbacks = this.f19238w;
            return gq.a.a(componentCallbacks).c(f0.b(cd.a.class), this.f19239x, this.f19240y);
        }
    }

    /* renamed from: cd.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0148k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f19241w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0148k(Fragment fragment) {
            super(0);
            this.f19241w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f19241w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19242w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f19242w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f19242w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19243w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19244x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19245y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f19246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f19243w = aVar;
            this.f19244x = aVar2;
            this.f19245y = aVar3;
            this.f19246z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f19243w;
            vq.a aVar2 = this.f19244x;
            io.a aVar3 = this.f19245y;
            xq.a aVar4 = this.f19246z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(cd.n.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19247w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f19247w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f19247w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public k() {
        super(nc.f.fragment_contract_edit_bank_account);
        this.f19218x0 = wn.g.a(new b());
        this.f19219y0 = wn.g.b(wn.i.SYNCHRONIZED, new j(this, null, null));
        C0148k c0148k = new C0148k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(c0148k);
        this.f19220z0 = e0.a(this, f0.b(cd.n.class), new n(lVar), new m(c0148k, null, null, a10));
        this.A0 = new FragmentRunner(this);
    }

    public static final void B3(k kVar, View view) {
        jo.p.h(kVar, "this$0");
        kVar.C3(new i());
    }

    public static final void D3(io.a aVar, DialogInterface dialogInterface, int i10) {
        jo.p.h(aVar, "$onClickButton");
        aVar.invoke();
    }

    public static final void E3(DialogInterface dialogInterface, int i10) {
    }

    public static final void x3(s1 s1Var, Boolean bool) {
        jo.p.h(s1Var, "$binding");
        AppCompatButton appCompatButton = s1Var.D;
        jo.p.g(bool, "it");
        appCompatButton.setEnabled(bool.booleanValue());
    }

    public static final void y3(s1 s1Var, k kVar, Integer num) {
        jo.p.h(s1Var, "$binding");
        jo.p.h(kVar, "this$0");
        AppCompatButton appCompatButton = s1Var.D;
        Context N2 = kVar.N2();
        jo.p.g(num, "it");
        appCompatButton.setBackground(c3.a.f(N2, num.intValue()));
    }

    public static final void z3(k kVar, androidx.activity.result.a aVar) {
        ContractBank c10;
        ContractBank c11;
        jo.p.h(kVar, "this$0");
        if (aVar.b() == -1) {
            Intent a10 = aVar.a();
            String str = null;
            a.C0113a c0113a = a10 != null ? (a.C0113a) a10.getParcelableExtra("KEY_SELECTED_BANK") : null;
            kVar.u3().b().d().p((c0113a == null || (c11 = c0113a.c()) == null) ? null : c11.getBankName());
            androidx.lifecycle.e0<String> c12 = kVar.u3().b().c();
            if (c0113a != null && (c10 = c0113a.c()) != null) {
                str = c10.getBankId();
            }
            c12.p(str);
        }
    }

    public final void A3(s1 s1Var) {
        Toolbar toolbar = s1Var.G.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: cd.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.B3(k.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(u3().e());
    }

    public final void C3(final io.a<wn.v> aVar) {
        if (u3().g()) {
            new a.C0045a(N2(), nc.j.ContractAlertDialog).f(nc.i.text_contract_close_alert_body).setPositiveButton(nc.i.text_contract_close_alert_body_ok, new DialogInterface.OnClickListener() { // from class: cd.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    k.D3(io.a.this, dialogInterface, i10);
                }
            }).setNegativeButton(nc.i.B, cd.f.f19212w).create().show();
        } else {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        s1 T = s1.T(view);
        L2().c1().a(a1(), new f());
        T.M(a1());
        T.E.T(u3().b());
        T.E.U.B.setVisibility(8);
        T.C.C.setText(u3().e());
        T.C.B.setText(U0(nc.i.text_edit_bank_account_caption));
        AppCompatButton appCompatButton = T.D;
        jo.p.g(appCompatButton, "binding.confirmButton");
        g1.a(appCompatButton, new g());
        androidx.activity.result.c I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: cd.h
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                k.z3(k.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…d\n            }\n        }");
        FrameLayout frameLayout = T.E.R;
        jo.p.g(frameLayout, "binding.editBankAccountC…r.bankNameSelectContainer");
        g1.a(frameLayout, new h(I2, this));
        jo.p.g(T, "binding");
        w3(T);
        A3(T);
    }

    @Override // ad.t0
    public void m(ad.u0 u0Var, r0 r0Var) {
        cd.a t32 = t3();
        if (r0Var == null) {
            return;
        }
        t32.a(r0Var);
    }

    public final cd.a t3() {
        return (cd.a) this.f19219y0.getValue();
    }

    public final a0 u3() {
        return (a0) this.f19218x0.getValue();
    }

    public final cd.n v3() {
        return (cd.n) this.f19220z0.getValue();
    }

    public final void w3(final s1 s1Var) {
        u3().f().i(a1(), new androidx.lifecycle.f0() { // from class: cd.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.x3(s1.this, (Boolean) obj);
            }
        });
        u3().a().i(a1(), new androidx.lifecycle.f0() { // from class: cd.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.y3(s1.this, this, (Integer) obj);
            }
        });
        s1Var.E.H.setText(u3().d().c());
        AppCompatTextView appCompatTextView = s1Var.E.Y;
        jo.p.g(appCompatTextView, "binding.editBankAccountC…er.japanPostalBankCaption");
        g1.a(appCompatTextView, new c());
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new d(null), 3, null);
        androidx.lifecycle.u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a13), null, null, new e(null), 3, null);
    }
}
