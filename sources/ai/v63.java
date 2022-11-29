package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class v63 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10987a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f10988b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final me3 f10989c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final me3 f10990d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final me3 f10991e;

    static {
        new b73();
        f10987a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new l73();
        f10988b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new o73();
        new i73();
        new u73();
        new y73();
        new r73();
        new b83();
        me3 C = me3.C();
        f10989c = C;
        f10990d = C;
        f10991e = C;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        t63.e(new y63());
        h93.a();
        t63.c(new b73(), true);
        t63.c(new l73(), true);
        if (f83.a()) {
            return;
        }
        t63.c(new i73(), true);
        o73.k(true);
        t63.c(new r73(), true);
        t63.c(new u73(), true);
        t63.c(new y73(), true);
        t63.c(new b83(), true);
    }
}
