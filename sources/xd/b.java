package xd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import jo.h;
import jo.p;
import m7.e;
import v7.a0;
import v7.f;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f60229f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f60230g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f60231h;

    /* renamed from: b  reason: collision with root package name */
    public final float f60232b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60233c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f60234d = new Path();

    /* renamed from: e  reason: collision with root package name */
    public final Paint f60235e;

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
        byte[] bytes = "com.dena.mirrorman.customtransformation.EmomoDressUpIconTransformation.1".getBytes(charset);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        f60231h = bytes;
    }

    public b(float f10, int i10) {
        this.f60232b = f10;
        this.f60233c = i10;
        Paint paint = new Paint();
        paint.setColor(i10);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f60235e = paint;
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        p.h(messageDigest, "messageDigest");
        messageDigest.update(f60231h);
    }

    @Override // v7.f
    public Bitmap c(p7.e eVar, Bitmap bitmap, int i10, int i11) {
        p.h(eVar, "pool");
        p.h(bitmap, "toTransform");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f60234d.reset();
        float f10 = i11;
        float f11 = f10 / 2.0f;
        this.f60234d.addCircle(f11, f11, f11, Path.Direction.CW);
        float f12 = i10;
        this.f60234d.addRect(f11, 0.0f, f12, f10, Path.Direction.CW);
        canvas.drawPath(this.f60234d, this.f60235e);
        this.f60234d.reset();
        this.f60234d.addCircle(f11, f11, f11 - this.f60232b, Path.Direction.CW);
        Path path = this.f60234d;
        float f13 = this.f60232b;
        path.addRect(f11, f13, f12, f10 - f13, Path.Direction.CW);
        this.f60234d.close();
        canvas.clipPath(this.f60234d);
        float f14 = this.f60232b;
        Bitmap b10 = a0.b(eVar, bitmap, (int) (f12 - f14), (int) (f10 - (f14 * 2)));
        float f15 = this.f60232b;
        canvas.drawBitmap(b10, f15, f15, (Paint) null);
        b10.recycle();
        p.g(createBitmap, "dstBitmap");
        return createBitmap;
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        return obj instanceof xd.a;
    }

    @Override // m7.e
    public int hashCode() {
        return -1742095422;
    }
}
