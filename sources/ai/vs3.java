package ai;

import ai.ws3;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzlg;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
public final class vs3<T extends ws3> extends Handler implements Runnable {
    public int A;
    public Thread B;
    public boolean C;
    public volatile boolean D;
    public final /* synthetic */ at3 E;

    /* renamed from: w  reason: collision with root package name */
    public final T f11289w;

    /* renamed from: x  reason: collision with root package name */
    public final long f11290x;

    /* renamed from: y  reason: collision with root package name */
    public ss3<T> f11291y;

    /* renamed from: z  reason: collision with root package name */
    public IOException f11292z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs3(at3 at3Var, Looper looper, T t10, ss3<T> ss3Var, int i10, long j10) {
        super(looper);
        this.E = at3Var;
        this.f11289w = t10;
        this.f11291y = ss3Var;
        this.f11290x = j10;
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f11292z;
        if (iOException != null && this.A > i10) {
            throw iOException;
        }
    }

    public final void b(long j10) {
        vs3 vs3Var;
        vs3Var = this.E.f2074b;
        u9.d(vs3Var == null);
        this.E.f2074b = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            d();
        }
    }

    public final void c(boolean z10) {
        this.D = z10;
        this.f11292z = null;
        if (hasMessages(0)) {
            this.C = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.C = true;
                this.f11289w.f();
                Thread thread = this.B;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.E.f2074b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ss3<T> ss3Var = this.f11291y;
            Objects.requireNonNull(ss3Var);
            ss3Var.m(this.f11289w, elapsedRealtime, elapsedRealtime - this.f11290x, true);
            this.f11291y = null;
        }
    }

    public final void d() {
        ExecutorService executorService;
        vs3 vs3Var;
        this.f11292z = null;
        executorService = this.E.f2073a;
        vs3Var = this.E.f2074b;
        Objects.requireNonNull(vs3Var);
        executorService.execute(vs3Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        if (this.D) {
            return;
        }
        int i13 = message.what;
        if (i13 == 0) {
            d();
        } else if (i13 != 3) {
            this.E.f2074b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.f11290x;
            ss3<T> ss3Var = this.f11291y;
            Objects.requireNonNull(ss3Var);
            if (this.C) {
                ss3Var.m(this.f11289w, elapsedRealtime, j11, false);
                return;
            }
            int i14 = message.what;
            if (i14 == 1) {
                try {
                    ss3Var.h(this.f11289w, elapsedRealtime, j11);
                } catch (RuntimeException e10) {
                    oa.b("LoadTask", "Unexpected exception handling load completed", e10);
                    this.E.f2075c = new zzlg(e10);
                }
            } else if (i14 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.f11292z = iOException;
                int i15 = this.A + 1;
                this.A = i15;
                us3 g10 = ss3Var.g(this.f11289w, elapsedRealtime, j11, iOException, i15);
                i10 = g10.f10826a;
                if (i10 == 3) {
                    this.E.f2075c = this.f11292z;
                    return;
                }
                i11 = g10.f10826a;
                if (i11 != 2) {
                    i12 = g10.f10826a;
                    if (i12 == 1) {
                        this.A = 1;
                    }
                    j10 = g10.f10827b;
                    b(j10 != C.TIME_UNSET ? g10.f10827b : Math.min((this.A - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.C;
                this.B = Thread.currentThread();
            }
            if (z10) {
                String simpleName = this.f11289w.getClass().getSimpleName();
                qb.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f11289w.e();
                    qb.b();
                } catch (Throwable th2) {
                    qb.b();
                    throw th2;
                }
            }
            synchronized (this) {
                this.B = null;
                Thread.interrupted();
            }
            if (this.D) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.D) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.D) {
                return;
            }
            oa.b("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(2, new zzlg(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.D) {
                return;
            }
            oa.b("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(2, new zzlg(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.D) {
                oa.b("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
