package ai;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes3.dex */
public final class mg implements kg {

    /* renamed from: a  reason: collision with root package name */
    public final int f6933a;

    /* renamed from: b  reason: collision with root package name */
    public MediaCodecInfo[] f6934b;

    public mg(boolean z10) {
        this.f6933a = z10 ? 1 : 0;
    }

    @Override // ai.kg
    public final MediaCodecInfo a(int i10) {
        d();
        return this.f6934b[i10];
    }

    @Override // ai.kg
    public final boolean b() {
        return true;
    }

    @Override // ai.kg
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final void d() {
        if (this.f6934b == null) {
            this.f6934b = new MediaCodecList(this.f6933a).getCodecInfos();
        }
    }

    @Override // ai.kg
    public final int zza() {
        d();
        return this.f6934b.length;
    }
}
