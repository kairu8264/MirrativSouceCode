package com.dena.mirrativ.streaming.emomo;

import ac.m0;
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
import cc.n;
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
import ud.g1;
import uo.q0;
import uo.r0;
import wn.l;
import wn.v;
import xb.s;

/* loaded from: classes2.dex */
public final class GiftRankingRankUpSenderDialogFragment extends androidx.fragment.app.e implements q0 {
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

        public final GiftRankingRankUpSenderDialogFragment a(int i10, GiftItem giftItem, String str, String str2) {
            p.h(giftItem, "giftItem");
            p.h(str, "liveId");
            p.h(str2, "liveSentGiftId");
            GiftRankingRankUpSenderDialogFragment giftRankingRankUpSenderDialogFragment = new GiftRankingRankUpSenderDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_EVENT_ID", i10);
            bundle.putSerializable("EXTRA_KEY_GIFT_ITEM", giftItem);
            bundle.putString("EXTRA_KEY_LIVE_ID", str);
            bundle.putString("EXTRA_KEY_LIVE_SENT_GIFT_ID", str2);
            giftRankingRankUpSenderDialogFragment.V2(bundle);
            return giftRankingRankUpSenderDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            GiftRankingRankUpSenderDialogFragment.this.n3();
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
        public final /* synthetic */ ao.d<v> f23145w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ao.d<? super v> dVar) {
            super(0);
            this.f23145w = dVar;
        }

        public final void a() {
            ao.d<v> dVar = this.f23145w;
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
        public final /* synthetic */ ComponentCallbacks f23146w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23147x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23148y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23146w = componentCallbacks;
            this.f23147x = aVar;
            this.f23148y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f23146w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f23147x, this.f23148y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23149w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23150x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23151y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23149w = componentCallbacks;
            this.f23150x = aVar;
            this.f23151y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f23149w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.m.class), this.f23150x, this.f23151y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23152w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23153x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23154y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23152w = componentCallbacks;
            this.f23153x = aVar;
            this.f23154y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23152w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f23153x, this.f23154y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ m0 f23156x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n f23157y;

        public g(m0 m0Var, n nVar) {
            this.f23156x = m0Var;
            this.f23157y = nVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            GiftRankingRankUpSenderDialogFragment giftRankingRankUpSenderDialogFragment = GiftRankingRankUpSenderDialogFragment.this;
            uo.l.d(giftRankingRankUpSenderDialogFragment, null, null, new h(this.f23156x, this.f23157y, null), 3, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment$startAnimation$1$1", f = "GiftRankingRankUpSenderDialogFragment.kt", l = {201, 204, 206, 208, 210}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23158w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m0 f23160y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ n f23161z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(m0 m0Var, n nVar, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f23160y = m0Var;
            this.f23161z = nVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f23160y, this.f23161z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23158w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                wn.m.b(r10)
                goto L8e
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                wn.m.b(r10)
                goto L7b
            L28:
                wn.m.b(r10)
                goto L62
            L2c:
                wn.m.b(r10)
                goto L55
            L30:
                wn.m.b(r10)
                goto L42
            L34:
                wn.m.b(r10)
                r7 = 400(0x190, double:1.976E-321)
                r9.f23158w = r6
                java.lang.Object r10 = uo.b1.a(r7, r9)
                if (r10 != r0) goto L42
                return r0
            L42:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.this
                ac.m0 r1 = r9.f23160y
                cc.n r6 = r9.f23161z
                boolean r6 = r6.h()
                r9.f23158w = r5
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.C3(r10, r1, r6, r9)
                if (r10 != r0) goto L55
                return r0
            L55:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.this
                ac.m0 r1 = r9.f23160y
                r9.f23158w = r4
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.D3(r10, r1, r9)
                if (r10 != r0) goto L62
                return r0
            L62:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.this
                ac.m0 r1 = r9.f23160y
                cc.n r4 = r9.f23161z
                java.util.List r4 = r4.b()
                cc.n r5 = r9.f23161z
                ud.g1 r5 = r5.d()
                r9.f23158w = r3
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.E3(r10, r1, r4, r5, r9)
                if (r10 != r0) goto L7b
                return r0
            L7b:
                com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.this
                ac.m0 r1 = r9.f23160y
                cc.n r3 = r9.f23161z
                int r3 = r3.c()
                r9.f23158w = r2
                java.lang.Object r10 = com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.F3(r10, r1, r3, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                ac.m0 r10 = r9.f23160y
                androidx.appcompat.widget.AppCompatImageView r10 = r10.B
                r0 = 0
                r10.setVisibility(r0)
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment", f = "GiftRankingRankUpSenderDialogFragment.kt", l = {226}, m = "startStep2SenderViewAnimation")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f23162w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23163x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23164y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f23165z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return GiftRankingRankUpSenderDialogFragment.this.M3(null, false, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment", f = "GiftRankingRankUpSenderDialogFragment.kt", l = {262, 294, 298}, m = "startStep4RouletteAnimation")
    /* loaded from: classes2.dex */
    public static final class j extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f23166w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23167x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23168y;

        /* renamed from: z  reason: collision with root package name */
        public Object f23169z;

        public j(ao.d<? super j> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return GiftRankingRankUpSenderDialogFragment.this.O3(null, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends Property<RecyclerView, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public int f23170a;

        public k(Class<Integer> cls) {
            super(cls, "verticalScrollOffset");
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(RecyclerView recyclerView) {
            p.h(recyclerView, "object");
            Integer valueOf = Integer.valueOf(recyclerView.computeVerticalScrollOffset());
            this.f23170a = valueOf.intValue();
            return valueOf;
        }

        public void b(RecyclerView recyclerView, int i10) {
            p.h(recyclerView, "object");
            int i11 = this.f23170a;
            this.f23170a = i10;
            recyclerView.scrollBy(0, i10 - i11);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(RecyclerView recyclerView, Integer num) {
            b(recyclerView, num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m0 f23171a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g1 f23172b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f23173c;

        public l(m0 m0Var, g1 g1Var, ObjectAnimator objectAnimator) {
            this.f23171a = m0Var;
            this.f23172b = g1Var;
            this.f23173c = objectAnimator;
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
            this.f23171a.E.b(this.f23172b, this.f23173c.getDuration());
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment", f = "GiftRankingRankUpSenderDialogFragment.kt", l = {382}, m = "startStep5NewRankAnimation")
    /* loaded from: classes2.dex */
    public static final class m extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f23174w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23175x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23176y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f23177z;

        public m(ao.d<? super m> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23177z = obj;
            this.B |= Integer.MIN_VALUE;
            return GiftRankingRankUpSenderDialogFragment.this.P3(null, 0, this);
        }
    }

    public GiftRankingRankUpSenderDialogFragment() {
        super(xb.p.dialog_fragment_gift_ranking_rank_up_sender);
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

    public final void J3(m0 m0Var) {
        AppCompatImageView appCompatImageView = m0Var.B;
        p.g(appCompatImageView, "binding.closeButtonView");
        yd.g1.a(appCompatImageView, new b());
        RecyclerView recyclerView = m0Var.I;
        final Context N2 = N2();
        recyclerView.setLayoutManager(new LinearLayoutManager(N2) { // from class: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment$setupUserActions$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                boolean z10;
                z10 = GiftRankingRankUpSenderDialogFragment.this.S0;
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

    public final void L3(m0 m0Var, n nVar) {
        View u10 = m0Var.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new h(m0Var, nVar, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new g(m0Var, nVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M3(ac.m0 r12, boolean r13, ao.d<? super wn.v> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.i
            if (r0 == 0) goto L13
            r0 = r14
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment$i r0 = (com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.i) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment$i r0 = new com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.A
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.C
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            boolean r12 = r0.f23165z
            java.lang.Object r13 = r0.f23164y
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r2 = r0.f23163x
            ac.m0 r2 = (ac.m0) r2
            java.lang.Object r5 = r0.f23162w
            com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment r5 = (com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment) r5
            wn.m.b(r14)
            r14 = r12
            r12 = r2
            goto L66
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            wn.m.b(r14)
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            androidx.appcompat.widget.AppCompatImageView r2 = r12.K
            java.lang.String r5 = "binding.senderProfileImageView"
            jo.p.g(r2, r5)
            r14[r3] = r2
            androidx.appcompat.widget.AppCompatTextView r2 = r12.L
            java.lang.String r5 = "binding.senderProfileNameTextView"
            jo.p.g(r2, r5)
            r14[r4] = r2
            java.util.List r14 = xn.s.m(r14)
            java.util.Iterator r14 = r14.iterator()
            r5 = r11
            r10 = r14
            r14 = r13
            r13 = r10
        L66:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r13.next()
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r3)
            r6 = 10
            int r7 = de.e.b(r5, r6)
            float r7 = (float) r7
            r2.setTranslationY(r7)
            android.view.animation.AnimationSet r7 = new android.view.animation.AnimationSet
            r7.<init>(r4)
            android.view.animation.DecelerateInterpolator r8 = new android.view.animation.DecelerateInterpolator
            r8.<init>()
            r7.setInterpolator(r8)
            r8 = 200(0xc8, double:9.9E-322)
            r7.setDuration(r8)
            r8 = 50
            r7.setStartOffset(r8)
            r7.setFillAfter(r4)
            android.view.animation.TranslateAnimation r8 = new android.view.animation.TranslateAnimation
            int r6 = de.e.b(r5, r6)
            float r6 = (float) r6
            float r6 = -r6
            r9 = 0
            r8.<init>(r9, r9, r9, r6)
            r7.addAnimation(r8)
            android.view.animation.AlphaAnimation r6 = new android.view.animation.AlphaAnimation
            r8 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r9, r8)
            r7.addAnimation(r6)
            r0.f23162w = r5
            r0.f23163x = r12
            r0.f23164y = r13
            r0.f23165z = r14
            r0.C = r4
            java.lang.Object r2 = de.n.d(r2, r7, r0)
            if (r2 != r1) goto L66
            return r1
        Lc3:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.J
            if (r14 == 0) goto Lc8
            goto Lca
        Lc8:
            r3 = 8
        Lca:
            r12.setVisibility(r3)
            wn.v r12 = wn.v.f59242a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.M3(ac.m0, boolean, ao.d):java.lang.Object");
    }

    public final Object N3(m0 m0Var, ao.d<? super v> dVar) {
        LottieAnimationView lottieAnimationView = m0Var.N;
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
    public final java.lang.Object O3(ac.m0 r20, java.util.List<? extends ud.a> r21, ud.g1 r22, ao.d<? super wn.v> r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.O3(ac.m0, java.util.List, ud.g1, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P3(ac.m0 r24, int r25, ao.d<? super wn.v> r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftRankingRankUpSenderDialogFragment.P3(ac.m0, int, ao.d):java.lang.Object");
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
        n.a aVar = n.f19083h;
        Context N2 = N2();
        p.g(N2, "requireContext()");
        n a10 = aVar.a(N2, giftRankingBcsvrResponse2, giftItem.getUserId(), giftItem.getUserName(), giftItem.getProfileImageUrl(), giftItem.getBadgeImageUrl());
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window = p33.getWindow()) != null) {
            window.setWindowAnimations(s.f60095b);
        }
        m0 T = m0.T(view);
        T.V(a10);
        p.g(T, "binding");
        J3(T);
        L3(T, a10);
        MRLogger H3 = H3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_RANKING_RANK_UP_DISPLAYED);
        builder.setTargetType(MRLog.TARGET_TYPE_VIEWER);
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put(LogBase.USER_ID, a10.d().h());
        hashMap.put("rank_before", String.valueOf(a10.d().b()));
        hashMap.put("rank_after", String.valueOf(a10.d().a()));
        hashMap.put("grade", giftRankingBcsvrResponse2.getSenderGrade());
        hashMap.put("pt", String.valueOf(a10.d().e()));
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
