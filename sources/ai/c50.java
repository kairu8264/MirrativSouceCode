package ai;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzwl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class c50 implements q34 {

    /* renamed from: a  reason: collision with root package name */
    public volatile o40 f2714a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2715b;

    public c50(Context context) {
        this.f2715b = context;
    }

    public static /* synthetic */ void c(c50 c50Var) {
        if (c50Var.f2714a == null) {
            return;
        }
        c50Var.f2714a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // ai.q34
    public final s34 a(w34<?> w34Var) throws zzwl {
        Parcelable.Creator<p40> creator = p40.CREATOR;
        Map<String, String> t10 = w34Var.t();
        int size = t10.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry<String, String> entry : t10.entrySet()) {
            strArr[i11] = entry.getKey();
            strArr2[i11] = entry.getValue();
            i11++;
        }
        p40 p40Var = new p40(w34Var.o(), strArr, strArr2);
        long elapsedRealtime = wg.t.k().elapsedRealtime();
        try {
            mk0 mk0Var = new mk0();
            this.f2714a = new o40(this.f2715b, wg.t.r().a(), new a50(this, mk0Var), new b50(this, mk0Var));
            this.f2714a.o();
            y40 y40Var = new y40(this, p40Var);
            t43 t43Var = hk0.f4878a;
            s43 h10 = j43.h(j43.i(mk0Var, y40Var, t43Var), ((Integer) ft.c().c(ox.S2)).intValue(), TimeUnit.MILLISECONDS, hk0.f4881d);
            h10.c(new z40(this), t43Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) h10.get();
            long elapsedRealtime2 = wg.t.k().elapsedRealtime();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime2 - elapsedRealtime);
            sb2.append("ms");
            yg.p1.k(sb2.toString());
            s40 s40Var = (s40) new ge0(parcelFileDescriptor).p(s40.CREATOR);
            if (s40Var == null) {
                return null;
            }
            if (!s40Var.f9710w) {
                if (s40Var.A.length != s40Var.B.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = s40Var.A;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], s40Var.B[i10]);
                        i10++;
                    } else {
                        return new s34(s40Var.f9712y, s40Var.f9713z, hashMap, s40Var.C, s40Var.D);
                    }
                }
            } else {
                throw new zzwl(s40Var.f9711x);
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = wg.t.k().elapsedRealtime();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3 - elapsedRealtime);
            sb3.append("ms");
            yg.p1.k(sb3.toString());
            return null;
        } catch (Throwable th2) {
            long elapsedRealtime4 = wg.t.k().elapsedRealtime();
            StringBuilder sb4 = new StringBuilder(52);
            sb4.append("Http assets remote cache took ");
            sb4.append(elapsedRealtime4 - elapsedRealtime);
            sb4.append("ms");
            yg.p1.k(sb4.toString());
            throw th2;
        }
    }
}
