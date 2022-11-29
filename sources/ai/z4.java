package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class z4 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12868a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<pm> f12869b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    public int f12870c;

    /* renamed from: d  reason: collision with root package name */
    public bc f12871d;

    public z4(boolean z10) {
        this.f12868a = z10;
    }

    @Override // ai.a8
    public Map a() {
        return Collections.emptyMap();
    }

    @Override // ai.a8
    public final void l(pm pmVar) {
        Objects.requireNonNull(pmVar);
        if (this.f12869b.contains(pmVar)) {
            return;
        }
        this.f12869b.add(pmVar);
        this.f12870c++;
    }

    public final void q(bc bcVar) {
        for (int i10 = 0; i10 < this.f12870c; i10++) {
            this.f12869b.get(i10).w(this, bcVar, this.f12868a);
        }
    }

    public final void r(bc bcVar) {
        this.f12871d = bcVar;
        for (int i10 = 0; i10 < this.f12870c; i10++) {
            this.f12869b.get(i10).g(this, bcVar, this.f12868a);
        }
    }

    public final void s(int i10) {
        bc bcVar = this.f12871d;
        int i11 = sb.f9778a;
        for (int i12 = 0; i12 < this.f12870c; i12++) {
            this.f12869b.get(i12).s(this, bcVar, this.f12868a, i10);
        }
    }

    public final void t() {
        bc bcVar = this.f12871d;
        int i10 = sb.f9778a;
        for (int i11 = 0; i11 < this.f12870c; i11++) {
            this.f12869b.get(i11).k(this, bcVar, this.f12868a);
        }
        this.f12871d = null;
    }
}
