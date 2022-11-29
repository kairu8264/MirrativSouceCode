package d6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d6.h;
import j6.m;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f29196a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29197b;

    /* loaded from: classes.dex */
    public static final class a implements h.a<Bitmap> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(Bitmap bitmap, m mVar, x5.e eVar) {
            return new b(bitmap, mVar);
        }
    }

    public b(Bitmap bitmap, m mVar) {
        this.f29196a = bitmap;
        this.f29197b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        return new f(new BitmapDrawable(this.f29197b.g().getResources(), this.f29196a), false, a6.d.MEMORY);
    }
}
