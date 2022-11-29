package k0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import c1.z0;
import wn.v;

/* loaded from: classes.dex */
public final class l extends View {
    public static final a B = new a(null);
    public static final int[] C = {16842919, 16842910};
    public static final int[] D = new int[0];
    public io.a<v> A;

    /* renamed from: w  reason: collision with root package name */
    public r f38334w;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f38335x;

    /* renamed from: y  reason: collision with root package name */
    public Long f38336y;

    /* renamed from: z  reason: collision with root package name */
    public Runnable f38337z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        jo.p.h(context, "context");
    }

    private final void setRippleState(boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f38337z;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f38336y;
        long longValue = currentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (!z10 && longValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: k0.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.m31setRippleState$lambda2(l.this);
                }
            };
            this.f38337z = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            int[] iArr = z10 ? C : D;
            r rVar = this.f38334w;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        }
        this.f38336y = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m31setRippleState$lambda2(l lVar) {
        jo.p.h(lVar, "this$0");
        r rVar = lVar.f38334w;
        if (rVar != null) {
            rVar.setState(D);
        }
        lVar.f38337z = null;
    }

    public final void b(x.p pVar, boolean z10, long j10, int i10, long j11, float f10, io.a<v> aVar) {
        jo.p.h(pVar, "interaction");
        jo.p.h(aVar, "onInvalidateRipple");
        if (this.f38334w == null || !jo.p.c(Boolean.valueOf(z10), this.f38335x)) {
            c(z10);
            this.f38335x = Boolean.valueOf(z10);
        }
        r rVar = this.f38334w;
        jo.p.e(rVar);
        this.A = aVar;
        f(j10, i10, j11, f10);
        if (z10) {
            rVar.setHotspot(b1.f.m(pVar.a()), b1.f.n(pVar.a()));
        } else {
            rVar.setHotspot(rVar.getBounds().centerX(), rVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c(boolean z10) {
        r rVar = new r(z10);
        setBackground(rVar);
        this.f38334w = rVar;
    }

    public final void d() {
        this.A = null;
        Runnable runnable = this.f38337z;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f38337z;
            jo.p.e(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f38334w;
            if (rVar != null) {
                rVar.setState(D);
            }
        }
        r rVar2 = this.f38334w;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, int i10, long j11, float f10) {
        r rVar = this.f38334w;
        if (rVar == null) {
            return;
        }
        rVar.c(i10);
        rVar.b(j11, f10);
        Rect a10 = z0.a(b1.m.c(j10));
        setLeft(a10.left);
        setTop(a10.top);
        setRight(a10.right);
        setBottom(a10.bottom);
        rVar.setBounds(a10);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        jo.p.h(drawable, "who");
        io.a<v> aVar = this.A;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
