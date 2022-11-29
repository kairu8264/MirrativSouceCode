package com.dena.mirrativ.streaming.emomo;

import ac.k0;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
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
public final class GiftAppEventRankingRankUpDialogFragment extends androidx.fragment.app.e implements q0 {
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

        public final GiftAppEventRankingRankUpDialogFragment a(int i10, GiftItem giftItem, String str, String str2) {
            p.h(giftItem, "giftItem");
            p.h(str, "liveId");
            p.h(str2, "liveSentGiftId");
            GiftAppEventRankingRankUpDialogFragment giftAppEventRankingRankUpDialogFragment = new GiftAppEventRankingRankUpDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_EVENT_ID", i10);
            bundle.putSerializable("EXTRA_KEY_GIFT_ITEM", giftItem);
            bundle.putString("EXTRA_KEY_LIVE_ID", str);
            bundle.putString("EXTRA_KEY_LIVE_SENT_GIFT_ID", str2);
            giftAppEventRankingRankUpDialogFragment.V2(bundle);
            return giftAppEventRankingRankUpDialogFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            GiftAppEventRankingRankUpDialogFragment.this.n3();
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
        public final /* synthetic */ ao.d<v> f23102w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ao.d<? super v> dVar) {
            super(0);
            this.f23102w = dVar;
        }

        public final void a() {
            ao.d<v> dVar = this.f23102w;
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
        public final /* synthetic */ ComponentCallbacks f23103w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23104x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23105y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23103w = componentCallbacks;
            this.f23104x = aVar;
            this.f23105y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f23103w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f23104x, this.f23105y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23106w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23107x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23108y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23106w = componentCallbacks;
            this.f23107x = aVar;
            this.f23108y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f23106w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.m.class), this.f23107x, this.f23108y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23109w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23110x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23111y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23109w = componentCallbacks;
            this.f23110x = aVar;
            this.f23111y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23109w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f23110x, this.f23111y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k0 f23113x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f1 f23114y;

        public g(k0 k0Var, f1 f1Var) {
            this.f23113x = k0Var;
            this.f23114y = f1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            GiftAppEventRankingRankUpDialogFragment giftAppEventRankingRankUpDialogFragment = GiftAppEventRankingRankUpDialogFragment.this;
            uo.l.d(giftAppEventRankingRankUpDialogFragment, null, null, new h(this.f23113x, this.f23114y, null), 3, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$startAnimation$1$1", f = "GiftAppEventRankingRankUpDialogFragment.kt", l = {217, 220, 222, 224, 226, 232}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23115w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ k0 f23117y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ f1 f23118z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k0 k0Var, f1 f1Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f23117y = k0Var;
            this.f23118z = f1Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f23117y, this.f23118z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r5.f23115w
                switch(r1) {
                    case 0: goto L2a;
                    case 1: goto L26;
                    case 2: goto L22;
                    case 3: goto L1e;
                    case 4: goto L1a;
                    case 5: goto L16;
                    case 6: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L11:
                wn.m.b(r6)
                goto Lbb
            L16:
                wn.m.b(r6)
                goto L83
            L1a:
                wn.m.b(r6)
                goto L6f
            L1e:
                wn.m.b(r6)
                goto L55
            L22:
                wn.m.b(r6)
                goto L47
            L26:
                wn.m.b(r6)
                goto L39
            L2a:
                wn.m.b(r6)
                r1 = 400(0x190, double:1.976E-321)
                r6 = 1
                r5.f23115w = r6
                java.lang.Object r6 = uo.b1.a(r1, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                ac.k0 r1 = r5.f23117y
                r2 = 2
                r5.f23115w = r2
                java.lang.Object r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.C3(r6, r1, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                ac.k0 r1 = r5.f23117y
                r2 = 3
                r5.f23115w = r2
                java.lang.Object r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.D3(r6, r1, r5)
                if (r6 != r0) goto L55
                return r0
            L55:
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                ac.k0 r1 = r5.f23117y
                ud.f1 r2 = r5.f23118z
                java.util.List r2 = r2.g()
                ud.f1 r3 = r5.f23118z
                ud.g1 r3 = r3.i()
                r4 = 4
                r5.f23115w = r4
                java.lang.Object r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.E3(r6, r1, r2, r3, r5)
                if (r6 != r0) goto L6f
                return r0
            L6f:
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                ac.k0 r1 = r5.f23117y
                ud.f1 r2 = r5.f23118z
                int r2 = r2.h()
                r3 = 5
                r5.f23115w = r3
                java.lang.Object r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.F3(r6, r1, r2, r5)
                if (r6 != r0) goto L83
                return r0
            L83:
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r1 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                android.app.Dialog r1 = r1.p3()
                if (r1 == 0) goto L9f
                android.view.Window r1 = r1.getWindow()
                if (r1 == 0) goto L9f
                android.view.View r1 = r1.getDecorView()
                if (r1 == 0) goto L9f
                r1.getWindowVisibleDisplayFrame(r6)
            L9f:
                int r6 = r6.height()
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r1 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                r2 = 710(0x2c6, float:9.95E-43)
                int r1 = de.e.b(r1, r2)
                if (r6 <= r1) goto Lbb
                com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.this
                ac.k0 r1 = r5.f23117y
                r2 = 6
                r5.f23115w = r2
                java.lang.Object r6 = com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.G3(r6, r1, r5)
                if (r6 != r0) goto Lbb
                return r0
            Lbb:
                ac.k0 r6 = r5.f23117y
                androidx.appcompat.widget.AppCompatImageView r6 = r6.B
                r0 = 0
                r6.setVisibility(r0)
                wn.v r6 = wn.v.f59242a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment", f = "GiftAppEventRankingRankUpDialogFragment.kt", l = {249}, m = "startStep2EventInfoViewAnimation")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f23119w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23120x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f23121y;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23121y = obj;
            this.A |= Integer.MIN_VALUE;
            return GiftAppEventRankingRankUpDialogFragment.this.N3(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment", f = "GiftAppEventRankingRankUpDialogFragment.kt", l = {284, 316, 320}, m = "startStep4RouletteAnimation")
    /* loaded from: classes2.dex */
    public static final class j extends co.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: w  reason: collision with root package name */
        public Object f23123w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23124x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23125y;

        /* renamed from: z  reason: collision with root package name */
        public Object f23126z;

        public j(ao.d<? super j> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return GiftAppEventRankingRankUpDialogFragment.this.P3(null, null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends Property<RecyclerView, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public int f23127a;

        public k(Class<Integer> cls) {
            super(cls, "verticalScrollOffset");
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(RecyclerView recyclerView) {
            p.h(recyclerView, "object");
            Integer valueOf = Integer.valueOf(recyclerView.computeVerticalScrollOffset());
            this.f23127a = valueOf.intValue();
            return valueOf;
        }

        public void b(RecyclerView recyclerView, int i10) {
            p.h(recyclerView, "object");
            int i11 = this.f23127a;
            this.f23127a = i10;
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
        public final /* synthetic */ k0 f23128a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g1 f23129b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f23130c;

        public l(k0 k0Var, g1 g1Var, ObjectAnimator objectAnimator) {
            this.f23128a = k0Var;
            this.f23129b = g1Var;
            this.f23130c = objectAnimator;
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
            this.f23128a.K.b(this.f23129b, this.f23130c.getDuration());
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment", f = "GiftAppEventRankingRankUpDialogFragment.kt", l = {404}, m = "startStep5NewRankAnimation")
    /* loaded from: classes2.dex */
    public static final class m extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f23131w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23132x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23133y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f23134z;

        public m(ao.d<? super m> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23134z = obj;
            this.B |= Integer.MIN_VALUE;
            return GiftAppEventRankingRankUpDialogFragment.this.Q3(null, 0, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment", f = "GiftAppEventRankingRankUpDialogFragment.kt", l = {456}, m = "startStep6DescriptionTextAnimation")
    /* loaded from: classes2.dex */
    public static final class n extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f23135w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23136x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f23137y;

        public n(ao.d<? super n> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23137y = obj;
            this.A |= Integer.MIN_VALUE;
            return GiftAppEventRankingRankUpDialogFragment.this.R3(null, this);
        }
    }

    public GiftAppEventRankingRankUpDialogFragment() {
        super(xb.p.dialog_fragment_gift_app_event_ranking_rank_up);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        this.P0 = wn.g.b(iVar, new e(this, null, null));
        this.Q0 = wn.g.b(iVar, new f(this, null, null));
    }

    public final kf.m H3() {
        return (kf.m) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final MRLogger I3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final x J3() {
        return (x) this.O0.getValue();
    }

    public final void K3(k0 k0Var) {
        AppCompatImageView appCompatImageView = k0Var.B;
        p.g(appCompatImageView, "binding.closeButtonView");
        yd.g1.a(appCompatImageView, new b());
        RecyclerView recyclerView = k0Var.O;
        final Context N2 = N2();
        recyclerView.setLayoutManager(new LinearLayoutManager(N2) { // from class: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$setupUserActions$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
            public boolean w() {
                boolean z10;
                z10 = GiftAppEventRankingRankUpDialogFragment.this.S0;
                return z10;
            }
        });
    }

    public final Object L3(FragmentManager fragmentManager, String str, ao.d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        this.R0 = new c(iVar);
        z3(fragmentManager, str);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    public final void M3(k0 k0Var, f1 f1Var) {
        View u10 = k0Var.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new h(k0Var, f1Var, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new g(k0Var, f1Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N3(ac.k0 r10, ao.d<? super wn.v> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.i
            if (r0 == 0) goto L13
            r0 = r11
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$i r0 = (com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.i) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$i r0 = new com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23121y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r10 = r0.f23120x
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f23119w
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r2 = (com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment) r2
            wn.m.b(r11)
            goto L5b
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            wn.m.b(r11)
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            androidx.appcompat.widget.AppCompatImageView r2 = r10.H
            java.lang.String r5 = "binding.iconImageView"
            jo.p.g(r2, r5)
            r11[r3] = r2
            androidx.appcompat.widget.AppCompatTextView r10 = r10.G
            java.lang.String r2 = "binding.eventTitleTextView"
            jo.p.g(r10, r2)
            r11[r4] = r10
            java.util.List r10 = xn.s.m(r11)
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
        L5b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb4
            java.lang.Object r11 = r10.next()
            android.view.View r11 = (android.view.View) r11
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
            r7 = 50
            r6.setStartOffset(r7)
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
            r0.f23119w = r2
            r0.f23120x = r10
            r0.A = r4
            java.lang.Object r11 = de.n.d(r11, r6, r0)
            if (r11 != r1) goto L5b
            return r1
        Lb4:
            wn.v r10 = wn.v.f59242a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.N3(ac.k0, ao.d):java.lang.Object");
    }

    public final Object O3(k0 k0Var, ao.d<? super v> dVar) {
        LottieAnimationView lottieAnimationView = k0Var.Q;
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
    public final java.lang.Object P3(ac.k0 r20, java.util.List<? extends ud.a> r21, ud.g1 r22, ao.d<? super wn.v> r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.P3(ac.k0, java.util.List, ud.g1, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q3(ac.k0 r24, int r25, ao.d<? super wn.v> r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.Q3(ac.k0, int, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R3(ac.k0 r10, ao.d<? super wn.v> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.n
            if (r0 == 0) goto L13
            r0 = r11
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$n r0 = (com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.n) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$n r0 = new com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment$n
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23137y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r10 = r0.f23136x
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f23135w
            com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment r2 = (com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment) r2
            wn.m.b(r11)
            goto L5b
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            wn.m.b(r11)
            androidx.appcompat.widget.LinearLayoutCompat r11 = r10.C
            r11.setVisibility(r3)
            r11 = 3
            androidx.appcompat.widget.AppCompatTextView[] r11 = new androidx.appcompat.widget.AppCompatTextView[r11]
            androidx.appcompat.widget.AppCompatTextView r2 = r10.D
            r11[r3] = r2
            androidx.appcompat.widget.AppCompatTextView r2 = r10.E
            r11[r4] = r2
            r2 = 2
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
            r0.f23135w = r2
            r0.f23136x = r10
            r0.A = r4
            java.lang.Object r11 = uo.b1.a(r5, r0)
            if (r11 != r1) goto L5b
            return r1
        Lb4:
            wn.v r10 = wn.v.f59242a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.GiftAppEventRankingRankUpDialogFragment.R3(ac.k0, ao.d):java.lang.Object");
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
        View decorView;
        Window window2;
        Window window3;
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
            if (giftRankingBcsvrResponse.getEventId() == M2().getInt("EXTRA_KEY_EVENT_ID") && giftRankingBcsvrResponse.isAppEvent()) {
                z10 = true;
                continue;
            } else {
                z10 = false;
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
        f1 a10 = aVar.a(N2, giftRankingBcsvrResponse2, J3().T4(), J3().t4(), J3().u2(), J3().g(), J3().h0(), giftItem.getUserName());
        Dialog p32 = p3();
        if (p32 != null && (window3 = p32.getWindow()) != null) {
            window3.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window2 = p33.getWindow()) != null) {
            window2.setWindowAnimations(s.f60095b);
        }
        k0 T = k0.T(view);
        T.V(a10);
        p.g(T, "binding");
        K3(T);
        Rect rect = new Rect();
        Dialog p34 = p3();
        if (p34 != null && (window = p34.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        if (rect.height() < de.e.b(this, 710)) {
            T.C.setVisibility(8);
        } else {
            T.C.setVisibility(4);
        }
        M3(T, a10);
        MRLogger I3 = I3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_RANKING_RANK_UP_DISPLAYED);
        builder.setTargetType(MRLog.TARGET_TYPE_LIVER);
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put(LogBase.USER_ID, a10.i().h());
        hashMap.put("rank_before", String.valueOf(a10.i().b()));
        hashMap.put("rank_after", String.valueOf(a10.i().a()));
        hashMap.put("grade", giftRankingBcsvrResponse2.getSenderGrade());
        hashMap.put("pt", String.valueOf(a10.i().e()));
        hashMap.put(MRLog.PAYLOAD_GIFT_ID, giftItem.getGiftId());
        hashMap.put("coins", String.valueOf(giftItem.getCoins()));
        hashMap.put("count", String.valueOf(giftItem.getCount()));
        hashMap.put("gift_point", String.valueOf(giftItem.getPoint()));
        String string = M2().getString("EXTRA_KEY_LIVE_ID");
        p.e(string);
        hashMap.put(MRLog.PAYLOAD_KEY_LIVE_ID, string);
        hashMap.put("app_event_id", String.valueOf(M2().getInt("EXTRA_KEY_EVENT_ID")));
        v vVar = v.f59242a;
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, H3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, J3().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, H3().h()), wn.q.a("page_id", Referer.BROADCAST), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
        I3.sendLog(builder.build());
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
