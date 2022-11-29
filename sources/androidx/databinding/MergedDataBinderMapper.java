package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends d {

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends d>> f14980a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public List<d> f14981b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f14982c = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public void a(d dVar) {
        if (this.f14980a.add(dVar.getClass())) {
            this.f14981b.add(dVar);
            for (d dVar2 : dVar.collectDependencies()) {
                a(dVar2);
            }
        }
    }

    public final boolean b() {
        boolean z10 = false;
        for (String str : this.f14982c) {
            try {
                Class<?> cls = Class.forName(str);
                if (d.class.isAssignableFrom(cls)) {
                    a((d) cls.newInstance());
                    this.f14982c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        for (d dVar : this.f14981b) {
            String convertBrIdToString = dVar.convertBrIdToString(i10);
            if (convertBrIdToString != null) {
                return convertBrIdToString;
            }
        }
        if (b()) {
            return convertBrIdToString(i10);
        }
        return null;
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        for (d dVar : this.f14981b) {
            ViewDataBinding dataBinder = dVar.getDataBinder(eVar, view, i10);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(eVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        for (d dVar : this.f14981b) {
            int layoutId = dVar.getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        for (d dVar : this.f14981b) {
            ViewDataBinding dataBinder = dVar.getDataBinder(eVar, viewArr, i10);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (b()) {
            return getDataBinder(eVar, viewArr, i10);
        }
        return null;
    }
}
