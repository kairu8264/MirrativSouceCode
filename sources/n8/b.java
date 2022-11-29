package n8;

import com.cookpad.puree.PureeLogger;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m8.e;

/* loaded from: classes.dex */
public abstract class b extends n8.c {
    public ScheduledExecutorService A;

    /* renamed from: z  reason: collision with root package name */
    public e f41611z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d();
        }
    }

    /* renamed from: n8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0618b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f41613w;

        public RunnableC0618b(String str) {
            this.f41613w = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String a10 = b.this.a(this.f41613w);
            if (a10 != null) {
                b bVar = b.this;
                bVar.f41619x.a(bVar.i(), a10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    /* loaded from: classes.dex */
    public class d implements l8.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o8.e f41616a;

        public d(o8.e eVar) {
            this.f41616a = eVar;
        }

        @Override // l8.a
        public void a() {
            b.this.f41611z.b();
            b.this.f41619x.unlock();
        }

        @Override // l8.a
        public void b() {
            b.this.f41611z.a();
            b.this.f41619x.c(this.f41616a);
            b.this.f41619x.unlock();
        }
    }

    @Override // n8.c
    public void c(String str) {
    }

    @Override // n8.c
    public void d() {
        this.A.execute(new m8.d(new c()));
    }

    @Override // n8.c
    public void g(PureeLogger pureeLogger) {
        super.g(pureeLogger);
        this.A = pureeLogger.c();
        this.f41611z = new e(new a(), this.f41618w.a(), this.f41618w.c(), this.A);
    }

    @Override // n8.c
    public void h(String str) {
        this.A.execute(new m8.d(new RunnableC0618b(str)));
        this.f41611z.d();
    }

    public abstract void j(List<String> list, l8.a aVar);

    public void k() {
        if (!this.f41619x.lock()) {
            this.f41611z.b();
            return;
        }
        m();
        o8.e l10 = l();
        if (l10.isEmpty()) {
            this.f41619x.unlock();
            this.f41611z.a();
            return;
        }
        j(l10.g(), new d(l10));
    }

    public final o8.e l() {
        return this.f41619x.b(i(), this.f41618w.b());
    }

    public final void m() {
        if (!(this.f41619x instanceof o8.a) || this.f41618w.d() < 0) {
            return;
        }
        ((o8.a) this.f41619x).d(i(), this.f41618w.d());
    }
}
