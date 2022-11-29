package f7;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import s6.i;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f31813a = new HashSet();

    @Override // s6.i
    public void a(String str) {
        d(str, null);
    }

    @Override // s6.i
    public void b(String str, Throwable th2) {
        if (s6.c.f52050a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // s6.i
    public void c(String str) {
        e(str, null);
    }

    @Override // s6.i
    public void d(String str, Throwable th2) {
        Set<String> set = f31813a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        if (s6.c.f52050a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
