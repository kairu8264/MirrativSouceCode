package xd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import jo.h;
import jo.p;
import m7.e;
import v7.a0;
import v7.f;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final C1007a f60225d = new C1007a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f60226e;

    /* renamed from: b  reason: collision with root package name */
    public final int f60227b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60228c;

    /* renamed from: xd.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1007a {
        public C1007a() {
        }

        public /* synthetic */ C1007a(h hVar) {
            this();
        }
    }

    static {
        Charset charset = e.f40610a;
        p.g(charset, "CHARSET");
        byte[] bytes = "com.bumptech.glide.load.resource.bitmap.CircleBorderTransformation.1".getBytes(charset);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        f60226e = bytes;
    }

    public a(int i10, int i11) {
        this.f60227b = i10;
        this.f60228c = i11;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        p.h(messageDigest, "messageDigest");
        messageDigest.update(f60226e);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        p.h(eVar, "pool");
        p.h(bitmap, "toTransform");
        Bitmap d10 = a0.d(eVar, bitmap, i10, i11);
        p.g(d10, "circleCrop(pool, toTransform, outWidth, outHeight)");
        return d(d10, this.f60227b, this.f60228c);
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth() + (i10 * 2);
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = i10;
        canvas.drawBitmap(bitmap, f10, f10, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10);
        paint.setAntiAlias(true);
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getWidth() / 2, (canvas.getWidth() / 2) - (i10 / 2), paint);
        bitmap.recycle();
        p.g(createBitmap, "dstBitmap");
        return createBitmap;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    @Override // m7.e
    public int hashCode() {
        return 498878481;
    }
}
