package ai;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes3.dex */
public final class q1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public List<Long> f8768i;

    public q1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "6LxD9DBfXSlooSx7/LozL06rdHrjyh7Q8PNFejLJXxiRhvgA5vOTtEhIRp3pKXIi", "yXdkchwXd7KBwiPBiUydLTG3hsBC8U5EW7urXPkQrKc=", c64Var, i10, 31);
        this.f8768i = null;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.o0(-1L);
        this.f1688e.p0(-1L);
        if (this.f8768i == null) {
            this.f8768i = (List) this.f1689f.invoke(null, this.f1685b.c());
        }
        List<Long> list = this.f8768i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f1688e) {
            this.f1688e.o0(this.f8768i.get(0).longValue());
            this.f1688e.p0(this.f8768i.get(1).longValue());
        }
    }
}
