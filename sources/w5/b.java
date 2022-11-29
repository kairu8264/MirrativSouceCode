package w5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import u5.g;

/* loaded from: classes.dex */
public class b implements w5.a {

    /* renamed from: a  reason: collision with root package name */
    public final g f58127a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f58128b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Executor f58129c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f58127a = new g(executor);
    }

    @Override // w5.a
    public Executor a() {
        return this.f58129c;
    }

    @Override // w5.a
    public void b(Runnable runnable) {
        this.f58127a.execute(runnable);
    }

    @Override // w5.a
    public g c() {
        return this.f58127a;
    }

    public void d(Runnable runnable) {
        this.f58128b.post(runnable);
    }
}
