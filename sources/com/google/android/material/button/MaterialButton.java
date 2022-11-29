package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o3.c0;
import s3.j;
import tj.h;
import tj.n;
import wi.k;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {
    public static final int[] J = {16842911};
    public static final int[] K = {16842912};
    public static final int L = k.f58920q;
    public ColorStateList A;
    public Drawable B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: w  reason: collision with root package name */
    public final bj.a f27449w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashSet<a> f27450x;

    /* renamed from: y  reason: collision with root package name */
    public b f27451y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuff.Mode f27452z;

    /* loaded from: classes3.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: classes3.dex */
    public static class c extends v3.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public boolean f27453w;

        /* loaded from: classes3.dex */
        public static class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void a(Parcel parcel) {
            this.f27453w = parcel.readInt() == 1;
        }

        @Override // v3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27453w ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58785v);
    }

    private boolean f() {
        return c0.E(this) == 1;
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public void a(a aVar) {
        this.f27450x.add(aVar);
    }

    public boolean b() {
        bj.a aVar = this.f27449w;
        return aVar != null && aVar.p();
    }

    public final boolean c() {
        int i10 = this.I;
        return i10 == 3 || i10 == 4;
    }

    public final boolean d() {
        int i10 = this.I;
        return i10 == 1 || i10 == 2;
    }

    public final boolean e() {
        int i10 = this.I;
        return i10 == 16 || i10 == 32;
    }

    public final boolean g() {
        bj.a aVar = this.f27449w;
        return (aVar == null || aVar.o()) ? false : true;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.f27449w.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.B;
    }

    public int getIconGravity() {
        return this.I;
    }

    public int getIconPadding() {
        return this.F;
    }

    public int getIconSize() {
        return this.C;
    }

    public ColorStateList getIconTint() {
        return this.A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f27452z;
    }

    public int getInsetBottom() {
        return this.f27449w.c();
    }

    public int getInsetTop() {
        return this.f27449w.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.f27449w.h();
        }
        return null;
    }

    public tj.k getShapeAppearanceModel() {
        if (g()) {
            return this.f27449w.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.f27449w.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.f27449w.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o3.a0
    public ColorStateList getSupportBackgroundTintList() {
        if (g()) {
            return this.f27449w.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o3.a0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (g()) {
            return this.f27449w.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.f27450x.remove(aVar);
    }

    public final void i() {
        if (d()) {
            j.l(this, this.B, null, null, null);
        } else if (c()) {
            j.l(this, null, null, this.B, null);
        } else if (e()) {
            j.l(this, null, this.B, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.G;
    }

    public final void j(boolean z10) {
        Drawable drawable = this.B;
        if (drawable != null) {
            Drawable mutate = g3.a.r(drawable).mutate();
            this.B = mutate;
            g3.a.o(mutate, this.A);
            PorterDuff.Mode mode = this.f27452z;
            if (mode != null) {
                g3.a.p(this.B, mode);
            }
            int i10 = this.C;
            if (i10 == 0) {
                i10 = this.B.getIntrinsicWidth();
            }
            int i11 = this.C;
            if (i11 == 0) {
                i11 = this.B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.B;
            int i12 = this.D;
            int i13 = this.E;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
        }
        if (z10) {
            i();
            return;
        }
        Drawable[] a10 = j.a(this);
        boolean z11 = false;
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((d() && drawable3 != this.B) || ((c() && drawable5 != this.B) || (e() && drawable4 != this.B))) {
            z11 = true;
        }
        if (z11) {
            i();
        }
    }

    public final void k(int i10, int i11) {
        if (this.B == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.D = 0;
                if (this.I == 16) {
                    this.E = 0;
                    j(false);
                    return;
                }
                int i12 = this.C;
                if (i12 == 0) {
                    i12 = this.B.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.F) - getPaddingBottom()) / 2;
                if (this.E != textHeight) {
                    this.E = textHeight;
                    j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.E = 0;
        int i13 = this.I;
        if (i13 != 1 && i13 != 3) {
            int i14 = this.C;
            if (i14 == 0) {
                i14 = this.B.getIntrinsicWidth();
            }
            int textWidth = (((((i10 - getTextWidth()) - c0.I(this)) - i14) - this.F) - c0.J(this)) / 2;
            if (f() != (this.I == 4)) {
                textWidth = -textWidth;
            }
            if (this.D != textWidth) {
                this.D = textWidth;
                j(false);
                return;
            }
            return;
        }
        this.D = 0;
        j(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            h.f(this, this.f27449w.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (b()) {
            Button.mergeDrawableStates(onCreateDrawableState, J);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bj.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f27449w) == null) {
            return;
        }
        aVar.H(i13 - i11, i12 - i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.f27453w);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f27453w = this.G;
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k(i10, i11);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (g()) {
            this.f27449w.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f27449w.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (g()) {
            this.f27449w.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (b() && isEnabled() && this.G != z10) {
            this.G = z10;
            refreshDrawableState();
            if (this.H) {
                return;
            }
            this.H = true;
            Iterator<a> it = this.f27450x.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.G);
            }
            this.H = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (g()) {
            this.f27449w.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (g()) {
            this.f27449w.f().X(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.B != drawable) {
            this.B = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.I != i10) {
            this.I = i10;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.F != i10) {
            this.F = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.C != i10) {
                this.C = i10;
                j(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f27452z != mode) {
            this.f27452z = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f27449w.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f27449w.w(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f27451y = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f27451y;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.f27449w.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (g()) {
            setRippleColor(f.a.a(getContext(), i10));
        }
    }

    @Override // tj.n
    public void setShapeAppearanceModel(tj.k kVar) {
        if (g()) {
            this.f27449w.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (g()) {
            this.f27449w.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.f27449w.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (g()) {
            setStrokeColor(f.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (g()) {
            this.f27449w.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o3.a0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.f27449w.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o3.a0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.f27449w.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.G);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.L
            android.content.Context r9 = yj.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f27450x = r9
            r9 = 0
            r8.G = r9
            r8.H = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = wi.l.T2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r1 = wi.l.f58988g3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.F = r1
            int r1 = wi.l.f59015j3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = nj.l.e(r1, r2)
            r8.f27452z = r1
            android.content.Context r1 = r8.getContext()
            int r2 = wi.l.f59006i3
            android.content.res.ColorStateList r1 = qj.c.a(r1, r0, r2)
            r8.A = r1
            android.content.Context r1 = r8.getContext()
            int r2 = wi.l.f58970e3
            android.graphics.drawable.Drawable r1 = qj.c.d(r1, r0, r2)
            r8.B = r1
            int r1 = wi.l.f58979f3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.I = r1
            int r1 = wi.l.f58997h3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.C = r1
            tj.k$b r10 = tj.k.e(r7, r10, r11, r6)
            tj.k r10 = r10.m()
            bj.a r11 = new bj.a
            r11.<init>(r8, r10)
            r8.f27449w = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.F
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.B
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
