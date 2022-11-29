package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class f1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile Long f3875i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f3876j = new Object();

    public f1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "BZSpo1ki7Qq4VpNbKNY5xp3ObP5b46iKtLhMqj95i84Sl1pKZG1hW1hXSXh30EEu", "LLuZlwuRYspGUGo7OZU51ciMYYFQ89K2r1TLDzvNq9k=", c64Var, i10, 44);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        if (f3875i == null) {
            synchronized (f3876j) {
                if (f3875i == null) {
                    f3875i = (Long) this.f1689f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f1688e) {
            this.f1688e.s(f3875i.longValue());
        }
    }
}
