package ai;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface wg1 {
    void J();

    void R(String str);

    void T(Bundle bundle);

    JSONObject a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void a0(Bundle bundle);

    void b(View view, Map<String, WeakReference<View>> map);

    void c(View view, MotionEvent motionEvent, View view2);

    void d(View view);

    JSONObject e(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void g();

    boolean h(Bundle bundle);

    boolean i();

    void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    void k(d20 d20Var);

    void l();

    void m();

    void n(vu vuVar);

    void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10);

    void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2);

    void q(yu yuVar);

    void y();

    void z();
}
