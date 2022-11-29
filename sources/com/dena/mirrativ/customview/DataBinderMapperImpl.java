package com.dena.mirrativ.customview;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import h9.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m9.f;
import m9.h;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f20780a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f20781a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f20781a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f20782a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(4);
            f20782a = hashMap;
            hashMap.put("layout/cardview_mirra_class_season_rating_0", Integer.valueOf(e.cardview_mirra_class_season_rating));
            hashMap.put("layout/view_error_0", Integer.valueOf(e.view_error));
            hashMap.put("layout/view_loading_mirrabit_0", Integer.valueOf(e.view_loading_mirrabit));
            hashMap.put("layout/view_not_found_0", Integer.valueOf(e.view_not_found));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f20780a = sparseIntArray;
        sparseIntArray.put(e.cardview_mirra_class_season_rating, 1);
        sparseIntArray.put(e.view_error, 2);
        sparseIntArray.put(e.view_loading_mirrabit, 3);
        sparseIntArray.put(e.view_not_found, 4);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.featurecommon.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.resource.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f20781a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(androidx.databinding.e eVar, View view, int i10) {
        int i11 = f20780a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i11 == 1) {
                    if ("layout/cardview_mirra_class_season_rating_0".equals(tag)) {
                        return new m9.b(eVar, new View[]{view});
                    }
                    throw new IllegalArgumentException("The tag for cardview_mirra_class_season_rating is invalid. Received: " + tag);
                } else if (i11 == 2) {
                    if ("layout/view_error_0".equals(tag)) {
                        return new m9.d(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_error is invalid. Received: " + tag);
                } else if (i11 == 3) {
                    if ("layout/view_loading_mirrabit_0".equals(tag)) {
                        return new f(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_loading_mirrabit is invalid. Received: " + tag);
                } else if (i11 != 4) {
                    return null;
                } else {
                    if ("layout/view_not_found_0".equals(tag)) {
                        return new h(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_not_found is invalid. Received: " + tag);
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f20782a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(androidx.databinding.e eVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f20780a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 1) {
                if ("layout/cardview_mirra_class_season_rating_0".equals(tag)) {
                    return new m9.b(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for cardview_mirra_class_season_rating is invalid. Received: " + tag);
            }
        }
        return null;
    }
}
