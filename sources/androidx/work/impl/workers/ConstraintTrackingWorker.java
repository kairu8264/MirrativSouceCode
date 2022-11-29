package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import k5.j;
import l5.i;
import p5.c;
import p5.d;
import t5.p;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String G = j.f("ConstraintTrkngWrkr");
    public WorkerParameters B;
    public final Object C;
    public volatile boolean D;
    public v5.c<ListenableWorker.a> E;
    public ListenableWorker F;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ nk.c f16641w;

        public b(nk.c cVar) {
            this.f16641w = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.C) {
                if (ConstraintTrackingWorker.this.D) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.E.s(this.f16641w);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.B = workerParameters;
        this.C = new Object();
        this.D = false;
        this.E = v5.c.u();
    }

    public WorkDatabase a() {
        return i.k(getApplicationContext()).o();
    }

    @Override // p5.c
    public void b(List<String> list) {
        j.c().a(G, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.C) {
            this.D = true;
        }
    }

    public void c() {
        this.E.q(ListenableWorker.a.a());
    }

    public void d() {
        this.E.q(ListenableWorker.a.b());
    }

    public void e() {
        String i10 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i10)) {
            j.c().b(G, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b10 = getWorkerFactory().b(getApplicationContext(), i10, this.B);
        this.F = b10;
        if (b10 == null) {
            j.c().a(G, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p g10 = a().L().g(getId().toString());
        if (g10 == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(g10));
        if (dVar.c(getId().toString())) {
            j.c().a(G, String.format("Constraints met for delegate %s", i10), new Throwable[0]);
            try {
                nk.c<ListenableWorker.a> startWork = this.F.startWork();
                startWork.i(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th2) {
                j c10 = j.c();
                String str = G;
                c10.a(str, String.format("Delegated worker %s threw exception in startWork.", i10), th2);
                synchronized (this.C) {
                    if (this.D) {
                        j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                    return;
                }
            }
        }
        j.c().a(G, String.format("Constraints not met for delegate %s. Requesting retry.", i10), new Throwable[0]);
        d();
    }

    @Override // p5.c
    public void f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public w5.a getTaskExecutor() {
        return i.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.F;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.F;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.F.stop();
    }

    @Override // androidx.work.ListenableWorker
    public nk.c<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.E;
    }
}
