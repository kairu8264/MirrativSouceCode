package ai;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class s52 extends AudioTrack.StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u72 f9733a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t62 f9734b;

    public s52(t62 t62Var, u72 u72Var) {
        this.f9734b = t62Var;
        this.f9733a = u72Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        gn1 gn1Var;
        boolean z10;
        gn1 gn1Var2;
        audioTrack2 = this.f9734b.f10159c.f10632n;
        u9.d(audioTrack == audioTrack2);
        gn1Var = this.f9734b.f10159c.f10629k;
        if (gn1Var != null) {
            z10 = this.f9734b.f10159c.I;
            if (z10) {
                gn1Var2 = this.f9734b.f10159c.f10629k;
                gn1Var2.zza();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        gn1 gn1Var;
        boolean z10;
        gn1 gn1Var2;
        audioTrack2 = this.f9734b.f10159c.f10632n;
        u9.d(audioTrack == audioTrack2);
        gn1Var = this.f9734b.f10159c.f10629k;
        if (gn1Var != null) {
            z10 = this.f9734b.f10159c.I;
            if (z10) {
                gn1Var2 = this.f9734b.f10159c.f10629k;
                gn1Var2.zza();
            }
        }
    }
}
