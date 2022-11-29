package e2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f30108a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f30109b;

    /* renamed from: c  reason: collision with root package name */
    public int f30110c;

    /* renamed from: d  reason: collision with root package name */
    public int f30111d;

    public j(char[] cArr, int i10, int i11) {
        jo.p.h(cArr, "initBuffer");
        this.f30108a = cArr.length;
        this.f30109b = cArr;
        this.f30110c = i10;
        this.f30111d = i11;
    }

    public final void a(StringBuilder sb2) {
        jo.p.h(sb2, "builder");
        sb2.append(this.f30109b, 0, this.f30110c);
        char[] cArr = this.f30109b;
        int i10 = this.f30111d;
        sb2.append(cArr, i10, this.f30108a - i10);
    }

    public final void b(int i10, int i11) {
        int i12 = this.f30110c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f30109b;
            xn.n.e(cArr, cArr, this.f30111d - i13, i11, i12);
            this.f30110c = i10;
            this.f30111d -= i13;
        } else if (i10 < i12 && i11 >= i12) {
            this.f30111d = i11 + c();
            this.f30110c = i10;
        } else {
            int c10 = i10 + c();
            int c11 = i11 + c();
            int i14 = this.f30111d;
            char[] cArr2 = this.f30109b;
            xn.n.e(cArr2, cArr2, this.f30110c, i14, c10);
            this.f30110c += c10 - i14;
            this.f30111d = c11;
        }
    }

    public final int c() {
        return this.f30111d - this.f30110c;
    }

    public final char d(int i10) {
        int i11 = this.f30110c;
        if (i10 < i11) {
            return this.f30109b[i10];
        }
        return this.f30109b[(i10 - i11) + this.f30111d];
    }

    public final int e() {
        return this.f30108a - c();
    }

    public final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int c10 = i10 - c();
        int i11 = this.f30108a;
        do {
            i11 *= 2;
        } while (i11 - this.f30108a < c10);
        char[] cArr = new char[i11];
        xn.n.e(this.f30109b, cArr, 0, 0, this.f30110c);
        int i12 = this.f30108a;
        int i13 = this.f30111d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        xn.n.e(this.f30109b, cArr, i15, i13, i14 + i13);
        this.f30109b = cArr;
        this.f30108a = i11;
        this.f30111d = i15;
    }

    public final void g(int i10, int i11, String str) {
        jo.p.h(str, "text");
        f(str.length() - (i11 - i10));
        b(i10, i11);
        k.c(str, this.f30109b, this.f30110c, 0, 0, 12, null);
        this.f30110c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply { append(this) }.toString()");
        return sb3;
    }
}
