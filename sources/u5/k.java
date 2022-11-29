package u5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import t5.p;

/* loaded from: classes.dex */
public class k implements Runnable {
    public static final String C = k5.j.f("WorkForegroundRunnable");
    public final k5.f A;
    public final w5.a B;

    /* renamed from: w  reason: collision with root package name */
    public final v5.c<Void> f54417w = v5.c.u();

    /* renamed from: x  reason: collision with root package name */
    public final Context f54418x;

    /* renamed from: y  reason: collision with root package name */
    public final p f54419y;

    /* renamed from: z  reason: collision with root package name */
    public final ListenableWorker f54420z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v5.c f54421w;

        public a(v5.c cVar) {
            this.f54421w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54421w.s(k.this.f54420z.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v5.c f54423w;

        public b(v5.c cVar) {
            this.f54423w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k5.e eVar = (k5.e) this.f54423w.get();
                if (eVar != null) {
                    k5.j.c().a(k.C, String.format("Updating notification for %s", k.this.f54419y.f53194c), new Throwable[0]);
                    k.this.f54420z.setRunInForeground(true);
                    k kVar = k.this;
                    kVar.f54417w.s(kVar.A.a(kVar.f54418x, kVar.f54420z.getId(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", k.this.f54419y.f53194c));
            } catch (Throwable th2) {
                k.this.f54417w.r(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public k(Context context, p pVar, ListenableWorker listenableWorker, k5.f fVar, w5.a aVar) {
        this.f54418x = context;
        this.f54419y = pVar;
        this.f54420z = listenableWorker;
        this.A = fVar;
        this.B = aVar;
    }

    public nk.c<Void> a() {
        return this.f54417w;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f54419y.f53208q && !k3.a.c()) {
            v5.c u10 = v5.c.u();
            this.B.a().execute(new a(u10));
            u10.i(new b(u10), this.B.a());
            return;
        }
        this.f54417w.q(null);
    }
}
