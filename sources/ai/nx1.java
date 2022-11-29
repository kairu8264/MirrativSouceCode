package ai;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes3.dex */
public final class nx1 extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f7559w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u72 f7560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(u72 u72Var, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f7560x = u72Var;
        this.f7559w = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f7559w.flush();
            this.f7559w.release();
        } finally {
            conditionVariable = this.f7560x.f10623e;
            conditionVariable.open();
        }
    }
}
