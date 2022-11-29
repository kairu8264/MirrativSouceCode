package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import o3.c0;
import wi.k;
import wi.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {
    public boolean A;
    public int B;
    public final List<d> C;
    public final int D;
    public final float E;
    public final Paint F;
    public final RectF G;
    public final int H;
    public float I;
    public boolean J;
    public c K;
    public double L;
    public int M;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f27867w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f27868x;

    /* renamed from: y  reason: collision with root package name */
    public float f27869y;

    /* renamed from: z  reason: collision with root package name */
    public float f27870z;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(float f10, boolean z10);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58789z);
    }

    public void b(d dVar) {
        this.C.add(dVar);
    }

    public final void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f10 = height;
        this.F.setStrokeWidth(0.0f);
        canvas.drawCircle((this.M * ((float) Math.cos(this.L))) + width2, (this.M * ((float) Math.sin(this.L))) + f10, this.D, this.F);
        double sin = Math.sin(this.L);
        double cos = Math.cos(this.L);
        this.F.setStrokeWidth(this.H);
        canvas.drawLine(width2, f10, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.F);
        canvas.drawCircle(width2, f10, this.E, this.F);
    }

    public RectF d() {
        return this.G;
    }

    public final int e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public float f() {
        return this.I;
    }

    public int g() {
        return this.D;
    }

    public final Pair<Float, Float> h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f11), Float.valueOf(f10));
    }

    public final boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float e10 = e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != e10;
        if (z11 && z14) {
            return true;
        }
        if (z14 || z10) {
            if (z12 && this.f27868x) {
                z13 = true;
            }
            l(e10, z13);
            return true;
        }
        return false;
    }

    public void j(int i10) {
        this.M = i10;
        invalidate();
    }

    public void k(float f10) {
        l(f10, false);
    }

    public void l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f27867w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f10, false);
            return;
        }
        Pair<Float, Float> h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h10.first).floatValue(), ((Float) h10.second).floatValue());
        this.f27867w = ofFloat;
        ofFloat.setDuration(200L);
        this.f27867w.addUpdateListener(new a());
        this.f27867w.addListener(new b());
        this.f27867w.start();
    }

    public final void m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.I = f11;
        this.L = Math.toRadians(f11 - 90.0f);
        float width = (getWidth() / 2) + (this.M * ((float) Math.cos(this.L)));
        float height = (getHeight() / 2) + (this.M * ((float) Math.sin(this.L)));
        RectF rectF = this.G;
        int i10 = this.D;
        rectF.set(width - i10, height - i10, width + i10, height + i10);
        for (d dVar : this.C) {
            dVar.a(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f27869y = x10;
            this.f27870z = y10;
            this.A = true;
            this.J = false;
            z10 = false;
            z11 = false;
            z12 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f27869y);
            int i11 = (int) (y10 - this.f27870z);
            this.A = (i10 * i10) + (i11 * i11) > this.B;
            boolean z13 = this.J;
            z10 = actionMasked == 1;
            z12 = false;
            z11 = z13;
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
        }
        boolean i12 = i(x10, y10, z11, z12, z10) | this.J;
        this.J = i12;
        if (i12 && z10 && (cVar = this.K) != null) {
            cVar.a(e(x10, y10), this.A);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = new ArrayList();
        Paint paint = new Paint();
        this.F = paint;
        this.G = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f59022k1, i10, k.f58929z);
        this.M = obtainStyledAttributes.getDimensionPixelSize(l.f59040m1, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(l.f59049n1, 0);
        Resources resources = getResources();
        this.H = resources.getDimensionPixelSize(wi.d.f58814m);
        this.E = resources.getDimensionPixelSize(wi.d.f58812k);
        int color = obtainStyledAttributes.getColor(l.f59031l1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.B = ViewConfiguration.get(context).getScaledTouchSlop();
        c0.C0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
