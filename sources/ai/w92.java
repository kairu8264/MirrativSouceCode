package ai;

/* loaded from: classes3.dex */
public final class w92 implements gn1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yb2 f11523a;

    public /* synthetic */ w92(yb2 yb2Var, xa2 xa2Var) {
        this.f11523a = yb2Var;
    }

    @Override // ai.gn1
    public final void a(Exception exc) {
        oa.b("MediaCodecAudioRenderer", "Audio sink error", exc);
        yb2.I0(this.f11523a).i(exc);
    }

    @Override // ai.gn1
    public final void zza() {
        if (yb2.L0(this.f11523a) != null) {
            yb2.L0(this.f11523a).zzb();
        }
    }
}
