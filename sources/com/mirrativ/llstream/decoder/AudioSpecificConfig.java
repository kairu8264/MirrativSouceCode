package com.mirrativ.llstream.decoder;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes4.dex */
public final class AudioSpecificConfig {
    private final int channelCount;
    private final int frameLength;
    private final int objectType;
    private final int samplingFrequency;
    public static final Companion Companion = new Companion(null);
    private static final List<Integer> AAC_SAMPLING_FREQUENCIES = s.m(96000, 88200, 64000, Integer.valueOf((int) OpusUtil.SAMPLE_RATE), Integer.valueOf((int) AACEncoder.SAMPLING_RATE), 32000, 24000, 22050, Integer.valueOf((int) AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND), 12000, 11025, 8000, 7350);
    private static final List<Integer> AAC_CHANNEL_COUNTS = s.m(0, 1, 2, 3, 4, 5, 6, 8);
    private static final List<Integer> AAC_FRAME_LENGTH = s.m(1024, 960);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final AudioSpecificConfig parse(byte[] bArr) {
            p.h(bArr, "byteArray");
            if (bArr.length >= 2) {
                int b10 = fp.b.b(bArr[0], 248) >>> 3;
                if (b10 != 6) {
                    int b11 = (fp.b.b(bArr[0], 7) << 1) | (fp.b.b(bArr[1], 128) >>> 7);
                    if (b11 < AudioSpecificConfig.AAC_SAMPLING_FREQUENCIES.size()) {
                        int b12 = fp.b.b(bArr[1], 120) >>> 3;
                        if (b12 < AudioSpecificConfig.AAC_CHANNEL_COUNTS.size()) {
                            return new AudioSpecificConfig(b10, ((Number) AudioSpecificConfig.AAC_CHANNEL_COUNTS.get(b12)).intValue(), ((Number) AudioSpecificConfig.AAC_SAMPLING_FREQUENCIES.get(b11)).intValue(), ((Number) AudioSpecificConfig.AAC_FRAME_LENGTH.get(fp.b.b(bArr[1], 1) >>> 2)).intValue());
                        }
                        throw new IllegalArgumentException("channel_configuration".toString());
                    }
                    throw new IllegalArgumentException("sampling_frequency_index".toString());
                }
                throw new IllegalArgumentException("object_type == 6".toString());
            }
            throw new IllegalArgumentException("byteArray.length < 2".toString());
        }
    }

    public AudioSpecificConfig(int i10, int i11, int i12, int i13) {
        this.objectType = i10;
        this.channelCount = i11;
        this.samplingFrequency = i12;
        this.frameLength = i13;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final int getFrameLength() {
        return this.frameLength;
    }

    public final int getObjectType() {
        return this.objectType;
    }

    public final int getSamplingFrequency() {
        return this.samplingFrequency;
    }

    public String toString() {
        StringBuilder a10 = a.a("AudioSpecificConfig{objectType=");
        a10.append(this.objectType);
        a10.append(", channelCount=");
        a10.append(this.channelCount);
        a10.append(", samplingFrequency=");
        a10.append(this.samplingFrequency);
        a10.append(", frameLength=");
        a10.append(this.frameLength);
        a10.append('}');
        return a10.toString();
    }
}
