package ai;

/* loaded from: classes3.dex */
public final class hk3 implements uj3 {

    /* renamed from: a  reason: collision with root package name */
    public final xj3 f4886a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4887b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f4888c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4889d;

    public hk3(xj3 xj3Var, String str, Object[] objArr) {
        this.f4886a = xj3Var;
        this.f4887b = str;
        this.f4888c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4889d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f4889d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    public final String a() {
        return this.f4887b;
    }

    @Override // ai.uj3
    public final int b() {
        return (this.f4889d & 1) == 1 ? 1 : 2;
    }

    public final Object[] c() {
        return this.f4888c;
    }

    @Override // ai.uj3
    public final boolean zza() {
        return (this.f4889d & 2) == 2;
    }

    @Override // ai.uj3
    public final xj3 zzb() {
        return this.f4886a;
    }
}
