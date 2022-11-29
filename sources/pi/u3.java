package pi;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u3 implements Runnable {
    public final String A;
    public final Map<String, List<String>> B;

    /* renamed from: w  reason: collision with root package name */
    public final s3 f48257w;

    /* renamed from: x  reason: collision with root package name */
    public final int f48258x;

    /* renamed from: y  reason: collision with root package name */
    public final Throwable f48259y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f48260z;

    public /* synthetic */ u3(String str, s3 s3Var, int i10, Throwable th2, byte[] bArr, Map map, t3 t3Var) {
        rh.p.i(s3Var);
        this.f48257w = s3Var;
        this.f48258x = i10;
        this.f48259y = th2;
        this.f48260z = bArr;
        this.A = str;
        this.B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48257w.a(this.A, this.f48258x, this.f48259y, this.f48260z, this.B);
    }
}
