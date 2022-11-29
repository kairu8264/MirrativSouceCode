package q1;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;

/* loaded from: classes.dex */
public final class o0 extends d1 implements m0 {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<m2.o, wn.v> f48590x;

    /* renamed from: y  reason: collision with root package name */
    public long f48591y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(io.l<? super m2.o, wn.v> lVar, io.l<? super c1, wn.v> lVar2) {
        super(lVar2);
        jo.p.h(lVar, "onSizeChanged");
        jo.p.h(lVar2, "inspectorInfo");
        this.f48590x = lVar;
        this.f48591y = m2.p.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return jo.p.c(this.f48590x, ((o0) obj).f48590x);
        }
        return false;
    }

    public int hashCode() {
        return this.f48590x.hashCode();
    }

    @Override // q1.m0
    public void z(long j10) {
        if (m2.o.e(this.f48591y, j10)) {
            return;
        }
        this.f48590x.invoke(m2.o.b(j10));
        this.f48591y = j10;
    }
}
