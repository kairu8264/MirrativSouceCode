package ai;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes3.dex */
public final class kd extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f6168w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ qd f6169x;

    public kd(qd qdVar, AudioTrack audioTrack) {
        this.f6169x = qdVar;
        this.f6168w = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f6168w.flush();
            this.f6168w.release();
        } finally {
            conditionVariable = this.f6169x.f8878e;
            conditionVariable.open();
        }
    }
}
