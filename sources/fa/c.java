package fa;

import android.view.View;
import android.view.WindowManager;
import io.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jo.h;
import jo.p;
import wn.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final WindowManager f31893a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, b> f31894b;

    public c(WindowManager windowManager, HashMap<String, b> hashMap) {
        p.h(windowManager, "windowManager");
        p.h(hashMap, "floatViews");
        this.f31893a = windowManager;
        this.f31894b = hashMap;
    }

    public final void a(b bVar) {
        p.h(bVar, "floatView");
        this.f31894b.put(bVar.getFloatViewTag(), bVar);
        WindowManager windowManager = this.f31893a;
        View floatViewContentView = bVar.getFloatViewContentView();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(bVar.getFloatViewLayoutWidth(), bVar.getFloatViewLayoutHeight(), 2038, bVar.getFloatViewLayoutFlags(), -3);
        layoutParams.gravity = bVar.getFloatViewGravity();
        v vVar = v.f59242a;
        windowManager.addView(floatViewContentView, layoutParams);
    }

    public final b b(String str) {
        p.h(str, "tag");
        return this.f31894b.get(str);
    }

    public final void c(b bVar) {
        Map.Entry<String, b> entry;
        p.h(bVar, "floatView");
        Iterator<Map.Entry<String, b>> it = this.f31894b.entrySet().iterator();
        do {
            entry = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, b> next = it.next();
            if (p.c(next.getValue(), bVar)) {
                entry = next;
                continue;
            }
        } while (entry == null);
        if (entry != null) {
            this.f31894b.remove(entry.getValue().getFloatViewTag());
            this.f31893a.removeView(entry.getValue().getFloatViewContentView());
        }
    }

    public final void d(String str) {
        p.h(str, "tag");
        b bVar = this.f31894b.get(str);
        if (bVar != null) {
            this.f31893a.removeView(bVar.getFloatViewContentView());
            this.f31894b.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(l<? super b, Boolean> lVar) {
        p.h(lVar, "predicate");
        Collection<b> values = this.f31894b.values();
        p.g(values, "floatViews.values");
        ArrayList<b> arrayList = new ArrayList();
        for (Object obj : values) {
            if (lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (b bVar : arrayList) {
            this.f31893a.removeView(bVar.getFloatViewContentView());
            this.f31894b.remove(bVar.getFloatViewTag());
        }
    }

    public final void f(b bVar) {
        p.h(bVar, "floatView");
        d(bVar.getFloatViewTag());
        this.f31894b.put(bVar.getFloatViewTag(), bVar);
        WindowManager windowManager = this.f31893a;
        View floatViewContentView = bVar.getFloatViewContentView();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(bVar.getFloatViewLayoutWidth(), bVar.getFloatViewLayoutHeight(), 2038, bVar.getFloatViewLayoutFlags(), -3);
        layoutParams.gravity = bVar.getFloatViewGravity();
        v vVar = v.f59242a;
        windowManager.addView(floatViewContentView, layoutParams);
    }

    public /* synthetic */ c(WindowManager windowManager, HashMap hashMap, int i10, h hVar) {
        this(windowManager, (i10 & 2) != 0 ? new HashMap() : hashMap);
    }
}
