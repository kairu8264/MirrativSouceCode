package v7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes.dex */
public class b implements m7.k<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f56834a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.k<Bitmap> f56835b;

    public b(p7.e eVar, m7.k<Bitmap> kVar) {
        this.f56834a = eVar;
        this.f56835b = kVar;
    }

    @Override // m7.k
    public m7.c b(m7.h hVar) {
        return this.f56835b.b(hVar);
    }

    @Override // m7.d
    /* renamed from: c */
    public boolean a(o7.u<BitmapDrawable> uVar, File file, m7.h hVar) {
        return this.f56835b.a(new e(uVar.get().getBitmap(), this.f56834a), file, hVar);
    }
}
