package com.dena.mirrativ.featurecommon;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import da.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f21430a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f21431a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f21431a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f21432a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(1);
            f21432a = hashMap;
            hashMap.put("layout/view_float_toast_0", Integer.valueOf(g.view_float_toast));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f21430a = sparseIntArray;
        sparseIntArray.put(g.view_float_toast, 1);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.common.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.resource.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f21431a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f21430a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i11 != 1) {
                    return null;
                }
                if ("layout/view_float_toast_0".equals(tag)) {
                    return new ea.b(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_float_toast is invalid. Received: " + tag);
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f21432a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f21430a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
