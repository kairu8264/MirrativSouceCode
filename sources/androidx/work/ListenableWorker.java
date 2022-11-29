package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k5.e;
import k5.v;
import nk.c;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public boolean A;

    /* renamed from: w  reason: collision with root package name */
    public Context f16510w;

    /* renamed from: x  reason: collision with root package name */
    public WorkerParameters f16511x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f16512y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16513z;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0083a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f16514a;

            public C0083a() {
                this(androidx.work.b.f16558c);
            }

            public androidx.work.b e() {
                return this.f16514a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0083a.class != obj.getClass()) {
                    return false;
                }
                return this.f16514a.equals(((C0083a) obj).f16514a);
            }

            public int hashCode() {
                return (C0083a.class.getName().hashCode() * 31) + this.f16514a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f16514a + '}';
            }

            public C0083a(androidx.work.b bVar) {
                this.f16514a = bVar;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f16515a;

            public c() {
                this(androidx.work.b.f16558c);
            }

            public androidx.work.b e() {
                return this.f16515a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f16515a.equals(((c) obj).f16515a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f16515a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f16515a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f16515a = bVar;
            }
        }

        public static a a() {
            return new C0083a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters != null) {
            this.f16510w = context;
            this.f16511x = workerParameters;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    public final Context getApplicationContext() {
        return this.f16510w;
    }

    public Executor getBackgroundExecutor() {
        return this.f16511x.a();
    }

    public c<e> getForegroundInfoAsync() {
        v5.c u10 = v5.c.u();
        u10.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u10;
    }

    public final UUID getId() {
        return this.f16511x.c();
    }

    public final b getInputData() {
        return this.f16511x.d();
    }

    public final Network getNetwork() {
        return this.f16511x.e();
    }

    public final int getRunAttemptCount() {
        return this.f16511x.g();
    }

    public final Set<String> getTags() {
        return this.f16511x.h();
    }

    public w5.a getTaskExecutor() {
        return this.f16511x.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f16511x.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f16511x.k();
    }

    public v getWorkerFactory() {
        return this.f16511x.l();
    }

    public boolean isRunInForeground() {
        return this.A;
    }

    public final boolean isStopped() {
        return this.f16512y;
    }

    public final boolean isUsed() {
        return this.f16513z;
    }

    public void onStopped() {
    }

    public final c<Void> setForegroundAsync(e eVar) {
        this.A = true;
        return this.f16511x.b().a(getApplicationContext(), getId(), eVar);
    }

    public c<Void> setProgressAsync(b bVar) {
        return this.f16511x.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z10) {
        this.A = z10;
    }

    public final void setUsed() {
        this.f16513z = true;
    }

    public abstract c<a> startWork();

    public final void stop() {
        this.f16512y = true;
        onStopped();
    }
}
