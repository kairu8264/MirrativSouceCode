package lm;

import android.util.Log;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f40412a;

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f40412a == null) {
                f40412a = new c();
            }
            cVar = f40412a;
        }
        return cVar;
    }

    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
