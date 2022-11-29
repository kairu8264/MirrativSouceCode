package o4;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import n3.i;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: j  reason: collision with root package name */
    public final Executor f44053j;

    /* renamed from: k  reason: collision with root package name */
    public volatile a<D>.RunnableC0653a f44054k;

    /* renamed from: l  reason: collision with root package name */
    public volatile a<D>.RunnableC0653a f44055l;

    /* renamed from: m  reason: collision with root package name */
    public long f44056m;

    /* renamed from: n  reason: collision with root package name */
    public long f44057n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f44058o;

    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0653a extends c<Void, Void, D> implements Runnable {
        public final CountDownLatch G = new CountDownLatch(1);
        public boolean H;

        public RunnableC0653a() {
        }

        @Override // o4.c
        public void h(D d10) {
            try {
                a.this.y(this, d10);
            } finally {
                this.G.countDown();
            }
        }

        @Override // o4.c
        public void i(D d10) {
            try {
                a.this.z(this, d10);
            } finally {
                this.G.countDown();
            }
        }

        @Override // o4.c
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.D();
            } catch (OperationCanceledException e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.H = false;
            a.this.A();
        }
    }

    public a(Context context) {
        this(context, c.D);
    }

    public void A() {
        if (this.f44055l != null || this.f44054k == null) {
            return;
        }
        if (this.f44054k.H) {
            this.f44054k.H = false;
            this.f44058o.removeCallbacks(this.f44054k);
        }
        if (this.f44056m > 0 && SystemClock.uptimeMillis() < this.f44057n + this.f44056m) {
            this.f44054k.H = true;
            this.f44058o.postAtTime(this.f44054k, this.f44057n + this.f44056m);
            return;
        }
        this.f44054k.c(this.f44053j, null);
    }

    public abstract D B();

    public void C(D d10) {
    }

    public D D() {
        return B();
    }

    @Override // o4.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f44054k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f44054k);
            printWriter.print(" waiting=");
            printWriter.println(this.f44054k.H);
        }
        if (this.f44055l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f44055l);
            printWriter.print(" waiting=");
            printWriter.println(this.f44055l.H);
        }
        if (this.f44056m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i.c(this.f44056m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i.b(this.f44057n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // o4.b
    public boolean l() {
        if (this.f44054k != null) {
            if (!this.f44063e) {
                this.f44066h = true;
            }
            if (this.f44055l != null) {
                if (this.f44054k.H) {
                    this.f44054k.H = false;
                    this.f44058o.removeCallbacks(this.f44054k);
                }
                this.f44054k = null;
                return false;
            } else if (this.f44054k.H) {
                this.f44054k.H = false;
                this.f44058o.removeCallbacks(this.f44054k);
                this.f44054k = null;
                return false;
            } else {
                boolean a10 = this.f44054k.a(false);
                if (a10) {
                    this.f44055l = this.f44054k;
                    x();
                }
                this.f44054k = null;
                return a10;
            }
        }
        return false;
    }

    @Override // o4.b
    public void n() {
        super.n();
        b();
        this.f44054k = new RunnableC0653a();
        A();
    }

    public void x() {
    }

    public void y(a<D>.RunnableC0653a runnableC0653a, D d10) {
        C(d10);
        if (this.f44055l == runnableC0653a) {
            t();
            this.f44057n = SystemClock.uptimeMillis();
            this.f44055l = null;
            e();
            A();
        }
    }

    public void z(a<D>.RunnableC0653a runnableC0653a, D d10) {
        if (this.f44054k != runnableC0653a) {
            y(runnableC0653a, d10);
        } else if (j()) {
            C(d10);
        } else {
            c();
            this.f44057n = SystemClock.uptimeMillis();
            this.f44054k = null;
            f(d10);
        }
    }

    public a(Context context, Executor executor) {
        super(context);
        this.f44057n = -10000L;
        this.f44053j = executor;
    }
}
