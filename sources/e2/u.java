package e2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final a f30149e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f30150a;

    /* renamed from: b  reason: collision with root package name */
    public j f30151b;

    /* renamed from: c  reason: collision with root package name */
    public int f30152c;

    /* renamed from: d  reason: collision with root package name */
    public int f30153d;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public u(String str) {
        jo.p.h(str, "text");
        this.f30150a = str;
        this.f30152c = -1;
        this.f30153d = -1;
    }

    public final char a(int i10) {
        j jVar = this.f30151b;
        if (jVar == null) {
            return this.f30150a.charAt(i10);
        }
        if (i10 < this.f30152c) {
            return this.f30150a.charAt(i10);
        }
        int e10 = jVar.e();
        int i11 = this.f30152c;
        if (i10 < e10 + i11) {
            return jVar.d(i10 - i11);
        }
        return this.f30150a.charAt(i10 - ((e10 - this.f30153d) + i11));
    }

    public final int b() {
        j jVar = this.f30151b;
        return jVar == null ? this.f30150a.length() : (this.f30150a.length() - (this.f30153d - this.f30152c)) + jVar.e();
    }

    public final void c(int i10, int i11, String str) {
        jo.p.h(str, "text");
        j jVar = this.f30151b;
        if (jVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i10, 64);
            int min2 = Math.min(this.f30150a.length() - i11, 64);
            int i12 = i10 - min;
            k.b(this.f30150a, cArr, 0, i12, i10);
            int i13 = max - min2;
            int i14 = i11 + min2;
            k.b(this.f30150a, cArr, i13, i11, i14);
            k.c(str, cArr, min, 0, 0, 12, null);
            this.f30151b = new j(cArr, min + str.length(), i13);
            this.f30152c = i12;
            this.f30153d = i14;
            return;
        }
        int i15 = this.f30152c;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 >= 0 && i17 <= jVar.e()) {
            jVar.g(i16, i17, str);
            return;
        }
        this.f30150a = toString();
        this.f30151b = null;
        this.f30152c = -1;
        this.f30153d = -1;
        c(i10, i11, str);
    }

    public String toString() {
        j jVar = this.f30151b;
        if (jVar == null) {
            return this.f30150a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f30150a, 0, this.f30152c);
        jVar.a(sb2);
        String str = this.f30150a;
        sb2.append((CharSequence) str, this.f30153d, str.length());
        String sb3 = sb2.toString();
        jo.p.g(sb3, "sb.toString()");
        return sb3;
    }
}
