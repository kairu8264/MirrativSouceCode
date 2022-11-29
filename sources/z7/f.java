package z7;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import m7.l;
import o7.u;

/* loaded from: classes.dex */
public class f implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f62612b;

    public f(l<Bitmap> lVar) {
        this.f62612b = (l) i8.j.d(lVar);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        this.f62612b.a(messageDigest);
    }

    @Override // m7.l
    public u<c> b(Context context, u<c> uVar, int i10, int i11) {
        c cVar = uVar.get();
        u<Bitmap> eVar = new v7.e(cVar.e(), com.bumptech.glide.c.d(context).g());
        u<Bitmap> b10 = this.f62612b.b(context, eVar, i10, i11);
        if (!eVar.equals(b10)) {
            eVar.c();
        }
        cVar.m(this.f62612b, b10.get());
        return uVar;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f62612b.equals(((f) obj).f62612b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f62612b.hashCode();
    }
}
