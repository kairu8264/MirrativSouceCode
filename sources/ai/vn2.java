package ai;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class vn2 implements un2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11135a;

    public vn2(as asVar, String str, int i10, String str2, ls lsVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(asVar.f1984x));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(asVar.f1985y));
        } else if (hashSet.contains("npa")) {
            arrayList.add(asVar.f1985y.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(asVar.f1986z));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = asVar.A;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(asVar.B));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(asVar.C));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(asVar.D));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(asVar.E);
        }
        if (hashSet.contains("location")) {
            Location location = asVar.G;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(asVar.H);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(asVar.I));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(asVar.J));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = asVar.K;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(asVar.L);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(asVar.M);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(asVar.N));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(asVar.P));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(asVar.Q);
        }
        if (hashSet.contains("orientation")) {
            if (lsVar != null) {
                arrayList.add(Integer.valueOf(lsVar.f6652w));
            } else {
                arrayList.add(null);
            }
        }
        this.f11135a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = a((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    @Override // ai.un2
    public final boolean equals(Object obj) {
        if (obj instanceof vn2) {
            return Arrays.equals(this.f11135a, ((vn2) obj).f11135a);
        }
        return false;
    }

    @Override // ai.un2
    public final int hashCode() {
        return Arrays.hashCode(this.f11135a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f11135a);
        String arrays = Arrays.toString(this.f11135a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb2.append("[PoolKey#");
        sb2.append(hashCode);
        sb2.append(" ");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
