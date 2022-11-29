package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import r.b;
import r.c;
import r.d;
import r.e;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] D = {16842801};
    public static final e E;
    public final Rect A;
    public final Rect B;
    public final d C;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14283w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14284x;

    /* renamed from: y  reason: collision with root package name */
    public int f14285y;

    /* renamed from: z  reason: collision with root package name */
    public int f14286z;

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f14287a;

        public a() {
        }

        @Override // r.d
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.B.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.A;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // r.d
        public void b(Drawable drawable) {
            this.f14287a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // r.d
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // r.d
        public Drawable d() {
            return this.f14287a;
        }

        @Override // r.d
        public void e(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f14285y) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f14286z) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // r.d
        public boolean f() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // r.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            E = new b();
        } else if (i10 >= 17) {
            E = new r.a();
        } else {
            E = new c();
        }
        E.m();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f48487a);
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.A.set(i10, i11, i12, i13);
        E.g(this.C);
    }

    public ColorStateList getCardBackgroundColor() {
        return E.h(this.C);
    }

    public float getCardElevation() {
        return E.i(this.C);
    }

    public int getContentPaddingBottom() {
        return this.A.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A.left;
    }

    public int getContentPaddingRight() {
        return this.A.right;
    }

    public int getContentPaddingTop() {
        return this.A.top;
    }

    public float getMaxCardElevation() {
        return E.j(this.C);
    }

    public boolean getPreventCornerOverlap() {
        return this.f14284x;
    }

    public float getRadius() {
        return E.l(this.C);
    }

    public boolean getUseCompatPadding() {
        return this.f14283w;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        e eVar = E;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.k(this.C)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.b(this.C)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        E.o(this.C, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        E.c(this.C, f10);
    }

    public void setMaxCardElevation(float f10) {
        E.n(this.C, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f14286z = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f14285y = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f14284x) {
            this.f14284x = z10;
            E.d(this.C);
        }
    }

    public void setRadius(float f10) {
        E.f(this.C, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f14283w != z10) {
            this.f14283w = z10;
            E.e(this.C);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.A = rect;
        this.B = new Rect();
        a aVar = new a();
        this.C = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f48494a, i10, q.d.f48493a);
        int i11 = q.e.f48497d;
        if (obtainStyledAttributes.hasValue(i11)) {
            valueOf = obtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(D);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(q.b.f48489b);
            } else {
                color = getResources().getColor(q.b.f48488a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(q.e.f48498e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(q.e.f48499f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(q.e.f48500g, 0.0f);
        this.f14283w = obtainStyledAttributes.getBoolean(q.e.f48502i, false);
        this.f14284x = obtainStyledAttributes.getBoolean(q.e.f48501h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(q.e.f48503j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(q.e.f48505l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(q.e.f48507n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(q.e.f48506m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(q.e.f48504k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f14285y = obtainStyledAttributes.getDimensionPixelSize(q.e.f48495b, 0);
        this.f14286z = obtainStyledAttributes.getDimensionPixelSize(q.e.f48496c, 0);
        obtainStyledAttributes.recycle();
        E.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        E.o(this.C, colorStateList);
    }
}
