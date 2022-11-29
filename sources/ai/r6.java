package ai;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    public final q6 f9347a;

    /* renamed from: b  reason: collision with root package name */
    public final p6 f9348b;

    /* renamed from: c  reason: collision with root package name */
    public final v9 f9349c;

    /* renamed from: d  reason: collision with root package name */
    public final q7 f9350d;

    /* renamed from: e  reason: collision with root package name */
    public int f9351e;

    /* renamed from: f  reason: collision with root package name */
    public Object f9352f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f9353g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9354h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9355i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9356j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9357k;

    public r6(p6 p6Var, q6 q6Var, q7 q7Var, int i10, v9 v9Var, Looper looper) {
        this.f9348b = p6Var;
        this.f9347a = q6Var;
        this.f9350d = q7Var;
        this.f9353g = looper;
        this.f9349c = v9Var;
        this.f9354h = i10;
    }

    public final q6 a() {
        return this.f9347a;
    }

    public final r6 b(int i10) {
        u9.d(!this.f9355i);
        this.f9351e = i10;
        return this;
    }

    public final int c() {
        return this.f9351e;
    }

    public final r6 d(Object obj) {
        u9.d(!this.f9355i);
        this.f9352f = obj;
        return this;
    }

    public final Object e() {
        return this.f9352f;
    }

    public final Looper f() {
        return this.f9353g;
    }

    public final r6 g() {
        u9.d(!this.f9355i);
        this.f9355i = true;
        this.f9348b.a(this);
        return this;
    }

    public final synchronized boolean h() {
        return false;
    }

    public final synchronized void i(boolean z10) {
        this.f9356j = z10 | this.f9356j;
        this.f9357k = true;
        notifyAll();
    }

    public final synchronized boolean j(long j10) throws InterruptedException, TimeoutException {
        u9.d(this.f9355i);
        u9.d(this.f9353g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        long j12 = elapsedRealtime + SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        while (!this.f9357k) {
            if (j11 > 0) {
                wait(j11);
                j11 = j12 - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f9356j;
    }
}
