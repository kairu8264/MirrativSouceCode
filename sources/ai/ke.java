package ai;

/* loaded from: classes3.dex */
public final class ke implements te {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6178a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f6179b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f6180c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f6181d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6182e;

    public ke(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6178a = iArr;
        this.f6179b = jArr;
        this.f6180c = jArr2;
        this.f6181d = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f6182e = 0L;
            return;
        }
        int i10 = length - 1;
        this.f6182e = jArr2[i10] + jArr3[i10];
    }

    @Override // ai.te
    public final long a(long j10) {
        return this.f6179b[vj.h(this.f6181d, j10, true, true)];
    }

    @Override // ai.te
    public final boolean zza() {
        return true;
    }

    @Override // ai.te
    public final long zzb() {
        return this.f6182e;
    }
}
