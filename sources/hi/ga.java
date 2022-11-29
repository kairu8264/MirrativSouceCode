package hi;

/* loaded from: classes3.dex */
public final class ga implements s9 {

    /* renamed from: a  reason: collision with root package name */
    public final w9 f35788a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35789b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f35790c;

    /* renamed from: d  reason: collision with root package name */
    public final int f35791d;

    public ga(w9 w9Var, String str, Object[] objArr) {
        this.f35788a = w9Var;
        this.f35789b = str;
        this.f35790c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f35791d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f35791d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    public final String a() {
        return this.f35789b;
    }

    @Override // hi.s9
    public final int b() {
        return (this.f35791d & 1) == 1 ? 1 : 2;
    }

    public final Object[] c() {
        return this.f35790c;
    }

    @Override // hi.s9
    public final w9 zza() {
        return this.f35788a;
    }

    @Override // hi.s9
    public final boolean zzb() {
        return (this.f35791d & 2) == 2;
    }
}
