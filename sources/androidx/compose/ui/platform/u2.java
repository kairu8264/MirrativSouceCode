package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14667a = "Wrapper";

    /* renamed from: b  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f14668b = new ViewGroup.LayoutParams(-2, -2);

    public static final l0.l a(s1.k kVar, l0.m mVar) {
        jo.p.h(kVar, TtmlNode.RUBY_CONTAINER);
        jo.p.h(mVar, "parent");
        return l0.p.a(new s1.g0(kVar), mVar);
    }

    public static final l0.l b(AndroidComposeView androidComposeView, l0.m mVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        if (d(androidComposeView)) {
            androidComposeView.setTag(x0.h.K, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        l0.l a10 = l0.p.a(new s1.g0(androidComposeView.getRoot()), mVar);
        View view = androidComposeView.getView();
        int i10 = x0.h.L;
        Object tag = view.getTag(i10);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a10);
            androidComposeView.getView().setTag(i10, wrappedComposition);
        }
        wrappedComposition.n(pVar);
        return wrappedComposition;
    }

    public static final void c() {
        if (a1.c()) {
            return;
        }
        try {
            io.l<c1, wn.v> lVar = a1.f14376a;
            Field declaredField = a1.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
            Log.w(f14667a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    public static final boolean d(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (t2.f14662a.a(androidComposeView).isEmpty() ^ true);
    }

    public static final l0.l e(a aVar, l0.m mVar, io.p<? super l0.i, ? super Integer, wn.v> pVar) {
        jo.p.h(aVar, "<this>");
        jo.p.h(mVar, "parent");
        jo.p.h(pVar, "content");
        w0.f14672a.a();
        AndroidComposeView androidComposeView = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = aVar.getContext();
            jo.p.g(context, "context");
            androidComposeView = new AndroidComposeView(context);
            aVar.addView(androidComposeView.getView(), f14668b);
        }
        return b(androidComposeView, mVar, pVar);
    }
}
