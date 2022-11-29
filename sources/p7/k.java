package p7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements e {

    /* renamed from: k  reason: collision with root package name */
    public static final Bitmap.Config f46195k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final l f46196a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f46197b;

    /* renamed from: c  reason: collision with root package name */
    public final long f46198c;

    /* renamed from: d  reason: collision with root package name */
    public final a f46199d;

    /* renamed from: e  reason: collision with root package name */
    public long f46200e;

    /* renamed from: f  reason: collision with root package name */
    public long f46201f;

    /* renamed from: g  reason: collision with root package name */
    public int f46202g;

    /* renamed from: h  reason: collision with root package name */
    public int f46203h;

    /* renamed from: i  reason: collision with root package name */
    public int f46204i;

    /* renamed from: j  reason: collision with root package name */
    public int f46205j;

    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    public static final class b implements a {
        @Override // p7.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // p7.k.a
        public void b(Bitmap bitmap) {
        }
    }

    public k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f46198c = j10;
        this.f46200e = j10;
        this.f46196a = lVar;
        this.f46197b = set;
        this.f46199d = new b();
    }

    @TargetApi(26)
    public static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    public static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f46195k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            hashSet.add(null);
        }
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static l l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new n();
        }
        return new c();
    }

    @TargetApi(19)
    public static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    public static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    @Override // p7.e
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // p7.e
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // p7.e
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f46196a.f(bitmap) <= this.f46200e && this.f46197b.contains(bitmap.getConfig())) {
                        int f10 = this.f46196a.f(bitmap);
                        this.f46196a.c(bitmap);
                        this.f46199d.b(bitmap);
                        this.f46204i++;
                        this.f46201f += f10;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f46196a.a(bitmap));
                        }
                        h();
                        j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f46196a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f46197b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p7.e
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 != null) {
            m10.eraseColor(0);
            return m10;
        }
        return g(i10, i11, config);
    }

    @Override // p7.e
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public final void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    public final void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f46202g + ", misses=" + this.f46203h + ", puts=" + this.f46204i + ", evictions=" + this.f46205j + ", currentSize=" + this.f46201f + ", maxSize=" + this.f46200e + "\nStrategy=" + this.f46196a);
    }

    public final void j() {
        q(this.f46200e);
    }

    public final synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        f(config);
        d10 = this.f46196a.d(i10, i11, config != null ? config : f46195k);
        if (d10 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f46196a.e(i10, i11, config));
            }
            this.f46203h++;
        } else {
            this.f46202g++;
            this.f46201f -= this.f46196a.f(d10);
            this.f46199d.a(d10);
            p(d10);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f46196a.e(i10, i11, config));
        }
        h();
        return d10;
    }

    public long n() {
        return this.f46200e;
    }

    public final synchronized void q(long j10) {
        while (this.f46201f > j10) {
            Bitmap b10 = this.f46196a.b();
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f46201f = 0L;
                return;
            }
            this.f46199d.a(b10);
            this.f46201f -= this.f46196a.f(b10);
            this.f46205j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f46196a.a(b10));
            }
            h();
            b10.recycle();
        }
    }

    public k(long j10) {
        this(j10, l(), k());
    }
}
