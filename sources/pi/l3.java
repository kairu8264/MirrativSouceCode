package pi;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference<String[]> f48015b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<String[]> f48016c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<String[]> f48017d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public final k3 f48018a;

    public l3(k3 k3Var) {
        this.f48018a = k3Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        rh.p.i(strArr);
        rh.p.i(strArr2);
        rh.p.i(atomicReference);
        rh.p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (ia.Z(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f48018a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(e(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    public final String c(u uVar) {
        String b10;
        if (!this.f48018a.zza()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(uVar.f48252y);
        sb2.append(",name=");
        sb2.append(d(uVar.f48250w));
        sb2.append(",params=");
        s sVar = uVar.f48251x;
        if (sVar == null) {
            b10 = null;
        } else if (!this.f48018a.zza()) {
            b10 = sVar.toString();
        } else {
            b10 = b(sVar.S());
        }
        sb2.append(b10);
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f48018a.zza() ? str : g(str, z5.f48405c, z5.f48403a, f48015b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f48018a.zza() ? str : g(str, a6.f47586b, a6.f47585a, f48016c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f48018a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return g(str, b6.f47646b, b6.f47645a, f48017d);
        }
        return str;
    }
}
