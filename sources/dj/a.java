package dj;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import o3.c0;
import qj.c;
import tj.d;
import tj.e;
import tj.g;
import tj.j;
import tj.k;
import wi.b;
import wi.f;
import wi.l;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f29658t = {16842912};

    /* renamed from: u  reason: collision with root package name */
    public static final double f29659u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f29660a;

    /* renamed from: c  reason: collision with root package name */
    public final g f29662c;

    /* renamed from: d  reason: collision with root package name */
    public final g f29663d;

    /* renamed from: e  reason: collision with root package name */
    public int f29664e;

    /* renamed from: f  reason: collision with root package name */
    public int f29665f;

    /* renamed from: g  reason: collision with root package name */
    public int f29666g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f29667h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f29668i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f29669j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f29670k;

    /* renamed from: l  reason: collision with root package name */
    public k f29671l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f29672m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f29673n;

    /* renamed from: o  reason: collision with root package name */
    public LayerDrawable f29674o;

    /* renamed from: p  reason: collision with root package name */
    public g f29675p;

    /* renamed from: q  reason: collision with root package name */
    public g f29676q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f29678s;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f29661b = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public boolean f29677r = false;

    /* renamed from: dj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0287a extends InsetDrawable {
        public C0287a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f29660a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f29662c = gVar;
        gVar.N(materialCardView.getContext());
        gVar.d0(-12303292);
        k.b v10 = gVar.D().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.f58985g0, i10, wi.k.f58904a);
        int i12 = l.f58994h0;
        if (obtainStyledAttributes.hasValue(i12)) {
            v10.o(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f29663d = new g();
        R(v10.m());
        obtainStyledAttributes.recycle();
    }

    public Rect A() {
        return this.f29661b;
    }

    public final Drawable B(Drawable drawable) {
        int ceil;
        int i10;
        if ((Build.VERSION.SDK_INT < 21) || this.f29660a.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(d());
            ceil = (int) Math.ceil(c());
            i10 = ceil2;
        } else {
            ceil = 0;
            i10 = 0;
        }
        return new C0287a(drawable, ceil, i10, ceil, i10);
    }

    public boolean C() {
        return this.f29677r;
    }

    public boolean D() {
        return this.f29678s;
    }

    public void E(TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f29660a.getContext(), typedArray, l.T3);
        this.f29672m = a10;
        if (a10 == null) {
            this.f29672m = ColorStateList.valueOf(-1);
        }
        this.f29666g = typedArray.getDimensionPixelSize(l.U3, 0);
        boolean z10 = typedArray.getBoolean(l.M3, false);
        this.f29678s = z10;
        this.f29660a.setLongClickable(z10);
        this.f29670k = c.a(this.f29660a.getContext(), typedArray, l.R3);
        K(c.d(this.f29660a.getContext(), typedArray, l.O3));
        M(typedArray.getDimensionPixelSize(l.Q3, 0));
        L(typedArray.getDimensionPixelSize(l.P3, 0));
        ColorStateList a11 = c.a(this.f29660a.getContext(), typedArray, l.S3);
        this.f29669j = a11;
        if (a11 == null) {
            this.f29669j = ColorStateList.valueOf(hj.a.c(this.f29660a, b.f58774k));
        }
        I(c.a(this.f29660a.getContext(), typedArray, l.N3));
        c0();
        Z();
        d0();
        this.f29660a.setBackgroundInternal(B(this.f29662c));
        Drawable r10 = this.f29660a.isClickable() ? r() : this.f29663d;
        this.f29667h = r10;
        this.f29660a.setForeground(B(r10));
    }

    public void F(int i10, int i11) {
        int i12;
        int i13;
        if (this.f29674o != null) {
            int i14 = this.f29664e;
            int i15 = this.f29665f;
            int i16 = (i10 - i14) - i15;
            int i17 = (i11 - i14) - i15;
            if ((Build.VERSION.SDK_INT < 21) || this.f29660a.getUseCompatPadding()) {
                i17 -= (int) Math.ceil(d() * 2.0f);
                i16 -= (int) Math.ceil(c() * 2.0f);
            }
            int i18 = i17;
            int i19 = this.f29664e;
            if (c0.E(this.f29660a) == 1) {
                i13 = i16;
                i12 = i19;
            } else {
                i12 = i16;
                i13 = i19;
            }
            this.f29674o.setLayerInset(2, i12, this.f29664e, i13, i18);
        }
    }

    public void G(boolean z10) {
        this.f29677r = z10;
    }

    public void H(ColorStateList colorStateList) {
        this.f29662c.Y(colorStateList);
    }

    public void I(ColorStateList colorStateList) {
        g gVar = this.f29663d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.Y(colorStateList);
    }

    public void J(boolean z10) {
        this.f29678s = z10;
    }

    public void K(Drawable drawable) {
        this.f29668i = drawable;
        if (drawable != null) {
            Drawable r10 = g3.a.r(drawable.mutate());
            this.f29668i = r10;
            g3.a.o(r10, this.f29670k);
        }
        if (this.f29674o != null) {
            this.f29674o.setDrawableByLayerId(f.C, f());
        }
    }

    public void L(int i10) {
        this.f29664e = i10;
    }

    public void M(int i10) {
        this.f29665f = i10;
    }

    public void N(ColorStateList colorStateList) {
        this.f29670k = colorStateList;
        Drawable drawable = this.f29668i;
        if (drawable != null) {
            g3.a.o(drawable, colorStateList);
        }
    }

    public void O(float f10) {
        R(this.f29671l.w(f10));
        this.f29667h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    public void P(float f10) {
        this.f29662c.Z(f10);
        g gVar = this.f29663d;
        if (gVar != null) {
            gVar.Z(f10);
        }
        g gVar2 = this.f29676q;
        if (gVar2 != null) {
            gVar2.Z(f10);
        }
    }

    public void Q(ColorStateList colorStateList) {
        this.f29669j = colorStateList;
        c0();
    }

    public void R(k kVar) {
        this.f29671l = kVar;
        this.f29662c.setShapeAppearanceModel(kVar);
        g gVar = this.f29662c;
        gVar.c0(!gVar.Q());
        g gVar2 = this.f29663d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f29676q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f29675p;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    public void S(ColorStateList colorStateList) {
        if (this.f29672m == colorStateList) {
            return;
        }
        this.f29672m = colorStateList;
        d0();
    }

    public void T(int i10) {
        if (i10 == this.f29666g) {
            return;
        }
        this.f29666g = i10;
        d0();
    }

    public void U(int i10, int i11, int i12, int i13) {
        this.f29661b.set(i10, i11, i12, i13);
        Y();
    }

    public final boolean V() {
        return this.f29660a.getPreventCornerOverlap() && !e();
    }

    public final boolean W() {
        return this.f29660a.getPreventCornerOverlap() && e() && this.f29660a.getUseCompatPadding();
    }

    public void X() {
        Drawable drawable = this.f29667h;
        Drawable r10 = this.f29660a.isClickable() ? r() : this.f29663d;
        this.f29667h = r10;
        if (drawable != r10) {
            a0(r10);
        }
    }

    public void Y() {
        int a10 = (int) ((V() || W() ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f29660a;
        Rect rect = this.f29661b;
        materialCardView.k(rect.left + a10, rect.top + a10, rect.right + a10, rect.bottom + a10);
    }

    public void Z() {
        this.f29662c.X(this.f29660a.getCardElevation());
    }

    public final float a() {
        return Math.max(Math.max(b(this.f29671l.q(), this.f29662c.G()), b(this.f29671l.s(), this.f29662c.H())), Math.max(b(this.f29671l.k(), this.f29662c.t()), b(this.f29671l.i(), this.f29662c.s())));
    }

    public final void a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f29660a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f29660a.getForeground()).setDrawable(drawable);
        } else {
            this.f29660a.setForeground(B(drawable));
        }
    }

    public final float b(d dVar, float f10) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f29659u) * f10);
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public void b0() {
        if (!C()) {
            this.f29660a.setBackgroundInternal(B(this.f29662c));
        }
        this.f29660a.setForeground(B(this.f29667h));
    }

    public final float c() {
        return this.f29660a.getMaxCardElevation() + (W() ? a() : 0.0f);
    }

    public final void c0() {
        Drawable drawable;
        if (rj.b.f51549a && (drawable = this.f29673n) != null) {
            ((RippleDrawable) drawable).setColor(this.f29669j);
            return;
        }
        g gVar = this.f29675p;
        if (gVar != null) {
            gVar.Y(this.f29669j);
        }
    }

    public final float d() {
        return (this.f29660a.getMaxCardElevation() * 1.5f) + (W() ? a() : 0.0f);
    }

    public void d0() {
        this.f29663d.g0(this.f29666g, this.f29672m);
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.f29662c.Q();
    }

    public final Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f29668i;
        if (drawable != null) {
            stateListDrawable.addState(f29658t, drawable);
        }
        return stateListDrawable;
    }

    public final Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g i10 = i();
        this.f29675p = i10;
        i10.Y(this.f29669j);
        stateListDrawable.addState(new int[]{16842919}, this.f29675p);
        return stateListDrawable;
    }

    public final Drawable h() {
        if (rj.b.f51549a) {
            this.f29676q = i();
            return new RippleDrawable(this.f29669j, null, this.f29676q);
        }
        return g();
    }

    public final g i() {
        return new g(this.f29671l);
    }

    public void j() {
        Drawable drawable = this.f29673n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f29673n.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f29673n.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public g k() {
        return this.f29662c;
    }

    public ColorStateList l() {
        return this.f29662c.x();
    }

    public ColorStateList m() {
        return this.f29663d.x();
    }

    public Drawable n() {
        return this.f29668i;
    }

    public int o() {
        return this.f29664e;
    }

    public int p() {
        return this.f29665f;
    }

    public ColorStateList q() {
        return this.f29670k;
    }

    public final Drawable r() {
        if (this.f29673n == null) {
            this.f29673n = h();
        }
        if (this.f29674o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f29673n, this.f29663d, f()});
            this.f29674o = layerDrawable;
            layerDrawable.setId(2, f.C);
        }
        return this.f29674o;
    }

    public float s() {
        return this.f29662c.G();
    }

    public final float t() {
        if (this.f29660a.getPreventCornerOverlap()) {
            if (Build.VERSION.SDK_INT < 21 || this.f29660a.getUseCompatPadding()) {
                return (float) ((1.0d - f29659u) * this.f29660a.getCardViewRadius());
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public float u() {
        return this.f29662c.y();
    }

    public ColorStateList v() {
        return this.f29669j;
    }

    public k w() {
        return this.f29671l;
    }

    public int x() {
        ColorStateList colorStateList = this.f29672m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList y() {
        return this.f29672m;
    }

    public int z() {
        return this.f29666g;
    }
}
