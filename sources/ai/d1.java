package ai;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d1 extends a2 {

    /* renamed from: j  reason: collision with root package name */
    public static final b2<j74> f3098j = new b2<>();

    /* renamed from: i  reason: collision with root package name */
    public final Context f3099i;

    public d1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, Context context, v54 v54Var) {
        super(r0Var, "NK1iwlHEHCICBCLEvTy0TnuhgEeSXovnPs9zKPvVW8trSfaaB+/inefY+5AxSSUI", "/qulcnd5BAOc2NixUFmrPgx+DAD1V/hpoK4nowHOBbg=", c64Var, i10, 27);
        this.f3099i = context;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i10;
        j74 j74Var;
        AtomicReference<j74> a10 = f3098j.a(this.f3099i.getPackageName());
        synchronized (a10) {
            j74 j74Var2 = a10.get();
            if (j74Var2 == null || u0.e(j74Var2.f5652b) || j74Var2.f5652b.equals("E") || j74Var2.f5652b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (u0.e(null)) {
                    if (!u0.e(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i10 = (bool.booleanValue() && this.f1685b.k()) ? 4 : 3;
                } else {
                    i10 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i10 == 3);
                Boolean bool2 = (Boolean) ft.c().c(ox.B1);
                String c10 = ((Boolean) ft.c().c(ox.A1)).booleanValue() ? c() : null;
                if (bool2.booleanValue() && this.f1685b.k() && u0.e(c10)) {
                    c10 = d();
                }
                j74 j74Var3 = new j74((String) this.f1689f.invoke(null, this.f3099i, valueOf, c10));
                if (u0.e(j74Var3.f5652b) || j74Var3.f5652b.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String d10 = d();
                        if (!u0.e(d10)) {
                            j74Var3.f5652b = d10;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                a10.set(j74Var3);
            }
            j74Var = a10.get();
        }
        synchronized (this.f1688e) {
            if (j74Var != null) {
                this.f1688e.m0(j74Var.f5652b);
                this.f1688e.t0(j74Var.f5653c);
                this.f1688e.s0(j74Var.f5654d);
                this.f1688e.u(j74Var.f5655e);
                this.f1688e.v(j74Var.f5656f);
            }
        }
    }

    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] c10 = u0.c((String) ft.c().c(ox.C1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(c10)));
            if (!Build.TYPE.equals(MRLog.TARGET_TYPE_USER)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(u0.c((String) ft.c().c(ox.D1)))));
            }
            Context context = this.f3099i;
            return d2.a(context, context.getPackageName(), arrayList, this.f1685b.e());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final String d() {
        try {
            if (this.f1685b.o() != null) {
                this.f1685b.o().get();
            }
            s64 n10 = this.f1685b.n();
            if (n10 == null || !n10.e0()) {
                return null;
            }
            return n10.s0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
