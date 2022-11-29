package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class s83 {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final me3 f9765a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final me3 f9766b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final me3 f9767c;

    static {
        new r83();
        new p83();
        f9765a = me3.C();
        f9766b = me3.C();
        f9767c = me3.C();
        try {
            t63.e(new u83());
            t63.e(new x83());
            v63.a();
            if (f83.a()) {
                return;
            }
            t63.d(new p83(), new r83(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
