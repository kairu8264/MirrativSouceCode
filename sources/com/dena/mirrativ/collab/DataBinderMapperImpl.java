package com.dena.mirrativ.collab;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import com.dena.mirrorman.net.api.Referer;
import d9.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f20774a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f20775a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(35);
            f20775a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "avatarBodyImageUrl");
            sparseArray.put(2, "backgroundImageUrl");
            sparseArray.put(3, "bindModel");
            sparseArray.put(4, "bio");
            sparseArray.put(5, "birthday");
            sparseArray.put(6, "continuousBadgeImageUrl");
            sparseArray.put(7, "followCount");
            sparseArray.put(8, "followed");
            sparseArray.put(9, "followerCount");
            sparseArray.put(10, Referer.FOLLOWING);
            sparseArray.put(11, "imageUrl");
            sparseArray.put(12, "moderatorButtonBg");
            sparseArray.put(13, "moderatorButtonText");
            sparseArray.put(14, "moderatorButtonTextColor");
            sparseArray.put(15, "moderatorIconId");
            sparseArray.put(16, "profileImageFrameDrawable");
            sparseArray.put(17, "profileImageUrl");
            sparseArray.put(18, "registeredAt");
            sparseArray.put(19, "ribbonImageUrl");
            sparseArray.put(20, "twitterScreenName");
            sparseArray.put(21, "userId");
            sparseArray.put(22, "userName");
            sparseArray.put(23, "viewModel");
            sparseArray.put(24, "visibleApps");
            sparseArray.put(25, "visibleBio");
            sparseArray.put(26, "visibleBirthday");
            sparseArray.put(27, "visibleBlock");
            sparseArray.put(28, "visibleFollow");
            sparseArray.put(29, "visibleModeratorProfileImageDecoration");
            sparseArray.put(30, "visibleModeratorProfileImageDrawable");
            sparseArray.put(31, "visibleMutualFollowee");
            sparseArray.put(32, "visibleOthersMenu");
            sparseArray.put(33, "visibleRibbons");
            sparseArray.put(34, "visibleTwitter");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f20776a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(2);
            f20776a = hashMap;
            hashMap.put("layout/dialog_fragment_collab_matched_dialog_0", Integer.valueOf(e.dialog_fragment_collab_matched_dialog));
            hashMap.put("layout/dialog_fragment_collab_matching_setting_dialog_0", Integer.valueOf(e.dialog_fragment_collab_matching_setting_dialog));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f20774a = sparseIntArray;
        sparseIntArray.put(e.dialog_fragment_collab_matched_dialog, 1);
        sparseIntArray.put(e.dialog_fragment_collab_matching_setting_dialog, 2);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.resource.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f20775a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(androidx.databinding.e eVar, View view, int i10) {
        int i11 = f20774a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i11 == 1) {
                    if ("layout/dialog_fragment_collab_matched_dialog_0".equals(tag)) {
                        return new e9.b(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_fragment_collab_matched_dialog is invalid. Received: " + tag);
                } else if (i11 != 2) {
                    return null;
                } else {
                    if ("layout/dialog_fragment_collab_matching_setting_dialog_0".equals(tag)) {
                        return new e9.d(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_fragment_collab_matching_setting_dialog is invalid. Received: " + tag);
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f20776a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(androidx.databinding.e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20774a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
