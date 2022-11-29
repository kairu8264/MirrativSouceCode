package com.dena.mirrorman.net.fme;

import android.content.Context;
import android.util.Log;
import java.io.InputStream;
import jo.h;
import jo.p;
import so.c;

/* loaded from: classes2.dex */
public final class FmeParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final int LENGTH_ID = 6;
    private static final int LENGTH_INFO = 4;
    private static final int LENGTH_LYRICS = 4;
    private static final int LENGTH_TIMING = 4;
    private static final int OFFSET_ID = 0;
    private static final int OFFSET_INFO = 6;
    private static final int OFFSET_LYRICS = 10;
    private static final int OFFSET_TIMING = 14;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final byte[] readFile(Context context, String str) {
            byte[] bArr = new byte[0];
            try {
                InputStream open = context.getAssets().open(str);
                p.g(open, "context.assets.open(path)");
                byte[] bArr2 = new byte[1024];
                int read = open.read(bArr2);
                while (read != -1) {
                    byte[] bArr3 = new byte[bArr.length + read];
                    int length = bArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        bArr3[i10] = bArr[i10];
                    }
                    for (int i11 = 0; i11 < 1024; i11++) {
                        byte b10 = bArr2[i11];
                        if (i11 > read - 1) {
                            break;
                        }
                        bArr3[bArr.length + i11] = b10;
                    }
                    read = open.read(bArr2);
                    bArr = bArr3;
                }
                return bArr;
            } catch (Exception e10) {
                Log.e("FmeParser", e10.getMessage(), e10);
                return new byte[0];
            }
        }

        public final FmeData parse(Context context, String str) {
            p.h(context, "context");
            p.h(str, "path");
            return parse(readFile(context, str));
        }

        public final FmeData parse(byte[] bArr) {
            p.h(bArr, "bytes");
            int parseIntFromBytes = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 6, 4));
            int parseIntFromBytes2 = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 10, 4));
            int parseIntFromBytes3 = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 14, 4));
            return new FmeData(new String(FmeParserKt.getBytes(bArr, 0, 6), c.f52772b), FmeInfoParser.Companion.parse(FmeParserKt.getBytes(bArr, parseIntFromBytes, parseIntFromBytes2 - parseIntFromBytes)), FmeLyricsParser.Companion.parse(FmeParserKt.getBytes(bArr, parseIntFromBytes2, parseIntFromBytes3 - parseIntFromBytes2)), FmeTimingParser.Companion.parse(FmeParserKt.getBytes(bArr, parseIntFromBytes3, bArr.length - parseIntFromBytes3)));
        }
    }
}
