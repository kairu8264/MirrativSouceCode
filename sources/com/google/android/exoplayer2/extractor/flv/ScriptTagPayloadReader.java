package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {
    private static final int AMF_TYPE_BOOLEAN = 1;
    private static final int AMF_TYPE_DATE = 11;
    private static final int AMF_TYPE_ECMA_ARRAY = 8;
    private static final int AMF_TYPE_END_MARKER = 9;
    private static final int AMF_TYPE_NUMBER = 0;
    private static final int AMF_TYPE_OBJECT = 3;
    private static final int AMF_TYPE_STRICT_ARRAY = 10;
    private static final int AMF_TYPE_STRING = 2;
    private static final String KEY_DURATION = "duration";
    private static final String KEY_FILE_POSITIONS = "filepositions";
    private static final String KEY_KEY_FRAMES = "keyframes";
    private static final String KEY_TIMES = "times";
    private static final String NAME_METADATA = "onMetaData";
    private long durationUs;
    private long[] keyFrameTagPositions;
    private long[] keyFrameTimesUs;

    public ScriptTagPayloadReader() {
        super(new DummyTrackOutput());
        this.durationUs = C.TIME_UNSET;
        this.keyFrameTimesUs = new long[0];
        this.keyFrameTagPositions = new long[0];
    }

    private static Boolean readAmfBoolean(ParsableByteArray parsableByteArray) {
        return Boolean.valueOf(parsableByteArray.readUnsignedByte() == 1);
    }

    private static Object readAmfData(ParsableByteArray parsableByteArray, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                return readAmfDate(parsableByteArray);
                            }
                            return readAmfStrictArray(parsableByteArray);
                        }
                        return readAmfEcmaArray(parsableByteArray);
                    }
                    return readAmfObject(parsableByteArray);
                }
                return readAmfString(parsableByteArray);
            }
            return readAmfBoolean(parsableByteArray);
        }
        return readAmfDouble(parsableByteArray);
    }

    private static Date readAmfDate(ParsableByteArray parsableByteArray) {
        Date date = new Date((long) readAmfDouble(parsableByteArray).doubleValue());
        parsableByteArray.skipBytes(2);
        return date;
    }

    private static Double readAmfDouble(ParsableByteArray parsableByteArray) {
        return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
    }

    private static HashMap<String, Object> readAmfEcmaArray(ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap<String, Object> hashMap = new HashMap<>(readUnsignedIntToInt);
        for (int i10 = 0; i10 < readUnsignedIntToInt; i10++) {
            String readAmfString = readAmfString(parsableByteArray);
            Object readAmfData = readAmfData(parsableByteArray, readAmfType(parsableByteArray));
            if (readAmfData != null) {
                hashMap.put(readAmfString, readAmfData);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> readAmfObject(ParsableByteArray parsableByteArray) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String readAmfString = readAmfString(parsableByteArray);
            int readAmfType = readAmfType(parsableByteArray);
            if (readAmfType == 9) {
                return hashMap;
            }
            Object readAmfData = readAmfData(parsableByteArray, readAmfType);
            if (readAmfData != null) {
                hashMap.put(readAmfString, readAmfData);
            }
        }
    }

    private static ArrayList<Object> readAmfStrictArray(ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        ArrayList<Object> arrayList = new ArrayList<>(readUnsignedIntToInt);
        for (int i10 = 0; i10 < readUnsignedIntToInt; i10++) {
            Object readAmfData = readAmfData(parsableByteArray, readAmfType(parsableByteArray));
            if (readAmfData != null) {
                arrayList.add(readAmfData);
            }
        }
        return arrayList;
    }

    private static String readAmfString(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return new String(parsableByteArray.getData(), position, readUnsignedShort);
    }

    private static int readAmfType(ParsableByteArray parsableByteArray) {
        return parsableByteArray.readUnsignedByte();
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public long[] getKeyFrameTagPositions() {
        return this.keyFrameTagPositions;
    }

    public long[] getKeyFrameTimesUs() {
        return this.keyFrameTimesUs;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parseHeader(ParsableByteArray parsableByteArray) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parsePayload(ParsableByteArray parsableByteArray, long j10) {
        if (readAmfType(parsableByteArray) == 2 && NAME_METADATA.equals(readAmfString(parsableByteArray)) && readAmfType(parsableByteArray) == 8) {
            HashMap<String, Object> readAmfEcmaArray = readAmfEcmaArray(parsableByteArray);
            Object obj = readAmfEcmaArray.get(KEY_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.durationUs = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = readAmfEcmaArray.get(KEY_KEY_FRAMES);
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get(KEY_FILE_POSITIONS);
                Object obj4 = map.get(KEY_TIMES);
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.keyFrameTimesUs = new long[size];
                    this.keyFrameTagPositions = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.keyFrameTimesUs[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.keyFrameTagPositions[i10] = ((Double) obj5).longValue();
                        } else {
                            this.keyFrameTimesUs = new long[0];
                            this.keyFrameTagPositions = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
