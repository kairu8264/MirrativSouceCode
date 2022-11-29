package ab;

import ab.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.MRUrl;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.List;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import l0.c2;
import l0.s0;
import uo.q0;
import uo.r0;
import yd.t1;

/* loaded from: classes2.dex */
public final class e extends androidx.fragment.app.e implements q0 {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public s O0;
    public ab.a P0;
    public vb.i R0;
    public final /* synthetic */ q0 N0 = r0.b();
    public final wn.f Q0 = wn.g.a(new n());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(String str) {
            jo.p.h(str, "referer");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            eVar.V2(bundle);
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f749w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f749w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f749w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f750w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f750w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f750w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f751w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f752x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f753y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f754z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f751w = aVar;
            this.f752x = aVar2;
            this.f753y = aVar3;
            this.f754z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f751w;
            vq.a aVar2 = this.f752x;
            io.a aVar3 = this.f753y;
            xq.a aVar4 = this.f754z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(s.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* renamed from: ab.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0017e extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f755w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0017e(io.a aVar) {
            super(0);
            this.f755w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f755w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<uq.a> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ BillingClient f757x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BillingClient billingClient) {
            super(0);
            this.f757x = billingClient;
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(e.this.q0(), e.this.G3(), this.f757x);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements BillingClientStateListener {
        public g() {
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            jo.p.h(billingResult, "billingResult");
            ab.a aVar = e.this.P0;
            if (aVar == null) {
                jo.p.v("actionCreator");
                aVar = null;
            }
            aVar.h();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f760w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(1);
                this.f760w = eVar;
            }

            public final void a(String str) {
                jo.p.h(str, "it");
                ab.a aVar = this.f760w.P0;
                s sVar = null;
                if (aVar == null) {
                    jo.p.v("actionCreator");
                    aVar = null;
                }
                androidx.fragment.app.h L2 = this.f760w.L2();
                jo.p.g(L2, "requireActivity()");
                s sVar2 = this.f760w.O0;
                if (sVar2 == null) {
                    jo.p.v("store");
                } else {
                    sVar = sVar2;
                }
                aVar.l(L2, sVar.s(), str);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(String str) {
                a(str);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f761w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar) {
                super(0);
                this.f761w = eVar;
            }

            public final void a() {
                this.f761w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f762w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e eVar) {
                super(0);
                this.f762w = eVar;
            }

            public final void a() {
                ab.a aVar = this.f762w.P0;
                if (aVar == null) {
                    jo.p.v("actionCreator");
                    aVar = null;
                }
                aVar.h();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f763w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(e eVar) {
                super(0);
                this.f763w = eVar;
            }

            public final void a() {
                e eVar = this.f763w;
                WebViewActivity.a aVar = WebViewActivity.X;
                Context N2 = eVar.N2();
                jo.p.g(N2, "requireContext()");
                eVar.f3(WebViewActivity.a.b(aVar, N2, MRUrl.CoinPurchaseNotice.INSTANCE.getUrl(), false, false, 12, null));
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: ab.e$h$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0018e extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f764w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0018e(e eVar) {
                super(0);
                this.f764w = eVar;
            }

            public final void a() {
                ab.a aVar = this.f764w.P0;
                s sVar = null;
                if (aVar == null) {
                    jo.p.v("actionCreator");
                    aVar = null;
                }
                s sVar2 = this.f764w.O0;
                if (sVar2 == null) {
                    jo.p.v("store");
                } else {
                    sVar = sVar2;
                }
                aVar.k(sVar.s(), false);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public h() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) != 2 || !iVar.j()) {
                s sVar = e.this.O0;
                s sVar2 = null;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                s0<Integer> o10 = sVar.o();
                s sVar3 = e.this.O0;
                if (sVar3 == null) {
                    jo.p.v("store");
                    sVar3 = null;
                }
                c2<ha.a> t10 = sVar3.t();
                s sVar4 = e.this.O0;
                if (sVar4 == null) {
                    jo.p.v("store");
                    sVar4 = null;
                }
                ab.i value = sVar4.m().getValue();
                s sVar5 = e.this.O0;
                if (sVar5 == null) {
                    jo.p.v("store");
                } else {
                    sVar2 = sVar5;
                }
                t.a(o10, t10, value, sVar2.n(), new a(e.this), new b(e.this), new c(e.this), new d(e.this), new C0018e(e.this), iVar, 4096);
                return;
            }
            iVar.I();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseDialog$onViewCreated$1", f = "CoinPurchaseDialog.kt", l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f765w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<b.f> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f767w;

            public a(e eVar) {
                this.f767w = eVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(b.f fVar, ao.d<? super wn.v> dVar) {
                vb.i iVar = this.f767w.R0;
                if (iVar != null) {
                    iVar.x(fVar.a());
                }
                ab.a aVar = this.f767w.P0;
                if (aVar == null) {
                    jo.p.v("actionCreator");
                    aVar = null;
                }
                aVar.k(fVar.b(), true);
                return wn.v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f765w;
            if (i10 == 0) {
                wn.m.b(obj);
                s sVar = e.this.O0;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                xo.w<b.f> l10 = sVar.l();
                a aVar = new a(e.this);
                this.f765w = 1;
                if (l10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseDialog$onViewCreated$2", f = "CoinPurchaseDialog.kt", l = {139}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f768w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f770w;

            public a(e eVar) {
                this.f770w = eVar;
            }

            public static final void g(DialogInterface dialogInterface, int i10) {
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f770w.N2());
                builder.setMessage(wa.j.text_pending_purchase);
                builder.setCancelable(true);
                builder.setPositiveButton(wa.j.f58558z, ab.f.f781w);
                builder.show();
                return wn.v.f59242a;
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f768w;
            if (i10 == 0) {
                wn.m.b(obj);
                s sVar = e.this.O0;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                xo.w<wn.v> p10 = sVar.p();
                a aVar = new a(e.this);
                this.f768w = 1;
                if (p10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseDialog$onViewCreated$3", f = "CoinPurchaseDialog.kt", l = {149}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f771w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f773w;

            public a(e eVar) {
                this.f773w = eVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                Context N2 = this.f773w.N2();
                jo.p.g(N2, "requireContext()");
                String U0 = this.f773w.U0(wa.j.text_gift_already_purchased);
                jo.p.g(U0, "getString(R.string.text_gift_already_purchased)");
                aVar.a(N2, U0);
                return wn.v.f59242a;
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f771w;
            if (i10 == 0) {
                wn.m.b(obj);
                s sVar = e.this.O0;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                xo.w<wn.v> r10 = sVar.r();
                a aVar = new a(e.this);
                this.f771w = 1;
                if (r10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseDialog$onViewCreated$4", f = "CoinPurchaseDialog.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f774w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f776w;

            public a(e eVar) {
                this.f776w = eVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                Context N2 = this.f776w.N2();
                jo.p.g(N2, "requireContext()");
                String U0 = this.f776w.U0(wa.j.text_notice_paid_no_restored);
                jo.p.g(U0, "getString(R.string.text_notice_paid_no_restored)");
                aVar.a(N2, U0);
                return wn.v.f59242a;
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f774w;
            if (i10 == 0) {
                wn.m.b(obj);
                s sVar = e.this.O0;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                xo.w<wn.v> q10 = sVar.q();
                a aVar = new a(e.this);
                this.f774w = 1;
                if (q10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.coin.CoinPurchaseDialog$onViewCreated$5", f = "CoinPurchaseDialog.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f777w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f779w;

            public a(e eVar) {
                this.f779w = eVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                vb.i iVar = this.f779w.R0;
                if (iVar != null) {
                    iVar.J1();
                }
                this.f779w.n3();
                return wn.v.f59242a;
            }
        }

        public m(ao.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f777w;
            if (i10 == 0) {
                wn.m.b(obj);
                s sVar = e.this.O0;
                if (sVar == null) {
                    jo.p.v("store");
                    sVar = null;
                }
                xo.w<MRError> k10 = sVar.k();
                a aVar = new a(e.this);
                this.f777w = 1;
                if (k10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<String> {
        public n() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = e.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    public static final void H3(e eVar, BillingResult billingResult, List list) {
        jo.p.h(eVar, "this$0");
        jo.p.h(billingResult, "billingResult");
        ab.a aVar = eVar.P0;
        s sVar = null;
        if (aVar == null) {
            jo.p.v("actionCreator");
            aVar = null;
        }
        s sVar2 = eVar.O0;
        if (sVar2 == null) {
            jo.p.v("store");
        } else {
            sVar = sVar2;
        }
        aVar.i(sVar.s(), billingResult, list);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        Context q02 = q0();
        jo.p.f(q02, "null cannot be cast to non-null type android.app.Activity");
        BillingClient build = BillingClient.newBuilder((Activity) q02).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: ab.d
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                e.H3(e.this, billingResult, list);
            }
        }).build();
        jo.p.g(build, "newBuilder(context as Ac…es)\n            }.build()");
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.O0 = (s) ((androidx.lifecycle.q0) e0.a(this, f0.b(s.class), new C0017e(cVar), new d(bVar, null, null, a10)).getValue());
        this.P0 = (ab.a) gq.a.a(this).c(f0.b(ab.a.class), null, new f(build));
        build.startConnection(new g());
    }

    public final String G3() {
        return (String) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        ab.a aVar = this.P0;
        if (aVar == null) {
            jo.p.v("actionCreator");
            aVar = null;
        }
        aVar.g();
        vb.i iVar = this.R0;
        if (iVar != null) {
            iVar.n1();
        }
        this.R0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: I3 */
    public ComposeView E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-1113881566, true, new h()));
        return composeView;
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
        ab.a aVar = this.P0;
        if (aVar == null) {
            jo.p.v("actionCreator");
            aVar = null;
        }
        aVar.j(O0().getConfiguration().orientation);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        ab.a aVar = this.P0;
        if (aVar == null) {
            jo.p.v("actionCreator");
            aVar = null;
        }
        aVar.j(configuration.orientation);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), wa.k.f58559a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        vb.i iVar = null;
        vb.i iVar2 = context instanceof vb.i ? (vb.i) context : null;
        if (iVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.i) {
                iVar = (vb.i) H0;
            }
        } else {
            iVar = iVar2;
        }
        this.R0 = iVar;
    }
}
