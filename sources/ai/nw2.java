package ai;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class nw2 {

    /* renamed from: a  reason: collision with root package name */
    public final pz2 f7546a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaFormat f7547b;

    /* renamed from: c  reason: collision with root package name */
    public final v4 f7548c;

    /* renamed from: d  reason: collision with root package name */
    public final Surface f7549d;

    /* renamed from: e  reason: collision with root package name */
    public final MediaCrypto f7550e = null;

    public nw2(pz2 pz2Var, MediaFormat mediaFormat, v4 v4Var, Surface surface, MediaCrypto mediaCrypto, int i10, boolean z10) {
        this.f7546a = pz2Var;
        this.f7547b = mediaFormat;
        this.f7548c = v4Var;
        this.f7549d = surface;
    }

    public static nw2 a(pz2 pz2Var, MediaFormat mediaFormat, v4 v4Var, MediaCrypto mediaCrypto) {
        return new nw2(pz2Var, mediaFormat, v4Var, null, null, 0, false);
    }

    public static nw2 b(pz2 pz2Var, MediaFormat mediaFormat, v4 v4Var, Surface surface, MediaCrypto mediaCrypto) {
        return new nw2(pz2Var, mediaFormat, v4Var, surface, null, 0, false);
    }
}
