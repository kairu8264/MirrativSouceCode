package com.dena.mirrorman.net.fme;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import kotlin.NoWhenBranchMatchedException;
import xn.a0;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeLyricsBlockParser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FontType.values().length];
                iArr[FontType.SJIS_CODE.ordinal()] = 1;
                iArr[FontType.KS_CODE.ordinal()] = 2;
                iArr[FontType.GBK_CODE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final int getAfterColor(byte[] bArr) {
            return FmeParserKt.getBytes(bArr, 9, 1)[0];
        }

        private final int getAfterContoursColor(byte[] bArr) {
            return FmeParserKt.getBytes(bArr, 11, 1)[0];
        }

        private final int getBeforeColor(byte[] bArr) {
            return FmeParserKt.getBytes(bArr, 8, 1)[0];
        }

        private final int getBeforeContoursColor(byte[] bArr) {
            return FmeParserKt.getBytes(bArr, 10, 1)[0];
        }

        private final ChangeColorFlag getChangeColorFlg(byte[] bArr) {
            int parseIntFromBytes = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 2, 2));
            if (parseIntFromBytes != 0) {
                if (parseIntFromBytes != 1) {
                    if (parseIntFromBytes != 255) {
                        return ChangeColorFlag.NORMAL_COLOR;
                    }
                    return ChangeColorFlag.NOT_CHANGE;
                }
                return ChangeColorFlag.SUB_COLOR;
            }
            return ChangeColorFlag.NORMAL_COLOR;
        }

        private final List<CharaData> getCharaData(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            int charaLength = FmeLyricsBlockParser.Companion.getCharaLength(bArr);
            int i10 = 14;
            for (int i11 = 0; i11 < charaLength; i11++) {
                Companion companion = FmeLyricsBlockParser.Companion;
                FontType fontType = companion.getFontType(FmeParserKt.getBytes(bArr, i10, 1)[0]);
                byte[] U = o.U(FmeParserKt.getBytes(bArr, i10 + 1, 2));
                if (U[0] == 0) {
                    U = a0.x0(o.C(U, 1));
                }
                if (U.length != 1 && U[1] == 0) {
                    U = a0.x0(a0.Q(o.T(U), 1));
                }
                arrayList.add(new CharaData(fontType, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, i10 + 3, 2)), new String(U, companion.getCharset(fontType))));
                i10 += 5;
            }
            return arrayList;
        }

        private final int getCharaLength(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 12, 2));
        }

        private final Charset getCharset(FontType fontType) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[fontType.ordinal()];
            if (i10 == 1) {
                Charset forName = Charset.forName("Shift-JIS");
                p.g(forName, "forName(\"Shift-JIS\")");
                return forName;
            } else if (i10 == 2) {
                Charset forName2 = Charset.forName("Shift-JIS");
                p.g(forName2, "forName(\"Shift-JIS\")");
                return forName2;
            } else if (i10 == 3) {
                Charset forName3 = Charset.forName("GBK");
                p.g(forName3, "forName(\"GBK\")");
                return forName3;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        private final FontType getFontType(byte b10) {
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        return FontType.SJIS_CODE;
                    }
                    return FontType.GBK_CODE;
                }
                return FontType.KS_CODE;
            }
            return FontType.SJIS_CODE;
        }

        private final int getPositionX(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 4, 2));
        }

        private final int getPositionY(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 6, 2));
        }

        private final int getRubyBlockLength(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, getRubyBlockLengthOffset(bArr), 2));
        }

        private final int getRubyBlockLengthOffset(byte[] bArr) {
            return (getCharaLength(bArr) * 5) + 14;
        }

        private final List<RubyData> getRubyData(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            Companion companion = FmeLyricsBlockParser.Companion;
            int rubyBlockLengthOffset = companion.getRubyBlockLengthOffset(bArr) + 2;
            int rubyBlockLength = companion.getRubyBlockLength(bArr);
            if (rubyBlockLength != 0) {
                for (int i10 = 0; i10 < rubyBlockLength; i10++) {
                    int parseIntFromBytes = (FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, rubyBlockLengthOffset, 2)) * 2) + 4;
                    arrayList.add(FmeLyricsRubyBlockParser.Companion.parse(FmeParserKt.getBytes(bArr, rubyBlockLengthOffset, parseIntFromBytes)));
                    rubyBlockLengthOffset += parseIntFromBytes;
                }
            }
            return arrayList;
        }

        public final FmeLyricsData parser(byte[] bArr) {
            p.h(bArr, "bytes");
            return new FmeLyricsData(getChangeColorFlg(bArr), getPositionX(bArr), getPositionY(bArr), getBeforeColor(bArr), getAfterColor(bArr), getBeforeContoursColor(bArr), getAfterContoursColor(bArr), getCharaLength(bArr), getCharaData(bArr), getRubyData(bArr));
        }
    }
}
