package ai;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class nd3 implements kb3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7271a;

    /* renamed from: b  reason: collision with root package name */
    public MediaCodecInfo[] f7272b;

    public nd3(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.f7271a = i10;
    }

    @Override // ai.kb3
    public final MediaCodecInfo a(int i10) {
        e();
        return this.f7272b[i10];
    }

    @Override // ai.kb3
    public final boolean b() {
        return true;
    }

    @Override // ai.kb3
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // ai.kb3
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @EnsuresNonNull({"mediaCodecInfos"})
    public final void e() {
        if (this.f7272b == null) {
            this.f7272b = new MediaCodecList(this.f7271a).getCodecInfos();
        }
    }

    @Override // ai.kb3
    public final int zza() {
        e();
        return this.f7272b.length;
    }
}
