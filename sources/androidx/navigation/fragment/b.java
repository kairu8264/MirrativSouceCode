package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.o;
import androidx.navigation.x;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@x.b("fragment")
/* loaded from: classes.dex */
public class b extends x<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15707a;

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f15708b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15709c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayDeque<Integer> f15710d = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public static class a extends o {
        public String F;

        public a(x<? extends a> xVar) {
            super(xVar);
        }

        public final String H() {
            String str = this.F;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final a J(String str) {
            this.F = str;
            return this;
        }

        @Override // androidx.navigation.o
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.F;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            return sb2.toString();
        }

        @Override // androidx.navigation.o
        public void w(Context context, AttributeSet attributeSet) {
            super.w(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, d.f15720i);
            String string = obtainAttributes.getString(d.f15721j);
            if (string != null) {
                J(string);
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068b implements x.a {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap<View, String> f15711a;

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.f15711a);
        }
    }

    public b(Context context, FragmentManager fragmentManager, int i10) {
        this.f15707a = context;
        this.f15708b = fragmentManager;
        this.f15709c = i10;
    }

    @Override // androidx.navigation.x
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f15710d.clear();
        for (int i10 : intArray) {
            this.f15710d.add(Integer.valueOf(i10));
        }
    }

    @Override // androidx.navigation.x
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f15710d.size()];
        Iterator<Integer> it = this.f15710d.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.x
    public boolean e() {
        if (this.f15710d.isEmpty()) {
            return false;
        }
        if (this.f15708b.J0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f15708b.T0(g(this.f15710d.size(), this.f15710d.peekLast().intValue()), 1);
        this.f15710d.removeLast();
        return true;
    }

    @Override // androidx.navigation.x
    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    public final String g(int i10, int i11) {
        return i10 + "-" + i11;
    }

    @Deprecated
    public Fragment h(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.o0().a(context.getClassLoader(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[RETURN] */
    @Override // androidx.navigation.x
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.o b(androidx.navigation.fragment.b.a r9, android.os.Bundle r10, androidx.navigation.u r11, androidx.navigation.x.a r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.b.b(androidx.navigation.fragment.b$a, android.os.Bundle, androidx.navigation.u, androidx.navigation.x$a):androidx.navigation.o");
    }
}
