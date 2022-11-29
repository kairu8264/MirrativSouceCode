package f4;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import f4.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {
    public static SimpleDateFormat T;
    public static SimpleDateFormat U;
    public static final d[] Y;
    public static final d[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final d[] f31744a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final d[] f31745b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final d[] f31746c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final d f31747d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final d[] f31748e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final d[] f31749f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final d[] f31750g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final d[] f31751h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final d[][] f31752i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final d[] f31753j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final HashMap<Integer, d>[] f31754k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final HashMap<String, d>[] f31755l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final HashSet<String> f31756m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final HashMap<Integer, Integer> f31757n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final Charset f31758o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final byte[] f31759p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final byte[] f31760q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final Pattern f31761r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final Pattern f31762s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final Pattern f31763t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final Pattern f31765u0;

    /* renamed from: a  reason: collision with root package name */
    public String f31771a;

    /* renamed from: b  reason: collision with root package name */
    public FileDescriptor f31772b;

    /* renamed from: c  reason: collision with root package name */
    public AssetManager.AssetInputStream f31773c;

    /* renamed from: d  reason: collision with root package name */
    public int f31774d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31775e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, c>[] f31776f;

    /* renamed from: g  reason: collision with root package name */
    public Set<Integer> f31777g;

    /* renamed from: h  reason: collision with root package name */
    public ByteOrder f31778h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f31779i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f31780j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31781k;

    /* renamed from: l  reason: collision with root package name */
    public int f31782l;

    /* renamed from: m  reason: collision with root package name */
    public int f31783m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f31784n;

    /* renamed from: o  reason: collision with root package name */
    public int f31785o;

    /* renamed from: p  reason: collision with root package name */
    public int f31786p;

    /* renamed from: q  reason: collision with root package name */
    public int f31787q;

    /* renamed from: r  reason: collision with root package name */
    public int f31788r;

    /* renamed from: s  reason: collision with root package name */
    public int f31789s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f31790t;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f31764u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v  reason: collision with root package name */
    public static final List<Integer> f31766v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w  reason: collision with root package name */
    public static final List<Integer> f31767w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f31768x = {8, 8, 8};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f31769y = {4};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f31770z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {79, 76, 89, 77, 80, 0};
    public static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] H = {101, 88, 73, 102};
    public static final byte[] I = {73, 72, 68, 82};
    public static final byte[] J = {73, 69, 78, 68};
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: f4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0343a extends MediaDataSource {

        /* renamed from: w  reason: collision with root package name */
        public long f31791w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f f31792x;

        public C0343a(f fVar) {
            this.f31792x = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f31791w;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f31792x.available()) {
                        return -1;
                    }
                    this.f31792x.h(j10);
                    this.f31791w = j10;
                }
                if (i11 > this.f31792x.available()) {
                    i11 = this.f31792x.available();
                }
                int read = this.f31792x.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f31791w += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f31791w = -1L;
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {
        public static final ByteOrder A = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder B = ByteOrder.BIG_ENDIAN;

        /* renamed from: w  reason: collision with root package name */
        public final DataInputStream f31794w;

        /* renamed from: x  reason: collision with root package name */
        public ByteOrder f31795x;

        /* renamed from: y  reason: collision with root package name */
        public int f31796y;

        /* renamed from: z  reason: collision with root package name */
        public byte[] f31797z;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f31796y;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f31794w.available();
        }

        public long c() throws IOException {
            return readInt() & 4294967295L;
        }

        public void d(ByteOrder byteOrder) {
            this.f31795x = byteOrder;
        }

        public void e(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f31794w.skip(i12);
                if (skip <= 0) {
                    if (this.f31797z == null) {
                        this.f31797z = new byte[8192];
                    }
                    skip = this.f31794w.read(this.f31797z, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f31796y += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f31796y++;
            return this.f31794w.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f31796y++;
            return this.f31794w.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f31796y++;
            int read = this.f31794w.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f31796y += 2;
            return this.f31794w.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f31796y += i11;
            this.f31794w.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f31796y += 4;
            int read = this.f31794w.read();
            int read2 = this.f31794w.read();
            int read3 = this.f31794w.read();
            int read4 = this.f31794w.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f31795x;
                if (byteOrder == A) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == B) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f31795x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f31796y += 8;
            int read = this.f31794w.read();
            int read2 = this.f31794w.read();
            int read3 = this.f31794w.read();
            int read4 = this.f31794w.read();
            int read5 = this.f31794w.read();
            int read6 = this.f31794w.read();
            int read7 = this.f31794w.read();
            int read8 = this.f31794w.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f31795x;
                if (byteOrder == A) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == B) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f31795x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f31796y += 2;
            int read = this.f31794w.read();
            int read2 = this.f31794w.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f31795x;
                if (byteOrder == A) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == B) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f31795x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f31796y += 2;
            return this.f31794w.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f31796y++;
            return this.f31794w.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f31796y += 2;
            int read = this.f31794w.read();
            int read2 = this.f31794w.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f31795x;
                if (byteOrder == A) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == B) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f31795x);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f31795x = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f31794w = dataInputStream;
            dataInputStream.mark(0);
            this.f31796y = 0;
            this.f31795x = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f31794w.read(bArr, i10, i11);
            this.f31796y += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f31796y += bArr.length;
            this.f31794w.readFully(bArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f31798a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31799b;

        /* renamed from: c  reason: collision with root package name */
        public final long f31800c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f31801d;

        public c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f31758o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f31806a);
                wrap.putInt((int) eVar.f31807b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Double.parseDouble((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof double[]) {
                    double[] dArr = (double[]) k10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof e[]) {
                    e[] eVarArr = (e[]) k10;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Integer.parseInt((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                return null;
            }
            if (k10 instanceof String) {
                return (String) k10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (k10 instanceof long[]) {
                long[] jArr = (long[]) k10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof int[]) {
                int[] iArr = (int[]) k10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof double[]) {
                double[] dArr = (double[]) k10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof e[]) {
                e[] eVarArr = (e[]) k10;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f31806a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f31807b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f4.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.V[this.f31798a] + ", data length:" + this.f31801d.length + ")";
        }

        public c(int i10, int i11, long j10, byte[] bArr) {
            this.f31798a = i10;
            this.f31799b = i11;
            this.f31800c = j10;
            this.f31801d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f31806a;

        /* renamed from: b  reason: collision with root package name */
        public final long f31807b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f31806a = 0L;
                this.f31807b = 1L;
                return;
            }
            this.f31806a = j10;
            this.f31807b = j11;
        }

        public double a() {
            return this.f31806a / this.f31807b;
        }

        public String toString() {
            return this.f31806a + "/" + this.f31807b;
        }
    }

    static {
        d[] dVarArr;
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Y = dVarArr2;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr3;
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f31744a0 = dVarArr4;
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        f31745b0 = dVarArr5;
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", TsExtractor.TS_STREAM_TYPE_AIT, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f31746c0 = dVarArr6;
        f31747d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr7 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f31748e0 = dVarArr7;
        d[] dVarArr8 = {new d("PreviewImageStart", TsExtractor.TS_STREAM_TYPE_AIT, 4), new d("PreviewImageLength", 258, 4)};
        f31749f0 = dVarArr8;
        d[] dVarArr9 = {new d("AspectFrame", 4371, 3)};
        f31750g0 = dVarArr9;
        d[] dVarArr10 = {new d("ColorSpace", 55, 3)};
        f31751h0 = dVarArr10;
        d[][] dVarArr11 = {dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, dVarArr7, dVarArr8, dVarArr9, dVarArr10};
        f31752i0 = dVarArr11;
        f31753j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f31754k0 = new HashMap[dVarArr11.length];
        f31755l0 = new HashMap[dVarArr11.length];
        f31756m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f31757n0 = new HashMap<>();
        Charset forName = Charset.forName(C.ASCII_NAME);
        f31758o0 = forName;
        f31759p0 = "Exif\u0000\u0000".getBytes(forName);
        f31760q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr12 = f31752i0;
            if (i10 < dVarArr12.length) {
                f31754k0[i10] = new HashMap<>();
                f31755l0[i10] = new HashMap<>();
                for (d dVar : dVarArr12[i10]) {
                    f31754k0[i10].put(Integer.valueOf(dVar.f31802a), dVar);
                    f31755l0[i10].put(dVar.f31803b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f31757n0;
                d[] dVarArr13 = f31753j0;
                hashMap.put(Integer.valueOf(dVarArr13[0].f31802a), 5);
                hashMap.put(Integer.valueOf(dVarArr13[1].f31802a), 1);
                hashMap.put(Integer.valueOf(dVarArr13[2].f31802a), 2);
                hashMap.put(Integer.valueOf(dVarArr13[3].f31802a), 3);
                hashMap.put(Integer.valueOf(dVarArr13[4].f31802a), 7);
                hashMap.put(Integer.valueOf(dVarArr13[5].f31802a), 8);
                f31761r0 = Pattern.compile(".*[1-9].*");
                f31762s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f31763t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f31765u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public static boolean M(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f31759p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f31759p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean u(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean z(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f31764u) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    public final boolean A(HashMap hashMap) throws IOException {
        c cVar;
        int i10;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f31778h);
            int[] iArr2 = f31768x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f31774d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f31778h)) == 1 && Arrays.equals(iArr, f31770z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f31764u) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    public final boolean B(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f31778h) <= 512 && cVar2.i(this.f31778h) <= 512;
    }

    public final boolean C(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public final void D(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f31752i0.length; i10++) {
            try {
                try {
                    this.f31776f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f31764u;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                a();
                if (f31764u) {
                    F();
                }
            }
        }
        if (!this.f31775e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f31774d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (M(this.f31774d)) {
            f fVar = new f(inputStream);
            if (this.f31775e) {
                n(fVar);
            } else {
                int i11 = this.f31774d;
                if (i11 == 12) {
                    e(fVar);
                } else if (i11 == 7) {
                    h(fVar);
                } else if (i11 == 10) {
                    m(fVar);
                } else {
                    k(fVar);
                }
            }
            fVar.h(this.f31786p);
            L(fVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f31774d;
            if (i12 == 4) {
                f(bVar, 0, 0);
            } else if (i12 == 13) {
                i(bVar);
            } else if (i12 == 9) {
                j(bVar);
            } else if (i12 == 14) {
                o(bVar);
            }
        }
    }

    public final void E(b bVar) throws IOException {
        ByteOrder G2 = G(bVar);
        this.f31778h = G2;
        bVar.d(G2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f31774d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.e(i11);
        }
    }

    public final void F() {
        for (int i10 = 0; i10 < this.f31776f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f31776f[i10].size());
            for (Map.Entry<String, c> entry : this.f31776f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.f31778h) + "'");
            }
        }
    }

    public final ByteOrder G(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f31764u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f31764u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void H(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        E(fVar);
        I(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(f4.a.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.I(f4.a$f, int):void");
    }

    public final void J(int i10, String str, String str2) {
        if (this.f31776f[i10].isEmpty() || this.f31776f[i10].get(str) == null) {
            return;
        }
        HashMap<String, c>[] hashMapArr = this.f31776f;
        hashMapArr[i10].put(str2, hashMapArr[i10].get(str));
        this.f31776f[i10].remove(str);
    }

    public final void K(f fVar, int i10) throws IOException {
        c cVar = this.f31776f[i10].get("ImageLength");
        c cVar2 = this.f31776f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f31776f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f31776f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f31778h);
            int i12 = cVar3.i(this.f31778h);
            fVar.h(i11);
            byte[] bArr = new byte[i12];
            fVar.read(bArr);
            f(new b(bArr), i11, i10);
        }
    }

    public final void L(b bVar) throws IOException {
        HashMap<String, c> hashMap = this.f31776f[4];
        c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i10 = cVar.i(this.f31778h);
            this.f31785o = i10;
            if (i10 != 1) {
                if (i10 == 6) {
                    p(bVar, hashMap);
                    return;
                } else if (i10 != 7) {
                    return;
                }
            }
            if (A(hashMap)) {
                q(bVar, hashMap);
                return;
            }
            return;
        }
        this.f31785o = 6;
        p(bVar, hashMap);
    }

    public final void N(int i10, int i11) throws IOException {
        if (!this.f31776f[i10].isEmpty() && !this.f31776f[i11].isEmpty()) {
            c cVar = this.f31776f[i10].get("ImageLength");
            c cVar2 = this.f31776f[i10].get("ImageWidth");
            c cVar3 = this.f31776f[i11].get("ImageLength");
            c cVar4 = this.f31776f[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f31764u) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int i12 = cVar.i(this.f31778h);
                int i13 = cVar2.i(this.f31778h);
                int i14 = cVar3.i(this.f31778h);
                int i15 = cVar4.i(this.f31778h);
                if (i12 >= i14 || i13 >= i15) {
                    return;
                }
                HashMap<String, c>[] hashMapArr = this.f31776f;
                HashMap<String, c> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
            } else if (f31764u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f31764u) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void O(f fVar, int i10) throws IOException {
        c f10;
        c f11;
        c cVar = this.f31776f[i10].get("DefaultCropSize");
        c cVar2 = this.f31776f[i10].get("SensorTopBorder");
        c cVar3 = this.f31776f[i10].get("SensorLeftBorder");
        c cVar4 = this.f31776f[i10].get("SensorBottomBorder");
        c cVar5 = this.f31776f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
                int i11 = cVar2.i(this.f31778h);
                int i12 = cVar4.i(this.f31778h);
                int i13 = cVar5.i(this.f31778h);
                int i14 = cVar3.i(this.f31778h);
                if (i12 <= i11 || i13 <= i14) {
                    return;
                }
                c f12 = c.f(i12 - i11, this.f31778h);
                c f13 = c.f(i13 - i14, this.f31778h);
                this.f31776f[i10].put("ImageLength", f12);
                this.f31776f[i10].put("ImageWidth", f13);
                return;
            }
            K(fVar, i10);
            return;
        }
        if (cVar.f31798a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f31778h);
            if (eVarArr != null && eVarArr.length == 2) {
                f10 = c.d(eVarArr[0], this.f31778h);
                f11 = c.d(eVarArr[1], this.f31778h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) cVar.k(this.f31778h);
            if (iArr != null && iArr.length == 2) {
                f10 = c.f(iArr[0], this.f31778h);
                f11 = c.f(iArr[1], this.f31778h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f31776f[i10].put("ImageWidth", f10);
        this.f31776f[i10].put("ImageLength", f11);
    }

    public final void P() throws IOException {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        c cVar = this.f31776f[1].get("PixelXDimension");
        c cVar2 = this.f31776f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f31776f[0].put("ImageWidth", cVar);
            this.f31776f[0].put("ImageLength", cVar2);
        }
        if (this.f31776f[4].isEmpty() && B(this.f31776f[5])) {
            HashMap<String, c>[] hashMapArr = this.f31776f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!B(this.f31776f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        J(0, "ThumbnailOrientation", "Orientation");
        J(0, "ThumbnailImageLength", "ImageLength");
        J(0, "ThumbnailImageWidth", "ImageWidth");
        J(5, "ThumbnailOrientation", "Orientation");
        J(5, "ThumbnailImageLength", "ImageLength");
        J(5, "ThumbnailImageWidth", "ImageWidth");
        J(4, "Orientation", "ThumbnailOrientation");
        J(4, "ImageLength", "ThumbnailImageLength");
        J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        if (b10 != null && b("DateTime") == null) {
            this.f31776f[0].put("DateTime", c.a(b10));
        }
        if (b("ImageWidth") == null) {
            this.f31776f[0].put("ImageWidth", c.b(0L, this.f31778h));
        }
        if (b("ImageLength") == null) {
            this.f31776f[0].put("ImageLength", c.b(0L, this.f31778h));
        }
        if (b("Orientation") == null) {
            this.f31776f[0].put("Orientation", c.b(0L, this.f31778h));
        }
        if (b("LightSource") == null) {
            this.f31776f[1].put("LightSource", c.b(0L, this.f31778h));
        }
    }

    public String b(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c d10 = d(str);
        if (d10 != null) {
            if (!f31756m0.contains(str)) {
                return d10.j(this.f31778h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = d10.f31798a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d10.f31798a);
                    return null;
                }
                e[] eVarArr = (e[]) d10.k(this.f31778h);
                if (eVarArr != null && eVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].f31806a) / ((float) eVarArr[0].f31807b))), Integer.valueOf((int) (((float) eVarArr[1].f31806a) / ((float) eVarArr[1].f31807b))), Integer.valueOf((int) (((float) eVarArr[2].f31806a) / ((float) eVarArr[2].f31807b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(d10.h(this.f31778h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i10) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        c d10 = d(str);
        if (d10 == null) {
            return i10;
        }
        try {
            return d10.i(this.f31778h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public final c d(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f31764u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f31752i0.length; i10++) {
            c cVar = this.f31776f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) throws IOException {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    b.C0344b.a(mediaMetadataRetriever, new C0343a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    String str3 = null;
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (str3 != null) {
                        this.f31776f[0].put("ImageWidth", c.f(Integer.parseInt(str3), this.f31778h));
                    }
                    if (str != null) {
                        this.f31776f[0].put("ImageLength", c.f(Integer.parseInt(str), this.f31778h));
                    }
                    if (str2 != null) {
                        int i10 = 1;
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt == 90) {
                            i10 = 6;
                        } else if (parseInt == 180) {
                            i10 = 3;
                        } else if (parseInt == 270) {
                            i10 = 8;
                        }
                        this.f31776f[0].put("Orientation", c.f(i10, this.f31778h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.h(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i11 = parseInt2 + 6;
                                int i12 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f31759p0)) {
                                    byte[] bArr2 = new byte[i12];
                                    if (fVar.read(bArr2) == i12) {
                                        this.f31786p = i11;
                                        H(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f31764u) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
        r22.d(r21.f31778h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(f4.a.b r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.f(f4.a$b, int, int):void");
    }

    public final int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    public final void h(f fVar) throws IOException {
        k(fVar);
        c cVar = this.f31776f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f31801d);
            fVar2.d(this.f31778h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12L);
            }
            I(fVar2, 6);
            c cVar2 = this.f31776f[7].get("PreviewImageStart");
            c cVar3 = this.f31776f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f31776f[5].put("JPEGInterchangeFormat", cVar2);
                this.f31776f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f31776f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f31778h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c f10 = c.f(i10, this.f31778h);
                    c f11 = c.f(i11, this.f31778h);
                    this.f31776f[0].put("ImageWidth", f10);
                    this.f31776f[0].put("ImageLength", f11);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(b bVar) throws IOException {
        if (f31764u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.e(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16 && !Arrays.equals(bArr2, I)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, J)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, H)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f31786p = i11;
                                H(bArr3, 0);
                                P();
                                L(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + f4.b.a(bArr2));
                    }
                    int i12 = readInt + 4;
                    bVar.e(i12);
                    length = i11 + i12;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) throws IOException {
        boolean z10 = f31764u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.e(i10 - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.e(i12 - bVar.a());
        bVar.d(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f31747d0.f31802a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f10 = c.f(readShort, this.f31778h);
                c f11 = c.f(readShort2, this.f31778h);
                this.f31776f[0].put("ImageLength", f10);
                this.f31776f[0].put("ImageWidth", f11);
                if (f31764u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.e(readUnsignedShort2);
        }
    }

    public final void k(f fVar) throws IOException {
        c cVar;
        E(fVar);
        I(fVar, 0);
        O(fVar, 0);
        O(fVar, 5);
        O(fVar, 4);
        P();
        if (this.f31774d != 8 || (cVar = this.f31776f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f31801d);
        fVar2.d(this.f31778h);
        fVar2.e(6);
        I(fVar2, 9);
        c cVar2 = this.f31776f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f31776f[1].put("ColorSpace", cVar2);
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(f fVar) throws IOException {
        if (f31764u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = this.f31776f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f31801d), (int) cVar.f31800c, 5);
        }
        c cVar2 = this.f31776f[0].get("ISO");
        c cVar3 = this.f31776f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f31776f[1].put("PhotographicSensitivity", cVar2);
    }

    public final void n(f fVar) throws IOException {
        byte[] bArr = f31759p0;
        fVar.e(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f31786p = bArr.length;
        H(bArr2, 0);
    }

    public final void o(b bVar) throws IOException {
        if (f31764u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.d(ByteOrder.LITTLE_ENDIAN);
        bVar.e(K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = length + 4 + 4;
                    if (Arrays.equals(M, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f31786p = i10;
                            H(bArr3, 0);
                            L(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + f4.b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i10 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.e(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f31778h);
        int i11 = cVar2.i(this.f31778h);
        if (this.f31774d == 7) {
            i10 += this.f31787q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f31779i = true;
            if (this.f31771a == null && this.f31773c == null && this.f31772b == null) {
                byte[] bArr = new byte[i11];
                bVar.skip(i10);
                bVar.read(bArr);
                this.f31784n = bArr;
            }
            this.f31782l = i10;
            this.f31783m = i11;
        }
        if (f31764u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    public final void q(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] b10 = f4.b.b(cVar.k(this.f31778h));
        long[] b11 = f4.b.b(cVar2.k(this.f31778h));
        if (b10 != null && b10.length != 0) {
            if (b11 != null && b11.length != 0) {
                if (b10.length != b11.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : b11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr = new byte[i10];
                this.f31781k = true;
                this.f31780j = true;
                this.f31779i = true;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < b10.length; i13++) {
                    int i14 = (int) b10[i13];
                    int i15 = (int) b11[i13];
                    if (i13 < b10.length - 1 && i14 + i15 != b10[i13 + 1]) {
                        this.f31781k = false;
                    }
                    int i16 = i14 - i11;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i16;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                    int i17 = i11 + i16;
                    byte[] bArr2 = new byte[i15];
                    if (bVar.read(bArr2) != i15) {
                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                        return;
                    }
                    i11 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i12, i15);
                    i12 += i15;
                }
                this.f31784n = bArr;
                if (this.f31781k) {
                    this.f31782l = (int) b10[0];
                    this.f31783m = i10;
                    return;
                }
                return;
            }
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
    }

    public boolean s() {
        int c10 = c("Orientation", 1);
        return c10 == 2 || c10 == 7 || c10 == 4 || c10 == 5;
    }

    public final boolean t(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.read(bArr2);
                } catch (Exception e10) {
                    e = e10;
                    bVar2 = bVar;
                    if (f31764u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!Arrays.equals(bArr2, B)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j12 != 1) {
                if (Arrays.equals(bArr3, C)) {
                    z10 = true;
                } else if (Arrays.equals(bArr3, D)) {
                    z11 = true;
                }
                if (z10 && z11) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    public final boolean v(byte[] bArr) throws IOException {
        b bVar;
        boolean z10 = false;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder G2 = G(bVar);
            this.f31778h = G2;
            bVar.d(G2);
            short readShort = bVar.readShort();
            z10 = (readShort == 20306 || readShort == 21330) ? true : true;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final boolean w(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean x(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean y(byte[] bArr) throws IOException {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder G2 = G(bVar);
            this.f31778h = G2;
            bVar.d(G2);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends b {
        public f(byte[] bArr) throws IOException {
            super(bArr);
            this.f31794w.mark(Integer.MAX_VALUE);
        }

        public void h(long j10) throws IOException {
            int i10 = this.f31796y;
            if (i10 > j10) {
                this.f31796y = 0;
                this.f31794w.reset();
            } else {
                j10 -= i10;
            }
            e((int) j10);
        }

        public f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f31794w.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public a(InputStream inputStream, int i10) throws IOException {
        d[][] dVarArr = f31752i0;
        this.f31776f = new HashMap[dVarArr.length];
        this.f31777g = new HashSet(dVarArr.length);
        this.f31778h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f31771a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f31759p0.length);
            if (!r(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f31775e = true;
            this.f31773c = null;
            this.f31772b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f31773c = (AssetManager.AssetInputStream) inputStream;
            this.f31772b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (z(fileInputStream.getFD())) {
                    this.f31773c = null;
                    this.f31772b = fileInputStream.getFD();
                }
            }
            this.f31773c = null;
            this.f31772b = null;
        }
        D(inputStream);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f31802a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31803b;

        /* renamed from: c  reason: collision with root package name */
        public final int f31804c;

        /* renamed from: d  reason: collision with root package name */
        public final int f31805d;

        public d(String str, int i10, int i11) {
            this.f31803b = str;
            this.f31802a = i10;
            this.f31804c = i11;
            this.f31805d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f31804c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f31805d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f31803b = str;
            this.f31802a = i10;
            this.f31804c = i11;
            this.f31805d = i12;
        }
    }
}
