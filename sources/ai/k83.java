package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class k83 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6124a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final me3 f6125b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final me3 f6126c;

    static {
        new j83();
        f6124a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f6125b = me3.C();
        f6126c = me3.C();
        try {
            t63.e(new m83());
            if (f83.a()) {
                return;
            }
            t63.c(new j83(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
