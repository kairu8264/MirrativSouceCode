package ai;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public abstract class xl {

    /* renamed from: b  reason: collision with root package name */
    public static MessageDigest f11983b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f11984a = new Object();

    public abstract byte[] a(String str);

    public final MessageDigest b() {
        synchronized (this.f11984a) {
            MessageDigest messageDigest = f11983b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    f11983b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f11983b;
        }
    }
}
