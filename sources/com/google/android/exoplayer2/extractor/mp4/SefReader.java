package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kk.l;

/* loaded from: classes3.dex */
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences = new ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final l COLON_SPLITTER = l.d(':');
    private static final l ASTERISK_SPLITTER = l.d('*');

    /* loaded from: classes3.dex */
    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i10, long j10, int i11) {
            this.dataType = i10;
            this.startOffset = j10;
            this.size = i11;
        }
    }

    private void checkForSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
            return;
        }
        positionHolder.position = extractorInput.getPosition() - (this.tailLength - 12);
        this.readerState = 2;
    }

    private static int nameToDataType(String str) throws ParserException {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return TYPE_SLOW_MOTION_DATA;
            case 1:
                return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
            case 2:
                return TYPE_SUPER_SLOW_MOTION_DATA;
            case 3:
                return TYPE_SUPER_SLOW_DEFLICKERING_ON;
            case 4:
                return TYPE_SUPER_SLOW_MOTION_BGM;
            default:
                throw new ParserException("Invalid SEF name");
        }
    }

    private void readSdrs(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i10 = (this.tailLength - 12) - 8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i10);
        extractorInput.readFully(parsableByteArray.getData(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            parsableByteArray.skipBytes(2);
            short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
            if (readLittleEndianShort != TYPE_SLOW_MOTION_DATA && readLittleEndianShort != TYPE_SUPER_SLOW_MOTION_DATA && readLittleEndianShort != TYPE_SUPER_SLOW_MOTION_BGM && readLittleEndianShort != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && readLittleEndianShort != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                parsableByteArray.skipBytes(8);
            } else {
                this.dataReferences.add(new DataReference(readLittleEndianShort, (length - this.tailLength) - parsableByteArray.readLittleEndianInt(), parsableByteArray.readLittleEndianInt()));
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
            return;
        }
        this.readerState = 3;
        positionHolder.position = this.dataReferences.get(0).startOffset;
    }

    private void readSefData(ExtractorInput extractorInput, List<Metadata.Entry> list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - this.tailLength);
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i10 = 0; i10 < this.dataReferences.size(); i10++) {
            DataReference dataReference = this.dataReferences.get(i10);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int nameToDataType = nameToDataType(parsableByteArray.readString(readLittleEndianInt));
            int i11 = dataReference.size - (readLittleEndianInt + 8);
            if (nameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i11));
            } else if (nameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && nameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && nameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && nameToDataType != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData readSlowMotionData(ParsableByteArray parsableByteArray, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = ASTERISK_SPLITTER.f(parsableByteArray.readString(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List<String> f11 = COLON_SPLITTER.f(f10.get(i11));
            if (f11.size() == 3) {
                try {
                    arrayList.add(new SlowMotionData.Segment(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw new ParserException(e10);
                }
            } else {
                throw new ParserException();
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws IOException {
        int i10 = this.readerState;
        long j10 = 0;
        if (i10 == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            positionHolder.position = j10;
            this.readerState = 1;
        } else if (i10 == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i10 == 2) {
            readSdrs(extractorInput, positionHolder);
        } else if (i10 == 3) {
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }
}
