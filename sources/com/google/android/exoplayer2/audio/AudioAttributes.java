package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new Builder().build();
    public final int allowedCapturePolicy;
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy);
        }

        public Builder setAllowedCapturePolicy(int i10) {
            this.allowedCapturePolicy = i10;
            return this;
        }

        public Builder setContentType(int i10) {
            this.contentType = i10;
            return this;
        }

        public Builder setFlags(int i10) {
            this.flags = i10;
            return this;
        }

        public Builder setUsage(int i10) {
            this.usage = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy;
    }

    public android.media.AudioAttributes getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
            if (Util.SDK_INT >= 29) {
                usage.setAllowedCapturePolicy(this.allowedCapturePolicy);
            }
            this.audioAttributesV21 = usage.build();
        }
        return this.audioAttributesV21;
    }

    public int hashCode() {
        return ((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy;
    }

    private AudioAttributes(int i10, int i11, int i12, int i13) {
        this.contentType = i10;
        this.flags = i11;
        this.usage = i12;
        this.allowedCapturePolicy = i13;
    }
}
