package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class v1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile Long f10912i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f10913j = new Object();

    public v1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "kgLg33QaU762V6pmSw9NTYQDT3UN+SfZqKWL+LtHgczBAmljOlYdBxhmK655CLWm", "WLzuG2U+Kkbg0oKQlrLQGRQCiSGGQTHe1FZJKw3vRH0=", c64Var, i10, 33);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f10912i == null) {
            synchronized (f10913j) {
                if (f10912i == null) {
                    f10912i = (Long) this.f1689f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f1688e) {
            this.f1688e.q0(f10912i.longValue());
        }
    }
}
