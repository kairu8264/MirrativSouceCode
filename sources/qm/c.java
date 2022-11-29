package qm;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: g  reason: collision with root package name */
    public static final lm.a f49577g = lm.a.e();

    /* renamed from: h  reason: collision with root package name */
    public static final long f49578h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: c  reason: collision with root package name */
    public final String f49581c;

    /* renamed from: d  reason: collision with root package name */
    public final long f49582d;

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture f49583e = null;

    /* renamed from: f  reason: collision with root package name */
    public long f49584f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<tm.e> f49579a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f49580b = Executors.newSingleThreadScheduledExecutor();

    public c() {
        int myPid = Process.myPid();
        this.f49581c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f49582d = e();
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(sm.h hVar) {
        tm.e m10 = m(hVar);
        if (m10 != null) {
            this.f49579a.add(m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(sm.h hVar) {
        tm.e m10 = m(hVar);
        if (m10 != null) {
            this.f49579a.add(m10);
        }
    }

    public void c(sm.h hVar) {
        i(hVar);
    }

    public final long d(long j10) {
        return Math.round((j10 / this.f49582d) * f49578h);
    }

    public final long e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        return -1L;
    }

    public final synchronized void i(final sm.h hVar) {
        try {
            this.f49580b.schedule(new Runnable() { // from class: qm.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.g(hVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lm.a aVar = f49577g;
            aVar.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    public final synchronized void j(long j10, final sm.h hVar) {
        this.f49584f = j10;
        try {
            this.f49583e = this.f49580b.scheduleAtFixedRate(new Runnable() { // from class: qm.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.h(hVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lm.a aVar = f49577g;
            aVar.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    public void k(long j10, sm.h hVar) {
        long j11 = this.f49582d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f49583e != null) {
            if (this.f49584f != j10) {
                l();
                j(j10, hVar);
                return;
            }
            return;
        }
        j(j10, hVar);
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f49583e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f49583e = null;
        this.f49584f = -1L;
    }

    public final tm.e m(sm.h hVar) {
        if (hVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f49581c));
            try {
                long a10 = hVar.a();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                tm.e a11 = tm.e.T().G(a10).H(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).I(d(parseLong + parseLong2)).a();
                bufferedReader.close();
                return a11;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            lm.a aVar = f49577g;
            aVar.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            lm.a aVar2 = f49577g;
            aVar2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            lm.a aVar22 = f49577g;
            aVar22.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            lm.a aVar222 = f49577g;
            aVar222.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}
