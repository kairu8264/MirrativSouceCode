package o3;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p3.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f43875c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f43876a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f43877b;

    /* renamed from: o3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0648a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f43878a;

        public C0648a(a aVar) {
            this.f43878a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f43878a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            p3.d b10 = this.f43878a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f43878a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            p3.c M0 = p3.c.M0(accessibilityNodeInfo);
            M0.A0(c0.Y(view));
            M0.n0(c0.T(view));
            M0.u0(c0.r(view));
            M0.F0(c0.M(view));
            this.f43878a.g(view, M0);
            M0.f(accessibilityNodeInfo.getText(), view);
            List<c.a> c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                M0.b(c10.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f43878a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f43878a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f43878a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f43878a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f43878a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f43875c);
    }

    public static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(a3.d.P);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f43876a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public p3.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f43876a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new p3.d(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate d() {
        return this.f43877b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q10 = p3.c.q(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; q10 != null && i10 < q10.length; i10++) {
                if (clickableSpan.equals(q10[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f43876a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, p3.c cVar) {
        this.f43876a.onInitializeAccessibilityNodeInfo(view, cVar.L0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f43876a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f43876a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List<c.a> c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            c.a aVar = c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 16) {
            z10 = this.f43876a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != a3.d.f383a) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a3.d.Q);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public void l(View view, int i10) {
        this.f43876a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f43876a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f43876a = accessibilityDelegate;
        this.f43877b = new C0648a(this);
    }
}
