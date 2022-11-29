package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f15246a;

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f15247b;

    static {
        f15246a = Build.VERSION.SDK_INT >= 21 ? new b0() : null;
        f15247b = b();
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10, s.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.v0();
        } else {
            fragment.v0();
        }
    }

    public static c0 b() {
        try {
            return (c0) g5.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(s.a<String, String> aVar, s.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.r(size))) {
                aVar.p(size);
            }
        }
    }

    public static void d(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    public static boolean e() {
        return (f15246a == null && f15247b == null) ? false : true;
    }
}
