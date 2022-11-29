package uo;

/* loaded from: classes4.dex */
public final class f3<U, T extends U> extends zo.g0<T> implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final long f56017z;

    public f3(long j10, ao.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f56017z = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        S(g3.a(this.f56017z, this));
    }

    @Override // uo.a, uo.k2
    public String y0() {
        return super.y0() + "(timeMillis=" + this.f56017z + ')';
    }
}
