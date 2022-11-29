package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class h93 {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final me3 f4786a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final me3 f4787b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final me3 f4788c;

    static {
        new g93();
        me3 C = me3.C();
        f4786a = C;
        f4787b = C;
        f4788c = C;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        t63.e(new l93());
        t63.c(new g93(), true);
        if (f83.a()) {
            return;
        }
        t63.c(new d93(), true);
    }
}
