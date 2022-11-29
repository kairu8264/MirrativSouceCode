package dp;

import zo.k0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f29756a = new k0("LOCK_FAIL");

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f29757b = new k0("UNLOCK_FAIL");

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f29758c;

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f29759d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f29760e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f29761f;

    static {
        k0 k0Var = new k0("LOCKED");
        f29758c = k0Var;
        k0 k0Var2 = new k0("UNLOCKED");
        f29759d = k0Var2;
        f29760e = new b(k0Var);
        f29761f = new b(k0Var2);
    }

    public static final c a(boolean z10) {
        return new d(z10);
    }

    public static /* synthetic */ c b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
