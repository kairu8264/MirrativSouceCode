package ai;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
public final class zk0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f13019w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ il0 f13020x;

    public zk0(il0 il0Var, MediaPlayer mediaPlayer) {
        this.f13020x = il0Var;
        this.f13019w = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        jl0 jl0Var2;
        il0.L(this.f13020x, this.f13019w);
        jl0Var = this.f13020x.N;
        if (jl0Var != null) {
            jl0Var2 = this.f13020x.N;
            jl0Var2.zzb();
        }
    }
}
