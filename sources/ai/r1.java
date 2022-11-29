package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class r1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9295i;

    public r1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "QXlICfiT7SVSRUb0DD1a74y++UqnSLMKlPOXAn9FNLrl7qN9uprYrk5dswjj/dLi", "yqGfvaGOT1fOScq8M0g9vywM6jvcTWdjxf27npfqtn0=", c64Var, i10, 61);
        this.f9295i = r0Var.l();
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f1689f.invoke(null, this.f1685b.c(), Boolean.valueOf(this.f9295i))).longValue();
        synchronized (this.f1688e) {
            this.f1688e.F(longValue);
        }
    }
}
