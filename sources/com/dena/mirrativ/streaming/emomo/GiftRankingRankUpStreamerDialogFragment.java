package com.dena.mirrativ.streaming.emomo;

import ac.o0;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import jo.f0;
import jo.p;
import jo.q;
import kf.x;
import o3.c0;
import ud.f1;
import ud.g1;
import uo.q0;
import uo.r0;
import wn.l;
import wn.v;
import xb.s;

/* loaded from: classes2.dex */
public final class GiftRankingRankUpStreamerDialogFragment extends androidx.fragment.app.e implements q0 {
    public static final a T0 = new a(null);
    public static final int U0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public io.a<v> R0;
    public boolean S0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final GiftRankingRankUpStreamerDialogFragment a(int i10, GiftItem giftItem, String str, String str2) {
            p.h(giftItem, "giftItem");
            p.h(str, "liveId");
            p.h(str2, "liveSentGiftId");
            GiftRankingRankUpStreamerDialogFragment giftRankingRankUpStreamerDialogFragment = new GiftRankingRankUpStreamerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_EVENT_ID", i10);
            bundle.putSerializable("EXTRA_KEY_GIFT_ITEM", giftItem);
            bundle.putString("EXTRA_KEY_LIVE_ID", str);
            bundle.putString("EXTRA_KEY_LIVE_SENT_GIFT_ID", str2);
            giftRankingRankUpStreamerDialogFragment.V2(bundle);
            return giftRankingRankUpStreamerDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            GiftRankingRankUpStreamerDialogFragment.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ao.d<v> f23180w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ao.d<? super v> dVar) {
            super(0);
            this.f23180w = dVar;
        }

        public final void a() {
            ao.d<v> dVar = this.f23180w;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(v.f59242a));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23181w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23182x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23183y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23181w = componentCallbacks;
            this.f23182x = aVar;
            this.f23183y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f23181w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f23182x, this.f23183y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23184w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23185x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23186y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23184w = componentCallbacks;
            this.f23185x = aVar;
            this.f23186y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f23184w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.m.class), this.f23185x, this.f23186y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23187w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23188x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23189y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23187w = componentCallbacks;
            this.f23188x = aVar;
            this.f23189y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23187w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f23188x, this.f23189y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ o0 f23191x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f1 f23192y;

        public g(o0 o0Var, f1 f1Var) {
            this.f23191x = o0Var;
            this.f23192y = f1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            GiftRankingRankUpStreamerDialogFragment giftRankingRankUpStreamerDialogFragment = GiftRankingRankUpStreamerDialogFragment.this;
            uo.l.d(giftRankingRankUpStreamerDialogFragment, null, null, new h(this.f23191x, this.f23192y, null), 3, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment$startAnimation$1$1", f = "GiftRankingRankUpStreamerDialogFragment.kt", l = {204, 207, 209, 211, 213}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23193w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o0 f23195y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ f1 f23196z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o0 o0Var, f1 f1Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f23195y = o0Var;
            this.f23196z = f1Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f23195y, this.f23196z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23193w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L33
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                wn.m.b(r10)
                goto L87
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                wn.m.b(r10)
                goto L7a
            L27:
                wn.m.b(r10)
                goto L67
            L2b:
                wn.m.b(r10)
                goto L4e
            L2f:
                wn.m.b(r10)
                goto L41
            L33:
                wn.m.b(r10)
                r7 = 400(0x190, double:1.976E-321)
                r9.f23193w = r6
                java.lang.Object r10 = uo.b1.a(r7, r9)
                if (r10 != r0) goto L41
                return r0
            L41:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.this
                ac.o0 r1 = r9.f23195y
                r9.f23193w = r5
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.C3(r10, r1, r9)
                if (r10 != r0) goto L4e
                return r0
            L4e:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.this
                ac.o0 r1 = r9.f23195y
                ud.f1 r5 = r9.f23196z
                java.util.List r5 = r5.g()
                ud.f1 r6 = r9.f23196z
                ud.g1 r6 = r6.i()
                r9.f23193w = r4
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.D3(r10, r1, r5, r6, r9)
                if (r10 != r0) goto L67
                return r0
            L67:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.this
                ac.o0 r1 = r9.f23195y
                ud.f1 r4 = r9.f23196z
                int r4 = r4.h()
                r9.f23193w = r3
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.E3(r10, r1, r4, r9)
                if (r10 != r0) goto L7a
                return r0
            L7a:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.this
                ac.o0 r1 = r9.f23195y
                r9.f23193w = r2
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.F3(r10, r1, r9)
                if (r10 != r0) goto L87
                return r0
            L87:
                ac.o0 r10 = r9.f23195y
                androidx.appcompat.widget.AppCompatImageView r10 = r10.B
                r0 = 0
                r10.setVisibility(r0)
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment", f = "GiftRankingRankUpStreamerDialogFragment.kt", l = {236, 268, 272}, m = "startStep3RouletteAnimation")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f23197w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23198x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23199y;

        /* renamed from: z  reason: collision with root package name */
        public Object f23200z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return GiftRankingRankUpStreamerDialogFragment.this.N3(null, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends Property<RecyclerView, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public int f23201a;

        public j(Class<Integer> cls) {
            super(cls, "verticalScrollOffset");
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(RecyclerView recyclerView) {
            p.h(recyclerView, "object");
            Integer valueOf = Integer.valueOf(recyclerView.computeVerticalScrollOffset());
            this.f23201a = valueOf.intValue();
            return valueOf;
        }

        public void b(RecyclerView recyclerView, int i10) {
            p.h(recyclerView, "object");
            int i11 = this.f23201a;
            this.f23201a = i10;
            recyclerView.scrollBy(0, i10 - i11);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(RecyclerView recyclerView, Integer num) {
            b(recyclerView, num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o0 f23202a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g1 f23203b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f23204c;

        public k(o0 o0Var, g1 g1Var, ObjectAnimator objectAnimator) {
            this.f23202a = o0Var;
            this.f23203b = g1Var;
            this.f23204c = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p.h(animator, "animator");
            this.f23202a.I.b(this.f23203b, this.f23204c.getDuration());
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment", f = "GiftRankingRankUpStreamerDialogFragment.kt", l = {356}, m = "startStep4NewRankAnimation")
    /* loaded from: classes2.dex */
    public static final class l extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f23205w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23206x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23207y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f23208z;

        public l(ao.d<? super l> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23208z = obj;
            this.B |= Integer.MIN_VALUE;
            return GiftRankingRankUpStreamerDialogFragment.this.O3(null, 0, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment", f = "GiftRankingRankUpStreamerDialogFragment.kt", l = {407}, m = "startStep5DescriptionTextAnimation")
    /* loaded from: classes2.dex */
    public static final class m extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f23209w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23210x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f23211y;

        public m(ao.d<? super m> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23211y = obj;
            this.A |= Integer.MIN_VALUE;
            return GiftRankingRankUpStreamerDialogFragment.this.P3(null, this);
        }
    }

    public GiftRankingRankUpStreamerDialogFragment() {
        super(xb.p.dialog_fragment_gift_ranking_rank_up_streamer);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        this.P0 = wn.g.b(iVar, new e(this, null, null));
        this.Q0 = wn.g.b(iVar, new f(this, null, null));
    }

    public final kf.m G3() {
        return (kf.m) this.P0.getValue();
    }

    public final MRLogger H3() {
        return (MRLogger) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final x I3() {
        return (x) this.O0.getValue();
    }

    public final void J3(o0 o0Var) {
        AppCompatImageView appCompatImageView = o0Var.B;
        p.g(appCompatImageView, "binding.closeButtonView");
        yd.g1.a(appCompatImageView, new b());
        RecyclerView recyclerView = o0Var.M;
        final Context N2 = N2();
        recyclerView.setLayoutManager(new LinearLayoutManager(N2) { // from class: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment$setupUserActions$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                boolean z10;
                z10 = GiftRankingRankUpStreamerDialogFragment.this.S0;
                return z10;
            }
        });
    }

    public final Object K3(FragmentManager fragmentManager, String str, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        this.R0 = new c(iVar);
        z3(fragmentManager, str);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    public final void L3(o0 o0Var, f1 f1Var) {
        View u10 = o0Var.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new h(o0Var, f1Var, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new g(o0Var, f1Var));
        }
    }

    public final Object M3(o0 o0Var, ao.d<? super v> dVar) {
        LottieAnimationView lottieAnimationView = o0Var.O;
        p.g(lottieAnimationView, "binding.titleLottieView");
        Object a10 = de.i.a(lottieAnimationView, dVar);
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[SYNTHETIC] */
    @android.annotation.SuppressLint({"Recycle"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N3(ac.o0 r20, java.util.List<? extends ud.a> r21, ud.g1 r22, ao.d<? super wn.v> r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.N3(ac.o0, java.util.List, ud.g1, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O3(ac.o0 r24, int r25, ao.d<? super wn.v> r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.O3(ac.o0, int, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P3(ac.o0 r10, ao.d<? super wn.v> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.m
            if (r0 == 0) goto L13
            r0 = r11
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment$m r0 = (com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.m) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment$m r0 = new com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment$m
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23211y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r10 = r0.f23210x
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f23209w
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment r2 = (com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment) r2
            wn.m.b(r11)
            goto L5b
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            wn.m.b(r11)
            r11 = 4
            androidx.appcompat.widget.AppCompatTextView[] r11 = new androidx.appcompat.widget.AppCompatTextView[r11]
            androidx.appcompat.widget.AppCompatTextView r2 = r10.D
            r11[r3] = r2
            androidx.appcompat.widget.AppCompatTextView r2 = r10.C
            r11[r4] = r2
            r2 = 2
            androidx.appcompat.widget.AppCompatTextView r5 = r10.E
            r11[r2] = r5
            r2 = 3
            androidx.appcompat.widget.AppCompatTextView r10 = r10.F
            r11[r2] = r10
            java.util.List r10 = xn.s.m(r11)
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
        L5b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb4
            java.lang.Object r11 = r10.next()
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r11.setVisibility(r3)
            r5 = 10
            int r6 = de.e.b(r2, r5)
            float r6 = (float) r6
            r11.setTranslationY(r6)
            android.view.animation.AnimationSet r6 = new android.view.animation.AnimationSet
            r6.<init>(r4)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            r6.setInterpolator(r7)
            r7 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r7)
            r6.setFillAfter(r4)
            android.view.animation.TranslateAnimation r7 = new android.view.animation.TranslateAnimation
            int r5 = de.e.b(r2, r5)
            float r5 = (float) r5
            float r5 = -r5
            r8 = 0
            r7.<init>(r8, r8, r8, r5)
            r6.addAnimation(r7)
            android.view.animation.AlphaAnimation r5 = new android.view.animation.AlphaAnimation
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r8, r7)
            r6.addAnimation(r5)
            r11.startAnimation(r6)
            r5 = 50
            r0.f23209w = r2
            r0.f23210x = r10
            r0.A = r4
            java.lang.Object r11 = uo.b1.a(r5, r0)
            if (r11 != r1) goto L5b
            return r1
        Lb4:
            wn.v r10 = wn.v.f59242a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpStreamerDialogFragment.P3(ac.o0, ao.d):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Object obj;
        Window window;
        Window window2;
        boolean z10;
        p.h(view, "view");
        super.e2(view, bundle);
        Serializable serializable = M2().getSerializable("EXTRA_KEY_GIFT_ITEM");
        p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.bcsvr.response.GiftItem");
        GiftItem giftItem = (GiftItem) serializable;
        Iterator<T> it = giftItem.getRankings().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GiftRankingBcsvrResponse giftRankingBcsvrResponse = (GiftRankingBcsvrResponse) obj;
            if (giftRankingBcsvrResponse.getEventId() != M2().getInt("EXTRA_KEY_EVENT_ID") || giftRankingBcsvrResponse.isAppEvent()) {
                z10 = false;
                continue;
            } else {
                z10 = true;
                continue;
            }
            if (z10) {
                break;
            }
        }
        GiftRankingBcsvrResponse giftRankingBcsvrResponse2 = (GiftRankingBcsvrResponse) obj;
        if (giftRankingBcsvrResponse2 == null) {
            n3();
            return;
        }
        f1.a aVar = f1.f54917i;
        Context N2 = N2();
        p.g(N2, "requireContext()");
        f1 a10 = aVar.a(N2, giftRankingBcsvrResponse2, I3().T4(), I3().t4(), I3().u2(), I3().g(), I3().h0(), giftItem.getUserName());
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window = p33.getWindow()) != null) {
            window.setWindowAnimations(s.f60095b);
        }
        o0 T = o0.T(view);
        T.V(a10);
        p.g(T, "binding");
        J3(T);
        L3(T, a10);
        MRLogger H3 = H3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_RANKING_RANK_UP_DISPLAYED);
        builder.setTargetType(MRLog.TARGET_TYPE_LIVER);
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put(LogBase.USER_ID, a10.i().h());
        hashMap.put("rank_before", String.valueOf(a10.i().b()));
        hashMap.put("rank_after", String.valueOf(a10.i().a()));
        hashMap.put("grade", giftRankingBcsvrResponse2.getCasterGrade());
        hashMap.put("pt", String.valueOf(a10.i().e()));
        hashMap.put(MRLog.PAYLOAD_GIFT_ID, giftItem.getGiftId());
        hashMap.put("coins", String.valueOf(giftItem.getCoins()));
        hashMap.put("count", String.valueOf(giftItem.getCount()));
        hashMap.put("gift_point", String.valueOf(giftItem.getPoint()));
        String string = M2().getString("EXTRA_KEY_LIVE_ID");
        p.e(string);
        hashMap.put(MRLog.PAYLOAD_KEY_LIVE_ID, string);
        String string2 = M2().getString("EXTRA_KEY_LIVE_SENT_GIFT_ID");
        p.e(string2);
        hashMap.put("live_sent_gift_id", string2);
        v vVar = v.f59242a;
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, G3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, I3().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, G3().h()), wn.q.a("page_id", Referer.BROADCAST), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
        H3.sendLog(builder.build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        io.a<v> aVar = this.R0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), s.f60094a);
    }
}
