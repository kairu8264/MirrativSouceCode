package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes3.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long length = extractorInput.getLength();
        long j10 = -1;
        int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i10 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j11 = length;
        }
        int i11 = (int) j11;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z17 = false;
        int i12 = 0;
        boolean z18 = false;
        while (i12 < i11) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            int i13 = 16;
            if (readUnsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                parsableByteArray.setLimit(16);
                readUnsignedInt = parsableByteArray.readLong();
            } else {
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j10) {
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (readUnsignedInt < j12) {
                return z17;
            }
            i12 += i13;
            if (readInt == 1836019574) {
                i11 += (int) readUnsignedInt;
                if (i10 != 0 && i11 > length) {
                    i11 = (int) length;
                }
            } else if (readInt == 1836019558 || readInt == 1836475768) {
                z12 = z17 ? 1 : 0;
                z13 = true;
                z14 = true;
                break;
            } else {
                long j13 = length;
                if ((i12 + readUnsignedInt) - j12 >= i11) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i14 = (int) (readUnsignedInt - j12);
                i12 += i14;
                if (readInt != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i14 != 0) {
                        extractorInput.advancePeekPosition(i14);
                        z18 = z18;
                    }
                } else if (i14 < 8) {
                    return false;
                } else {
                    parsableByteArray.reset(i14);
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            z16 = z18;
                            break;
                        }
                        if (i16 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt(), z11)) {
                            z16 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z16) {
                        return false;
                    }
                    z15 = false;
                    z18 = z16;
                }
                z17 = z15;
                length = j13;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, false, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z10) throws IOException {
        return sniffInternal(extractorInput, false, z10);
    }
}
