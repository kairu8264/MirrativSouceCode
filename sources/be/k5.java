package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftConfigResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.dena.mirrorman.unity.UnityScreenshot;
import ha.a;
import java.io.Serializable;
import java.util.List;
import kq.a;
import yd.t1;

/* loaded from: classes2.dex */
public final class k5 extends androidx.fragment.app.e implements me.x, me.h, uo.q0 {
    public static final a X0 = new a(null);
    public static final int Y0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public nf.l0 R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k5 a(String str, UnityScreenshot unityScreenshot) {
            jo.p.h(str, "referer");
            jo.p.h(unityScreenshot, "screenshot");
            k5 k5Var = new k5();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putSerializable("EXTRA_KEY_SCREENSHOT", unityScreenshot);
            k5Var.V2(bundle);
            return k5Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17960w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f17960w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17960w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17961w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.a aVar) {
            super(0);
            this.f17961w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17961w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17962w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17963x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17964y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17962w = aVar;
            this.f17963x = aVar2;
            this.f17964y = aVar3;
            this.f17965z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17962w;
            vq.a aVar2 = this.f17963x;
            io.a aVar3 = this.f17964y;
            xq.a aVar4 = this.f17965z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.l0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17966w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f17966w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17966w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k5.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
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
            nf.l0 l0Var = k5.this.R0;
            if (l0Var == null) {
                jo.p.v("store");
                l0Var = null;
            }
            List<UniqueEmomoGiftColorConfig> i10 = l0Var.i();
            if (i10 == null) {
                return;
            }
            me.w.X0.a(k5.this.L3(), new jf.v0(i10, k5.this.M3())).z3(k5.this.p0(), "UniqueEmomoStampGiftCreationDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (!jo.p.c(k5.this.I3().H().f(), Boolean.TRUE)) {
                nf.l0 l0Var = k5.this.R0;
                if (l0Var == null) {
                    jo.p.v("store");
                    l0Var = null;
                }
                List<UniqueEmomoGiftPreset> j10 = l0Var.j();
                if (j10 == null) {
                    return;
                }
                me.g.R0.a(k5.this.L3(), new jf.u0(j10)).z3(k5.this.p0(), "UniqueEmomoRichGiftPresetSelectDialogFragment");
                return;
            }
            t1.a aVar = yd.t1.f61795x;
            Context N2 = k5.this.N2();
            jo.p.g(N2, "requireContext()");
            String U0 = k5.this.U0(nd.f1.f41991t3);
            jo.p.g(U0, "getString(R.string.text_…available_with_live_play)");
            aVar.a(N2, U0);
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
            k5.this.H3().c(k5.this.L3());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.UniqueEmomoGiftTypeSelectDialogFragment$onViewCreated$6", f = "UniqueEmomoGiftTypeSelectDialogFragment.kt", l = {147}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17971w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.a5 f17973y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UniqueEmomoGiftConfigResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ae.a5 f17974w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k5 f17975x;

            public a(ae.a5 a5Var, k5 k5Var) {
                this.f17974w = a5Var;
                this.f17975x = k5Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UniqueEmomoGiftConfigResponse uniqueEmomoGiftConfigResponse, ao.d<? super wn.v> dVar) {
                this.f17974w.E.setVisibility(0);
                AppCompatImageView appCompatImageView = this.f17974w.D;
                jo.p.g(appCompatImageView, "binding.headerImageView");
                td.a.f(appCompatImageView, uniqueEmomoGiftConfigResponse.getHeaderImageUrl());
                AppCompatImageView appCompatImageView2 = this.f17974w.N;
                jo.p.g(appCompatImageView2, "binding.stampGiftImageView");
                td.a.f(appCompatImageView2, uniqueEmomoGiftConfigResponse.getStampGift().getIconUrl());
                AppCompatImageView appCompatImageView3 = this.f17974w.I;
                jo.p.g(appCompatImageView3, "binding.richGiftImageView");
                td.a.f(appCompatImageView3, uniqueEmomoGiftConfigResponse.getRichGift().getIconUrl());
                k5 k5Var = this.f17975x;
                int i10 = nd.f1.text_unique_emomo_gift_coins;
                String V0 = k5Var.V0(i10, String.valueOf(uniqueEmomoGiftConfigResponse.getStampGift().getCoins()));
                jo.p.g(V0, "getString(R.string.text_…ampGift.coins.toString())");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17975x.V0(nd.f1.text_unique_emomo_gift_stamp_description1, V0));
                AppCompatTextView appCompatTextView = this.f17974w.L;
                SpannableString spannableString = new SpannableString(spannableStringBuilder);
                Context N2 = this.f17975x.N2();
                int i11 = nd.w0.f42241s0;
                spannableString.setSpan(new ForegroundColorSpan(c3.a.d(N2, i11)), 0, V0.length(), 33);
                appCompatTextView.setText(spannableString);
                String V02 = this.f17975x.V0(i10, String.valueOf(uniqueEmomoGiftConfigResponse.getRichGift().getCoins()));
                jo.p.g(V02, "getString(R.string.text_…ichGift.coins.toString())");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f17975x.V0(nd.f1.text_unique_emomo_gift_rich_description1, V02));
                AppCompatTextView appCompatTextView2 = this.f17974w.G;
                SpannableString spannableString2 = new SpannableString(spannableStringBuilder2);
                spannableString2.setSpan(new ForegroundColorSpan(c3.a.d(this.f17975x.N2(), i11)), 0, V02.length(), 33);
                appCompatTextView2.setText(spannableString2);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ae.a5 a5Var, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f17973y = a5Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f17973y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17971w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.l0 l0Var = k5.this.R0;
                if (l0Var == null) {
                    jo.p.v("store");
                    l0Var = null;
                }
                xo.c<UniqueEmomoGiftConfigResponse> g10 = l0Var.g();
                a aVar = new a(this.f17973y, k5.this);
                this.f17971w = 1;
                if (g10.a(aVar, this) == c10) {
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
    public static final class k extends jo.q implements io.a<String> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k5.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<UnityScreenshot> {
        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final UnityScreenshot invoke() {
            Serializable serializable = k5.this.M2().getSerializable("EXTRA_KEY_SCREENSHOT");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.unity.UnityScreenshot");
            return (UnityScreenshot) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<od.p0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17978w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17979x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17980y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17978w = componentCallbacks;
            this.f17979x = aVar;
            this.f17980y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p0, java.lang.Object] */
        @Override // io.a
        public final od.p0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17978w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.p0.class), this.f17979x, this.f17980y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17981w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17982x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17983y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17981w = componentCallbacks;
            this.f17982x = aVar;
            this.f17983y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f17981w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f17982x, this.f17983y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17984w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17985x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17986y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17984w = componentCallbacks;
            this.f17985x = aVar;
            this.f17986y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f17984w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f17985x, this.f17986y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17987w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17988x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17989y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17987w = componentCallbacks;
            this.f17988x = aVar;
            this.f17989y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f17987w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f17988x, this.f17989y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17990w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17991x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17992y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17990w = componentCallbacks;
            this.f17991x = aVar;
            this.f17992y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f17990w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f17991x, this.f17992y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17993w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17994x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17995y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17993w = componentCallbacks;
            this.f17994x = aVar;
            this.f17995y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f17993w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f17994x, this.f17995y);
        }
    }

    public k5() {
        super(nd.b1.dialog_fragment_unique_emomo_gift_type_select);
        this.N0 = new da.j();
        this.O0 = wn.g.a(new k());
        this.P0 = wn.g.a(new l());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new m(this, null, null));
        this.S0 = wn.g.b(iVar, new n(this, null, null));
        this.T0 = wn.g.b(iVar, new o(this, null, null));
        this.U0 = wn.g.b(iVar, new p(this, null, null));
        this.V0 = wn.g.b(iVar, new q(this, null, null));
        this.W0 = wn.g.b(iVar, new r(this, null, null));
    }

    public static final void P3(ae.a5 a5Var, k5 k5Var, ha.a aVar) {
        jo.p.h(k5Var, "this$0");
        if (aVar instanceof a.b) {
            a5Var.P.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            StatusView statusView = a5Var.P;
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = k5Var.U0(nd.f1.f41966c);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            statusView.b(new StatusView.b.a(message, new i()));
        } else {
            a5Var.P.b(StatusView.b.c.f20791w);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        b bVar = new b(this);
        xq.a a10 = gq.a.a(this);
        c cVar = new c(bVar);
        this.R0 = (nf.l0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.l0.class), new e(cVar), new d(bVar, null, null, a10)).getValue());
    }

    public final od.p0 H3() {
        return (od.p0) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final nf.o I3() {
        return (nf.o) this.W0.getValue();
    }

    public final kf.m J3() {
        return (kf.m) this.U0.getValue();
    }

    public final MRLogger K3() {
        return (MRLogger) this.S0.getValue();
    }

    public final String L3() {
        return (String) this.O0.getValue();
    }

    public final UnityScreenshot M3() {
        return (UnityScreenshot) this.P0.getValue();
    }

    public final nd.i1 N3() {
        return (nd.i1) this.V0.getValue();
    }

    public final kf.x O3() {
        return (kf.x) this.T0.getValue();
    }

    @Override // me.h
    public void c0() {
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        MRLogger K3 = K3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MY_GIFT_CREATION_SCREEN_IMP);
        if (N3().a().d()) {
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, J3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, O3().T4())));
        }
        K3.sendLog(builder.build());
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        final ae.a5 T = ae.a5.T(view);
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new f());
        RoundedButtonView roundedButtonView = T.K;
        jo.p.g(roundedButtonView, "binding.stampGiftCreateButton");
        yd.g1.a(roundedButtonView, new g());
        RoundedButtonView roundedButtonView2 = T.F;
        jo.p.g(roundedButtonView2, "binding.richGiftCreateButton");
        yd.g1.a(roundedButtonView2, new h());
        nf.l0 l0Var = this.R0;
        if (l0Var == null) {
            jo.p.v("store");
            l0Var = null;
        }
        l0Var.h().i(a1(), new androidx.lifecycle.f0() { // from class: be.j5
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k5.P3(ae.a5.this, this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new j(T, null), 3, null);
        H3().c(L3());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.BlackThreeDialog);
    }

    @Override // me.x
    public void v() {
        n3();
    }
}
