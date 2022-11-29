package mj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import n3.h;
import tj.g;
import tj.k;
import wi.c;

/* loaded from: classes3.dex */
public class b extends com.google.android.material.floatingactionbutton.a {

    /* loaded from: classes3.dex */
    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // tj.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public b(FloatingActionButton floatingActionButton, sj.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void C() {
        f0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void E(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f27653y.isEnabled()) {
                this.f27653y.setElevation(this.f27636h);
                if (this.f27653y.isPressed()) {
                    this.f27653y.setTranslationZ(this.f27638j);
                    return;
                } else if (!this.f27653y.isFocused() && !this.f27653y.isHovered()) {
                    this.f27653y.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f27653y.setTranslationZ(this.f27637i);
                    return;
                }
            }
            this.f27653y.setElevation(0.0f);
            this.f27653y.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void F(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f27653y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.G, j0(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.H, j0(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.I, j0(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.J, j0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f27653y, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f27653y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f27653y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.F);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.K, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.L, j0(0.0f, 0.0f));
            this.f27653y.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean K() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f27631c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(rj.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean Z() {
        return this.f27654z.b() || !b0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void d0() {
    }

    public mj.a i0(int i10, ColorStateList colorStateList) {
        Context context = this.f27653y.getContext();
        mj.a aVar = new mj.a((k) h.g(this.f27629a));
        aVar.e(c3.a.d(context, c.f58794e), c3.a.d(context, c.f58793d), c3.a.d(context, c.f58791b), c3.a.d(context, c.f58792c));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public g j() {
        return new a((k) h.g(this.f27629a));
    }

    public final Animator j0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f27653y, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f27653y, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float n() {
        return this.f27653y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void s(Rect rect) {
        if (this.f27654z.b()) {
            super.s(rect);
        } else if (!b0()) {
            int sizeDimension = (this.f27639k - this.f27653y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        g j10 = j();
        this.f27630b = j10;
        j10.setTintList(colorStateList);
        if (mode != null) {
            this.f27630b.setTintMode(mode);
        }
        this.f27630b.N(this.f27653y.getContext());
        if (i10 > 0) {
            this.f27632d = i0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) h.g(this.f27632d), (Drawable) h.g(this.f27630b)});
        } else {
            this.f27632d = null;
            drawable = this.f27630b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(rj.b.d(colorStateList2), drawable, null);
        this.f27631c = rippleDrawable;
        this.f27633e = rippleDrawable;
    }
}
