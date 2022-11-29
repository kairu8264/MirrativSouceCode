package ai;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d2 {
    public static String a(Context context, String str, List<Certificate> list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final a53 E = a53.E();
            context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager.OnChecksumsReadyListener(E) { // from class: ai.c2

                /* renamed from: a  reason: collision with root package name */
                public final a53 f2668a;

                {
                    this.f2668a = E;
                }

                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list2) {
                    a53 a53Var = this.f2668a;
                    if (list2 == null) {
                        a53Var.u(null);
                        return;
                    }
                    try {
                        int size = list2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list2.get(i10);
                            if (apkChecksum.getType() == 8) {
                                a53Var.u(u0.b(apkChecksum.getValue()));
                                return;
                            }
                        }
                        a53Var.u(null);
                    } catch (Throwable unused) {
                        a53Var.u(null);
                    }
                }
            });
            return (String) E.get();
        }
        return null;
    }
}
