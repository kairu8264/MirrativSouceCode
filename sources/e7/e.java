package e7;

import e7.c;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import rp.f;

/* loaded from: classes.dex */
public final class e extends c {
    public static final f J = f.h("'\\");
    public static final f K = f.h("\"\\");
    public static final f L = f.h("{}[]:, \n\t\r\f/\\;#=");
    public static final f M = f.h("\n\r");
    public static final f N = f.h("*/");
    public final rp.e D;
    public final rp.c E;
    public int F = 0;
    public long G;
    public int H;
    public String I;

    public e(rp.e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        this.D = eVar;
        this.E = eVar.A();
        C(6);
    }

    @Override // e7.c
    public int E(c.a aVar) throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return O(this.I, aVar);
        }
        int x12 = this.D.x1(aVar.f30308b);
        if (x12 != -1) {
            this.F = 0;
            this.f30305y[this.f30303w - 1] = aVar.f30307a[x12];
            return x12;
        }
        String str = this.f30305y[this.f30303w - 1];
        String p10 = p();
        int O = O(p10, aVar);
        if (O == -1) {
            this.F = 15;
            this.I = p10;
            this.f30305y[this.f30303w - 1] = str;
        }
        return O;
    }

    @Override // e7.c
    public void F() throws IOException {
        if (!this.B) {
            int i10 = this.F;
            if (i10 == 0) {
                i10 = N();
            }
            if (i10 == 14) {
                l0();
            } else if (i10 == 13) {
                h0(K);
            } else if (i10 == 12) {
                h0(J);
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + z() + " at path " + getPath());
            }
            this.F = 0;
            this.f30305y[this.f30303w - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + z() + " at " + getPath());
    }

    @Override // e7.c
    public void G() throws IOException {
        if (!this.B) {
            int i10 = 0;
            do {
                int i11 = this.F;
                if (i11 == 0) {
                    i11 = N();
                }
                if (i11 == 3) {
                    C(1);
                } else if (i11 == 1) {
                    C(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 >= 0) {
                            this.f30303w--;
                        } else {
                            throw new a("Expected a value but was " + z() + " at path " + getPath());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 >= 0) {
                            this.f30303w--;
                        } else {
                            throw new a("Expected a value but was " + z() + " at path " + getPath());
                        }
                    } else if (i11 == 14 || i11 == 10) {
                        l0();
                    } else if (i11 == 9 || i11 == 13) {
                        h0(K);
                    } else if (i11 == 8 || i11 == 12) {
                        h0(J);
                    } else if (i11 == 17) {
                        this.E.k(this.H);
                    } else if (i11 == 18) {
                        throw new a("Expected a value but was " + z() + " at path " + getPath());
                    }
                    this.F = 0;
                }
                i10++;
                this.F = 0;
            } while (i10 != 0);
            int[] iArr = this.f30306z;
            int i12 = this.f30303w;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f30305y[i12 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + z() + " at " + getPath());
    }

    public final void L() throws IOException {
        if (!this.A) {
            throw K("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int N() throws IOException {
        int[] iArr = this.f30304x;
        int i10 = this.f30303w;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int S = S(true);
            this.E.readByte();
            if (S != 44) {
                if (S != 59) {
                    if (S == 93) {
                        this.F = 4;
                        return 4;
                    }
                    throw K("Unterminated array");
                }
                L();
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5) {
                int S2 = S(true);
                this.E.readByte();
                if (S2 != 44) {
                    if (S2 != 59) {
                        if (S2 == 125) {
                            this.F = 2;
                            return 2;
                        }
                        throw K("Unterminated object");
                    }
                    L();
                }
            }
            int S3 = S(true);
            if (S3 == 34) {
                this.E.readByte();
                this.F = 13;
                return 13;
            } else if (S3 == 39) {
                this.E.readByte();
                L();
                this.F = 12;
                return 12;
            } else if (S3 != 125) {
                L();
                if (P((char) S3)) {
                    this.F = 14;
                    return 14;
                }
                throw K("Expected name");
            } else if (i11 != 5) {
                this.E.readByte();
                this.F = 2;
                return 2;
            } else {
                throw K("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int S4 = S(true);
            this.E.readByte();
            if (S4 != 58) {
                if (S4 == 61) {
                    L();
                    if (this.D.n0(1L) && this.E.n(0L) == 62) {
                        this.E.readByte();
                    }
                } else {
                    throw K("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            iArr[i10 - 1] = 7;
        } else if (i11 == 7) {
            if (S(false) == -1) {
                this.F = 18;
                return 18;
            }
            L();
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int S5 = S(true);
        if (S5 == 34) {
            this.E.readByte();
            this.F = 9;
            return 9;
        } else if (S5 == 39) {
            L();
            this.E.readByte();
            this.F = 8;
            return 8;
        } else {
            if (S5 != 44 && S5 != 59) {
                if (S5 == 91) {
                    this.E.readByte();
                    this.F = 3;
                    return 3;
                } else if (S5 != 93) {
                    if (S5 != 123) {
                        int Y = Y();
                        if (Y != 0) {
                            return Y;
                        }
                        int c02 = c0();
                        if (c02 != 0) {
                            return c02;
                        }
                        if (P(this.E.n(0L))) {
                            L();
                            this.F = 10;
                            return 10;
                        }
                        throw K("Expected value");
                    }
                    this.E.readByte();
                    this.F = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.E.readByte();
                    this.F = 4;
                    return 4;
                }
            }
            if (i11 != 1 && i11 != 2) {
                throw K("Unexpected value");
            }
            L();
            this.F = 7;
            return 7;
        }
    }

    public final int O(String str, c.a aVar) {
        int length = aVar.f30307a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f30307a[i10])) {
                this.F = 0;
                this.f30305y[this.f30303w - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean P(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        L();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.E.k(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.D.n0(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        L();
        r3 = r6.E.n(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.E.readByte();
        r6.E.readByte();
        k0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.E.readByte();
        r6.E.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (i0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw K("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        L();
        k0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int S(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            rp.e r2 = r6.D
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.n0(r4)
            if (r2 == 0) goto L82
            rp.c r2 = r6.E
            long r4 = (long) r1
            byte r1 = r2.n(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            rp.c r2 = r6.E
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.k(r3)
            r2 = 47
            if (r1 != r2) goto L74
            rp.e r3 = r6.D
            r4 = 2
            boolean r3 = r3.n0(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.L()
            rp.c r3 = r6.E
            r4 = 1
            byte r3 = r3.n(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            rp.c r1 = r6.E
            r1.readByte()
            rp.c r1 = r6.E
            r1.readByte()
            r6.k0()
            goto L1
        L5c:
            rp.c r1 = r6.E
            r1.readByte()
            rp.c r1 = r6.E
            r1.readByte()
            boolean r1 = r6.i0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            e7.b r7 = r6.K(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.L()
            r6.k0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.e.S(boolean):int");
    }

    public final String U(f fVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long w12 = this.D.w1(fVar);
            if (w12 != -1) {
                if (this.E.n(w12) != 92) {
                    if (sb2 == null) {
                        String P0 = this.E.P0(w12);
                        this.E.readByte();
                        return P0;
                    }
                    sb2.append(this.E.P0(w12));
                    this.E.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.E.P0(w12));
                this.E.readByte();
                sb2.append(d0());
            } else {
                throw K("Unterminated string");
            }
        }
    }

    public final String X() throws IOException {
        long w12 = this.D.w1(L);
        return w12 != -1 ? this.E.P0(w12) : this.E.N();
    }

    public final int Y() throws IOException {
        int i10;
        String str;
        String str2;
        byte n10 = this.E.n(0L);
        if (n10 == 116 || n10 == 84) {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (n10 == 102 || n10 == 70) {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (n10 != 110 && n10 != 78) {
            return 0;
        } else {
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.D.n0(i12)) {
                return 0;
            }
            byte n11 = this.E.n(i11);
            if (n11 != str.charAt(i11) && n11 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.D.n0(length + 1) && P(this.E.n(length))) {
            return 0;
        }
        this.E.k(length);
        this.F = i10;
        return i10;
    }

    @Override // e7.c
    public void c() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 3) {
            C(1);
            this.f30306z[this.f30303w - 1] = 0;
            this.F = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + z() + " at path " + getPath());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (P(r11) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
        if (r6 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (r7 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r10 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r10 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
        if (r10 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        r16.G = r8;
        r16.E.k(r5);
        r16.F = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r6 == 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
        if (r6 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r6 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
        r16.H = r5;
        r16.F = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.e.c0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.F = 0;
        this.f30304x[0] = 8;
        this.f30303w = 1;
        this.E.clear();
        this.D.close();
    }

    @Override // e7.c
    public void d() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 1) {
            C(3);
            this.F = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + z() + " at path " + getPath());
    }

    public final char d0() throws IOException {
        int i10;
        int i11;
        if (this.D.n0(1L)) {
            byte readByte = this.E.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.A) {
                                        return (char) readByte;
                                    }
                                    throw K("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.D.n0(4L)) {
                                    char c10 = 0;
                                    for (int i12 = 0; i12 < 4; i12++) {
                                        byte n10 = this.E.n(i12);
                                        char c11 = (char) (c10 << 4);
                                        if (n10 < 48 || n10 > 57) {
                                            if (n10 >= 97 && n10 <= 102) {
                                                i10 = n10 - 97;
                                            } else if (n10 < 65 || n10 > 70) {
                                                throw K("\\u" + this.E.P0(4L));
                                            } else {
                                                i10 = n10 - 65;
                                            }
                                            i11 = i10 + 10;
                                        } else {
                                            i11 = n10 - 48;
                                        }
                                        c10 = (char) (c11 + i11);
                                    }
                                    this.E.k(4L);
                                    return c10;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + getPath());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        throw K("Unterminated escape sequence");
    }

    @Override // e7.c
    public void e() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 4) {
            int i11 = this.f30303w - 1;
            this.f30303w = i11;
            int[] iArr = this.f30306z;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.F = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + z() + " at path " + getPath());
    }

    @Override // e7.c
    public void h() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 2) {
            int i11 = this.f30303w - 1;
            this.f30303w = i11;
            this.f30305y[i11] = null;
            int[] iArr = this.f30306z;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.F = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + z() + " at path " + getPath());
    }

    public final void h0(f fVar) throws IOException {
        while (true) {
            long w12 = this.D.w1(fVar);
            if (w12 != -1) {
                if (this.E.n(w12) == 92) {
                    this.E.k(w12 + 1);
                    d0();
                } else {
                    this.E.k(w12 + 1);
                    return;
                }
            } else {
                throw K("Unterminated string");
            }
        }
    }

    @Override // e7.c
    public boolean i() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public final boolean i0() throws IOException {
        rp.e eVar = this.D;
        f fVar = N;
        long z02 = eVar.z0(fVar);
        boolean z10 = z02 != -1;
        rp.c cVar = this.E;
        cVar.k(z10 ? z02 + fVar.G() : cVar.X());
        return z10;
    }

    @Override // e7.c
    public boolean j() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 5) {
            this.F = 0;
            int[] iArr = this.f30306z;
            int i11 = this.f30303w - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.F = 0;
            int[] iArr2 = this.f30306z;
            int i12 = this.f30303w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + z() + " at path " + getPath());
        }
    }

    public final void k0() throws IOException {
        long w12 = this.D.w1(M);
        rp.c cVar = this.E;
        cVar.k(w12 != -1 ? w12 + 1 : cVar.X());
    }

    public final void l0() throws IOException {
        long w12 = this.D.w1(L);
        rp.c cVar = this.E;
        if (w12 == -1) {
            w12 = cVar.X();
        }
        cVar.k(w12);
    }

    @Override // e7.c
    public double n() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 16) {
            this.F = 0;
            int[] iArr = this.f30306z;
            int i11 = this.f30303w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.G;
        }
        if (i10 == 17) {
            this.I = this.E.P0(this.H);
        } else if (i10 == 9) {
            this.I = U(K);
        } else if (i10 == 8) {
            this.I = U(J);
        } else if (i10 == 10) {
            this.I = X();
        } else if (i10 != 11) {
            throw new a("Expected a double but was " + z() + " at path " + getPath());
        }
        this.F = 11;
        try {
            double parseDouble = Double.parseDouble(this.I);
            if (!this.A && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.I = null;
            this.F = 0;
            int[] iArr2 = this.f30306z;
            int i12 = this.f30303w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.I + " at path " + getPath());
        }
    }

    @Override // e7.c
    public int o() throws IOException {
        String U;
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 16) {
            long j10 = this.G;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.F = 0;
                int[] iArr = this.f30306z;
                int i12 = this.f30303w - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.G + " at path " + getPath());
        }
        if (i10 == 17) {
            this.I = this.E.P0(this.H);
        } else if (i10 == 9 || i10 == 8) {
            if (i10 == 9) {
                U = U(K);
            } else {
                U = U(J);
            }
            this.I = U;
            try {
                int parseInt = Integer.parseInt(U);
                this.F = 0;
                int[] iArr2 = this.f30306z;
                int i13 = this.f30303w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + z() + " at path " + getPath());
        }
        this.F = 11;
        try {
            double parseDouble = Double.parseDouble(this.I);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.I = null;
                this.F = 0;
                int[] iArr3 = this.f30306z;
                int i15 = this.f30303w - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.I + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.I + " at path " + getPath());
        }
    }

    @Override // e7.c
    public String p() throws IOException {
        String str;
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 14) {
            str = X();
        } else if (i10 == 13) {
            str = U(K);
        } else if (i10 == 12) {
            str = U(J);
        } else if (i10 == 15) {
            str = this.I;
        } else {
            throw new a("Expected a name but was " + z() + " at path " + getPath());
        }
        this.F = 0;
        this.f30305y[this.f30303w - 1] = str;
        return str;
    }

    @Override // e7.c
    public String q() throws IOException {
        String P0;
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        if (i10 == 10) {
            P0 = X();
        } else if (i10 == 9) {
            P0 = U(K);
        } else if (i10 == 8) {
            P0 = U(J);
        } else if (i10 == 11) {
            P0 = this.I;
            this.I = null;
        } else if (i10 == 16) {
            P0 = Long.toString(this.G);
        } else if (i10 == 17) {
            P0 = this.E.P0(this.H);
        } else {
            throw new a("Expected a string but was " + z() + " at path " + getPath());
        }
        this.F = 0;
        int[] iArr = this.f30306z;
        int i11 = this.f30303w - 1;
        iArr[i11] = iArr[i11] + 1;
        return P0;
    }

    public String toString() {
        return "JsonReader(" + this.D + ")";
    }

    @Override // e7.c
    public c.b z() throws IOException {
        int i10 = this.F;
        if (i10 == 0) {
            i10 = N();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
