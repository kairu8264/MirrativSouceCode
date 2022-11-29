package ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes3.dex */
public final class fk implements Choreographer.FrameCallback, Handler.Callback {
    public static final fk B = new fk();
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public volatile long f4065w;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f4066x;

    /* renamed from: y  reason: collision with root package name */
    public final HandlerThread f4067y;

    /* renamed from: z  reason: collision with root package name */
    public Choreographer f4068z;

    public fk() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f4067y = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f4066x = handler;
        handler.sendEmptyMessage(0);
    }

    public static fk a() {
        return B;
    }

    public final void b() {
        this.f4066x.sendEmptyMessage(1);
    }

    public final void c() {
        this.f4066x.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f4065w = j10;
        this.f4068z.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f4068z = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.A + 1;
            this.A = i11;
            if (i11 == 1) {
                this.f4068z.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.A - 1;
            this.A = i12;
            if (i12 == 0) {
                this.f4068z.removeFrameCallback(this);
                this.f4065w = 0L;
            }
            return true;
        }
    }
}
