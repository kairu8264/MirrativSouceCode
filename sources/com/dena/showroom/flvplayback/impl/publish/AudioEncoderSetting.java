package com.dena.showroom.flvplayback.impl.publish;

import com.mirrativ.llstream.encoder.AACEncoder;

/* loaded from: classes3.dex */
public class AudioEncoderSetting {
    public static final AudioEncoderSetting DEFAULT_SETTING = new AudioEncoderSetting(128000, AACEncoder.SAMPLING_RATE, 1);

    /* renamed from: a  reason: collision with root package name */
    public final int f26578a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26579b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26580c;

    public AudioEncoderSetting(int i10, int i11, int i12) {
        this.f26578a = i10;
        this.f26579b = i11;
        this.f26580c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioEncoderSetting audioEncoderSetting = (AudioEncoderSetting) obj;
        if (this.f26578a != audioEncoderSetting.f26578a) {
            return false;
        }
        return this.f26579b == audioEncoderSetting.f26579b && this.f26580c == audioEncoderSetting.f26580c;
    }

    public int getBps() {
        return this.f26578a;
    }

    public int getChannelCount() {
        return this.f26580c;
    }

    public int getSamplingRate() {
        return this.f26579b;
    }

    public int hashCode() {
        return (((this.f26578a * 31) + this.f26579b) * 31) + this.f26580c;
    }
}
