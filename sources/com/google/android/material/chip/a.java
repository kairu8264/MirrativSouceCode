package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import nj.h;
import nj.j;
import nj.l;
import qj.c;
import qj.d;
import rj.b;
import tj.g;

/* loaded from: classes3.dex */
public class a extends g implements Drawable.Callback, h.b {

    /* renamed from: e1  reason: collision with root package name */
    public static final int[] f27477e1 = {16842910};

    /* renamed from: f1  reason: collision with root package name */
    public static final ShapeDrawable f27478f1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public final Context B0;
    public final Paint C0;
    public final Paint D0;
    public final Paint.FontMetrics E0;
    public final RectF F0;
    public final PointF G0;
    public final Path H0;
    public final h I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public ColorFilter S0;
    public PorterDuffColorFilter T0;
    public ColorStateList U;
    public ColorStateList U0;
    public ColorStateList V;
    public PorterDuff.Mode V0;
    public float W;
    public int[] W0;
    public float X;
    public boolean X0;
    public ColorStateList Y;
    public ColorStateList Y0;
    public float Z;
    public WeakReference<InterfaceC0242a> Z0;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f27479a0;

    /* renamed from: a1  reason: collision with root package name */
    public TextUtils.TruncateAt f27480a1;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f27481b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f27482b1;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f27483c0;

    /* renamed from: c1  reason: collision with root package name */
    public int f27484c1;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f27485d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f27486d1;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f27487e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f27488f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f27489g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f27490h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f27491i0;

    /* renamed from: j0  reason: collision with root package name */
    public Drawable f27492j0;

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f27493k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f27494l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f27495m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f27496n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f27497o0;

    /* renamed from: p0  reason: collision with root package name */
    public Drawable f27498p0;

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f27499q0;

    /* renamed from: r0  reason: collision with root package name */
    public xi.h f27500r0;

    /* renamed from: s0  reason: collision with root package name */
    public xi.h f27501s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f27502t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f27503u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f27504v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f27505w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f27506x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f27507y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f27508z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0242a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.X = -1.0f;
        this.C0 = new Paint(1);
        this.E0 = new Paint.FontMetrics();
        this.F0 = new RectF();
        this.G0 = new PointF();
        this.H0 = new Path();
        this.R0 = 255;
        this.V0 = PorterDuff.Mode.SRC_IN;
        this.Z0 = new WeakReference<>(null);
        N(context);
        this.B0 = context;
        h hVar = new h(this);
        this.I0 = hVar;
        this.f27481b0 = "";
        hVar.e().density = context.getResources().getDisplayMetrics().density;
        this.D0 = null;
        int[] iArr = f27477e1;
        setState(iArr);
        n2(iArr);
        this.f27482b1 = true;
        if (b.f51549a) {
            f27478f1.setTint(-1);
        }
    }

    public static boolean p1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean t1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean v1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f49535a) == null || !colorStateList.isStateful()) ? false : true;
    }

    public static a x0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.w1(attributeSet, i10, i11);
        return aVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        if (P2()) {
            n0(rect, this.F0);
            RectF rectF = this.F0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f27485d0.setBounds(0, 0, (int) this.F0.width(), (int) this.F0.height());
            this.f27485d0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void A1(int i10) {
        z1(this.B0.getResources().getBoolean(i10));
    }

    public void A2(ColorStateList colorStateList) {
        if (this.f27479a0 != colorStateList) {
            this.f27479a0 = colorStateList;
            S2();
            onStateChange(getState());
        }
    }

    public final void B0(Canvas canvas, Rect rect) {
        if (this.Z <= 0.0f || this.f27486d1) {
            return;
        }
        this.C0.setColor(this.M0);
        this.C0.setStyle(Paint.Style.STROKE);
        if (!this.f27486d1) {
            this.C0.setColorFilter(n1());
        }
        RectF rectF = this.F0;
        float f10 = this.Z;
        rectF.set(rect.left + (f10 / 2.0f), rect.top + (f10 / 2.0f), rect.right - (f10 / 2.0f), rect.bottom - (f10 / 2.0f));
        float f11 = this.X - (this.Z / 2.0f);
        canvas.drawRoundRect(this.F0, f11, f11, this.C0);
    }

    public void B1(Drawable drawable) {
        if (this.f27498p0 != drawable) {
            float o02 = o0();
            this.f27498p0 = drawable;
            float o03 = o0();
            R2(this.f27498p0);
            m0(this.f27498p0);
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void B2(int i10) {
        A2(f.a.a(this.B0, i10));
    }

    public final void C0(Canvas canvas, Rect rect) {
        if (this.f27486d1) {
            return;
        }
        this.C0.setColor(this.J0);
        this.C0.setStyle(Paint.Style.FILL);
        this.F0.set(rect);
        canvas.drawRoundRect(this.F0, K0(), K0(), this.C0);
    }

    public void C1(int i10) {
        B1(f.a.b(this.B0, i10));
    }

    public void C2(boolean z10) {
        this.f27482b1 = z10;
    }

    public final void D0(Canvas canvas, Rect rect) {
        if (Q2()) {
            q0(rect, this.F0);
            RectF rectF = this.F0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f27491i0.setBounds(0, 0, (int) this.F0.width(), (int) this.F0.height());
            if (b.f51549a) {
                this.f27492j0.setBounds(this.f27491i0.getBounds());
                this.f27492j0.jumpToCurrentState();
                this.f27492j0.draw(canvas);
            } else {
                this.f27491i0.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    public void D1(ColorStateList colorStateList) {
        if (this.f27499q0 != colorStateList) {
            this.f27499q0 = colorStateList;
            if (w0()) {
                g3.a.o(this.f27498p0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void D2(xi.h hVar) {
        this.f27500r0 = hVar;
    }

    public final void E0(Canvas canvas, Rect rect) {
        this.C0.setColor(this.N0);
        this.C0.setStyle(Paint.Style.FILL);
        this.F0.set(rect);
        if (!this.f27486d1) {
            canvas.drawRoundRect(this.F0, K0(), K0(), this.C0);
            return;
        }
        h(new RectF(rect), this.H0);
        super.p(canvas, this.C0, this.H0, u());
    }

    public void E1(int i10) {
        D1(f.a.a(this.B0, i10));
    }

    public void E2(int i10) {
        D2(xi.h.c(this.B0, i10));
    }

    public final void F0(Canvas canvas, Rect rect) {
        Paint paint = this.D0;
        if (paint != null) {
            paint.setColor(f3.a.k(-16777216, 127));
            canvas.drawRect(rect, this.D0);
            if (P2() || O2()) {
                n0(rect, this.F0);
                canvas.drawRect(this.F0, this.D0);
            }
            if (this.f27481b0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.D0);
            }
            if (Q2()) {
                q0(rect, this.F0);
                canvas.drawRect(this.F0, this.D0);
            }
            this.D0.setColor(f3.a.k(-65536, 127));
            p0(rect, this.F0);
            canvas.drawRect(this.F0, this.D0);
            this.D0.setColor(f3.a.k(-16711936, 127));
            r0(rect, this.F0);
            canvas.drawRect(this.F0, this.D0);
        }
    }

    public void F1(int i10) {
        G1(this.B0.getResources().getBoolean(i10));
    }

    public void F2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f27481b0, charSequence)) {
            return;
        }
        this.f27481b0 = charSequence;
        this.I0.i(true);
        invalidateSelf();
        x1();
    }

    public final void G0(Canvas canvas, Rect rect) {
        if (this.f27481b0 != null) {
            Paint.Align v02 = v0(rect, this.G0);
            t0(rect, this.F0);
            if (this.I0.d() != null) {
                this.I0.e().drawableState = getState();
                this.I0.j(this.B0);
            }
            this.I0.e().setTextAlign(v02);
            int i10 = 0;
            boolean z10 = Math.round(this.I0.f(j1().toString())) > Math.round(this.F0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.F0);
            }
            CharSequence charSequence = this.f27481b0;
            if (z10 && this.f27480a1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.I0.e(), this.F0.width(), this.f27480a1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.G0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.I0.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public void G1(boolean z10) {
        if (this.f27497o0 != z10) {
            boolean O2 = O2();
            this.f27497o0 = z10;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    m0(this.f27498p0);
                } else {
                    R2(this.f27498p0);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public void G2(d dVar) {
        this.I0.h(dVar, this.B0);
    }

    public Drawable H0() {
        return this.f27498p0;
    }

    public void H1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            onStateChange(getState());
        }
    }

    public void H2(int i10) {
        G2(new d(this.B0, i10));
    }

    public ColorStateList I0() {
        return this.f27499q0;
    }

    public void I1(int i10) {
        H1(f.a.a(this.B0, i10));
    }

    public void I2(float f10) {
        if (this.f27506x0 != f10) {
            this.f27506x0 = f10;
            invalidateSelf();
            x1();
        }
    }

    public ColorStateList J0() {
        return this.V;
    }

    @Deprecated
    public void J1(float f10) {
        if (this.X != f10) {
            this.X = f10;
            setShapeAppearanceModel(D().w(f10));
        }
    }

    public void J2(int i10) {
        I2(this.B0.getResources().getDimension(i10));
    }

    public float K0() {
        return this.f27486d1 ? G() : this.X;
    }

    @Deprecated
    public void K1(int i10) {
        J1(this.B0.getResources().getDimension(i10));
    }

    public void K2(float f10) {
        if (this.f27505w0 != f10) {
            this.f27505w0 = f10;
            invalidateSelf();
            x1();
        }
    }

    public float L0() {
        return this.A0;
    }

    public void L1(float f10) {
        if (this.A0 != f10) {
            this.A0 = f10;
            invalidateSelf();
            x1();
        }
    }

    public void L2(int i10) {
        K2(this.B0.getResources().getDimension(i10));
    }

    public Drawable M0() {
        Drawable drawable = this.f27485d0;
        if (drawable != null) {
            return g3.a.q(drawable);
        }
        return null;
    }

    public void M1(int i10) {
        L1(this.B0.getResources().getDimension(i10));
    }

    public void M2(boolean z10) {
        if (this.X0 != z10) {
            this.X0 = z10;
            S2();
            onStateChange(getState());
        }
    }

    public float N0() {
        return this.f27488f0;
    }

    public void N1(Drawable drawable) {
        Drawable M0 = M0();
        if (M0 != drawable) {
            float o02 = o0();
            this.f27485d0 = drawable != null ? g3.a.r(drawable).mutate() : null;
            float o03 = o0();
            R2(M0);
            if (P2()) {
                m0(this.f27485d0);
            }
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public boolean N2() {
        return this.f27482b1;
    }

    public ColorStateList O0() {
        return this.f27487e0;
    }

    public void O1(int i10) {
        N1(f.a.b(this.B0, i10));
    }

    public final boolean O2() {
        return this.f27497o0 && this.f27498p0 != null && this.P0;
    }

    public float P0() {
        return this.W;
    }

    public void P1(float f10) {
        if (this.f27488f0 != f10) {
            float o02 = o0();
            this.f27488f0 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public final boolean P2() {
        return this.f27483c0 && this.f27485d0 != null;
    }

    public float Q0() {
        return this.f27502t0;
    }

    public void Q1(int i10) {
        P1(this.B0.getResources().getDimension(i10));
    }

    public final boolean Q2() {
        return this.f27490h0 && this.f27491i0 != null;
    }

    public ColorStateList R0() {
        return this.Y;
    }

    public void R1(ColorStateList colorStateList) {
        this.f27489g0 = true;
        if (this.f27487e0 != colorStateList) {
            this.f27487e0 = colorStateList;
            if (P2()) {
                g3.a.o(this.f27485d0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float S0() {
        return this.Z;
    }

    public void S1(int i10) {
        R1(f.a.a(this.B0, i10));
    }

    public final void S2() {
        this.Y0 = this.X0 ? b.d(this.f27479a0) : null;
    }

    public Drawable T0() {
        Drawable drawable = this.f27491i0;
        if (drawable != null) {
            return g3.a.q(drawable);
        }
        return null;
    }

    public void T1(int i10) {
        U1(this.B0.getResources().getBoolean(i10));
    }

    @TargetApi(21)
    public final void T2() {
        this.f27492j0 = new RippleDrawable(b.d(h1()), this.f27491i0, f27478f1);
    }

    public CharSequence U0() {
        return this.f27495m0;
    }

    public void U1(boolean z10) {
        if (this.f27483c0 != z10) {
            boolean P2 = P2();
            this.f27483c0 = z10;
            boolean P22 = P2();
            if (P2 != P22) {
                if (P22) {
                    m0(this.f27485d0);
                } else {
                    R2(this.f27485d0);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public float V0() {
        return this.f27508z0;
    }

    public void V1(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidateSelf();
            x1();
        }
    }

    public float W0() {
        return this.f27494l0;
    }

    public void W1(int i10) {
        V1(this.B0.getResources().getDimension(i10));
    }

    public float X0() {
        return this.f27507y0;
    }

    public void X1(float f10) {
        if (this.f27502t0 != f10) {
            this.f27502t0 = f10;
            invalidateSelf();
            x1();
        }
    }

    public int[] Y0() {
        return this.W0;
    }

    public void Y1(int i10) {
        X1(this.B0.getResources().getDimension(i10));
    }

    public ColorStateList Z0() {
        return this.f27493k0;
    }

    public void Z1(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (this.f27486d1) {
                h0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // nj.h.b
    public void a() {
        x1();
        invalidateSelf();
    }

    public void a1(RectF rectF) {
        r0(getBounds(), rectF);
    }

    public void a2(int i10) {
        Z1(f.a.a(this.B0, i10));
    }

    public final float b1() {
        Drawable drawable = this.P0 ? this.f27498p0 : this.f27485d0;
        float f10 = this.f27488f0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(l.b(this.B0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    public void b2(float f10) {
        if (this.Z != f10) {
            this.Z = f10;
            this.C0.setStrokeWidth(f10);
            if (this.f27486d1) {
                super.i0(f10);
            }
            invalidateSelf();
        }
    }

    public final float c1() {
        Drawable drawable = this.P0 ? this.f27498p0 : this.f27485d0;
        float f10 = this.f27488f0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void c2(int i10) {
        b2(this.B0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt d1() {
        return this.f27480a1;
    }

    public final void d2(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.R0;
        int a10 = i10 < 255 ? cj.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        C0(canvas, bounds);
        z0(canvas, bounds);
        if (this.f27486d1) {
            super.draw(canvas);
        }
        B0(canvas, bounds);
        E0(canvas, bounds);
        A0(canvas, bounds);
        y0(canvas, bounds);
        if (this.f27482b1) {
            G0(canvas, bounds);
        }
        D0(canvas, bounds);
        F0(canvas, bounds);
        if (this.R0 < 255) {
            canvas.restoreToCount(a10);
        }
    }

    public xi.h e1() {
        return this.f27501s0;
    }

    public void e2(Drawable drawable) {
        Drawable T0 = T0();
        if (T0 != drawable) {
            float s02 = s0();
            this.f27491i0 = drawable != null ? g3.a.r(drawable).mutate() : null;
            if (b.f51549a) {
                T2();
            }
            float s03 = s0();
            R2(T0);
            if (Q2()) {
                m0(this.f27491i0);
            }
            invalidateSelf();
            if (s02 != s03) {
                x1();
            }
        }
    }

    public float f1() {
        return this.f27504v0;
    }

    public void f2(CharSequence charSequence) {
        if (this.f27495m0 != charSequence) {
            this.f27495m0 = m3.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float g1() {
        return this.f27503u0;
    }

    public void g2(float f10) {
        if (this.f27508z0 != f10) {
            this.f27508z0 = f10;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.R0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.S0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.W;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f27502t0 + o0() + this.f27505w0 + this.I0.f(j1().toString()) + this.f27506x0 + s0() + this.A0), this.f27484c1);
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f27486d1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.X);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.X);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList h1() {
        return this.f27479a0;
    }

    public void h2(int i10) {
        g2(this.B0.getResources().getDimension(i10));
    }

    public xi.h i1() {
        return this.f27500r0;
    }

    public void i2(int i10) {
        e2(f.a.b(this.B0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return t1(this.U) || t1(this.V) || t1(this.Y) || (this.X0 && t1(this.Y0)) || v1(this.I0.d()) || w0() || u1(this.f27485d0) || u1(this.f27498p0) || t1(this.U0);
    }

    public CharSequence j1() {
        return this.f27481b0;
    }

    public void j2(float f10) {
        if (this.f27494l0 != f10) {
            this.f27494l0 = f10;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    public d k1() {
        return this.I0.d();
    }

    public void k2(int i10) {
        j2(this.B0.getResources().getDimension(i10));
    }

    public float l1() {
        return this.f27506x0;
    }

    public void l2(float f10) {
        if (this.f27507y0 != f10) {
            this.f27507y0 = f10;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    public final void m0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        g3.a.m(drawable, g3.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f27491i0) {
            if (drawable.isStateful()) {
                drawable.setState(Y0());
            }
            g3.a.o(drawable, this.f27493k0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f27485d0;
        if (drawable == drawable2 && this.f27489g0) {
            g3.a.o(drawable2, this.f27487e0);
        }
    }

    public float m1() {
        return this.f27505w0;
    }

    public void m2(int i10) {
        l2(this.B0.getResources().getDimension(i10));
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P2() || O2()) {
            float f10 = this.f27502t0 + this.f27503u0;
            float c12 = c1();
            if (g3.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + c12;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - c12;
            }
            float b12 = b1();
            float exactCenterY = rect.exactCenterY() - (b12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + b12;
        }
    }

    public final ColorFilter n1() {
        ColorFilter colorFilter = this.S0;
        return colorFilter != null ? colorFilter : this.T0;
    }

    public boolean n2(int[] iArr) {
        if (Arrays.equals(this.W0, iArr)) {
            return false;
        }
        this.W0 = iArr;
        if (Q2()) {
            return y1(getState(), iArr);
        }
        return false;
    }

    public float o0() {
        if (P2() || O2()) {
            return this.f27503u0 + c1() + this.f27504v0;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.X0;
    }

    public void o2(ColorStateList colorStateList) {
        if (this.f27493k0 != colorStateList) {
            this.f27493k0 = colorStateList;
            if (Q2()) {
                g3.a.o(this.f27491i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (P2()) {
            onLayoutDirectionChanged |= g3.a.m(this.f27485d0, i10);
        }
        if (O2()) {
            onLayoutDirectionChanged |= g3.a.m(this.f27498p0, i10);
        }
        if (Q2()) {
            onLayoutDirectionChanged |= g3.a.m(this.f27491i0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (P2()) {
            onLevelChange |= this.f27485d0.setLevel(i10);
        }
        if (O2()) {
            onLevelChange |= this.f27498p0.setLevel(i10);
        }
        if (Q2()) {
            onLevelChange |= this.f27491i0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // tj.g, android.graphics.drawable.Drawable, nj.h.b
    public boolean onStateChange(int[] iArr) {
        if (this.f27486d1) {
            super.onStateChange(iArr);
        }
        return y1(iArr, Y0());
    }

    public final void p0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Q2()) {
            float f10 = this.A0 + this.f27508z0 + this.f27494l0 + this.f27507y0 + this.f27506x0;
            if (g3.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void p2(int i10) {
        o2(f.a.a(this.B0, i10));
    }

    public final void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f10 = this.A0 + this.f27508z0;
            if (g3.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f27494l0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f27494l0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f27494l0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean q1() {
        return this.f27496n0;
    }

    public void q2(boolean z10) {
        if (this.f27490h0 != z10) {
            boolean Q2 = Q2();
            this.f27490h0 = z10;
            boolean Q22 = Q2();
            if (Q2 != Q22) {
                if (Q22) {
                    m0(this.f27491i0);
                } else {
                    R2(this.f27491i0);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public final void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f10 = this.A0 + this.f27508z0 + this.f27494l0 + this.f27507y0 + this.f27506x0;
            if (g3.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean r1() {
        return u1(this.f27491i0);
    }

    public void r2(InterfaceC0242a interfaceC0242a) {
        this.Z0 = new WeakReference<>(interfaceC0242a);
    }

    public float s0() {
        if (Q2()) {
            return this.f27507y0 + this.f27494l0 + this.f27508z0;
        }
        return 0.0f;
    }

    public boolean s1() {
        return this.f27490h0;
    }

    public void s2(TextUtils.TruncateAt truncateAt) {
        this.f27480a1 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.R0 != i10) {
            this.R0 = i10;
            invalidateSelf();
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.S0 != colorFilter) {
            this.S0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable, g3.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.U0 != colorStateList) {
            this.U0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // tj.g, android.graphics.drawable.Drawable, g3.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.V0 != mode) {
            this.V0 = mode;
            this.T0 = jj.a.a(this, this.U0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (P2()) {
            visible |= this.f27485d0.setVisible(z10, z11);
        }
        if (O2()) {
            visible |= this.f27498p0.setVisible(z10, z11);
        }
        if (Q2()) {
            visible |= this.f27491i0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f27481b0 != null) {
            float o02 = this.f27502t0 + o0() + this.f27505w0;
            float s02 = this.A0 + s0() + this.f27506x0;
            if (g3.a.f(this) == 0) {
                rectF.left = rect.left + o02;
                rectF.right = rect.right - s02;
            } else {
                rectF.left = rect.left + s02;
                rectF.right = rect.right - o02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void t2(xi.h hVar) {
        this.f27501s0 = hVar;
    }

    public final float u0() {
        this.I0.e().getFontMetrics(this.E0);
        Paint.FontMetrics fontMetrics = this.E0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void u2(int i10) {
        t2(xi.h.c(this.B0, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public Paint.Align v0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f27481b0 != null) {
            float o02 = this.f27502t0 + o0() + this.f27505w0;
            if (g3.a.f(this) == 0) {
                pointF.x = rect.left + o02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - o02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - u0();
        }
        return align;
    }

    public void v2(float f10) {
        if (this.f27504v0 != f10) {
            float o02 = o0();
            this.f27504v0 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public final boolean w0() {
        return this.f27497o0 && this.f27498p0 != null && this.f27496n0;
    }

    public final void w1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray h10 = j.h(this.B0, attributeSet, wi.l.f59003i0, i10, i11, new int[0]);
        this.f27486d1 = h10.hasValue(wi.l.U0);
        d2(c.a(this.B0, h10, wi.l.H0));
        H1(c.a(this.B0, h10, wi.l.f59111u0));
        V1(h10.getDimension(wi.l.C0, 0.0f));
        int i12 = wi.l.f59120v0;
        if (h10.hasValue(i12)) {
            J1(h10.getDimension(i12, 0.0f));
        }
        Z1(c.a(this.B0, h10, wi.l.F0));
        b2(h10.getDimension(wi.l.G0, 0.0f));
        A2(c.a(this.B0, h10, wi.l.T0));
        F2(h10.getText(wi.l.f59057o0));
        d f10 = c.f(this.B0, h10, wi.l.f59012j0);
        f10.f49548n = h10.getDimension(wi.l.f59021k0, f10.f49548n);
        G2(f10);
        int i13 = h10.getInt(wi.l.f59039m0, 0);
        if (i13 == 1) {
            s2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            s2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            s2(TextUtils.TruncateAt.END);
        }
        U1(h10.getBoolean(wi.l.B0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            U1(h10.getBoolean(wi.l.f59147y0, false));
        }
        N1(c.d(this.B0, h10, wi.l.f59138x0));
        int i14 = wi.l.A0;
        if (h10.hasValue(i14)) {
            R1(c.a(this.B0, h10, i14));
        }
        P1(h10.getDimension(wi.l.f59156z0, -1.0f));
        q2(h10.getBoolean(wi.l.O0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            q2(h10.getBoolean(wi.l.J0, false));
        }
        e2(c.d(this.B0, h10, wi.l.I0));
        o2(c.a(this.B0, h10, wi.l.N0));
        j2(h10.getDimension(wi.l.L0, 0.0f));
        z1(h10.getBoolean(wi.l.f59066p0, false));
        G1(h10.getBoolean(wi.l.f59102t0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            G1(h10.getBoolean(wi.l.f59084r0, false));
        }
        B1(c.d(this.B0, h10, wi.l.f59075q0));
        int i15 = wi.l.f59093s0;
        if (h10.hasValue(i15)) {
            D1(c.a(this.B0, h10, i15));
        }
        D2(xi.h.b(this.B0, h10, wi.l.V0));
        t2(xi.h.b(this.B0, h10, wi.l.Q0));
        X1(h10.getDimension(wi.l.E0, 0.0f));
        x2(h10.getDimension(wi.l.S0, 0.0f));
        v2(h10.getDimension(wi.l.R0, 0.0f));
        K2(h10.getDimension(wi.l.X0, 0.0f));
        I2(h10.getDimension(wi.l.W0, 0.0f));
        l2(h10.getDimension(wi.l.M0, 0.0f));
        g2(h10.getDimension(wi.l.K0, 0.0f));
        L1(h10.getDimension(wi.l.f59129w0, 0.0f));
        z2(h10.getDimensionPixelSize(wi.l.f59048n0, Integer.MAX_VALUE));
        h10.recycle();
    }

    public void w2(int i10) {
        v2(this.B0.getResources().getDimension(i10));
    }

    public void x1() {
        InterfaceC0242a interfaceC0242a = this.Z0.get();
        if (interfaceC0242a != null) {
            interfaceC0242a.a();
        }
    }

    public void x2(float f10) {
        if (this.f27503u0 != f10) {
            float o02 = o0();
            this.f27503u0 = f10;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (O2()) {
            n0(rect, this.F0);
            RectF rectF = this.F0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f27498p0.setBounds(0, 0, (int) this.F0.width(), (int) this.F0.height());
            this.f27498p0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean y1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.U;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.J0) : 0);
        boolean z11 = true;
        if (this.J0 != l10) {
            this.J0 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.V;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.K0) : 0);
        if (this.K0 != l11) {
            this.K0 = l11;
            onStateChange = true;
        }
        int f10 = hj.a.f(l10, l11);
        if ((this.L0 != f10) | (x() == null)) {
            this.L0 = f10;
            Y(ColorStateList.valueOf(f10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.Y;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.M0) : 0;
        if (this.M0 != colorForState) {
            this.M0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.Y0 == null || !b.e(iArr)) ? 0 : this.Y0.getColorForState(iArr, this.N0);
        if (this.N0 != colorForState2) {
            this.N0 = colorForState2;
            if (this.X0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.I0.d() == null || this.I0.d().f49535a == null) ? 0 : this.I0.d().f49535a.getColorForState(iArr, this.O0);
        if (this.O0 != colorForState3) {
            this.O0 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = p1(getState(), 16842912) && this.f27496n0;
        if (this.P0 == z12 || this.f27498p0 == null) {
            z10 = false;
        } else {
            float o02 = o0();
            this.P0 = z12;
            if (o02 != o0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.U0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.Q0) : 0;
        if (this.Q0 != colorForState4) {
            this.Q0 = colorForState4;
            this.T0 = jj.a.a(this, this.U0, this.V0);
        } else {
            z11 = onStateChange;
        }
        if (u1(this.f27485d0)) {
            z11 |= this.f27485d0.setState(iArr);
        }
        if (u1(this.f27498p0)) {
            z11 |= this.f27498p0.setState(iArr);
        }
        if (u1(this.f27491i0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.f27491i0.setState(iArr3);
        }
        if (b.f51549a && u1(this.f27492j0)) {
            z11 |= this.f27492j0.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            x1();
        }
        return z11;
    }

    public void y2(int i10) {
        x2(this.B0.getResources().getDimension(i10));
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.f27486d1) {
            return;
        }
        this.C0.setColor(this.K0);
        this.C0.setStyle(Paint.Style.FILL);
        this.C0.setColorFilter(n1());
        this.F0.set(rect);
        canvas.drawRoundRect(this.F0, K0(), K0(), this.C0);
    }

    public void z1(boolean z10) {
        if (this.f27496n0 != z10) {
            this.f27496n0 = z10;
            float o02 = o0();
            if (!z10 && this.P0) {
                this.P0 = false;
            }
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void z2(int i10) {
        this.f27484c1 = i10;
    }
}
