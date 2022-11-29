package l7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import com.bumptech.glide.integration.webp.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o7.u;
import v7.a0;
import v7.l;
import v7.m;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final m7.g<Boolean> f39636e = m7.g.f("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder", Boolean.FALSE);

    /* renamed from: f  reason: collision with root package name */
    public static final m.b f39637f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f39638g = i8.k.f(0);

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f39639a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f39640b;

    /* renamed from: c  reason: collision with root package name */
    public final p7.b f39641c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f39642d;

    /* loaded from: classes.dex */
    public static class a implements m.b {
        @Override // v7.m.b
        public void a() {
        }

        @Override // v7.m.b
        public void b(p7.e eVar, Bitmap bitmap) throws IOException {
        }
    }

    public j(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, p7.e eVar, p7.b bVar) {
        this.f39642d = list;
        this.f39640b = (DisplayMetrics) i8.j.d(displayMetrics);
        this.f39639a = (p7.e) i8.j.d(eVar);
        this.f39641c = (p7.b) i8.j.d(bVar);
    }

    public static int a(double d10) {
        int s10 = s(1.0E9d * d10);
        return s((d10 / (s10 / 1.0E9f)) * s10);
    }

    public static void c(ImageHeaderParser.ImageType imageType, InputStream inputStream, m.b bVar, p7.e eVar, v7.l lVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        float b10;
        int min;
        int floor;
        double floor2;
        int i15;
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        if (i10 != 90 && i10 != 270) {
            b10 = lVar.b(i11, i12, i13, i14);
        } else {
            b10 = lVar.b(i12, i11, i13, i14);
        }
        if (b10 > 0.0f) {
            l.g a10 = lVar.a(i11, i12, i13, i14);
            if (a10 != null) {
                float f10 = i11;
                float f11 = i12;
                int s10 = i11 / s(b10 * f10);
                int s11 = i12 / s(b10 * f11);
                l.g gVar = l.g.MEMORY;
                if (a10 == gVar) {
                    min = Math.max(s10, s11);
                } else {
                    min = Math.min(s10, s11);
                }
                int max = Math.max(1, Integer.highestOneBit(min));
                if (a10 == gVar && max < 1.0f / b10) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (imageType == ImageHeaderParser.ImageType.JPEG) {
                    float min2 = Math.min(max, 8);
                    floor = (int) Math.ceil(f10 / min2);
                    i15 = (int) Math.ceil(f11 / min2);
                    int i16 = max / 8;
                    if (i16 > 0) {
                        floor /= i16;
                        i15 /= i16;
                    }
                } else {
                    if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                        if (imageType != ImageHeaderParser.ImageType.WEBP && imageType != ImageHeaderParser.ImageType.WEBP_A) {
                            if (i11 % max == 0 && i12 % max == 0) {
                                floor = i11 / max;
                                i15 = i12 / max;
                            } else {
                                int[] j10 = j(inputStream, options, bVar, eVar);
                                floor = j10[0];
                                i15 = j10[1];
                            }
                        } else if (Build.VERSION.SDK_INT >= 24) {
                            float f12 = max;
                            floor = Math.round(f10 / f12);
                            i15 = Math.round(f11 / f12);
                        } else {
                            float f13 = max;
                            floor = (int) Math.floor(f10 / f13);
                            floor2 = Math.floor(f11 / f13);
                        }
                    } else {
                        float f14 = max;
                        floor = (int) Math.floor(f10 / f14);
                        floor2 = Math.floor(f11 / f14);
                    }
                    i15 = (int) floor2;
                }
                double b11 = lVar.b(floor, i15, i13, i14);
                if (Build.VERSION.SDK_INT >= 19) {
                    options.inTargetDensity = a(b11);
                    options.inDensity = 1000000000;
                }
                if (n(options)) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    Log.v("WebpDownsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + i15 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b11 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + lVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
    }

    public static Bitmap g(InputStream inputStream, BitmapFactory.Options options, m.b bVar, p7.e eVar) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            bVar.a();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        a0.i().lock();
        try {
            try {
                Bitmap decodeStream = WebpBitmapFactory.decodeStream(inputStream, null, options);
                a0.i().unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return decodeStream;
            } catch (IllegalArgumentException e10) {
                IOException p10 = p(e10, i10, i11, str, options);
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", p10);
                }
                if (options.inBitmap != null) {
                    try {
                        inputStream.reset();
                        eVar.c(options.inBitmap);
                        options.inBitmap = null;
                        Bitmap g10 = g(inputStream, options, bVar, eVar);
                        a0.i().unlock();
                        return g10;
                    } catch (IOException unused) {
                        throw p10;
                    }
                }
                throw p10;
            }
        } catch (Throwable th2) {
            a0.i().unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    public static String h(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    public static synchronized BitmapFactory.Options i() {
        BitmapFactory.Options poll;
        synchronized (j.class) {
            Queue<BitmapFactory.Options> queue = f39638g;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                r(poll);
            }
        }
        return poll;
    }

    public static int[] j(InputStream inputStream, BitmapFactory.Options options, m.b bVar, p7.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        g(inputStream, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String k(BitmapFactory.Options options) {
        return h(options.inBitmap);
    }

    public static boolean n(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    public static void o(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("WebpDownsampler", "Decoded " + h(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + k(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + i8.f.a(j10));
    }

    public static IOException p(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + k(options), illegalArgumentException);
    }

    public static void q(BitmapFactory.Options options) {
        r(options);
        Queue<BitmapFactory.Options> queue = f39638g;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void r(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int s(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    public static void t(BitmapFactory.Options options, p7.e eVar, int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26 || options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            options.inBitmap = eVar.e(i10, i11, options.inPreferredConfig);
        }
    }

    public final void b(InputStream inputStream, m7.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) throws IOException {
        if (bVar != m7.b.PREFER_ARGB_8888 && Build.VERSION.SDK_INT != 16) {
            boolean z12 = false;
            try {
                z12 = com.bumptech.glide.load.a.e(this.f39642d, inputStream, this.f39641c).hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                }
            }
            Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ALPHA_8) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    public u<Bitmap> d(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        return e(inputStream, i10, i11, hVar, f39637f);
    }

    public u<Bitmap> e(InputStream inputStream, int i10, int i11, m7.h hVar, m.b bVar) throws IOException {
        i8.j.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f39641c.c(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        BitmapFactory.Options i12 = i();
        i12.inTempStorage = bArr;
        m7.b bVar2 = (m7.b) hVar.c(v7.m.f56867f);
        v7.l lVar = (v7.l) hVar.c(v7.m.f56869h);
        boolean booleanValue = ((Boolean) hVar.c(v7.m.f56870i)).booleanValue();
        m7.g<Boolean> gVar = v7.m.f56871j;
        try {
            return v7.e.f(f(inputStream, i12, lVar, bVar2, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f39639a);
        } finally {
            q(i12);
            this.f39641c.f(bArr, byte[].class);
        }
    }

    public final Bitmap f(InputStream inputStream, BitmapFactory.Options options, v7.l lVar, m7.b bVar, boolean z10, int i10, int i11, boolean z11, m.b bVar2) throws IOException {
        j jVar;
        int round;
        int round2;
        int i12;
        long b10 = i8.f.b();
        int[] j10 = j(inputStream, options, bVar2, this.f39639a);
        int i13 = j10[0];
        int i14 = j10[1];
        String str = options.outMimeType;
        boolean z12 = (i13 == -1 || i14 == -1) ? false : z10;
        int b11 = com.bumptech.glide.load.a.b(this.f39642d, inputStream, this.f39641c);
        int j11 = a0.j(b11);
        boolean m10 = a0.m(b11);
        int i15 = i10 == Integer.MIN_VALUE ? i13 : i10;
        int i16 = i11 == Integer.MIN_VALUE ? i14 : i11;
        ImageHeaderParser.ImageType e10 = com.bumptech.glide.load.a.e(this.f39642d, inputStream, this.f39641c);
        c(e10, inputStream, bVar2, this.f39639a, lVar, j11, i13, i14, i15, i16, options);
        b(inputStream, bVar, z12, m10, options, i15, i16);
        boolean z13 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z13) {
            jVar = this;
            if (jVar.u(e10)) {
                if (z11 && z13) {
                    round = i15;
                    round2 = i16;
                } else {
                    float f10 = n(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i17 = options.inSampleSize;
                    float f11 = i17;
                    round = Math.round(((int) Math.ceil(i13 / f11)) * f10);
                    round2 = Math.round(((int) Math.ceil(i14 / f11)) * f10);
                    if (Log.isLoggable("WebpDownsampler", 2)) {
                        Log.v("WebpDownsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i13 + "x" + i14 + "], sampleSize: " + i17 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f10);
                    }
                }
                if (round > 0 && round2 > 0) {
                    t(options, jVar.f39639a, round, round2);
                }
            }
        } else {
            jVar = this;
        }
        Bitmap g10 = g(inputStream, options, bVar2, jVar.f39639a);
        bVar2.b(jVar.f39639a, g10);
        if (Log.isLoggable("WebpDownsampler", 2)) {
            i12 = b11;
            o(i13, i14, str, options, g10, i10, i11, b10);
        } else {
            i12 = b11;
        }
        Bitmap bitmap = null;
        if (g10 != null) {
            g10.setDensity(jVar.f39640b.densityDpi);
            bitmap = a0.n(jVar.f39639a, g10, i12);
            if (!g10.equals(bitmap)) {
                jVar.f39639a.c(g10);
            }
        }
        return bitmap;
    }

    public boolean l(InputStream inputStream, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39636e)).booleanValue() || com.bumptech.glide.integration.webp.a.f20101a) {
            return false;
        }
        a.e b10 = com.bumptech.glide.integration.webp.a.b(inputStream, this.f39641c);
        return com.bumptech.glide.integration.webp.a.h(b10) && b10 != a.e.WEBP_SIMPLE;
    }

    public boolean m(ByteBuffer byteBuffer, m7.h hVar) throws IOException {
        if (((Boolean) hVar.c(f39636e)).booleanValue() || com.bumptech.glide.integration.webp.a.f20101a) {
            return false;
        }
        a.e c10 = com.bumptech.glide.integration.webp.a.c(byteBuffer);
        return com.bumptech.glide.integration.webp.a.h(c10) && c10 != a.e.WEBP_SIMPLE;
    }

    public final boolean u(ImageHeaderParser.ImageType imageType) throws IOException {
        return Build.VERSION.SDK_INT >= 19;
    }
}
