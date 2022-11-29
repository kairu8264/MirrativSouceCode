package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import v5.c;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public c<ListenableWorker.a> B;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.B.q(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.B.r(th2);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final nk.c<ListenableWorker.a> startWork() {
        this.B = c.u();
        getBackgroundExecutor().execute(new a());
        return this.B;
    }
}
