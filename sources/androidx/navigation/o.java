package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    public static final HashMap<String, Class<?>> E = new HashMap<>();
    public CharSequence A;
    public ArrayList<m> B;
    public s.h<e> C;
    public HashMap<String, i> D;

    /* renamed from: w  reason: collision with root package name */
    public final String f15777w;

    /* renamed from: x  reason: collision with root package name */
    public q f15778x;

    /* renamed from: y  reason: collision with root package name */
    public int f15779y;

    /* renamed from: z  reason: collision with root package name */
    public String f15780z;

    /* loaded from: classes.dex */
    public static class a implements Comparable<a> {
        public final int A;

        /* renamed from: w  reason: collision with root package name */
        public final o f15781w;

        /* renamed from: x  reason: collision with root package name */
        public final Bundle f15782x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f15783y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f15784z;

        public a(o oVar, Bundle bundle, boolean z10, boolean z11, int i10) {
            this.f15781w = oVar;
            this.f15782x = bundle;
            this.f15783y = z10;
            this.f15784z = z11;
            this.A = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(a aVar) {
            boolean z10 = this.f15783y;
            if (!z10 || aVar.f15783y) {
                if (z10 || !aVar.f15783y) {
                    Bundle bundle = this.f15782x;
                    if (bundle == null || aVar.f15782x != null) {
                        if (bundle != null || aVar.f15782x == null) {
                            if (bundle != null) {
                                int size = bundle.size() - aVar.f15782x.size();
                                if (size > 0) {
                                    return 1;
                                }
                                if (size < 0) {
                                    return -1;
                                }
                            }
                            boolean z11 = this.f15784z;
                            if (!z11 || aVar.f15784z) {
                                if (z11 || !aVar.f15784z) {
                                    return this.A - aVar.A;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }

        public o c() {
            return this.f15781w;
        }

        public Bundle e() {
            return this.f15782x;
        }
    }

    public o(x<? extends o> xVar) {
        this(y.c(xVar.getClass()));
    }

    public static String p(Context context, int i10) {
        if (i10 <= 16777215) {
            return Integer.toString(i10);
        }
        try {
            return context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i10);
        }
    }

    public final void A(CharSequence charSequence) {
        this.A = charSequence;
    }

    public final void B(q qVar) {
        this.f15778x = qVar;
    }

    public boolean D() {
        return true;
    }

    public final void d(String str, i iVar) {
        if (this.D == null) {
            this.D = new HashMap<>();
        }
        this.D.put(str, iVar);
    }

    public final void f(m mVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(mVar);
    }

    public Bundle g(Bundle bundle) {
        HashMap<String, i> hashMap;
        if (bundle == null && ((hashMap = this.D) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, i> hashMap2 = this.D;
        if (hashMap2 != null) {
            for (Map.Entry<String, i> entry : hashMap2.entrySet()) {
                entry.getValue().c(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, i> hashMap3 = this.D;
            if (hashMap3 != null) {
                for (Map.Entry<String, i> entry2 : hashMap3.entrySet()) {
                    if (!entry2.getValue().d(entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().a().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] j() {
        ArrayDeque arrayDeque = new ArrayDeque();
        o oVar = this;
        while (true) {
            q t10 = oVar.t();
            if (t10 == null || t10.M() != oVar.r()) {
                arrayDeque.addFirst(oVar);
            }
            if (t10 == null) {
                break;
            }
            oVar = t10;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i10 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i10] = ((o) it.next()).r();
            i10++;
        }
        return iArr;
    }

    public final e k(int i10) {
        s.h<e> hVar = this.C;
        e h10 = hVar == null ? null : hVar.h(i10);
        if (h10 != null) {
            return h10;
        }
        if (t() != null) {
            return t().k(i10);
        }
        return null;
    }

    public final Map<String, i> l() {
        HashMap<String, i> hashMap = this.D;
        return hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
    }

    public String m() {
        if (this.f15780z == null) {
            this.f15780z = Integer.toString(this.f15779y);
        }
        return this.f15780z;
    }

    public final int r() {
        return this.f15779y;
    }

    public final String s() {
        return this.f15777w;
    }

    public final q t() {
        return this.f15778x;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f15780z;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f15779y));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        if (this.A != null) {
            sb2.append(" label=");
            sb2.append(this.A);
        }
        return sb2.toString();
    }

    public a u(n nVar) {
        ArrayList<m> arrayList = this.B;
        if (arrayList == null) {
            return null;
        }
        Iterator<m> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            m next = it.next();
            Uri c10 = nVar.c();
            Bundle c11 = c10 != null ? next.c(c10, l()) : null;
            String a10 = nVar.a();
            boolean z10 = a10 != null && a10.equals(next.b());
            String b10 = nVar.b();
            int d10 = b10 != null ? next.d(b10) : -1;
            if (c11 != null || z10 || d10 > -1) {
                a aVar2 = new a(this, c11, next.e(), z10, d10);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void w(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s4.a.A);
        y(obtainAttributes.getResourceId(s4.a.C, 0));
        this.f15780z = p(context, this.f15779y);
        A(obtainAttributes.getText(s4.a.B));
        obtainAttributes.recycle();
    }

    public final void x(int i10, e eVar) {
        if (D()) {
            if (i10 != 0) {
                if (this.C == null) {
                    this.C = new s.h<>();
                }
                this.C.n(i10, eVar);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
        throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void y(int i10) {
        this.f15779y = i10;
        this.f15780z = null;
    }

    public o(String str) {
        this.f15777w = str;
    }
}
