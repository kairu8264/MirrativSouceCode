package l5;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k5.s;
import t5.p;
import t5.q;
import t5.t;
import u5.k;
import u5.l;
import u5.m;

/* loaded from: classes.dex */
public class j implements Runnable {
    public static final String P = k5.j.f("WorkerWrapper");
    public p A;
    public ListenableWorker B;
    public w5.a C;
    public androidx.work.a E;
    public s5.a F;
    public WorkDatabase G;
    public q H;
    public t5.b I;
    public t J;
    public List<String> K;
    public String L;
    public volatile boolean O;

    /* renamed from: w  reason: collision with root package name */
    public Context f39587w;

    /* renamed from: x  reason: collision with root package name */
    public String f39588x;

    /* renamed from: y  reason: collision with root package name */
    public List<e> f39589y;

    /* renamed from: z  reason: collision with root package name */
    public WorkerParameters.a f39590z;
    public ListenableWorker.a D = ListenableWorker.a.a();
    public v5.c<Boolean> M = v5.c.u();
    public nk.c<ListenableWorker.a> N = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ nk.c f39591w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ v5.c f39592x;

        public a(nk.c cVar, v5.c cVar2) {
            this.f39591w = cVar;
            this.f39592x = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f39591w.get();
                k5.j.c().a(j.P, String.format("Starting work for %s", j.this.A.f53194c), new Throwable[0]);
                j jVar = j.this;
                jVar.N = jVar.B.startWork();
                this.f39592x.s(j.this.N);
            } catch (Throwable th2) {
                this.f39592x.r(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v5.c f39594w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f39595x;

        public b(v5.c cVar, String str) {
            this.f39594w = cVar;
            this.f39595x = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f39594w.get();
                    if (aVar == null) {
                        k5.j.c().b(j.P, String.format("%s returned a null result. Treating it as a failure.", j.this.A.f53194c), new Throwable[0]);
                    } else {
                        k5.j.c().a(j.P, String.format("%s returned a %s result.", j.this.A.f53194c, aVar), new Throwable[0]);
                        j.this.D = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    k5.j.c().b(j.P, String.format("%s failed because it threw an exception/error", this.f39595x), e);
                } catch (CancellationException e11) {
                    k5.j.c().d(j.P, String.format("%s was cancelled", this.f39595x), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    k5.j.c().b(j.P, String.format("%s failed because it threw an exception/error", this.f39595x), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public Context f39597a;

        /* renamed from: b  reason: collision with root package name */
        public ListenableWorker f39598b;

        /* renamed from: c  reason: collision with root package name */
        public s5.a f39599c;

        /* renamed from: d  reason: collision with root package name */
        public w5.a f39600d;

        /* renamed from: e  reason: collision with root package name */
        public androidx.work.a f39601e;

        /* renamed from: f  reason: collision with root package name */
        public WorkDatabase f39602f;

        /* renamed from: g  reason: collision with root package name */
        public String f39603g;

        /* renamed from: h  reason: collision with root package name */
        public List<e> f39604h;

        /* renamed from: i  reason: collision with root package name */
        public WorkerParameters.a f39605i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, w5.a aVar2, s5.a aVar3, WorkDatabase workDatabase, String str) {
            this.f39597a = context.getApplicationContext();
            this.f39600d = aVar2;
            this.f39599c = aVar3;
            this.f39601e = aVar;
            this.f39602f = workDatabase;
            this.f39603g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f39605i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f39604h = list;
            return this;
        }
    }

    public j(c cVar) {
        this.f39587w = cVar.f39597a;
        this.C = cVar.f39600d;
        this.F = cVar.f39599c;
        this.f39588x = cVar.f39603g;
        this.f39589y = cVar.f39604h;
        this.f39590z = cVar.f39605i;
        this.B = cVar.f39598b;
        this.E = cVar.f39601e;
        WorkDatabase workDatabase = cVar.f39602f;
        this.G = workDatabase;
        this.H = workDatabase.L();
        this.I = this.G.D();
        this.J = this.G.M();
    }

    public final String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f39588x);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    public nk.c<Boolean> b() {
        return this.M;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            k5.j.c().d(P, String.format("Worker result SUCCESS for %s", this.L), new Throwable[0]);
            if (this.A.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            k5.j.c().d(P, String.format("Worker result RETRY for %s", this.L), new Throwable[0]);
            g();
        } else {
            k5.j.c().d(P, String.format("Worker result FAILURE for %s", this.L), new Throwable[0]);
            if (this.A.d()) {
                h();
            } else {
                l();
            }
        }
    }

    public void d() {
        boolean z10;
        this.O = true;
        n();
        nk.c<ListenableWorker.a> cVar = this.N;
        if (cVar != null) {
            z10 = cVar.isDone();
            this.N.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.B;
        if (listenableWorker != null && !z10) {
            listenableWorker.stop();
        } else {
            k5.j.c().a(P, String.format("WorkSpec %s is already done. Not interrupting.", this.A), new Throwable[0]);
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.H.f(str2) != s.a.CANCELLED) {
                this.H.c(s.a.FAILED, str2);
            }
            linkedList.addAll(this.I.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.G.e();
            try {
                s.a f10 = this.H.f(this.f39588x);
                this.G.K().b(this.f39588x);
                if (f10 == null) {
                    i(false);
                } else if (f10 == s.a.RUNNING) {
                    c(this.D);
                } else if (!f10.a()) {
                    g();
                }
                this.G.A();
            } finally {
                this.G.i();
            }
        }
        List<e> list = this.f39589y;
        if (list != null) {
            for (e eVar : list) {
                eVar.a(this.f39588x);
            }
            f.b(this.E, this.G, this.f39589y);
        }
    }

    public final void g() {
        this.G.e();
        try {
            this.H.c(s.a.ENQUEUED, this.f39588x);
            this.H.u(this.f39588x, System.currentTimeMillis());
            this.H.m(this.f39588x, -1L);
            this.G.A();
        } finally {
            this.G.i();
            i(true);
        }
    }

    public final void h() {
        this.G.e();
        try {
            this.H.u(this.f39588x, System.currentTimeMillis());
            this.H.c(s.a.ENQUEUED, this.f39588x);
            this.H.s(this.f39588x);
            this.H.m(this.f39588x, -1L);
            this.G.A();
        } finally {
            this.G.i();
            i(false);
        }
    }

    public final void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.G.e();
        try {
            if (!this.G.L().r()) {
                u5.d.a(this.f39587w, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.H.c(s.a.ENQUEUED, this.f39588x);
                this.H.m(this.f39588x, -1L);
            }
            if (this.A != null && (listenableWorker = this.B) != null && listenableWorker.isRunInForeground()) {
                this.F.a(this.f39588x);
            }
            this.G.A();
            this.G.i();
            this.M.q(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.G.i();
            throw th2;
        }
    }

    public final void j() {
        s.a f10 = this.H.f(this.f39588x);
        if (f10 == s.a.RUNNING) {
            k5.j.c().a(P, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f39588x), new Throwable[0]);
            i(true);
            return;
        }
        k5.j.c().a(P, String.format("Status for %s is %s; not doing any work", this.f39588x, f10), new Throwable[0]);
        i(false);
    }

    public final void k() {
        androidx.work.b b10;
        if (n()) {
            return;
        }
        this.G.e();
        try {
            p g10 = this.H.g(this.f39588x);
            this.A = g10;
            if (g10 == null) {
                k5.j.c().b(P, String.format("Didn't find WorkSpec for id %s", this.f39588x), new Throwable[0]);
                i(false);
                this.G.A();
            } else if (g10.f53193b != s.a.ENQUEUED) {
                j();
                this.G.A();
                k5.j.c().a(P, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.A.f53194c), new Throwable[0]);
            } else {
                if (g10.d() || this.A.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p pVar = this.A;
                    if (!(pVar.f53205n == 0) && currentTimeMillis < pVar.a()) {
                        k5.j.c().a(P, String.format("Delaying execution for %s because it is being executed before schedule.", this.A.f53194c), new Throwable[0]);
                        i(true);
                        this.G.A();
                        return;
                    }
                }
                this.G.A();
                this.G.i();
                if (this.A.d()) {
                    b10 = this.A.f53196e;
                } else {
                    k5.h b11 = this.E.f().b(this.A.f53195d);
                    if (b11 == null) {
                        k5.j.c().b(P, String.format("Could not create Input Merger %s", this.A.f53195d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.A.f53196e);
                    arrayList.addAll(this.H.i(this.f39588x));
                    b10 = b11.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f39588x), b10, this.K, this.f39590z, this.A.f53202k, this.E.e(), this.C, this.E.m(), new m(this.G, this.C), new l(this.G, this.F, this.C));
                if (this.B == null) {
                    this.B = this.E.m().b(this.f39587w, this.A.f53194c, workerParameters);
                }
                ListenableWorker listenableWorker = this.B;
                if (listenableWorker == null) {
                    k5.j.c().b(P, String.format("Could not create Worker %s", this.A.f53194c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    k5.j.c().b(P, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.A.f53194c), new Throwable[0]);
                    l();
                } else {
                    this.B.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        v5.c u10 = v5.c.u();
                        k kVar = new k(this.f39587w, this.A, this.B, workerParameters.b(), this.C);
                        this.C.a().execute(kVar);
                        nk.c<Void> a10 = kVar.a();
                        a10.i(new a(a10, u10), this.C.a());
                        u10.i(new b(u10, this.L), this.C.c());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.G.i();
        }
    }

    public void l() {
        this.G.e();
        try {
            e(this.f39588x);
            this.H.p(this.f39588x, ((ListenableWorker.a.C0083a) this.D).e());
            this.G.A();
        } finally {
            this.G.i();
            i(false);
        }
    }

    public final void m() {
        this.G.e();
        try {
            this.H.c(s.a.SUCCEEDED, this.f39588x);
            this.H.p(this.f39588x, ((ListenableWorker.a.c) this.D).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.I.a(this.f39588x)) {
                if (this.H.f(str) == s.a.BLOCKED && this.I.b(str)) {
                    k5.j.c().d(P, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.H.c(s.a.ENQUEUED, str);
                    this.H.u(str, currentTimeMillis);
                }
            }
            this.G.A();
        } finally {
            this.G.i();
            i(false);
        }
    }

    public final boolean n() {
        if (this.O) {
            k5.j.c().a(P, String.format("Work interrupted for %s", this.L), new Throwable[0]);
            s.a f10 = this.H.f(this.f39588x);
            if (f10 == null) {
                i(false);
            } else {
                i(!f10.a());
            }
            return true;
        }
        return false;
    }

    public final boolean o() {
        this.G.e();
        try {
            boolean z10 = true;
            if (this.H.f(this.f39588x) == s.a.ENQUEUED) {
                this.H.c(s.a.RUNNING, this.f39588x);
                this.H.t(this.f39588x);
            } else {
                z10 = false;
            }
            this.G.A();
            return z10;
        } finally {
            this.G.i();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b10 = this.J.b(this.f39588x);
        this.K = b10;
        this.L = a(b10);
        k();
    }
}
