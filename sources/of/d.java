package of;

import android.os.Build;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f45388a = new d();

    public final boolean a() {
        if (so.n.q(Build.MANUFACTURER, "samsung", true)) {
            return true;
        }
        String str = Build.MODEL;
        jo.p.g(str, "MODEL");
        if (so.n.C(str, "SC", false, 2, null)) {
            return true;
        }
        jo.p.g(str, "MODEL");
        if (so.n.p(str, "SC", false, 2, null)) {
            return true;
        }
        jo.p.g(str, "MODEL");
        return so.n.C(str, "SM", false, 2, null);
    }

    public final boolean b() {
        return so.n.q(Build.MANUFACTURER, "SHARP", true);
    }

    public final boolean c() {
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        jo.p.g(strArr, "SUPPORTED_32_BIT_ABIS");
        return xn.o.B(strArr, "x86");
    }

    public final boolean d() {
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        jo.p.g(strArr, "SUPPORTED_64_BIT_ABIS");
        return xn.o.B(strArr, "x86_64");
    }

    public final boolean e() {
        String str = Build.MANUFACTURER;
        jo.p.g(str, "MANUFACTURER");
        return so.o.H(str, "Sony", false, 2, null);
    }

    public final boolean f() {
        return so.n.q(Build.MANUFACTURER, "ASUS", true);
    }
}
