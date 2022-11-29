package ai;

import android.media.AudioTrack;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class t62 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f10157a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    public final AudioTrack.StreamEventCallback f10158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u72 f10159c;

    public t62(u72 u72Var) {
        this.f10159c = u72Var;
        this.f10158b = new s52(this, u72Var);
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(r42.a(this.f10157a), this.f10158b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f10158b);
        this.f10157a.removeCallbacksAndMessages(null);
    }
}
