package com.dena.mirrativ.notification;

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
import qa.p;
import sa.f;
import sa.h;
import sa.j;
import sa.l;
import sa.n;
import sa.r;
import sa.t;
import sa.v;
import sa.x;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f21659a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f21660a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(35);
            f21660a = sparseArray;
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

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f21661a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(12);
            f21661a = hashMap;
            hashMap.put("layout/fragment_notice_0", Integer.valueOf(p.fragment_notice));
            hashMap.put("layout/fragment_notice_campaign_0", Integer.valueOf(p.fragment_notice_campaign));
            hashMap.put("layout/fragment_notice_campaign_page_0", Integer.valueOf(p.fragment_notice_campaign_page));
            hashMap.put("layout/fragment_notice_news_0", Integer.valueOf(p.fragment_notice_news));
            hashMap.put("layout/fragment_notice_present_box_0", Integer.valueOf(p.fragment_notice_present_box));
            hashMap.put("layout/fragment_notice_your_0", Integer.valueOf(p.fragment_notice_your));
            hashMap.put("layout/tab_item_notice_0", Integer.valueOf(p.tab_item_notice));
            hashMap.put("layout/view_holder_notice_campaign_page_detail_0", Integer.valueOf(p.view_holder_notice_campaign_page_detail));
            hashMap.put("layout/view_holder_notice_follower_0", Integer.valueOf(p.view_holder_notice_follower));
            hashMap.put("layout/view_holder_notice_news_0", Integer.valueOf(p.view_holder_notice_news));
            hashMap.put("layout/view_holder_notice_present_box_0", Integer.valueOf(p.view_holder_notice_present_box));
            hashMap.put("layout/view_holder_notice_your_0", Integer.valueOf(p.view_holder_notice_your));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        f21659a = sparseIntArray;
        sparseIntArray.put(p.fragment_notice, 1);
        sparseIntArray.put(p.fragment_notice_campaign, 2);
        sparseIntArray.put(p.fragment_notice_campaign_page, 3);
        sparseIntArray.put(p.fragment_notice_news, 4);
        sparseIntArray.put(p.fragment_notice_present_box, 5);
        sparseIntArray.put(p.fragment_notice_your, 6);
        sparseIntArray.put(p.tab_item_notice, 7);
        sparseIntArray.put(p.view_holder_notice_campaign_page_detail, 8);
        sparseIntArray.put(p.view_holder_notice_follower, 9);
        sparseIntArray.put(p.view_holder_notice_news, 10);
        sparseIntArray.put(p.view_holder_notice_present_box, 11);
        sparseIntArray.put(p.view_holder_notice_your, 12);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.architecture.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.common.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.customview.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.featurecommon.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.resource.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f21660a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f21659a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i11) {
                    case 1:
                        if ("layout/fragment_notice_0".equals(tag)) {
                            return new sa.b(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice is invalid. Received: " + tag);
                    case 2:
                        if ("layout/fragment_notice_campaign_0".equals(tag)) {
                            return new sa.d(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice_campaign is invalid. Received: " + tag);
                    case 3:
                        if ("layout/fragment_notice_campaign_page_0".equals(tag)) {
                            return new f(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice_campaign_page is invalid. Received: " + tag);
                    case 4:
                        if ("layout/fragment_notice_news_0".equals(tag)) {
                            return new h(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice_news is invalid. Received: " + tag);
                    case 5:
                        if ("layout/fragment_notice_present_box_0".equals(tag)) {
                            return new j(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice_present_box is invalid. Received: " + tag);
                    case 6:
                        if ("layout/fragment_notice_your_0".equals(tag)) {
                            return new l(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notice_your is invalid. Received: " + tag);
                    case 7:
                        if ("layout/tab_item_notice_0".equals(tag)) {
                            return new n(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for tab_item_notice is invalid. Received: " + tag);
                    case 8:
                        if ("layout/view_holder_notice_campaign_page_detail_0".equals(tag)) {
                            return new sa.p(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_notice_campaign_page_detail is invalid. Received: " + tag);
                    case 9:
                        if ("layout/view_holder_notice_follower_0".equals(tag)) {
                            return new r(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_notice_follower is invalid. Received: " + tag);
                    case 10:
                        if ("layout/view_holder_notice_news_0".equals(tag)) {
                            return new t(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_notice_news is invalid. Received: " + tag);
                    case 11:
                        if ("layout/view_holder_notice_present_box_0".equals(tag)) {
                            return new v(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_notice_present_box is invalid. Received: " + tag);
                    case 12:
                        if ("layout/view_holder_notice_your_0".equals(tag)) {
                            return new x(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_notice_your is invalid. Received: " + tag);
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f21661a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f21659a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
