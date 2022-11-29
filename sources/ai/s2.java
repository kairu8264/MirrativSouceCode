package ai;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class s2 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u2 f9682b;

    public s2(u2 u2Var, Handler handler) {
        this.f9682b = u2Var;
        this.f9681a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f9681a.post(new Runnable(this, i10) { // from class: ai.r2

            /* renamed from: w  reason: collision with root package name */
            public final s2 f9302w;

            /* renamed from: x  reason: collision with root package name */
            public final int f9303x;

            {
                this.f9302w = this;
                this.f9303x = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s2 s2Var = this.f9302w;
                u2.d(s2Var.f9682b, this.f9303x);
            }
        });
    }
}
