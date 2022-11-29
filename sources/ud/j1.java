package ud;

import android.graphics.Bitmap;
import ud.h1;

/* loaded from: classes2.dex */
public final class j1 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f55052a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f55053b;

    /* renamed from: c  reason: collision with root package name */
    public final h1.a f55054c;

    public j1(Bitmap bitmap, boolean z10, h1.a aVar) {
        jo.p.h(bitmap, "image");
        jo.p.h(aVar, "type");
        this.f55052a = bitmap;
        this.f55053b = z10;
        this.f55054c = aVar;
    }

    public final Bitmap a() {
        return this.f55052a;
    }

    public final boolean b() {
        return this.f55053b;
    }

    @Override // ud.h1
    public h1.a getType() {
        return this.f55054c;
    }

    public /* synthetic */ j1(Bitmap bitmap, boolean z10, h1.a aVar, int i10, jo.h hVar) {
        this(bitmap, z10, (i10 & 4) != 0 ? h1.a.GALLERY_IMAGE : aVar);
    }
}
