package ai;

/* loaded from: classes3.dex */
public final class k24 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6059b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6060c;

    /* renamed from: d  reason: collision with root package name */
    public int f6061d;

    /* renamed from: e  reason: collision with root package name */
    public String f6062e;

    public k24(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            StringBuilder sb2 = new StringBuilder(12);
            sb2.append(i10);
            sb2.append("/");
            str = sb2.toString();
        } else {
            str = "";
        }
        this.f6058a = str;
        this.f6059b = i11;
        this.f6060c = i12;
        this.f6061d = Integer.MIN_VALUE;
        this.f6062e = "";
    }

    public final void a() {
        int i10 = this.f6061d;
        int i11 = i10 == Integer.MIN_VALUE ? this.f6059b : i10 + this.f6060c;
        this.f6061d = i11;
        String str = this.f6058a;
        StringBuilder sb2 = new StringBuilder(str.length() + 11);
        sb2.append(str);
        sb2.append(i11);
        this.f6062e = sb2.toString();
    }

    public final int b() {
        d();
        return this.f6061d;
    }

    public final String c() {
        d();
        return this.f6062e;
    }

    public final void d() {
        if (this.f6061d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
