package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import lk.r;

/* loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final List<Format> closedCaptionFormats;
    private final int flags;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    private SeiReader buildSeiReader(TsPayloadReader.EsInfo esInfo) {
        return new SeiReader(getClosedCaptionFormats(esInfo));
    }

    private UserDataReader buildUserDataReader(TsPayloadReader.EsInfo esInfo) {
        return new UserDataReader(getClosedCaptionFormats(esInfo));
    }

    private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i10;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.descriptorBytes);
        List<Format> list = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                list = new ArrayList<>();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                    String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z10 = (readUnsignedByte3 & 128) != 0;
                    if (z10) {
                        i10 = readUnsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte readUnsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    List<byte[]> list2 = null;
                    if (z10) {
                        list2 = CodecSpecificDataUtil.buildCea708InitializationData((readUnsignedByte4 & 64) != 0);
                    }
                    list.add(new Format.Builder().setSampleMimeType(str).setLanguage(readString).setAccessibilityChannel(i10).setInitializationData(list2).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return list;
    }

    private boolean isSet(int i10) {
        return (i10 & this.flags) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public TsPayloadReader createPayloadReader(int i10, TsPayloadReader.EsInfo esInfo) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new PesReader(new MpegAudioReader(esInfo.language));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (isSet(4)) {
                        return null;
                    }
                    return new PesReader(new H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 != 129) {
                                        if (i10 != 130) {
                                            if (i10 == 134) {
                                                if (isSet(16)) {
                                                    return null;
                                                }
                                                return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_SCTE35));
                                            } else if (i10 != 135) {
                                                switch (i10) {
                                                    case 15:
                                                        if (isSet(2)) {
                                                            return null;
                                                        }
                                                        return new PesReader(new AdtsReader(false, esInfo.language));
                                                    case 16:
                                                        return new PesReader(new H263Reader(buildUserDataReader(esInfo)));
                                                    case 17:
                                                        if (isSet(2)) {
                                                            return null;
                                                        }
                                                        return new PesReader(new LatmReader(esInfo.language));
                                                    default:
                                                        return null;
                                                }
                                            }
                                        } else if (!isSet(64)) {
                                            return null;
                                        }
                                    }
                                    return new PesReader(new Ac3Reader(esInfo.language));
                                }
                                return new SectionReader(new PassthroughSectionPayloadReader(MimeTypes.APPLICATION_AIT));
                            }
                            return new PesReader(new Ac4Reader(esInfo.language));
                        }
                        return new PesReader(new DtsReader(esInfo.language));
                    }
                    return new PesReader(new DvbSubtitleReader(esInfo.dvbSubtitleInfos));
                } else {
                    return new PesReader(new H265Reader(buildSeiReader(esInfo)));
                }
            }
            return new PesReader(new Id3Reader());
        }
        return new PesReader(new H262Reader(buildUserDataReader(esInfo)));
    }

    public DefaultTsPayloadReaderFactory(int i10) {
        this(i10, r.A());
    }

    public DefaultTsPayloadReaderFactory(int i10, List<Format> list) {
        this.flags = i10;
        this.closedCaptionFormats = list;
    }
}
