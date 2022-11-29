package dc;

import ac.b5;
import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import fa.b;
import java.util.List;
import kotlin.KotlinNothingValueException;
import oq.a;
import uo.q0;
import uo.r0;
import xo.i0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class e extends FrameLayout implements fa.b, oq.a, q0 {
    public static final a B = new a(null);
    public static final int C = 8;
    public final xo.s<List<GiftItem>> A;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f29382w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ da.j f29383x;

    /* renamed from: y  reason: collision with root package name */
    public final WindowManager f29384y;

    /* renamed from: z  reason: collision with root package name */
    public final b5 f29385z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.FloatingGiftView$onAttachedToWindow$1", f = "FloatingGiftView.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f29386w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<List<? extends GiftItem>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f29388w;

            public a(e eVar) {
                this.f29388w = eVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(List<GiftItem> list, ao.d<? super wn.v> dVar) {
                this.f29388w.setVisibility(list.isEmpty() ? 8 : 0);
                return wn.v.f59242a;
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f29386w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.s sVar = e.this.A;
                a aVar = new a(e.this);
                this.f29386w = 1;
                if (sVar.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.floating.FloatingGiftView", f = "FloatingGiftView.kt", l = {79}, m = "startGiftEffect")
    /* loaded from: classes2.dex */
    public static final class c extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f29389w;

        /* renamed from: x  reason: collision with root package name */
        public Object f29390x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f29391y;

        public c(ao.d<? super c> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f29391y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.c(null, null, null, null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, boolean z10) {
        super(context);
        jo.p.h(context, "context");
        this.f29382w = z10;
        this.f29383x = new da.j();
        Object systemService = context.getSystemService("window");
        jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f29384y = (WindowManager) systemService;
        this.f29385z = (b5) androidx.databinding.f.e(LayoutInflater.from(context), xb.p.view_floating_gift, this, true);
        this.A = i0.a(xn.s.k());
    }

    public final void b() {
        this.f29385z.B.F();
        this.A.setValue(xn.s.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.dena.mirrorman.net.bcsvr.response.GiftItem r15, android.graphics.Bitmap r16, android.graphics.Bitmap r17, java.lang.String r18, boolean r19, ao.d<? super wn.v> r20) {
        /*
            r14 = this;
            r0 = r14
            r1 = r20
            boolean r2 = r1 instanceof dc.e.c
            if (r2 == 0) goto L16
            r2 = r1
            dc.e$c r2 = (dc.e.c) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.A = r3
            goto L1b
        L16:
            dc.e$c r2 = new dc.e$c
            r2.<init>(r1)
        L1b:
            r10 = r2
            java.lang.Object r1 = r10.f29391y
            java.lang.Object r2 = bo.c.c()
            int r3 = r10.A
            r13 = 1
            if (r3 == 0) goto L3e
            if (r3 != r13) goto L36
            java.lang.Object r2 = r10.f29390x
            com.dena.mirrorman.net.bcsvr.response.GiftItem r2 = (com.dena.mirrorman.net.bcsvr.response.GiftItem) r2
            java.lang.Object r3 = r10.f29389w
            dc.e r3 = (dc.e) r3
            wn.m.b(r1)
            r1 = r2
            goto L7c
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            wn.m.b(r1)
            r14.d()
            xo.s<java.util.List<com.dena.mirrorman.net.bcsvr.response.GiftItem>> r1 = r0.A
            java.lang.Object r3 = r1.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r4 = xn.r.d(r15)
            java.util.List r3 = xn.a0.o0(r3, r4)
            r1.setValue(r3)
            ac.b5 r1 = r0.f29385z
            com.dena.mirrorman.feature.comment.GiftEffectView r3 = r1.B
            java.lang.String r1 = "binding.giftEffectView"
            jo.p.g(r3, r1)
            r9 = 0
            r11 = 32
            r12 = 0
            r10.f29389w = r0
            r1 = r15
            r10.f29390x = r1
            r10.A = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            java.lang.Object r3 = com.dena.mirrorman.feature.comment.GiftEffectView.M(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L7b
            return r2
        L7b:
            r3 = r0
        L7c:
            xo.s<java.util.List<com.dena.mirrorman.net.bcsvr.response.GiftItem>> r2 = r3.A
            java.lang.Object r3 = r2.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L8d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La5
            java.lang.Object r5 = r3.next()
            r6 = r5
            com.dena.mirrorman.net.bcsvr.response.GiftItem r6 = (com.dena.mirrorman.net.bcsvr.response.GiftItem) r6
            boolean r6 = jo.p.c(r6, r1)
            r6 = r6 ^ r13
            if (r6 == 0) goto L8d
            r4.add(r5)
            goto L8d
        La5:
            r2.setValue(r4)
            wn.v r1 = wn.v.f59242a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.e.c(com.dena.mirrorman.net.bcsvr.response.GiftItem, android.graphics.Bitmap, android.graphics.Bitmap, java.lang.String, boolean, ao.d):java.lang.Object");
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = getContext().getSystemService("input");
            InputManager inputManager = systemService instanceof InputManager ? (InputManager) systemService : null;
            if (inputManager != null) {
                WindowManager windowManager = this.f29384y;
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                jo.p.f(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                layoutParams2.alpha = inputManager.getMaximumObscuringOpacityForTouch();
                wn.v vVar = wn.v.f59242a;
                windowManager.updateViewLayout(this, layoutParams2);
            }
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f29383x.getCoroutineContext();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return 24;
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatGiftView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }
}
