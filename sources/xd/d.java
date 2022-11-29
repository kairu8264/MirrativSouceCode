package xd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import jo.h;
import jo.p;
import m7.e;
import v7.a0;
import v7.f;
import wn.v;

/* loaded from: classes2.dex */
public final class d extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f60239e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f60240f;

    /* renamed from: b  reason: collision with root package name */
    public final int f60241b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60242c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60243d;

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
        byte[] bytes = "com.bumptech.glide.load.resource.bitmap.RoundBorderTransformation.1".getBytes(charset);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        f60240f = bytes;
    }

    public d(int i10, int i11, int i12) {
        this.f60241b = i10;
        this.f60242c = i11;
        this.f60243d = i12;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        p.h(messageDigest, "messageDigest");
        messageDigest.update(f60240f);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        p.h(eVar, "pool");
        p.h(bitmap, "toTransform");
        Bitmap o10 = a0.o(eVar, bitmap, this.f60241b);
        p.g(o10, "roundedCorners(pool, toTransform, radius)");
        return d(o10, this.f60241b, this.f60242c, this.f60243d);
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, int i12) {
        int i13 = i11 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i13, bitmap.getHeight() + i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        float f10 = i10;
        Paint paint = new Paint();
        paint.setColor(i12);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        v vVar = v.f59242a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        float f11 = i11;
        canvas.drawBitmap(bitmap, f11, f11, (Paint) null);
        bitmap.recycle();
        p.g(createBitmap, "dstBitmap");
        return createBitmap;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof d;
    }

    @Override // m7.e
    public int hashCode() {
        return 845499549;
    }
}
