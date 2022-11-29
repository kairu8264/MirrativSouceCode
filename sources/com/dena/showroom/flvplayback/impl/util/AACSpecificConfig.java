package com.dena.showroom.flvplayback.impl.util;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.util.List;

/* loaded from: classes3.dex */
public final class AACSpecificConfig {
    public static final List<Integer> AAC_SAMPLING_FREQUENCIES = ImmutableCollections.seq(96000, 88200, 64000, Integer.valueOf((int) OpusUtil.SAMPLE_RATE), Integer.valueOf((int) AACEncoder.SAMPLING_RATE), 32000, 24000, 22050, Integer.valueOf((int) AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND), 12000, 11025, 8000, 7350);

    /* renamed from: d  reason: collision with root package name */
    public static final List<Integer> f26601d = ImmutableCollections.seq(0, 1, 2, 3, 4, 5, 6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f26602a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26603b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26604c;

    public AACSpecificConfig(int i10, int i11, int i12) {
        this.f26602a = i10;
        this.f26603b = i11;
        this.f26604c = i12;
    }

    public static AACSpecificConfig parse(byte[] bArr) {
        if (bArr.length >= 2) {
            Bytes.dumpHex(bArr);
            int i10 = (bArr[0] & 248) >>> 3;
            if (i10 != 6) {
                int i11 = ((bArr[0] & 7) << 1) | ((bArr[1] & 128) >>> 7);
                List<Integer> list = AAC_SAMPLING_FREQUENCIES;
                if (i11 < list.size()) {
                    int i12 = (bArr[1] & 120) >>> 3;
                    List<Integer> list2 = f26601d;
                    if (i12 < list2.size()) {
                        return new AACSpecificConfig(i10, list2.get(i12).intValue(), list.get(i11).intValue());
                    }
                    throw new IllegalArgumentException("channel_configuration");
                }
                throw new IllegalArgumentException("sampling_frequency_index");
            }
            throw new IllegalArgumentException("object_type == 6");
        }
        throw new IllegalArgumentException("b.length < 2");
    }

    public int getChannelCount() {
        return this.f26603b;
    }

    public int getObjectType() {
        return this.f26602a;
    }

    public int getSamplingFrequency() {
        return this.f26604c;
    }

    public String toString() {
        return "AACSpecificConfig{objectType=" + this.f26602a + ", channelCount=" + this.f26603b + ", samplingFrequency=" + this.f26604c + '}';
    }
}
