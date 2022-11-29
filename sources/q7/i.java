package q7;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f48766a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48767b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f48768c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48769d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final int f48770i;

        /* renamed from: a  reason: collision with root package name */
        public final Context f48771a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f48772b;

        /* renamed from: c  reason: collision with root package name */
        public c f48773c;

        /* renamed from: e  reason: collision with root package name */
        public float f48775e;

        /* renamed from: d  reason: collision with root package name */
        public float f48774d = 2.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f48776f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        public float f48777g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        public int f48778h = 4194304;

        static {
            f48770i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f48775e = f48770i;
            this.f48771a = context;
            this.f48772b = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.f48773c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f48772b)) {
                return;
            }
            this.f48775e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f48779a;

        public b(DisplayMetrics displayMetrics) {
            this.f48779a = displayMetrics;
        }

        @Override // q7.i.c
        public int a() {
            return this.f48779a.heightPixels;
        }

        @Override // q7.i.c
        public int b() {
            return this.f48779a.widthPixels;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();
    }

    public i(a aVar) {
        int i10;
        this.f48768c = aVar.f48771a;
        if (e(aVar.f48772b)) {
            i10 = aVar.f48778h / 2;
        } else {
            i10 = aVar.f48778h;
        }
        this.f48769d = i10;
        int c10 = c(aVar.f48772b, aVar.f48776f, aVar.f48777g);
        float b10 = aVar.f48773c.b() * aVar.f48773c.a() * 4;
        int round = Math.round(aVar.f48775e * b10);
        int round2 = Math.round(b10 * aVar.f48774d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f48767b = round2;
            this.f48766a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f48775e;
            float f12 = aVar.f48774d;
            float f13 = f10 / (f11 + f12);
            this.f48767b = Math.round(f12 * f13);
            this.f48766a = Math.round(f13 * aVar.f48775e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f48767b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f48766a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > c10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f48772b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f48772b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    public static int c(ActivityManager activityManager, float f10, float f11) {
        boolean e10 = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e10) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    public int a() {
        return this.f48769d;
    }

    public int b() {
        return this.f48766a;
    }

    public int d() {
        return this.f48767b;
    }

    public final String f(int i10) {
        return Formatter.formatFileSize(this.f48768c, i10);
    }
}
