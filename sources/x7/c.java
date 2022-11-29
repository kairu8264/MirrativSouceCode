package x7;

import android.graphics.drawable.Drawable;
import o7.u;

/* loaded from: classes.dex */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    public static u<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    @Override // o7.u
    public int a() {
        return Math.max(1, this.f59772w.getIntrinsicWidth() * this.f59772w.getIntrinsicHeight() * 4);
    }

    @Override // o7.u
    public void c() {
    }

    @Override // o7.u
    public Class<Drawable> d() {
        return this.f59772w.getClass();
    }
}
