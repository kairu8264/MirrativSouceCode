package ai;

import com.google.android.exoplayer2.SimpleExoPlayer;

/* loaded from: classes3.dex */
public final class i4 implements t6 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q4 f5113a;

    public i4(q4 q4Var) {
        this.f5113a = q4Var;
    }

    @Override // ai.t6
    public final void a(long j10) {
        if (j10 >= SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
            this.f5113a.f8805a0 = true;
        }
    }

    @Override // ai.t6
    public final void zzb() {
        ha haVar;
        haVar = this.f5113a.D;
        haVar.E(2);
    }
}
