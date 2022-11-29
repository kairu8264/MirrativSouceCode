package o3;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o3.a;
import o3.c0;
import o3.o0;
import o3.p0;
import p3.c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static Field f43895b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f43896c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f43897d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f43898e;

    /* renamed from: f  reason: collision with root package name */
    public static WeakHashMap<View, String> f43899f;

    /* renamed from: h  reason: collision with root package name */
    public static Field f43901h;

    /* renamed from: j  reason: collision with root package name */
    public static ThreadLocal<Rect> f43903j;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f43894a = new AtomicInteger(1);

    /* renamed from: g  reason: collision with root package name */
    public static WeakHashMap<View, j0> f43900g = null;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f43902i = false;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f43904k = {a3.d.f385b, a3.d.f387c, a3.d.f402n, a3.d.f413y, a3.d.B, a3.d.C, a3.d.D, a3.d.E, a3.d.F, a3.d.G, a3.d.f389d, a3.d.f391e, a3.d.f393f, a3.d.f395g, a3.d.f396h, a3.d.f397i, a3.d.f398j, a3.d.f399k, a3.d.f400l, a3.d.f401m, a3.d.f403o, a3.d.f404p, a3.d.f405q, a3.d.f406r, a3.d.f407s, a3.d.f408t, a3.d.f409u, a3.d.f410v, a3.d.f411w, a3.d.f412x, a3.d.f414z, a3.d.A};

    /* renamed from: l  reason: collision with root package name */
    public static final x f43905l = b0.f43879w;

    /* renamed from: m  reason: collision with root package name */
    public static final e f43906m = new e();

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // o3.c0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        @Override // o3.c0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        @Override // o3.c0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // o3.c0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return q.b(view);
        }

        @Override // o3.c0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        @Override // o3.c0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // o3.c0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return s.a(view);
        }

        @Override // o3.c0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            s.b(view, charSequence);
        }

        @Override // o3.c0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // o3.c0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        @Override // o3.c0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        @Override // o3.c0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f43907w = new WeakHashMap<>();

        public void a(View view) {
            this.f43907w.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        public final void b(View view, boolean z10) {
            boolean z11 = view.getVisibility() == 0;
            if (z10 != z11) {
                c0.a0(view, z11 ? 16 : 32);
                this.f43907w.put(view, Boolean.valueOf(z11));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f43907w.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f43907w.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f43908a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f43909b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43910c;

        /* renamed from: d  reason: collision with root package name */
        public final int f43911d;

        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f43910c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t10);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t10 = (T) view.getTag(this.f43908a);
                if (this.f43909b.isInstance(t10)) {
                    return t10;
                }
                return null;
            }
            return null;
        }

        public void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                c0.l(view);
                view.setTag(this.f43908a, t10);
                c0.a0(view, this.f43911d);
            }
        }

        public abstract boolean h(T t10, T t11);

        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f43908a = i10;
            this.f43909b = cls;
            this.f43911d = i11;
            this.f43910c = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public p0 f43912a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f43913b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ o3.v f43914c;

            public a(View view, o3.v vVar) {
                this.f43913b = view;
                this.f43914c = vVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                p0 y10 = p0.y(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f43913b);
                    if (y10.equals(this.f43912a)) {
                        return this.f43914c.a(view, y10).w();
                    }
                }
                this.f43912a = y10;
                p0 a10 = this.f43914c.a(view, y10);
                if (i10 >= 30) {
                    return a10.w();
                }
                c0.o0(view);
                return a10.w();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a3.d.f386b0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static p0 b(View view, p0 p0Var, Rect rect) {
            WindowInsets w10 = p0Var.w();
            if (w10 != null) {
                return p0.y(view.computeSystemWindowInsets(w10, rect), view);
            }
            rect.setEmpty();
            return p0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static p0 j(View view) {
            return p0.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, o3.v vVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a3.d.T, vVar);
            }
            if (vVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a3.d.f386b0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, vVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static p0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            p0 x10 = p0.x(rootWindowInsets);
            x10.u(x10);
            x10.d(view.getRootView());
            return x10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class o {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        public static void a(View view, final v vVar) {
            int i10 = a3.d.f384a0;
            s.g gVar = (s.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new s.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: o3.d0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return c0.v.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            s.g gVar = (s.g) view.getTag(a3.d.f384a0);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class r {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static o3.c b(View view, o3.c cVar) {
            ContentInfo f10 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? cVar : o3.c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, o3.w wVar) {
            if (wVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(wVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class u implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final o3.w f43915a;

        public u(o3.w wVar) {
            this.f43915a = wVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            o3.c g10 = o3.c.g(contentInfo);
            o3.c a10 = this.f43915a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    /* loaded from: classes.dex */
    public interface v {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class w {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f43916d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f43917a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f43918b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f43919c = null;

        public static w a(View view) {
            int i10 = a3.d.Z;
            w wVar = (w) view.getTag(i10);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(i10, wVar2);
                return wVar2;
            }
            return wVar;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c10));
                }
            }
            return c10 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f43917a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f43918b == null) {
                this.f43918b = new SparseArray<>();
            }
            return this.f43918b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a3.d.f384a0);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((v) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f43919c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f43919c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d10 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d10.valueAt(indexOfKey);
                    d10.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d10.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && c0.U(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f43917a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f43916d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f43917a == null) {
                    this.f43917a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f43916d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f43917a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f43917a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    public static x A(View view) {
        if (view instanceof x) {
            return (x) view;
        }
        return f43905l;
    }

    @Deprecated
    public static void A0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    public static boolean B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.b(view);
        }
        return false;
    }

    public static void B0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z10);
        }
    }

    public static int C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static void C0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            h.s(view, i10);
        } else if (i11 >= 16) {
            if (i10 == 4) {
                i10 = 2;
            }
            h.s(view, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static void D0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i10);
        }
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static void E0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.t(view, z10);
        } else if (view instanceof o3.p) {
            ((o3.p) view).setNestedScrollingEnabled(z10);
        }
    }

    public static int F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f43898e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f43897d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f43898e = true;
        }
        Field field = f43897d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void F0(View view, o3.v vVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, vVar);
        }
    }

    public static int G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f43896c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f43895b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f43896c = true;
        }
        Field field = f43895b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void G0(View view, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 17) {
            i.k(view, i10, i11, i12, i13);
        } else {
            view.setPadding(i10, i11, i12, i13);
        }
    }

    public static String[] H(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t.a(view);
        }
        return (String[]) view.getTag(a3.d.V);
    }

    public static void H0(View view, z zVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, (PointerIcon) (zVar != null ? zVar.a() : null));
        }
    }

    public static int I(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.e(view);
        }
        return view.getPaddingRight();
    }

    public static void I0(View view, boolean z10) {
        q0().g(view, Boolean.valueOf(z10));
    }

    public static int J(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.f(view);
        }
        return view.getPaddingLeft();
    }

    public static void J0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i10, i11);
        }
    }

    public static ViewParent K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.f(view);
        }
        return view.getParent();
    }

    public static void K0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            O0().g(view, charSequence);
        }
    }

    public static p0 L(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.a(view);
        }
        if (i10 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static void L0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (f43899f == null) {
            f43899f = new WeakHashMap<>();
        }
        f43899f.put(view, str);
    }

    public static CharSequence M(View view) {
        return O0().f(view);
    }

    public static void M0(View view) {
        if (C(view) == 0) {
            C0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C((View) parent) == 4) {
                C0(view, 2);
                return;
            }
        }
    }

    public static String N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f43899f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void N0(View view, o0.b bVar) {
        o0.d(view, bVar);
    }

    @Deprecated
    public static int O(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    public static f<CharSequence> O0() {
        return new c(a3.d.X, CharSequence.class, 64, 30);
    }

    public static float P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m(view);
        }
        return 0.0f;
    }

    public static void P0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof o3.p) {
            ((o3.p) view).stopNestedScroll();
        }
    }

    public static boolean Q(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static void Q0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean S(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean T(View view) {
        Boolean f10 = b().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static boolean U(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean V(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.p(view);
        }
        if (view instanceof o3.p) {
            return ((o3.p) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean X(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.g(view);
        }
        return false;
    }

    public static boolean Y(View view) {
        Boolean f10 = q0().f(view);
        return f10 != null && f10.booleanValue();
    }

    public static /* synthetic */ o3.c Z(o3.c cVar) {
        return cVar;
    }

    public static void a0(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = r(view) != null && view.getVisibility() == 0;
            if (q(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(r(view));
                    M0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static f<Boolean> b() {
        return new d(a3.d.R, Boolean.class, 28);
    }

    public static void b0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
        } else if (i11 >= 21) {
            Rect z10 = z();
            boolean z11 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                z10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z11 = !z10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i10);
            if (z11 && z10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(z10);
            }
        } else {
            f(view, i10);
        }
    }

    public static int c(View view, CharSequence charSequence, p3.f fVar) {
        int t10 = t(view, charSequence);
        if (t10 != -1) {
            d(view, new c.a(t10, charSequence, fVar));
        }
        return t10;
    }

    public static void c0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
        } else if (i11 >= 21) {
            Rect z10 = z();
            boolean z11 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                z10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z11 = !z10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            g(view, i10);
            if (z11 && z10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(z10);
            }
        } else {
            g(view, i10);
        }
    }

    public static void d(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            l(view);
            m0(aVar.b(), view);
            s(view).add(aVar);
            a0(view, 0);
        }
    }

    public static p0 d0(View view, p0 p0Var) {
        WindowInsets w10;
        if (Build.VERSION.SDK_INT >= 21 && (w10 = p0Var.w()) != null) {
            WindowInsets b10 = l.b(view, w10);
            if (!b10.equals(w10)) {
                return p0.y(b10, view);
            }
        }
        return p0Var;
    }

    public static j0 e(View view) {
        if (f43900g == null) {
            f43900g = new WeakHashMap<>();
        }
        j0 j0Var = f43900g.get(view);
        if (j0Var == null) {
            j0 j0Var2 = new j0(view);
            f43900g.put(view, j0Var2);
            return j0Var2;
        }
        return j0Var;
    }

    public static void e0(View view, p3.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.L0());
    }

    public static void f(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            Q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Q0((View) parent);
            }
        }
    }

    public static f<CharSequence> f0() {
        return new b(a3.d.S, CharSequence.class, 8, 28);
    }

    public static void g(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            Q0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                Q0((View) parent);
            }
        }
    }

    public static boolean g0(View view, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.j(view, i10, bundle);
        }
        return false;
    }

    public static p0 h(View view, p0 p0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, p0Var, rect) : p0Var;
    }

    public static o3.c h0(View view, o3.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, cVar);
        }
        o3.w wVar = (o3.w) view.getTag(a3.d.U);
        if (wVar != null) {
            o3.c a10 = wVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            return A(view).onReceiveContent(a10);
        }
        return A(view).onReceiveContent(cVar);
    }

    public static p0 i(View view, p0 p0Var) {
        WindowInsets w10;
        if (Build.VERSION.SDK_INT >= 21 && (w10 = p0Var.w()) != null) {
            WindowInsets a10 = l.a(view, w10);
            if (!a10.equals(w10)) {
                return p0.y(a10, view);
            }
        }
        return p0Var;
    }

    public static void i0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static void j0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static void k0(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    public static void l(View view) {
        o3.a n10 = n(view);
        if (n10 == null) {
            n10 = new o3.a();
        }
        r0(view, n10);
    }

    public static void l0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m0(i10, view);
            a0(view, 0);
        }
    }

    public static int m() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        if (Build.VERSION.SDK_INT >= 17) {
            return i.a();
        }
        do {
            atomicInteger = f43894a;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public static void m0(int i10, View view) {
        List<c.a> s10 = s(view);
        for (int i11 = 0; i11 < s10.size(); i11++) {
            if (s10.get(i11).b() == i10) {
                s10.remove(i11);
                return;
            }
        }
    }

    public static o3.a n(View view) {
        View.AccessibilityDelegate o10 = o(view);
        if (o10 == null) {
            return null;
        }
        if (o10 instanceof a.C0648a) {
            return ((a.C0648a) o10).f43878a;
        }
        return new o3.a(o10);
    }

    public static void n0(View view, c.a aVar, CharSequence charSequence, p3.f fVar) {
        if (fVar == null && charSequence == null) {
            l0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, fVar));
        }
    }

    public static View.AccessibilityDelegate o(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.a(view);
        }
        return p(view);
    }

    public static void o0(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            l.c(view);
        } else if (i10 >= 16) {
            h.p(view);
        }
    }

    public static View.AccessibilityDelegate p(View view) {
        if (f43902i) {
            return null;
        }
        if (f43901h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f43901h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f43902i = true;
                return null;
            }
        }
        try {
            Object obj = f43901h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f43902i = true;
            return null;
        }
    }

    public static void p0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    public static f<Boolean> q0() {
        return new a(a3.d.W, Boolean.class, 28);
    }

    public static CharSequence r(View view) {
        return f0().f(view);
    }

    public static void r0(View view, o3.a aVar) {
        if (aVar == null && (o(view) instanceof a.C0648a)) {
            aVar = new o3.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static List<c.a> s(View view) {
        int i10 = a3.d.P;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void s0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static int t(View view, CharSequence charSequence) {
        List<c.a> s10 = s(view);
        for (int i10 = 0; i10 < s10.size(); i10++) {
            if (TextUtils.equals(charSequence, s10.get(i10).c())) {
                return s10.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f43904k;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < s10.size(); i14++) {
                z10 &= s10.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void t0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 19) {
            k.f(view, i10);
        }
    }

    public static ColorStateList u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof a0) {
            return ((a0) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void u0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            f0().g(view, charSequence);
            if (charSequence != null) {
                f43906m.a(view);
            } else {
                f43906m.d(view);
            }
        }
    }

    public static PorterDuff.Mode v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof a0) {
            return ((a0) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void v0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static Rect w(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static void w0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.q(view, colorStateList);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z10) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof a0) {
            ((a0) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static Display x(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.b(view);
        }
        if (U(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void x0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            m.r(view, mode);
            if (i10 == 21) {
                Drawable background = view.getBackground();
                boolean z10 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z10) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof a0) {
            ((a0) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static float y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.i(view);
        }
        return 0.0f;
    }

    public static void y0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    public static Rect z() {
        if (f43903j == null) {
            f43903j = new ThreadLocal<>();
        }
        Rect rect = f43903j.get();
        if (rect == null) {
            rect = new Rect();
            f43903j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f10);
        }
    }
}
