package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.material.chip.a;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o3.c0;
import p3.c;
import qj.d;
import qj.f;
import tj.n;
import wi.j;
import wi.k;
import wi.l;
import xi.h;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0242a, n {
    public static final int M = k.f58923t;
    public static final Rect N = new Rect();
    public static final int[] O = {16842913};
    public static final int[] P = {16842911};
    public CompoundButton.OnCheckedChangeListener A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final Rect J;
    public final RectF K;
    public final f L;

    /* renamed from: w  reason: collision with root package name */
    public com.google.android.material.chip.a f27467w;

    /* renamed from: x  reason: collision with root package name */
    public InsetDrawable f27468x;

    /* renamed from: y  reason: collision with root package name */
    public RippleDrawable f27469y;

    /* renamed from: z  reason: collision with root package name */
    public View.OnClickListener f27470z;

    /* loaded from: classes3.dex */
    public class a extends f {
        public a() {
        }

        @Override // qj.f
        public void a(int i10) {
        }

        @Override // qj.f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f27467w.N2() ? Chip.this.f27467w.j1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f27467w != null) {
                Chip.this.f27467w.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends w3.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // w3.a
        public int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // w3.a
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f27470z != null) {
                list.add(1);
            }
        }

        @Override // w3.a
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.t();
                }
                return false;
            }
            return false;
        }

        @Override // w3.a
        public void M(p3.c cVar) {
            cVar.Z(Chip.this.r());
            cVar.c0(Chip.this.isClickable());
            if (!Chip.this.r() && !Chip.this.isClickable()) {
                cVar.b0("android.view.View");
            } else {
                cVar.b0(Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.G0(text);
            } else {
                cVar.f0(text);
            }
        }

        @Override // w3.a
        public void N(int i10, p3.c cVar) {
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.f0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = j.f58893j;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    cVar.f0(context.getString(i11, objArr).trim());
                }
                cVar.W(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f45749i);
                cVar.j0(Chip.this.isEnabled());
                return;
            }
            cVar.f0("");
            cVar.W(Chip.N);
        }

        @Override // w3.a
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.E = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wi.b.f58771h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.K.setEmpty();
        if (n() && this.f27470z != null) {
            this.f27467w.a1(this.K);
        }
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.J.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.J;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f27467w) == null) {
            return;
        }
        int L0 = (int) (aVar.L0() + this.f27467w.l1() + this.f27467w.s0());
        int Q0 = (int) (this.f27467w.Q0() + this.f27467w.m1() + this.f27467w.o0());
        if (this.f27468x != null) {
            Rect rect = new Rect();
            this.f27468x.getPadding(rect);
            Q0 += rect.left;
            L0 += rect.right;
        }
        c0.G0(this, Q0, getPaddingTop(), L0, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.L);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // com.google.android.material.chip.a.InterfaceC0242a
    public void a() {
        k(this.H);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.I.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.I.w(keyEvent) || this.I.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f27467w;
        if ((aVar == null || !aVar.r1()) ? false : this.f27467w.n2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f27468x;
        return insetDrawable == null ? this.f27467w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return Math.max(0.0f, aVar.K0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f27467w;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.W0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.I.A() != 1 && this.I.x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    public tj.k getShapeAppearanceModel() {
        return this.f27467w.D();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.l1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public final void i(com.google.android.material.chip.a aVar) {
        aVar.r2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] j() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.E) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.D) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.C) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.E) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.D) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.C) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean k(int i10) {
        this.H = i10;
        if (!v()) {
            if (this.f27468x != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f27467w.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f27467w.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f27468x != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f27468x != null) {
            Rect rect = new Rect();
            this.f27468x.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
        } else {
            setMinHeight(i10);
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.f27468x && this.f27467w.getCallback() == null) {
            this.f27467w.setCallback(this.f27468x);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = w3.a.class.getDeclaredField(TopicConstant.PACKET_TYPE_META);
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.I)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = w3.a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.I, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e10) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            } catch (NoSuchFieldException e11) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            } catch (NoSuchMethodException e12) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e12);
            } catch (InvocationTargetException e13) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e13);
            }
        }
        return false;
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f27467w;
        return (aVar == null || aVar.T0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray h10 = nj.j.h(context, attributeSet, l.f59003i0, i10, M, new int[0]);
        this.F = h10.getBoolean(l.P0, false);
        this.H = (int) Math.ceil(h10.getDimension(l.D0, (float) Math.ceil(nj.l.b(getContext(), 48))));
        h10.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tj.h.f(this, this.f27467w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, O);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.I.I(z10, i10, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!r() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(r() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            p3.c.M0(accessibilityNodeInfo).e0(c.C0699c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), AnalyticsListener.EVENT_LOAD_CANCELED);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.G != i10) {
            this.G = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.C
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.C
            if (r0 == 0) goto L34
            r5.t()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f27468x = new InsetDrawable((Drawable) this.f27467w, i10, i11, i12, i13);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f27467w;
        return aVar != null && aVar.q1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f27467w;
        return aVar != null && aVar.s1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f27469y) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f27469y) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.z1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar == null) {
            this.B = z10;
        } else if (aVar.q1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked == z10 || (onCheckedChangeListener = this.A) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.B1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.D1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.J1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f27467w;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f27467w = aVar;
            aVar.C2(false);
            i(this.f27467w);
            k(this.H);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.L1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.N1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.P1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.V1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.X1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.Y1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.Z1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.b2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.e2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.f2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.i2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.l2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.o2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.X(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f27467w == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f27467w;
            if (aVar != null) {
                aVar.s2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.F = z10;
        k(this.H);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.t2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.u2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.v2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f27467w != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i10);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f27470z = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.A2(colorStateList);
        }
        if (this.f27467w.o1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.B2(i10);
            if (this.f27467w.o1()) {
                return;
            }
            z();
        }
    }

    @Override // tj.n
    public void setShapeAppearanceModel(tj.k kVar) {
        this.f27467w.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.D2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.N2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f27467w;
        if (aVar2 != null) {
            aVar2.F2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.G2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.I2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.J2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.K2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f27470z;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.I.U(1, 1);
        return z10;
    }

    public final void u() {
        if (this.f27468x != null) {
            this.f27468x = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.F;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.r2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f27470z != null) {
            c0.r0(this, this.I);
        } else {
            c0.r0(this, null);
        }
    }

    public final void y() {
        if (rj.b.f51549a) {
            z();
            return;
        }
        this.f27467w.M2(true);
        c0.v0(this, getBackgroundDrawable());
        A();
        l();
    }

    public final void z() {
        this.f27469y = new RippleDrawable(rj.b.d(this.f27467w.h1()), getBackgroundDrawable(), null);
        this.f27467w.M2(false);
        c0.v0(this, this.f27469y);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.M
            android.content.Context r8 = yj.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.J = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.K = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.L = r8
            android.content.Context r8 = r7.getContext()
            r7.C(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.x0(r8, r9, r10, r4)
            r7.o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = o3.c0.y(r7)
            r6.X(r0)
            int[] r2 = wi.l.f59003i0
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = nj.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = wi.l.f59030l0
            android.content.res.ColorStateList r8 = qj.c.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = wi.l.U0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.I = r9
            r7.x()
            if (r8 != 0) goto L69
            r7.p()
        L69:
            boolean r8 = r7.B
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.j1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.d1()
            r7.setEllipsize(r8)
            r7.B()
            com.google.android.material.chip.a r8 = r7.f27467w
            boolean r8 = r8.N2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.A()
            boolean r8 = r7.v()
            if (r8 == 0) goto La2
            int r8 = r7.H
            r7.setMinHeight(r8)
        La2:
            int r8 = o3.c0.E(r7)
            r7.G = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.q2(z10);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.G1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.U1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.H2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f27467w;
        if (aVar != null) {
            aVar.H2(i10);
        }
        B();
    }
}
