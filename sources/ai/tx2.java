package ai;

/* loaded from: classes3.dex */
public abstract class tx2 extends sw2<String> {
    public int A = 0;
    public int B;

    /* renamed from: y  reason: collision with root package name */
    public final CharSequence f10501y;

    /* renamed from: z  reason: collision with root package name */
    public final yw2 f10502z;

    public tx2(vx2 vx2Var, CharSequence charSequence) {
        yw2 yw2Var;
        yw2Var = vx2Var.f11402a;
        this.f10502z = yw2Var;
        this.B = Integer.MAX_VALUE;
        this.f10501y = charSequence;
    }

    @Override // ai.sw2
    public final /* bridge */ /* synthetic */ String a() {
        int e10;
        int i10 = this.A;
        while (true) {
            int i11 = this.A;
            if (i11 == -1) {
                b();
                return null;
            }
            int d10 = d(i11);
            if (d10 == -1) {
                d10 = this.f10501y.length();
                this.A = -1;
                e10 = -1;
            } else {
                e10 = e(d10);
                this.A = e10;
            }
            if (e10 == i10) {
                int i12 = e10 + 1;
                this.A = i12;
                if (i12 > this.f10501y.length()) {
                    this.A = -1;
                }
            } else {
                if (i10 < d10) {
                    this.f10501y.charAt(i10);
                }
                if (i10 < d10) {
                    this.f10501y.charAt(d10 - 1);
                }
                int i13 = this.B;
                if (i13 == 1) {
                    d10 = this.f10501y.length();
                    this.A = -1;
                    if (d10 > i10) {
                        this.f10501y.charAt(d10 - 1);
                    }
                } else {
                    this.B = i13 - 1;
                }
                return this.f10501y.subSequence(i10, d10).toString();
            }
        }
    }

    public abstract int d(int i10);

    public abstract int e(int i10);
}
