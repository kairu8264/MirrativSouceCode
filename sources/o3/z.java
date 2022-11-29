package o3;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public Object f44052a;

    public z(Object obj) {
        this.f44052a = obj;
    }

    public static z b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new z(PointerIcon.getSystemIcon(context, i10));
        }
        return new z(null);
    }

    public Object a() {
        return this.f44052a;
    }
}
