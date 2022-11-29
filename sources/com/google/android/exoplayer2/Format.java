package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.UnsupportedMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() { // from class: com.google.android.exoplayer2.Format.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i10) {
            return new Format[i10];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final Class<? extends ExoMediaCrypto> exoMediaCryptoType;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* renamed from: id  reason: collision with root package name */
    public final String f26648id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;
        private String codecs;
        private ColorInfo colorInfo;
        private String containerMimeType;
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private Class<? extends ExoMediaCrypto> exoMediaCryptoType;
        private float frameRate;
        private int height;

        /* renamed from: id  reason: collision with root package name */
        private String f26649id;
        private List<byte[]> initializationData;
        private String label;
        private String language;
        private int maxInputSize;
        private Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int width;

        public Format build() {
            return new Format(this);
        }

        public Builder setAccessibilityChannel(int i10) {
            this.accessibilityChannel = i10;
            return this;
        }

        public Builder setAverageBitrate(int i10) {
            this.averageBitrate = i10;
            return this;
        }

        public Builder setChannelCount(int i10) {
            this.channelCount = i10;
            return this;
        }

        public Builder setCodecs(String str) {
            this.codecs = str;
            return this;
        }

        public Builder setColorInfo(ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public Builder setContainerMimeType(String str) {
            this.containerMimeType = str;
            return this;
        }

        public Builder setDrmInitData(DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public Builder setEncoderDelay(int i10) {
            this.encoderDelay = i10;
            return this;
        }

        public Builder setEncoderPadding(int i10) {
            this.encoderPadding = i10;
            return this;
        }

        public Builder setExoMediaCryptoType(Class<? extends ExoMediaCrypto> cls) {
            this.exoMediaCryptoType = cls;
            return this;
        }

        public Builder setFrameRate(float f10) {
            this.frameRate = f10;
            return this;
        }

        public Builder setHeight(int i10) {
            this.height = i10;
            return this;
        }

        public Builder setId(String str) {
            this.f26649id = str;
            return this;
        }

        public Builder setInitializationData(List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public Builder setLabel(String str) {
            this.label = str;
            return this;
        }

        public Builder setLanguage(String str) {
            this.language = str;
            return this;
        }

        public Builder setMaxInputSize(int i10) {
            this.maxInputSize = i10;
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPcmEncoding(int i10) {
            this.pcmEncoding = i10;
            return this;
        }

        public Builder setPeakBitrate(int i10) {
            this.peakBitrate = i10;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float f10) {
            this.pixelWidthHeightRatio = f10;
            return this;
        }

        public Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public Builder setRoleFlags(int i10) {
            this.roleFlags = i10;
            return this;
        }

        public Builder setRotationDegrees(int i10) {
            this.rotationDegrees = i10;
            return this;
        }

        public Builder setSampleMimeType(String str) {
            this.sampleMimeType = str;
            return this;
        }

        public Builder setSampleRate(int i10) {
            this.sampleRate = i10;
            return this;
        }

        public Builder setSelectionFlags(int i10) {
            this.selectionFlags = i10;
            return this;
        }

        public Builder setStereoMode(int i10) {
            this.stereoMode = i10;
            return this;
        }

        public Builder setSubsampleOffsetUs(long j10) {
            this.subsampleOffsetUs = j10;
            return this;
        }

        public Builder setWidth(int i10) {
            this.width = i10;
            return this;
        }

        public Builder() {
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
        }

        public Builder setId(int i10) {
            this.f26649id = Integer.toString(i10);
            return this;
        }

        private Builder(Format format) {
            this.f26649id = format.f26648id;
            this.label = format.label;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.width = format.width;
            this.height = format.height;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.exoMediaCryptoType = format.exoMediaCryptoType;
        }
    }

    @Deprecated
    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i10, int i11, int i12, List<byte[]> list, int i13, int i14, String str6) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i13).setRoleFlags(i14).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setMetadata(metadata).setContainerMimeType(str3).setSampleMimeType(str4).setInitializationData(list).setChannelCount(i11).setSampleRate(i12).build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, List<byte[]> list, DrmInitData drmInitData, int i14, String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i14).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i12).setSampleRate(i13).build();
    }

    @Deprecated
    public static Format createContainerFormat(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i11).setRoleFlags(i12).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @Deprecated
    public static Format createImageSampleFormat(String str, String str2, int i10, List<byte[]> list, String str3) {
        return new Builder().setId(str).setLanguage(str3).setSelectionFlags(i10).setSampleMimeType(str2).setInitializationData(list).build();
    }

    @Deprecated
    public static Format createSampleFormat(String str, String str2) {
        return new Builder().setId(str).setSampleMimeType(str2).build();
    }

    @Deprecated
    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i11).setRoleFlags(i12).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @Deprecated
    public static Format createTextSampleFormat(String str, String str2, int i10, String str3) {
        return new Builder().setId(str).setLanguage(str3).setSelectionFlags(i10).setSampleMimeType(str2).build();
    }

    @Deprecated
    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, String str5, Metadata metadata, int i10, int i11, int i12, float f10, List<byte[]> list, int i13, int i14) {
        return new Builder().setId(str).setLabel(str2).setSelectionFlags(i13).setRoleFlags(i14).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setMetadata(metadata).setContainerMimeType(str3).setSampleMimeType(str4).setInitializationData(list).setWidth(i11).setHeight(i12).setFrameRate(f10).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i12).setHeight(i13).setFrameRate(f10).build();
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.f26648id);
        sb2.append(", mimeType=");
        sb2.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb2.append(", codecs=");
            sb2.append(format.codecs);
        }
        if (format.width != -1 && format.height != -1) {
            sb2.append(", res=");
            sb2.append(format.width);
            sb2.append("x");
            sb2.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb2.append(", channels=");
            sb2.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.sampleRate);
        }
        if (format.language != null) {
            sb2.append(", language=");
            sb2.append(format.language);
        }
        if (format.label != null) {
            sb2.append(", label=");
            sb2.append(format.label);
        }
        return sb2.toString();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public Format copyWithBitrate(int i10) {
        return buildUpon().setAverageBitrate(i10).setPeakBitrate(i10).build();
    }

    @Deprecated
    public Format copyWithDrmInitData(DrmInitData drmInitData) {
        return buildUpon().setDrmInitData(drmInitData).build();
    }

    public Format copyWithExoMediaCryptoType(Class<? extends ExoMediaCrypto> cls) {
        return buildUpon().setExoMediaCryptoType(cls).build();
    }

    @Deprecated
    public Format copyWithFrameRate(float f10) {
        return buildUpon().setFrameRate(f10).build();
    }

    @Deprecated
    public Format copyWithGaplessInfo(int i10, int i11) {
        return buildUpon().setEncoderDelay(i10).setEncoderPadding(i11).build();
    }

    @Deprecated
    public Format copyWithLabel(String str) {
        return buildUpon().setLabel(str).build();
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format format) {
        return withManifestFormatInfo(format);
    }

    @Deprecated
    public Format copyWithMaxInputSize(int i10) {
        return buildUpon().setMaxInputSize(i10).build();
    }

    @Deprecated
    public Format copyWithMetadata(Metadata metadata) {
        return buildUpon().setMetadata(metadata).build();
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long j10) {
        return buildUpon().setSubsampleOffsetUs(j10).build();
    }

    @Deprecated
    public Format copyWithVideoSize(int i10, int i11) {
        return buildUpon().setWidth(i10).setHeight(i11).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i11 = this.hashCode;
        if (i11 == 0 || (i10 = format.hashCode) == 0 || i11 == i10) {
            return this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.exoMediaCryptoType, format.exoMediaCryptoType) && Util.areEqual(this.f26648id, format.f26648id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
        }
        return false;
    }

    public int getPixelCount() {
        int i10;
        int i11 = this.width;
        if (i11 == -1 || (i10 = this.height) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f26648id;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.language;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.containerMimeType;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sampleMimeType;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31;
            Class<? extends ExoMediaCrypto> cls = this.exoMediaCryptoType;
            this.hashCode = hashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.hashCode;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.initializationData.size(); i10++) {
            if (!Arrays.equals(this.initializationData.get(i10), format.initializationData.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "Format(" + this.f26648id + ", " + this.label + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.codecs + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + "], [" + this.channelCount + ", " + this.sampleRate + "])";
    }

    public Format withManifestFormatInfo(Format format) {
        String str;
        Metadata copyWithAppendedEntriesFrom;
        if (this == format) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str2 = format.f26648id;
        String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i10 = this.averageBitrate;
        if (i10 == -1) {
            i10 = format.averageBitrate;
        }
        int i11 = this.peakBitrate;
        if (i11 == -1) {
            i11 = format.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String codecsOfType = Util.getCodecsOfType(format.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        Metadata metadata = this.metadata;
        if (metadata == null) {
            copyWithAppendedEntriesFrom = format.metadata;
        } else {
            copyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(format.metadata);
        }
        float f10 = this.frameRate;
        if (f10 == -1.0f && trackType == 2) {
            f10 = format.frameRate;
        }
        int i12 = this.selectionFlags | format.selectionFlags;
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(i12).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i10).setPeakBitrate(i11).setCodecs(str5).setMetadata(copyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f10).build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26648id);
        parcel.writeString(this.label);
        parcel.writeString(this.language);
        parcel.writeInt(this.selectionFlags);
        parcel.writeInt(this.roleFlags);
        parcel.writeInt(this.averageBitrate);
        parcel.writeInt(this.peakBitrate);
        parcel.writeString(this.codecs);
        parcel.writeParcelable(this.metadata, 0);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeInt(this.maxInputSize);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.initializationData.get(i11));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeLong(this.subsampleOffsetUs);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(parcel, this.projectionData != null);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i10);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.accessibilityChannel);
    }

    private Format(Builder builder) {
        this.f26648id = builder.f26649id;
        this.label = builder.label;
        this.language = Util.normalizeLanguageCode(builder.language);
        this.selectionFlags = builder.selectionFlags;
        this.roleFlags = builder.roleFlags;
        int i10 = builder.averageBitrate;
        this.averageBitrate = i10;
        int i11 = builder.peakBitrate;
        this.peakBitrate = i11;
        this.bitrate = i11 != -1 ? i11 : i10;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.initializationData = builder.initializationData == null ? Collections.emptyList() : builder.initializationData;
        DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        if (builder.exoMediaCryptoType != null || drmInitData == null) {
            this.exoMediaCryptoType = builder.exoMediaCryptoType;
        } else {
            this.exoMediaCryptoType = UnsupportedMediaCrypto.class;
        }
    }

    @Deprecated
    public static Format createTextSampleFormat(String str, String str2, int i10, String str3, int i11, long j10, List<byte[]> list) {
        return new Builder().setId(str).setLanguage(str3).setSelectionFlags(i10).setSampleMimeType(str2).setInitializationData(list).setSubsampleOffsetUs(j10).setAccessibilityChannel(i11).build();
    }

    @Deprecated
    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12, String str6, int i13) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i11).setRoleFlags(i12).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).setAccessibilityChannel(i13).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i12).setHeight(i13).setFrameRate(f10).setRotationDegrees(i14).setPixelWidthHeightRatio(f11).build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, List<byte[]> list, DrmInitData drmInitData, int i15, String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i15).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i12).setSampleRate(i13).setPcmEncoding(i14).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, float f10, List<byte[]> list, int i14, float f11, byte[] bArr, int i15, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i12).setHeight(i13).setFrameRate(f10).setRotationDegrees(i14).setPixelWidthHeightRatio(f11).setProjectionData(bArr).setStereoMode(i15).setColorInfo(colorInfo).build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<byte[]> list, DrmInitData drmInitData, int i17, String str4, Metadata metadata) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i17).setAverageBitrate(i10).setPeakBitrate(i10).setCodecs(str3).setMetadata(metadata).setSampleMimeType(str2).setMaxInputSize(i11).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i12).setSampleRate(i13).setPcmEncoding(i14).setEncoderDelay(i15).setEncoderPadding(i16).build();
    }

    public Format(Parcel parcel) {
        this.f26648id = parcel.readString();
        this.label = parcel.readString();
        this.language = parcel.readString();
        this.selectionFlags = parcel.readInt();
        this.roleFlags = parcel.readInt();
        int readInt = parcel.readInt();
        this.averageBitrate = readInt;
        int readInt2 = parcel.readInt();
        this.peakBitrate = readInt2;
        this.bitrate = readInt2 != -1 ? readInt2 : readInt;
        this.codecs = parcel.readString();
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.maxInputSize = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.initializationData = new ArrayList(readInt3);
        for (int i10 = 0; i10 < readInt3; i10++) {
            this.initializationData.add((byte[]) Assertions.checkNotNull(parcel.createByteArray()));
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.accessibilityChannel = parcel.readInt();
        this.exoMediaCryptoType = drmInitData != null ? UnsupportedMediaCrypto.class : null;
    }
}
