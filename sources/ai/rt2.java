package ai;

import android.os.Build;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.gms.internal.ads.zzvf;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rt2 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f9591c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f9592d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9593a = f9592d;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9594b = f9591c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] a10 = f34.a(file.getAbsolutePath());
            if (a10.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a10[0][0].getEncoded());
                if (Arrays.equals(this.f9594b, digest)) {
                    return true;
                }
                return !MRLog.TARGET_TYPE_USER.equals(Build.TYPE) && Arrays.equals(this.f9593a, digest);
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzvf e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
