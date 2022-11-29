package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class n61 implements rn3<m61> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Set<gc1<o61>>> f7210a;

    public n61(eo3<Set<gc1<o61>>> eo3Var) {
        this.f7210a = eo3Var;
    }

    public static m61 b(Set<gc1<o61>> set) {
        return new m61(set);
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final m61 zzb() {
        return new m61(((co3) this.f7210a).zzb());
    }
}
