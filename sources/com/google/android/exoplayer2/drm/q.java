package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.UUID;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ExoMediaDrm.Provider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ q f26842a = new q();

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
    public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
        ExoMediaDrm lambda$static$0;
        lambda$static$0 = FrameworkMediaDrm.lambda$static$0(uuid);
        return lambda$static$0;
    }
}
