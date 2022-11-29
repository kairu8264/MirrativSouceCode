package of;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f45389a = new e();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f45390a;

        /* renamed from: b  reason: collision with root package name */
        public int f45391b;

        /* renamed from: c  reason: collision with root package name */
        public int f45392c;

        /* renamed from: d  reason: collision with root package name */
        public float f45393d;

        public a(int i10, int i11, int i12, float f10) {
            this.f45390a = i10;
            this.f45391b = i11;
            this.f45392c = i12;
            this.f45393d = f10;
        }

        public final int a() {
            return this.f45392c;
        }

        public final int b() {
            return this.f45391b;
        }

        public final float c() {
            return this.f45391b / this.f45393d;
        }

        public final int d() {
            return this.f45390a;
        }

        public final float e() {
            return this.f45390a / this.f45393d;
        }
    }

    public static final int a(Context context) {
        jo.p.h(context, "context");
        Resources resources = context.getResources();
        e eVar = f45389a;
        jo.p.g(resources, "res");
        if (eVar.e(context, resources)) {
            if (eVar.f(resources)) {
                return 80;
            }
            a c10 = c(context);
            return Math.min(c10.e(), c10.c()) >= 600.0f ? 80 : 8388613;
        }
        return 0;
    }

    public static final int b(Context context) {
        jo.p.h(context, "context");
        Resources resources = context.getResources();
        e eVar = f45389a;
        jo.p.g(resources, "res");
        if (eVar.e(context, resources)) {
            String str = "navigation_bar_height";
            if (!eVar.f(resources)) {
                str = "navigation_bar_height_landscape";
            }
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier == 0) {
                return 0;
            }
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final a c(Context context) {
        jo.p.h(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("display");
        jo.p.f(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        ((DisplayManager) systemService).getDisplay(0).getRealMetrics(displayMetrics);
        return new a(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi, displayMetrics.density);
    }

    public static final int d(Context context) {
        jo.p.h(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public final boolean e(Context context, Resources resources) {
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier != 0) {
            return resources.getBoolean(identifier);
        }
        return !ViewConfiguration.get(context).hasPermanentMenuKey();
    }

    public final boolean f(Resources resources) {
        return resources.getConfiguration().orientation == 1;
    }
}
