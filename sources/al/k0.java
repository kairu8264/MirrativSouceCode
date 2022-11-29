package al;

import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f13831a = t.c("awaitEvenIfOnMainThread task continuation executor");

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Callable f13832w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vi.h f13833x;

        /* renamed from: al.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0038a implements vi.a<T, Void> {
            public C0038a() {
            }

            @Override // vi.a
            /* renamed from: b */
            public Void a(vi.g<T> gVar) throws Exception {
                if (gVar.s()) {
                    a.this.f13833x.c(gVar.o());
                    return null;
                }
                a.this.f13833x.b(gVar.n());
                return null;
            }
        }

        public a(Callable callable, vi.h hVar) {
            this.f13832w = callable;
            this.f13833x = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((vi.g) this.f13832w.call()).k(new C0038a());
            } catch (Exception e10) {
                this.f13833x.b(e10);
            }
        }
    }

    public static <T> T d(vi.g<T> gVar) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.j(f13831a, new vi.a() { // from class: al.h0
            @Override // vi.a
            public final Object a(vi.g gVar2) {
                Object countDown;
                countDown = countDownLatch.countDown();
                return countDown;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (gVar.s()) {
            return gVar.o();
        }
        if (!gVar.q()) {
            if (gVar.r()) {
                throw new IllegalStateException(gVar.n());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static <T> vi.g<T> e(Executor executor, Callable<vi.g<T>> callable) {
        vi.h hVar = new vi.h();
        executor.execute(new a(callable, hVar));
        return hVar.a();
    }

    public static /* synthetic */ Void g(vi.h hVar, vi.g gVar) throws Exception {
        if (gVar.s()) {
            hVar.e(gVar.o());
            return null;
        }
        Exception n10 = gVar.n();
        Objects.requireNonNull(n10);
        hVar.d(n10);
        return null;
    }

    public static /* synthetic */ Void h(vi.h hVar, vi.g gVar) throws Exception {
        if (gVar.s()) {
            hVar.e(gVar.o());
            return null;
        }
        Exception n10 = gVar.n();
        Objects.requireNonNull(n10);
        hVar.d(n10);
        return null;
    }

    public static <T> vi.g<T> i(Executor executor, vi.g<T> gVar, vi.g<T> gVar2) {
        final vi.h hVar = new vi.h();
        vi.a<T, TContinuationResult> aVar = new vi.a() { // from class: al.i0
            @Override // vi.a
            public final Object a(vi.g gVar3) {
                Void h10;
                h10 = k0.h(vi.h.this, gVar3);
                return h10;
            }
        };
        gVar.j(executor, aVar);
        gVar2.j(executor, aVar);
        return hVar.a();
    }

    public static <T> vi.g<T> j(vi.g<T> gVar, vi.g<T> gVar2) {
        final vi.h hVar = new vi.h();
        vi.a<T, TContinuationResult> aVar = new vi.a() { // from class: al.j0
            @Override // vi.a
            public final Object a(vi.g gVar3) {
                Void g10;
                g10 = k0.g(vi.h.this, gVar3);
                return g10;
            }
        };
        gVar.k(aVar);
        gVar2.k(aVar);
        return hVar.a();
    }
}
