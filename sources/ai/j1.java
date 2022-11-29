package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class j1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile Long f5581i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f5582j = new Object();

    public j1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "A1tPgHG2ugzZJCs1M+dp+hmS1POsS+eh/W2v7YCpLDG/34A+E/oOE4ZeCFsAYJwW", "qStL+/rRmChGKiFwdmBpG5d//S+c8NqJKVwR4OiL/ms=", c64Var, i10, 22);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f5581i == null) {
            synchronized (f5582j) {
                if (f5581i == null) {
                    f5581i = (Long) this.f1689f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f1688e) {
            this.f1688e.j0(f5581i.longValue());
        }
    }
}
