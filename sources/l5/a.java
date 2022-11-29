package l5;

import android.os.Handler;
import android.os.Looper;
import k5.q;

/* loaded from: classes.dex */
public class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f39551a = k3.e.a(Looper.getMainLooper());

    @Override // k5.q
    public void a(Runnable runnable) {
        this.f39551a.removeCallbacks(runnable);
    }

    @Override // k5.q
    public void b(long j10, Runnable runnable) {
        this.f39551a.postDelayed(runnable, j10);
    }
}
