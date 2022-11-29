package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static d f15024a = new DataBinderMapperImpl();

    /* renamed from: b  reason: collision with root package name */
    public static e f15025b = null;

    public static <T extends ViewDataBinding> T a(e eVar, View view, int i10) {
        return (T) f15024a.getDataBinder(eVar, view, i10);
    }

    public static <T extends ViewDataBinding> T b(e eVar, View[] viewArr, int i10) {
        return (T) f15024a.getDataBinder(eVar, viewArr, i10);
    }

    public static <T extends ViewDataBinding> T c(e eVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return (T) a(eVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) b(eVar, viewArr, i11);
    }

    public static e d() {
        return f15025b;
    }

    public static <T extends ViewDataBinding> T e(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10) {
        return (T) f(layoutInflater, i10, viewGroup, z10, f15025b);
    }

    public static <T extends ViewDataBinding> T f(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, e eVar) {
        boolean z11 = viewGroup != null && z10;
        int childCount = z11 ? viewGroup.getChildCount() : 0;
        View inflate = layoutInflater.inflate(i10, viewGroup, z10);
        if (z11) {
            return (T) c(eVar, viewGroup, childCount, i10);
        }
        return (T) a(eVar, inflate, i10);
    }

    public static <T extends ViewDataBinding> T g(Activity activity, int i10) {
        return (T) h(activity, i10, f15025b);
    }

    public static <T extends ViewDataBinding> T h(Activity activity, int i10, e eVar) {
        activity.setContentView(i10);
        return (T) c(eVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i10);
    }
}
