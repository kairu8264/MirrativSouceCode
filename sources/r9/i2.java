package r9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.emomo.closet.ShooterDressUpDetailView;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.closet.GameEffect;
import com.dena.mirrativ.mirrativapi.closet.GameItemType;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;
import r9.i2;
import r9.w1;
import sf.i;
import ud.t3;

/* loaded from: classes.dex */
public final class i2 extends androidx.fragment.app.e implements uo.q0 {
    public final /* synthetic */ da.j N0;
    public final AutoClearedValue O0;
    public vb.v P0;
    public vb.p Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public ViewTreeObserver.OnGlobalLayoutListener X0;
    public final r9.k Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final wn.f f50169a1;

    /* renamed from: b1  reason: collision with root package name */
    public final wn.f f50170b1;

    /* renamed from: c1  reason: collision with root package name */
    public final wn.f f50171c1;

    /* renamed from: e1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f50167e1 = {jo.f0.d(new jo.s(i2.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentShooterDressUpBinding;", 0))};

    /* renamed from: d1  reason: collision with root package name */
    public static final a f50166d1 = new a(null);

    /* renamed from: f1  reason: collision with root package name */
    public static final int f50168f1 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i2 a() {
            return new i2();
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50172w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Fragment fragment) {
            super(0);
            this.f50172w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50172w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50172w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<Float> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(de.e.b(i2.this, 40));
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50174w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar) {
            super(0);
            this.f50174w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50174w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<Float> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(i2.this.O0().getDimension(q9.e.shooter_dress_up_height));
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50176w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50177x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50178y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50179z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50176w = aVar;
            this.f50177x = aVar2;
            this.f50178y = aVar3;
            this.f50179z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50176w;
            vq.a aVar2 = this.f50177x;
            io.a aVar3 = this.f50178y;
            xq.a aVar4 = this.f50179z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<Float> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((200 * (i2.this.O0().getDisplayMetrics().widthPixels / 360.0f)) + i2.this.O0().getDimension(q9.e.emomo_dress_up_header_height) + i2.this.O0().getDimension(q9.e.emomo_dress_up_footer_height));
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50181w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(io.a aVar) {
            super(0);
            this.f50181w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50181w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<Float> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(de.e.b(i2.this, 8));
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f50183a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f50184b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f50185c;

        public f(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f50183a = c0Var;
            this.f50184b = liveData;
            this.f50185c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T t10;
            boolean z10;
            GameItemType gameItemType;
            T f10 = this.f50183a.f();
            Object f11 = this.f50184b.f();
            Object f12 = this.f50185c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f50183a;
            List list = (List) f12;
            wn.k kVar = (wn.k) f10;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = ((List) f11).iterator();
            while (true) {
                boolean z11 = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                GameEffect h10 = ((ud.q) next).h();
                if (h10 != null && (gameItemType = h10.getGameItemType()) != null) {
                    z11 = gameItemType.isShooter();
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it2.next();
                ud.p pVar = (ud.p) t10;
                ud.q qVar = pVar instanceof ud.q ? (ud.q) pVar : null;
                if (qVar != null) {
                    z10 = qVar.q();
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            c0Var.p(wn.q.a(arrayList, t10 instanceof ud.q ? (ud.q) t10 : null));
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ud.q f50186w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ i2 f50187x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ud.q qVar, i2 i2Var) {
            super(1);
            this.f50186w = qVar;
            this.f50187x = i2Var;
        }

        public final void a(View view) {
            vb.p pVar;
            jo.p.h(view, "it");
            String e10 = this.f50186w.e();
            if (e10 == null || (pVar = this.f50187x.Q0) == null) {
                return;
            }
            pVar.j2(e10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.ShooterDressUpDialog$onAppearCloset$1$1", f = "ShooterDressUpDialog.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50188w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f50190y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f50190y = f10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f50190y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f50188w == 0) {
                wn.m.b(obj);
                i2 i2Var = i2.this;
                i2Var.C4(i2Var.c4() - this.f50190y);
                vb.p pVar = i2.this.Q0;
                if (pVar != null) {
                    pVar.W0(Math.max(0.0f, this.f50190y - i2.this.b4()));
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements sf.i {
        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i2.this.i4().resume();
            vb.p pVar = i2.this.Q0;
            if (pVar != null) {
                pVar.W0(i2.this.c4());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
            i2.this.i4().pause();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<wn.v> {
        public j() {
            super(0);
        }

        public final void a() {
            vb.v vVar = i2.this.P0;
            if (vVar != null) {
                vVar.I1();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.ShooterDressUpDialog$onDisappearCloset$2", f = "ShooterDressUpDialog.kt", l = {218}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50193w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f50194x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a<wn.v> aVar, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f50194x = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f50194x, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50193w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f50193w = 1;
                if (uo.b1.a(500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f50194x.invoke();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ i2 f50196w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2 i2Var) {
                super(0);
                this.f50196w = i2Var;
            }

            public final void a() {
                vb.v vVar = this.f50196w.P0;
                if (vVar != null) {
                    vVar.I1();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public l() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i2 i2Var = i2.this;
            i2Var.v4(new a(i2Var));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public static final void c(String str, i2 i2Var, File file) {
            String eventBackgroundImageUrl;
            vb.p pVar;
            jo.p.h(str, "$currentFilePath");
            jo.p.h(i2Var, "this$0");
            if (jo.p.c(str, file != null ? file.getAbsolutePath() : null)) {
                return;
            }
            i2Var.f4().f().o(i2Var.a1());
            EventBannerResponse h42 = i2Var.h4();
            if (h42 == null || (eventBackgroundImageUrl = h42.getEventBackgroundImageUrl()) == null || (pVar = i2Var.Q0) == null) {
                return;
            }
            pVar.G2(eventBackgroundImageUrl);
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            vb.p pVar = i2.this.Q0;
            if (pVar != null) {
                pVar.t1();
            }
            File f10 = i2.this.f4().f().f();
            final String absolutePath = f10 != null ? f10.getAbsolutePath() : null;
            if (absolutePath == null) {
                absolutePath = "";
            }
            androidx.lifecycle.e0<File> f11 = i2.this.f4().f();
            androidx.lifecycle.u a12 = i2.this.a1();
            final i2 i2Var = i2.this;
            f11.i(a12, new androidx.lifecycle.f0() { // from class: r9.j2
                @Override // androidx.lifecycle.f0
                public final void d(Object obj) {
                    i2.m.c(absolutePath, i2Var, (File) obj);
                }
            });
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            b(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ i2 f50199w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i2 i2Var) {
                super(0);
                this.f50199w = i2Var;
            }

            public final void a() {
                vb.v vVar = this.f50199w.P0;
                if (vVar != null) {
                    vVar.l1();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i2 i2Var = i2.this;
            i2Var.v4(new a(i2Var));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.l<t3, wn.v> {
        public o() {
            super(1);
        }

        public final void a(t3 t3Var) {
            jo.p.h(t3Var, "bindModel");
            i2 i2Var = i2.this;
            for (jf.d dVar : i2.this.a4().s0().getValue()) {
                i2Var.Z3().g(dVar.a(), dVar.b(), dVar.c());
            }
            i2.this.Z3().C(t3Var.d());
            i2.this.Z3().B(t3Var.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(t3 t3Var) {
            a(t3Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.l<ud.q, wn.v> {
        public p() {
            super(1);
        }

        public final void a(ud.q qVar) {
            jo.p.h(qVar, "partsBindModel");
            if (qVar.f()) {
                i2.this.Z3().l(qVar.j(), qVar.i(), qVar.E());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.l<ud.q, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k2 f50203x;

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f50204a;

            static {
                int[] iArr = new int[jf.k0.values().length];
                iArr[jf.k0.BACKGROUND.ordinal()] = 1;
                iArr[jf.k0.MOTION_UP.ordinal()] = 2;
                iArr[jf.k0.MOTION_LEFT.ordinal()] = 3;
                iArr[jf.k0.MOTION_RIGHT.ordinal()] = 4;
                iArr[jf.k0.MOTION_DOWN.ordinal()] = 5;
                f50204a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(k2 k2Var) {
            super(1);
            this.f50203x = k2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(ud.q r13) {
            /*
                Method dump skipped, instructions count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.i2.q.a(ud.q):void");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {
        public r() {
            super(1);
        }

        public final void a(View view) {
            String eventHelpPageUrl;
            jo.p.h(view, "it");
            EventBannerResponse h42 = i2.this.h4();
            if (h42 == null || (eventHelpPageUrl = h42.getEventHelpPageUrl()) == null) {
                return;
            }
            i2 i2Var = i2.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = i2Var.N2();
            jo.p.g(N2, "requireContext()");
            i2Var.f3(WebViewActivity.a.b(aVar, N2, eventHelpPageUrl, false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.a<EventBannerResponse> {
        public s() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final EventBannerResponse invoke() {
            List<EventBannerResponse> banners;
            boolean z10;
            EventNoticeResponse f10 = i2.this.f4().g().f();
            Object obj = null;
            if (f10 == null || (banners = f10.getBanners()) == null) {
                return null;
            }
            Iterator<T> it = banners.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer eventType = ((EventBannerResponse) next).getEventType();
                if (eventType != null && eventType.intValue() == 8) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj = next;
                    break;
                }
            }
            return (EventBannerResponse) obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50207w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50208x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50207w = componentCallbacks;
            this.f50208x = aVar;
            this.f50209y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f50207w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f50208x, this.f50209y);
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50210w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50211x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50212y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50210w = componentCallbacks;
            this.f50211x = aVar;
            this.f50212y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f50210w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRUnityPlayer.class), this.f50211x, this.f50212y);
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50213w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50214x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50215y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50213w = componentCallbacks;
            this.f50214x = aVar;
            this.f50215y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50213w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50214x, this.f50215y);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50216w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Fragment fragment) {
            super(0);
            this.f50216w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50216w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50216w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50217w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f50217w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50217w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50218w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50219x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50220y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50221z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50218w = aVar;
            this.f50219x = aVar2;
            this.f50220y = aVar3;
            this.f50221z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50218w;
            vq.a aVar2 = this.f50219x;
            io.a aVar3 = this.f50220y;
            xq.a aVar4 = this.f50221z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50222w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar) {
            super(0);
            this.f50222w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50222w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public i2() {
        super(q9.h.dialog_fragment_shooter_dress_up);
        this.N0 = new da.j();
        this.O0 = nd.a.a(this);
        w wVar = new w(this);
        xq.a a10 = gq.a.a(this);
        x xVar = new x(wVar);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new z(xVar), new y(wVar, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new t(this, null, null));
        this.T0 = wn.g.b(iVar, new u(this, null, null));
        a0 a0Var = new a0(this);
        xq.a a11 = gq.a.a(this);
        b0 b0Var = new b0(a0Var);
        this.U0 = androidx.fragment.app.e0.a(this, jo.f0.b(je.e.class), new d0(b0Var), new c0(a0Var, null, null, a11));
        this.V0 = wn.g.b(iVar, new v(this, null, null));
        this.W0 = wn.g.a(new s());
        this.Y0 = new r9.k();
        this.Z0 = wn.g.a(new c());
        this.f50169a1 = wn.g.a(new d());
        this.f50170b1 = wn.g.a(new e());
        this.f50171c1 = wn.g.a(new b());
    }

    public static final void k4(jf.c cVar) {
    }

    public static final void l4(i2 i2Var, Boolean bool) {
        jo.p.h(i2Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            i2Var.Y3().R.setVisibility(0);
        } else {
            i2Var.Y3().R.setVisibility(8);
        }
    }

    public static final void m4(i2 i2Var, Boolean bool) {
        jo.p.h(i2Var, "this$0");
        RoundedButtonView roundedButtonView = i2Var.Y3().U;
        jo.p.g(bool, "isVisible");
        roundedButtonView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void n4(i2 i2Var, Boolean bool) {
        jo.p.h(i2Var, "this$0");
        RoundedButtonView roundedButtonView = i2Var.Y3().W;
        jo.p.g(bool, "isVisible");
        roundedButtonView.setVisibility(bool.booleanValue() ? 0 : 8);
        i2Var.Y3().W.setEnabled(false);
    }

    public static final void o4(i2 i2Var, List list) {
        jo.p.h(i2Var, "this$0");
        RecyclerView.h adapter = i2Var.Y3().O.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.ShooterPartsCategoryAdapter");
        ((l2) adapter).d(list);
    }

    public static final void p4(i2 i2Var, List list) {
        jo.p.h(i2Var, "this$0");
        i2Var.Y3().N.setVisibility(list.isEmpty() ? 0 : 8);
        i2Var.Y0.f(1);
        i2Var.Y0.e(5);
        RecyclerView.h adapter = i2Var.Y3().P.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.ShooterPartsAdapter");
        ((k2) adapter).d(list);
    }

    public static final void q4(i2 i2Var, wn.k kVar) {
        jo.p.h(i2Var, "this$0");
        ShooterDressUpDetailView shooterDressUpDetailView = i2Var.Y3().G;
        w1.a aVar = w1.f50530s;
        Context N2 = i2Var.N2();
        jo.p.g(N2, "requireContext()");
        shooterDressUpDetailView.a(aVar.c(N2, (List) kVar.a(), (ud.q) kVar.b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r4(r9.i2 r6, java.util.List r7) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r6, r0)
            java.lang.String r0 = "partsBindModels"
            jo.p.g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r7.next()
            ud.p r1 = (ud.p) r1
            boolean r3 = r1 instanceof ud.q
            if (r3 == 0) goto L27
            r2 = r1
            ud.q r2 = (ud.q) r2
        L27:
            if (r2 == 0) goto L13
            r0.add(r2)
            goto L13
        L2d:
            java.util.Iterator r7 = r0.iterator()
        L31:
            boolean r0 = r7.hasNext()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L62
            java.lang.Object r0 = r7.next()
            r4 = r0
            ud.q r4 = (ud.q) r4
            boolean r5 = r4.q()
            if (r5 == 0) goto L5e
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L59
            int r4 = r4.length()
            if (r4 <= 0) goto L54
            r4 = r1
            goto L55
        L54:
            r4 = r3
        L55:
            if (r4 != r1) goto L59
            r4 = r1
            goto L5a
        L59:
            r4 = r3
        L5a:
            if (r4 == 0) goto L5e
            r4 = r1
            goto L5f
        L5e:
            r4 = r3
        L5f:
            if (r4 == 0) goto L31
            r2 = r0
        L62:
            ud.q r2 = (ud.q) r2
            r7 = 8
            if (r2 == 0) goto Ld6
            s9.g0 r0 = r6.Y3()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.H
            r0.setVisibility(r3)
            s9.g0 r0 = r6.Y3()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.H
            java.lang.String r4 = "binding.eventBannerImageContainer"
            jo.p.g(r0, r4)
            r9.i2$g r4 = new r9.i2$g
            r4.<init>(r2, r6)
            yd.g1.a(r0, r4)
            s9.g0 r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.J
            boolean r4 = r2.E()
            if (r4 == 0) goto L91
            r7 = r3
        L91:
            r0.setVisibility(r7)
            s9.g0 r7 = r6.Y3()
            androidx.appcompat.widget.AppCompatImageView r7 = r7.I
            com.dena.mirrorman.net.glide.GlideRequests r7 = com.dena.mirrorman.net.glide.GlideApp.with(r7)
            java.lang.String r0 = r2.d()
            com.dena.mirrorman.net.glide.GlideRequest r7 = r7.load(r0)
            m7.f r0 = new m7.f
            m7.l[] r1 = new m7.l[r1]
            sn.c r4 = new sn.c
            r5 = 4
            int r5 = de.e.b(r6, r5)
            boolean r2 = r2.E()
            if (r2 == 0) goto Lba
            sn.c$b r2 = sn.c.b.TOP
            goto Lbc
        Lba:
            sn.c$b r2 = sn.c.b.ALL
        Lbc:
            r4.<init>(r5, r3, r2)
            r1[r3] = r4
            r0.<init>(r1)
            e8.h r0 = e8.h.bitmapTransform(r0)
            com.dena.mirrorman.net.glide.GlideRequest r7 = r7.apply(r0)
            s9.g0 r6 = r6.Y3()
            androidx.appcompat.widget.AppCompatImageView r6 = r6.I
            r7.into(r6)
            goto Ldf
        Ld6:
            s9.g0 r6 = r6.Y3()
            androidx.constraintlayout.widget.ConstraintLayout r6 = r6.H
            r6.setVisibility(r7)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.i2.r4(r9.i2, java.util.List):void");
    }

    public static final void t4(i2 i2Var, ValueAnimator valueAnimator) {
        jo.p.h(i2Var, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        uo.l.d(i2Var, null, null, new h(((Float) animatedValue).floatValue(), null), 3, null);
    }

    public static final boolean u4(i2 i2Var, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(i2Var, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            i2Var.v4(new j());
            return true;
        }
        return false;
    }

    public static final void w4(i2 i2Var) {
        jo.p.h(i2Var, "this$0");
        i2Var.Y3().u().getViewTreeObserver().removeOnGlobalLayoutListener(i2Var.X0);
        i2Var.s4();
    }

    public final void A4() {
        Y3().P.setItemAnimator(null);
        Y3().P.setAdapter(new k2());
        Y3().P.g(new p001if.a((Resources.getSystem().getDisplayMetrics().widthPixels / 5) - de.e.b(this, 56)));
        r9.k kVar = this.Y0;
        RecyclerView recyclerView = Y3().P;
        jo.p.g(recyclerView, "binding.partsRecyclerView");
        kVar.d(recyclerView);
        HorizontalScrollBar horizontalScrollBar = Y3().L;
        RecyclerView recyclerView2 = Y3().P;
        jo.p.g(recyclerView2, "binding.partsRecyclerView");
        horizontalScrollBar.setRecyclerView(recyclerView2);
    }

    public final void B4() {
        AppCompatImageView appCompatImageView = Y3().C;
        jo.p.g(appCompatImageView, "binding.backButton");
        yd.g1.a(appCompatImageView, new l());
        RoundedButtonView roundedButtonView = Y3().S;
        jo.p.g(roundedButtonView, "binding.resetButton");
        yd.g1.a(roundedButtonView, new m());
        RoundedButtonView roundedButtonView2 = Y3().U;
        jo.p.g(roundedButtonView2, "binding.saveButton");
        yd.g1.a(roundedButtonView2, new n());
        RecyclerView.h adapter = Y3().O.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.ShooterPartsCategoryAdapter");
        ((l2) adapter).h(new o());
        RecyclerView.h adapter2 = Y3().P.getAdapter();
        jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.ShooterPartsAdapter");
        k2 k2Var = (k2) adapter2;
        k2Var.j(new p());
        k2Var.i(new q(k2Var));
        AppCompatImageView appCompatImageView2 = Y3().K;
        jo.p.g(appCompatImageView2, "binding.helpImageView");
        yd.g1.a(appCompatImageView2, new r());
    }

    public final void C4(float f10) {
        Y3().E.setTranslationY(f10);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        UnityManager.Companion.getInstance().initCloset(false);
        this.P0 = null;
        this.Q0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        UnityManager.Companion.getInstance().setCollabo001();
    }

    public final s9.g0 Y3() {
        return (s9.g0) this.O0.b(this, f50167e1[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        String eventBackgroundImageUrl;
        vb.p pVar;
        super.Z1();
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().initCloset(true);
        companion.getInstance().setCollaboMiniGame002();
        EventBannerResponse h42 = h4();
        if (h42 == null || (eventBackgroundImageUrl = h42.getEventBackgroundImageUrl()) == null || (pVar = this.Q0) == null) {
            return;
        }
        pVar.G2(eventBackgroundImageUrl);
    }

    public final od.e Z3() {
        return (od.e) this.S0.getValue();
    }

    public final nf.f a4() {
        return (nf.f) this.R0.getValue();
    }

    public final float b4() {
        return ((Number) this.f50171c1.getValue()).floatValue();
    }

    public final float c4() {
        return ((Number) this.Z0.getValue()).floatValue();
    }

    public final float d4() {
        return ((Number) this.f50169a1.getValue()).floatValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        s9.g0 T = s9.g0.T(view);
        jo.p.g(T, "bind(view)");
        x4(T);
        this.X0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: r9.a2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                i2.w4(i2.this);
            }
        };
        Y3().u().getViewTreeObserver().addOnGlobalLayoutListener(this.X0);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(Y3().D);
        cVar.l(Y3().F.getId(), (int) c4());
        cVar.c(Y3().D);
        z4();
        y4();
        A4();
        B4();
        j4();
        Z3().C(jf.m0.MACHINE);
        Z3().B(jf.k0.MACHINE);
    }

    public final float e4() {
        return ((Number) this.f50170b1.getValue()).floatValue();
    }

    public final je.e f4() {
        return (je.e) this.U0.getValue();
    }

    public final MRLogger g4() {
        return (MRLogger) this.V0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final EventBannerResponse h4() {
        return (EventBannerResponse) this.W0.getValue();
    }

    public final MRUnityPlayer i4() {
        return (MRUnityPlayer) this.T0.getValue();
    }

    public final void j4() {
        a4().I().i(a1(), y1.f50569a);
        a4().M0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.c2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.l4(i2.this, (Boolean) obj);
            }
        });
        a4().v0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.d2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.m4(i2.this, (Boolean) obj);
            }
        });
        a4().G0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.b2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.n4(i2.this, (Boolean) obj);
            }
        });
        a4().E0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.g2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.o4(i2.this, (List) obj);
            }
        });
        a4().D0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.f2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.p4(i2.this, (List) obj);
            }
        });
        wn.k kVar = new wn.k(xn.s.k(), null);
        LiveData<List<ud.q>> S = a4().S();
        LiveData<List<ud.p>> D0 = a4().D0();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(kVar);
        for (LiveData liveData : xn.s.m(S, D0)) {
            c0Var.q(liveData, new f(c0Var, S, D0));
        }
        LiveData a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        a10.i(a1(), new androidx.lifecycle.f0() { // from class: r9.h2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.q4(i2.this, (wn.k) obj);
            }
        });
        a4().D0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.e2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                i2.r4(i2.this, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: r9.z1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean u42;
                u42 = i2.u4(i2.this, dialogInterface, i10, keyEvent);
                return u42;
            }
        });
        return dialog;
    }

    public final void s4() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c4() - Y3().E.getTranslationY(), c4());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r9.x1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i2.t4(i2.this, valueAnimator);
            }
        });
        ofFloat.addListener(new i());
        ofFloat.start();
    }

    public final void v4(io.a<wn.v> aVar) {
        ClosetBackground background;
        vb.p pVar;
        ClosetAvatar R = a4().R();
        if (R != null && (background = R.getBackground()) != null && (pVar = this.Q0) != null) {
            pVar.G2(background.getUrl());
        }
        vb.p pVar2 = this.Q0;
        if (pVar2 != null) {
            pVar2.W0(d4() - e4());
        }
        UnityManager.Companion.getInstance().setCollabo001();
        Z3().C(jf.m0.GENDER);
        Z3().B(jf.k0.GENDER);
        uo.l.d(this, null, null, new k(aVar, null), 3, null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof vb.v ? (vb.v) context : null;
        this.Q0 = context instanceof vb.p ? (vb.p) context : null;
    }

    public final void x4(s9.g0 g0Var) {
        this.O0.a(this, f50167e1[0], g0Var);
    }

    public final void y4() {
        Y3().O.setItemAnimator(null);
        Y3().O.setAdapter(new l2());
    }

    public final void z4() {
        List<Integer> eventItemPartTypes;
        jf.k0 k0Var;
        EventBannerResponse h42 = h4();
        boolean z10 = true;
        if (h42 != null && (eventItemPartTypes = h42.getEventItemPartTypes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Number number : eventItemPartTypes) {
                int intValue = number.intValue();
                jf.k0[] values = jf.k0.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        k0Var = null;
                        break;
                    }
                    k0Var = values[i10];
                    if (k0Var.i() == intValue) {
                        break;
                    }
                    i10++;
                }
                if (k0Var != null) {
                    arrayList.add(k0Var);
                }
            }
            Z3().G(arrayList);
        }
        AppCompatImageView appCompatImageView = Y3().K;
        EventBannerResponse h43 = h4();
        String eventHelpPageUrl = h43 != null ? h43.getEventHelpPageUrl() : null;
        if (eventHelpPageUrl != null && eventHelpPageUrl.length() != 0) {
            z10 = false;
        }
        appCompatImageView.setVisibility(z10 ? 8 : 0);
    }
}
