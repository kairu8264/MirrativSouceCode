package r9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.emomo.closet.PartsLargeCategoryTabView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.AvatarItemSelectLog;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.EditPartTextView;
import com.dena.mirrorman.customview.EmomoDressUpBuyButtonView;
import com.dena.mirrorman.customview.HorizontalScrollBar;
import com.dena.mirrorman.customview.RemainingKandumeView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.unity.MRUnityPlayer;
import com.dena.mirrorman.unity.UnityManager;
import ef.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kq.a;
import o3.p0;
import r9.y;
import sf.i;

/* loaded from: classes.dex */
public final class n1 extends androidx.fragment.app.e implements r9.z, uo.q0 {

    /* renamed from: o1  reason: collision with root package name */
    public static final a f50260o1 = new a(null);

    /* renamed from: p1  reason: collision with root package name */
    public static final int f50261p1 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public s9.y Q0;
    public vb.p R0;
    public je.a S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final r9.k f50262a1;

    /* renamed from: b1  reason: collision with root package name */
    public final r9.k f50263b1;

    /* renamed from: c1  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f50264c1;

    /* renamed from: d1  reason: collision with root package name */
    public float f50265d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f50266e1;

    /* renamed from: f1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f50267f1;

    /* renamed from: g1  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f50268g1;

    /* renamed from: h1  reason: collision with root package name */
    public final wn.f f50269h1;

    /* renamed from: i1  reason: collision with root package name */
    public final wn.f f50270i1;

    /* renamed from: j1  reason: collision with root package name */
    public final wn.f f50271j1;

    /* renamed from: k1  reason: collision with root package name */
    public final wn.f f50272k1;

    /* renamed from: l1  reason: collision with root package name */
    public final wn.f f50273l1;

    /* renamed from: m1  reason: collision with root package name */
    public final wn.f f50274m1;

    /* renamed from: n1  reason: collision with root package name */
    public final wn.f f50275n1;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n1 a(String str, Integer num, boolean z10) {
            jo.p.h(str, "referer");
            n1 n1Var = new n1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putInt("EXTRA_PART_TYPE_ID", num != null ? num.intValue() : Integer.MAX_VALUE);
            bundle.putBoolean("EXTRA_IS_FROM_ONBOARDING", z10);
            n1Var.V2(bundle);
            return n1Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<Boolean> {
        public a0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(n1.this.M2().getBoolean("EXTRA_IS_FROM_ONBOARDING"));
        }
    }

    /* loaded from: classes.dex */
    public static final class a1 extends jo.q implements io.l<View, wn.v> {
        public a1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.MOTION_LEFT);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a2 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50278w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(io.a aVar) {
            super(0);
            this.f50278w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50278w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50279a;

        static {
            int[] iArr = new int[jf.k0.values().length];
            iArr[jf.k0.PERSONA.ordinal()] = 1;
            iArr[jf.k0.MOTION_UP.ordinal()] = 2;
            iArr[jf.k0.MOTION_LEFT.ordinal()] = 3;
            iArr[jf.k0.MOTION_RIGHT.ordinal()] = 4;
            iArr[jf.k0.MOTION_DOWN.ordinal()] = 5;
            iArr[jf.k0.LEFT_WEAPON.ordinal()] = 6;
            iArr[jf.k0.RIGHT_WEAPON.ordinal()] = 7;
            iArr[jf.k0.BOTH_WEAPON.ordinal()] = 8;
            f50279a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<Integer> {
        public b0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf((int) (16 * n1.this.o5()));
        }
    }

    /* loaded from: classes.dex */
    public static final class b1 extends jo.q implements io.l<View, wn.v> {
        public b1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.MOTION_RIGHT);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b2 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50282w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50283x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50284y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50285z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50282w = aVar;
            this.f50283x = aVar2;
            this.f50284y = aVar3;
            this.f50285z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50282w;
            vq.a aVar2 = this.f50283x;
            io.a aVar3 = this.f50284y;
            xq.a aVar4 = this.f50285z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f50286a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f50287b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f50288c;

        public c(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f50286a = c0Var;
            this.f50287b = liveData;
            this.f50288c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f50286a.f();
            Object f11 = this.f50287b.f();
            Object f12 = this.f50288c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f50286a;
            List list = (List) f12;
            List list2 = (List) f10;
            if (!((Boolean) f11).booleanValue()) {
                list = xn.s.k();
            }
            c0Var.p(list);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$onAppearCloset$1$1", f = "EmomoDressUpDialog.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50289w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f50291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(float f10, ao.d<? super c0> dVar) {
            super(2, dVar);
            this.f50291y = f10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(this.f50291y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f50289w == 0) {
                wn.m.b(obj);
                n1 n1Var = n1.this;
                n1Var.W5(n1Var.g5() - this.f50291y);
                vb.p pVar = n1.this.R0;
                if (pVar != null) {
                    pVar.W0(Math.max(0.0f, (this.f50291y - n1.this.i5()) - n1.this.f5()));
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class c1 extends jo.q implements io.l<View, wn.v> {
        public c1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.MOTION_DOWN);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c2 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50293w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c2(io.a aVar) {
            super(0);
            this.f50293w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50293w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f50294a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f50295b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f50296c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f50297d;

        public d(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f50294a = c0Var;
            this.f50295b = liveData;
            this.f50296c = liveData2;
            this.f50297d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            boolean z10;
            boolean z11;
            T f10 = this.f50294a.f();
            Object f11 = this.f50295b.f();
            Object f12 = this.f50296c.f();
            Object f13 = this.f50297d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f50294a;
            boolean booleanValue = ((Boolean) f13).booleanValue();
            boolean booleanValue2 = ((Boolean) f12).booleanValue();
            wn.k kVar = (wn.k) f10;
            List<EventBannerResponse> banners = ((EventNoticeResponse) f11).getBanners();
            if (!(banners instanceof Collection) || !banners.isEmpty()) {
                for (EventBannerResponse eventBannerResponse : banners) {
                    Integer eventType = eventBannerResponse.getEventType();
                    if (eventType != null && eventType.intValue() == 8) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            boolean z12 = !z11;
            c0Var.p(wn.q.a(Integer.valueOf(z12 ? 8 : booleanValue2 ? 0 : 4), Integer.valueOf(z12 ? 8 : (booleanValue && booleanValue2) ? 0 : 4)));
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 implements sf.i {
        public d0() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n1.this.r5().resume();
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.W0(n1.this.g5() - n1.this.i5());
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
            n1.this.r5().pause();
        }
    }

    /* loaded from: classes.dex */
    public static final class d1 extends jo.q implements io.l<View, wn.v> {
        public d1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            be.b1.O0.a().z3(n1.this.O2(), "EmomoMotionIntroductionDialog");
            MRLogger n52 = n1.this.n5();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_CLOSET_HELP_CLICK);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, "persona")));
            n52.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<I, O> implements n.a {
        @Override // n.a
        public final Boolean apply(Integer num) {
            Integer num2 = num;
            jo.p.g(num2, "it");
            return Boolean.valueOf(num2.intValue() > 0);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$onDisappearCloset$1$1", f = "EmomoDressUpDialog.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50300w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ float f50302y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(float f10, ao.d<? super e0> dVar) {
            super(2, dVar);
            this.f50302y = f10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(this.f50302y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f50300w == 0) {
                wn.m.b(obj);
                n1 n1Var = n1.this;
                n1Var.W5(n1Var.g5() - this.f50302y);
                vb.p pVar = n1.this.R0;
                if (pVar != null) {
                    pVar.W0(Math.max(0.0f, this.f50302y - n1.this.i5()));
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class e1 extends RecyclerView.u {
        public e1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (i10 == 0) {
                MRLogger n52 = n1.this.n5();
                MRLog.Companion companion = MRLog.Companion;
                n1 n1Var = n1.this;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_ITEM_SCROLL);
                String str = n1Var.e5().x0().toString();
                Locale locale = Locale.getDefault();
                jo.p.g(locale, "getDefault()");
                String lowerCase = str.toLowerCase(locale);
                jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                builder.setTargetId(lowerCase);
                n52.sendLog(builder.build());
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$21", f = "EmomoDressUpDialog.kt", l = {1488}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50304w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50305x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50306y;

        /* renamed from: z  reason: collision with root package name */
        public int f50307z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50308w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n1 n1Var) {
                super(0);
                this.f50308w = n1Var;
            }

            public final void a() {
                this.f50308w.m3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f50307z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50306y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50305x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50304w
                r9.n1 r4 = (r9.n1) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7a
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                r9.n1 r9 = r9.n1.this
                nf.f r9 = r9.n1.k4(r9)
                wo.x r3 = r9.H()
                r9.n1 r9 = r9.n1.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
                r4 = r9
                r9 = r8
            L3d:
                r9.f50304w = r4     // Catch: java.lang.Throwable -> L7a
                r9.f50305x = r3     // Catch: java.lang.Throwable -> L7a
                r9.f50306y = r1     // Catch: java.lang.Throwable -> L7a
                r9.f50307z = r2     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7a
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L77
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L71
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L77
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L77
                r9 = 0
                r9.n1$f$a r6 = new r9.n1$f$a     // Catch: java.lang.Throwable -> L77
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L77
                r9.n1.y4(r5, r9, r6)     // Catch: java.lang.Throwable -> L77
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L71:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L77:
                r9 = move-exception
                r3 = r4
                goto L7b
            L7a:
                r9 = move-exception
            L7b:
                throw r9     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.n1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 implements sf.i {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f50310b;

        @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$onDisappearCloset$2$onAnimationEnd$1", f = "EmomoDressUpDialog.kt", l = {1320}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f50311w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n1 f50312x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f50313y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n1 n1Var, io.a<wn.v> aVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f50312x = n1Var;
                this.f50313y = aVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f50312x, this.f50313y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f50311w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f50311w = 1;
                    if (uo.b1.a(50L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f50312x.c5().M.setVisibility(8);
                io.a<wn.v> aVar = this.f50313y;
                if (aVar != null) {
                    aVar.invoke();
                }
                return wn.v.f59242a;
            }
        }

        public f0(io.a<wn.v> aVar) {
            this.f50310b = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n1.this.r5().resume();
            n1 n1Var = n1.this;
            uo.l.d(n1Var, null, null, new a(n1Var, this.f50310b, null), 3, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
            n1.this.r5().pause();
            n1.this.c5().M.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public static final class f1 extends jo.q implements io.l<ud.q, wn.v> {
        public f1() {
            super(1);
        }

        public final void a(ud.q qVar) {
            jo.p.h(qVar, "partsBindModel");
            if (qVar.f()) {
                n1.this.d5().l(qVar.j(), qVar.i(), qVar.E());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$22", f = "EmomoDressUpDialog.kt", l = {1488}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50315w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50316x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50317y;

        /* renamed from: z  reason: collision with root package name */
        public int f50318z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:17:0x0054, B:19:0x005c, B:23:0x0072), top: B:34:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f50318z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50317y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50316x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50315w
                r9.n1 r4 = (r9.n1) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L84
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                r9.n1 r9 = r9.n1.this
                nf.f r9 = r9.n1.k4(r9)
                wo.x r3 = r9.h0()
                r9.n1 r9 = r9.n1.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L84
                r4 = r9
                r9 = r8
            L3d:
                r9.f50315w = r4     // Catch: java.lang.Throwable -> L84
                r9.f50316x = r3     // Catch: java.lang.Throwable -> L84
                r9.f50317y = r1     // Catch: java.lang.Throwable -> L84
                r9.f50318z = r2     // Catch: java.lang.Throwable -> L84
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L84
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
                if (r9 == 0) goto L7b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L81
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
                s9.y r6 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> L81
                com.dena.mirrorman.customview.EditPartTextView r6 = r6.K0     // Catch: java.lang.Throwable -> L81
                if (r9 == 0) goto L70
                r9 = 0
                goto L72
            L70:
                r9 = 8
            L72:
                r6.setVisibility(r9)     // Catch: java.lang.Throwable -> L81
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L81:
                r9 = move-exception
                r3 = r4
                goto L85
            L84:
                r9 = move-exception
            L85:
                throw r9     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.n1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.a<Float> {

        /* renamed from: w  reason: collision with root package name */
        public static final g0 f50319w = new g0();

        public g0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(Resources.getSystem().getDisplayMetrics().widthPixels / 360.0f);
        }
    }

    /* loaded from: classes.dex */
    public static final class g1 extends jo.q implements io.l<ud.q, wn.v> {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f50321a;

            static {
                int[] iArr = new int[jf.k0.values().length];
                iArr[jf.k0.MOTION_UP.ordinal()] = 1;
                iArr[jf.k0.MOTION_LEFT.ordinal()] = 2;
                iArr[jf.k0.MOTION_RIGHT.ordinal()] = 3;
                iArr[jf.k0.MOTION_DOWN.ordinal()] = 4;
                f50321a = iArr;
            }
        }

        public g1() {
            super(1);
        }

        public final void a(ud.q qVar) {
            jo.p.h(qVar, "partsBindModel");
            int i10 = a.f50321a[qVar.l().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), qVar.w(), 0, 2, null);
            }
            if (qVar.q()) {
                n1.this.d5().q(qVar.l());
            } else {
                n1.this.s5().a(qVar.i(), qVar.E());
                n1.this.d5().A(qVar.j(), qVar.l());
            }
            MRLogger n52 = n1.this.n5();
            MRLog.Companion companion = MRLog.Companion;
            n1 n1Var = n1.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_ITEM_SELECT);
            String str = n1Var.e5().x0().toString();
            Locale locale = Locale.getDefault();
            jo.p.g(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            builder.setTargetId(lowerCase);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new AvatarItemSelectLog(qVar.j(), true ^ qVar.x(), qVar.E()).toJson())));
            n52.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$23", f = "EmomoDressUpDialog.kt", l = {1488}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50322w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50323x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50324y;

        /* renamed from: z  reason: collision with root package name */
        public int f50325z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:22:0x0085), top: B:33:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
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
                int r1 = r9.f50325z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f50324y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f50323x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f50322w
                r9.n1 r4 = (r9.n1) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La8
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
                r9.n1 r10 = r9.n1.this
                nf.f r10 = r9.n1.k4(r10)
                wo.x r3 = r10.k0()
                r9.n1 r10 = r9.n1.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La8
                r4 = r10
                r10 = r9
            L3d:
                r10.f50322w = r4     // Catch: java.lang.Throwable -> La8
                r10.f50323x = r3     // Catch: java.lang.Throwable -> La8
                r10.f50324y = r1     // Catch: java.lang.Throwable -> La8
                r10.f50325z = r2     // Catch: java.lang.Throwable -> La8
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La8
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La5
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La5
                if (r10 == 0) goto L9f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La5
                ud.p2 r10 = (ud.p2) r10     // Catch: java.lang.Throwable -> La5
                boolean r6 = r10.c()     // Catch: java.lang.Throwable -> La5
                if (r6 == 0) goto L85
                s9.y r6 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> La5
                com.dena.mirrorman.customview.PartTextTutorialView r6 = r6.f52553a1     // Catch: java.lang.Throwable -> La5
                r7 = 0
                r6.setVisibility(r7)     // Catch: java.lang.Throwable -> La5
                s9.y r6 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> La5
                android.view.View r6 = r6.Z0     // Catch: java.lang.Throwable -> La5
                r6.setVisibility(r7)     // Catch: java.lang.Throwable -> La5
                s9.y r6 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> La5
                com.dena.mirrorman.customview.PartTextTutorialView r6 = r6.f52553a1     // Catch: java.lang.Throwable -> La5
                r6.a(r10)     // Catch: java.lang.Throwable -> La5
                goto L99
            L85:
                s9.y r10 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> La5
                com.dena.mirrorman.customview.PartTextTutorialView r10 = r10.f52553a1     // Catch: java.lang.Throwable -> La5
                r6 = 8
                r10.setVisibility(r6)     // Catch: java.lang.Throwable -> La5
                s9.y r10 = r9.n1.i4(r5)     // Catch: java.lang.Throwable -> La5
                android.view.View r10 = r10.Z0     // Catch: java.lang.Throwable -> La5
                r10.setVisibility(r6)     // Catch: java.lang.Throwable -> La5
            L99:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La5:
                r10 = move-exception
                r3 = r4
                goto La9
            La8:
                r10 = move-exception
            La9:
                throw r10     // Catch: java.lang.Throwable -> Laa
            Laa:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.n1.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.a<String> {
        public h0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = n1.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class h1 extends jo.q implements io.l<View, wn.v> {
        public h1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.t5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ jf.n f50328w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n1 f50329x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(jf.n nVar, n1 n1Var) {
            super(0);
            this.f50328w = nVar;
            this.f50329x = n1Var;
        }

        public final void a() {
            be.a1.N0.a(this.f50328w.a()).z3(this.f50329x.p0(), "EmomoDressUpHelpImageDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.l<jf.l0, wn.v> {
        public i0() {
            super(1);
        }

        public final void a(jf.l0 l0Var) {
            jo.p.h(l0Var, "bindModel");
            if (l0Var.d()) {
                return;
            }
            n1 n1Var = n1.this;
            for (jf.d dVar : n1.this.e5().s0().getValue()) {
                n1Var.d5().g(dVar.a(), dVar.b(), dVar.c());
            }
            MRLogger n52 = n1.this.n5();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_SUBCATEGORY_SELECT);
            String str = l0Var.c().toString();
            Locale locale = Locale.getDefault();
            jo.p.g(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            builder.setTargetId(lowerCase);
            n52.sendLog(builder.build());
            n1.this.d5().B(l0Var.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(jf.l0 l0Var) {
            a(l0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i1 extends jo.q implements io.l<View, wn.v> {
        public i1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.t5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$3", f = "EmomoDressUpDialog.kt", l = {521}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50332w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50334w;

            public a(n1 n1Var) {
                this.f50334w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                ClosetAvatar f10 = this.f50334w.e5().w0().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                this.f50334w.d5().p(f10.clone());
                this.f50334w.d5().o(jf.c.f37906y.a(f10));
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50332w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> i02 = n1.this.e5().i0();
                a aVar = new a(n1.this);
                this.f50332w = 1;
                if (i02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class j0 extends jo.q implements io.l<View, wn.v> {
        public j0() {
            super(1);
        }

        public final void a(View view) {
            vb.p pVar;
            jo.p.h(view, "it");
            if (n1.this.u5() || (pVar = n1.this.R0) == null) {
                return;
            }
            pVar.r1(n1.this.e5().Q() || n1.this.e5().G());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j1 extends RecyclerView.u {
        public j1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (i10 == 0) {
                MRLogger n52 = n1.this.n5();
                MRLog.Companion companion = MRLog.Companion;
                n1 n1Var = n1.this;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_ITEM_SCROLL);
                String str = n1Var.e5().x0().toString();
                Locale locale = Locale.getDefault();
                jo.p.g(locale, "getDefault()");
                String lowerCase = str.toLowerCase(locale);
                jo.p.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                builder.setTargetId(lowerCase);
                n52.sendLog(builder.build());
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$31", f = "EmomoDressUpDialog.kt", l = {806}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50337w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50339w;

            /* renamed from: r9.n1$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0763a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50340w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0763a(n1 n1Var) {
                    super(1);
                    this.f50340w = n1Var;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f50340w.d5().k();
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50339w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f50339w.c5().f52567h1.setVisibility(8);
                this.f50339w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50339w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0763a(this.f50339w));
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50337w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> Z = n1.this.e5().Z();
                a aVar = new a(n1.this);
                this.f50337w = 1;
                if (Z.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class k0 extends jo.q implements io.l<View, wn.v> {
        public k0() {
            super(1);
        }

        public final void a(View view) {
            vb.p pVar;
            jo.p.h(view, "it");
            if (!n1.this.e5().Q() || (pVar = n1.this.R0) == null) {
                return;
            }
            pVar.t1();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k1 extends jo.q implements io.l<ud.q, wn.v> {
        public k1() {
            super(1);
        }

        public final void a(ud.q qVar) {
            jo.p.h(qVar, "partsBindModel");
            if (qVar.f()) {
                n1.this.d5().l(qVar.j(), qVar.i(), qVar.E());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$32", f = "EmomoDressUpDialog.kt", l = {816}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50343w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50345w;

            /* renamed from: r9.n1$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0764a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50346w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f50347x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0764a(n1 n1Var, int i10) {
                    super(1);
                    this.f50346w = n1Var;
                    this.f50347x = i10;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f50346w.d5().h(this.f50347x);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50345w = n1Var;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                this.f50345w.c5().f52567h1.setVisibility(8);
                this.f50345w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50345w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0764a(this.f50345w, i10));
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50343w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<Integer> X = n1.this.e5().X();
                a aVar = new a(n1.this);
                this.f50343w = 1;
                if (X.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class l0 extends jo.q implements io.l<View, wn.v> {
        public l0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.i1();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l1 extends jo.q implements io.l<ud.q, wn.v> {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f50350a;

            static {
                int[] iArr = new int[jf.k0.values().length];
                iArr[jf.k0.BACKGROUND.ordinal()] = 1;
                iArr[jf.k0.MOTION_UP.ordinal()] = 2;
                iArr[jf.k0.MOTION_LEFT.ordinal()] = 3;
                iArr[jf.k0.MOTION_RIGHT.ordinal()] = 4;
                iArr[jf.k0.MOTION_DOWN.ordinal()] = 5;
                f50350a = iArr;
            }
        }

        public l1() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(ud.q r13) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.n1.l1.a(ud.q):void");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.q qVar) {
            a(qVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$33", f = "EmomoDressUpDialog.kt", l = {826}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50351w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50353w;

            /* renamed from: r9.n1$m$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0765a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50354w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0765a(n1 n1Var) {
                    super(1);
                    this.f50354w = n1Var;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f50354w.d5().i();
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50353w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f50353w.c5().f52567h1.setVisibility(8);
                this.f50353w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50353w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0765a(this.f50353w));
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50351w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> Y = n1.this.e5().Y();
                a aVar = new a(n1.this);
                this.f50351w = 1;
                if (Y.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class m0 extends jo.q implements io.l<View, wn.v> {
        public m0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.i();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m1 extends jo.q implements io.l<View, wn.v> {
        public m1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.LEFT_WEAPON);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$34", f = "EmomoDressUpDialog.kt", l = {836}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50357w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UpdateClosetNameRequest> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50359w;

            /* renamed from: r9.n1$n$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0766a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50360w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ UpdateClosetNameRequest f50361x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0766a(n1 n1Var, UpdateClosetNameRequest updateClosetNameRequest) {
                    super(1);
                    this.f50360w = n1Var;
                    this.f50361x = updateClosetNameRequest;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f50360w.d5().v(this.f50361x);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50359w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UpdateClosetNameRequest updateClosetNameRequest, ao.d<? super wn.v> dVar) {
                this.f50359w.c5().f52567h1.setVisibility(8);
                this.f50359w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50359w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0766a(this.f50359w, updateClosetNameRequest));
                return wn.v.f59242a;
            }
        }

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50357w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<UpdateClosetNameRequest> d02 = n1.this.e5().d0();
                a aVar = new a(n1.this);
                this.f50357w = 1;
                if (d02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class n0 extends jo.q implements io.l<View, wn.v> {
        public n0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.J0();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: r9.n1$n1  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0767n1 extends jo.q implements io.l<View, wn.v> {
        public C0767n1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.BOTH_WEAPON);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$35", f = "EmomoDressUpDialog.kt", l = {846}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50364w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50366w;

            /* renamed from: r9.n1$o$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0768a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50367w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f50368x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0768a(n1 n1Var, int i10) {
                    super(1);
                    this.f50367w = n1Var;
                    this.f50368x = i10;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    ClosetAvatar R = this.f50367w.e5().R();
                    if (R != null) {
                        n1 n1Var = this.f50367w;
                        n1Var.d5().s(this.f50368x, R);
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50366w = n1Var;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                this.f50366w.c5().f52567h1.setVisibility(8);
                this.f50366w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50366w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0768a(this.f50366w, i10));
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50364w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<Integer> b02 = n1.this.e5().b0();
                a aVar = new a(n1.this);
                this.f50364w = 1;
                if (b02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class o0 extends jo.q implements io.l<View, wn.v> {
        public o0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (n1.this.u5()) {
                return;
            }
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.b2();
            }
            MRLogger n52 = n1.this.n5();
            MRLog.Companion companion = MRLog.Companion;
            n52.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_SLOT_CLICK).build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o1 extends jo.q implements io.l<View, wn.v> {
        public o1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.RIGHT_WEAPON);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$36", f = "EmomoDressUpDialog.kt", l = {858}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50371w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50373w;

            public a(n1 n1Var) {
                this.f50373w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                of.n nVar = of.n.f45411a;
                Context N2 = this.f50373w.N2();
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f50373w.U0(q9.i.f48840a);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                nVar.B(N2, message, false);
                return wn.v.f59242a;
            }
        }

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50371w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> e02 = n1.this.e5().e0();
                a aVar = new a(n1.this);
                this.f50371w = 1;
                if (e02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class p0 extends jo.q implements io.l<View, wn.v> {
        public p0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (n1.this.u5()) {
                return;
            }
            MRLogger n52 = n1.this.n5();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_KANDUME_HELP_CLICK);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, Referer.AVATAR)));
            n52.sendLog(builder.build());
            be.f2.O0.a().z3(n1.this.O2(), "KandumeInfoDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p1 extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ud.q f50375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n1 f50376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(ud.q qVar, n1 n1Var) {
            super(1);
            this.f50375w = qVar;
            this.f50376x = n1Var;
        }

        public final void a(View view) {
            vb.p pVar;
            jo.p.h(view, "it");
            String e10 = this.f50375w.e();
            if (e10 == null || (pVar = this.f50376x.R0) == null) {
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

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$37", f = "EmomoDressUpDialog.kt", l = {864}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50377w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UpdateClosetImagesRequest> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50379w;

            /* renamed from: r9.n1$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0769a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50380w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ UpdateClosetImagesRequest f50381x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0769a(n1 n1Var, UpdateClosetImagesRequest updateClosetImagesRequest) {
                    super(1);
                    this.f50380w = n1Var;
                    this.f50381x = updateClosetImagesRequest;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    this.f50380w.d5().u(this.f50381x);
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50379w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UpdateClosetImagesRequest updateClosetImagesRequest, ao.d<? super wn.v> dVar) {
                this.f50379w.c5().f52567h1.setVisibility(8);
                this.f50379w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50379w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0769a(this.f50379w, updateClosetImagesRequest));
                return wn.v.f59242a;
            }
        }

        public q(ao.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50377w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<UpdateClosetImagesRequest> c02 = n1.this.e5().c0();
                a aVar = new a(n1.this);
                this.f50377w = 1;
                if (c02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class q0 extends jo.q implements io.l<Float, wn.v> {
        public q0() {
            super(1);
        }

        public final void a(float f10) {
            if (n1.this.e5().z0() != jf.m0.MOTION) {
                UnityManager.Companion.getInstance().addClosetDolly(f10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Float f10) {
            a(f10.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q1 extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50383w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50384x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50385y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50383w = componentCallbacks;
            this.f50384x = aVar;
            this.f50385y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f50383w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f50384x, this.f50385y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$38", f = "EmomoDressUpDialog.kt", l = {874}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50386w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UpdateClosetImagesRequest> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50388w;

            /* renamed from: r9.n1$r$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0770a extends jo.q implements io.l<View, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ n1 f50389w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ UpdateClosetImagesRequest f50390x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0770a(n1 n1Var, UpdateClosetImagesRequest updateClosetImagesRequest) {
                    super(1);
                    this.f50389w = n1Var;
                    this.f50390x = updateClosetImagesRequest;
                }

                public final void a(View view) {
                    jo.p.h(view, "it");
                    ClosetAvatar R = this.f50389w.e5().R();
                    if (R != null) {
                        n1 n1Var = this.f50389w;
                        n1Var.d5().t(n1Var.e5().y0(), R, this.f50390x, n1Var.l5());
                    }
                }

                @Override // io.l
                public /* bridge */ /* synthetic */ wn.v invoke(View view) {
                    a(view);
                    return wn.v.f59242a;
                }
            }

            public a(n1 n1Var) {
                this.f50388w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UpdateClosetImagesRequest updateClosetImagesRequest, ao.d<? super wn.v> dVar) {
                this.f50388w.c5().f52567h1.setVisibility(8);
                this.f50388w.c5().f52573k1.setVisibility(0);
                AppCompatButton appCompatButton = this.f50388w.c5().f52573k1;
                jo.p.g(appCompatButton, "binding.retryButton");
                yd.g1.a(appCompatButton, new C0770a(this.f50388w, updateClosetImagesRequest));
                return wn.v.f59242a;
            }
        }

        public r(ao.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50386w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<UpdateClosetImagesRequest> a02 = n1.this.e5().a0();
                a aVar = new a(n1.this);
                this.f50386w = 1;
                if (a02.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class r0 extends jo.q implements io.p<Float, Float, wn.v> {
        public r0() {
            super(2);
        }

        public final void a(float f10, float f11) {
            if (n1.this.e5().z0() != jf.m0.MOTION) {
                UnityManager.Companion.getInstance().addClosetRotation(f10, f11);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Float f10, Float f11) {
            a(f10.floatValue(), f11.floatValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r1 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50392w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50393x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50394y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50392w = componentCallbacks;
            this.f50393x = aVar;
            this.f50394y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50392w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50393x, this.f50394y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.closet.EmomoDressUpDialog$bindClosetStore$39", f = "EmomoDressUpDialog.kt", l = {886}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50395w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n1 f50397w;

            /* renamed from: r9.n1$s$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0771a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f50398a;

                static {
                    int[] iArr = new int[jf.k0.values().length];
                    iArr[jf.k0.PERSONA.ordinal()] = 1;
                    iArr[jf.k0.MOTION_UP.ordinal()] = 2;
                    iArr[jf.k0.MOTION_LEFT.ordinal()] = 3;
                    iArr[jf.k0.MOTION_RIGHT.ordinal()] = 4;
                    iArr[jf.k0.MOTION_DOWN.ordinal()] = 5;
                    iArr[jf.k0.LEFT_WEAPON.ordinal()] = 6;
                    iArr[jf.k0.BOTH_WEAPON.ordinal()] = 7;
                    iArr[jf.k0.RIGHT_WEAPON.ordinal()] = 8;
                    f50398a = iArr;
                }
            }

            public a(n1 n1Var) {
                this.f50397w = n1Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                float f10 = (Resources.getSystem().getDisplayMetrics().widthPixels * 1.0f) / 360;
                switch (C0771a.f50398a[this.f50397w.e5().x0().ordinal()]) {
                    case 1:
                        this.f50397w.f50268g1.p(co.b.d((int) (90 * f10)));
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.f50397w.f50268g1.p(co.b.d((int) (((this.f50397w.e5().x0().h() * 56) + (this.f50397w.e5().x0().h() - 1) + 15) * f10)));
                        break;
                }
                return wn.v.f59242a;
            }
        }

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50395w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> I0 = n1.this.e5().I0();
                a aVar = new a(n1.this);
                this.f50395w = 1;
                if (I0.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class s0 extends jo.q implements io.l<jf.c0, wn.v> {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f50400a;

            static {
                int[] iArr = new int[jf.c0.values().length];
                iArr[jf.c0.UP.ordinal()] = 1;
                iArr[jf.c0.LEFT.ordinal()] = 2;
                iArr[jf.c0.RIGHT.ordinal()] = 3;
                iArr[jf.c0.DOWN.ordinal()] = 4;
                f50400a = iArr;
            }
        }

        public s0() {
            super(1);
        }

        public final void a(jf.c0 c0Var) {
            ClosetAvatarSimpleValue motion1;
            String value;
            ClosetAvatarSimpleValue motion2;
            String value2;
            ClosetAvatarSimpleValue motion3;
            String value3;
            ClosetAvatarSimpleValue motion4;
            String value4;
            jo.p.h(c0Var, "direction");
            if (n1.this.e5().z0() == jf.m0.MOTION) {
                int i10 = a.f50400a[c0Var.ordinal()];
                String str = "";
                if (i10 == 1) {
                    UnityManager companion = UnityManager.Companion.getInstance();
                    ClosetAvatar R = n1.this.e5().R();
                    if (R != null && (motion1 = R.getMotion1()) != null && (value = motion1.getValue()) != null) {
                        str = value;
                    }
                    UnityManager.setAnimationTrigger$default(companion, str, 0, 2, null);
                } else if (i10 == 2) {
                    UnityManager companion2 = UnityManager.Companion.getInstance();
                    ClosetAvatar R2 = n1.this.e5().R();
                    if (R2 != null && (motion2 = R2.getMotion2()) != null && (value2 = motion2.getValue()) != null) {
                        str = value2;
                    }
                    UnityManager.setAnimationTrigger$default(companion2, str, 0, 2, null);
                } else if (i10 == 3) {
                    UnityManager companion3 = UnityManager.Companion.getInstance();
                    ClosetAvatar R3 = n1.this.e5().R();
                    if (R3 != null && (motion3 = R3.getMotion3()) != null && (value3 = motion3.getValue()) != null) {
                        str = value3;
                    }
                    UnityManager.setAnimationTrigger$default(companion3, str, 0, 2, null);
                } else if (i10 != 4) {
                } else {
                    UnityManager companion4 = UnityManager.Companion.getInstance();
                    ClosetAvatar R4 = n1.this.e5().R();
                    if (R4 != null && (motion4 = R4.getMotion4()) != null && (value4 = motion4.getValue()) != null) {
                        str = value4;
                    }
                    UnityManager.setAnimationTrigger$default(companion4, str, 0, 2, null);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(jf.c0 c0Var) {
            a(c0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s1 extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50401w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50402x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50403y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50401w = componentCallbacks;
            this.f50402x = aVar;
            this.f50403y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            ComponentCallbacks componentCallbacks = this.f50401w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ef.a.class), this.f50402x, this.f50403y);
        }
    }

    /* loaded from: classes.dex */
    public static final class t implements androidx.lifecycle.f0<ClosetAvatarPartsResponse> {
        public t() {
        }

        @Override // androidx.lifecycle.f0
        /* renamed from: a */
        public void d(ClosetAvatarPartsResponse closetAvatarPartsResponse) {
            jf.k0 k0Var;
            if (closetAvatarPartsResponse == null) {
                return;
            }
            n1.this.e5().J().n(this);
            Bundle n02 = n1.this.n0();
            jo.p.e(n02);
            int i10 = n02.getInt("EXTRA_PART_TYPE_ID");
            n1 n1Var = n1.this;
            jf.k0[] values = jf.k0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    k0Var = null;
                    break;
                }
                k0Var = values[i11];
                if (k0Var.i() == i10) {
                    break;
                }
                i11++;
            }
            if (k0Var == null) {
                return;
            }
            jf.m0 e10 = k0Var.e();
            if (e10 != n1Var.e5().z0()) {
                n1Var.d5().C(e10);
            }
            if (k0Var != n1Var.e5().x0()) {
                n1Var.d5().B(k0Var);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class t0 extends jo.q implements io.l<ud.o, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ r9.b f50406x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(r9.b bVar) {
            super(1);
            this.f50406x = bVar;
        }

        public final void a(ud.o oVar) {
            jo.p.h(oVar, "it");
            n1.this.d5().w(oVar.getId());
            for (ud.o oVar2 : this.f50406x.a()) {
                oVar2.a(oVar2.getId() == oVar.getId());
            }
            this.f50406x.notifyDataSetChanged();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.o oVar) {
            a(oVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t1 extends jo.q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50407w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50408x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50409y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50407w = componentCallbacks;
            this.f50408x = aVar;
            this.f50409y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f50407w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRUnityPlayer.class), this.f50408x, this.f50409y);
        }
    }

    /* loaded from: classes.dex */
    public static final class u implements yd.s1 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EventNoticeResponse f50411b;

        public u(EventNoticeResponse eventNoticeResponse) {
            this.f50411b = eventNoticeResponse;
        }

        @Override // yd.s1
        public void a(int i10) {
            vb.p pVar;
            if (n1.this.u5() || (pVar = n1.this.R0) == null) {
                return;
            }
            pVar.k1(this.f50411b.getBanners().get(i10), n1.this.e5().Q() || n1.this.e5().G());
        }

        @Override // yd.s1
        public void b(int i10) {
            vb.p pVar = n1.this.R0;
            if (pVar != null) {
                pVar.V1(this.f50411b.getBanners().get(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class u0 extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f50413a;

            static {
                int[] iArr = new int[jf.k0.values().length];
                iArr[jf.k0.HAIR.ordinal()] = 1;
                iArr[jf.k0.EYEBROW.ordinal()] = 2;
                iArr[jf.k0.EYE.ordinal()] = 3;
                iArr[jf.k0.EYESHADOW.ordinal()] = 4;
                iArr[jf.k0.CHEEK.ordinal()] = 5;
                iArr[jf.k0.BEARD.ordinal()] = 6;
                iArr[jf.k0.LIP.ordinal()] = 7;
                f50413a = iArr;
            }
        }

        public u0() {
            super(1);
        }

        public final void a(View view) {
            ClosetAvatarGradientColor hairColor;
            jo.p.h(view, "it");
            y.a aVar = r9.y.R0;
            jf.k0 x02 = n1.this.e5().x0();
            ClosetAvatar R = n1.this.e5().R();
            if (R != null) {
                switch (a.f50413a[n1.this.e5().x0().ordinal()]) {
                    case 1:
                        hairColor = R.getHairColor();
                        break;
                    case 2:
                        hairColor = R.getEyebrowColor();
                        break;
                    case 3:
                        hairColor = R.getEyeColor();
                        break;
                    case 4:
                        hairColor = R.getEyeshadowColor();
                        break;
                    case 5:
                        hairColor = R.getCheekColor();
                        break;
                    case 6:
                        hairColor = R.getBeardColor();
                        break;
                    case 7:
                        hairColor = R.getLipColor();
                        break;
                    default:
                        hairColor = null;
                        break;
                }
                if (hairColor == null) {
                    return;
                }
                aVar.a(x02, hairColor).z3(n1.this.p0(), "ColorGradientPickerDialog");
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u1 extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50414w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50415x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50416y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50414w = componentCallbacks;
            this.f50415x = aVar;
            this.f50416y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f50414w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f50415x, this.f50416y);
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<Float> {
        public v() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(de.e.b(n1.this, 40));
        }
    }

    /* loaded from: classes.dex */
    public static final class v0 extends jo.q implements io.p<String, String, wn.v> {
        public v0() {
            super(2);
        }

        public final void a(String str, String str2) {
            jo.p.h(str, "partId");
            jo.p.h(str2, "newText");
            n1.this.c5().f52553a1.setVisibility(8);
            n1.this.c5().Z0.setVisibility(8);
            if (n1.this.e5().x0() == jf.k0.COMPANION) {
                od.e d52 = n1.this.d5();
                String p52 = n1.this.p5();
                jo.p.g(p52, "referer");
                d52.y(p52, str, str2);
                return;
            }
            od.e d53 = n1.this.d5();
            String p53 = n1.this.p5();
            jo.p.g(p53, "referer");
            d53.z(p53, str, str2);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(String str, String str2) {
            a(str, str2);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v1 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50419w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(Fragment fragment) {
            super(0);
            this.f50419w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50419w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50419w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<Float> {
        public w() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((200 * (n1.this.O0().getDisplayMetrics().widthPixels / 360.0f)) + n1.this.O0().getDimension(q9.e.emomo_dress_up_header_height) + n1.this.O0().getDimension(q9.e.emomo_dress_up_footer_height));
        }
    }

    /* loaded from: classes.dex */
    public static final class w0 extends jo.q implements io.a<wn.v> {
        public w0() {
            super(0);
        }

        public final void a() {
            n1.this.c5().f52553a1.setVisibility(8);
            n1.this.c5().Z0.setVisibility(8);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w1 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50422w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(io.a aVar) {
            super(0);
            this.f50422w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50422w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<Float> {
        public x() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(n1.this.O0().getDimension(q9.e.emomo_dress_up_header_height));
        }
    }

    /* loaded from: classes.dex */
    public static final class x0 extends jo.q implements io.l<jf.m0, wn.v> {
        public x0() {
            super(1);
        }

        public final void a(jf.m0 m0Var) {
            jo.p.h(m0Var, "partsLargeCategory");
            if (m0Var != n1.this.e5().z0()) {
                n1 n1Var = n1.this;
                for (jf.d dVar : n1.this.e5().s0().getValue()) {
                    n1Var.d5().g(dVar.a(), dVar.b(), dVar.c());
                }
                n1.this.d5().C(m0Var);
                n1.this.c5().f52555b1.p1(0);
                MRLogger n52 = n1.this.n5();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_CATEGORY_SELECT);
                builder.setTargetId(m0Var.c());
                n52.sendLog(builder.build());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(jf.m0 m0Var) {
            a(m0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x1 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50425w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50426x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50427y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50428z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50425w = aVar;
            this.f50426x = aVar2;
            this.f50427y = aVar3;
            this.f50428z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50425w;
            vq.a aVar2 = this.f50426x;
            io.a aVar3 = this.f50427y;
            xq.a aVar4 = this.f50428z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<Float> {
        public y() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(de.e.b(n1.this, 8));
        }
    }

    /* loaded from: classes.dex */
    public static final class y0 extends jo.q implements io.l<View, wn.v> {
        public y0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.PERSONA);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class y1 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50431w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(io.a aVar) {
            super(0);
            this.f50431w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50431w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<Float> {
        public z() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf((200 * (n1.this.O0().getDisplayMetrics().widthPixels / 360.0f)) + n1.this.O0().getDimension(q9.e.emomo_dress_up_motion_select_header_height));
        }
    }

    /* loaded from: classes.dex */
    public static final class z0 extends jo.q implements io.l<View, wn.v> {
        public z0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n1.this.d5().B(jf.k0.MOTION_UP);
            n1.this.V5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z1 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50434w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(Fragment fragment) {
            super(0);
            this.f50434w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f50434w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f50434w.L2());
        }
    }

    public n1() {
        super(q9.h.dialog_fragment_emomo_dress_up);
        this.N0 = new da.j();
        this.O0 = wn.g.a(new h0());
        this.P0 = wn.g.a(new a0());
        v1 v1Var = new v1(this);
        xq.a a10 = gq.a.a(this);
        w1 w1Var = new w1(v1Var);
        this.T0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.f.class), new y1(w1Var), new x1(v1Var, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.U0 = wn.g.b(iVar, new q1(this, null, null));
        z1 z1Var = new z1(this);
        xq.a a11 = gq.a.a(this);
        a2 a2Var = new a2(z1Var);
        this.V0 = androidx.fragment.app.e0.a(this, jo.f0.b(je.e.class), new c2(a2Var), new b2(z1Var, null, null, a11));
        this.W0 = wn.g.b(iVar, new r1(this, null, null));
        this.X0 = wn.g.b(iVar, new s1(this, null, null));
        this.Y0 = wn.g.b(iVar, new t1(this, null, null));
        this.Z0 = wn.g.b(iVar, new u1(this, null, null));
        this.f50262a1 = new r9.k();
        this.f50263b1 = new r9.k();
        this.f50267f1 = new androidx.lifecycle.e0<>(0);
        this.f50268g1 = new androidx.lifecycle.e0<>();
        this.f50269h1 = wn.g.a(g0.f50319w);
        this.f50270i1 = wn.g.a(new b0());
        this.f50271j1 = wn.g.a(new x());
        this.f50272k1 = wn.g.a(new w());
        this.f50273l1 = wn.g.a(new z());
        this.f50274m1 = wn.g.a(new y());
        this.f50275n1 = wn.g.a(new v());
    }

    public static final void A5(n1 n1Var, ValueAnimator valueAnimator) {
        jo.p.h(n1Var, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        uo.l.d(n1Var, null, null, new e0(((Float) animatedValue).floatValue(), null), 3, null);
    }

    public static final void B5(n1 n1Var) {
        jo.p.h(n1Var, "this$0");
        n1Var.c5().u().getViewTreeObserver().removeOnGlobalLayoutListener(n1Var.f50264c1);
        n1Var.v5();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[EDGE_INSN: B:29:0x0098->B:23:0x0098 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void C4(r9.n1 r5, java.util.List r6) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r5, r0)
            int r0 = r6.size()
            r1 = 5
            r2 = 1
            if (r0 > r1) goto Lf
            r0 = r2
            goto L1b
        Lf:
            nf.f r0 = r5.e5()
            jf.k0 r0 = r0.x0()
            int r0 = r0.h()
        L1b:
            s9.y r3 = r5.c5()
            androidx.recyclerview.widget.RecyclerView r3 = r3.f52559d1
            androidx.recyclerview.widget.RecyclerView$p r3 = r3.getLayoutManager()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            jo.p.f(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            r3.n3(r0)
            r9.k r3 = r5.f50262a1
            r3.f(r0)
            r9.k r0 = r5.f50262a1
            r0.e(r1)
            s9.y r0 = r5.c5()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f52559d1
            androidx.recyclerview.widget.RecyclerView$h r0 = r0.getAdapter()
            java.lang.String r1 = "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.PartsAdapter"
            jo.p.f(r0, r1)
            r9.q1 r0 = (r9.q1) r0
            nf.f r1 = r5.e5()
            jf.k0 r1 = r1.x0()
            jf.e r1 = r1.l()
            r0.k(r1)
            r0.d(r6)
            java.lang.String r0 = "partBindModels"
            jo.p.g(r6, r0)
            r5.U5(r6)
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L97
            java.lang.Object r0 = r6.next()
            r3 = r0
            ud.p r3 = (ud.p) r3
            boolean r4 = r3 instanceof ud.q
            if (r4 == 0) goto L93
            ud.q r3 = (ud.q) r3
            boolean r4 = r3.q()
            if (r4 == 0) goto L93
            java.lang.String r3 = r3.g()
            int r3 = r3.length()
            if (r3 <= 0) goto L8e
            r3 = r2
            goto L8f
        L8e:
            r3 = r1
        L8f:
            if (r3 == 0) goto L93
            r3 = r2
            goto L94
        L93:
            r3 = r1
        L94:
            if (r3 == 0) goto L68
            goto L98
        L97:
            r0 = 0
        L98:
            ud.p r0 = (ud.p) r0
            if (r0 == 0) goto Lb5
            s9.y r6 = r5.c5()
            androidx.constraintlayout.widget.ConstraintLayout r6 = r6.L0
            r6.setVisibility(r1)
            s9.y r5 = r5.c5()
            androidx.appcompat.widget.AppCompatTextView r5 = r5.N0
            ud.q r0 = (ud.q) r0
            java.lang.String r6 = r0.g()
            r5.setText(r6)
            goto Lc0
        Lb5:
            s9.y r5 = r5.c5()
            androidx.constraintlayout.widget.ConstraintLayout r5 = r5.L0
            r6 = 8
            r5.setVisibility(r6)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.n1.C4(r9.n1, java.util.List):void");
    }

    public static final void D4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        int h10 = list.size() <= 5 ? 1 : n1Var.e5().x0().h();
        RecyclerView.p layoutManager = n1Var.c5().U0.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).n3(h10);
        n1Var.f50263b1.f(h10);
        n1Var.f50263b1.e(5);
        RecyclerView.h adapter = n1Var.c5().U0.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.PartsAdapter");
        r9.q1 q1Var = (r9.q1) adapter;
        q1Var.k(n1Var.e5().x0().l());
        q1Var.d(list);
        jo.p.g(list, "partBindModels");
        n1Var.U5(list);
    }

    public static final void E4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        if (list.isEmpty()) {
            n1Var.c5().J.setVisibility(8);
            return;
        }
        n1Var.c5().J.setVisibility(0);
        RecyclerView.h adapter = n1Var.c5().J.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.ClosetColorPickerAdapter");
        jo.p.g(list, "colorPickerBindModels");
        ((r9.b) adapter).f(list);
        RecyclerView.p layoutManager = n1Var.c5().J.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((ud.o) it.next()).c()) {
                break;
            } else {
                i10++;
            }
        }
        linearLayoutManager.R1(n1Var.c5().J, null, Math.max(0, i10));
    }

    public static final void F4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        ConstraintLayout constraintLayout = n1Var.c5().I;
        jo.p.g(bool, "it");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void F5(n1 n1Var, ValueAnimator valueAnimator) {
        jo.p.h(n1Var, "this$0");
        androidx.lifecycle.e0<Integer> e0Var = n1Var.f50267f1;
        Object animatedValue = valueAnimator.getAnimatedValue();
        jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        e0Var.p((Integer) animatedValue);
    }

    public static final void G4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            n1Var.C5();
            n1Var.c5().f52590t0.setVisibility(0);
            return;
        }
        n1Var.c5().f52590t0.setVisibility(8);
    }

    public static final void H4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            n1Var.D5();
            n1Var.c5().J0.setVisibility(0);
            return;
        }
        n1Var.c5().J0.setVisibility(8);
    }

    public static final void I4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        PartsLargeCategoryTabView partsLargeCategoryTabView = n1Var.c5().f52557c1;
        jo.p.g(list, "it");
        partsLargeCategoryTabView.c(list, n1Var.e5().z0().ordinal());
    }

    public static final void J4(n1 n1Var, wn.k kVar) {
        jo.p.h(n1Var, "this$0");
        int intValue = ((Number) kVar.a()).intValue();
        int intValue2 = ((Number) kVar.b()).intValue();
        n1Var.c5().f52579n1.setVisibility(intValue);
        n1Var.c5().f52579n1.setIcon(q9.f.ic_shooter_logo_small);
        n1Var.c5().f52581o1.setVisibility(intValue2);
    }

    public static final boolean J5(n1 n1Var, View view, MotionEvent motionEvent) {
        float g52;
        jo.p.h(n1Var, "this$0");
        Boolean f10 = n1Var.e5().B().f();
        Boolean bool = Boolean.TRUE;
        if (jo.p.c(f10, bool)) {
            g52 = n1Var.h5();
        } else {
            g52 = n1Var.g5();
        }
        float max = Math.max(Math.min(((int) (n1Var.f50265d1 - motionEvent.getRawY())) + g52, n1Var.g5()), n1Var.h5());
        int action = motionEvent.getAction();
        if (action == 0) {
            n1Var.f50265d1 = motionEvent.getRawY();
            n1Var.f50266e1 = true;
            return true;
        } else if (action != 1) {
            if (action != 2) {
                return false;
            }
            n1Var.W5(n1Var.g5() - max);
            return true;
        } else {
            if (jo.p.c(n1Var.e5().B().f(), bool)) {
                od.e d52 = n1Var.d5();
                Boolean f11 = n1Var.e5().B().f();
                if (f11 == null) {
                    f11 = Boolean.FALSE;
                }
                d52.r(!f11.booleanValue());
            } else if (Math.abs(g52 - max) >= 50.0f) {
                od.e d53 = n1Var.d5();
                Boolean f12 = n1Var.e5().B().f();
                if (f12 == null) {
                    f12 = Boolean.FALSE;
                }
                d53.r(!f12.booleanValue());
            } else {
                Boolean f13 = n1Var.e5().B().f();
                if (f13 == null) {
                    f13 = Boolean.FALSE;
                }
                n1Var.Y5(f13.booleanValue());
            }
            return true;
        }
    }

    public static final void K4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        AppCompatButton appCompatButton = n1Var.c5().f52575l1;
        jo.p.g(bool, "isVisible");
        appCompatButton.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void L4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        RoundedButtonView roundedButtonView = n1Var.c5().f52593u1;
        jo.p.g(bool, "isVisible");
        roundedButtonView.setVisibility(bool.booleanValue() ? 0 : 8);
        n1Var.c5().f52593u1.setEnabled(false);
    }

    public static final void M4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        AppCompatButton appCompatButton = n1Var.c5().f52571j1;
        jo.p.g(bool, "isVisible");
        appCompatButton.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void N4(n1 n1Var, Integer num) {
        jo.p.h(n1Var, "this$0");
        n1Var.X5();
    }

    public static final void N5(n1 n1Var, View view) {
        jo.p.h(n1Var, "this$0");
        n1Var.c5().f52553a1.setVisibility(8);
        n1Var.c5().Z0.setVisibility(8);
    }

    public static final void O4(final n1 n1Var, jf.p pVar) {
        jo.p.h(n1Var, "this$0");
        pVar.f().i(n1Var.a1(), new androidx.lifecycle.f0() { // from class: r9.q0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.P4(n1.this, (CharSequence) obj);
            }
        });
        EditPartTextView editPartTextView = n1Var.c5().K0;
        androidx.lifecycle.u a12 = n1Var.a1();
        jo.p.g(a12, "viewLifecycleOwner");
        jo.p.g(pVar, "bindModel");
        editPartTextView.g(a12, pVar);
    }

    public static final o3.p0 O5(n1 n1Var, View view, o3.p0 p0Var) {
        jo.p.h(n1Var, "this$0");
        if (p0Var.q(p0.m.c())) {
            n1Var.c5().L.setVisibility(8);
            n1Var.c5().f52592u0.setVisibility(8);
            n1Var.c5().K0.i();
            vb.p pVar = n1Var.R0;
            if (pVar != null) {
                pVar.W0(0.0f);
            }
        } else {
            n1Var.c5().L.setVisibility(0);
            n1Var.c5().f52592u0.setVisibility(0);
            vb.p pVar2 = n1Var.R0;
            if (pVar2 != null) {
                pVar2.W0(n1Var.g5() - n1Var.i5());
            }
        }
        return p0Var;
    }

    public static final void P4(n1 n1Var, CharSequence charSequence) {
        jo.p.h(n1Var, "this$0");
        UnityManager.Companion.getInstance().setPartsComment(n1Var.e5().x0(), charSequence.toString());
    }

    public static final void Q4(n1 n1Var, jf.n nVar) {
        jo.p.h(n1Var, "this$0");
        n1Var.c5().E.setVisibility(nVar.b() ? 0 : 8);
        n1Var.c5().E.b(new i(nVar, n1Var));
    }

    public static final void R4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        jo.p.g(bool, "isAvatarPreviewMode");
        n1Var.Y5(bool.booleanValue());
    }

    public static final void S4(n1 n1Var, Integer num) {
        jo.p.h(n1Var, "this$0");
        LinearLayout linearLayout = n1Var.c5().f52592u0;
        float j52 = n1Var.j5();
        jo.p.g(num, "it");
        linearLayout.setTranslationY(j52 - num.intValue());
    }

    public static final void T4(n1 n1Var, Integer num) {
        jo.p.h(n1Var, "this$0");
        ViewGroup.LayoutParams layoutParams = n1Var.c5().U0.getLayoutParams();
        jo.p.g(num, "it");
        layoutParams.height = num.intValue();
        n1Var.c5().U0.x0();
    }

    public static final void U4(n1 n1Var, Boolean bool) {
        jo.p.h(n1Var, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            n1Var.c5().f52567h1.setVisibility(0);
        } else {
            n1Var.c5().f52567h1.setVisibility(8);
        }
    }

    public static final void V4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        if (n1Var.l5()) {
            n1Var.c5().f52583p1.setVisibility(8);
            n1Var.c5().f52585q1.setVisibility(8);
            n1Var.c5().f52587r1.setVisibility(8);
            n1Var.c5().f52589s1.setVisibility(8);
            return;
        }
        jo.p.g(list, "closets");
        if ((!list.isEmpty()) && ((Closet) list.get(0)).isUsed()) {
            n1Var.c5().f52583p1.setVisibility(0);
            n1Var.c5().f52585q1.setVisibility(0);
            n1Var.c5().f52587r1.setVisibility(0);
            n1Var.c5().f52589s1.setVisibility(0);
            return;
        }
        n1Var.c5().f52583p1.setVisibility(8);
        n1Var.c5().f52585q1.setVisibility(8);
        n1Var.c5().f52587r1.setVisibility(8);
        n1Var.c5().f52589s1.setVisibility(8);
    }

    public static final void W4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        n1Var.c5().D0.setVisibility(list.contains(jf.k0.LEFT_WEAPON) ? 0 : 8);
        n1Var.c5().f52598z0.setVisibility(list.contains(jf.k0.BOTH_WEAPON) ? 0 : 8);
        n1Var.c5().H0.setVisibility(list.contains(jf.k0.RIGHT_WEAPON) ? 0 : 8);
    }

    public static final void X4(n1 n1Var, Closet closet) {
        String format;
        jo.p.h(n1Var, "this$0");
        if (closet != null) {
            AppCompatTextView appCompatTextView = n1Var.c5().f52587r1;
            if (closet.getName().length() > 0) {
                format = closet.getName();
            } else {
                jo.i0 i0Var = jo.i0.f38149a;
                String string = n1Var.N2().getString(q9.i.I);
                jo.p.g(string, "requireContext().getStri…t_emomo_slot_with_number)");
                format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(closet.getClosetId())}, 1));
                jo.p.g(format, "format(format, *args)");
            }
            appCompatTextView.setText(format);
            GlideRequest<Drawable> placeholder = GlideApp.with(n1Var.c5().f52585q1).load(closet.getAvatarFaceImageUrl()).placeholder(q9.f.M);
            AppCompatImageView appCompatImageView = n1Var.c5().f52585q1;
            jo.p.g(appCompatImageView, "binding.slotIconImageView");
            placeholder.apply((e8.a<?>) e8.h.bitmapTransform(new xd.a(de.n.b(appCompatImageView, 2), c3.a.d(n1Var.N2(), q9.d.G)))).into(n1Var.c5().f52585q1);
        }
    }

    public static final void Y4(n1 n1Var, Integer num) {
        jo.p.h(n1Var, "this$0");
        RemainingKandumeView remainingKandumeView = n1Var.c5().f52569i1;
        jo.p.g(num, "it");
        remainingKandumeView.setRemainingKandume(num.intValue());
    }

    public static final void Z4(n1 n1Var, List list) {
        jo.p.h(n1Var, "this$0");
        RecyclerView.h adapter = n1Var.c5().f52555b1.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.emomo.closet.PartsCategoryAdapter");
        jo.p.g(list, "it");
        ((r9.r1) adapter).f(list);
        n1Var.c5().B.setVisibility(list.isEmpty() ? 8 : 0);
        n1Var.c5().f52555b1.setVisibility(list.isEmpty() ? 8 : 0);
    }

    public static final void b5(n1 n1Var, EventNoticeResponse eventNoticeResponse) {
        jo.p.h(n1Var, "this$0");
        if (eventNoticeResponse != null) {
            n1Var.c5().f52591t1.setVisibility(eventNoticeResponse.getBanners().isEmpty() ^ true ? 0 : 8);
            SwitchableEventBannerIconView switchableEventBannerIconView = n1Var.c5().f52591t1;
            List<EventBannerResponse> banners = eventNoticeResponse.getBanners();
            ArrayList arrayList = new ArrayList(xn.t.u(banners, 10));
            for (EventBannerResponse eventBannerResponse : banners) {
                arrayList.add(wn.q.a(eventBannerResponse.getIconUrl(), Boolean.FALSE));
            }
            switchableEventBannerIconView.setEventBannerImageUrls(arrayList);
            n1Var.c5().f52591t1.setOnSingleTapUpListener(new u(eventNoticeResponse));
        }
    }

    public static final void w5(n1 n1Var, ValueAnimator valueAnimator) {
        jo.p.h(n1Var, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        uo.l.d(n1Var, null, null, new c0(((Float) animatedValue).floatValue(), null), 3, null);
    }

    public static final boolean x5(n1 n1Var, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(n1Var, "this$0");
        int action = keyEvent.getAction();
        boolean z10 = false;
        if (action == 1 && i10 == 4) {
            if (n1Var.u5()) {
                n1Var.t5();
            } else if (jo.p.c(n1Var.e5().B().f(), Boolean.TRUE)) {
                od.e d52 = n1Var.d5();
                Boolean f10 = n1Var.e5().B().f();
                if (f10 == null) {
                    f10 = Boolean.FALSE;
                }
                d52.r(!f10.booleanValue());
            } else {
                vb.p pVar = n1Var.R0;
                if (pVar != null) {
                    if (n1Var.e5().Q() || n1Var.e5().G()) {
                        z10 = true;
                    }
                    pVar.r1(z10);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z5(n1 n1Var, float f10, io.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = n1Var.h5();
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        n1Var.y5(f10, aVar);
    }

    public final void B4() {
        e5().O().i(a1(), new androidx.lifecycle.f0() { // from class: r9.k1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.X4(n1.this, (Closet) obj);
            }
        });
        e5().q0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.u0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.Y4(n1.this, (Integer) obj);
            }
        });
        uo.l.d(this, null, null, new j(null), 3, null);
        e5().J().i(a1(), new t());
        e5().o0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.y0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.Z4(n1.this, (List) obj);
            }
        });
        e5().n0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.d1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.C4(n1.this, (List) obj);
            }
        });
        List k10 = xn.s.k();
        LiveData b10 = androidx.lifecycle.p0.b(this.f50267f1, new e());
        jo.p.g(b10, "crossinline transform: (…p(this) { transform(it) }");
        LiveData<List<ud.p>> j02 = e5().j0();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(k10);
        for (LiveData liveData : xn.s.m(b10, j02)) {
            c0Var.q(liveData, new c(c0Var, b10, j02));
        }
        LiveData a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        a10.i(a1(), new androidx.lifecycle.f0() { // from class: r9.a1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.D4(n1.this, (List) obj);
            }
        });
        e5().L().i(a1(), new androidx.lifecycle.f0() { // from class: r9.w0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.E4(n1.this, (List) obj);
            }
        });
        e5().N2().i(a1(), new androidx.lifecycle.f0() { // from class: r9.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.F4(n1.this, (Boolean) obj);
            }
        });
        e5().P2().i(a1(), new androidx.lifecycle.f0() { // from class: r9.n0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.G4(n1.this, (Boolean) obj);
            }
        });
        e5().Q2().i(a1(), new androidx.lifecycle.f0() { // from class: r9.o0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.H4(n1.this, (Boolean) obj);
            }
        });
        e5().p0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.b1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.I4(n1.this, (List) obj);
            }
        });
        wn.k kVar = new wn.k(8, 8);
        androidx.lifecycle.e0<EventNoticeResponse> g10 = k5().g();
        LiveData<Boolean> C0 = e5().C0();
        LiveData<Boolean> C2 = e5().C2();
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
        c0Var2.p(kVar);
        for (LiveData liveData2 : xn.s.m(g10, C0, C2)) {
            c0Var2.q(liveData2, new d(c0Var2, g10, C0, C2));
        }
        LiveData a11 = androidx.lifecycle.p0.a(c0Var2);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(a1(), new androidx.lifecycle.f0() { // from class: r9.e1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.J4(n1.this, (wn.k) obj);
            }
        });
        e5().v0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.i0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.K4(n1.this, (Boolean) obj);
            }
        });
        e5().G0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.L4(n1.this, (Boolean) obj);
            }
        });
        e5().t0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.k0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.M4(n1.this, (Boolean) obj);
            }
        });
        e5().r0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.s0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.N4(n1.this, (Integer) obj);
            }
        });
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        e5().P().i(a1(), new androidx.lifecycle.f0() { // from class: r9.m1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.O4(n1.this, (jf.p) obj);
            }
        });
        e5().A0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.l1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.Q4(n1.this, (jf.n) obj);
            }
        });
        e5().B().i(a1(), new androidx.lifecycle.f0() { // from class: r9.p0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.R4(n1.this, (Boolean) obj);
            }
        });
        this.f50267f1.i(a1(), new androidx.lifecycle.f0() { // from class: r9.v0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.S4(n1.this, (Integer) obj);
            }
        });
        this.f50268g1.i(a1(), new androidx.lifecycle.f0() { // from class: r9.t0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.T4(n1.this, (Integer) obj);
            }
        });
        e5().M0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.U4(n1.this, (Boolean) obj);
            }
        });
        e5().K().i(a1(), new androidx.lifecycle.f0() { // from class: r9.z0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.V4(n1.this, (List) obj);
            }
        });
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        uo.l.d(this, null, null, new r(null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
        e5().H0().i(a1(), new androidx.lifecycle.f0() { // from class: r9.x0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.W4(n1.this, (List) obj);
            }
        });
    }

    public final void C5() {
        boolean z10;
        Object obj;
        boolean z11;
        Object obj2;
        boolean z12;
        Object obj3;
        boolean z13;
        Object obj4;
        boolean z14;
        a.b b10 = q5().b(21);
        if (b10.b()) {
            be.b1.O0.a().z3(O2(), "EmomoMotionIntroductionDialog");
            b10.a();
        }
        List<ud.q> f10 = e5().S().f();
        Object obj5 = null;
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (((ud.q) obj4).l() == jf.k0.PERSONA) {
                    z14 = true;
                    continue;
                } else {
                    z14 = false;
                    continue;
                }
                if (z14) {
                    break;
                }
            }
            ud.q qVar = (ud.q) obj4;
            if (qVar != null) {
                GlideApp.with(c5().f52562f0).load(qVar.i()).into(c5().f52562f0);
                c5().f52564g0.setText(qVar.k());
            }
        }
        List<ud.q> f11 = e5().S().f();
        if (f11 != null) {
            Iterator<T> it2 = f11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((ud.q) obj3).l() == jf.k0.MOTION_UP) {
                    z13 = true;
                    continue;
                } else {
                    z13 = false;
                    continue;
                }
                if (z13) {
                    break;
                }
            }
            ud.q qVar2 = (ud.q) obj3;
            if (qVar2 != null) {
                GlideApp.with(c5().f52584q0).load(qVar2.i()).into(c5().f52584q0);
                c5().f52588s0.setText(qVar2.k());
                c5().f52586r0.setText(String.valueOf(qVar2.n()));
                c5().f52578n0.setVisibility(qVar2.x() ? 0 : 8);
            }
        }
        List<ud.q> f12 = e5().S().f();
        if (f12 != null) {
            Iterator<T> it3 = f12.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (((ud.q) obj2).l() == jf.k0.MOTION_LEFT) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    break;
                }
            }
            ud.q qVar3 = (ud.q) obj2;
            if (qVar3 != null) {
                GlideApp.with(c5().f52554b0).load(qVar3.i()).into(c5().f52554b0);
                c5().f52558d0.setText(qVar3.k());
                c5().f52556c0.setText(String.valueOf(qVar3.n()));
                c5().Y.setVisibility(qVar3.x() ? 0 : 8);
            }
        }
        List<ud.q> f13 = e5().S().f();
        if (f13 != null) {
            Iterator<T> it4 = f13.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (((ud.q) obj).l() == jf.k0.MOTION_RIGHT) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            ud.q qVar4 = (ud.q) obj;
            if (qVar4 != null) {
                GlideApp.with(c5().f52572k0).load(qVar4.i()).into(c5().f52572k0);
                c5().f52576m0.setText(qVar4.k());
                c5().f52574l0.setText(String.valueOf(qVar4.n()));
                c5().f52566h0.setVisibility(qVar4.x() ? 0 : 8);
            }
        }
        List<ud.q> f14 = e5().S().f();
        if (f14 != null) {
            Iterator<T> it5 = f14.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (((ud.q) next).l() == jf.k0.MOTION_DOWN) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj5 = next;
                    break;
                }
            }
            ud.q qVar5 = (ud.q) obj5;
            if (qVar5 != null) {
                GlideApp.with(c5().T).load(qVar5.i()).into(c5().T);
                c5().V.setText(qVar5.k());
                c5().U.setText(String.valueOf(qVar5.n()));
                c5().Q.setVisibility(qVar5.x() ? 0 : 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (com.dena.mirrorman.net.glide.GlideApp.with(c5().C0).load(r4.i()).into(c5().C0) != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (com.dena.mirrorman.net.glide.GlideApp.with(c5().G0).load(r4.i()).into(c5().G0) != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D5() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.n1.D5():void");
    }

    public final void E5(int i10) {
        int[] iArr = new int[2];
        Integer f10 = this.f50267f1.f();
        if (f10 == null) {
            f10 = 0;
        }
        iArr[0] = f10.intValue();
        iArr[1] = i10;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r9.r0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n1.F5(n1.this, valueAnimator);
            }
        });
        ofInt.start();
    }

    public final void G5() {
        r9.r1 r1Var = new r9.r1();
        c5().f52555b1.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        c5().f52555b1.setAdapter(r1Var);
        int b10 = de.e.b(this, 12);
        c5().f52555b1.g(new p001if.c(de.e.b(this, 8), b10, 0, b10, 0, 0));
        r1Var.g(new i0());
    }

    public final void H5() {
        View view = c5().D;
        jo.p.g(view, "binding.closeButton");
        yd.g1.a(view, new j0());
        AppCompatButton appCompatButton = c5().f52571j1;
        jo.p.g(appCompatButton, "binding.resetButton");
        yd.g1.a(appCompatButton, new k0());
        RoundedButtonView roundedButtonView = c5().f52579n1;
        jo.p.g(roundedButtonView, "binding.shooterButton");
        yd.g1.a(roundedButtonView, new l0());
        AppCompatButton appCompatButton2 = c5().f52575l1;
        jo.p.g(appCompatButton2, "binding.saveButton");
        yd.g1.a(appCompatButton2, new m0());
        EmomoDressUpBuyButtonView emomoDressUpBuyButtonView = c5().C;
        jo.p.g(emomoDressUpBuyButtonView, "binding.buyButton");
        yd.g1.a(emomoDressUpBuyButtonView, new n0());
        View view2 = c5().f52583p1;
        jo.p.g(view2, "binding.slotBackground");
        yd.g1.a(view2, new o0());
        RemainingKandumeView remainingKandumeView = c5().f52569i1;
        jo.p.g(remainingKandumeView, "binding.remainingKandumeView");
        yd.g1.a(remainingKandumeView, new p0());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        c5().u().getViewTreeObserver().removeOnGlobalLayoutListener(this.f50264c1);
        UnityManager.Companion.getInstance().initCloset(false);
        this.R0 = null;
        this.S0 = null;
        this.Q0 = null;
        super.I1();
    }

    public final void I5() {
        c5().F.setOnTouchListener(new View.OnTouchListener() { // from class: r9.i1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean J5;
                J5 = n1.J5(n1.this, view, motionEvent);
                return J5;
            }
        });
    }

    public final void K5() {
        c5().H.setOnScaleListener(new q0());
        c5().H.setOnScrollListener(new r0());
        c5().H.setOnFlingListener(new s0());
    }

    public final void L5() {
        r9.b bVar = new r9.b();
        c5().J.setAdapter(bVar);
        c5().J.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        bVar.g(new t0(bVar));
        ConstraintLayout constraintLayout = c5().I;
        jo.p.g(constraintLayout, "binding.colorPaletteGradientSettingContainer");
        yd.g1.a(constraintLayout, new u0());
    }

    public final void M5() {
        Window window;
        View decorView;
        c5().K0.setOnCompleteChangeNameListener(new v0());
        c5().f52553a1.setOnCloseImageViewListener(new w0());
        c5().Z0.setOnClickListener(new View.OnClickListener() { // from class: r9.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n1.N5(n1.this, view);
            }
        });
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        o3.c0.F0(decorView, new o3.v() { // from class: r9.f1
            @Override // o3.v
            public final o3.p0 a(View view, o3.p0 p0Var) {
                o3.p0 O5;
                O5 = n1.O5(n1.this, view, p0Var);
                return O5;
            }
        });
    }

    public final void P5() {
        c5().f52557c1.setSelectedListener(new x0());
    }

    public final void Q5() {
        c5().P.setText(Y0(q9.i.text_emomo_motion_base));
        c5().W.setText(Y0(q9.i.text_emomo_motion_flick));
        float f10 = Resources.getSystem().getDisplayMetrics().widthPixels / 360.0f;
        int i10 = (int) (90 * f10);
        c5().f52560e0.getLayoutParams().height = i10;
        c5().f52560e0.getLayoutParams().width = i10;
        int i11 = (int) (56 * f10);
        c5().f52582p0.getLayoutParams().height = i11;
        c5().f52582p0.getLayoutParams().width = i11;
        c5().f52552a0.getLayoutParams().height = i11;
        c5().f52552a0.getLayoutParams().width = i11;
        c5().f52570j0.getLayoutParams().height = i11;
        c5().f52570j0.getLayoutParams().width = i11;
        c5().S.getLayoutParams().height = i11;
        c5().S.getLayoutParams().width = i11;
        int i12 = (int) (48 * f10);
        ViewGroup.LayoutParams layoutParams = c5().f52582p0.getLayoutParams();
        jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams).f14771p = i12;
        ViewGroup.LayoutParams layoutParams2 = c5().f52552a0.getLayoutParams();
        jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams2).f14771p = i12;
        ViewGroup.LayoutParams layoutParams3 = c5().f52570j0.getLayoutParams();
        jo.p.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams3).f14771p = i12;
        ViewGroup.LayoutParams layoutParams4 = c5().S.getLayoutParams();
        jo.p.f(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams4).f14771p = i12;
        ConstraintLayout constraintLayout = c5().f52560e0;
        jo.p.g(constraintLayout, "binding.dressUpMotionPersonaContainer");
        yd.g1.a(constraintLayout, new y0());
        ConstraintLayout constraintLayout2 = c5().f52582p0;
        jo.p.g(constraintLayout2, "binding.dressUpMotionUpMotionContainer");
        yd.g1.a(constraintLayout2, new z0());
        ConstraintLayout constraintLayout3 = c5().f52552a0;
        jo.p.g(constraintLayout3, "binding.dressUpMotionLeftMotionContainer");
        yd.g1.a(constraintLayout3, new a1());
        ConstraintLayout constraintLayout4 = c5().f52570j0;
        jo.p.g(constraintLayout4, "binding.dressUpMotionRightMotionContainer");
        yd.g1.a(constraintLayout4, new b1());
        ConstraintLayout constraintLayout5 = c5().S;
        jo.p.g(constraintLayout5, "binding.dressUpMotionDownMotionContainer");
        yd.g1.a(constraintLayout5, new c1());
        AppCompatImageView appCompatImageView = c5().X;
        jo.p.g(appCompatImageView, "binding.dressUpMotionHelpImageView");
        yd.g1.a(appCompatImageView, new d1());
    }

    public final void R5() {
        r9.q1 q1Var = new r9.q1(o5());
        c5().U0.setItemAnimator(null);
        c5().U0.setAdapter(q1Var);
        c5().U0.setLayoutManager(new GridLayoutManager(N2(), 1, 0, false));
        c5().U0.g(new p001if.a(m5()));
        r9.k kVar = this.f50263b1;
        RecyclerView recyclerView = c5().U0;
        jo.p.g(recyclerView, "binding.overlayPartsRecyclerView");
        kVar.d(recyclerView);
        HorizontalScrollBar horizontalScrollBar = c5().T0;
        RecyclerView recyclerView2 = c5().U0;
        jo.p.g(recyclerView2, "binding.overlayPartsRecyclerView");
        horizontalScrollBar.setRecyclerView(recyclerView2);
        c5().U0.k(new e1());
        q1Var.j(new f1());
        q1Var.i(new g1());
        AppCompatImageView appCompatImageView = c5().V0;
        jo.p.g(appCompatImageView, "binding.overlayPartsSelectHeaderCloseButton");
        yd.g1.a(appCompatImageView, new h1());
        View view = c5().G;
        jo.p.g(view, "binding.closetDressUpOve…PartsSelectBackgroundView");
        yd.g1.a(view, new i1());
    }

    public final void S5() {
        r9.q1 q1Var = new r9.q1(o5());
        c5().f52559d1.setItemAnimator(null);
        c5().f52559d1.setAdapter(q1Var);
        c5().f52559d1.setLayoutManager(new GridLayoutManager(N2(), 1, 0, false));
        c5().f52559d1.g(new p001if.a(m5()));
        r9.k kVar = this.f50262a1;
        RecyclerView recyclerView = c5().f52559d1;
        jo.p.g(recyclerView, "binding.partsRecyclerView");
        kVar.d(recyclerView);
        HorizontalScrollBar horizontalScrollBar = c5().S0;
        RecyclerView recyclerView2 = c5().f52559d1;
        jo.p.g(recyclerView2, "binding.partsRecyclerView");
        horizontalScrollBar.setRecyclerView(recyclerView2);
        c5().f52559d1.k(new j1());
        q1Var.j(new k1());
        q1Var.i(new l1());
    }

    public final void T5() {
        int i10 = (int) (56 * (Resources.getSystem().getDisplayMetrics().widthPixels / 360.0f));
        c5().B0.getLayoutParams().height = i10;
        c5().B0.getLayoutParams().width = i10;
        c5().f52596x0.getLayoutParams().height = i10;
        c5().f52596x0.getLayoutParams().width = i10;
        c5().F0.getLayoutParams().height = i10;
        c5().F0.getLayoutParams().width = i10;
        ConstraintLayout constraintLayout = c5().B0;
        jo.p.g(constraintLayout, "binding.dressUpWeaponLeftContainer");
        yd.g1.a(constraintLayout, new m1());
        ConstraintLayout constraintLayout2 = c5().f52596x0;
        jo.p.g(constraintLayout2, "binding.dressUpWeaponBothContainer");
        yd.g1.a(constraintLayout2, new C0767n1());
        ConstraintLayout constraintLayout3 = c5().F0;
        jo.p.g(constraintLayout3, "binding.dressUpWeaponRightContainer");
        yd.g1.a(constraintLayout3, new o1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U5(java.util.List<? extends ud.p> r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.Object r1 = r7.next()
            ud.p r1 = (ud.p) r1
            boolean r3 = r1 instanceof ud.q
            if (r3 == 0) goto L1d
            r2 = r1
            ud.q r2 = (ud.q) r2
        L1d:
            if (r2 == 0) goto L9
            r0.add(r2)
            goto L9
        L23:
            java.util.Iterator r7 = r0.iterator()
        L27:
            boolean r0 = r7.hasNext()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L58
            java.lang.Object r0 = r7.next()
            r4 = r0
            ud.q r4 = (ud.q) r4
            boolean r5 = r4.q()
            if (r5 == 0) goto L54
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L4f
            int r4 = r4.length()
            if (r4 <= 0) goto L4a
            r4 = r1
            goto L4b
        L4a:
            r4 = r3
        L4b:
            if (r4 != r1) goto L4f
            r4 = r1
            goto L50
        L4f:
            r4 = r3
        L50:
            if (r4 == 0) goto L54
            r4 = r1
            goto L55
        L54:
            r4 = r3
        L55:
            if (r4 == 0) goto L27
            r2 = r0
        L58:
            ud.q r2 = (ud.q) r2
            r7 = 8
            if (r2 == 0) goto Lcc
            s9.y r0 = r6.c5()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.O0
            r0.setVisibility(r3)
            s9.y r0 = r6.c5()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.O0
            java.lang.String r4 = "binding.eventBannerImageContainer"
            jo.p.g(r0, r4)
            r9.n1$p1 r4 = new r9.n1$p1
            r4.<init>(r2, r6)
            yd.g1.a(r0, r4)
            s9.y r0 = r6.c5()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.Q0
            boolean r4 = r2.E()
            if (r4 == 0) goto L87
            r7 = r3
        L87:
            r0.setVisibility(r7)
            s9.y r7 = r6.c5()
            androidx.appcompat.widget.AppCompatImageView r7 = r7.P0
            com.dena.mirrorman.net.glide.GlideRequests r7 = com.dena.mirrorman.net.glide.GlideApp.with(r7)
            java.lang.String r0 = r2.d()
            com.dena.mirrorman.net.glide.GlideRequest r7 = r7.load(r0)
            m7.f r0 = new m7.f
            m7.l[] r1 = new m7.l[r1]
            sn.c r4 = new sn.c
            r5 = 4
            int r5 = de.e.b(r6, r5)
            boolean r2 = r2.E()
            if (r2 == 0) goto Lb0
            sn.c$b r2 = sn.c.b.TOP
            goto Lb2
        Lb0:
            sn.c$b r2 = sn.c.b.ALL
        Lb2:
            r4.<init>(r5, r3, r2)
            r1[r3] = r4
            r0.<init>(r1)
            e8.h r0 = e8.h.bitmapTransform(r0)
            com.dena.mirrorman.net.glide.GlideRequest r7 = r7.apply(r0)
            s9.y r0 = r6.c5()
            androidx.appcompat.widget.AppCompatImageView r0 = r0.P0
            r7.into(r0)
            goto Ld5
        Lcc:
            s9.y r0 = r6.c5()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.O0
            r0.setVisibility(r7)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.n1.U5(java.util.List):void");
    }

    public final void V5() {
        CharSequence Y0;
        AppCompatTextView appCompatTextView = c5().W0;
        jf.k0 x02 = e5().x0();
        int[] iArr = b.f50279a;
        switch (iArr[x02.ordinal()]) {
            case 1:
                Y0 = Y0(q9.i.text_emomo_motion_base);
                break;
            case 2:
                Y0 = Y0(q9.i.text_emomo_motion_flick_up);
                break;
            case 3:
                Y0 = Y0(q9.i.text_emomo_motion_flick_left);
                break;
            case 4:
                Y0 = Y0(q9.i.text_emomo_motion_flick_right);
                break;
            case 5:
                Y0 = Y0(q9.i.text_emomo_motion_flick_down);
                break;
            case 6:
                jo.i0 i0Var = jo.i0.f38149a;
                Y0 = String.format(Y0(q9.i.text_avatar_part_weapon_item_title).toString(), Arrays.copyOf(new Object[]{Y0(q9.i.text_avatar_part_left_hand_weapon_title)}, 1));
                jo.p.g(Y0, "format(format, *args)");
                break;
            case 7:
                jo.i0 i0Var2 = jo.i0.f38149a;
                Y0 = String.format(Y0(q9.i.text_avatar_part_weapon_item_title).toString(), Arrays.copyOf(new Object[]{Y0(q9.i.text_avatar_part_right_hand_weapon_title)}, 1));
                jo.p.g(Y0, "format(format, *args)");
                break;
            case 8:
                jo.i0 i0Var3 = jo.i0.f38149a;
                Y0 = String.format(Y0(q9.i.text_avatar_part_weapon_item_title).toString(), Arrays.copyOf(new Object[]{Y0(q9.i.text_avatar_part_both_hand_weapon_title)}, 1));
                jo.p.g(Y0, "format(format, *args)");
                break;
            default:
                Y0 = "";
                break;
        }
        appCompatTextView.setText(Y0);
        c5().G.setVisibility(0);
        Integer f10 = this.f50267f1.f();
        if (f10 != null && f10.intValue() == 0) {
            E5((int) j5());
        } else {
            this.f50267f1.p(Integer.valueOf((int) j5()));
        }
        switch (iArr[e5().x0().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C5();
                return;
            case 6:
            case 7:
            case 8:
                D5();
                return;
            default:
                return;
        }
    }

    @Override // r9.z
    public void W(float f10, jf.k0 k0Var) {
        jo.p.h(k0Var, "partsCategory");
        d5().x(f10, k0Var);
    }

    public final void W5(float f10) {
        c5().L.setTranslationY(f10);
        c5().F.setTranslationY(c5().L.getTranslationY());
        c5().f52590t0.setTranslationY(c5().L.getTranslationY());
        c5().J0.setTranslationY(c5().L.getTranslationY());
    }

    public final void X5() {
        Integer f10 = e5().r0().f();
        if (f10 == null) {
            return;
        }
        int intValue = f10.intValue();
        Boolean f11 = e5().D().f();
        if (f11 == null) {
            return;
        }
        if (!f11.booleanValue()) {
            c5().C.setVisibility(8);
            return;
        }
        c5().C.setVisibility(0);
        c5().C.a(intValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y5(boolean r6) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.n1.Y5(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        UnityManager.Companion.getInstance().initCloset(true);
    }

    public final void Z5() {
        if (l5()) {
            c5().f52583p1.setVisibility(8);
            c5().f52585q1.setVisibility(8);
            c5().f52587r1.setVisibility(8);
            c5().f52589s1.setVisibility(8);
            c5().O0.setVisibility(8);
            c5().L0.setVisibility(8);
        }
    }

    public final void a5() {
        k5().g().i(this, new androidx.lifecycle.f0() { // from class: r9.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                n1.b5(n1.this, (EventNoticeResponse) obj);
            }
        });
    }

    public final s9.y c5() {
        s9.y yVar = this.Q0;
        jo.p.e(yVar);
        return yVar;
    }

    public final od.e d5() {
        return (od.e) this.U0.getValue();
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
        this.Q0 = s9.y.T(view);
        this.f50264c1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: r9.j1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                n1.B5(n1.this);
            }
        };
        c5().u().getViewTreeObserver().addOnGlobalLayoutListener(this.f50264c1);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(c5().K);
        cVar.l(c5().M.getId(), ((int) g5()) - ((int) i5()));
        cVar.c(c5().K);
        P5();
        G5();
        S5();
        L5();
        R5();
        Q5();
        T5();
        K5();
        I5();
        H5();
        M5();
        B4();
        a5();
        Z5();
    }

    public final nf.f e5() {
        return (nf.f) this.T0.getValue();
    }

    public final float f5() {
        return ((Number) this.f50275n1.getValue()).floatValue();
    }

    public final float g5() {
        return ((Number) this.f50272k1.getValue()).floatValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final float h5() {
        return ((Number) this.f50271j1.getValue()).floatValue();
    }

    public final float i5() {
        return ((Number) this.f50274m1.getValue()).floatValue();
    }

    public final float j5() {
        return ((Number) this.f50273l1.getValue()).floatValue();
    }

    public final je.e k5() {
        return (je.e) this.V0.getValue();
    }

    public final boolean l5() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    public final int m5() {
        return ((Number) this.f50270i1.getValue()).intValue();
    }

    public final MRLogger n5() {
        return (MRLogger) this.W0.getValue();
    }

    public final float o5() {
        return ((Number) this.f50269h1.getValue()).floatValue();
    }

    public final String p5() {
        return (String) this.O0.getValue();
    }

    public final ef.a q5() {
        return (ef.a) this.X0.getValue();
    }

    @Override // androidx.fragment.app.e
    @SuppressLint({"ClickableViewAccessibility"})
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: r9.g1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean x52;
                x52 = n1.x5(n1.this, dialogInterface, i10, keyEvent);
                return x52;
            }
        });
        return dialog;
    }

    public final MRUnityPlayer r5() {
        return (MRUnityPlayer) this.Y0.getValue();
    }

    public final hf.v0 s5() {
        return (hf.v0) this.Z0.getValue();
    }

    public final void t5() {
        jf.k0 k0Var;
        for (jf.d dVar : e5().s0().getValue()) {
            d5().g(dVar.a(), dVar.b(), dVar.c());
        }
        od.e d52 = d5();
        int i10 = b.f50279a[e5().x0().ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
            k0Var = e5().x0();
        } else {
            k0Var = jf.k0.PERSONA;
        }
        d52.B(k0Var);
        c5().G.setVisibility(8);
        Integer f10 = this.f50267f1.f();
        int j52 = (int) j5();
        if (f10 != null && f10.intValue() == j52) {
            E5(0);
        } else {
            this.f50267f1.p(0);
        }
    }

    public final boolean u5() {
        Integer f10 = this.f50267f1.f();
        if (f10 == null) {
            f10 = 0;
        }
        return f10.intValue() > 0;
    }

    public final void v5() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g5() - c5().L.getTranslationY(), g5());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r9.g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n1.w5(n1.this, valueAnimator);
            }
        });
        ofFloat.addListener(new d0());
        ofFloat.start();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.R0 = context instanceof vb.p ? (vb.p) context : null;
        this.S0 = context instanceof je.a ? (je.a) context : null;
    }

    public final void y5(float f10, io.a<wn.v> aVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g5() - c5().L.getTranslationY(), f10);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r9.c1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n1.A5(n1.this, valueAnimator);
            }
        });
        ofFloat.addListener(new f0(aVar));
        ofFloat.start();
    }
}
