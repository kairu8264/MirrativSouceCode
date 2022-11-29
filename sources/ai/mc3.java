package ai;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class mc3 implements kb3 {
    public /* synthetic */ mc3(oe3 oe3Var) {
    }

    @Override // ai.kb3
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // ai.kb3
    public final boolean b() {
        return false;
    }

    @Override // ai.kb3
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // ai.kb3
    public final boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // ai.kb3
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
