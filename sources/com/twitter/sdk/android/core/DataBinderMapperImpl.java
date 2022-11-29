package com.twitter.sdk.android.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f28259a = new SparseIntArray(0);

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f28260a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f28260a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f28261a = new HashMap<>(0);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f28260a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        if (f28259a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f28261a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f28259a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
