package com.dena.mirrorman.net.fme;

import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeLyricsParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final int convert(List<Boolean> list) {
            int i10 = 0;
            int i11 = 0;
            for (Boolean bool : list) {
                if (bool.booleanValue()) {
                    i10 += (int) Math.pow(2.0f, i11);
                }
                i11++;
            }
            return i10;
        }

        private final List<FmeLyricsData> getBlocks(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            int i10 = 30;
            do {
                int parseIntFromBytes = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, i10, 2));
                arrayList.add(FmeLyricsBlockParser.Companion.parser(FmeParserKt.getBytes(bArr, i10, parseIntFromBytes)));
                i10 += parseIntFromBytes;
            } while (bArr.length > i10);
            return arrayList;
        }

        private final List<String> getColors(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 15; i10++) {
                Companion companion = FmeLyricsParser.Companion;
                List<Boolean> flags = companion.getFlags(FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, i10 * 2, 2)));
                int convert = companion.convert(flags.subList(0, 5));
                int convert2 = companion.convert(flags.subList(5, 10));
                int convert3 = companion.convert(flags.subList(10, 15));
                arrayList.add((("#" + companion.toHexString(convert3)) + companion.toHexString(convert2)) + companion.toHexString(convert));
            }
            return arrayList;
        }

        private final List<Boolean> getFlags(int i10) {
            boolean[] zArr = new boolean[16];
            for (int i11 = 0; i11 < 16; i11++) {
                double d10 = 2.0f;
                int i12 = 15 - i11;
                double d11 = i12;
                if (i10 / ((int) Math.pow(d10, d11)) == 1) {
                    i10 -= (int) Math.pow(d10, d11);
                    zArr[i12] = true;
                }
            }
            return o.h0(zArr);
        }

        private final String toHexString(int i10) {
            String hexString = Integer.toHexString((i10 / 31) * 255);
            if (hexString.length() == 2) {
                p.g(hexString, "{\n                result\n            }");
                return hexString;
            }
            return '0' + hexString;
        }

        public final FmeLyrics parse(byte[] bArr) {
            p.h(bArr, "bytes");
            return new FmeLyrics(getColors(bArr), getBlocks(bArr));
        }
    }
}
