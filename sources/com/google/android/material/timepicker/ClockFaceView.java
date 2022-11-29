package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import o3.c0;
import p3.c;
import wi.d;
import wi.f;
import wi.h;
import wi.k;
import wi.l;

/* loaded from: classes3.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {

    /* renamed from: a0  reason: collision with root package name */
    public final ClockHandView f27851a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Rect f27852b0;

    /* renamed from: c0  reason: collision with root package name */
    public final RectF f27853c0;

    /* renamed from: d0  reason: collision with root package name */
    public final SparseArray<TextView> f27854d0;

    /* renamed from: e0  reason: collision with root package name */
    public final o3.a f27855e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f27856f0;

    /* renamed from: g0  reason: collision with root package name */
    public final float[] f27857g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f27858h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f27859i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f27860j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f27861k0;

    /* renamed from: l0  reason: collision with root package name */
    public String[] f27862l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f27863m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ColorStateList f27864n0;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.y(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f27851a0.g()) - ClockFaceView.this.f27858h0);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends o3.a {
        public b() {
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            super.g(view, cVar);
            int intValue = ((Integer) view.getTag(f.f58850p)).intValue();
            if (intValue > 0) {
                cVar.I0((View) ClockFaceView.this.f27854d0.get(intValue - 1));
            }
            cVar.e0(c.C0699c.a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58789z);
    }

    public static float H(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    public final void F() {
        RectF d10 = this.f27851a0.d();
        for (int i10 = 0; i10 < this.f27854d0.size(); i10++) {
            TextView textView = this.f27854d0.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f27852b0);
                this.f27852b0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f27852b0);
                this.f27853c0.set(this.f27852b0);
                textView.getPaint().setShader(G(d10, this.f27853c0));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient G(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f27853c0.left, rectF.centerY() - this.f27853c0.top, rectF.width() * 0.5f, this.f27856f0, this.f27857g0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void I(String[] strArr, int i10) {
        this.f27862l0 = strArr;
        J(i10);
    }

    public final void J(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f27854d0.size();
        for (int i11 = 0; i11 < Math.max(this.f27862l0.length, size); i11++) {
            TextView textView = this.f27854d0.get(i11);
            if (i11 >= this.f27862l0.length) {
                removeView(textView);
                this.f27854d0.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f58869g, (ViewGroup) this, false);
                    this.f27854d0.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f27862l0[i11]);
                textView.setTag(f.f58850p, Integer.valueOf(i11));
                c0.r0(textView, this.f27855e0);
                textView.setTextColor(this.f27864n0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f27862l0[i11]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f27863m0 - f10) > 0.001f) {
            this.f27863m0 = f10;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p3.c.M0(accessibilityNodeInfo).d0(c.b.a(1, this.f27862l0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int H = (int) (this.f27861k0 / H(this.f27859i0 / displayMetrics.heightPixels, this.f27860j0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(H, 1073741824);
        setMeasuredDimension(H, H);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.b
    public void y(int i10) {
        if (i10 != x()) {
            super.y(i10);
            this.f27851a0.j(x());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27852b0 = new Rect();
        this.f27853c0 = new RectF();
        this.f27854d0 = new SparseArray<>();
        this.f27857g0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f58995h1, i10, k.f58929z);
        Resources resources = getResources();
        ColorStateList a10 = qj.c.a(context, obtainStyledAttributes, l.f59013j1);
        this.f27864n0 = a10;
        LayoutInflater.from(context).inflate(h.f58870h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f58844j);
        this.f27851a0 = clockHandView;
        this.f27858h0 = resources.getDimensionPixelSize(d.f58813l);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f27856f0 = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = f.a.a(context, wi.c.f58795f).getDefaultColor();
        ColorStateList a11 = qj.c.a(context, obtainStyledAttributes, l.f59004i1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f27855e0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        I(strArr, 0);
        this.f27859i0 = resources.getDimensionPixelSize(d.f58826y);
        this.f27860j0 = resources.getDimensionPixelSize(d.f58827z);
        this.f27861k0 = resources.getDimensionPixelSize(d.f58815n);
    }
}
