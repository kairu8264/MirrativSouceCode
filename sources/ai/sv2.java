package ai;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzggm;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class sv2 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f10003f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10004a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f10005b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10006c;

    /* renamed from: d  reason: collision with root package name */
    public final zu2 f10007d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10008e;

    public sv2(Context context, int i10, zu2 zu2Var, boolean z10) {
        this.f10008e = false;
        this.f10004a = context;
        this.f10006c = Integer.toString(i10 - 1);
        this.f10005b = context.getSharedPreferences("pcvmspf", 0);
        this.f10007d = zu2Var;
        this.f10008e = z10;
    }

    public static String h(g2 g2Var) {
        i2 I = j2.I();
        I.r(g2Var.B().B());
        I.s(g2Var.B().C());
        I.u(g2Var.B().E());
        I.v(g2Var.B().F());
        I.t(g2Var.B().D());
        return vh.k.a(I.n().T().U());
    }

    public final boolean a(g2 g2Var, rv2 rv2Var) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10003f) {
            j2 k10 = k(1);
            String B = g2Var.B().B();
            if (k10 != null && k10.B().equals(B)) {
                i(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File e10 = e(B);
            if (e10.exists()) {
                boolean isDirectory = e10.isDirectory();
                String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                if (true != isDirectory) {
                    str = "0";
                }
                boolean isFile = e10.isFile();
                String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                if (true != isFile) {
                    str2 = "0";
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length());
                sb2.append("d:");
                sb2.append(str);
                sb2.append(",f:");
                sb2.append(str2);
                j(4023, currentTimeMillis2, sb2.toString());
                i(4015, currentTimeMillis2);
            } else if (!e10.mkdirs()) {
                boolean canWrite = e10.canWrite();
                String str3 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                if (true != canWrite) {
                    str3 = "0";
                }
                j(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                i(4015, currentTimeMillis2);
                return false;
            }
            File e11 = e(B);
            File file = new File(e11, "pcam.jar");
            File file2 = new File(e11, "pcbc");
            if (!lv2.b(file, g2Var.C().U())) {
                i(4016, currentTimeMillis);
                return false;
            } else if (!lv2.b(file2, g2Var.D().U())) {
                i(4017, currentTimeMillis);
                return false;
            } else if (rv2Var != null && !rv2Var.a(file)) {
                i(4018, currentTimeMillis);
                lv2.e(e11);
                return false;
            } else {
                String h10 = h(g2Var);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.f10005b.getString(g(), null);
                SharedPreferences.Editor edit = this.f10005b.edit();
                edit.putString(g(), h10);
                if (string != null) {
                    edit.putString(f(), string);
                }
                if (!edit.commit()) {
                    i(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                j2 k11 = k(1);
                if (k11 != null) {
                    hashSet.add(k11.B());
                }
                j2 k12 = k(2);
                if (k12 != null) {
                    hashSet.add(k12.B());
                }
                for (File file3 : new File(this.f10004a.getDir("pccache", 0), this.f10006c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        lv2.e(file3);
                    }
                }
                i(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final boolean b(g2 g2Var) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10003f) {
            if (!lv2.b(new File(e(g2Var.B().B()), "pcbc"), g2Var.D().U())) {
                i(4020, currentTimeMillis);
                return false;
            }
            String h10 = h(g2Var);
            SharedPreferences.Editor edit = this.f10005b.edit();
            edit.putString(g(), h10);
            boolean commit = edit.commit();
            if (commit) {
                i(5015, currentTimeMillis);
            } else {
                i(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final jv2 c(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10003f) {
            j2 k10 = k(1);
            if (k10 == null) {
                i(4022, currentTimeMillis);
                return null;
            }
            File e10 = e(k10.B());
            File file = new File(e10, "pcam.jar");
            if (!file.exists()) {
                file = new File(e10, "pcam");
            }
            File file2 = new File(e10, "pcbc");
            File file3 = new File(e10, "pcopt");
            i(5016, currentTimeMillis);
            return new jv2(k10, file, file2, file3);
        }
    }

    public final boolean d(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f10003f) {
            j2 k10 = k(1);
            if (k10 == null) {
                i(4025, currentTimeMillis);
                return false;
            }
            File e10 = e(k10.B());
            if (!new File(e10, "pcam.jar").exists()) {
                i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e10, "pcbc").exists()) {
                i(4027, currentTimeMillis);
                return false;
            } else {
                i(5019, currentTimeMillis);
                return true;
            }
        }
    }

    public final File e(String str) {
        return new File(new File(this.f10004a.getDir("pccache", 0), this.f10006c), str);
    }

    public final String f() {
        String valueOf = String.valueOf(this.f10006c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    public final String g() {
        String valueOf = String.valueOf(this.f10006c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    public final void i(int i10, long j10) {
        zu2 zu2Var = this.f10007d;
        if (zu2Var != null) {
            zu2Var.b(i10, j10);
        }
    }

    public final void j(int i10, long j10, String str) {
        zu2 zu2Var = this.f10007d;
        if (zu2Var != null) {
            zu2Var.a(i10, j10, str);
        }
    }

    public final j2 k(int i10) {
        String string;
        di3 b10;
        if (i10 == 1) {
            string = this.f10005b.getString(g(), null);
        } else {
            string = this.f10005b.getString(f(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            oh3 N = oh3.N(vh.k.c(string));
            if (this.f10008e) {
                b10 = di3.a();
            } else {
                b10 = di3.b();
            }
            return j2.H(N, b10);
        } catch (zzggm unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, currentTimeMillis);
            return null;
        }
    }
}
