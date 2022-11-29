package l7;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import o7.u;

/* loaded from: classes.dex */
public class n implements m7.l<k> {

    /* renamed from: b  reason: collision with root package name */
    public final m7.l<Bitmap> f39649b;

    public n(m7.l<Bitmap> lVar) {
        this.f39649b = (m7.l) i8.j.d(lVar);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        this.f39649b.a(messageDigest);
    }

    @Override // m7.l
    public u<k> b(Context context, u<k> uVar, int i10, int i11) {
        k kVar = uVar.get();
        u<Bitmap> eVar = new v7.e(kVar.e(), com.bumptech.glide.c.d(context).g());
        u<Bitmap> b10 = this.f39649b.b(context, eVar, i10, i11);
        if (!eVar.equals(b10)) {
            eVar.c();
        }
        kVar.n(this.f39649b, b10.get());
        return uVar;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f39649b.equals(((n) obj).f39649b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f39649b.hashCode();
    }
}
