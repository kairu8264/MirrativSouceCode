package c1;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {
    public static final d0 a(long j10, int i10) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = s.f18766a.a(j10, i10);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(e0.i(j10), a.b(i10));
        }
        return new d0(porterDuffColorFilter);
    }

    public static final ColorFilter b(d0 d0Var) {
        jo.p.h(d0Var, "<this>");
        return d0Var.a();
    }
}
