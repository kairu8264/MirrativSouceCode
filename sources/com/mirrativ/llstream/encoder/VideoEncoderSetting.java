package com.mirrativ.llstream.encoder;

import android.util.Size;
import com.mirrativ.llstream.decoder.a;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class VideoEncoderSetting {
    private int bitrate;
    private int frameRate;
    private int keyInterval;
    private Size resolution;

    public VideoEncoderSetting() {
        this(null, 0, 0, 0, 15, null);
    }

    public VideoEncoderSetting(Size size, int i10, int i11, int i12) {
        p.h(size, "resolution");
        this.resolution = size;
        this.frameRate = i10;
        this.keyInterval = i11;
        this.bitrate = i12;
    }

    public static /* synthetic */ VideoEncoderSetting copy$default(VideoEncoderSetting videoEncoderSetting, Size size, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            size = videoEncoderSetting.resolution;
        }
        if ((i13 & 2) != 0) {
            i10 = videoEncoderSetting.frameRate;
        }
        if ((i13 & 4) != 0) {
            i11 = videoEncoderSetting.keyInterval;
        }
        if ((i13 & 8) != 0) {
            i12 = videoEncoderSetting.bitrate;
        }
        return videoEncoderSetting.copy(size, i10, i11, i12);
    }

    public final Size component1() {
        return this.resolution;
    }

    public final int component2() {
        return this.frameRate;
    }

    public final int component3() {
        return this.keyInterval;
    }

    public final int component4() {
        return this.bitrate;
    }

    public final VideoEncoderSetting copy(Size size, int i10, int i11, int i12) {
        p.h(size, "resolution");
        return new VideoEncoderSetting(size, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoEncoderSetting) {
            VideoEncoderSetting videoEncoderSetting = (VideoEncoderSetting) obj;
            return p.c(this.resolution, videoEncoderSetting.resolution) && this.frameRate == videoEncoderSetting.frameRate && this.keyInterval == videoEncoderSetting.keyInterval && this.bitrate == videoEncoderSetting.bitrate;
        }
        return false;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getKeyInterval() {
        return this.keyInterval;
    }

    public final Size getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.frameRate);
        int hashCode2 = Integer.hashCode(this.keyInterval);
        return Integer.hashCode(this.bitrate) + ((hashCode2 + ((hashCode + (this.resolution.hashCode() * 31)) * 31)) * 31);
    }

    public final void setBitrate(int i10) {
        this.bitrate = i10;
    }

    public final void setFrameRate(int i10) {
        this.frameRate = i10;
    }

    public final void setKeyInterval(int i10) {
        this.keyInterval = i10;
    }

    public final void setResolution(Size size) {
        p.h(size, "<set-?>");
        this.resolution = size;
    }

    public String toString() {
        StringBuilder a10 = a.a("VideoEncoderSetting(resolution=");
        a10.append(this.resolution);
        a10.append(", frameRate=");
        a10.append(this.frameRate);
        a10.append(", keyInterval=");
        a10.append(this.keyInterval);
        a10.append(", bitrate=");
        a10.append(this.bitrate);
        a10.append(')');
        return a10.toString();
    }

    public /* synthetic */ VideoEncoderSetting(Size size, int i10, int i11, int i12, int i13, h hVar) {
        this((i13 & 1) != 0 ? new Size(720, 1280) : size, (i13 & 2) != 0 ? 30 : i10, (i13 & 4) != 0 ? 2 : i11, (i13 & 8) != 0 ? 1024000 : i12);
    }
}
