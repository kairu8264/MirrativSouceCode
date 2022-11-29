package r0;

import jo.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f49704a;

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        this.f49704a = i10;
    }

    public final int a() {
        return this.f49704a;
    }

    public final void b(int i10) {
        this.f49704a += i10;
    }

    public final void c(int i10) {
        this.f49704a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f49704a == ((b) obj).f49704a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f49704a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f49704a + ')';
    }

    public /* synthetic */ b(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
