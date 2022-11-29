package v7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f56885g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f56886h;

    /* renamed from: i  reason: collision with root package name */
    public static final File f56887i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile r f56888j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f56889k;

    /* renamed from: b  reason: collision with root package name */
    public final int f56891b;

    /* renamed from: c  reason: collision with root package name */
    public final int f56892c;

    /* renamed from: d  reason: collision with root package name */
    public int f56893d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f56894e = true;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f56895f = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f56890a = f();

    static {
        int i10 = Build.VERSION.SDK_INT;
        f56885g = i10 < 29;
        f56886h = i10 >= 26;
        f56887i = new File("/proc/self/fd");
        f56889k = -1;
    }

    public r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f56891b = 20000;
            this.f56892c = 0;
            return;
        }
        this.f56891b = 700;
        this.f56892c = 128;
    }

    public static r b() {
        if (f56888j == null) {
            synchronized (r.class) {
                if (f56888j == null) {
                    f56888j = new r();
                }
            }
        }
        return f56888j;
    }

    public static boolean f() {
        return (g() || h()) ? false : true;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public final boolean a() {
        return f56885g && !this.f56895f.get();
    }

    public final int c() {
        if (f56889k != -1) {
            return f56889k;
        }
        return this.f56891b;
    }

    public final synchronized boolean d() {
        boolean z10 = true;
        int i10 = this.f56893d + 1;
        this.f56893d = i10;
        if (i10 >= 50) {
            this.f56893d = 0;
            int length = f56887i.list().length;
            long c10 = c();
            if (length >= c10) {
                z10 = false;
            }
            this.f56894e = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c10);
            }
        }
        return this.f56894e;
    }

    public boolean e(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f56890a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f56886h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i12 = this.f56892c;
            if (i10 < i12) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i11 < i12) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (d()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    @TargetApi(26)
    public boolean i(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean e10 = e(i10, i11, z10, z11);
        if (e10) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e10;
    }

    public void j() {
        i8.k.b();
        this.f56895f.set(true);
    }
}
