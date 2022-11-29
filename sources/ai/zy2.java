package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zy2 extends cz2<Map.Entry> {
    public final /* synthetic */ hz2 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(hz2 hz2Var) {
        super(hz2Var, null);
        this.A = hz2Var;
    }

    @Override // ai.cz2
    public final /* bridge */ /* synthetic */ Map.Entry a(int i10) {
        return new ez2(this.A, i10);
    }
}
