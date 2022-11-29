package com.dena.mirrativ.user.mypage.setting;

import ad.r0;
import ad.u0;
import ae.y;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import cd.c0;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrativ.mirrativapi.user.LatestRewardResponse;
import com.dena.mirrativ.user.mypage.FaqActivity;
import com.dena.mirrativ.user.mypage.contract.ContractActivity;
import com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusActivity;
import com.dena.mirrativ.user.mypage.setting.SettingRootActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.MRUrl;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import hf.v0;
import ie.f;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import ld.e1;
import ld.f1;
import ld.g1;
import ld.h1;
import ld.n0;
import ld.p0;
import nd.i1;
import nd.j1;
import uo.q0;
import wn.v;
import xo.w;

/* loaded from: classes2.dex */
public final class SettingRootActivity extends e.b implements f.b {

    /* renamed from: a0  reason: collision with root package name */
    public static final a f24843a0 = new a(null);

    /* renamed from: b0  reason: collision with root package name */
    public static final int f24844b0 = 8;
    public y O;
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            jo.p.h(context, "context");
            return new Intent(context, SettingRootActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            SettingRootActivity settingRootActivity = SettingRootActivity.this;
            settingRootActivity.startActivity(WebViewActivity.a.b(WebViewActivity.X, settingRootActivity, MRUrl.Guideline.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, v> {
        public c() {
            super(1);
        }

        public static final void c(DialogInterface dialogInterface, int i10) {
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            g1 f10 = SettingRootActivity.this.c4().j().f();
            if (f10 == null) {
                return;
            }
            if (f10.l() & (!f10.p())) {
                SettingRootActivity.this.K4();
            } else if (SettingRootActivity.this.d4().a().d()) {
                SettingRootActivity.this.I4();
            } else if (f10.j()) {
                SettingRootActivity.this.x4();
            } else {
                new a.C0045a(SettingRootActivity.this, nc.j.f41902e).setPositiveButton(nc.i.E4, e1.f39976w).f(nc.i.text_menu_open_cash_bonus_history_alert_message_register_identification).create().show();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            b(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g1 f10 = SettingRootActivity.this.c4().j().f();
            if (f10 == null) {
                return;
            }
            if (f10.l()) {
                SettingRootActivity.this.K4();
            } else if (SettingRootActivity.this.d4().a().d()) {
                SettingRootActivity.this.I4();
            } else {
                SettingRootActivity.this.B4();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, v> {
        public e() {
            super(1);
        }

        public static final void c(DialogInterface dialogInterface, int i10) {
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            g1 f10 = SettingRootActivity.this.c4().j().f();
            if (f10 == null) {
                return;
            }
            if (f10.l()) {
                SettingRootActivity.this.K4();
            } else if (SettingRootActivity.this.d4().a().d()) {
                SettingRootActivity.this.I4();
            } else if (f10.k()) {
                SettingRootActivity.this.A4();
            } else {
                new a.C0045a(SettingRootActivity.this, nc.j.f41902e).setPositiveButton(nc.i.E4, f1.f39980w).f(nc.i.text_menu_open_cash_bonus_history_alert_message_register_identification).create().show();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            b(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            SettingRootActivity.this.H4();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootActivity$observeStoreValues$4", f = "SettingRootActivity.kt", l = {125}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24850w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ SettingRootActivity f24852w;

            public a(SettingRootActivity settingRootActivity) {
                this.f24852w = settingRootActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                c0 g10;
                g1 f10 = this.f24852w.c4().j().f();
                if ((f10 != null ? f10.f() : null) == ub.a.SUBMISSION_IDENTIFICATION) {
                    SettingRootActivity settingRootActivity = this.f24852w;
                    ContractActivity.a aVar = ContractActivity.V;
                    String f11 = settingRootActivity.c4().m().f();
                    if (f11 == null) {
                        return v.f59242a;
                    }
                    settingRootActivity.startActivity(ContractActivity.a.e(aVar, settingRootActivity, f11, false, 4, null));
                    this.f24852w.b4().c();
                } else {
                    SettingRootActivity settingRootActivity2 = this.f24852w;
                    ContractActivity.a aVar2 = ContractActivity.V;
                    g1 f12 = settingRootActivity2.c4().j().f();
                    if (f12 != null && (g10 = f12.g()) != null) {
                        u0 f13 = this.f24852w.c4().l().f();
                        if (f13 == null) {
                            return v.f59242a;
                        }
                        settingRootActivity2.startActivity(aVar2.b(settingRootActivity2, g10, f13));
                        this.f24852w.b4().c();
                    } else {
                        return v.f59242a;
                    }
                }
                return v.f59242a;
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24850w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> o10 = SettingRootActivity.this.c4().o();
                a aVar = new a(SettingRootActivity.this);
                this.f24850w = 1;
                if (o10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootActivity$observeStoreValues$5", f = "SettingRootActivity.kt", l = {147}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24853w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ SettingRootActivity f24855w;

            public a(SettingRootActivity settingRootActivity) {
                this.f24855w = settingRootActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(v vVar, ao.d<? super v> dVar) {
                c0 d10;
                SettingRootActivity settingRootActivity = this.f24855w;
                ContractActivity.a aVar = ContractActivity.V;
                g1 f10 = settingRootActivity.c4().j().f();
                if (f10 != null && (d10 = f10.d()) != null) {
                    r0 f11 = this.f24855w.c4().k().f();
                    if (f11 == null) {
                        return v.f59242a;
                    }
                    settingRootActivity.startActivity(aVar.a(settingRootActivity, d10, f11));
                    this.f24855w.b4().b();
                    return v.f59242a;
                }
                return v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24853w;
            if (i10 == 0) {
                wn.m.b(obj);
                w<v> n10 = SettingRootActivity.this.c4().n();
                a aVar = new a(SettingRootActivity.this);
                this.f24853w = 1;
                if (n10.a(aVar, this) == c10) {
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
    public static final class i extends jo.q implements io.a<n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24856w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24857x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24856w = componentCallbacks;
            this.f24857x = aVar;
            this.f24858y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ld.n0, java.lang.Object] */
        @Override // io.a
        public final n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24856w;
            return gq.a.a(componentCallbacks).c(f0.b(n0.class), this.f24857x, this.f24858y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24859w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24860x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24861y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24859w = componentCallbacks;
            this.f24860x = aVar;
            this.f24861y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24859w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24860x, this.f24861y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24862w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24863x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24864y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24862w = componentCallbacks;
            this.f24863x = aVar;
            this.f24864y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24862w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24863x, this.f24864y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<j1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24865w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24866x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24867y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24865w = componentCallbacks;
            this.f24866x = aVar;
            this.f24867y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nd.j1, java.lang.Object] */
        @Override // io.a
        public final j1 invoke() {
            ComponentCallbacks componentCallbacks = this.f24865w;
            return gq.a.a(componentCallbacks).c(f0.b(j1.class), this.f24866x, this.f24867y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24868w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24869x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24870y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24868w = componentCallbacks;
            this.f24869x = aVar;
            this.f24870y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f24868w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f24869x, this.f24870y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<nf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24871w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24872x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24873y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24871w = componentCallbacks;
            this.f24872x = aVar;
            this.f24873y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.i, java.lang.Object] */
        @Override // io.a
        public final nf.i invoke() {
            ComponentCallbacks componentCallbacks = this.f24871w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.i.class), this.f24872x, this.f24873y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24874w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24875x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24876y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24874w = componentCallbacks;
            this.f24875x = aVar;
            this.f24876y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24874w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24875x, this.f24876y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<nf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24877w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24878x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24879y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24877w = componentCallbacks;
            this.f24878x = aVar;
            this.f24879y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.r] */
        @Override // io.a
        public final nf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f24877w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.r.class), this.f24878x, this.f24879y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<od.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24880w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24881x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24882y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24880w = componentCallbacks;
            this.f24881x = aVar;
            this.f24882y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final od.s invoke() {
            ComponentCallbacks componentCallbacks = this.f24880w;
            return gq.a.a(componentCallbacks).c(f0.b(od.s.class), this.f24881x, this.f24882y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24883w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24884x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24885y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24883w = componentCallbacks;
            this.f24884x = aVar;
            this.f24885y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f24883w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f24884x, this.f24885y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24886w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f24886w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24886w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24887w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24888x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24889y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24890z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24887w = aVar;
            this.f24888x = aVar2;
            this.f24889y = aVar3;
            this.f24890z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24887w;
            vq.a aVar2 = this.f24888x;
            io.a aVar3 = this.f24889y;
            xq.a aVar4 = this.f24890z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(h1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24891w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f24891w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f24891w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public SettingRootActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new j(this, null, null));
        this.Q = wn.g.b(iVar, new k(this, null, null));
        this.R = wn.g.b(iVar, new l(this, null, null));
        this.S = wn.g.b(iVar, new m(this, null, null));
        this.T = wn.g.b(iVar, new n(this, null, null));
        this.U = wn.g.b(iVar, new o(this, null, null));
        this.V = wn.g.b(iVar, new p(this, null, null));
        this.W = wn.g.b(iVar, new q(this, null, null));
        this.X = wn.g.b(iVar, new r(this, null, null));
        this.Y = wn.g.b(iVar, new i(this, null, null));
        this.Z = new s0(f0.b(h1.class), new u(this), new t(new s(this), null, null, gq.a.a(this)));
    }

    public static final void J4(DialogInterface dialogInterface, int i10) {
    }

    public static final void L4(DialogInterface dialogInterface, int i10) {
    }

    public static final void h4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.F4();
    }

    public static final void i4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.v4();
    }

    public static final void j4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.C4();
    }

    public static final void k4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.E4();
    }

    public static final void l4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.finish();
    }

    public static final void m4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.G4();
    }

    public static final void n4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.D4();
    }

    public static final void o4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.y4();
    }

    public static final void p4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.z4();
    }

    public static final void q4(SettingRootActivity settingRootActivity, View view) {
        jo.p.h(settingRootActivity, "this$0");
        settingRootActivity.w4();
    }

    public static final void s4(SettingRootActivity settingRootActivity, Boolean bool) {
        jo.p.h(settingRootActivity, "this$0");
        y yVar = settingRootActivity.O;
        if (yVar == null) {
            jo.p.v("binding");
            yVar = null;
        }
        AppCompatImageView appCompatImageView = yVar.Z;
        jo.p.g(appCompatImageView, "binding.monthlyRankingNewBadge");
        jo.p.g(bool, "it");
        appCompatImageView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void t4(SettingRootActivity settingRootActivity, ContractSummaryResponse contractSummaryResponse) {
        jo.p.h(settingRootActivity, "this$0");
        y yVar = settingRootActivity.O;
        y yVar2 = null;
        if (yVar == null) {
            jo.p.v("binding");
            yVar = null;
        }
        LinearLayout linearLayout = yVar.X;
        jo.p.g(linearLayout, "binding.monthlyRanking");
        linearLayout.setVisibility(contractSummaryResponse.isVisibleRanking() ? 0 : 8);
        y yVar3 = settingRootActivity.O;
        if (yVar3 == null) {
            jo.p.v("binding");
        } else {
            yVar2 = yVar3;
        }
        View view = yVar2.Y;
        jo.p.g(view, "binding.monthlyRankingDivider");
        view.setVisibility((contractSummaryResponse.isVisibleHistory() || contractSummaryResponse.isVisibleRanking()) ? 0 : 8);
    }

    public static final void u4(SettingRootActivity settingRootActivity, g1 g1Var) {
        jo.p.h(settingRootActivity, "this$0");
        Drawable f10 = c3.a.f(settingRootActivity, g1Var.h());
        Drawable f11 = c3.a.f(settingRootActivity, g1Var.c());
        y yVar = settingRootActivity.O;
        y yVar2 = null;
        if (yVar == null) {
            jo.p.v("binding");
            yVar = null;
        }
        yVar.P.setVisibility(0);
        y yVar3 = settingRootActivity.O;
        if (yVar3 == null) {
            jo.p.v("binding");
            yVar3 = null;
        }
        yVar3.Q.setVisibility(0);
        y yVar4 = settingRootActivity.O;
        if (yVar4 == null) {
            jo.p.v("binding");
            yVar4 = null;
        }
        yVar4.K.setVisibility(0);
        y yVar5 = settingRootActivity.O;
        if (yVar5 == null) {
            jo.p.v("binding");
            yVar5 = null;
        }
        yVar5.L.setVisibility(0);
        y yVar6 = settingRootActivity.O;
        if (yVar6 == null) {
            jo.p.v("binding");
            yVar6 = null;
        }
        yVar6.F.setVisibility(0);
        y yVar7 = settingRootActivity.O;
        if (yVar7 == null) {
            jo.p.v("binding");
            yVar7 = null;
        }
        yVar7.G.setVisibility(0);
        y yVar8 = settingRootActivity.O;
        if (yVar8 == null) {
            jo.p.v("binding");
            yVar8 = null;
        }
        yVar8.E.setVisibility(0);
        y yVar9 = settingRootActivity.O;
        if (yVar9 == null) {
            jo.p.v("binding");
            yVar9 = null;
        }
        yVar9.R.setVisibility(g1Var.o() ? 0 : 8);
        y yVar10 = settingRootActivity.O;
        if (yVar10 == null) {
            jo.p.v("binding");
            yVar10 = null;
        }
        yVar10.S.setImageDrawable(f10);
        y yVar11 = settingRootActivity.O;
        if (yVar11 == null) {
            jo.p.v("binding");
            yVar11 = null;
        }
        yVar11.T.setText(g1Var.e());
        y yVar12 = settingRootActivity.O;
        if (yVar12 == null) {
            jo.p.v("binding");
            yVar12 = null;
        }
        yVar12.M.setVisibility(g1Var.n() ? 0 : 8);
        y yVar13 = settingRootActivity.O;
        if (yVar13 == null) {
            jo.p.v("binding");
            yVar13 = null;
        }
        yVar13.N.setImageDrawable(f10);
        y yVar14 = settingRootActivity.O;
        if (yVar14 == null) {
            jo.p.v("binding");
            yVar14 = null;
        }
        yVar14.H.setVisibility(g1Var.m() ? 0 : 8);
        y yVar15 = settingRootActivity.O;
        if (yVar15 == null) {
            jo.p.v("binding");
            yVar15 = null;
        }
        yVar15.C.setImageDrawable(f11);
        y yVar16 = settingRootActivity.O;
        if (yVar16 == null) {
            jo.p.v("binding");
            yVar16 = null;
        }
        yVar16.f1510a0.setText(g1Var.i());
        y yVar17 = settingRootActivity.O;
        if (yVar17 == null) {
            jo.p.v("binding");
        } else {
            yVar2 = yVar17;
        }
        yVar2.f1510a0.setVisibility(g1Var.q() ? 0 : 8);
    }

    public final void A4() {
        startActivity(SelectReceiveCashBonusActivity.R.a(this));
        b4().b();
    }

    public final void B4() {
        b4().e();
    }

    public final void C4() {
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, ApiUtil.INSTANCE.urlLaw(a4()), false, false, 12, null));
    }

    public final void D4() {
        startActivity(new Intent(this, OssLicensesMenuActivity.class));
    }

    public final void E4() {
        startActivity(W3().q0(this));
    }

    public final void F4() {
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, ApiUtil.INSTANCE.urlTermsPrivacy(a4()), false, false, 12, null));
    }

    public final void G4() {
        startActivity(W3().x0(this));
    }

    public final void H4() {
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, MRUrl.TermsForStreamer.INSTANCE.getUrl(), false, false, 12, null));
    }

    public final void I4() {
        new a.C0045a(this, nc.j.f41902e).setPositiveButton(nc.i.E4, ld.v0.f40118w).f(nc.i.f41898y4).create().show();
    }

    public final void K4() {
        new a.C0045a(this, nc.j.f41902e).setPositiveButton(nc.i.E4, p0.f40071w).f(nc.i.text_menu_cash_bonus_history_lock_alert_message).create().show();
    }

    public final nf.i V3() {
        return (nf.i) this.T.getValue();
    }

    public final tb.c W3() {
        return (tb.c) this.U.getValue();
    }

    public final od.s X3() {
        return (od.s) this.W.getValue();
    }

    public final nf.r Y3() {
        return (nf.r) this.V.getValue();
    }

    public final MRLogger Z3() {
        return (MRLogger) this.Q.getValue();
    }

    public final ServerConfig a4() {
        return (ServerConfig) this.S.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{getString(nc.i.email_support)});
        intent.putExtra("android.intent.extra.SUBJECT", getString(nc.i.text_publisher_inquiry_mail_title));
        intent.putExtra("android.intent.extra.TEXT", getString(nc.i.text_publisher_inquiry_mail_body, new Object[]{f4().x(), BuildConfig.VERSION_NAME, Build.MODEL, Build.VERSION.RELEASE}));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public final n0 b4() {
        return (n0) this.Y.getValue();
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final h1 c4() {
        return (h1) this.Z.getValue();
    }

    public final i1 d4() {
        return (i1) this.X.getValue();
    }

    public final j1 e4() {
        return (j1) this.R.getValue();
    }

    public final v0 f4() {
        return (v0) this.P.getValue();
    }

    public final void g4() {
        y yVar = this.O;
        y yVar2 = null;
        if (yVar == null) {
            jo.p.v("binding");
            yVar = null;
        }
        yVar.f1513d0.setOnClickListener(new View.OnClickListener() { // from class: ld.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.m4(SettingRootActivity.this, view);
            }
        });
        y yVar3 = this.O;
        if (yVar3 == null) {
            jo.p.v("binding");
            yVar3 = null;
        }
        yVar3.W.setOnClickListener(new View.OnClickListener() { // from class: ld.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.n4(SettingRootActivity.this, view);
            }
        });
        y yVar4 = this.O;
        if (yVar4 == null) {
            jo.p.v("binding");
            yVar4 = null;
        }
        yVar4.I.setOnClickListener(new View.OnClickListener() { // from class: ld.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.o4(SettingRootActivity.this, view);
            }
        });
        y yVar5 = this.O;
        if (yVar5 == null) {
            jo.p.v("binding");
            yVar5 = null;
        }
        yVar5.J.setOnClickListener(new View.OnClickListener() { // from class: ld.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.p4(SettingRootActivity.this, view);
            }
        });
        y yVar6 = this.O;
        if (yVar6 == null) {
            jo.p.v("binding");
            yVar6 = null;
        }
        yVar6.D.setOnClickListener(new View.OnClickListener() { // from class: ld.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.q4(SettingRootActivity.this, view);
            }
        });
        y yVar7 = this.O;
        if (yVar7 == null) {
            jo.p.v("binding");
            yVar7 = null;
        }
        yVar7.f1511b0.setOnClickListener(new View.OnClickListener() { // from class: ld.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.h4(SettingRootActivity.this, view);
            }
        });
        y yVar8 = this.O;
        if (yVar8 == null) {
            jo.p.v("binding");
            yVar8 = null;
        }
        yVar8.B.setOnClickListener(new View.OnClickListener() { // from class: ld.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.i4(SettingRootActivity.this, view);
            }
        });
        y yVar9 = this.O;
        if (yVar9 == null) {
            jo.p.v("binding");
            yVar9 = null;
        }
        yVar9.V.setOnClickListener(new View.OnClickListener() { // from class: ld.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.j4(SettingRootActivity.this, view);
            }
        });
        y yVar10 = this.O;
        if (yVar10 == null) {
            jo.p.v("binding");
            yVar10 = null;
        }
        LinearLayout linearLayout = yVar10.f1514e0;
        jo.p.g(linearLayout, "binding.termsForStreamer");
        yd.g1.a(linearLayout, new f());
        y yVar11 = this.O;
        if (yVar11 == null) {
            jo.p.v("binding");
            yVar11 = null;
        }
        yVar11.X.setOnClickListener(new View.OnClickListener() { // from class: ld.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.k4(SettingRootActivity.this, view);
            }
        });
        y yVar12 = this.O;
        if (yVar12 == null) {
            jo.p.v("binding");
            yVar12 = null;
        }
        LinearLayout linearLayout2 = yVar12.U;
        jo.p.g(linearLayout2, "binding.guideline");
        yd.g1.a(linearLayout2, new b());
        y yVar13 = this.O;
        if (yVar13 == null) {
            jo.p.v("binding");
            yVar13 = null;
        }
        LinearLayout linearLayout3 = yVar13.F;
        jo.p.g(linearLayout3, "binding.contractMemberPassBookContainer");
        yd.g1.a(linearLayout3, new c());
        y yVar14 = this.O;
        if (yVar14 == null) {
            jo.p.v("binding");
            yVar14 = null;
        }
        LinearLayout linearLayout4 = yVar14.P;
        jo.p.g(linearLayout4, "binding.editIdentificationContainer");
        yd.g1.a(linearLayout4, new d());
        y yVar15 = this.O;
        if (yVar15 == null) {
            jo.p.v("binding");
            yVar15 = null;
        }
        LinearLayout linearLayout5 = yVar15.K;
        jo.p.g(linearLayout5, "binding.editBankAccountContainer");
        yd.g1.a(linearLayout5, new e());
        y yVar16 = this.O;
        if (yVar16 == null) {
            jo.p.v("binding");
            yVar16 = null;
        }
        Toolbar toolbar = yVar16.f1515f0.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ld.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingRootActivity.l4(SettingRootActivity.this, view);
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
        textView.setText(toolbar.getResources().getString(nc.i.text_other));
        y yVar17 = this.O;
        if (yVar17 == null) {
            jo.p.v("binding");
            yVar17 = null;
        }
        yVar17.I.setVisibility(0);
        y yVar18 = this.O;
        if (yVar18 == null) {
            jo.p.v("binding");
            yVar18 = null;
        }
        yVar18.J.setVisibility(0);
        y yVar19 = this.O;
        if (yVar19 == null) {
            jo.p.v("binding");
        } else {
            yVar2 = yVar19;
        }
        yVar2.V.setVisibility(0);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41864q);
        jo.p.g(g10, "setContentView(this, R.l…out.activity_settingroot)");
        this.O = (y) g10;
        g4();
        r4();
        MRLogger Z3 = Z3();
        MRLog.Companion companion = MRLog.Companion;
        Z3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_IMP).build());
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        LatestRewardResponse f10 = Y3().d().f();
        if (f10 != null) {
            if (f10.isVisibleRanking()) {
                X3().m(f10.getRankingMonth());
            }
            if (f10.isVisibleHistory()) {
                X3().l(f10.getCurrentMonth());
            }
        }
        b4().d();
        super.onResume();
    }

    public final void r4() {
        Y3().j().i(this, new androidx.lifecycle.f0() { // from class: ld.u0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SettingRootActivity.s4(SettingRootActivity.this, (Boolean) obj);
            }
        });
        V3().a().i(this, new androidx.lifecycle.f0() { // from class: ld.s0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SettingRootActivity.t4(SettingRootActivity.this, (ContractSummaryResponse) obj);
            }
        });
        c4().j().i(this, new androidx.lifecycle.f0() { // from class: ld.t0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SettingRootActivity.u4(SettingRootActivity.this, (g1) obj);
            }
        });
        uo.l.d(androidx.lifecycle.v.a(this), null, null, new g(null), 3, null);
        uo.l.d(androidx.lifecycle.v.a(this), null, null, new h(null), 3, null);
    }

    public final void v4() {
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, ApiUtil.INSTANCE.urlAbout(a4()), false, false, 12, null));
    }

    public final void w4() {
        e4().f(this, "inquiry");
        startActivity(FaqActivity.U.a(this));
    }

    public final void x4() {
        startActivity(W3().n0(this));
        b4().a();
    }

    public final void y4() {
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, MRUrl.DeerDeveloper.INSTANCE.getUrl(), false, false, 12, null));
    }

    public final void z4() {
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.text_confirm_contents_publisher_title);
        String string2 = getString(nc.i.text_confirm_contents_publisher_message);
        String string3 = getString(nc.i.f41874c6);
        String string4 = getString(nc.i.f41888r4);
        jo.p.g(string, "getString(R.string.text_…contents_publisher_title)");
        aVar.a(string, string3, string4, string2, true).z3(a3(), "CustomYesNoDialog");
        MRLogger Z3 = Z3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_INQUIRY_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_USER);
        builder.setTargetId(f4().x());
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, "publisher")));
        Z3.sendLog(builder.build());
    }
}
