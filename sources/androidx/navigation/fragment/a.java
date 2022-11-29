package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import jo.p;

/* loaded from: classes.dex */
public final class a {
    public static final NavController a(Fragment fragment) {
        p.i(fragment, "$this$findNavController");
        NavController k32 = NavHostFragment.k3(fragment);
        p.d(k32, "NavHostFragment.findNavController(this)");
        return k32;
    }
}
