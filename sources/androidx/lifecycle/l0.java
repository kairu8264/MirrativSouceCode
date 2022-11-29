package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y4.c;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f15574e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f15575a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, c.InterfaceC1040c> f15576b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, b<?>> f15577c;

    /* renamed from: d  reason: collision with root package name */
    public final c.InterfaceC1040c f15578d;

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC1040c {
        public a() {
        }

        @Override // y4.c.InterfaceC1040c
        public Bundle a() {
            for (Map.Entry entry : new HashMap(l0.this.f15576b).entrySet()) {
                l0.this.e((String) entry.getKey(), ((c.InterfaceC1040c) entry.getValue()).a());
            }
            Set<String> keySet = l0.this.f15575a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(l0.this.f15575a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i10 = Build.VERSION.SDK_INT;
        clsArr[27] = i10 >= 21 ? Size.class : cls;
        if (i10 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f15574e = clsArr;
    }

    public l0(Map<String, Object> map) {
        this.f15576b = new HashMap();
        this.f15577c = new HashMap();
        this.f15578d = new a();
        this.f15575a = new HashMap(map);
    }

    public static l0 a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new l0();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new l0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                hashMap.put((String) parcelableArrayList.get(i10), parcelableArrayList2.get(i10));
            }
            return new l0(hashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    public static void f(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f15574e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    public <T> e0<T> b(String str) {
        return c(str, false, null);
    }

    public final <T> e0<T> c(String str, boolean z10, T t10) {
        b<?> bVar;
        b<?> bVar2 = this.f15577c.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        if (this.f15575a.containsKey(str)) {
            bVar = new b<>(this, str, this.f15575a.get(str));
        } else if (z10) {
            bVar = new b<>(this, str, t10);
        } else {
            bVar = new b<>(this, str);
        }
        this.f15577c.put(str, bVar);
        return bVar;
    }

    public c.InterfaceC1040c d() {
        return this.f15578d;
    }

    public <T> void e(String str, T t10) {
        f(t10);
        b<?> bVar = this.f15577c.get(str);
        if (bVar != null) {
            bVar.p(t10);
        } else {
            this.f15575a.put(str, t10);
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> extends e0<T> {

        /* renamed from: l  reason: collision with root package name */
        public String f15580l;

        /* renamed from: m  reason: collision with root package name */
        public l0 f15581m;

        public b(l0 l0Var, String str, T t10) {
            super(t10);
            this.f15580l = str;
            this.f15581m = l0Var;
        }

        @Override // androidx.lifecycle.e0, androidx.lifecycle.LiveData
        public void p(T t10) {
            l0 l0Var = this.f15581m;
            if (l0Var != null) {
                l0Var.f15575a.put(this.f15580l, t10);
            }
            super.p(t10);
        }

        public b(l0 l0Var, String str) {
            this.f15580l = str;
            this.f15581m = l0Var;
        }
    }

    public l0() {
        this.f15576b = new HashMap();
        this.f15577c = new HashMap();
        this.f15578d = new a();
        this.f15575a = new HashMap();
    }
}
