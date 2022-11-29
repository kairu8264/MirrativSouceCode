package o3;

import android.os.Build;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f43920a;

    public d(Object obj) {
        this.f43920a = obj;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f43920a).getSafeInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f43920a).getSafeInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f43920a).getSafeInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f43920a).getSafeInsetTop();
        }
        return 0;
    }

    public f3.b e() {
        if (k3.a.b()) {
            return f3.b.d(((DisplayCutout) this.f43920a).getWaterfallInsets());
        }
        return f3.b.f31712e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return n3.c.a(this.f43920a, ((d) obj).f43920a);
    }

    public int hashCode() {
        Object obj = this.f43920a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f43920a + "}";
    }
}
