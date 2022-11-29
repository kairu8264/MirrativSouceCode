package o6;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import b6.a;
import e6.b;
import ep.u;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import xn.a0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f44095a;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f44096b;

    /* renamed from: c  reason: collision with root package name */
    public static final ep.u f44097c;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44098a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f44099b;

        static {
            int[] iArr = new int[a6.d.values().length];
            iArr[a6.d.MEMORY_CACHE.ordinal()] = 1;
            iArr[a6.d.MEMORY.ordinal()] = 2;
            iArr[a6.d.DISK.ordinal()] = 3;
            iArr[a6.d.NETWORK.ordinal()] = 4;
            f44098a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            f44099b = iArr2;
        }
    }

    static {
        Bitmap.Config config;
        int i10 = Build.VERSION.SDK_INT;
        f44095a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f44096b = config;
        f44097c = new u.a().g();
    }

    public static final void a(a.b bVar) {
        try {
            bVar.h();
        } catch (Exception unused) {
        }
    }

    public static final int b(Context context, double d10) {
        int i10;
        try {
            Object j10 = c3.a.j(context, ActivityManager.class);
            jo.p.e(j10);
            ActivityManager activityManager = (ActivityManager) j10;
            i10 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i10 = 256;
        }
        double d11 = 1024;
        return (int) (d10 * i10 * d11 * d11);
    }

    public static final void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double d(Context context) {
        try {
            Object j10 = c3.a.j(context, ActivityManager.class);
            jo.p.e(j10);
            return ((ActivityManager) j10).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config e() {
        return f44096b;
    }

    public static final String f(a6.d dVar) {
        int i10 = a.f44098a[dVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "☁️ ";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "💾";
    }

    public static final x5.c g(b.a aVar) {
        return aVar instanceof e6.c ? ((e6.c) aVar).f() : x5.c.f59706b;
    }

    public static final String h(Uri uri) {
        return (String) a0.Z(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        Integer num = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            num = Integer.valueOf(bitmap.getHeight());
        }
        return num == null ? drawable.getIntrinsicHeight() : num.intValue();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || so.n.r(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(so.o.D0(so.o.E0(so.o.K0(so.o.K0(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final j6.s l(View view) {
        int i10 = y5.a.coil_request_manager;
        Object tag = view.getTag(i10);
        j6.s sVar = tag instanceof j6.s ? (j6.s) tag : null;
        if (sVar == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i10);
                j6.s sVar2 = tag2 instanceof j6.s ? (j6.s) tag2 : null;
                if (sVar2 == null) {
                    sVar = new j6.s(view);
                    view.addOnAttachStateChangeListener(sVar);
                    view.setTag(i10, sVar);
                } else {
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final k6.g n(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f44099b[scaleType.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            return k6.g.FILL;
        }
        return k6.g.FIT;
    }

    public static final Bitmap.Config[] o() {
        return f44095a;
    }

    public static final int p(Drawable drawable) {
        Bitmap bitmap;
        Integer num = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            num = Integer.valueOf(bitmap.getWidth());
        }
        return num == null ? drawable.getIntrinsicWidth() : num.intValue();
    }

    public static final boolean q(Uri uri) {
        return jo.p.c(uri.getScheme(), "file") && jo.p.c(h(uri), "android_asset");
    }

    public static final boolean r() {
        return jo.p.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean t(b.a aVar) {
        return (aVar instanceof e6.c) && ((e6.c) aVar).i();
    }

    public static final boolean u(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof h5.i);
    }

    public static final ep.u v(ep.u uVar) {
        return uVar == null ? f44097c : uVar;
    }

    public static final j6.n w(j6.n nVar) {
        return nVar == null ? j6.n.f37221y : nVar;
    }

    public static final j6.q x(j6.q qVar) {
        return qVar == null ? j6.q.f37237c : qVar;
    }

    public static final int y(String str, int i10) {
        Long k10 = so.m.k(str);
        if (k10 == null) {
            return i10;
        }
        long longValue = k10.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }
}
