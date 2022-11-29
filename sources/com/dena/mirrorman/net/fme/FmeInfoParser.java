package com.dena.mirrorman.net.fme;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.a0;
import xn.o;

/* loaded from: classes2.dex */
public final class FmeInfoParser {
    public static final int $stable = 0;
    private static final int LENGTH_ARTISTS = 2;
    private static final int LENGTH_ARTISTS_READING = 2;
    private static final int LENGTH_AUTHOR = 2;
    private static final int LENGTH_COMPOSER = 2;
    private static final int LENGTH_JASRAC_CODE = 2;
    private static final int LENGTH_RHYTHM_TRACK = 4;
    private static final int LENGTH_SONG_TITLE = 2;
    private static final int LENGTH_SONG_TITLE_READING = 2;
    private static final int LENGTH_SONG_TYPE = 2;
    private static final int LENGTH_START_LYRICS = 2;
    private static final int LENGTH_TOTAL_TIME = 2;
    private static final int LENGTH_VOCAL_TRACK = 4;
    private static final int OFFSET_ARTISTS = 4;
    private static final int OFFSET_ARTISTS_READING = 12;
    private static final int OFFSET_AUTHOR = 6;
    private static final int OFFSET_COMPOSER = 8;
    private static final int OFFSET_JASRAC_CODE = 14;
    private static final int OFFSET_RHYTHM_TRACK = 24;
    private static final int OFFSET_SONG_TITLE = 2;
    private static final int OFFSET_SONG_TITLE_READING = 10;
    private static final int OFFSET_SONG_TYPE = 0;
    private static final int OFFSET_START_LYRICS = 16;
    private static final int OFFSET_TOTAL_TIME = 18;
    private static final int OFFSET_VOCAL_TRACK = 20;
    public static final Companion Companion = new Companion(null);
    private static final Charset SJIS = Charset.forName("Shift-JIS");

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final String getArtists(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 4, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final String getArtistsReading(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 12, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final String getAuthor(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 6, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final byte[] getBytesUntilZero(byte[] bArr, int i10) {
            List<Byte> C = o.C(bArr, i10);
            return a0.x0(C.subList(0, C.indexOf((byte) 0)));
        }

        private final String getComposer(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 8, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
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

        private final String getJasracCode(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 14, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private static /* synthetic */ void getLENGTH_RHYTHM_TRACK$annotations() {
        }

        private static /* synthetic */ void getLENGTH_VOCAL_TRACK$annotations() {
        }

        private final List<Boolean> getRhythmTrack(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            Companion companion = FmeInfoParser.Companion;
            arrayList.addAll(companion.getFlags(FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 24, 2))));
            arrayList.addAll(companion.getFlags(FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 26, 2))));
            return arrayList;
        }

        private final String getSongTitle(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 2, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final SongType getSongType(byte[] bArr) {
            int parseIntFromBytes = FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 0, 2));
            if (parseIntFromBytes != 0) {
                if (parseIntFromBytes != 1) {
                    if (parseIntFromBytes != 16384) {
                        if (parseIntFromBytes != 16385) {
                            switch (parseIntFromBytes) {
                                case 32768:
                                    return SongType.ENKA_MALE_MALE;
                                case 32769:
                                    return SongType.POPS_MALE_MALE;
                                default:
                                    switch (parseIntFromBytes) {
                                        case 49152:
                                            return SongType.ENKA_FEMALE_FEMALE;
                                        case 49153:
                                            return SongType.POPS_FEMALE_FEMALE;
                                        default:
                                            return SongType.UNKNOWN;
                                    }
                            }
                        }
                        return SongType.POPS_MALE_FEMALE;
                    }
                    return SongType.ENKA_MALE_FEMALE;
                }
                return SongType.POPS_SOLO;
            }
            return SongType.ENKA_SOLO;
        }

        private final String getSontTitleReading(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 10, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final String getStartLyrics(byte[] bArr) {
            byte[] bytesUntilZero = getBytesUntilZero(bArr, FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 16, 2)));
            Charset charset = FmeInfoParser.SJIS;
            p.g(charset, "SJIS");
            return new String(bytesUntilZero, charset);
        }

        private final int getTotalTime(byte[] bArr) {
            return FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 18, 2));
        }

        private final List<Boolean> getVocalTrack(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            Companion companion = FmeInfoParser.Companion;
            arrayList.addAll(companion.getFlags(FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 20, 2))));
            arrayList.addAll(companion.getFlags(FmeParserKt.parseIntFromBytes(FmeParserKt.getBytes(bArr, 22, 2))));
            return arrayList;
        }

        public final FmeInfo parse(byte[] bArr) {
            p.h(bArr, "bytes");
            return new FmeInfo(getSongType(bArr), getSongTitle(bArr), getArtists(bArr), getAuthor(bArr), getComposer(bArr), getSontTitleReading(bArr), getArtistsReading(bArr), getJasracCode(bArr), getStartLyrics(bArr), getTotalTime(bArr), getVocalTrack(bArr), getRhythmTrack(bArr));
        }
    }
}
