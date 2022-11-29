package ai;

/* loaded from: classes3.dex */
public final class oz3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8181a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8182b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8183c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8184d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8185e;

    /* renamed from: f  reason: collision with root package name */
    public final v4 f8186f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8187g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f8188h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f8189i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8190j;

    /* renamed from: k  reason: collision with root package name */
    public final pz3[] f8191k;

    public oz3(int i10, int i11, long j10, long j11, long j12, v4 v4Var, int i12, pz3[] pz3VarArr, int i13, long[] jArr, long[] jArr2) {
        this.f8181a = i10;
        this.f8182b = i11;
        this.f8183c = j10;
        this.f8184d = j11;
        this.f8185e = j12;
        this.f8186f = v4Var;
        this.f8187g = i12;
        this.f8191k = pz3VarArr;
        this.f8190j = i13;
        this.f8188h = jArr;
        this.f8189i = jArr2;
    }

    public final pz3 a(int i10) {
        pz3[] pz3VarArr = this.f8191k;
        if (pz3VarArr == null) {
            return null;
        }
        return pz3VarArr[i10];
    }
}
