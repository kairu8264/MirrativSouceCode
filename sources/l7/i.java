package l7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import i7.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i implements i7.a {

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f39622a;

    /* renamed from: b  reason: collision with root package name */
    public WebpImage f39623b;

    /* renamed from: c  reason: collision with root package name */
    public final a.InterfaceC0463a f39624c;

    /* renamed from: d  reason: collision with root package name */
    public int f39625d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f39626e;

    /* renamed from: f  reason: collision with root package name */
    public final k7.a[] f39627f;

    /* renamed from: g  reason: collision with root package name */
    public int f39628g;

    /* renamed from: h  reason: collision with root package name */
    public int f39629h;

    /* renamed from: i  reason: collision with root package name */
    public int f39630i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f39631j;

    /* renamed from: k  reason: collision with root package name */
    public o f39632k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap.Config f39633l;

    /* renamed from: m  reason: collision with root package name */
    public final LruCache<Integer, Bitmap> f39634m;

    /* loaded from: classes.dex */
    public class a extends LruCache<Integer, Bitmap> {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public void entryRemoved(boolean z10, Integer num, Bitmap bitmap, Bitmap bitmap2) {
            if (bitmap != null) {
                i.this.f39624c.a(bitmap);
            }
        }
    }

    public i(a.InterfaceC0463a interfaceC0463a, WebpImage webpImage, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0463a, webpImage, byteBuffer, i10, o.f39650c);
    }

    @Override // i7.a
    public void a() {
        this.f39625d = (this.f39625d + 1) % this.f39623b.getFrameCount();
    }

    @Override // i7.a
    public int b() {
        return this.f39623b.getFrameCount();
    }

    @Override // i7.a
    public void c(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            this.f39633l = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888);
    }

    @Override // i7.a
    public void clear() {
        this.f39623b.dispose();
        this.f39623b = null;
        this.f39634m.evictAll();
        this.f39622a = null;
    }

    @Override // i7.a
    public int d() {
        int i10;
        if (this.f39626e.length == 0 || (i10 = this.f39625d) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // i7.a
    public void e() {
        this.f39625d = -1;
    }

    @Override // i7.a
    public ByteBuffer f() {
        return this.f39622a;
    }

    @Override // i7.a
    public int g() {
        return this.f39625d;
    }

    @Override // i7.a
    public Bitmap getNextFrame() {
        Bitmap bitmap;
        int g10 = g();
        Bitmap c10 = this.f39624c.c(this.f39630i, this.f39629h, Bitmap.Config.ARGB_8888);
        c10.eraseColor(0);
        if (Build.VERSION.SDK_INT >= 24) {
            c10.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        }
        Canvas canvas = new Canvas(c10);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!this.f39632k.c() && (bitmap = this.f39634m.get(Integer.valueOf(g10))) != null) {
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "hit frame bitmap from memory cache, frameNumber=" + g10);
            }
            bitmap.setDensity(canvas.getDensity());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return c10;
        }
        int p10 = !o(g10) ? p(g10 - 1, canvas) : g10;
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "frameNumber=" + g10 + ", nextIndex=" + p10);
        }
        while (p10 < g10) {
            k7.a aVar = this.f39627f[p10];
            if (!aVar.f38460g) {
                k(canvas, aVar);
            }
            q(p10, canvas);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "renderFrame, index=" + p10 + ", blend=" + aVar.f38460g + ", dispose=" + aVar.f38461h);
            }
            if (aVar.f38461h) {
                k(canvas, aVar);
            }
            p10++;
        }
        k7.a aVar2 = this.f39627f[g10];
        if (!aVar2.f38460g) {
            k(canvas, aVar2);
        }
        q(g10, canvas);
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "renderFrame, index=" + g10 + ", blend=" + aVar2.f38460g + ", dispose=" + aVar2.f38461h);
        }
        j(g10, c10);
        return c10;
    }

    @Override // i7.a
    public int h() {
        return this.f39623b.getSizeInBytes();
    }

    public final void j(int i10, Bitmap bitmap) {
        this.f39634m.remove(Integer.valueOf(i10));
        Bitmap c10 = this.f39624c.c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        c10.eraseColor(0);
        c10.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(c10);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f39634m.put(Integer.valueOf(i10), c10);
    }

    public final void k(Canvas canvas, k7.a aVar) {
        int i10 = aVar.f38455b;
        int i11 = this.f39628g;
        int i12 = aVar.f38456c;
        canvas.drawRect(i10 / i11, i12 / i11, (i10 + aVar.f38457d) / i11, (i12 + aVar.f38458e) / i11, this.f39631j);
    }

    public o l() {
        return this.f39632k;
    }

    public int m(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f39626e;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
        }
        return -1;
    }

    public final boolean n(k7.a aVar) {
        return aVar.f38455b == 0 && aVar.f38456c == 0 && aVar.f38457d == this.f39623b.getWidth() && aVar.f38458e == this.f39623b.getHeight();
    }

    public final boolean o(int i10) {
        if (i10 == 0) {
            return true;
        }
        k7.a[] aVarArr = this.f39627f;
        k7.a aVar = aVarArr[i10];
        k7.a aVar2 = aVarArr[i10 - 1];
        if (aVar.f38460g || !n(aVar)) {
            return aVar2.f38461h && n(aVar2);
        }
        return true;
    }

    public final int p(int i10, Canvas canvas) {
        while (i10 >= 0) {
            k7.a aVar = this.f39627f[i10];
            if (aVar.f38461h && n(aVar)) {
                return i10 + 1;
            }
            Bitmap bitmap = this.f39634m.get(Integer.valueOf(i10));
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.setDensity(canvas.getDensity());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (aVar.f38461h) {
                    k(canvas, aVar);
                }
                return i10 + 1;
            } else if (o(i10)) {
                return i10;
            } else {
                i10--;
            }
        }
        return 0;
    }

    public final void q(int i10, Canvas canvas) {
        k7.a aVar = this.f39627f[i10];
        int i11 = aVar.f38457d;
        int i12 = this.f39628g;
        int i13 = i11 / i12;
        int i14 = aVar.f38458e / i12;
        int i15 = aVar.f38455b / i12;
        int i16 = aVar.f38456c / i12;
        WebpFrame frame = this.f39623b.getFrame(i10);
        try {
            try {
                Bitmap c10 = this.f39624c.c(i13, i14, this.f39633l);
                c10.eraseColor(0);
                c10.setDensity(canvas.getDensity());
                frame.renderFrame(i13, i14, c10);
                canvas.drawBitmap(c10, i15, i16, (Paint) null);
                this.f39624c.a(c10);
            } catch (IllegalStateException unused) {
                Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i10);
            }
        } finally {
            frame.dispose();
        }
    }

    public void r(i7.c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f39622a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f39628g = highestOneBit;
            this.f39630i = this.f39623b.getWidth() / highestOneBit;
            this.f39629h = this.f39623b.getHeight() / highestOneBit;
            return;
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
    }

    public i(a.InterfaceC0463a interfaceC0463a, WebpImage webpImage, ByteBuffer byteBuffer, int i10, o oVar) {
        int max;
        this.f39625d = -1;
        this.f39633l = Bitmap.Config.ARGB_8888;
        this.f39624c = interfaceC0463a;
        this.f39623b = webpImage;
        this.f39626e = webpImage.getFrameDurations();
        this.f39627f = new k7.a[webpImage.getFrameCount()];
        for (int i11 = 0; i11 < this.f39623b.getFrameCount(); i11++) {
            this.f39627f[i11] = this.f39623b.getFrameInfo(i11);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.f39627f[i11].toString());
            }
        }
        this.f39632k = oVar;
        Paint paint = new Paint();
        this.f39631j = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        if (this.f39632k.a()) {
            max = webpImage.getFrameCount();
        } else {
            max = Math.max(5, this.f39632k.b());
        }
        this.f39634m = new a(max);
        r(new i7.c(), byteBuffer, i10);
    }
}
