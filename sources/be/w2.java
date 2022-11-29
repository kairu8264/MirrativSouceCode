package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import ud.f1;
import wn.l;

/* loaded from: classes2.dex */
public final class w2 extends androidx.fragment.app.e implements uo.q0 {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public io.a<wn.v> R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w2 a(int i10, GiftItem giftItem, String str, String str2) {
            jo.p.h(giftItem, "giftItem");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "liveSentGiftId");
            w2 w2Var = new w2();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_EVENT_ID", i10);
            bundle.putSerializable("EXTRA_KEY_GIFT_ITEM", giftItem);
            bundle.putString("EXTRA_KEY_LIVE_ID", str);
            bundle.putString("EXTRA_KEY_LIVE_SENT_GIFT_ID", str2);
            w2Var.V2(bundle);
            return w2Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            w2.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ao.d<wn.v> f18260w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ao.d<? super wn.v> dVar) {
            super(0);
            this.f18260w = dVar;
        }

        public final void a() {
            ao.d<wn.v> dVar = this.f18260w;
            l.a aVar = wn.l.f59224w;
            dVar.resumeWith(wn.l.a(wn.v.f59242a));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18261w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18262x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18263y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18261w = componentCallbacks;
            this.f18262x = aVar;
            this.f18263y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f18261w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f18262x, this.f18263y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18264w = componentCallbacks;
            this.f18265x = aVar;
            this.f18266y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f18264w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f18265x, this.f18266y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18267w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18268x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18269y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18267w = componentCallbacks;
            this.f18268x = aVar;
            this.f18269y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f18267w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f18268x, this.f18269y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ae.r3 f18271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ud.f1 f18272y;

        public g(ae.r3 r3Var, ud.f1 f1Var) {
            this.f18271x = r3Var;
            this.f18272y = f1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            w2 w2Var = w2.this;
            uo.l.d(w2Var, null, null, new h(this.f18271x, this.f18272y, null), 3, null);
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveGameRankUpDialogFragment$startAnimation$1$1", f = "LiveGameRankUpDialogFragment.kt", l = {185, TsExtractor.TS_PACKET_SIZE, 190, PsExtractor.AUDIO_STREAM, 197}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f18273w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ae.r3 f18275y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ud.f1 f18276z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ae.r3 r3Var, ud.f1 f1Var, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f18275y = r3Var;
            this.f18276z = f1Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f18275y, this.f18276z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f18273w
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
                goto L98
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                wn.m.b(r10)
                goto L6f
            L28:
                wn.m.b(r10)
                goto L5c
            L2c:
                wn.m.b(r10)
                goto L4f
            L30:
                wn.m.b(r10)
                goto L42
            L34:
                wn.m.b(r10)
                r7 = 400(0x190, double:1.976E-321)
                r9.f18273w = r6
                java.lang.Object r10 = uo.b1.a(r7, r9)
                if (r10 != r0) goto L42
                return r0
            L42:
                be.w2 r10 = be.w2.this
                ae.r3 r1 = r9.f18275y
                r9.f18273w = r5
                java.lang.Object r10 = be.w2.B3(r10, r1, r9)
                if (r10 != r0) goto L4f
                return r0
            L4f:
                be.w2 r10 = be.w2.this
                ae.r3 r1 = r9.f18275y
                r9.f18273w = r4
                java.lang.Object r10 = be.w2.C3(r10, r1, r9)
                if (r10 != r0) goto L5c
                return r0
            L5c:
                be.w2 r10 = be.w2.this
                ae.r3 r1 = r9.f18275y
                ud.f1 r4 = r9.f18276z
                int r4 = r4.h()
                r9.f18273w = r3
                java.lang.Object r10 = be.w2.D3(r10, r1, r4, r9)
                if (r10 != r0) goto L6f
                return r0
            L6f:
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                be.w2 r1 = be.w2.this
                android.app.Dialog r1 = r1.p3()
                if (r1 == 0) goto L8b
                android.view.Window r1 = r1.getWindow()
                if (r1 == 0) goto L8b
                android.view.View r1 = r1.getDecorView()
                if (r1 == 0) goto L8b
                r1.getWindowVisibleDisplayFrame(r10)
            L8b:
                be.w2 r10 = be.w2.this
                ae.r3 r1 = r9.f18275y
                r9.f18273w = r2
                java.lang.Object r10 = be.w2.E3(r10, r1, r9)
                if (r10 != r0) goto L98
                return r0
            L98:
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: be.w2.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveGameRankUpDialogFragment", f = "LiveGameRankUpDialogFragment.kt", l = {309}, m = "startStep4NewRankAnimation")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f18277w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18278x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18279y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f18280z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f18280z = obj;
            this.B |= Integer.MIN_VALUE;
            return w2.this.N3(null, 0, this);
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveGameRankUpDialogFragment", f = "LiveGameRankUpDialogFragment.kt", l = {361}, m = "startStep6DescriptionTextAnimation")
    /* loaded from: classes2.dex */
    public static final class j extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f18281w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18282x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f18283y;

        public j(ao.d<? super j> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f18283y = obj;
            this.A |= Integer.MIN_VALUE;
            return w2.this.O3(null, this);
        }
    }

    public w2() {
        super(nd.b1.dialog_fragment_live_game_rank_up);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new d(this, null, null));
        this.P0 = wn.g.b(iVar, new e(this, null, null));
        this.Q0 = wn.g.b(iVar, new f(this, null, null));
    }

    public final kf.m F3() {
        return (kf.m) this.P0.getValue();
    }

    public final MRLogger G3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final kf.x H3() {
        return (kf.x) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    public final void I3(ae.r3 r3Var) {
        AppCompatImageView appCompatImageView = r3Var.B;
        jo.p.g(appCompatImageView, "binding.closeButtonView");
        yd.g1.a(appCompatImageView, new b());
    }

    public final Object J3(FragmentManager fragmentManager, String str, ao.d<? super wn.v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        this.R0 = new c(iVar);
        z3(fragmentManager, str);
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    public final void K3(ae.r3 r3Var, ud.f1 f1Var) {
        View u10 = r3Var.u();
        jo.p.g(u10, "binding.root");
        if (o3.c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new h(r3Var, f1Var, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new g(r3Var, f1Var));
        }
    }

    public final Object L3(ae.r3 r3Var, ao.d<? super wn.v> dVar) {
        r3Var.H.setVisibility(0);
        r3Var.H.setTranslationY(de.e.b(this, 10));
        AppCompatImageView appCompatImageView = r3Var.H;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -de.e.b(this, 10));
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        appCompatImageView.startAnimation(translateAnimation);
        r3Var.G.setVisibility(0);
        r3Var.G.setTranslationY(de.e.b(this, 10));
        AppCompatTextView appCompatTextView = r3Var.G;
        jo.p.g(appCompatTextView, "binding.eventTitleTextView");
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -de.e.b(this, 10));
        translateAnimation2.setInterpolator(new DecelerateInterpolator());
        translateAnimation2.setDuration(200L);
        translateAnimation2.setFillAfter(true);
        Object d10 = de.n.d(appCompatTextView, translateAnimation2, dVar);
        return d10 == bo.c.c() ? d10 : wn.v.f59242a;
    }

    public final Object M3(ae.r3 r3Var, ao.d<? super wn.v> dVar) {
        LottieAnimationView lottieAnimationView = r3Var.M;
        jo.p.g(lottieAnimationView, "binding.titleLottieView");
        Object a10 = de.i.a(lottieAnimationView, dVar);
        return a10 == bo.c.c() ? a10 : wn.v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N3(ae.r3 r24, int r25, ao.d<? super wn.v> r26) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.w2.N3(ae.r3, int, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O3(ae.r3 r10, ao.d<? super wn.v> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof be.w2.j
            if (r0 == 0) goto L13
            r0 = r11
            be.w2$j r0 = (be.w2.j) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            be.w2$j r0 = new be.w2$j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18283y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r10 = r0.f18282x
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.f18281w
            be.w2 r2 = (be.w2) r2
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
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r10.next()
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            if (r11 == 0) goto L5b
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
            r0.f18281w = r2
            r0.f18282x = r10
            r0.A = r4
            java.lang.Object r11 = uo.b1.a(r5, r0)
            if (r11 != r1) goto L5b
            return r1
        Lb6:
            wn.v r10 = wn.v.f59242a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: be.w2.O3(ae.r3, ao.d):java.lang.Object");
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
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Serializable serializable = M2().getSerializable("EXTRA_KEY_GIFT_ITEM");
        jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.bcsvr.response.GiftItem");
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
        f1.a aVar = ud.f1.f54917i;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ud.f1 a10 = aVar.a(N2, giftRankingBcsvrResponse2, H3().T4(), H3().t4(), H3().u2(), H3().g(), H3().h0(), giftItem.getUserName());
        Dialog p32 = p3();
        if (p32 != null && (window3 = p32.getWindow()) != null) {
            window3.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null && (window2 = p33.getWindow()) != null) {
            window2.setWindowAnimations(nd.g1.f42005c);
        }
        ae.r3 T = ae.r3.T(view);
        T.V(a10);
        jo.p.g(T, "binding");
        I3(T);
        Rect rect = new Rect();
        Dialog p34 = p3();
        if (p34 != null && (window = p34.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        K3(T, a10);
        MRLogger G3 = G3();
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
        jo.p.e(string);
        hashMap.put(MRLog.PAYLOAD_KEY_LIVE_ID, string);
        hashMap.put("is_app_event", "true");
        hashMap.put("app_event_id", String.valueOf(M2().getInt("EXTRA_KEY_EVENT_ID")));
        wn.v vVar = wn.v.f59242a;
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, F3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, H3().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, F3().h()), wn.q.a("page_id", Referer.LIVE_GAME), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
        G3.sendLog(builder.build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        io.a<wn.v> aVar = this.R0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
