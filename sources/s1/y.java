package s1;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.platform.o2;
import androidx.compose.ui.platform.x1;
import d2.k;
import d2.l;

/* loaded from: classes.dex */
public interface y {

    /* renamed from: p  reason: collision with root package name */
    public static final a f51966p = a.f51967a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f51967a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static boolean f51968b;

        public final boolean a() {
            return f51968b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void i();
    }

    static /* synthetic */ void u(y yVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        yVar.a(z10);
    }

    void a(boolean z10);

    void e(k kVar, boolean z10);

    androidx.compose.ui.platform.i getAccessibilityManager();

    y0.d getAutofill();

    y0.i getAutofillTree();

    m0 getClipboardManager();

    m2.d getDensity();

    a1.g getFocusManager();

    l.b getFontFamilyResolver();

    k.a getFontLoader();

    i1.a getHapticFeedBack();

    j1.b getInputModeManager();

    m2.q getLayoutDirection();

    n1.t getPointerIconService();

    m getSharedDrawScope();

    boolean getShowLayoutBounds();

    a0 getSnapshotObserver();

    e2.c0 getTextInputService();

    x1 getTextToolbar();

    g2 getViewConfiguration();

    o2 getWindowInfo();

    long j(long j10);

    void k(k kVar);

    void l(io.a<wn.v> aVar);

    void m(k kVar, boolean z10);

    void n(k kVar);

    void p(b bVar);

    void q(k kVar, long j10);

    void r(k kVar);

    boolean requestFocus();

    long s(long j10);

    void setShowLayoutBounds(boolean z10);

    void v();

    void w();

    x x(io.l<? super c1.w, wn.v> lVar, io.a<wn.v> aVar);

    void y(k kVar);
}
