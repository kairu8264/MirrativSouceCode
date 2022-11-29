package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.u;
import l6.b;
import n6.d;

/* loaded from: classes.dex */
public abstract class GenericViewTarget<T extends View> implements b<T>, d, h {

    /* renamed from: w  reason: collision with root package name */
    public boolean f20027w;

    @Override // l6.a
    public void e(Drawable drawable) {
        o(drawable);
    }

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void f(u uVar) {
        this.f20027w = false;
        n();
    }

    @Override // androidx.lifecycle.h, androidx.lifecycle.m
    public void h(u uVar) {
        this.f20027w = true;
        n();
    }

    @Override // l6.a
    public void j(Drawable drawable) {
        o(drawable);
    }

    @Override // l6.a
    public void k(Drawable drawable) {
        o(drawable);
    }

    @Override // n6.d
    public abstract Drawable l();

    public abstract void m(Drawable drawable);

    public final void n() {
        Drawable l10 = l();
        Animatable animatable = l10 instanceof Animatable ? (Animatable) l10 : null;
        if (animatable == null) {
            return;
        }
        if (this.f20027w) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void o(Drawable drawable) {
        Drawable l10 = l();
        Animatable animatable = l10 instanceof Animatable ? (Animatable) l10 : null;
        if (animatable != null) {
            animatable.stop();
        }
        m(drawable);
        n();
    }
}
