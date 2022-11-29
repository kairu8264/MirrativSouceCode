package hi;

import java.util.List;

/* loaded from: classes3.dex */
public final class ua extends j {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ vc f36021y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(ub ubVar, String str, vc vcVar) {
        super("getValue");
        this.f36021y = vcVar;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        v5.h("getValue", 2, list);
        q b10 = u4Var.b(list.get(0));
        q b11 = u4Var.b(list.get(1));
        String v10 = this.f36021y.v(b10.h());
        return v10 != null ? new u(v10) : b11;
    }
}
