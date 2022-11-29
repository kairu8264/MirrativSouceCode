package ai;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class lg implements kg {
    public /* synthetic */ lg(ng ngVar) {
    }

    @Override // ai.kg
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // ai.kg
    public final boolean b() {
        return false;
    }

    @Override // ai.kg
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return MimeTypes.VIDEO_H264.equals(str);
    }

    @Override // ai.kg
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
