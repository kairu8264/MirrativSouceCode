package ai;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class f83 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3967a = Logger.getLogger(f83.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f3968b = new AtomicBoolean(false);

    public static boolean a() {
        return f3968b.get();
    }

    public static Boolean b() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f3967a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }
}
