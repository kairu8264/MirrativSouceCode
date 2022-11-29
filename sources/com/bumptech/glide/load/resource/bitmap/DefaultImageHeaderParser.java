package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import i8.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f20155a = "Exif\u0000\u0000".getBytes(Charset.forName(C.UTF8_NAME));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f20156b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(byte[] bArr, int i10) throws IOException;

        short b() throws IOException;

        long k(long j10) throws IOException;

        int l() throws IOException;
    }

    /* loaded from: classes.dex */
    public static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f20157a;

        public a(ByteBuffer byteBuffer) {
            this.f20157a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f20157a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f20157a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws Reader.EndOfFileException {
            if (this.f20157a.remaining() >= 1) {
                return (short) (this.f20157a.get() & TagConstant.TAG_CAT_RESERVED);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long k(long j10) {
            int min = (int) Math.min(this.f20157a.remaining(), j10);
            ByteBuffer byteBuffer = this.f20157a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int l() throws Reader.EndOfFileException {
            return (b() << 8) | b();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f20158a;

        public b(byte[] bArr, int i10) {
            this.f20158a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f20158a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f20158a.getInt(i10);
            }
            return -1;
        }

        public final boolean c(int i10, int i11) {
            return this.f20158a.remaining() - i10 >= i11;
        }

        public int d() {
            return this.f20158a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f20158a.order(byteOrder);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f20159a;

        public c(InputStream inputStream) {
            this.f20159a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f20159a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws IOException {
            int read = this.f20159a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long k(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f20159a.skip(j11);
                if (skip <= 0) {
                    if (this.f20159a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int l() throws IOException {
            return (b() << 8) | b();
        }
    }

    public static int d(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static boolean g(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int j(b bVar) {
        ByteOrder byteOrder;
        short a10 = bVar.a(6);
        if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a10 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int d10 = d(b10, i10);
            short a12 = bVar.a(d10);
            if (a12 == 274) {
                short a13 = bVar.a(d10 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b11 = bVar.b(d10 + 4);
                    if (b11 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) a12) + " formatCode=" + ((int) a13) + " componentCount=" + b11);
                        }
                        int i11 = b11 + f20156b[a13];
                        if (i11 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a13));
                            }
                        } else {
                            int i12 = d10 + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a12));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) a12));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a13));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(InputStream inputStream, p7.b bVar) throws IOException {
        return e(new c((InputStream) j.d(inputStream)), (p7.b) j.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) throws IOException {
        return f(new a((ByteBuffer) j.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) throws IOException {
        return f(new c((InputStream) j.d(inputStream)));
    }

    public final int e(Reader reader, p7.b bVar) throws IOException {
        try {
            int l10 = reader.l();
            if (!g(l10)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + l10);
                }
                return -1;
            }
            int i10 = i(reader);
            if (i10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(i10, byte[].class);
            int k10 = k(reader, bArr, i10);
            bVar.e(bArr);
            return k10;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    public final ImageHeaderParser.ImageType f(Reader reader) throws IOException {
        try {
            int l10 = reader.l();
            if (l10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b10 = (l10 << 8) | reader.b();
            if (b10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b11 = (b10 << 8) | reader.b();
            if (b11 == -1991225785) {
                reader.k(21L);
                try {
                    return reader.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (b11 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.k(4L);
                if (((reader.l() << 16) | reader.l()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int l11 = (reader.l() << 16) | reader.l();
                if ((l11 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = l11 & 255;
                if (i10 == 88) {
                    reader.k(4L);
                    return (reader.b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i10 == 76) {
                    reader.k(4L);
                    return (reader.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean h(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f20155a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f20155a;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    return false;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    public final int i(Reader reader) throws IOException {
        short b10;
        short b11;
        int l10;
        long j10;
        long k10;
        do {
            if (reader.b() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) b10));
                }
                return -1;
            }
            b11 = reader.b();
            if (b11 == 218) {
                return -1;
            }
            if (b11 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            l10 = reader.l() - 2;
            if (b11 == 225) {
                return l10;
            }
            j10 = l10;
            k10 = reader.k(j10);
        } while (k10 == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) b11) + ", wanted to skip: " + l10 + ", but actually skipped: " + k10);
        }
        return -1;
    }

    public final int k(Reader reader, byte[] bArr, int i10) throws IOException {
        int a10 = reader.a(bArr, i10);
        if (a10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + a10);
            }
            return -1;
        } else if (h(bArr, i10)) {
            return j(new b(bArr, i10));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }
}
