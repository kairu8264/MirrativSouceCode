package ai;

import ai.cj;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzaum;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
public final class bj<T extends cj> extends Handler implements Runnable {
    public IOException A;
    public int B;
    public volatile Thread C;
    public volatile boolean D;
    public final /* synthetic */ dj E;

    /* renamed from: w  reason: collision with root package name */
    public final T f2357w;

    /* renamed from: x  reason: collision with root package name */
    public final aj<T> f2358x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2359y;

    /* renamed from: z  reason: collision with root package name */
    public final long f2360z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(dj djVar, Looper looper, T t10, aj<T> ajVar, int i10, long j10) {
        super(looper);
        this.E = djVar;
        this.f2357w = t10;
        this.f2358x = ajVar;
        this.f2359y = i10;
        this.f2360z = j10;
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.A;
        if (iOException != null && this.B > i10) {
            throw iOException;
        }
    }

    public final void b(long j10) {
        bj bjVar;
        bjVar = this.E.f3310b;
        fj.d(bjVar == null);
        this.E.f3310b = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            d();
        }
    }

    public final void c(boolean z10) {
        this.D = z10;
        this.A = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f2357w.b();
            if (this.C != null) {
                this.C.interrupt();
            }
            if (!z10) {
                return;
            }
        }
        this.E.f3310b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f2358x.c(this.f2357w, elapsedRealtime, elapsedRealtime - this.f2360z, true);
    }

    public final void d() {
        ExecutorService executorService;
        bj bjVar;
        this.A = null;
        executorService = this.E.f3309a;
        bjVar = this.E.f3310b;
        executorService.execute(bjVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.D) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            d();
        } else if (i10 != 4) {
            this.E.f3310b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f2360z;
            if (this.f2357w.d()) {
                this.f2358x.c(this.f2357w, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                this.f2358x.c(this.f2357w, elapsedRealtime, j10, false);
            } else if (i11 == 2) {
                this.f2358x.i(this.f2357w, elapsedRealtime, j10);
            } else if (i11 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.A = iOException;
                int a10 = this.f2358x.a(this.f2357w, elapsedRealtime, j10, iOException);
                if (a10 == 3) {
                    this.E.f3311c = this.A;
                } else if (a10 != 2) {
                    int i12 = a10 != 1 ? 1 + this.B : 1;
                    this.B = i12;
                    b(Math.min((i12 - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.C = Thread.currentThread();
            if (!this.f2357w.d()) {
                String simpleName = this.f2357w.getClass().getSimpleName();
                tj.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f2357w.c();
                    tj.b();
                } catch (Throwable th2) {
                    tj.b();
                    throw th2;
                }
            }
            if (this.D) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.D) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            Log.e("LoadTask", "Unexpected error loading stream", e11);
            if (!this.D) {
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (InterruptedException unused) {
            fj.d(this.f2357w.d());
            if (this.D) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e12) {
            Log.e("LoadTask", "Unexpected exception loading stream", e12);
            if (this.D) {
                return;
            }
            obtainMessage(3, new zzaum(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e13);
            if (this.D) {
                return;
            }
            obtainMessage(3, new zzaum(e13)).sendToTarget();
        }
    }
}
