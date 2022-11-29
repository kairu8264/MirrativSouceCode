package nh;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import rh.q1;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f43540a = g.f43544a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f43541b = new e();

    public static e f() {
        return f43541b;
    }

    public int a(Context context) {
        return g.a(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return q1.c("com.google.android.gms");
        } else if (context != null && vh.j.f(context)) {
            return q1.a();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f43540a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(xh.c.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return q1.b("com.google.android.gms", sb2.toString());
        }
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent b10 = b(context, i10, str);
        if (b10 == null) {
            return null;
        }
        return fi.d.a(context, i11, b10, fi.d.f31984a | 134217728);
    }

    public String e(int i10) {
        return g.b(i10);
    }

    public int g(Context context) {
        return h(context, f43540a);
    }

    public int h(Context context, int i10) {
        int f10 = g.f(context, i10);
        if (g.g(context, f10)) {
            return 18;
        }
        return f10;
    }

    public boolean i(Context context, String str) {
        return g.k(context, str);
    }

    public boolean j(int i10) {
        return g.i(i10);
    }
}
