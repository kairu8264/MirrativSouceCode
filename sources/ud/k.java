package ud;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f55071a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f55072b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f55073c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55074d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55075e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55076f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f55077g;

    public k(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        jo.p.h(str, "birthdayText");
        this.f55071a = str;
        this.f55072b = z10;
        this.f55073c = z11;
        this.f55074d = z12;
        this.f55075e = z13;
        this.f55076f = z14;
        this.f55077g = z15;
    }

    public final String a() {
        return this.f55071a;
    }

    public final boolean b() {
        return this.f55077g;
    }

    public final boolean c() {
        return this.f55074d;
    }

    public final boolean d() {
        return this.f55076f;
    }

    public final boolean e() {
        return this.f55073c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return jo.p.c(this.f55071a, kVar.f55071a) && this.f55072b == kVar.f55072b && this.f55073c == kVar.f55073c && this.f55074d == kVar.f55074d && this.f55075e == kVar.f55075e && this.f55076f == kVar.f55076f && this.f55077g == kVar.f55077g;
        }
        return false;
    }

    public final boolean f() {
        return this.f55075e;
    }

    public final boolean g() {
        return this.f55072b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f55071a.hashCode() * 31;
        boolean z10 = this.f55072b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55073c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55074d;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z13 = this.f55075e;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z14 = this.f55076f;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.f55077g;
        return i19 + (z15 ? 1 : z15 ? 1 : 0);
    }

    public String toString() {
        return "BirthdayBalloonBindModel(birthdayText=" + this.f55071a + ", isVisibleImageTwoWeek=" + this.f55072b + ", isVisibleImageOneWeek=" + this.f55073c + ", isVisibleImageOnTheDay=" + this.f55074d + ", isVisibleImagePrevDay=" + this.f55075e + ", isVisibleImageOnTheDayOnMyPage=" + this.f55076f + ", isVisibleImageNextDay=" + this.f55077g + ')';
    }
}
