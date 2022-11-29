package com.dena.mirrativ.resource;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f22698a = new SparseIntArray(0);

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f22699a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f22699a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f22700a = new HashMap<>(0);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f22699a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        if (f22698a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f22700a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f22698a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
