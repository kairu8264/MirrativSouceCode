package ai;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class yt3 implements Choreographer.FrameCallback, Handler.Callback {
    public static final yt3 B = new yt3();
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public volatile long f12729w = C.TIME_UNSET;

    /* renamed from: x  reason: collision with root package name */
    public final Handler f12730x;

    /* renamed from: y  reason: collision with root package name */
    public final HandlerThread f12731y;

    /* renamed from: z  reason: collision with root package name */
    public Choreographer f12732z;

    public yt3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f12731y = handlerThread;
        handlerThread.start();
        Handler N = sb.N(handlerThread.getLooper(), this);
        this.f12730x = N;
        N.sendEmptyMessage(0);
    }

    public static yt3 a() {
        return B;
    }

    public final void b() {
        this.f12730x.sendEmptyMessage(1);
    }

    public final void c() {
        this.f12730x.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f12729w = j10;
        Choreographer choreographer = this.f12732z;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f12732z = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.A + 1;
            this.A = i11;
            if (i11 == 1) {
                Choreographer choreographer = this.f12732z;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.A - 1;
            this.A = i12;
            if (i12 == 0) {
                Choreographer choreographer2 = this.f12732z;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f12729w = C.TIME_UNSET;
            }
            return true;
        }
    }
}
