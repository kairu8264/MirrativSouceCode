package com.mirrativ.llstream.encoder;

import com.mirrativ.llstream.decoder.a;
import jo.h;

/* loaded from: classes4.dex */
public final class AudioEncoderSetting {
    private int bitrate;
    private int channelCount;
    private int samplingRate;

    public AudioEncoderSetting() {
        this(0, 0, 0, 7, null);
    }

    public AudioEncoderSetting(int i10, int i11, int i12) {
        this.samplingRate = i10;
        this.channelCount = i11;
        this.bitrate = i12;
    }

    public static /* synthetic */ AudioEncoderSetting copy$default(AudioEncoderSetting audioEncoderSetting, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = audioEncoderSetting.samplingRate;
        }
        if ((i13 & 2) != 0) {
            i11 = audioEncoderSetting.channelCount;
        }
        if ((i13 & 4) != 0) {
            i12 = audioEncoderSetting.bitrate;
        }
        return audioEncoderSetting.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.samplingRate;
    }

    public final int component2() {
        return this.channelCount;
    }

    public final int component3() {
        return this.bitrate;
    }

    public final AudioEncoderSetting copy(int i10, int i11, int i12) {
        return new AudioEncoderSetting(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioEncoderSetting) {
            AudioEncoderSetting audioEncoderSetting = (AudioEncoderSetting) obj;
            return this.samplingRate == audioEncoderSetting.samplingRate && this.channelCount == audioEncoderSetting.channelCount && this.bitrate == audioEncoderSetting.bitrate;
        }
        return false;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getChannelCount() {
        return this.channelCount;
    }

    public final int getSamplingRate() {
        return this.samplingRate;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.channelCount);
        return Integer.hashCode(this.bitrate) + ((hashCode + (Integer.hashCode(this.samplingRate) * 31)) * 31);
    }

    public final void setBitrate(int i10) {
        this.bitrate = i10;
    }

    public final void setChannelCount(int i10) {
        this.channelCount = i10;
    }

    public final void setSamplingRate(int i10) {
        this.samplingRate = i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("AudioEncoderSetting(samplingRate=");
        a10.append(this.samplingRate);
        a10.append(", channelCount=");
        a10.append(this.channelCount);
        a10.append(", bitrate=");
        a10.append(this.bitrate);
        a10.append(')');
        return a10.toString();
    }

    public /* synthetic */ AudioEncoderSetting(int i10, int i11, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? AACEncoder.SAMPLING_RATE : i10, (i13 & 2) != 0 ? 1 : i11, (i13 & 4) != 0 ? 64000 : i12);
    }
}
