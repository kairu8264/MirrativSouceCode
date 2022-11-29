package com.dena.mirrativ.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f20168a = new SparseIntArray(0);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f20169a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(38);
            f20169a = sparseArray;
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
            sparseArray.put(11, "giftItem");
            sparseArray.put(12, "imageUrl");
            sparseArray.put(13, "moderatorButtonBg");
            sparseArray.put(14, "moderatorButtonText");
            sparseArray.put(15, "moderatorButtonTextColor");
            sparseArray.put(16, "moderatorIconId");
            sparseArray.put(17, "panel");
            sparseArray.put(18, "profileImageFrameDrawable");
            sparseArray.put(19, "profileImageUrl");
            sparseArray.put(20, "registeredAt");
            sparseArray.put(21, "ribbonImageUrl");
            sparseArray.put(22, "sectionTitle");
            sparseArray.put(23, "twitterScreenName");
            sparseArray.put(24, "userId");
            sparseArray.put(25, "userName");
            sparseArray.put(26, "viewModel");
            sparseArray.put(27, "visibleApps");
            sparseArray.put(28, "visibleBio");
            sparseArray.put(29, "visibleBirthday");
            sparseArray.put(30, "visibleBlock");
            sparseArray.put(31, "visibleFollow");
            sparseArray.put(32, "visibleModeratorProfileImageDecoration");
            sparseArray.put(33, "visibleModeratorProfileImageDrawable");
            sparseArray.put(34, "visibleMutualFollowee");
            sparseArray.put(35, "visibleOthersMenu");
            sparseArray.put(36, "visibleRibbons");
            sparseArray.put(37, "visibleTwitter");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f20170a = new HashMap<>(0);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(18);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.architecture.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.catalog.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.collab.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.common.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.customview.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.emomo.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.featurecommon.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.livegame.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.notification.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.otherfeature.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.player.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.streaming.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.user.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        arrayList.add(new com.twitter.sdk.android.core.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f20169a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        if (f20168a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f20170a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20168a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
