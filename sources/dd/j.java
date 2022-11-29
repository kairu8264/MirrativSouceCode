package dd;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.customview.RoundedButtonView;
import de.n;
import ed.c;
import hf.w;
import io.l;
import jo.f0;
import jo.p;
import o3.c0;
import od.s;
import pc.c1;
import uo.b1;
import uo.q0;
import uo.r0;
import vb.t;
import wn.q;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class j extends androidx.fragment.app.e implements q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0;
    public t O0;
    public final wn.f P0;
    public final wn.f Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(ub.c cVar) {
            p.h(cVar, "rankingPrizeData");
            j jVar = new j();
            jVar.V2(k3.b.a(q.a("EXTRA_RANKING_PRIZE_DATA", cVar)));
            return jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j.this.n3();
            t tVar = j.this.O0;
            if (tVar != null) {
                tVar.j();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f29575w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29576x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29577y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f29575w = componentCallbacks;
            this.f29576x = aVar;
            this.f29577y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final s invoke() {
            ComponentCallbacks componentCallbacks = this.f29575w;
            return gq.a.a(componentCallbacks).c(f0.b(s.class), this.f29576x, this.f29577y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f29578w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29579x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f29578w = componentCallbacks;
            this.f29579x = aVar;
            this.f29580y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.w, java.lang.Object] */
        @Override // io.a
        public final w invoke() {
            ComponentCallbacks componentCallbacks = this.f29578w;
            return gq.a.a(componentCallbacks).c(f0.b(w.class), this.f29579x, this.f29580y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ed.c f29582x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c1 f29583y;

        public f(ed.c cVar, c1 c1Var) {
            this.f29582x = cVar;
            this.f29583y = c1Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            j jVar = j.this;
            uo.l.d(jVar, null, null, new g(this.f29582x, jVar, this.f29583y, null), 3, null);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.monthlyranking.RankingPrizeDialogFragment$startAnimation$1$1", f = "RankingPrizeDialogFragment.kt", l = {109, 112, 114, 116, 118}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ c1 A;

        /* renamed from: w  reason: collision with root package name */
        public Object f29584w;

        /* renamed from: x  reason: collision with root package name */
        public int f29585x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ed.c f29586y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ j f29587z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ed.c cVar, j jVar, c1 c1Var, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f29586y = cVar;
            this.f29587z = jVar;
            this.A = c1Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f29586y, this.f29587z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
            if (r8 == null) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f29585x
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L39
                if (r1 == r6) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                wn.m.b(r8)
                goto Lb2
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                wn.m.b(r8)
                goto La5
            L29:
                wn.m.b(r8)
                goto L8c
            L2d:
                java.lang.Object r1 = r7.f29584w
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                wn.m.b(r8)
                goto L77
            L35:
                wn.m.b(r8)
                goto L53
            L39:
                wn.m.b(r8)
                ed.c r8 = r7.f29586y
                java.lang.String r8 = r8.a()
                if (r8 == 0) goto L57
                dd.j r1 = r7.f29587z
                hf.w r1 = dd.j.B3(r1)
                r7.f29585x = r6
                java.lang.Object r8 = r1.execute(r8, r7)
                if (r8 != r0) goto L53
                return r0
            L53:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                if (r8 != 0) goto L67
            L57:
                dd.j r8 = r7.f29587z
                android.content.Context r8 = r8.N2()
                android.content.res.Resources r8 = r8.getResources()
                int r1 = nc.d.W
                android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r8, r1)
            L67:
                r1 = r8
                dd.j r8 = r7.f29587z
                pc.c1 r6 = r7.A
                r7.f29584w = r1
                r7.f29585x = r5
                java.lang.Object r8 = dd.j.D3(r8, r6, r7)
                if (r8 != r0) goto L77
                return r0
            L77:
                dd.j r8 = r7.f29587z
                pc.c1 r5 = r7.A
                java.lang.String r6 = "avatarBodyImage"
                jo.p.g(r1, r6)
                r6 = 0
                r7.f29584w = r6
                r7.f29585x = r4
                java.lang.Object r8 = dd.j.E3(r8, r5, r1, r7)
                if (r8 != r0) goto L8c
                return r0
            L8c:
                dd.j r8 = r7.f29587z
                pc.c1 r1 = r7.A
                ed.c r4 = r7.f29586y
                int r4 = r4.c()
                ed.c r5 = r7.f29586y
                ad.l2 r5 = r5.b()
                r7.f29585x = r3
                java.lang.Object r8 = dd.j.F3(r8, r1, r4, r5, r7)
                if (r8 != r0) goto La5
                return r0
            La5:
                dd.j r8 = r7.f29587z
                pc.c1 r1 = r7.A
                r7.f29585x = r2
                java.lang.Object r8 = dd.j.G3(r8, r1, r7)
                if (r8 != r0) goto Lb2
                return r0
            Lb2:
                dd.j r8 = r7.f29587z
                pc.c1 r0 = r7.A
                dd.j.H3(r8, r0)
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.monthlyranking.RankingPrizeDialogFragment", f = "RankingPrizeDialogFragment.kt", l = {220, 239, 258, 277, 296}, m = "startStep4NewRankAnimation")
    /* loaded from: classes2.dex */
    public static final class h extends co.d {

        /* renamed from: w  reason: collision with root package name */
        public Object f29588w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f29589x;

        /* renamed from: z  reason: collision with root package name */
        public int f29591z;

        public h(ao.d<? super h> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29589x = obj;
            this.f29591z |= Integer.MIN_VALUE;
            return j.this.O3(null, 0, null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.monthlyranking.RankingPrizeDialogFragment", f = "RankingPrizeDialogFragment.kt", l = {346, 349, 377}, m = "startStep5ImageAndTextAnimation")
    /* loaded from: classes2.dex */
    public static final class i extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f29592w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29593x;

        /* renamed from: y  reason: collision with root package name */
        public float f29594y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f29595z;

        public i(ao.d<? super i> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29595z = obj;
            this.B |= Integer.MIN_VALUE;
            return j.this.P3(null, this);
        }
    }

    public j() {
        super(nc.f.dialog_fragment_ranking_prize);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new d(this, null, null));
        this.Q0 = wn.g.b(iVar, new e(this, null, null));
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final w I3() {
        return (w) this.Q0.getValue();
    }

    public final s J3() {
        return (s) this.P0.getValue();
    }

    public final void K3(c1 c1Var) {
        AppCompatImageView appCompatImageView = c1Var.D;
        p.g(appCompatImageView, "binding.closeButtonView");
        g1.a(appCompatImageView, new b());
        RoundedButtonView roundedButtonView = c1Var.C;
        p.g(roundedButtonView, "binding.checkButton");
        g1.a(roundedButtonView, new c());
    }

    public final void L3(c1 c1Var, ed.c cVar) {
        Window window;
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setWindowAnimations(nd.g1.f42005c);
        }
        View u10 = c1Var.u();
        p.g(u10, "binding.root");
        if (c0.V(u10) && !u10.isLayoutRequested()) {
            uo.l.d(this, null, null, new g(cVar, this, c1Var, null), 3, null);
        } else {
            u10.addOnLayoutChangeListener(new f(cVar, c1Var));
        }
    }

    public final Object M3(c1 c1Var, ao.d<? super v> dVar) {
        c1Var.f46381a0.setVisibility(0);
        c1Var.f46381a0.r();
        Object a10 = b1.a(400L, dVar);
        return a10 == bo.c.c() ? a10 : v.f59242a;
    }

    public final Object N3(c1 c1Var, Bitmap bitmap, ao.d<? super v> dVar) {
        c1Var.B.setImageBitmap(bitmap);
        c1Var.B.setVisibility(0);
        c1Var.B.setTranslationY(de.e.b(this, 55));
        AppCompatImageView appCompatImageView = c1Var.B;
        p.g(appCompatImageView, "binding.avatarImageView");
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(450L);
        animationSet.setFillAfter(true);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -de.e.b(this, 70));
        translateAnimation.setDuration(200L);
        animationSet2.addAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, de.e.b(this, 20));
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(200L);
        translateAnimation2.setDuration(150L);
        animationSet2.addAnimation(translateAnimation2);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -de.e.b(this, 5));
        translateAnimation3.setInterpolator(new LinearInterpolator());
        translateAnimation3.setStartOffset(350L);
        translateAnimation3.setDuration(100L);
        animationSet2.addAnimation(translateAnimation3);
        animationSet.addAnimation(animationSet2);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        Object d10 = n.d(appCompatImageView, animationSet, dVar);
        return d10 == bo.c.c() ? d10 : v.f59242a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O3(pc.c1 r30, int r31, ad.l2 r32, ao.d<? super wn.v> r33) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.j.O3(pc.c1, int, ad.l2, ao.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[LOOP:0: B:30:0x0107->B:32:0x010d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0156 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d4 -> B:24:0x00d7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P3(pc.c1 r18, ao.d<? super wn.v> r19) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.j.P3(pc.c1, ao.d):java.lang.Object");
    }

    public final void Q3(c1 c1Var) {
        RoundedButtonView roundedButtonView = c1Var.C;
        p.g(roundedButtonView, "binding.checkButton");
        AppCompatImageView appCompatImageView = c1Var.D;
        p.g(appCompatImageView, "binding.closeButtonView");
        for (View view : xn.s.m(roundedButtonView, appCompatImageView)) {
            view.setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            view.startAnimation(animationSet);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Parcelable parcelable = M2().getParcelable("EXTRA_RANKING_PRIZE_DATA");
        if (parcelable != null) {
            p.g(parcelable, "requireNotNull(requireAr…XTRA_RANKING_PRIZE_DATA))");
            ub.c cVar = (ub.c) parcelable;
            c1 T = c1.T(view);
            c.a aVar = ed.c.f30537f;
            Context N2 = N2();
            p.g(N2, "requireContext()");
            ed.c a10 = aVar.a(N2, cVar);
            T.V(a10);
            Dialog p32 = p3();
            if (p32 != null && (window = p32.getWindow()) != null) {
                window.setLayout(-1, -1);
            }
            p.g(T, "binding");
            K3(T);
            L3(T, a10);
            J3().k(cVar.f());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nc.j.f41900a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        Fragment H0 = H0();
        this.O0 = H0 instanceof t ? (t) H0 : null;
        super.x1(context);
    }
}
