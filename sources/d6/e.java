package d6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d6.h;
import j6.m;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f29202a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29203b;

    /* loaded from: classes.dex */
    public static final class a implements h.a<Drawable> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(Drawable drawable, m mVar, x5.e eVar) {
            return new e(drawable, mVar);
        }
    }

    public e(Drawable drawable, m mVar) {
        this.f29202a = drawable;
        this.f29203b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        Drawable drawable;
        boolean u10 = o6.k.u(this.f29202a);
        if (u10) {
            drawable = new BitmapDrawable(this.f29203b.g().getResources(), o6.m.f44102a.a(this.f29202a, this.f29203b.f(), this.f29203b.o(), this.f29203b.n(), this.f29203b.c()));
        } else {
            drawable = this.f29202a;
        }
        return new f(drawable, u10, a6.d.MEMORY);
    }
}
