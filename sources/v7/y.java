package v7;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class y extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f56912c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(m7.e.f40610a);

    /* renamed from: b  reason: collision with root package name */
    public final int f56913b;

    public y(int i10) {
        i8.j.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f56913b = i10;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f56912c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f56913b).array());
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        return a0.o(eVar, bitmap, this.f56913b);
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return (obj instanceof y) && this.f56913b == ((y) obj).f56913b;
    }

    @Override // m7.e
    public int hashCode() {
        return i8.k.o(-569625254, i8.k.n(this.f56913b));
    }
}
