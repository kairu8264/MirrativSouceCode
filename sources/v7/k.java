package v7;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class k extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f56857b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(m7.e.f40610a);

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f56857b);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.d(eVar, bitmap, i10, i11);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // m7.e
    public int hashCode() {
        return 1101716364;
    }
}
