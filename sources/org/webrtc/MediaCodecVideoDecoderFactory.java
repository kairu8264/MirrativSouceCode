package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.EglBase;

/* loaded from: classes4.dex */
class MediaCodecVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "MediaCodecVideoDecoderFactory";
    private final String[] prefixBlacklist;
    private final String[] prefixWhitelist;
    private final EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(EglBase.Context context, String[] strArr, String[] strArr2) {
        this.sharedContext = context;
        this.prefixWhitelist = (String[]) Arrays.copyOf(strArr, strArr.length);
        this.prefixBlacklist = (String[]) Arrays.copyOf(strArr2, strArr2.length);
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        MediaCodecInfo mediaCodecInfo;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        for (int i10 = 0; i10 < MediaCodecList.getCodecCount(); i10++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve decoder codec info", e10);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private boolean isBlacklisted(String str) {
        for (String str2 : this.prefixBlacklist) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21 || !name.startsWith(MediaCodecUtils.QCOM_PREFIX)) {
            return i10 >= 23 && name.startsWith(MediaCodecUtils.EXYNOS_PREFIX);
        }
        return true;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        String name = mediaCodecInfo.getName();
        return MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType) && MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null && isWhitelisted(name) && !isBlacklisted(name);
    }

    private boolean isWhitelisted(String str) {
        for (String str2 : this.prefixWhitelist) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecType valueOf = VideoCodecType.valueOf(videoCodecInfo.getName());
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), findCodecForType.getName(), valueOf, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(valueOf.mimeType())).intValue(), this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.VP8, VideoCodecType.VP9, VideoCodecType.H264};
        for (int i10 = 0; i10 < 3; i10++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i10];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecType);
            if (findCodecForType != null) {
                String name = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
