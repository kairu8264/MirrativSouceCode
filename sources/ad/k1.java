package ad;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.user.mypage.contract.WebViewWithToolbarActivity;
import ha.a;
import kotlin.KotlinNothingValueException;
import kq.a;

/* loaded from: classes2.dex */
public final class k1 extends Fragment implements uo.q0 {
    public static final a C0 = new a(null);
    public static final int D0 = 8;
    public final wn.f A0;
    public final wn.f B0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f1153x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f1154y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f1155z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k1 a() {
            return new k1();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1156a;

        static {
            int[] iArr = new int[b1.values().length];
            iArr[b1.ENABLED_CONTRACT_START.ordinal()] = 1;
            iArr[b1.REQUIRED_REGISTER_IDENTIFICATION.ordinal()] = 2;
            iArr[b1.REQUIRED_CONFIRM_IDENTIFICATION_DOCUMENT.ordinal()] = 3;
            iArr[b1.REQUIRED_REGISTER_BANK_ACCOUNT.ordinal()] = 4;
            f1156a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ bd.c f1158x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(bd.c cVar) {
            super(1);
            this.f1158x = cVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k1 k1Var = k1.this;
            WebViewWithToolbarActivity.a aVar = WebViewWithToolbarActivity.R;
            Context N2 = k1Var.N2();
            jo.p.g(N2, "requireContext()");
            String U0 = k1.this.U0(nc.i.text_contract_how_to_page_title);
            jo.p.g(U0, "getString(R.string.text_…ntract_how_to_page_title)");
            k1Var.f3(aVar.a(N2, U0, this.f1158x.k()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public static final void c(DialogInterface dialogInterface, int i10) {
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            if (!k1.this.y3().a().d()) {
                k1.this.G3();
            } else {
                new a.C0045a(k1.this.N2(), nc.j.f41902e).f(nc.i.text_contract_edit_when_on_live_alert).setPositiveButton(nc.i.E4, l1.f1193w).create().show();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            b(view);
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
            k1.this.L2().finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            k1.this.v3().c("");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractDetailFragment$observeStoreValues$4", f = "ContractDetailFragment.kt", l = {174}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1162w;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.ContractDetailFragment$observeStoreValues$4$1", f = "ContractDetailFragment.kt", l = {175}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1164w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k1 f1165x;

            /* renamed from: ad.k1$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0026a implements xo.d<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ k1 f1166w;

                public C0026a(k1 k1Var) {
                    this.f1166w = k1Var;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                    this.f1166w.G3();
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k1 k1Var, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f1165x = k1Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f1165x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1164w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<wn.v> u10 = this.f1165x.x3().u();
                    C0026a c0026a = new C0026a(this.f1165x);
                    this.f1164w = 1;
                    if (u10.a(c0026a, this) == c10) {
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

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1162w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.o g10 = k1.this.a1().g();
                jo.p.g(g10, "viewLifecycleOwner.lifecycle");
                o.c cVar = o.c.STARTED;
                a aVar = new a(k1.this, null);
                this.f1162w = 1;
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
    public static final class h extends androidx.activity.e {
        public h() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            k1.this.L2().finish();
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<w0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1168w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1169x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1168w = componentCallbacks;
            this.f1169x = aVar;
            this.f1170y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ad.w0, java.lang.Object] */
        @Override // io.a
        public final w0 invoke() {
            ComponentCallbacks componentCallbacks = this.f1168w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(w0.class), this.f1169x, this.f1170y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f1171w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1172x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f1171w = componentCallbacks;
            this.f1172x = aVar;
            this.f1173y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f1171w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f1172x, this.f1173y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1174w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f1174w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f1174w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f1174w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1175w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f1175w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1175w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1176w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1177x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1178y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1179z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1176w = aVar;
            this.f1177x = aVar2;
            this.f1178y = aVar3;
            this.f1179z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1176w;
            vq.a aVar2 = this.f1177x;
            io.a aVar3 = this.f1178y;
            xq.a aVar4 = this.f1179z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(y1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1180w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f1180w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1180w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f1181w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f1181w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f1181w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1182w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f1182w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f1182w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1183w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f1184x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f1185y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f1186z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f1183w = aVar;
            this.f1184x = aVar2;
            this.f1185y = aVar3;
            this.f1186z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f1183w;
            vq.a aVar2 = this.f1184x;
            io.a aVar3 = this.f1185y;
            xq.a aVar4 = this.f1186z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ld.i1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f1187w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f1187w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f1187w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public k1() {
        super(nc.f.activity_contract_detail);
        this.f1153x0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f1154y0 = wn.g.b(iVar, new i(this, null, null));
        k kVar = new k(this);
        xq.a a10 = gq.a.a(this);
        l lVar = new l(kVar);
        this.f1155z0 = androidx.fragment.app.e0.a(this, jo.f0.b(y1.class), new n(lVar), new m(kVar, null, null, a10));
        o oVar = new o(this);
        xq.a a11 = gq.a.a(this);
        p pVar = new p(oVar);
        this.A0 = androidx.fragment.app.e0.a(this, jo.f0.b(ld.i1.class), new r(pVar), new q(oVar, null, null, a11));
        this.B0 = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void A3(pc.e eVar, k1 k1Var, bd.c cVar) {
        jo.p.h(eVar, "$binding");
        jo.p.h(k1Var, "this$0");
        Integer h10 = cVar.l().h();
        if (h10 != null) {
            eVar.f46389c0.setImageDrawable(c3.a.f(k1Var.N2(), h10.intValue()));
        }
        AppCompatImageView appCompatImageView = eVar.B;
        jo.p.g(appCompatImageView, "bannerBackground");
        td.a.f(appCompatImageView, cVar.m());
        eVar.f46390d0.setText(k1Var.N2().getString(nc.i.text_contract_your_rank, k1Var.N2().getString(cVar.l().w())));
        eVar.f46390d0.setTextColor(c3.a.d(k1Var.N2(), cVar.l().c()));
        AppCompatTextView appCompatTextView = eVar.f46398l0;
        Context N2 = k1Var.N2();
        int i10 = nc.i.text_contract_period_covered;
        Context N22 = k1Var.N2();
        jo.p.g(N22, "requireContext()");
        Context N23 = k1Var.N2();
        jo.p.g(N23, "requireContext()");
        appCompatTextView.setText(N2.getString(i10, cVar.o(N22), cVar.n(N23)));
        eVar.O.setText(k1Var.V0(nc.i.text_monthly_rank_member_passbook_choose_contract_message4, String.valueOf(cVar.i())));
        eVar.T.setText(k1Var.V0(nc.i.text_monthly_rank_member_passbook_choose_not_contract_message4, String.valueOf(cVar.j())));
        AppCompatTextView appCompatTextView2 = eVar.f46399m0;
        Context N24 = k1Var.N2();
        jo.p.g(N24, "requireContext()");
        appCompatTextView2.setText(cVar.r(N24));
        AppCompatTextView appCompatTextView3 = eVar.G;
        Context N25 = k1Var.N2();
        jo.p.g(N25, "requireContext()");
        appCompatTextView3.setText(cVar.b(N25));
        AppCompatTextView appCompatTextView4 = eVar.I;
        Context N26 = k1Var.N2();
        jo.p.g(N26, "requireContext()");
        appCompatTextView4.setText(cVar.c(N26));
        AppCompatTextView appCompatTextView5 = eVar.C;
        Context N27 = k1Var.N2();
        int i11 = nc.i.text_monthly_rank_member_passbook_contract_period;
        Context N28 = k1Var.N2();
        jo.p.g(N28, "requireContext()");
        Context N29 = k1Var.N2();
        jo.p.g(N29, "requireContext()");
        appCompatTextView5.setText(N27.getString(i11, cVar.f(N28), cVar.e(N29)));
        AppCompatTextView appCompatTextView6 = eVar.W;
        Context N210 = k1Var.N2();
        int i12 = nc.i.text_contract_period_text;
        Context N211 = k1Var.N2();
        jo.p.g(N211, "requireContext()");
        Context N212 = k1Var.N2();
        jo.p.g(N212, "requireContext()");
        appCompatTextView6.setText(N210.getString(i12, cVar.g(N211), cVar.d(N212)));
        eVar.f46394h0.setText(k1Var.N2().getString(nc.i.text_contract_payment_period_text, cVar.q()));
        AppCompatTextView appCompatTextView7 = eVar.H;
        Context N213 = k1Var.N2();
        jo.p.g(N213, "requireContext()");
        appCompatTextView7.setText(cVar.a(N213));
        AppCompatButton appCompatButton = eVar.J;
        jo.p.g(appCompatButton, "checkButton");
        yd.g1.a(appCompatButton, new c(cVar));
        AppCompatButton appCompatButton2 = eVar.f46403q0;
        jo.p.g(appCompatButton2, "startButton");
        yd.g1.a(appCompatButton2, new d());
        AppCompatButton appCompatButton3 = eVar.f46392f0;
        jo.p.g(appCompatButton3, "notContractButton");
        yd.g1.a(appCompatButton3, new e());
    }

    public static final void B3(pc.e eVar, Boolean bool) {
        jo.p.h(eVar, "$binding");
        AppCompatButton appCompatButton = eVar.f46403q0;
        jo.p.g(bool, "it");
        appCompatButton.setVisibility(bool.booleanValue() ? 8 : 0);
        eVar.f46392f0.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public static final void C3(pc.e eVar, k1 k1Var, ha.a aVar) {
        jo.p.h(eVar, "$binding");
        jo.p.h(k1Var, "this$0");
        if (aVar instanceof a.b) {
            eVar.f46404r0.b(StatusView.b.C0181b.f20790w);
            NestedScrollView nestedScrollView = eVar.V;
            jo.p.g(nestedScrollView, "binding.contractContainer");
            nestedScrollView.setVisibility(8);
        } else if (aVar instanceof a.C0439a) {
            StatusView statusView = eVar.f46404r0;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = k1Var.U0(nc.i.f41875e);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new f()));
            NestedScrollView nestedScrollView2 = eVar.V;
            jo.p.g(nestedScrollView2, "binding.contractContainer");
            nestedScrollView2.setVisibility(8);
        } else {
            eVar.f46404r0.b(StatusView.b.c.f20791w);
            NestedScrollView nestedScrollView3 = eVar.V;
            jo.p.g(nestedScrollView3, "binding.contractContainer");
            nestedScrollView3.setVisibility(0);
        }
    }

    public static final boolean E3(k1 k1Var, MenuItem menuItem) {
        jo.p.h(k1Var, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            k1Var.L2().finish();
            return false;
        }
        return true;
    }

    public static final void F3(k1 k1Var, View view) {
        jo.p.h(k1Var, "this$0");
        k1Var.L2().finish();
    }

    public static final void H3(DialogInterface dialogInterface, int i10) {
    }

    public static final void I3(DialogInterface dialogInterface, int i10) {
    }

    public static final void J3(DialogInterface dialogInterface, int i10) {
    }

    public final void D3(pc.e eVar) {
        L2().c1().a(a1(), new h());
        Toolbar toolbar = eVar.f46406t0.B;
        toolbar.inflateMenu(nc.g.contract_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: ad.g1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean E3;
                E3 = k1.E3(k1.this, menuItem);
                return E3;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ad.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k1.F3(k1.this, view);
            }
        });
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R…ar_title) ?: return@apply");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(nc.i.text_contract_individual_contract_title));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void G3() {
        b1 f10 = w3().g().f();
        if (f10 != null) {
            int i10 = b.f1156a[f10.ordinal()];
            if (i10 == 1) {
                bd.c f11 = w3().f().f();
                if (f11 == null) {
                    return;
                }
                jo.p.g(f11, "contractStore.contractDe…Model.value ?: return@let");
                if (f11.p()) {
                    ld.r.S0.a().z3(p0(), "HandoverCodeDialog");
                } else {
                    I0().k().r(((FragmentContainerView) L2().findViewById(nc.e.fragment_container_view)).getId(), e2.C0.a()).g("ContractTermsFragment").i();
                }
            } else if (i10 == 2) {
                a.C0045a c0045a = new a.C0045a(N2(), nc.j.ContractAlertDialog);
                Integer c10 = f10.c();
                if (c10 != null) {
                    c0045a.f(c10.intValue()).setPositiveButton(nc.i.E4, d1.f974w).create().show();
                }
            } else if (i10 == 3) {
                a.C0045a c0045a2 = new a.C0045a(N2(), nc.j.ContractAlertDialog);
                Integer c11 = f10.c();
                if (c11 != null) {
                    c0045a2.f(c11.intValue()).setPositiveButton(nc.i.E4, e1.f979w).create().show();
                }
            } else if (i10 != 4) {
            } else {
                a.C0045a c0045a3 = new a.C0045a(N2(), nc.j.ContractAlertDialog);
                Integer c12 = f10.c();
                if (c12 != null) {
                    c0045a3.f(c12.intValue()).setPositiveButton(nc.i.E4, c1.f969w).create().show();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.e T = pc.e.T(view);
        jo.p.g(T, "binding");
        D3(T);
        z3(T);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f1153x0.getCoroutineContext();
    }

    public final w0 v3() {
        return (w0) this.f1154y0.getValue();
    }

    public final y1 w3() {
        return (y1) this.f1155z0.getValue();
    }

    public final ld.i1 x3() {
        return (ld.i1) this.A0.getValue();
    }

    public final nd.i1 y3() {
        return (nd.i1) this.B0.getValue();
    }

    public final void z3(final pc.e eVar) {
        w3().f().i(a1(), new androidx.lifecycle.f0() { // from class: ad.j1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k1.A3(pc.e.this, this, (bd.c) obj);
            }
        });
        w3().k().i(a1(), new androidx.lifecycle.f0() { // from class: ad.h1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k1.B3(pc.e.this, (Boolean) obj);
            }
        });
        w3().h().i(a1(), new androidx.lifecycle.f0() { // from class: ad.i1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k1.C3(pc.e.this, this, (ha.a) obj);
            }
        });
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new g(null), 3, null);
    }
}
