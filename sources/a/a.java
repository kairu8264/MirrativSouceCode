package a;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import io.p;
import l0.i;
import l0.m;
import wn.v;
import y4.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f0a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, m mVar, p<? super i, ? super Integer, v> pVar) {
        jo.p.h(componentActivity, "<this>");
        jo.p.h(pVar, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(mVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(mVar);
        composeView2.setContent(pVar);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f0a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, m mVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = null;
        }
        a(componentActivity, mVar, pVar);
    }

    public static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        jo.p.g(decorView, "window.decorView");
        if (w0.a(decorView) == null) {
            w0.b(decorView, componentActivity);
        }
        if (x0.a(decorView) == null) {
            x0.b(decorView, componentActivity);
        }
        if (f.a(decorView) == null) {
            f.b(decorView, componentActivity);
        }
    }
}
