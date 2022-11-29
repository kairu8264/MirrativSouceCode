package wm;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, d> f59183d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f59184e = com.google.android.exoplayer2.offline.a.f26900w;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f59185a;

    /* renamed from: b  reason: collision with root package name */
    public final k f59186b;

    /* renamed from: c  reason: collision with root package name */
    public vi.g<com.google.firebase.remoteconfig.internal.a> f59187c = null;

    /* loaded from: classes4.dex */
    public static class b<TResult> implements vi.e<TResult>, vi.d, vi.b {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f59188a;

        public b() {
            this.f59188a = new CountDownLatch(1);
        }

        @Override // vi.d
        public void a(Exception exc) {
            this.f59188a.countDown();
        }

        public boolean b(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f59188a.await(j10, timeUnit);
        }

        @Override // vi.b
        public void c() {
            this.f59188a.countDown();
        }

        @Override // vi.e
        public void onSuccess(TResult tresult) {
            this.f59188a.countDown();
        }
    }

    public d(ExecutorService executorService, k kVar) {
        this.f59185a = executorService;
        this.f59186b = kVar;
    }

    public static <TResult> TResult c(vi.g<TResult> gVar, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f59184e;
        gVar.h(executor, bVar);
        gVar.e(executor, bVar);
        gVar.a(executor, bVar);
        if (bVar.b(j10, timeUnit)) {
            if (gVar.s()) {
                return gVar.o();
            }
            throw new ExecutionException(gVar.n());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d h(ExecutorService executorService, k kVar) {
        d dVar;
        synchronized (d.class) {
            String b10 = kVar.b();
            Map<String, d> map = f59183d;
            if (!map.containsKey(b10)) {
                map.put(b10, new d(executorService, kVar));
            }
            dVar = map.get(b10);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(com.google.firebase.remoteconfig.internal.a aVar) throws Exception {
        return this.f59186b.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ vi.g j(boolean z10, com.google.firebase.remoteconfig.internal.a aVar, Void r32) throws Exception {
        if (z10) {
            m(aVar);
        }
        return vi.j.e(aVar);
    }

    public void d() {
        synchronized (this) {
            this.f59187c = vi.j.e(null);
        }
        this.f59186b.a();
    }

    public synchronized vi.g<com.google.firebase.remoteconfig.internal.a> e() {
        vi.g<com.google.firebase.remoteconfig.internal.a> gVar = this.f59187c;
        if (gVar == null || (gVar.r() && !this.f59187c.s())) {
            ExecutorService executorService = this.f59185a;
            final k kVar = this.f59186b;
            Objects.requireNonNull(kVar);
            this.f59187c = vi.j.c(executorService, new Callable() { // from class: wm.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return k.this.d();
                }
            });
        }
        return this.f59187c;
    }

    public com.google.firebase.remoteconfig.internal.a f() {
        return g(5L);
    }

    public com.google.firebase.remoteconfig.internal.a g(long j10) {
        synchronized (this) {
            vi.g<com.google.firebase.remoteconfig.internal.a> gVar = this.f59187c;
            if (gVar != null && gVar.s()) {
                return this.f59187c.o();
            }
            try {
                return (com.google.firebase.remoteconfig.internal.a) c(e(), j10, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public vi.g<com.google.firebase.remoteconfig.internal.a> k(com.google.firebase.remoteconfig.internal.a aVar) {
        return l(aVar, true);
    }

    public vi.g<com.google.firebase.remoteconfig.internal.a> l(final com.google.firebase.remoteconfig.internal.a aVar, final boolean z10) {
        return vi.j.c(this.f59185a, new Callable() { // from class: wm.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i10;
                i10 = d.this.i(aVar);
                return i10;
            }
        }).t(this.f59185a, new vi.f() { // from class: wm.c
            @Override // vi.f
            public final vi.g a(Object obj) {
                vi.g j10;
                j10 = d.this.j(z10, aVar, (Void) obj);
                return j10;
            }
        });
    }

    public final synchronized void m(com.google.firebase.remoteconfig.internal.a aVar) {
        this.f59187c = vi.j.e(aVar);
    }
}
