package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class n1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile String f7142i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f7143j = new Object();

    public n1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "FIES3RTkQwHbrKX6yNHRLvjdTy/vAwaHt4NSjNSY8AdC8m3WKKtOY2UmKZKAKB0T", "2LDOSJy2Fx9VBMC+bm+0OJly9nmnJoeXDwyJmbeZyYc=", c64Var, i10, 1);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.W("E");
        if (f7142i == null) {
            synchronized (f7143j) {
                if (f7142i == null) {
                    f7142i = (String) this.f1689f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f1688e) {
            this.f1688e.W(f7142i);
        }
    }
}
