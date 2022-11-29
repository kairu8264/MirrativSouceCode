package ud;

import android.graphics.drawable.Drawable;
import java.util.List;

/* loaded from: classes2.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.e0<Boolean> f55282a = new androidx.lifecycle.e0<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.e0<Drawable> f55283b = new androidx.lifecycle.e0<>(null);

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<List<n1>> f55284c = new androidx.lifecycle.e0<>(xn.s.k());

    public final void a(List<n1> list, boolean z10, Drawable drawable) {
        jo.p.h(list, "descriptions");
        jo.p.h(drawable, "descriptionBackground");
        this.f55284c.p(list);
        this.f55282a.p(Boolean.valueOf(z10));
        this.f55283b.p(drawable);
    }

    public final androidx.lifecycle.e0<Drawable> b() {
        return this.f55283b;
    }

    public final androidx.lifecycle.e0<List<n1>> c() {
        return this.f55284c;
    }

    public final androidx.lifecycle.e0<Boolean> d() {
        return this.f55282a;
    }
}
