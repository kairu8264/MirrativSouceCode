package em;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class q0 {

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<q0> f30726d;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30727a;

    /* renamed from: b  reason: collision with root package name */
    public n0 f30728b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f30729c;

    public q0(SharedPreferences sharedPreferences, Executor executor) {
        this.f30729c = executor;
        this.f30727a = sharedPreferences;
    }

    public static synchronized q0 a(Context context, Executor executor) {
        synchronized (q0.class) {
            WeakReference<q0> weakReference = f30726d;
            q0 q0Var = weakReference != null ? weakReference.get() : null;
            if (q0Var == null) {
                q0 q0Var2 = new q0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                q0Var2.c();
                f30726d = new WeakReference<>(q0Var2);
                return q0Var2;
            }
            return q0Var;
        }
    }

    public synchronized p0 b() {
        return p0.a(this.f30728b.e());
    }

    public final synchronized void c() {
        this.f30728b = n0.c(this.f30727a, "topic_operation_queue", ",", this.f30729c);
    }

    public synchronized boolean d(p0 p0Var) {
        return this.f30728b.f(p0Var.e());
    }
}
