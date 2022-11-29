package p3;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f45774a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final d f45775a;

        public a(d dVar) {
            this.f45775a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            p3.c b10 = this.f45775a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.L0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<p3.c> c10 = this.f45775a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).L0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f45775a.f(i10, i11, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            p3.c d10 = this.f45775a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.L0();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f45775a.a(i10, p3.c.M0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f45774a = new c(this);
        } else if (i10 >= 19) {
            this.f45774a = new b(this);
        } else if (i10 >= 16) {
            this.f45774a = new a(this);
        } else {
            this.f45774a = null;
        }
    }

    public void a(int i10, p3.c cVar, String str, Bundle bundle) {
    }

    public p3.c b(int i10) {
        return null;
    }

    public List<p3.c> c(String str, int i10) {
        return null;
    }

    public p3.c d(int i10) {
        return null;
    }

    public Object e() {
        return this.f45774a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public d(Object obj) {
        this.f45774a = obj;
    }
}
