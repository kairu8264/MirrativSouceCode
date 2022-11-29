package ai;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class qn {

    /* renamed from: a  reason: collision with root package name */
    public final un f9012a;

    /* renamed from: b  reason: collision with root package name */
    public final fp f9013b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9014c;

    public qn() {
        this.f9013b = gp.E();
        this.f9014c = false;
        this.f9012a = new un();
    }

    public static qn a() {
        return new qn();
    }

    public final synchronized void b(pn pnVar) {
        if (this.f9014c) {
            try {
                pnVar.a(this.f9013b);
            } catch (NullPointerException e10) {
                wg.t.h().k(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i10) {
        if (this.f9014c) {
            if (((Boolean) ft.c().c(ox.f8064p3)).booleanValue()) {
                e(i10);
            } else {
                d(i10);
            }
        }
    }

    public final synchronized void d(int i10) {
        fp fpVar = this.f9013b;
        fpVar.u();
        List<String> d10 = ox.d();
        ArrayList arrayList = new ArrayList();
        for (String str : d10) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    yg.p1.k("Experiment ID is not a number");
                }
            }
        }
        fpVar.t(arrayList);
        sn snVar = new sn(this.f9012a, this.f9013b.n().L(), null);
        int i11 = i10 - 1;
        snVar.b(i11);
        snVar.a();
        String valueOf = String.valueOf(Integer.toString(i11, 10));
        yg.p1.k(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    public final synchronized void e(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(f(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        yg.p1.k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    yg.p1.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        yg.p1.k("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    yg.p1.k("Could not close Clearcut output stream.");
                }
                throw th2;
            }
        } catch (FileNotFoundException unused5) {
            yg.p1.k("Could not find file for Clearcut");
        }
    }

    public final synchronized String f(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f9013b.r(), Long.valueOf(wg.t.k().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.f9013b.n().L(), 3));
    }

    public qn(un unVar) {
        this.f9013b = gp.E();
        this.f9012a = unVar;
        this.f9014c = ((Boolean) ft.c().c(ox.f8056o3)).booleanValue();
    }
}
