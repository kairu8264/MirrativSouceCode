package zo;

import kotlin.KotlinNothingValueException;
import uo.a1;
import uo.i1;
import uo.o2;

/* loaded from: classes4.dex */
public final class b0 extends o2 implements a1 {

    /* renamed from: x  reason: collision with root package name */
    public final Throwable f63276x;

    /* renamed from: y  reason: collision with root package name */
    public final String f63277y;

    public b0(Throwable th2, String str) {
        this.f63276x = th2;
        this.f63277y = str;
    }

    @Override // uo.k0
    public boolean c0(ao.g gVar) {
        l0();
        throw new KotlinNothingValueException();
    }

    @Override // uo.a1
    public i1 d(long j10, Runnable runnable, ao.g gVar) {
        l0();
        throw new KotlinNothingValueException();
    }

    @Override // uo.o2, uo.k0
    public uo.k0 d0(int i10) {
        l0();
        throw new KotlinNothingValueException();
    }

    @Override // uo.o2
    public o2 h0() {
        return this;
    }

    @Override // uo.k0
    /* renamed from: k0 */
    public Void X(ao.g gVar, Runnable runnable) {
        l0();
        throw new KotlinNothingValueException();
    }

    public final Void l0() {
        String o10;
        if (this.f63276x != null) {
            String str = this.f63277y;
            String str2 = "";
            if (str != null && (o10 = jo.p.o(". ", str)) != null) {
                str2 = o10;
            }
            throw new IllegalStateException(jo.p.o("Module with the Main dispatcher had failed to initialize", str2), this.f63276x);
        }
        a0.d();
        throw new KotlinNothingValueException();
    }

    @Override // uo.a1
    /* renamed from: p0 */
    public Void S(long j10, uo.p<? super wn.v> pVar) {
        l0();
        throw new KotlinNothingValueException();
    }

    @Override // uo.o2, uo.k0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        Throwable th2 = this.f63276x;
        sb2.append(th2 != null ? jo.p.o(", cause=", th2) : "");
        sb2.append(']');
        return sb2.toString();
    }
}
