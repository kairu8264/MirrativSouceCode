package x3;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<WeakHashMap<View, WeakReference<?>>> f59657a = new SparseArray<>();

    public static <T> T a(View view, T t10, int i10) {
        WeakReference<?> put;
        if (Build.VERSION.SDK_INT >= 14) {
            T t11 = (T) view.getTag(i10);
            view.setTag(i10, t10);
            return t11;
        }
        SparseArray<WeakHashMap<View, WeakReference<?>>> sparseArray = f59657a;
        synchronized (sparseArray) {
            WeakHashMap<View, WeakReference<?>> weakHashMap = sparseArray.get(i10);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                sparseArray.put(i10, weakHashMap);
            }
            if (t10 == null) {
                put = weakHashMap.remove(view);
            } else {
                put = weakHashMap.put(view, new WeakReference<>(t10));
            }
            if (put == null) {
                return null;
            }
            return (T) put.get();
        }
    }
}
