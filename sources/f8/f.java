package f8;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import g8.b;

/* loaded from: classes.dex */
public abstract class f<Z> extends k<ImageView, Z> implements b.a {
    public Animatable D;

    public f(ImageView imageView) {
        super(imageView);
    }

    @Override // f8.j
    public void e(Z z10, g8.b<? super Z> bVar) {
        if (bVar != null && bVar.a(z10, this)) {
            p(z10);
        } else {
            s(z10);
        }
    }

    @Override // f8.k, f8.a, f8.j
    public void f(Drawable drawable) {
        super.f(drawable);
        s(null);
        q(drawable);
    }

    @Override // f8.k, f8.a, f8.j
    public void g(Drawable drawable) {
        super.g(drawable);
        Animatable animatable = this.D;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    @Override // f8.a, f8.j
    public void k(Drawable drawable) {
        super.k(drawable);
        s(null);
        q(drawable);
    }

    @Override // f8.a, b8.m
    public void onStart() {
        Animatable animatable = this.D;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // f8.a, b8.m
    public void onStop() {
        Animatable animatable = this.D;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void p(Z z10) {
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.D = animatable;
            animatable.start();
            return;
        }
        this.D = null;
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f31840w).setImageDrawable(drawable);
    }

    public abstract void r(Z z10);

    public final void s(Z z10) {
        r(z10);
        p(z10);
    }
}
