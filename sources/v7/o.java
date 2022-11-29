package v7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class o implements m7.l<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final m7.l<Bitmap> f56882b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f56883c;

    public o(m7.l<Bitmap> lVar, boolean z10) {
        this.f56882b = lVar;
        this.f56883c = z10;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        this.f56882b.a(messageDigest);
    }

    @Override // m7.l
    public o7.u<Drawable> b(Context context, o7.u<Drawable> uVar, int i10, int i11) {
        p7.e g10 = com.bumptech.glide.c.d(context).g();
        Drawable drawable = uVar.get();
        o7.u<Bitmap> a10 = n.a(g10, drawable, i10, i11);
        if (a10 == null) {
            if (this.f56883c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return uVar;
        }
        o7.u<Bitmap> b10 = this.f56882b.b(context, a10, i10, i11);
        if (b10.equals(a10)) {
            b10.c();
            return uVar;
        }
        return d(context, b10);
    }

    public m7.l<BitmapDrawable> c() {
        return this;
    }

    public final o7.u<Drawable> d(Context context, o7.u<Bitmap> uVar) {
        return u.f(context.getResources(), uVar);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f56882b.equals(((o) obj).f56882b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f56882b.hashCode();
    }
}
