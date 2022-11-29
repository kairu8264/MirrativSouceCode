package xd;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import jo.h;
import jo.p;
import m7.e;
import v7.f;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60236c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f60237d;

    /* renamed from: b  reason: collision with root package name */
    public final float f60238b;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    static {
        Charset charset = e.f40610a;
        p.g(charset, "CHARSET");
        byte[] bytes = "com.bumptech.glide.load.resource.bitmap.RotateTransformation.1".getBytes(charset);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        f60237d = bytes;
    }

    public c(float f10) {
        this.f60238b = f10;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        p.h(messageDigest, "messageDigest");
        messageDigest.update(f60237d);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        p.h(eVar, "pool");
        p.h(bitmap, "toTransform");
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f60238b);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        p.g(createBitmap, "createBitmap(toTransform…orm.height, matrix, true)");
        return createBitmap;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof xd.a;
    }

    @Override // m7.e
    public int hashCode() {
        return -80760560;
    }
}
