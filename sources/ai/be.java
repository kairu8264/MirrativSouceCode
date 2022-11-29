package ai;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class be {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f2296a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaCodec.CryptoInfo.Pattern f2297b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* synthetic */ void a(be beVar, int i10, int i11) {
        beVar.f2297b.set(0, 0);
        beVar.f2296a.setPattern(beVar.f2297b);
    }
}
