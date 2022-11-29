package x7;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i8.j;
import o7.q;
import o7.u;

/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements u<T>, q {

    /* renamed from: w  reason: collision with root package name */
    public final T f59772w;

    public b(T t10) {
        this.f59772w = (T) j.d(t10);
    }

    public void b() {
        T t10 = this.f59772w;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof z7.c) {
            ((z7.c) t10).e().prepareToDraw();
        }
    }

    @Override // o7.u
    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f59772w.getConstantState();
        if (constantState == null) {
            return this.f59772w;
        }
        return (T) constantState.newDrawable();
    }
}
