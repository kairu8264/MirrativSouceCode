package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import d.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f36987a;

    public a(Context context) {
        this.f36987a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f36987a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f36987a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f36987a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 <= 960 || i11 <= 720) {
            if (i10 <= 720 || i11 <= 960) {
                if (i10 < 500) {
                    if (i10 <= 640 || i11 <= 480) {
                        if (i10 <= 480 || i11 <= 640) {
                            return i10 >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f36987a.getResources().getDimensionPixelSize(d.d.f28674b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f36987a.obtainStyledAttributes(null, j.f28785a, d.a.f28616c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f28830j, 0);
        Resources resources = this.f36987a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.d.f28673a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f36987a.getResources().getBoolean(d.b.f28664a);
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f36987a).hasPermanentMenuKey();
    }
}
