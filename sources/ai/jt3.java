package ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class jt3 extends HandlerThread implements Handler.Callback {
    public lt3 A;

    /* renamed from: w  reason: collision with root package name */
    public ca f5923w;

    /* renamed from: x  reason: collision with root package name */
    public Handler f5924x;

    /* renamed from: y  reason: collision with root package name */
    public Error f5925y;

    /* renamed from: z  reason: collision with root package name */
    public RuntimeException f5926z;

    public jt3() {
        super("ExoPlayer:DummySurface");
    }

    public final lt3 a(int i10) {
        boolean z10;
        start();
        this.f5924x = new Handler(getLooper(), this);
        this.f5923w = new ca(this.f5924x, null);
        synchronized (this) {
            z10 = false;
            this.f5924x.obtainMessage(1, i10, 0).sendToTarget();
            while (this.A == null && this.f5926z == null && this.f5925y == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f5926z;
        if (runtimeException == null) {
            Error error = this.f5925y;
            if (error == null) {
                lt3 lt3Var = this.A;
                Objects.requireNonNull(lt3Var);
                return lt3Var;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void b() {
        Handler handler = this.f5924x;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    ca caVar = this.f5923w;
                    Objects.requireNonNull(caVar);
                    caVar.b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                ca caVar2 = this.f5923w;
                Objects.requireNonNull(caVar2);
                caVar2.a(i11);
                this.A = new lt3(this, this.f5923w.c(), i11 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                oa.b("DummySurface", "Failed to initialize dummy surface", e10);
                this.f5925y = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                oa.b("DummySurface", "Failed to initialize dummy surface", e11);
                this.f5926z = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
