package p3;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.f;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static int f45741d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f45742a;

    /* renamed from: b  reason: collision with root package name */
    public int f45743b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f45744c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;

        /* renamed from: e  reason: collision with root package name */
        public static final a f45745e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f45746f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f45747g = new a(4, null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f45748h = new a(8, null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f45749i = new a(16, null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f45750j = new a(32, null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f45751k = new a(64, null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f45752l = new a(128, null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f45753m = new a(256, (CharSequence) null, f.b.class);

        /* renamed from: n  reason: collision with root package name */
        public static final a f45754n = new a(512, (CharSequence) null, f.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f45755o = new a(1024, (CharSequence) null, f.c.class);

        /* renamed from: p  reason: collision with root package name */
        public static final a f45756p = new a(2048, (CharSequence) null, f.c.class);

        /* renamed from: q  reason: collision with root package name */
        public static final a f45757q = new a(4096, null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f45758r = new a(8192, null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f45759s = new a(16384, null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f45760t = new a(32768, null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f45761u = new a(C.DEFAULT_BUFFER_SEGMENT_SIZE, null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f45762v = new a(131072, (CharSequence) null, f.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f45763w = new a(262144, null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f45764x = new a(524288, null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f45765y = new a(1048576, null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f45766z = new a(2097152, (CharSequence) null, f.h.class);

        /* renamed from: a  reason: collision with root package name */
        public final Object f45767a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45768b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends f.a> f45769c;

        /* renamed from: d  reason: collision with root package name */
        public final f f45770d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0700f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f45768b, charSequence, fVar, this.f45769c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f45767a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f45767a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f45770d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f45769c;
                if (cls != null) {
                    try {
                        f.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception e10) {
                            e = e10;
                            aVar = newInstance;
                            Class<? extends f.a> cls2 = this.f45769c;
                            String name = cls2 == null ? "null" : cls2.getName();
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                            return this.f45770d.a(view, aVar);
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
                return this.f45770d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f45767a;
                return obj2 == null ? aVar.f45767a == null : obj2.equals(aVar.f45767a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f45767a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, CharSequence charSequence, f fVar) {
            this(null, i10, charSequence, fVar, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f45768b = i10;
            this.f45770d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f45767a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f45767a = obj;
            }
            this.f45769c = cls;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f45771a;

        public b(Object obj) {
            this.f45771a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
            }
            if (i13 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
            }
            return new b(null);
        }
    }

    /* renamed from: p3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0699c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f45772a;

        public C0699c(Object obj) {
            this.f45772a = obj;
        }

        public static C0699c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new C0699c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
            }
            if (i14 >= 19) {
                return new C0699c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
            }
            return new C0699c(null);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Object f45773a;

        public d(Object obj) {
            this.f45773a = obj;
        }

        public static d a(int i10, float f10, float f11, float f12) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new d(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
            }
            return new d(null);
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f45742a = accessibilityNodeInfo;
    }

    public static c M0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c N() {
        return M0(AccessibilityNodeInfo.obtain());
    }

    public static c O(View view) {
        return M0(AccessibilityNodeInfo.obtain(view));
    }

    public static c P(c cVar) {
        return M0(AccessibilityNodeInfo.obtain(cVar.f45742a));
    }

    public static String j(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final boolean A() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void A0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45742a.setScreenReaderFocusable(z10);
        } else {
            V(1, z10);
        }
    }

    public final int B(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f45741d;
        f45741d = i11 + 1;
        return i11;
    }

    public void B0(boolean z10) {
        this.f45742a.setScrollable(z10);
    }

    public boolean C() {
        return this.f45742a.isCheckable();
    }

    public void C0(boolean z10) {
        this.f45742a.setSelected(z10);
    }

    public boolean D() {
        return this.f45742a.isChecked();
    }

    public void D0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45742a.setShowingHintText(z10);
        } else {
            V(4, z10);
        }
    }

    public boolean E() {
        return this.f45742a.isClickable();
    }

    public void E0(View view, int i10) {
        this.f45744c = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.setSource(view, i10);
        }
    }

    public boolean F() {
        return this.f45742a.isEnabled();
    }

    public void F0(CharSequence charSequence) {
        if (k3.a.b()) {
            this.f45742a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean G() {
        return this.f45742a.isFocusable();
    }

    public void G0(CharSequence charSequence) {
        this.f45742a.setText(charSequence);
    }

    public boolean H() {
        return this.f45742a.isFocused();
    }

    public void H0(int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f45742a.setTextSelection(i10, i11);
        }
    }

    public boolean I() {
        return this.f45742a.isLongClickable();
    }

    public void I0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f45742a.setTraversalAfter(view);
        }
    }

    public boolean J() {
        return this.f45742a.isPassword();
    }

    public void J0(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f45742a.setViewIdResourceName(str);
        }
    }

    public boolean K() {
        return this.f45742a.isScrollable();
    }

    public void K0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.setVisibleToUser(z10);
        }
    }

    public boolean L() {
        return this.f45742a.isSelected();
    }

    public AccessibilityNodeInfo L0() {
        return this.f45742a;
    }

    public boolean M() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f45742a.isShowingHintText();
        }
        return l(4);
    }

    public boolean Q(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f45742a.performAction(i10, bundle);
        }
        return false;
    }

    public void R() {
        this.f45742a.recycle();
    }

    public boolean S(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f45742a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45767a);
        }
        return false;
    }

    public final void T(View view) {
        SparseArray<WeakReference<ClickableSpan>> w10 = w(view);
        if (w10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < w10.size(); i10++) {
                if (w10.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                w10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public void U(boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.setAccessibilityFocused(z10);
        }
    }

    public final void V(int i10, boolean z10) {
        Bundle s10 = s();
        if (s10 != null) {
            int i11 = s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            s10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public void W(Rect rect) {
        this.f45742a.setBoundsInParent(rect);
    }

    public void X(Rect rect) {
        this.f45742a.setBoundsInScreen(rect);
    }

    public void Y(boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setCanOpenPopup(z10);
        }
    }

    public void Z(boolean z10) {
        this.f45742a.setCheckable(z10);
    }

    public void a(int i10) {
        this.f45742a.addAction(i10);
    }

    public void a0(boolean z10) {
        this.f45742a.setChecked(z10);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f45742a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45767a);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f45742a.setClassName(charSequence);
    }

    public void c(View view) {
        this.f45742a.addChild(view);
    }

    public void c0(boolean z10) {
        this.f45742a.setClickable(z10);
    }

    public void d(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.addChild(view, i10);
        }
    }

    public void d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f45771a);
        }
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public void e0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0699c) obj).f45772a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f45742a;
            if (accessibilityNodeInfo == null) {
                if (cVar.f45742a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(cVar.f45742a)) {
                return false;
            }
            return this.f45744c == cVar.f45744c && this.f45743b == cVar.f45743b;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 26) {
            return;
        }
        g();
        T(view);
        ClickableSpan[] q10 = q(charSequence);
        if (q10 == null || q10.length <= 0) {
            return;
        }
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a3.d.f383a);
        SparseArray<WeakReference<ClickableSpan>> u10 = u(view);
        for (int i11 = 0; i11 < q10.length; i11++) {
            int B = B(q10[i11], u10);
            u10.put(B, new WeakReference<>(q10[i11]));
            e(q10[i11], (Spanned) charSequence, B);
        }
    }

    public void f0(CharSequence charSequence) {
        this.f45742a.setContentDescription(charSequence);
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f45742a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f45742a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f45742a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    public void g0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setContentInvalid(z10);
        }
    }

    public final List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f45742a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f45742a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public void h0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setDismissable(z10);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f45742a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f45742a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void i0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f45742a.setEditable(z10);
        }
    }

    public void j0(boolean z10) {
        this.f45742a.setEnabled(z10);
    }

    public int k() {
        return this.f45742a.getActions();
    }

    public void k0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f45742a.setError(charSequence);
        }
    }

    public final boolean l(int i10) {
        Bundle s10 = s();
        return s10 != null && (s10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public void l0(boolean z10) {
        this.f45742a.setFocusable(z10);
    }

    @Deprecated
    public void m(Rect rect) {
        this.f45742a.getBoundsInParent(rect);
    }

    public void m0(boolean z10) {
        this.f45742a.setFocused(z10);
    }

    public void n(Rect rect) {
        this.f45742a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45742a.setHeading(z10);
        } else {
            V(2, z10);
        }
    }

    public int o() {
        return this.f45742a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f45742a.setHintText(charSequence);
        } else if (i10 >= 19) {
            this.f45742a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence p() {
        return this.f45742a.getClassName();
    }

    public void p0(int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setLiveRegion(i10);
        }
    }

    public void q0(boolean z10) {
        this.f45742a.setLongClickable(z10);
    }

    public CharSequence r() {
        return this.f45742a.getContentDescription();
    }

    public void r0(int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f45742a.setMaxTextLength(i10);
        }
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f45742a.getExtras();
        }
        return new Bundle();
    }

    public void s0(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.setMovementGranularities(i10);
        }
    }

    public int t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f45742a.getMovementGranularities();
        }
        return 0;
    }

    public void t0(CharSequence charSequence) {
        this.f45742a.setPackageName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(v());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; viewId: ");
        sb2.append(z());
        sb2.append("; checkable: ");
        sb2.append(C());
        sb2.append("; checked: ");
        sb2.append(D());
        sb2.append("; focusable: ");
        sb2.append(G());
        sb2.append("; focused: ");
        sb2.append(H());
        sb2.append("; selected: ");
        sb2.append(L());
        sb2.append("; clickable: ");
        sb2.append(E());
        sb2.append("; longClickable: ");
        sb2.append(I());
        sb2.append("; enabled: ");
        sb2.append(F());
        sb2.append("; password: ");
        sb2.append(J());
        sb2.append("; scrollable: " + K());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> i10 = i();
            for (int i11 = 0; i11 < i10.size(); i11++) {
                a aVar = i10.get(i11);
                String j10 = j(aVar.b());
                if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    j10 = aVar.c().toString();
                }
                sb2.append(j10);
                if (i11 != i10.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int k10 = k();
            while (k10 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k10);
                k10 &= ~numberOfTrailingZeros;
                sb2.append(j(numberOfTrailingZeros));
                if (k10 != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final SparseArray<WeakReference<ClickableSpan>> u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w10 = w(view);
        if (w10 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(a3.d.Q, sparseArray);
            return sparseArray;
        }
        return w10;
    }

    public void u0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f45742a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            this.f45742a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence v() {
        return this.f45742a.getPackageName();
    }

    public void v0(View view) {
        this.f45743b = -1;
        this.f45742a.setParent(view);
    }

    public final SparseArray<WeakReference<ClickableSpan>> w(View view) {
        return (SparseArray) view.getTag(a3.d.Q);
    }

    public void w0(View view, int i10) {
        this.f45743b = i10;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f45742a.setParent(view, i10);
        }
    }

    public CharSequence x() {
        if (k3.a.b()) {
            return this.f45742a.getStateDescription();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f45742a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        return null;
    }

    public void x0(boolean z10) {
        this.f45742a.setPassword(z10);
    }

    public CharSequence y() {
        if (A()) {
            List<Integer> h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f45742a.getText(), 0, this.f45742a.getText().length()));
            for (int i10 = 0; i10 < h10.size(); i10++) {
                spannableString.setSpan(new p3.a(h13.get(i10).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h10.get(i10).intValue(), h11.get(i10).intValue(), h12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f45742a.getText();
    }

    public void y0(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f45773a);
        }
    }

    public String z() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f45742a.getViewIdResourceName();
        }
        return null;
    }

    public void z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f45742a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }
}
