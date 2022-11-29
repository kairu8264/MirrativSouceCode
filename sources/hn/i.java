package hn;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f36173a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36174b;

    /* renamed from: c  reason: collision with root package name */
    public int f36175c;

    /* renamed from: d  reason: collision with root package name */
    public int f36176d;

    /* renamed from: e  reason: collision with root package name */
    public int f36177e;

    /* renamed from: f  reason: collision with root package name */
    public int f36178f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f36179g;

    public i(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f36173a = name;
        this.f36174b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        return new java.lang.String(r1, r2, r8.f36178f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f36175c
            r8.f36176d = r0
            r8.f36177e = r0
        L6:
            int r0 = r8.f36175c
            int r1 = r8.f36174b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f36179g
            int r2 = r8.f36176d
            int r3 = r8.f36177e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f36179g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5e
            if (r2 == r5) goto L53
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            int r2 = r8.f36177e
            int r3 = r2 + 1
            r8.f36177e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f36175c = r0
            goto L6
        L40:
            int r0 = r8.f36177e
            int r2 = r0 + 1
            r8.f36177e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f36175c
            int r0 = r0 + 1
            r8.f36175c = r0
            goto L6
        L53:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f36176d
            int r3 = r8.f36177e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5e:
            int r2 = r8.f36177e
            r8.f36178f = r2
            int r0 = r0 + 1
            r8.f36175c = r0
            int r0 = r2 + 1
            r8.f36177e = r0
            r1[r2] = r6
        L6c:
            int r0 = r8.f36175c
            int r1 = r8.f36174b
            if (r0 >= r1) goto L85
            char[] r2 = r8.f36179g
            char r7 = r2[r0]
            if (r7 != r6) goto L85
            int r1 = r8.f36177e
            int r7 = r1 + 1
            r8.f36177e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f36175c = r0
            goto L6c
        L85:
            if (r0 == r1) goto L95
            char[] r1 = r8.f36179g
            char r2 = r1[r0]
            if (r2 == r3) goto L95
            char r2 = r1[r0]
            if (r2 == r4) goto L95
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L95:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f36179g
            int r2 = r8.f36176d
            int r3 = r8.f36178f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.i.a():java.lang.String");
    }

    public String b(String str) {
        String h10;
        this.f36175c = 0;
        this.f36176d = 0;
        this.f36177e = 0;
        this.f36178f = 0;
        this.f36179g = this.f36173a.toCharArray();
        String g10 = g();
        if (g10 == null) {
            return null;
        }
        do {
            int i10 = this.f36175c;
            if (i10 == this.f36174b) {
                return null;
            }
            char c10 = this.f36179g[i10];
            if (c10 == '\"') {
                h10 = h();
            } else if (c10 != '#') {
                h10 = (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a();
            } else {
                h10 = f();
            }
            if (str.equalsIgnoreCase(g10)) {
                return h10;
            }
            int i11 = this.f36175c;
            if (i11 >= this.f36174b) {
                return null;
            }
            char[] cArr = this.f36179g;
            if (cArr[i11] != ',' && cArr[i11] != ';' && cArr[i11] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f36173a);
            }
            this.f36175c = i11 + 1;
            g10 = g();
        } while (g10 != null);
        throw new IllegalStateException("Malformed DN: " + this.f36173a);
    }

    public final int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 < this.f36174b) {
            char[] cArr = this.f36179g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f36173a);
            } else {
                i11 = c10 - '7';
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f36173a);
            } else {
                i12 = c11 - '7';
            }
            return (i11 << 4) + i12;
        }
        throw new IllegalStateException("Malformed DN: " + this.f36173a);
    }

    public final char d() {
        int i10 = this.f36175c + 1;
        this.f36175c = i10;
        if (i10 != this.f36174b) {
            char[] cArr = this.f36179g;
            char c10 = cArr[i10];
            if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
                switch (c10) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c10) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return e();
                        }
                }
            }
            return cArr[i10];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
    }

    public final char e() {
        int i10;
        int i11;
        int c10 = c(this.f36175c);
        this.f36175c++;
        if (c10 < 128) {
            return (char) c10;
        }
        if (c10 < 192 || c10 > 247) {
            return '?';
        }
        if (c10 <= 223) {
            i11 = c10 & 31;
            i10 = 1;
        } else if (c10 <= 239) {
            i10 = 2;
            i11 = c10 & 15;
        } else {
            i10 = 3;
            i11 = c10 & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f36175c + 1;
            this.f36175c = i13;
            if (i13 == this.f36174b || this.f36179g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f36175c = i14;
            int c11 = c(i14);
            this.f36175c++;
            if ((c11 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (c11 & 63);
        }
        return (char) i11;
    }

    public final String f() {
        int i10;
        int i11 = this.f36175c;
        if (i11 + 4 < this.f36174b) {
            this.f36176d = i11;
            this.f36175c = i11 + 1;
            while (true) {
                i10 = this.f36175c;
                if (i10 == this.f36174b) {
                    break;
                }
                char[] cArr = this.f36179g;
                if (cArr[i10] == '+' || cArr[i10] == ',' || cArr[i10] == ';') {
                    break;
                } else if (cArr[i10] == ' ') {
                    this.f36177e = i10;
                    this.f36175c = i10 + 1;
                    while (true) {
                        int i12 = this.f36175c;
                        if (i12 >= this.f36174b || this.f36179g[i12] != ' ') {
                            break;
                        }
                        this.f36175c = i12 + 1;
                    }
                } else {
                    if (cArr[i10] >= 'A' && cArr[i10] <= 'F') {
                        cArr[i10] = (char) (cArr[i10] + ' ');
                    }
                    this.f36175c = i10 + 1;
                }
            }
            this.f36177e = i10;
            int i13 = this.f36177e;
            int i14 = this.f36176d;
            int i15 = i13 - i14;
            if (i15 >= 5 && (i15 & 1) != 0) {
                int i16 = i15 / 2;
                byte[] bArr = new byte[i16];
                int i17 = i14 + 1;
                for (int i18 = 0; i18 < i16; i18++) {
                    bArr[i18] = (byte) c(i17);
                    i17 += 2;
                }
                return new String(this.f36179g, this.f36176d, i15);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
    }

    public final String g() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        while (true) {
            i10 = this.f36175c;
            i11 = this.f36174b;
            if (i10 >= i11 || this.f36179g[i10] != ' ') {
                break;
            }
            this.f36175c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f36176d = i10;
        this.f36175c = i10 + 1;
        while (true) {
            i12 = this.f36175c;
            i13 = this.f36174b;
            if (i12 >= i13) {
                break;
            }
            char[] cArr = this.f36179g;
            if (cArr[i12] == '=' || cArr[i12] == ' ') {
                break;
            }
            this.f36175c = i12 + 1;
        }
        if (i12 < i13) {
            this.f36177e = i12;
            if (this.f36179g[i12] == ' ') {
                while (true) {
                    i14 = this.f36175c;
                    i15 = this.f36174b;
                    if (i14 >= i15) {
                        break;
                    }
                    char[] cArr2 = this.f36179g;
                    if (cArr2[i14] == '=' || cArr2[i14] != ' ') {
                        break;
                    }
                    this.f36175c = i14 + 1;
                }
                if (this.f36179g[i14] != '=' || i14 == i15) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
                }
            }
            this.f36175c++;
            while (true) {
                int i16 = this.f36175c;
                if (i16 >= this.f36174b || this.f36179g[i16] != ' ') {
                    break;
                }
                this.f36175c = i16 + 1;
            }
            int i17 = this.f36177e;
            int i18 = this.f36176d;
            if (i17 - i18 > 4) {
                char[] cArr3 = this.f36179g;
                if (cArr3[i18 + 3] == '.' && ((cArr3[i18] == 'O' || cArr3[i18] == 'o') && ((cArr3[i18 + 1] == 'I' || cArr3[i18 + 1] == 'i') && (cArr3[i18 + 2] == 'D' || cArr3[i18 + 2] == 'd')))) {
                    this.f36176d = i18 + 4;
                }
            }
            char[] cArr4 = this.f36179g;
            int i19 = this.f36176d;
            return new String(cArr4, i19, i17 - i19);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
    }

    public final String h() {
        int i10 = this.f36175c + 1;
        this.f36175c = i10;
        this.f36176d = i10;
        this.f36177e = i10;
        while (true) {
            int i11 = this.f36175c;
            if (i11 != this.f36174b) {
                char[] cArr = this.f36179g;
                if (cArr[i11] == '\"') {
                    this.f36175c = i11 + 1;
                    while (true) {
                        int i12 = this.f36175c;
                        if (i12 >= this.f36174b || this.f36179g[i12] != ' ') {
                            break;
                        }
                        this.f36175c = i12 + 1;
                    }
                    char[] cArr2 = this.f36179g;
                    int i13 = this.f36176d;
                    return new String(cArr2, i13, this.f36177e - i13);
                }
                if (cArr[i11] == '\\') {
                    cArr[this.f36177e] = d();
                } else {
                    cArr[this.f36177e] = cArr[i11];
                }
                this.f36175c++;
                this.f36177e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f36173a);
            }
        }
    }
}
