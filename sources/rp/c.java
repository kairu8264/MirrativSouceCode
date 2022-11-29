package rp;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: w  reason: collision with root package name */
    public c0 f51656w;

    /* renamed from: x  reason: collision with root package name */
    public long f51657x;

    /* loaded from: classes4.dex */
    public static final class a implements Closeable {

        /* renamed from: w  reason: collision with root package name */
        public c f51658w;

        /* renamed from: x  reason: collision with root package name */
        public c0 f51659x;

        /* renamed from: z  reason: collision with root package name */
        public byte[] f51661z;

        /* renamed from: y  reason: collision with root package name */
        public long f51660y = -1;
        public int A = -1;
        public int B = -1;

        public final void a(c0 c0Var) {
            this.f51659x = c0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f51658w != null) {
                this.f51658w = null;
                a(null);
                this.f51660y = -1L;
                this.f51661z = null;
                this.A = -1;
                this.B = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    /* renamed from: rp.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0784c extends OutputStream {
        public C0784c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            c.this.b1(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            jo.p.h(bArr, "data");
            c.this.write(bArr, i10, i11);
        }
    }

    @Override // rp.e
    public c A() {
        return this;
    }

    @Override // rp.e
    public int A1() throws EOFException {
        return n0.e(readInt());
    }

    @Override // rp.d
    /* renamed from: B0 */
    public c H(int i10) {
        c0 d02 = d0(4);
        byte[] bArr = d02.f51665a;
        int i11 = d02.f51667c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        d02.f51667c = i14 + 1;
        O(X() + 4);
        return this;
    }

    public OutputStream C() {
        return new C0784c();
    }

    @Override // rp.e
    public long C0() throws EOFException {
        return n0.f(K());
    }

    public boolean E(long j10, f fVar, int i10, int i11) {
        jo.p.h(fVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || X() - j10 < i11 || fVar.G() - i10 < i11) {
            return false;
        }
        if (i11 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (n(i12 + j10) != fVar.l(i12 + i10)) {
                    return false;
                }
                if (i13 >= i11) {
                    break;
                }
                i12 = i13;
            }
        }
        return true;
    }

    @Override // rp.d
    /* renamed from: E0 */
    public c U0(int i10) {
        c0 d02 = d0(2);
        byte[] bArr = d02.f51665a;
        int i11 = d02.f51667c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        d02.f51667c = i12 + 1;
        O(X() + 2);
        return this;
    }

    public int F(byte[] bArr, int i10, int i11) {
        jo.p.h(bArr, "sink");
        n0.b(bArr.length, i10, i11);
        c0 c0Var = this.f51656w;
        if (c0Var == null) {
            return -1;
        }
        int min = Math.min(i11, c0Var.f51667c - c0Var.f51666b);
        byte[] bArr2 = c0Var.f51665a;
        int i12 = c0Var.f51666b;
        xn.n.d(bArr2, bArr, i10, i12, i12 + min);
        c0Var.f51666b += min;
        O(X() - min);
        if (c0Var.f51666b == c0Var.f51667c) {
            this.f51656w = c0Var.b();
            d0.b(c0Var);
        }
        return min;
    }

    public c F0(String str, int i10, int i11, Charset charset) {
        jo.p.h(str, "string");
        jo.p.h(charset, "charset");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    if (jo.p.c(charset, so.c.f52772b)) {
                        return g0(str, i10, i11);
                    }
                    String substring = str.substring(i10, i11);
                    jo.p.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    jo.p.g(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(jo.p.o("beginIndex < 0: ", Integer.valueOf(i10)).toString());
    }

    public f G() {
        return R0(X());
    }

    @Override // rp.d
    public long H0(h0 h0Var) throws IOException {
        jo.p.h(h0Var, "source");
        long j10 = 0;
        while (true) {
            long f12 = h0Var.f1(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (f12 == -1) {
                return j10;
            }
            j10 += f12;
        }
    }

    public void I(byte[] bArr) throws EOFException {
        jo.p.h(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int F = F(bArr, i10, bArr.length - i10);
            if (F == -1) {
                throw new EOFException();
            }
            i10 += F;
        }
    }

    @Override // rp.e
    public void I0(long j10) throws EOFException {
        if (this.f51657x < j10) {
            throw new EOFException();
        }
    }

    public long K() throws EOFException {
        if (X() >= 8) {
            c0 c0Var = this.f51656w;
            jo.p.e(c0Var);
            int i10 = c0Var.f51666b;
            int i11 = c0Var.f51667c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c0Var.f51665a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i12] & 255) << 48) | ((bArr[i13] & 255) << 40) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 24) | ((bArr[i16] & 255) << 16);
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            long j11 = j10 | ((bArr[i17] & 255) << 8) | (bArr[i18] & 255);
            O(X() - 8);
            if (i19 == i11) {
                this.f51656w = c0Var.b();
                d0.b(c0Var);
            } else {
                c0Var.f51666b = i19;
            }
            return j11;
        }
        throw new EOFException();
    }

    public String L(long j10, Charset charset) throws EOFException {
        jo.p.h(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= 2147483647L) {
            if (this.f51657x >= j10) {
                if (i10 == 0) {
                    return "";
                }
                c0 c0Var = this.f51656w;
                jo.p.e(c0Var);
                int i11 = c0Var.f51666b;
                if (i11 + j10 > c0Var.f51667c) {
                    return new String(t0(j10), charset);
                }
                int i12 = (int) j10;
                String str = new String(c0Var.f51665a, i11, i12, charset);
                int i13 = c0Var.f51666b + i12;
                c0Var.f51666b = i13;
                this.f51657x -= j10;
                if (i13 == c0Var.f51667c) {
                    this.f51656w = c0Var.b();
                    d0.b(c0Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(jo.p.o("byteCount: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.d
    /* renamed from: L0 */
    public c a0(String str) {
        jo.p.h(str, "string");
        return g0(str, 0, str.length());
    }

    @Override // rp.d
    /* renamed from: M0 */
    public c g0(String str, int i10, int i11) {
        char charAt;
        jo.p.h(str, "string");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (!(i11 <= str.length())) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
                }
                while (i10 < i11) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 128) {
                        c0 d02 = d0(1);
                        byte[] bArr = d02.f51665a;
                        int i12 = d02.f51667c - i10;
                        int min = Math.min(i11, 8192 - i12);
                        int i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt2;
                        while (true) {
                            i10 = i13;
                            if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                break;
                            }
                            i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                        }
                        int i14 = d02.f51667c;
                        int i15 = (i12 + i10) - i14;
                        d02.f51667c = i14 + i15;
                        O(X() + i15);
                    } else {
                        if (charAt2 < 2048) {
                            c0 d03 = d0(2);
                            byte[] bArr2 = d03.f51665a;
                            int i16 = d03.f51667c;
                            bArr2[i16] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                            bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                            d03.f51667c = i16 + 2;
                            O(X() + 2);
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i17 = i10 + 1;
                            char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                            if (charAt2 <= 56319) {
                                if (56320 <= charAt3 && charAt3 <= 57343) {
                                    int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    c0 d04 = d0(4);
                                    byte[] bArr3 = d04.f51665a;
                                    int i19 = d04.f51667c;
                                    bArr3[i19] = (byte) ((i18 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    d04.f51667c = i19 + 4;
                                    O(X() + 4);
                                    i10 += 2;
                                }
                            }
                            b1(63);
                            i10 = i17;
                        } else {
                            c0 d05 = d0(3);
                            byte[] bArr4 = d05.f51665a;
                            int i20 = d05.f51667c;
                            bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                            bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                            d05.f51667c = i20 + 3;
                            O(X() + 3);
                        }
                        i10++;
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(jo.p.o("beginIndex < 0: ", Integer.valueOf(i10)).toString());
    }

    public String N() {
        return L(this.f51657x, so.c.f52772b);
    }

    public final void O(long j10) {
        this.f51657x = j10;
    }

    @Override // rp.f0
    public void O0(c cVar, long j10) {
        c0 c0Var;
        c0 c0Var2;
        jo.p.h(cVar, "source");
        if (cVar != this) {
            n0.b(cVar.X(), 0L, j10);
            while (j10 > 0) {
                c0 c0Var3 = cVar.f51656w;
                jo.p.e(c0Var3);
                int i10 = c0Var3.f51667c;
                jo.p.e(cVar.f51656w);
                if (j10 < i10 - c0Var.f51666b) {
                    c0 c0Var4 = this.f51656w;
                    if (c0Var4 != null) {
                        jo.p.e(c0Var4);
                        c0Var2 = c0Var4.f51671g;
                    } else {
                        c0Var2 = null;
                    }
                    if (c0Var2 != null && c0Var2.f51669e) {
                        if ((c0Var2.f51667c + j10) - (c0Var2.f51668d ? 0 : c0Var2.f51666b) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            c0 c0Var5 = cVar.f51656w;
                            jo.p.e(c0Var5);
                            c0Var5.f(c0Var2, (int) j10);
                            cVar.O(cVar.X() - j10);
                            O(X() + j10);
                            return;
                        }
                    }
                    c0 c0Var6 = cVar.f51656w;
                    jo.p.e(c0Var6);
                    cVar.f51656w = c0Var6.e((int) j10);
                }
                c0 c0Var7 = cVar.f51656w;
                jo.p.e(c0Var7);
                long j11 = c0Var7.f51667c - c0Var7.f51666b;
                cVar.f51656w = c0Var7.b();
                c0 c0Var8 = this.f51656w;
                if (c0Var8 == null) {
                    this.f51656w = c0Var7;
                    c0Var7.f51671g = c0Var7;
                    c0Var7.f51670f = c0Var7;
                } else {
                    jo.p.e(c0Var8);
                    c0 c0Var9 = c0Var8.f51671g;
                    jo.p.e(c0Var9);
                    c0Var9.c(c0Var7).a();
                }
                cVar.O(cVar.X() - j11);
                O(X() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[EDGE_INSN: B:42:0x0098->B:37:0x0098 ?: BREAK  , SYNTHETIC] */
    @Override // rp.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long O1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.X()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La2
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            rp.c0 r6 = r14.f51656w
            jo.p.e(r6)
            byte[] r7 = r6.f51665a
            int r8 = r6.f51666b
            int r9 = r6.f51667c
        L18:
            if (r8 >= r9) goto L84
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L70
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L70
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            rp.c r0 = new rp.c
            r0.<init>()
            rp.c r0 = r0.t1(r4)
            rp.c r0 = r0.b1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.N()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = jo.p.o(r2, r0)
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L84
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = rp.n0.h(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = jo.p.o(r2, r1)
            r0.<init>(r1)
            throw r0
        L84:
            if (r8 != r9) goto L90
            rp.c0 r7 = r6.b()
            r14.f51656w = r7
            rp.d0.b(r6)
            goto L92
        L90:
            r6.f51666b = r8
        L92:
            if (r1 != 0) goto L98
            rp.c0 r6 = r14.f51656w
            if (r6 != 0) goto Ld
        L98:
            long r1 = r14.X()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.O(r1)
            return r4
        La2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.c.O1():long");
    }

    @Override // rp.e
    public String P0(long j10) throws EOFException {
        return L(j10, so.c.f52772b);
    }

    @Override // rp.e
    public InputStream P1() {
        return new b();
    }

    @Override // rp.e
    public String R(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            byte b10 = (byte) 10;
            long q10 = q(b10, 0L, j11);
            if (q10 != -1) {
                return sp.f.c(this, q10);
            }
            if (j11 < X() && n(j11 - 1) == ((byte) 13) && n(j11) == b10) {
                return sp.f.c(this, j11);
            }
            c cVar = new c();
            i(cVar, 0L, Math.min(32, X()));
            throw new EOFException("\\n not found: limit=" + Math.min(X(), j10) + " content=" + cVar.G().q() + (char) 8230);
        }
        throw new IllegalArgumentException(jo.p.o("limit < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.e
    public f R0(long j10) throws EOFException {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (X() >= j10) {
                if (j10 >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                    f c02 = c0((int) j10);
                    k(j10);
                    return c02;
                }
                return new f(t0(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(jo.p.o("byteCount: ", Long.valueOf(j10)).toString());
    }

    public c T0(int i10) {
        if (i10 < 128) {
            b1(i10);
        } else if (i10 < 2048) {
            c0 d02 = d0(2);
            byte[] bArr = d02.f51665a;
            int i11 = d02.f51667c;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            d02.f51667c = i11 + 2;
            O(X() + 2);
        } else {
            boolean z10 = false;
            if (55296 <= i10 && i10 <= 57343) {
                z10 = true;
            }
            if (z10) {
                b1(63);
            } else if (i10 < 65536) {
                c0 d03 = d0(3);
                byte[] bArr2 = d03.f51665a;
                int i12 = d03.f51667c;
                bArr2[i12] = (byte) ((i10 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                d03.f51667c = i12 + 3;
                O(X() + 3);
            } else if (i10 <= 1114111) {
                c0 d04 = d0(4);
                byte[] bArr3 = d04.f51665a;
                int i13 = d04.f51667c;
                bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                d04.f51667c = i13 + 4;
                O(X() + 4);
            } else {
                throw new IllegalArgumentException(jo.p.o("Unexpected code point: 0x", n0.i(i10)));
            }
        }
        return this;
    }

    public final long X() {
        return this.f51657x;
    }

    public final f Y() {
        if (X() <= 2147483647L) {
            return c0((int) X());
        }
        throw new IllegalStateException(jo.p.o("size > Int.MAX_VALUE: ", Long.valueOf(X())).toString());
    }

    @Override // rp.e
    public byte[] Z0() {
        return t0(X());
    }

    @Override // rp.e
    public boolean a1() {
        return this.f51657x == 0;
    }

    @Override // rp.e
    public long b0(f0 f0Var) throws IOException {
        jo.p.h(f0Var, "sink");
        long X = X();
        if (X > 0) {
            f0Var.O0(this, X);
        }
        return X;
    }

    /* renamed from: c */
    public c clone() {
        return h();
    }

    public final f c0(int i10) {
        if (i10 == 0) {
            return f.A;
        }
        n0.b(X(), 0L, i10);
        c0 c0Var = this.f51656w;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            jo.p.e(c0Var);
            int i14 = c0Var.f51667c;
            int i15 = c0Var.f51666b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                c0Var = c0Var.f51670f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        c0 c0Var2 = this.f51656w;
        int i16 = 0;
        while (i11 < i10) {
            jo.p.e(c0Var2);
            bArr[i16] = c0Var2.f51665a;
            i11 += c0Var2.f51667c - c0Var2.f51666b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c0Var2.f51666b;
            c0Var2.f51668d = true;
            i16++;
            c0Var2 = c0Var2.f51670f;
        }
        return new e0(bArr, iArr);
    }

    @Override // rp.e
    public boolean c1(long j10, f fVar) {
        jo.p.h(fVar, "bytes");
        return E(j10, fVar, 0, fVar.G());
    }

    public final void clear() {
        k(X());
    }

    @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final c0 d0(int i10) {
        boolean z10 = true;
        if ((i10 < 1 || i10 > 8192) ? false : false) {
            c0 c0Var = this.f51656w;
            if (c0Var == null) {
                c0 c10 = d0.c();
                this.f51656w = c10;
                c10.f51671g = c10;
                c10.f51670f = c10;
                return c10;
            }
            jo.p.e(c0Var);
            c0 c0Var2 = c0Var.f51671g;
            jo.p.e(c0Var2);
            return (c0Var2.f51667c + i10 > 8192 || !c0Var2.f51669e) ? c0Var2.c(d0.c()) : c0Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final long e() {
        long X = X();
        if (X == 0) {
            return 0L;
        }
        c0 c0Var = this.f51656w;
        jo.p.e(c0Var);
        c0 c0Var2 = c0Var.f51671g;
        jo.p.e(c0Var2);
        int i10 = c0Var2.f51667c;
        if (i10 < 8192 && c0Var2.f51669e) {
            X -= i10 - c0Var2.f51666b;
        }
        return X;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (X() != cVar.X()) {
                return false;
            }
            if (X() != 0) {
                c0 c0Var = this.f51656w;
                jo.p.e(c0Var);
                c0 c0Var2 = cVar.f51656w;
                jo.p.e(c0Var2);
                int i10 = c0Var.f51666b;
                int i11 = c0Var2.f51666b;
                long j10 = 0;
                while (j10 < X()) {
                    long min = Math.min(c0Var.f51667c - i10, c0Var2.f51667c - i11);
                    if (0 < min) {
                        long j11 = 0;
                        while (true) {
                            j11++;
                            int i12 = i10 + 1;
                            int i13 = i11 + 1;
                            if (c0Var.f51665a[i10] != c0Var2.f51665a[i11]) {
                                return false;
                            }
                            if (j11 >= min) {
                                i10 = i12;
                                i11 = i13;
                                break;
                            }
                            i10 = i12;
                            i11 = i13;
                        }
                    }
                    if (i10 == c0Var.f51667c) {
                        c0Var = c0Var.f51670f;
                        jo.p.e(c0Var);
                        i10 = c0Var.f51666b;
                    }
                    if (i11 == c0Var2.f51667c) {
                        c0Var2 = c0Var2.f51670f;
                        jo.p.e(c0Var2);
                        i11 = c0Var2.f51666b;
                    }
                    j10 += min;
                }
            }
        }
        return true;
    }

    @Override // rp.h0
    public long f1(c cVar, long j10) {
        jo.p.h(cVar, "sink");
        if (j10 >= 0) {
            if (X() == 0) {
                return -1L;
            }
            if (j10 > X()) {
                j10 = X();
            }
            cVar.O0(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(jo.p.o("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.d, rp.f0, java.io.Flushable
    public void flush() {
    }

    public final c h() {
        c cVar = new c();
        if (X() != 0) {
            c0 c0Var = this.f51656w;
            jo.p.e(c0Var);
            c0 d10 = c0Var.d();
            cVar.f51656w = d10;
            d10.f51671g = d10;
            d10.f51670f = d10;
            for (c0 c0Var2 = c0Var.f51670f; c0Var2 != c0Var; c0Var2 = c0Var2.f51670f) {
                c0 c0Var3 = d10.f51671g;
                jo.p.e(c0Var3);
                jo.p.e(c0Var2);
                c0Var3.c(c0Var2.d());
            }
            cVar.O(X());
        }
        return cVar;
    }

    @Override // rp.d
    /* renamed from: h0 */
    public c o0(f fVar) {
        jo.p.h(fVar, "byteString");
        fVar.M(this, 0, fVar.G());
        return this;
    }

    public int hashCode() {
        c0 c0Var = this.f51656w;
        if (c0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c0Var.f51667c;
            for (int i12 = c0Var.f51666b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c0Var.f51665a[i12];
            }
            c0Var = c0Var.f51670f;
            jo.p.e(c0Var);
        } while (c0Var != this.f51656w);
        return i10;
    }

    public final c i(c cVar, long j10, long j11) {
        jo.p.h(cVar, "out");
        n0.b(X(), j10, j11);
        if (j11 != 0) {
            cVar.O(cVar.X() + j11);
            c0 c0Var = this.f51656w;
            while (true) {
                jo.p.e(c0Var);
                int i10 = c0Var.f51667c;
                int i11 = c0Var.f51666b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                c0Var = c0Var.f51670f;
            }
            while (j11 > 0) {
                jo.p.e(c0Var);
                c0 d10 = c0Var.d();
                int i12 = d10.f51666b + ((int) j10);
                d10.f51666b = i12;
                d10.f51667c = Math.min(i12 + ((int) j11), d10.f51667c);
                c0 c0Var2 = cVar.f51656w;
                if (c0Var2 == null) {
                    d10.f51671g = d10;
                    d10.f51670f = d10;
                    cVar.f51656w = d10;
                } else {
                    jo.p.e(c0Var2);
                    c0 c0Var3 = c0Var2.f51671g;
                    jo.p.e(c0Var3);
                    c0Var3.c(d10);
                }
                j11 -= d10.f51667c - d10.f51666b;
                c0Var = c0Var.f51670f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // rp.d
    /* renamed from: i0 */
    public c v0(byte[] bArr) {
        jo.p.h(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // rp.e
    public void k(long j10) throws EOFException {
        while (j10 > 0) {
            c0 c0Var = this.f51656w;
            if (c0Var != null) {
                int min = (int) Math.min(j10, c0Var.f51667c - c0Var.f51666b);
                long j11 = min;
                O(X() - j11);
                j10 -= j11;
                int i10 = c0Var.f51666b + min;
                c0Var.f51666b = i10;
                if (i10 == c0Var.f51667c) {
                    this.f51656w = c0Var.b();
                    d0.b(c0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // rp.e
    public c l() {
        return this;
    }

    @Override // rp.d
    /* renamed from: l0 */
    public c write(byte[] bArr, int i10, int i11) {
        jo.p.h(bArr, "source");
        long j10 = i11;
        n0.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            c0 d02 = d0(1);
            int min = Math.min(i12 - i10, 8192 - d02.f51667c);
            int i13 = i10 + min;
            xn.n.d(bArr, d02.f51665a, d02.f51667c, i10, i13);
            d02.f51667c += min;
            i10 = i13;
        }
        O(X() + j10);
        return this;
    }

    @Override // rp.h0
    public i0 m() {
        return i0.f51701e;
    }

    public final byte n(long j10) {
        n0.b(X(), j10, 1L);
        c0 c0Var = this.f51656w;
        if (c0Var != null) {
            if (X() - j10 < j10) {
                long X = X();
                while (X > j10) {
                    c0Var = c0Var.f51671g;
                    jo.p.e(c0Var);
                    X -= c0Var.f51667c - c0Var.f51666b;
                }
                jo.p.e(c0Var);
                return c0Var.f51665a[(int) ((c0Var.f51666b + j10) - X)];
            }
            long j11 = 0;
            while (true) {
                long j12 = (c0Var.f51667c - c0Var.f51666b) + j11;
                if (j12 > j10) {
                    jo.p.e(c0Var);
                    return c0Var.f51665a[(int) ((c0Var.f51666b + j10) - j11)];
                }
                c0Var = c0Var.f51670f;
                jo.p.e(c0Var);
                j11 = j12;
            }
        } else {
            jo.p.e(null);
            throw null;
        }
    }

    @Override // rp.e
    public boolean n0(long j10) {
        return this.f51657x >= j10;
    }

    public long o(byte b10, long j10) {
        return q(b10, j10, Long.MAX_VALUE);
    }

    @Override // rp.d
    /* renamed from: p0 */
    public c b1(int i10) {
        c0 d02 = d0(1);
        byte[] bArr = d02.f51665a;
        int i11 = d02.f51667c;
        d02.f51667c = i11 + 1;
        bArr[i11] = (byte) i10;
        O(X() + 1);
        return this;
    }

    @Override // rp.e
    public e peek() {
        return t.c(new z(this));
    }

    public long q(byte b10, long j10, long j11) {
        c0 c0Var;
        int i10;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            if (j11 > X()) {
                j11 = X();
            }
            long j13 = j11;
            if (j10 == j13 || (c0Var = this.f51656w) == null) {
                return -1L;
            }
            if (X() - j10 < j10) {
                j12 = X();
                while (j12 > j10) {
                    c0Var = c0Var.f51671g;
                    jo.p.e(c0Var);
                    j12 -= c0Var.f51667c - c0Var.f51666b;
                }
                while (j12 < j13) {
                    byte[] bArr = c0Var.f51665a;
                    int min = (int) Math.min(c0Var.f51667c, (c0Var.f51666b + j13) - j12);
                    i10 = (int) ((c0Var.f51666b + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += c0Var.f51667c - c0Var.f51666b;
                    c0Var = c0Var.f51670f;
                    jo.p.e(c0Var);
                    j10 = j12;
                }
                return -1L;
            }
            while (true) {
                long j14 = (c0Var.f51667c - c0Var.f51666b) + j12;
                if (j14 > j10) {
                    break;
                }
                c0Var = c0Var.f51670f;
                jo.p.e(c0Var);
                j12 = j14;
            }
            while (j12 < j13) {
                byte[] bArr2 = c0Var.f51665a;
                int min2 = (int) Math.min(c0Var.f51667c, (c0Var.f51666b + j13) - j12);
                i10 = (int) ((c0Var.f51666b + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i10++;
                    }
                }
                j12 += c0Var.f51667c - c0Var.f51666b;
                c0Var = c0Var.f51670f;
                jo.p.e(c0Var);
                j10 = j12;
            }
            return -1L;
            return (i10 - c0Var.f51666b) + j12;
        }
        throw new IllegalArgumentException(("size=" + X() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    @Override // rp.d
    /* renamed from: q0 */
    public c J0(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return b1(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return a0("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < C.NANOS_PER_SECOND ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < IndexSeeker.MIN_TIME_BETWEEN_POINTS_US ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        c0 d02 = d0(i11);
        byte[] bArr = d02.f51665a;
        int i12 = d02.f51667c + i11;
        while (j10 != 0) {
            long j11 = 10;
            i12--;
            bArr[i12] = sp.f.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i12 - 1] = (byte) 45;
        }
        d02.f51667c += i11;
        O(X() + i11);
        return this;
    }

    @Override // rp.e
    public String q1(Charset charset) {
        jo.p.h(charset, "charset");
        return L(this.f51657x, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        jo.p.h(byteBuffer, "sink");
        c0 c0Var = this.f51656w;
        if (c0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0Var.f51667c - c0Var.f51666b);
        byteBuffer.put(c0Var.f51665a, c0Var.f51666b, min);
        int i10 = c0Var.f51666b + min;
        c0Var.f51666b = i10;
        this.f51657x -= min;
        if (i10 == c0Var.f51667c) {
            this.f51656w = c0Var.b();
            d0.b(c0Var);
        }
        return min;
    }

    @Override // rp.e
    public byte readByte() throws EOFException {
        if (X() != 0) {
            c0 c0Var = this.f51656w;
            jo.p.e(c0Var);
            int i10 = c0Var.f51666b;
            int i11 = c0Var.f51667c;
            int i12 = i10 + 1;
            byte b10 = c0Var.f51665a[i10];
            O(X() - 1);
            if (i12 == i11) {
                this.f51656w = c0Var.b();
                d0.b(c0Var);
            } else {
                c0Var.f51666b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // rp.e
    public int readInt() throws EOFException {
        if (X() >= 4) {
            c0 c0Var = this.f51656w;
            jo.p.e(c0Var);
            int i10 = c0Var.f51666b;
            int i11 = c0Var.f51667c;
            if (i11 - i10 < 4) {
                return ((readByte() & TagConstant.TAG_CAT_RESERVED) << 24) | ((readByte() & TagConstant.TAG_CAT_RESERVED) << 16) | ((readByte() & TagConstant.TAG_CAT_RESERVED) << 8) | (readByte() & TagConstant.TAG_CAT_RESERVED);
            }
            byte[] bArr = c0Var.f51665a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) | ((bArr[i12] & TagConstant.TAG_CAT_RESERVED) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & TagConstant.TAG_CAT_RESERVED) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & TagConstant.TAG_CAT_RESERVED);
            O(X() - 4);
            if (i17 == i11) {
                this.f51656w = c0Var.b();
                d0.b(c0Var);
            } else {
                c0Var.f51666b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // rp.e
    public short readShort() throws EOFException {
        if (X() >= 2) {
            c0 c0Var = this.f51656w;
            jo.p.e(c0Var);
            int i10 = c0Var.f51666b;
            int i11 = c0Var.f51667c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & TagConstant.TAG_CAT_RESERVED) << 8) | (readByte() & TagConstant.TAG_CAT_RESERVED));
            }
            byte[] bArr = c0Var.f51665a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[i12] & TagConstant.TAG_CAT_RESERVED);
            O(X() - 2);
            if (i13 == i11) {
                this.f51656w = c0Var.b();
                d0.b(c0Var);
            } else {
                c0Var.f51666b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // rp.e
    public String s0() throws EOFException {
        return R(Long.MAX_VALUE);
    }

    @Override // rp.e
    public byte[] t0(long j10) throws EOFException {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (X() >= j10) {
                byte[] bArr = new byte[(int) j10];
                I(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(jo.p.o("byteCount: ", Long.valueOf(j10)).toString());
    }

    public String toString() {
        return Y().toString();
    }

    public long v(f fVar, long j10) throws IOException {
        jo.p.h(fVar, "bytes");
        if (fVar.G() > 0) {
            long j11 = 0;
            if (j10 >= 0) {
                c0 c0Var = this.f51656w;
                if (c0Var != null) {
                    if (X() - j10 < j10) {
                        long X = X();
                        while (X > j10) {
                            c0Var = c0Var.f51671g;
                            jo.p.e(c0Var);
                            X -= c0Var.f51667c - c0Var.f51666b;
                        }
                        byte[] u10 = fVar.u();
                        byte b10 = u10[0];
                        int G = fVar.G();
                        long X2 = (X() - G) + 1;
                        long j12 = X;
                        long j13 = j10;
                        while (j12 < X2) {
                            byte[] bArr = c0Var.f51665a;
                            int min = (int) Math.min(c0Var.f51667c, (c0Var.f51666b + X2) - j12);
                            int i10 = (int) ((c0Var.f51666b + j13) - j12);
                            if (i10 < min) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (bArr[i10] == b10 && sp.f.b(c0Var, i11, u10, 1, G)) {
                                        return (i10 - c0Var.f51666b) + j12;
                                    }
                                    if (i11 >= min) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                            j12 += c0Var.f51667c - c0Var.f51666b;
                            c0Var = c0Var.f51670f;
                            jo.p.e(c0Var);
                            j13 = j12;
                        }
                    } else {
                        while (true) {
                            long j14 = (c0Var.f51667c - c0Var.f51666b) + j11;
                            if (j14 > j10) {
                                break;
                            }
                            c0Var = c0Var.f51670f;
                            jo.p.e(c0Var);
                            j11 = j14;
                        }
                        byte[] u11 = fVar.u();
                        byte b11 = u11[0];
                        int G2 = fVar.G();
                        long X3 = (X() - G2) + 1;
                        long j15 = j11;
                        long j16 = j10;
                        while (j15 < X3) {
                            byte[] bArr2 = c0Var.f51665a;
                            long j17 = X3;
                            int min2 = (int) Math.min(c0Var.f51667c, (c0Var.f51666b + X3) - j15);
                            int i12 = (int) ((c0Var.f51666b + j16) - j15);
                            if (i12 < min2) {
                                while (true) {
                                    int i13 = i12 + 1;
                                    if (bArr2[i12] == b11 && sp.f.b(c0Var, i13, u11, 1, G2)) {
                                        return (i12 - c0Var.f51666b) + j15;
                                    }
                                    if (i13 >= min2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                            j15 += c0Var.f51667c - c0Var.f51666b;
                            c0Var = c0Var.f51670f;
                            jo.p.e(c0Var);
                            j16 = j15;
                            X3 = j17;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(jo.p.o("fromIndex < 0: ", Long.valueOf(j10)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // rp.d
    /* renamed from: w0 */
    public c t1(long j10) {
        if (j10 == 0) {
            return b1(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        c0 d02 = d0(i10);
        byte[] bArr = d02.f51665a;
        int i11 = d02.f51667c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = sp.f.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        d02.f51667c += i10;
        O(X() + i10);
        return this;
    }

    @Override // rp.e
    public long w1(f fVar) {
        jo.p.h(fVar, "targetBytes");
        return z(fVar, 0L);
    }

    @Override // rp.e
    public int x1(w wVar) {
        jo.p.h(wVar, "options");
        int e10 = sp.f.e(this, wVar, false, 2, null);
        if (e10 == -1) {
            return -1;
        }
        k(wVar.j()[e10].G());
        return e10;
    }

    @Override // rp.e
    public short y0() throws EOFException {
        return n0.g(readShort());
    }

    public long z(f fVar, long j10) {
        int i10;
        int i11;
        jo.p.h(fVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            c0 c0Var = this.f51656w;
            if (c0Var == null) {
                return -1L;
            }
            if (X() - j10 < j10) {
                j11 = X();
                while (j11 > j10) {
                    c0Var = c0Var.f51671g;
                    jo.p.e(c0Var);
                    j11 -= c0Var.f51667c - c0Var.f51666b;
                }
                if (fVar.G() == 2) {
                    byte l10 = fVar.l(0);
                    byte l11 = fVar.l(1);
                    while (j11 < X()) {
                        byte[] bArr = c0Var.f51665a;
                        i10 = (int) ((c0Var.f51666b + j10) - j11);
                        int i12 = c0Var.f51667c;
                        while (i10 < i12) {
                            byte b10 = bArr[i10];
                            if (b10 != l10 && b10 != l11) {
                                i10++;
                            }
                            i11 = c0Var.f51666b;
                        }
                        j11 += c0Var.f51667c - c0Var.f51666b;
                        c0Var = c0Var.f51670f;
                        jo.p.e(c0Var);
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] u10 = fVar.u();
                while (j11 < X()) {
                    byte[] bArr2 = c0Var.f51665a;
                    i10 = (int) ((c0Var.f51666b + j10) - j11);
                    int i13 = c0Var.f51667c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        int length = u10.length;
                        int i14 = 0;
                        while (i14 < length) {
                            byte b12 = u10[i14];
                            i14++;
                            if (b11 == b12) {
                                i11 = c0Var.f51666b;
                            }
                        }
                        i10++;
                    }
                    j11 += c0Var.f51667c - c0Var.f51666b;
                    c0Var = c0Var.f51670f;
                    jo.p.e(c0Var);
                    j10 = j11;
                }
                return -1L;
            }
            while (true) {
                long j12 = (c0Var.f51667c - c0Var.f51666b) + j11;
                if (j12 > j10) {
                    break;
                }
                c0Var = c0Var.f51670f;
                jo.p.e(c0Var);
                j11 = j12;
            }
            if (fVar.G() == 2) {
                byte l12 = fVar.l(0);
                byte l13 = fVar.l(1);
                while (j11 < X()) {
                    byte[] bArr3 = c0Var.f51665a;
                    i10 = (int) ((c0Var.f51666b + j10) - j11);
                    int i15 = c0Var.f51667c;
                    while (i10 < i15) {
                        byte b13 = bArr3[i10];
                        if (b13 != l12 && b13 != l13) {
                            i10++;
                        }
                        i11 = c0Var.f51666b;
                    }
                    j11 += c0Var.f51667c - c0Var.f51666b;
                    c0Var = c0Var.f51670f;
                    jo.p.e(c0Var);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] u11 = fVar.u();
            while (j11 < X()) {
                byte[] bArr4 = c0Var.f51665a;
                i10 = (int) ((c0Var.f51666b + j10) - j11);
                int i16 = c0Var.f51667c;
                while (i10 < i16) {
                    byte b14 = bArr4[i10];
                    int length2 = u11.length;
                    int i17 = 0;
                    while (i17 < length2) {
                        byte b15 = u11[i17];
                        i17++;
                        if (b14 == b15) {
                            i11 = c0Var.f51666b;
                        }
                    }
                    i10++;
                }
                j11 += c0Var.f51667c - c0Var.f51666b;
                c0Var = c0Var.f51670f;
                jo.p.e(c0Var);
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j11;
        }
        throw new IllegalArgumentException(jo.p.o("fromIndex < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // rp.e
    public long z0(f fVar) throws IOException {
        jo.p.h(fVar, "bytes");
        return v(fVar, 0L);
    }

    /* loaded from: classes4.dex */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.X(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (c.this.X() > 0) {
                return c.this.readByte() & TagConstant.TAG_CAT_RESERVED;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            jo.p.h(bArr, "sink");
            return c.this.F(bArr, i10, i11);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        jo.p.h(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            c0 d02 = d0(1);
            int min = Math.min(i10, 8192 - d02.f51667c);
            byteBuffer.get(d02.f51665a, d02.f51667c, min);
            i10 -= min;
            d02.f51667c += min;
        }
        this.f51657x += remaining;
        return remaining;
    }
}
