package v7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import v7.l;
import v7.s;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final m7.g<m7.b> f56867f = m7.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", m7.b.DEFAULT);

    /* renamed from: g  reason: collision with root package name */
    public static final m7.g<m7.i> f56868g = m7.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", m7.i.SRGB);
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final m7.g<l> f56869h = l.f56865h;

    /* renamed from: i  reason: collision with root package name */
    public static final m7.g<Boolean> f56870i;

    /* renamed from: j  reason: collision with root package name */
    public static final m7.g<Boolean> f56871j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<String> f56872k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f56873l;

    /* renamed from: m  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f56874m;

    /* renamed from: n  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f56875n;

    /* renamed from: a  reason: collision with root package name */
    public final p7.e f56876a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f56877b;

    /* renamed from: c  reason: collision with root package name */
    public final p7.b f56878c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f56879d;

    /* renamed from: e  reason: collision with root package name */
    public final r f56880e = r.b();

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // v7.m.b
        public void a() {
        }

        @Override // v7.m.b
        public void b(p7.e eVar, Bitmap bitmap) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(p7.e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f56870i = m7.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f56871j = m7.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f56872k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f56873l = new a();
        f56874m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f56875n = i8.k.f(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, p7.e eVar, p7.b bVar) {
        this.f56879d = list;
        this.f56877b = (DisplayMetrics) i8.j.d(displayMetrics);
        this.f56876a = (p7.e) i8.j.d(eVar);
        this.f56878c = (p7.b) i8.j.d(bVar);
    }

    public static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(l10 * d10);
        return x((d10 / (x10 / l10)) * x10);
    }

    public static void c(ImageHeaderParser.ImageType imageType, s sVar, b bVar, p7.e eVar, l lVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int min;
        int i17;
        int floor;
        double floor2;
        int i18;
        if (i11 > 0 && i12 > 0) {
            if (r(i10)) {
                i16 = i11;
                i15 = i12;
            } else {
                i15 = i11;
                i16 = i12;
            }
            float b10 = lVar.b(i15, i16, i13, i14);
            if (b10 > 0.0f) {
                l.g a10 = lVar.a(i15, i16, i13, i14);
                if (a10 != null) {
                    float f10 = i15;
                    float f11 = i16;
                    int x10 = i15 / x(b10 * f10);
                    int x11 = i16 / x(b10 * f11);
                    l.g gVar = l.g.MEMORY;
                    if (a10 == gVar) {
                        min = Math.max(x10, x11);
                    } else {
                        min = Math.min(x10, x11);
                    }
                    int i19 = Build.VERSION.SDK_INT;
                    if (i19 > 23 || !f56872k.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        if (a10 == gVar && max < 1.0f / b10) {
                            max <<= 1;
                        }
                        i17 = max;
                    } else {
                        i17 = 1;
                    }
                    options.inSampleSize = i17;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i17, 8);
                        floor = (int) Math.ceil(f10 / min2);
                        i18 = (int) Math.ceil(f11 / min2);
                        int i20 = i17 / 8;
                        if (i20 > 0) {
                            floor /= i20;
                            i18 /= i20;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                                if (i19 >= 24) {
                                    float f12 = i17;
                                    floor = Math.round(f10 / f12);
                                    i18 = Math.round(f11 / f12);
                                } else {
                                    float f13 = i17;
                                    floor = (int) Math.floor(f10 / f13);
                                    floor2 = Math.floor(f11 / f13);
                                }
                            } else if (i15 % i17 == 0 && i16 % i17 == 0) {
                                floor = i15 / i17;
                                i18 = i16 / i17;
                            } else {
                                int[] m10 = m(sVar, options, bVar, eVar);
                                floor = m10[0];
                                i18 = m10[1];
                            }
                        } else {
                            float f14 = i17;
                            floor = (int) Math.floor(f10 / f14);
                            floor2 = Math.floor(f11 / f14);
                        }
                        i18 = (int) floor2;
                    }
                    double b11 = lVar.b(floor, i18, i13, i14);
                    if (i19 >= 19) {
                        options.inTargetDensity = a(b11);
                        options.inDensity = l(b11);
                    }
                    if (s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + floor + "x" + i18 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + i17 + ", adjusted scale factor: " + b11 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + lVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
        }
    }

    public static Bitmap i(s sVar, BitmapFactory.Options options, b bVar, p7.e eVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.a();
            sVar.b();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        a0.i().lock();
        try {
            try {
                Bitmap a10 = sVar.a(options);
                a0.i().unlock();
                return a10;
            } catch (IllegalArgumentException e10) {
                IOException u10 = u(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u10);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        eVar.c(bitmap);
                        options.inBitmap = null;
                        Bitmap i12 = i(sVar, options, bVar, eVar);
                        a0.i().unlock();
                        return i12;
                    } catch (IOException unused) {
                        throw u10;
                    }
                }
                throw u10;
            }
        } catch (Throwable th2) {
            a0.i().unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    public static String j(Bitmap bitmap) {
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

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (m.class) {
            Queue<BitmapFactory.Options> queue = f56875n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    public static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] m(s sVar, BitmapFactory.Options options, b bVar, p7.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    public static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    public static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + i8.f.a(j10));
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f56875n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    public static void y(BitmapFactory.Options options, p7.e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.e(i10, i11, config);
    }

    public final void b(s sVar, m7.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (this.f56880e.i(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar != m7.b.PREFER_ARGB_8888 && Build.VERSION.SDK_INT != 16) {
            boolean z12 = false;
            try {
                z12 = sVar.d().hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                }
            }
            Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    public o7.u<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, m7.h hVar) throws IOException {
        return g(new s.b(parcelFileDescriptor, this.f56879d, this.f56878c), i10, i11, hVar, f56873l);
    }

    public o7.u<Bitmap> e(InputStream inputStream, int i10, int i11, m7.h hVar) throws IOException {
        return f(inputStream, i10, i11, hVar, f56873l);
    }

    public o7.u<Bitmap> f(InputStream inputStream, int i10, int i11, m7.h hVar, b bVar) throws IOException {
        return g(new s.a(inputStream, this.f56879d, this.f56878c), i10, i11, hVar, bVar);
    }

    public final o7.u<Bitmap> g(s sVar, int i10, int i11, m7.h hVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f56878c.c(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        m7.b bVar2 = (m7.b) hVar.c(f56867f);
        m7.i iVar = (m7.i) hVar.c(f56868g);
        l lVar = (l) hVar.c(l.f56865h);
        boolean booleanValue = ((Boolean) hVar.c(f56870i)).booleanValue();
        m7.g<Boolean> gVar = f56871j;
        try {
            return e.f(h(sVar, k10, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f56876a);
        } finally {
            v(k10);
            this.f56878c.e(bArr);
        }
    }

    public final Bitmap h(s sVar, BitmapFactory.Options options, l lVar, m7.b bVar, m7.i iVar, boolean z10, int i10, int i11, boolean z11, b bVar2) throws IOException {
        int i12;
        int i13;
        int i14;
        m mVar;
        int round;
        int round2;
        int i15;
        ColorSpace colorSpace;
        long b10 = i8.f.b();
        int[] m10 = m(sVar, options, bVar2, this.f56876a);
        boolean z12 = false;
        int i16 = m10[0];
        int i17 = m10[1];
        String str = options.outMimeType;
        boolean z13 = (i16 == -1 || i17 == -1) ? false : z10;
        int c10 = sVar.c();
        int j10 = a0.j(c10);
        boolean m11 = a0.m(c10);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(j10) ? i17 : i16;
        } else {
            i12 = i11;
            i13 = i10;
        }
        if (i12 == Integer.MIN_VALUE) {
            i14 = r(j10) ? i16 : i17;
        } else {
            i14 = i12;
        }
        ImageHeaderParser.ImageType d10 = sVar.d();
        c(d10, sVar, bVar2, this.f56876a, lVar, j10, i16, i17, i13, i14, options);
        b(sVar, bVar, z13, m11, options, i13, i14);
        int i18 = Build.VERSION.SDK_INT;
        boolean z14 = i18 >= 19;
        if (options.inSampleSize == 1 || z14) {
            mVar = this;
            if (mVar.z(d10)) {
                if (i16 < 0 || i17 < 0 || !z11 || !z14) {
                    float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i19 = options.inSampleSize;
                    float f11 = i19;
                    float f12 = f10;
                    round = Math.round(((int) Math.ceil(i16 / f11)) * f12);
                    round2 = Math.round(((int) Math.ceil(i17 / f11)) * f12);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i16 + "x" + i17 + "], sampleSize: " + i19 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f12);
                    }
                } else {
                    round = i13;
                    round2 = i14;
                }
                if (round > 0 && round2 > 0) {
                    y(options, mVar.f56876a, round, round2);
                }
            }
        } else {
            mVar = this;
        }
        if (i18 >= 28) {
            if (iVar == m7.i.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z12 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z12 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i18 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i20 = i(sVar, options, bVar2, mVar.f56876a);
        bVar2.b(mVar.f56876a, i20);
        if (Log.isLoggable("Downsampler", 2)) {
            i15 = c10;
            t(i16, i17, str, options, i20, i10, i11, b10);
        } else {
            i15 = c10;
        }
        Bitmap bitmap = null;
        if (i20 != null) {
            i20.setDensity(mVar.f56877b.densityDpi);
            bitmap = a0.n(mVar.f56876a, i20, i15);
            if (!i20.equals(bitmap)) {
                mVar.f56876a.c(i20);
            }
        }
        return bitmap;
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f56874m.contains(imageType);
    }
}
