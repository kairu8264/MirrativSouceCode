package ai;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class r82 implements xc2<s82> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f9373a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9374b;

    public r82(t43 t43Var, Context context) {
        this.f9373a = t43Var;
        this.f9374b = context;
    }

    public final /* synthetic */ s82 a() throws Exception {
        AudioManager audioManager = (AudioManager) this.f9374b.getSystemService("audio");
        return new s82(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), wg.t.i().b(), wg.t.i().d());
    }

    @Override // ai.xc2
    public final s43<s82> zza() {
        return this.f9373a.h(new Callable(this) { // from class: ai.q82

            /* renamed from: a  reason: collision with root package name */
            public final r82 f8850a;

            {
                this.f8850a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8850a.a();
            }
        });
    }
}
