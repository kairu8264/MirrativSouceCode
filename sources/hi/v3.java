package hi;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class v3 extends q8<w3, v3> implements x9 {
    public v3() {
        super(w3.w());
    }

    public final int o() {
        return ((w3) this.f35956x).s();
    }

    public final u3 q(int i10) {
        return ((w3) this.f35956x).u(i10);
    }

    public final v3 r() {
        if (this.f35957y) {
            k();
            this.f35957y = false;
        }
        w3.D((w3) this.f35956x);
        return this;
    }

    public final v3 s(int i10, s3 s3Var) {
        if (this.f35957y) {
            k();
            this.f35957y = false;
        }
        w3.C((w3) this.f35956x, i10, s3Var.h());
        return this;
    }

    public final List<a3> t() {
        return Collections.unmodifiableList(((w3) this.f35956x).z());
    }

    public /* synthetic */ v3(r3 r3Var) {
        super(w3.w());
    }
}
