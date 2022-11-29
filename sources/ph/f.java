package ph;

import android.app.Activity;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f47486a;

    public f(Activity activity) {
        rh.p.j(activity, "Activity must not be null");
        this.f47486a = activity;
    }

    public final Activity a() {
        return (Activity) this.f47486a;
    }

    public final androidx.fragment.app.h b() {
        return (androidx.fragment.app.h) this.f47486a;
    }

    public final boolean c() {
        return this.f47486a instanceof Activity;
    }

    public final boolean d() {
        return this.f47486a instanceof androidx.fragment.app.h;
    }
}
