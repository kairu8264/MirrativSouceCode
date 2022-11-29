package com.google.android.exoplayer2.util;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CodecSpecificDataUtil {
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};

    private CodecSpecificDataUtil() {
    }

    public static String buildAvcCodecString(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildHevcCodecStringFromSps(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(24);
        int readBits = parsableNalUnitBitArray.readBits(2);
        boolean readBit = parsableNalUnitBitArray.readBit();
        int readBits2 = parsableNalUnitBitArray.readBits(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (parsableNalUnitBitArray.readBit()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = parsableNalUnitBitArray.readBits(8);
        }
        int readBits3 = parsableNalUnitBitArray.readBits(8);
        Object[] objArr = new Object[5];
        objArr[0] = HEVC_GENERAL_PROFILE_SPACE_STRINGS[readBits];
        objArr[1] = Integer.valueOf(readBits2);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(readBit ? 'H' : 'L');
        objArr[4] = Integer.valueOf(readBits3);
        StringBuilder sb2 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0 && iArr[i12 - 1] == 0) {
            i12--;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    private static int findNalStartCode(byte[] bArr, int i10) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i10 <= length) {
            if (isNalStartCode(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static boolean isNalStartCode(byte[] bArr, int i10) {
        if (bArr.length - i10 <= NAL_START_CODE.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(readUnsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] splitNalUnits(byte[] bArr) {
        if (isNalStartCode(bArr, 0)) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            do {
                arrayList.add(Integer.valueOf(i10));
                i10 = findNalStartCode(bArr, i10 + NAL_START_CODE.length);
            } while (i10 != -1);
            byte[][] bArr2 = new byte[arrayList.size()];
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i11)).intValue();
                int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
                byte[] bArr3 = new byte[intValue2];
                System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
                bArr2[i11] = bArr3;
                i11++;
            }
            return bArr2;
        }
        return null;
    }
}
