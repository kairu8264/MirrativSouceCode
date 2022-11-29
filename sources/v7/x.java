package v7;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class x implements m7.j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final x7.d f56910a;

    /* renamed from: b  reason: collision with root package name */
    public final p7.e f56911b;

    public x(x7.d dVar, p7.e eVar) {
        this.f56910a = dVar;
        this.f56911b = eVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(Uri uri, int i10, int i11, m7.h hVar) {
        o7.u<Drawable> b10 = this.f56910a.b(uri, i10, i11, hVar);
        if (b10 == null) {
            return null;
        }
        return n.a(this.f56911b, b10.get(), i10, i11);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(Uri uri, m7.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
