package e8;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class f<R> implements c<R>, g<R> {
    public static final a G = new a();
    public R A;
    public d B;
    public boolean C;
    public boolean D;
    public boolean E;
    public GlideException F;

    /* renamed from: w  reason: collision with root package name */
    public final int f30315w;

    /* renamed from: x  reason: collision with root package name */
    public final int f30316x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f30317y;

    /* renamed from: z  reason: collision with root package name */
    public final a f30318z;

    /* loaded from: classes.dex */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j10) throws InterruptedException {
            obj.wait(j10);
        }
    }

    public f(int i10, int i11) {
        this(i10, i11, true, G);
    }

    @Override // e8.g
    public synchronized boolean a(GlideException glideException, Object obj, f8.j<R> jVar, boolean z10) {
        this.E = true;
        this.F = glideException;
        this.f30318z.a(this);
        return false;
    }

    @Override // f8.j
    public synchronized d b() {
        return this.B;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.C = true;
            this.f30318z.a(this);
            d dVar = null;
            if (z10) {
                d dVar2 = this.B;
                this.B = null;
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar.clear();
            }
            return true;
        }
    }

    @Override // f8.j
    public void d(f8.i iVar) {
    }

    @Override // f8.j
    public synchronized void e(R r10, g8.b<? super R> bVar) {
    }

    @Override // f8.j
    public void f(Drawable drawable) {
    }

    @Override // f8.j
    public void g(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // e8.g
    public synchronized boolean h(R r10, Object obj, f8.j<R> jVar, m7.a aVar, boolean z10) {
        this.D = true;
        this.A = r10;
        this.f30318z.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.C;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.C && !this.D) {
            z10 = this.E;
        }
        return z10;
    }

    @Override // f8.j
    public synchronized void j(d dVar) {
        this.B = dVar;
    }

    @Override // f8.j
    public synchronized void k(Drawable drawable) {
    }

    @Override // f8.j
    public void l(f8.i iVar) {
        iVar.d(this.f30315w, this.f30316x);
    }

    public final synchronized R m(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f30317y && !isDone()) {
            i8.k.a();
        }
        if (!this.C) {
            if (!this.E) {
                if (this.D) {
                    return this.A;
                }
                if (l10 == null) {
                    this.f30318z.b(this, 0L);
                } else if (l10.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l10.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        this.f30318z.b(this, longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.E) {
                        if (!this.C) {
                            if (this.D) {
                                return this.A;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.F);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.F);
        }
        throw new CancellationException();
    }

    @Override // b8.m
    public void onDestroy() {
    }

    @Override // b8.m
    public void onStart() {
    }

    @Override // b8.m
    public void onStop() {
    }

    public f(int i10, int i11, boolean z10, a aVar) {
        this.f30315w = i10;
        this.f30316x = i11;
        this.f30317y = z10;
        this.f30318z = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m(Long.valueOf(timeUnit.toMillis(j10)));
    }
}
