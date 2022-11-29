package com.dena.mirrorman.customview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.dena.mirrorman.customview.GaugeView;
import de.n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.b0;
import jo.h;
import jo.p;
import nd.h1;
import nd.w0;
import po.i;
import sf.i;
import wn.v;
import xn.a0;
import xn.i0;
import xn.r;
import xn.t;

/* loaded from: classes2.dex */
public final class GaugeView extends View {
    public static final a J = new a(null);
    public static final int K = 8;
    public int A;
    public int[] B;
    public boolean C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public PaintDrawable G;
    public ValueAnimator H;
    public io.a<v> I;

    /* renamed from: w  reason: collision with root package name */
    public float f25353w;

    /* renamed from: x  reason: collision with root package name */
    public float f25354x;

    /* renamed from: y  reason: collision with root package name */
    public float f25355y;

    /* renamed from: z  reason: collision with root package name */
    public float f25356z;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.dena.mirrorman.customview.GaugeView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0220a extends ShapeDrawable.ShaderFactory {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f25357a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ GaugeView f25358b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ int[] f25359c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ float[] f25360d;

            public C0220a(boolean z10, GaugeView gaugeView, int[] iArr, float[] fArr) {
                this.f25357a = z10;
                this.f25358b = gaugeView;
                this.f25359c = iArr;
                this.f25360d = fArr;
            }

            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            /* renamed from: a */
            public LinearGradient resize(int i10, int i11) {
                if (!this.f25357a) {
                    i10 = this.f25358b.getWidth();
                }
                return new LinearGradient(0.0f, 0.0f, i10, i11, this.f25359c, this.f25360d, Shader.TileMode.REPEAT);
            }
        }

        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, GaugeView gaugeView, int[] iArr, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            aVar.a(gaugeView, iArr, z10);
        }

        public final void a(GaugeView gaugeView, int[] iArr, boolean z10) {
            int length;
            float[] fArr;
            p.h(gaugeView, "<this>");
            if (iArr == null) {
                return;
            }
            gaugeView.B = iArr;
            gaugeView.C = z10;
            if (gaugeView.getWidth() == 0 || gaugeView.getHeight() == 0 || (length = iArr.length) == 0 || length == 1) {
                return;
            }
            if (length != 2) {
                List d10 = r.d(Float.valueOf(0.0f));
                i iVar = new i(1, iArr.length - 2);
                ArrayList arrayList = new ArrayList(t.u(iVar, 10));
                Iterator<Integer> it = iVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf((1.0f / (iArr.length - 1)) * ((i0) it).b()));
                }
                fArr = a0.z0(a0.o0(a0.o0(d10, arrayList), r.d(Float.valueOf(1.0f))));
            } else {
                fArr = new float[]{0.0f, 1.0f};
            }
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setCornerRadius(gaugeView.getHeight());
            paintDrawable.setShaderFactory(new C0220a(z10, gaugeView, iArr, fArr));
            gaugeView.G = paintDrawable;
            gaugeView.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements sf.i {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f25362b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f25363c;

        public b(float f10, boolean z10) {
            this.f25362b = f10;
            this.f25363c = z10;
        }

        public final void a() {
            GaugeView gaugeView = GaugeView.this;
            gaugeView.f25356z = gaugeView.g(this.f25362b, this.f25363c);
            GaugeView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GaugeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25353w = getResources().getDisplayMetrics().density * 1.0f;
        this.f25354x = getResources().getDisplayMetrics().density * 1.0f;
        this.B = new int[0];
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        this.D = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(this.f25353w);
        paint2.setAntiAlias(true);
        this.E = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(this.f25354x);
        paint3.setAntiAlias(true);
        this.F = paint3;
        setup(attributeSet);
    }

    public static final void h(GaugeView gaugeView, int[] iArr, boolean z10) {
        J.a(gaugeView, iArr, z10);
    }

    public static /* synthetic */ void j(GaugeView gaugeView, float f10, boolean z10, boolean z11, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 8) != 0) {
            j10 = 200;
        }
        gaugeView.i(f10, z12, z13, j10);
    }

    public static final void k(GaugeView gaugeView, b0 b0Var, boolean z10, ValueAnimator valueAnimator) {
        p.h(gaugeView, "this$0");
        p.h(b0Var, "$currentValue");
        float f10 = gaugeView.f25356z;
        Object animatedValue = valueAnimator.getAnimatedValue();
        p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        gaugeView.f25356z = f10 + (((Float) animatedValue).floatValue() - b0Var.f38128w);
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        p.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        b0Var.f38128w = ((Float) animatedValue2).floatValue();
        if (gaugeView.f25356z >= 1.0f) {
            io.a<v> aVar = gaugeView.I;
            if (aVar != null) {
                aVar.invoke();
            }
            if (!z10) {
                gaugeView.f25356z -= 1.0f;
            }
        }
        gaugeView.invalidate();
    }

    private final void setGaugeBackgroundColor(int i10) {
        this.D.setColor(c3.a.d(getContext(), i10));
        this.E.setColor(c3.a.d(getContext(), i10));
        invalidate();
    }

    private final void setOuterBorderColor(int i10) {
        this.F.setColor(c3.a.d(getContext(), i10));
        invalidate();
    }

    public final float g(float f10, boolean z10) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f10));
        BigDecimal valueOf = BigDecimal.valueOf(bigDecimal.intValue());
        p.g(valueOf, "valueOf(this.toLong())");
        BigDecimal subtract = bigDecimal.subtract(valueOf);
        p.g(subtract, "this.subtract(other)");
        if (f10 < 1.0f || !z10) {
            return subtract.floatValue();
        }
        return 1.0f;
    }

    public final io.a<v> getOnCompleteProgress() {
        return this.I;
    }

    public final void i(float f10, final boolean z10, boolean z11, long j10) {
        if (!z11) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f25355y = f10;
            this.f25356z = g(f10, z10);
            invalidate();
            return;
        }
        ValueAnimator valueAnimator2 = this.H;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f10 - this.f25355y);
        this.f25355y = f10;
        final b0 b0Var = new b0();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yd.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                GaugeView.k(GaugeView.this, b0Var, z10, valueAnimator3);
            }
        });
        ofFloat.addListener(new b(f10, z10));
        ofFloat.setDuration(j10);
        ofFloat.setInterpolator(new AccelerateInterpolator(0.5f));
        ofFloat.start();
        this.H = ofFloat;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        p.h(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.G == null) {
            int[] iArr = this.B;
            if (!(iArr.length == 0)) {
                J.a(this, iArr, this.C);
            } else {
                int i10 = this.A;
                if (i10 == 0) {
                    return;
                }
                setGaugeColor(i10);
            }
        }
        float f10 = this.f25354x;
        float f11 = this.f25353w;
        float f12 = 2;
        canvas.drawRoundRect(f10 + (f11 * 0.5f), f10 + (f11 * 0.5f), getWidth() - ((this.f25353w * 0.5f) + this.f25354x), getHeight() - ((this.f25353w * 0.5f) + this.f25354x), (getHeight() - (this.f25354x * f12)) / 2.0f, (getHeight() - (this.f25354x * f12)) / 2.0f, this.D);
        PaintDrawable paintDrawable = this.G;
        if (paintDrawable != null) {
            float f13 = this.f25354x;
            float f14 = this.f25353w;
            paintDrawable.setBounds((int) ((f14 * 0.5f) + f13), (int) (f13 + (f14 * 0.5f)), (int) ((getWidth() - ((this.f25353w * 0.5f) + this.f25354x)) * this.f25356z), (int) (getHeight() - ((this.f25353w * 0.5f) + this.f25354x)));
        }
        PaintDrawable paintDrawable2 = this.G;
        if (paintDrawable2 != null) {
            paintDrawable2.draw(canvas);
        }
        float f15 = this.f25353w;
        float f16 = this.f25354x;
        canvas.drawRoundRect((f15 * 0.5f) + f16, (f15 * 0.5f) + f16, getWidth() - ((this.f25353w * 0.5f) + this.f25354x), getHeight() - ((this.f25353w * 0.5f) + this.f25354x), (getHeight() - this.f25354x) / 2.0f, (getHeight() - this.f25354x) / 2.0f, this.E);
        float f17 = this.f25354x;
        canvas.drawRoundRect(f17 * 0.5f, f17 * 0.5f, getWidth() - (this.f25354x * 0.5f), getHeight() - (this.f25354x * 0.5f), (getHeight() - this.f25354x) / 2.0f, (getHeight() - this.f25354x) / 2.0f, this.F);
    }

    public final void setGaugeColor(int i10) {
        this.A = i10;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        PaintDrawable paintDrawable = new PaintDrawable(i10);
        paintDrawable.setCornerRadius(getHeight());
        this.G = paintDrawable;
        invalidate();
    }

    public final void setGaugeViewProgress(float f10) {
        j(this, f10, false, false, 0L, 10, null);
    }

    public final void setOnCompleteProgress(io.a<v> aVar) {
        this.I = aVar;
    }

    public final void setup(AttributeSet attributeSet) {
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h1.U0, 0, 0);
            setGaugeColor(c3.a.d(getContext(), obtainStyledAttributes.getResourceId(h1.W0, w0.f42242u0)));
            setGaugeBackgroundColor(obtainStyledAttributes.getResourceId(h1.V0, 17170444));
            setOuterBorderColor(obtainStyledAttributes.getResourceId(h1.Y0, 17170443));
            float dimension = obtainStyledAttributes.getDimension(h1.Z0, n.b(this, 1));
            this.f25354x = dimension;
            this.F.setStrokeWidth(dimension);
            float dimension2 = obtainStyledAttributes.getDimension(h1.X0, this.f25353w);
            this.f25353w = dimension2;
            this.E.setStrokeWidth(dimension2);
            j(this, obtainStyledAttributes.getFloat(h1.f42016a1, 0.0f), false, false, 0L, 10, null);
            obtainStyledAttributes.recycle();
        }
    }
}
