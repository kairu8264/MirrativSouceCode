package v7;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f56855b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(m7.e.f40610a);

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f56855b);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.b(eVar, bitmap, i10, i11);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // m7.e
    public int hashCode() {
        return -599754482;
    }
}
