package lb;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.u;
import com.dena.mirrativ.player.gifting.panel.GiftPanelView;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hb.w1;
import hb.x1;
import java.util.Arrays;
import java.util.List;
import jf.s;
import jo.i0;
import jo.q;
import kb.k1;
import nd.z0;
import nf.z;
import ud.y0;
import uo.q0;
import uo.r0;
import wn.v;
import xn.n0;
import xn.r;

/* loaded from: classes2.dex */
public final class h extends com.google.android.material.bottomsheet.b implements q0 {
    public static final a X0 = new a(null);
    public static final int Y0 = 8;
    public final /* synthetic */ da.j O0 = new da.j();
    public k1 P0;
    public FragmentRunner Q0;
    public lb.l R0;
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

        public final h a() {
            return new h();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements f0 {
        public b() {
        }

        @Override // androidx.lifecycle.f0
        public final void d(T t10) {
            jf.f fVar = (jf.f) t10;
            AppCompatTextView appCompatTextView = h.this.L3().E;
            i0 i0Var = i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.c())}, 1));
            jo.p.g(format, "format(format, *args)");
            appCompatTextView.setText(format);
            AppCompatTextView appCompatTextView2 = h.this.L3().I;
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(fVar.d())}, 1));
            jo.p.g(format2, "format(format, *args)");
            appCompatTextView2.setText(format2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> implements f0 {
        public c() {
        }

        @Override // androidx.lifecycle.f0
        public final void d(T t10) {
            h.this.L3().J.setGiftPanels((List) t10);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.gifting.GiftPanelBottomSheetDialogFragment$observeStoreValues$3", f = "GiftPanelBottomSheetDialogFragment.kt", l = {248}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f39787w;

        /* renamed from: x  reason: collision with root package name */
        public Object f39788x;

        /* renamed from: y  reason: collision with root package name */
        public Object f39789y;

        /* renamed from: z  reason: collision with root package name */
        public int f39790z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:17:0x0054, B:19:0x005c), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f39790z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f39789y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f39788x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f39787w
                lb.h r4 = (lb.h) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L7e
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                lb.h r10 = lb.h.this
                nf.z r10 = lb.h.K3(r10)
                wo.x r3 = r10.K0()
                lb.h r10 = lb.h.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7e
                r4 = r10
                r10 = r9
            L3d:
                r10.f39787w = r4     // Catch: java.lang.Throwable -> L7e
                r10.f39788x = r3     // Catch: java.lang.Throwable -> L7e
                r10.f39789y = r1     // Catch: java.lang.Throwable -> L7e
                r10.f39790z = r2     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L7e
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7b
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7b
                if (r10 == 0) goto L75
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7b
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L7b
                android.content.Context r10 = r5.N2()     // Catch: java.lang.Throwable -> L7b
                int r6 = hb.b2.f34715b     // Catch: java.lang.Throwable -> L7b
                r7 = 0
                of.n.A(r10, r6, r7)     // Catch: java.lang.Throwable -> L7b
                r5.m3()     // Catch: java.lang.Throwable -> L7b
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L75:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7b:
                r10 = move-exception
                r3 = r4
                goto L7f
            L7e:
                r10 = move-exception
            L7f:
                throw r10     // Catch: java.lang.Throwable -> L80
            L80:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lb.h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<y0, v> {
        public e() {
            super(1);
        }

        public final void a(y0 y0Var) {
            jo.p.h(y0Var, MRLog.TARGET_TYPE_BANNER);
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.W(y0Var);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(y0 y0Var) {
            a(y0Var);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.p<PlayerGiftPagerCell, jf.q, v> {
        public f() {
            super(2);
        }

        public final void a(PlayerGiftPagerCell playerGiftPagerCell, jf.q qVar) {
            jo.p.h(playerGiftPagerCell, "cell");
            jo.p.h(qVar, "gift");
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.R0(playerGiftPagerCell, qVar);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(PlayerGiftPagerCell playerGiftPagerCell, jf.q qVar) {
            a(playerGiftPagerCell, qVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.l<jf.q, v> {
        public g() {
            super(1);
        }

        public final void a(jf.q qVar) {
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.D(qVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(jf.q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* renamed from: lb.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0572h extends q implements io.l<jf.q, v> {
        public C0572h() {
            super(1);
        }

        public final void a(jf.q qVar) {
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.h1(qVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(jf.q qVar) {
            a(qVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<v> {
        public i() {
            super(0);
        }

        public final void a() {
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.M1();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.l<String, v> {
        public j() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "liveGameId");
            lb.l lVar = h.this.R0;
            if (lVar != null) {
                lVar.v0(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.l<s, v> {
        public k() {
            super(1);
        }

        public final void a(s sVar) {
            jo.p.h(sVar, "giftPanel");
            MRLogger M3 = h.this.M3();
            MRLog.Companion companion = MRLog.Companion;
            h hVar = h.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GIFT_PANEL_TAB_IMP);
            builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
            String f10 = hVar.O3().s0().f();
            if (f10 == null) {
                f10 = "";
            }
            builder.setTargetId(f10);
            builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new xm.e().s(n0.g(wn.q.a(MRLog.PAYLOAD_TAB_ID, sVar.f()))))));
            M3.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(s sVar) {
            a(sVar);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<hb.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39798w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39799x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39800y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39798w = componentCallbacks;
            this.f39799x = aVar;
            this.f39800y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hb.i, java.lang.Object] */
        @Override // io.a
        public final hb.i invoke() {
            ComponentCallbacks componentCallbacks = this.f39798w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hb.i.class), this.f39799x, this.f39800y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39801w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39802x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39803y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39801w = componentCallbacks;
            this.f39802x = aVar;
            this.f39803y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final z invoke() {
            ComponentCallbacks componentCallbacks = this.f39801w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(z.class), this.f39802x, this.f39803y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39804w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39805x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39806y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39804w = componentCallbacks;
            this.f39805x = aVar;
            this.f39806y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f39804w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f39805x, this.f39806y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39807w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39808x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39809y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39807w = componentCallbacks;
            this.f39808x = aVar;
            this.f39809y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f39807w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f39808x, this.f39809y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f39810w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f39811x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f39812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f39810w = componentCallbacks;
            this.f39811x = aVar;
            this.f39812y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f39810w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f39811x, this.f39812y);
        }
    }

    public h() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new l(this, null, null));
        this.T0 = wn.g.b(iVar, new m(this, null, null));
        this.U0 = wn.g.b(iVar, new n(this, null, null));
        this.V0 = wn.g.b(iVar, new o(this, null, null));
        this.W0 = wn.g.b(iVar, new p(this, null, null));
    }

    public static final void Q3(DialogInterface dialogInterface) {
        WindowManager.LayoutParams layoutParams;
        jo.p.f(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        View findViewById = aVar.findViewById(w1.f35020p0);
        if (findViewById != null) {
            findViewById.setBackgroundResource(17170445);
            BottomSheetBehavior.c0(findViewById).z0(3);
            Window window = aVar.getWindow();
            if (window == null) {
                return;
            }
            Window window2 = aVar.getWindow();
            if (window2 == null || (layoutParams = window2.getAttributes()) == null) {
                layoutParams = null;
            } else {
                jo.p.g(layoutParams, "attributes");
                layoutParams.dimAmount = 0.0f;
                layoutParams.flags |= 2;
            }
            window.setAttributes(layoutParams);
        }
    }

    public static final void R3(h hVar, View view) {
        jo.p.h(hVar, "this$0");
        lb.l lVar = hVar.R0;
        if (lVar != null) {
            lVar.s1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        this.P0 = (k1) androidx.databinding.f.e(layoutInflater, x1.view_player_gift, null, false);
        View u10 = L3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        this.P0 = null;
        r0.d(this, null, 1, null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.R0 = null;
        N3().K();
    }

    public final k1 L3() {
        k1 k1Var = this.P0;
        jo.p.e(k1Var);
        return k1Var;
    }

    public final MRLogger M3() {
        return (MRLogger) this.W0.getValue();
    }

    public final hb.i N3() {
        return (hb.i) this.S0.getValue();
    }

    public final z O3() {
        return (z) this.T0.getValue();
    }

    public final void P3() {
        LiveData<jf.f> h02 = O3().h0();
        u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        h02.i(a12, new b());
        LiveData<List<s>> N0 = O3().N0();
        u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        N0.i(a13, new c());
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void S3() {
        k1 k1Var = this.P0;
        if (k1Var == null) {
            return;
        }
        k1Var.J.p();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(z0.f42369y3)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        this.Q0 = new FragmentRunner(a12);
        Dialog p32 = p3();
        if (p32 != null) {
            p32.setOnShowListener(lb.f.f39783a);
        }
        L3().C.setOnClickListener(new View.OnClickListener() { // from class: lb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h.R3(h.this, view2);
            }
        });
        GiftPanelView giftPanelView = L3().J;
        giftPanelView.setOnBannerClickedListener(new e());
        giftPanelView.setOnCellClickedListener(new f());
        giftPanelView.setOnGachaTicketClickedListener(new g());
        giftPanelView.setOnProgressAnimationEndListener(new C0572h());
        giftPanelView.setOnPageChangedListener(new i());
        giftPanelView.setOnLiveGameGiftHelpClickedListener(new j());
        L3().J.setOnTabSelectedListener(new k());
        P3();
        N3().C();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.R0 = context instanceof lb.l ? (lb.l) context : null;
    }
}
