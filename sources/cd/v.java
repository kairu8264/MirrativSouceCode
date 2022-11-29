package cd;

import ad.r0;
import ad.s0;
import ad.t0;
import ad.u0;
import ad.z1;
import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.e0;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import cd.b0;
import cd.v;
import com.dena.mirrorman.util.FragmentRunner;
import java.io.Serializable;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import pc.u1;
import pc.y2;
import uo.q0;
import yd.g1;

/* loaded from: classes2.dex */
public final class v extends Fragment implements t0 {
    public static final a B0 = new a(null);
    public static final int C0 = 8;
    public final FragmentRunner A0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f19272x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f19273y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f19274z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(u0 u0Var, c0 c0Var) {
            jo.p.h(u0Var, "confirmViewBindModel");
            jo.p.h(c0Var, "editType");
            v vVar = new v();
            vVar.V2(k3.b.a(wn.q.a("EXTRA_BIND_MODEL", u0Var), wn.q.a("EXTRA_EDIT_IDENTIFICATION_TYPE", c0Var)));
            return vVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<b0> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final b0 invoke() {
            b0.a aVar = b0.f19176k;
            Resources O0 = v.this.O0();
            jo.p.g(O0, "resources");
            Parcelable parcelable = v.this.M2().getParcelable("EXTRA_BIND_MODEL");
            if (parcelable != null) {
                Serializable serializable = v.this.M2().getSerializable("EXTRA_EDIT_IDENTIFICATION_TYPE");
                jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.edit_identificatoin.EditIdentificationType");
                return aVar.a(O0, (u0) parcelable, (c0) serializable);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationFragment$observeValues$3", f = "ContractEditIdentificationFragment.kt", l = {148}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19276w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v f19278w;

            /* renamed from: cd.v$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0149a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ v f19279w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ String f19280x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0149a(v vVar, String str) {
                    super(0);
                    this.f19279w = vVar;
                    this.f19280x = str;
                }

                public static final void c(v vVar, String str, DialogInterface dialogInterface, int i10) {
                    jo.p.h(vVar, "this$0");
                    jo.p.h(str, "$url");
                    vVar.f3(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    androidx.fragment.app.z k10 = vVar.I0().k();
                    int id2 = ((FragmentContainerView) vVar.L2().findViewById(nc.e.fragment_container_view)).getId();
                    z1.a aVar = z1.f1426y0;
                    Serializable serializable = vVar.M2().getSerializable("EXTRA_EDIT_IDENTIFICATION_TYPE");
                    jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.edit_identificatoin.EditIdentificationType");
                    k10.r(id2, aVar.a(str, ((c0) serializable) == c0.EDIT)).g("ContractSubmitIdentificationDocumentFragment").i();
                }

                public final void b() {
                    a.C0045a f10 = new a.C0045a(this.f19279w.N2()).b(false).f(nc.i.text_contract_edit_identification_boot_web_dialog_body);
                    int i10 = nc.i.E4;
                    final v vVar = this.f19279w;
                    final String str = this.f19280x;
                    f10.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: cd.w
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            v.c.a.C0149a.c(v.this, str, dialogInterface, i11);
                        }
                    }).k();
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    b();
                    return wn.v.f59242a;
                }
            }

            public a(v vVar) {
                this.f19278w = vVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f19278w.A0.c(new C0149a(this.f19278w, str));
                return wn.v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f19276w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> h10 = v.this.u3().h();
                a aVar = new a(v.this);
                this.f19276w = 1;
                if (h10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationFragment$observeValues$4", f = "ContractEditIdentificationFragment.kt", l = {169}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f19281w;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.edit_identificatoin.ContractEditIdentificationFragment$observeValues$4$1", f = "ContractEditIdentificationFragment.kt", l = {170}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f19283w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ v f19284x;

            /* renamed from: cd.v$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0150a implements xo.d<String> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ v f19285w;

                public C0150a(v vVar) {
                    this.f19285w = vVar;
                }

                public static final void g(DialogInterface dialogInterface, int i10) {
                }

                @Override // xo.d
                /* renamed from: d */
                public final Object emit(String str, ao.d<? super wn.v> dVar) {
                    new a.C0045a(this.f19285w.N2()).g(str).setPositiveButton(nc.i.E4, x.f19303w).create().show();
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f19284x = vVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f19284x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f19283w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<String> k10 = this.f19284x.u3().k();
                    C0150a c0150a = new C0150a(this.f19284x);
                    this.f19283w = 1;
                    if (k10.a(c0150a, this) == c10) {
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
            int i10 = this.f19281w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.o g10 = v.this.a1().g();
                jo.p.g(g10, "viewLifecycleOwner.lifecycle");
                o.c cVar = o.c.STARTED;
                a aVar = new a(v.this, null);
                this.f19281w = 1;
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
    public static final class e extends androidx.activity.e {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ v f19287w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar) {
                super(0);
                this.f19287w = vVar;
            }

            public final void a() {
                if (this.f19287w.I0().k0() == 1) {
                    this.f19287w.L2().finish();
                } else {
                    this.f19287w.I0().R0();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public e() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            v vVar = v.this;
            vVar.B3(new a(vVar));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public static final void c(v vVar, DatePicker datePicker, int i10, int i11, int i12) {
            jo.p.h(vVar, "this$0");
            vVar.t3().b().o(i10, i11, i12);
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            Context N2 = v.this.N2();
            final v vVar = v.this;
            new DatePickerDialog(N2, new DatePickerDialog.OnDateSetListener() { // from class: cd.y
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                    v.f.c(v.this, datePicker, i10, i11, i12);
                }
            }, v.this.t3().b().d(), v.this.t3().b().a(), v.this.t3().b().c()).show();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            b(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ha.a f10 = v.this.u3().i().f();
            boolean z10 = true;
            if (f10 == null || !f10.a()) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            s0.U0.a(u0.D.a(v.this.t3().b()), null, v.this.t3().c()).z3(v.this.p0(), "ConfirmContractEditIdentificationDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<wn.v> {
        public h() {
            super(0);
        }

        public final void a() {
            if (v.this.I0().k0() == 1) {
                v.this.L2().finish();
            } else {
                v.this.I0().R0();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19291w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19292x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19293y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19291w = componentCallbacks;
            this.f19292x = aVar;
            this.f19293y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, cd.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f19291w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f19292x, this.f19293y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f19294w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f19294w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f19294w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19295w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar) {
            super(0);
            this.f19295w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f19295w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19296w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19297x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19298y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f19299z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f19296w = aVar;
            this.f19297x = aVar2;
            this.f19298y = aVar3;
            this.f19299z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f19296w;
            vq.a aVar2 = this.f19297x;
            io.a aVar3 = this.f19298y;
            xq.a aVar4 = this.f19299z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f19300w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f19300w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((v0) this.f19300w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public v() {
        super(nc.f.fragment_contract_edit_identification);
        this.f19272x0 = wn.g.a(new b());
        this.f19273y0 = wn.g.b(wn.i.SYNCHRONIZED, new i(this, null, null));
        j jVar = new j(this);
        xq.a a10 = gq.a.a(this);
        k kVar = new k(jVar);
        this.f19274z0 = e0.a(this, f0.b(z.class), new m(kVar), new l(jVar, null, null, a10));
        this.A0 = new FragmentRunner(this);
    }

    public static final void A3(v vVar, View view) {
        jo.p.h(vVar, "this$0");
        vVar.B3(new h());
    }

    public static final void C3(io.a aVar, DialogInterface dialogInterface, int i10) {
        jo.p.h(aVar, "$onClickButton");
        aVar.invoke();
    }

    public static final void D3(DialogInterface dialogInterface, int i10) {
    }

    public static final void w3(u1 u1Var, Boolean bool) {
        jo.p.h(u1Var, "$binding");
        AppCompatButton appCompatButton = u1Var.D;
        jo.p.g(bool, "it");
        appCompatButton.setEnabled(bool.booleanValue());
    }

    public static final void x3(u1 u1Var, v vVar, Integer num) {
        jo.p.h(u1Var, "$binding");
        jo.p.h(vVar, "this$0");
        AppCompatButton appCompatButton = u1Var.D;
        Context N2 = vVar.N2();
        jo.p.g(num, "it");
        appCompatButton.setBackground(c3.a.f(N2, num.intValue()));
    }

    public final void B3(final io.a<wn.v> aVar) {
        if (t3().g()) {
            new a.C0045a(N2()).f(nc.i.text_contract_close_alert_body).setPositiveButton(nc.i.text_contract_close_alert_body_ok, new DialogInterface.OnClickListener() { // from class: cd.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    v.C3(io.a.this, dialogInterface, i10);
                }
            }).setNegativeButton(nc.i.B, r.f19267w).create().show();
        } else {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String U0;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        u1 T = u1.T(view);
        L2().c1().a(a1(), new e());
        T.M(a1());
        T.E.T(t3().b());
        jo.p.g(T, "binding");
        y3(T);
        T.C.C.setText(t3().e());
        AppCompatTextView appCompatTextView = T.C.B;
        if (M2().getSerializable("EXTRA_EDIT_IDENTIFICATION_TYPE") == c0.EDIT) {
            U0 = U0(nc.i.text_contract_edit_identification_caption);
        } else {
            U0 = U0(nc.i.text_contract_register_identification_caption);
        }
        appCompatTextView.setText(U0);
        FrameLayout frameLayout = T.E.T;
        jo.p.g(frameLayout, "binding.editIdentificati…r.selectBirthdayContainer");
        g1.a(frameLayout, new f());
        T.E.S.B.setVisibility(8);
        AppCompatButton appCompatButton = T.D;
        jo.p.g(appCompatButton, "binding.confirmButton");
        g1.a(appCompatButton, new g());
        v3(T);
        z3(T);
    }

    @Override // ad.t0
    public void m(u0 u0Var, r0 r0Var) {
        o s32 = s3();
        if (u0Var == null) {
            return;
        }
        s32.a(u0Var);
    }

    public final o s3() {
        return (o) this.f19273y0.getValue();
    }

    public final b0 t3() {
        return (b0) this.f19272x0.getValue();
    }

    public final z u3() {
        return (z) this.f19274z0.getValue();
    }

    public final void v3(final u1 u1Var) {
        t3().f().i(a1(), new androidx.lifecycle.f0() { // from class: cd.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                v.w3(u1.this, (Boolean) obj);
            }
        });
        t3().a().i(a1(), new androidx.lifecycle.f0() { // from class: cd.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                v.x3(u1.this, this, (Integer) obj);
            }
        });
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new c(null), 3, null);
        androidx.lifecycle.u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a13), null, null, new d(null), 3, null);
    }

    public final void y3(u1 u1Var) {
        y2 y2Var = u1Var.H;
        AppCompatImageView appCompatImageView = y2Var.C;
        jo.p.g(appCompatImageView, "step1CheckBox");
        appCompatImageView.setVisibility(8);
        AppCompatImageView appCompatImageView2 = y2Var.D;
        jo.p.g(appCompatImageView2, "step1CheckBoxBackground");
        appCompatImageView2.setVisibility(8);
        y2Var.B.setBackgroundColor(c3.a.d(N2(), nc.b.emomo_message_gift_pose_tint));
        AppCompatTextView appCompatTextView = y2Var.H;
        Context N2 = N2();
        int i10 = nc.b.f41804x;
        appCompatTextView.setTextColor(c3.a.d(N2, i10));
        y2Var.G.setTextColor(c3.a.d(N2(), i10));
        y2Var.G.setTextSize(2, 14.0f);
        AppCompatImageView appCompatImageView3 = y2Var.Q;
        jo.p.g(appCompatImageView3, "triangleStep2");
        appCompatImageView3.setVisibility(8);
        AppCompatImageView appCompatImageView4 = y2Var.I;
        jo.p.g(appCompatImageView4, "step2CheckBox");
        appCompatImageView4.setVisibility(8);
        AppCompatImageView appCompatImageView5 = y2Var.J;
        jo.p.g(appCompatImageView5, "step2CheckBoxBackground");
        appCompatImageView5.setVisibility(8);
        AppCompatImageView appCompatImageView6 = y2Var.L;
        jo.p.g(appCompatImageView6, "step2SelectCircle");
        appCompatImageView6.setVisibility(8);
    }

    public final void z3(u1 u1Var) {
        Toolbar toolbar = u1Var.I.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: cd.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.A3(v.this, view);
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
        textView.setText(t3().e());
    }
}
