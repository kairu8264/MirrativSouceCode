package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: w  reason: collision with root package name */
    public c f14917w;

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f14917w == null) {
            this.f14917w = new c();
        }
        this.f14917w.h(this);
        return this.f14917w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;

        /* renamed from: w0  reason: collision with root package name */
        public float f14918w0;

        /* renamed from: x0  reason: collision with root package name */
        public boolean f14919x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f14920y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f14921z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f14918w0 = 1.0f;
            this.f14919x0 = false;
            this.f14920y0 = 0.0f;
            this.f14921z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14918w0 = 1.0f;
            this.f14919x0 = false;
            this.f14920y0 = 0.0f;
            this.f14921z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x2.d.f59507j4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == x2.d.f59516k4) {
                    this.f14918w0 = obtainStyledAttributes.getFloat(index, this.f14918w0);
                } else if (index == x2.d.f59615v4) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f14920y0 = obtainStyledAttributes.getFloat(index, this.f14920y0);
                        this.f14919x0 = true;
                    }
                } else if (index == x2.d.f59588s4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == x2.d.f59597t4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == x2.d.f59579r4) {
                    this.f14921z0 = obtainStyledAttributes.getFloat(index, this.f14921z0);
                } else if (index == x2.d.f59561p4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == x2.d.f59570q4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == x2.d.f59525l4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == x2.d.f59534m4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == x2.d.f59543n4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == x2.d.f59552o4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == x2.d.f59606u4 && Build.VERSION.SDK_INT >= 21) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
