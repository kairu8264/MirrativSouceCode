package m3;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final e f40552d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f40553e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f40554f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f40555g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f40556h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40557a;

    /* renamed from: b  reason: collision with root package name */
    public final int f40558b;

    /* renamed from: c  reason: collision with root package name */
    public final e f40559c;

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0588a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f40560a;

        /* renamed from: b  reason: collision with root package name */
        public int f40561b;

        /* renamed from: c  reason: collision with root package name */
        public e f40562c;

        public C0588a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f40556h : a.f40555g;
        }

        public a a() {
            if (this.f40561b == 2 && this.f40562c == a.f40552d) {
                return b(this.f40560a);
            }
            return new a(this.f40560a, this.f40561b, this.f40562c);
        }

        public final void c(boolean z10) {
            this.f40560a = z10;
            this.f40562c = a.f40552d;
            this.f40561b = 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f40563f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f40564a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f40565b;

        /* renamed from: c  reason: collision with root package name */
        public final int f40566c;

        /* renamed from: d  reason: collision with root package name */
        public int f40567d;

        /* renamed from: e  reason: collision with root package name */
        public char f40568e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f40563f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f40564a = charSequence;
            this.f40565b = z10;
            this.f40566c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f40563f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char charAt = this.f40564a.charAt(this.f40567d - 1);
            this.f40568e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f40564a, this.f40567d);
                this.f40567d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f40567d--;
            byte c10 = c(this.f40568e);
            if (this.f40565b) {
                char c11 = this.f40568e;
                if (c11 == '>') {
                    return h();
                }
                return c11 == ';' ? f() : c10;
            }
            return c10;
        }

        public byte b() {
            char charAt = this.f40564a.charAt(this.f40567d);
            this.f40568e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f40564a, this.f40567d);
                this.f40567d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f40567d++;
            byte c10 = c(this.f40568e);
            if (this.f40565b) {
                char c11 = this.f40568e;
                if (c11 == '<') {
                    return i();
                }
                return c11 == '&' ? g() : c10;
            }
            return c10;
        }

        public int d() {
            this.f40567d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f40567d < this.f40566c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f40567d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f40567d = this.f40566c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f40567d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i10 = this.f40567d;
            do {
                int i11 = this.f40567d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f40564a;
                int i12 = i11 - 1;
                this.f40567d = i12;
                charAt = charSequence.charAt(i12);
                this.f40568e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f40567d = i10;
            this.f40568e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i10 = this.f40567d;
                if (i10 >= this.f40566c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f40564a;
                this.f40567d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f40568e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i10 = this.f40567d;
            while (true) {
                int i11 = this.f40567d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f40564a;
                int i12 = i11 - 1;
                this.f40567d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f40568e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f40567d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f40564a;
                            int i14 = i13 - 1;
                            this.f40567d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f40568e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f40567d = i10;
            this.f40568e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i10 = this.f40567d;
            while (true) {
                int i11 = this.f40567d;
                if (i11 < this.f40566c) {
                    CharSequence charSequence = this.f40564a;
                    this.f40567d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f40568e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f40567d;
                            if (i12 < this.f40566c) {
                                CharSequence charSequence2 = this.f40564a;
                                this.f40567d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f40568e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f40567d = i10;
                    this.f40568e = '<';
                    return (byte) 13;
                }
            }
        }
    }

    static {
        e eVar = f.f40586c;
        f40552d = eVar;
        f40553e = Character.toString((char) 8206);
        f40554f = Character.toString((char) 8207);
        f40555g = new a(false, 2, eVar);
        f40556h = new a(true, 2, eVar);
    }

    public a(boolean z10, int i10, e eVar) {
        this.f40557a = z10;
        this.f40558b = i10;
        this.f40559c = eVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0588a().a();
    }

    public static boolean e(Locale locale) {
        return g.b(locale) == 1;
    }

    public boolean d() {
        return (this.f40558b & 2) != 0;
    }

    public final String f(CharSequence charSequence, e eVar) {
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f40557a || !(a10 || b(charSequence) == 1)) {
            return this.f40557a ? (!a10 || b(charSequence) == -1) ? f40554f : "" : "";
        }
        return f40553e;
    }

    public final String g(CharSequence charSequence, e eVar) {
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        if (this.f40557a || !(a10 || a(charSequence) == 1)) {
            return this.f40557a ? (!a10 || a(charSequence) == -1) ? f40554f : "" : "";
        }
        return f40553e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f40559c, true);
    }

    public CharSequence i(CharSequence charSequence, e eVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = eVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? f.f40585b : f.f40584a));
        }
        if (a10 != this.f40557a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? f.f40585b : f.f40584a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f40559c, true);
    }

    public String k(String str, e eVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, eVar, z10).toString();
    }
}
