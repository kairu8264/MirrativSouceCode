package ai;

import android.os.SystemClock;
import java.lang.Exception;

/* loaded from: classes3.dex */
public final class p22<T extends Exception> {

    /* renamed from: a  reason: collision with root package name */
    public T f8261a;

    /* renamed from: b  reason: collision with root package name */
    public long f8262b;

    public p22(long j10) {
    }

    public final void a(T t10) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8261a == null) {
            this.f8261a = t10;
            this.f8262b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f8262b) {
            T t11 = this.f8261a;
            if (t11 != t10) {
                ug3.a(t11, t10);
            }
            T t12 = this.f8261a;
            this.f8261a = null;
            throw t12;
        }
    }

    public final void b() {
        this.f8261a = null;
    }
}
