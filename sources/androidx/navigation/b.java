package androidx.navigation;

import android.app.Activity;

/* loaded from: classes.dex */
public final class b {
    public static final NavController a(Activity activity, int i10) {
        jo.p.i(activity, "$this$findNavController");
        NavController a10 = w.a(activity, i10);
        jo.p.d(a10, "Navigation.findNavController(this, viewId)");
        return a10;
    }
}
