package com.dena.mirrativ.catalog;

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
import r8.f1;
import t8.b0;
import t8.b1;
import t8.b2;
import t8.d0;
import t8.d1;
import t8.d2;
import t8.f;
import t8.f0;
import t8.f2;
import t8.h;
import t8.h0;
import t8.h1;
import t8.h2;
import t8.j;
import t8.j0;
import t8.j1;
import t8.j2;
import t8.l;
import t8.l0;
import t8.l1;
import t8.n;
import t8.n0;
import t8.n1;
import t8.p;
import t8.p0;
import t8.p1;
import t8.r;
import t8.r0;
import t8.r1;
import t8.t;
import t8.t0;
import t8.t1;
import t8.v;
import t8.v0;
import t8.v1;
import t8.x;
import t8.x0;
import t8.x1;
import t8.z;
import t8.z0;
import t8.z1;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f20386a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f20387a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(35);
            f20387a = sparseArray;
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
        public static final HashMap<String, Integer> f20388a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(44);
            f20388a = hashMap;
            hashMap.put("layout/activity_group_shot_gallery_0", Integer.valueOf(f1.activity_group_shot_gallery));
            hashMap.put("layout/activity_group_shot_gallery_detail_0", Integer.valueOf(f1.activity_group_shot_gallery_detail));
            hashMap.put("layout/activity_mission_0", Integer.valueOf(f1.activity_mission));
            hashMap.put("layout/activity_photo_campaign_post_0", Integer.valueOf(f1.activity_photo_campaign_post));
            hashMap.put("layout/activity_search_0", Integer.valueOf(f1.activity_search));
            hashMap.put("layout/dialog_fragment_search_app_0", Integer.valueOf(f1.dialog_fragment_search_app));
            hashMap.put("layout/fragment_follow_catalog_0", Integer.valueOf(f1.fragment_follow_catalog));
            hashMap.put("layout/fragment_group_shot_gallery_0", Integer.valueOf(f1.fragment_group_shot_gallery));
            hashMap.put("layout/fragment_home_catalog_0", Integer.valueOf(f1.fragment_home_catalog));
            hashMap.put("layout/fragment_live_catalog_0", Integer.valueOf(f1.fragment_live_catalog));
            hashMap.put("layout/fragment_mission_tab_0", Integer.valueOf(f1.fragment_mission_tab));
            hashMap.put("layout/fragment_search_0", Integer.valueOf(f1.fragment_search));
            hashMap.put("layout/fragment_search_app_0", Integer.valueOf(f1.fragment_search_app));
            hashMap.put("layout/fragment_search_live_0", Integer.valueOf(f1.fragment_search_live));
            hashMap.put("layout/fragment_search_user_0", Integer.valueOf(f1.fragment_search_user));
            hashMap.put("layout/tab_item_group_shot_gallery_0", Integer.valueOf(f1.tab_item_group_shot_gallery));
            hashMap.put("layout/view_app_myapp_0", Integer.valueOf(f1.view_app_myapp));
            hashMap.put("layout/view_apps_0", Integer.valueOf(f1.view_apps));
            hashMap.put("layout/view_holder_catalog_banner_0", Integer.valueOf(f1.view_holder_catalog_banner));
            hashMap.put("layout/view_holder_catalog_carousel_0", Integer.valueOf(f1.view_holder_catalog_carousel));
            hashMap.put("layout/view_holder_catalog_group_shot_0", Integer.valueOf(f1.view_holder_catalog_group_shot));
            hashMap.put("layout/view_holder_catalog_group_shot_list_0", Integer.valueOf(f1.view_holder_catalog_group_shot_list));
            hashMap.put("layout/view_holder_catalog_live_announcement_0", Integer.valueOf(f1.view_holder_catalog_live_announcement));
            hashMap.put("layout/view_holder_catalog_live_large_0", Integer.valueOf(f1.view_holder_catalog_live_large));
            hashMap.put("layout/view_holder_catalog_live_small_0", Integer.valueOf(f1.view_holder_catalog_live_small));
            hashMap.put("layout/view_holder_catalog_mirrativ_q_0", Integer.valueOf(f1.view_holder_catalog_mirrativ_q));
            hashMap.put("layout/view_holder_catalog_private_live_small_0", Integer.valueOf(f1.view_holder_catalog_private_live_small));
            hashMap.put("layout/view_holder_catalog_web_banner_0", Integer.valueOf(f1.view_holder_catalog_web_banner));
            hashMap.put("layout/view_holder_group_shot_gallery_empty_0", Integer.valueOf(f1.view_holder_group_shot_gallery_empty));
            hashMap.put("layout/view_holder_group_shot_gallery_large_0", Integer.valueOf(f1.view_holder_group_shot_gallery_large));
            hashMap.put("layout/view_holder_group_shot_gallery_small_0", Integer.valueOf(f1.view_holder_group_shot_gallery_small));
            hashMap.put("layout/view_holder_group_shot_gallery_vertical_0", Integer.valueOf(f1.view_holder_group_shot_gallery_vertical));
            hashMap.put("layout/view_holder_mission_tab_header_0", Integer.valueOf(f1.view_holder_mission_tab_header));
            hashMap.put("layout/view_holder_mission_tab_item_0", Integer.valueOf(f1.view_holder_mission_tab_item));
            hashMap.put("layout/view_holder_my_app_has_outline_0", Integer.valueOf(f1.view_holder_my_app_has_outline));
            hashMap.put("layout/view_holder_my_app_has_outline_add_0", Integer.valueOf(f1.view_holder_my_app_has_outline_add));
            hashMap.put("layout/view_holder_private_live_catalog_more_users_0", Integer.valueOf(f1.view_holder_private_live_catalog_more_users));
            hashMap.put("layout/view_holder_private_live_catalog_viewer_0", Integer.valueOf(f1.view_holder_private_live_catalog_viewer));
            hashMap.put("layout/view_holder_special_mission_0", Integer.valueOf(f1.view_holder_special_mission));
            hashMap.put("layout/view_holder_special_mission_app_0", Integer.valueOf(f1.view_holder_special_mission_app));
            hashMap.put("layout/view_live_catalog_small_streamer_0", Integer.valueOf(f1.view_live_catalog_small_streamer));
            hashMap.put("layout/view_live_game_new_balloon_0", Integer.valueOf(f1.view_live_game_new_balloon));
            hashMap.put("layout/view_live_preview_0", Integer.valueOf(f1.view_live_preview));
            hashMap.put("layout/view_mission_item_0", Integer.valueOf(f1.view_mission_item));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(44);
        f20386a = sparseIntArray;
        sparseIntArray.put(f1.activity_group_shot_gallery, 1);
        sparseIntArray.put(f1.activity_group_shot_gallery_detail, 2);
        sparseIntArray.put(f1.activity_mission, 3);
        sparseIntArray.put(f1.activity_photo_campaign_post, 4);
        sparseIntArray.put(f1.activity_search, 5);
        sparseIntArray.put(f1.dialog_fragment_search_app, 6);
        sparseIntArray.put(f1.fragment_follow_catalog, 7);
        sparseIntArray.put(f1.fragment_group_shot_gallery, 8);
        sparseIntArray.put(f1.fragment_home_catalog, 9);
        sparseIntArray.put(f1.fragment_live_catalog, 10);
        sparseIntArray.put(f1.fragment_mission_tab, 11);
        sparseIntArray.put(f1.fragment_search, 12);
        sparseIntArray.put(f1.fragment_search_app, 13);
        sparseIntArray.put(f1.fragment_search_live, 14);
        sparseIntArray.put(f1.fragment_search_user, 15);
        sparseIntArray.put(f1.tab_item_group_shot_gallery, 16);
        sparseIntArray.put(f1.view_app_myapp, 17);
        sparseIntArray.put(f1.view_apps, 18);
        sparseIntArray.put(f1.view_holder_catalog_banner, 19);
        sparseIntArray.put(f1.view_holder_catalog_carousel, 20);
        sparseIntArray.put(f1.view_holder_catalog_group_shot, 21);
        sparseIntArray.put(f1.view_holder_catalog_group_shot_list, 22);
        sparseIntArray.put(f1.view_holder_catalog_live_announcement, 23);
        sparseIntArray.put(f1.view_holder_catalog_live_large, 24);
        sparseIntArray.put(f1.view_holder_catalog_live_small, 25);
        sparseIntArray.put(f1.view_holder_catalog_mirrativ_q, 26);
        sparseIntArray.put(f1.view_holder_catalog_private_live_small, 27);
        sparseIntArray.put(f1.view_holder_catalog_web_banner, 28);
        sparseIntArray.put(f1.view_holder_group_shot_gallery_empty, 29);
        sparseIntArray.put(f1.view_holder_group_shot_gallery_large, 30);
        sparseIntArray.put(f1.view_holder_group_shot_gallery_small, 31);
        sparseIntArray.put(f1.view_holder_group_shot_gallery_vertical, 32);
        sparseIntArray.put(f1.view_holder_mission_tab_header, 33);
        sparseIntArray.put(f1.view_holder_mission_tab_item, 34);
        sparseIntArray.put(f1.view_holder_my_app_has_outline, 35);
        sparseIntArray.put(f1.view_holder_my_app_has_outline_add, 36);
        sparseIntArray.put(f1.view_holder_private_live_catalog_more_users, 37);
        sparseIntArray.put(f1.view_holder_private_live_catalog_viewer, 38);
        sparseIntArray.put(f1.view_holder_special_mission, 39);
        sparseIntArray.put(f1.view_holder_special_mission_app, 40);
        sparseIntArray.put(f1.view_live_catalog_small_streamer, 41);
        sparseIntArray.put(f1.view_live_game_new_balloon, 42);
        sparseIntArray.put(f1.view_live_preview, 43);
        sparseIntArray.put(f1.view_mission_item, 44);
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
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        arrayList.add(new com.twitter.sdk.android.core.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f20387a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f20386a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i11) {
                    case 1:
                        if ("layout/activity_group_shot_gallery_0".equals(tag)) {
                            return new t8.b(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_group_shot_gallery is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_group_shot_gallery_detail_0".equals(tag)) {
                            return new t8.d(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_group_shot_gallery_detail is invalid. Received: " + tag);
                    case 3:
                        if ("layout/activity_mission_0".equals(tag)) {
                            return new f(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_mission is invalid. Received: " + tag);
                    case 4:
                        if ("layout/activity_photo_campaign_post_0".equals(tag)) {
                            return new h(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_photo_campaign_post is invalid. Received: " + tag);
                    case 5:
                        if ("layout/activity_search_0".equals(tag)) {
                            return new j(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
                    case 6:
                        if ("layout/dialog_fragment_search_app_0".equals(tag)) {
                            return new l(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_search_app is invalid. Received: " + tag);
                    case 7:
                        if ("layout/fragment_follow_catalog_0".equals(tag)) {
                            return new n(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_follow_catalog is invalid. Received: " + tag);
                    case 8:
                        if ("layout/fragment_group_shot_gallery_0".equals(tag)) {
                            return new p(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_group_shot_gallery is invalid. Received: " + tag);
                    case 9:
                        if ("layout/fragment_home_catalog_0".equals(tag)) {
                            return new r(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_home_catalog is invalid. Received: " + tag);
                    case 10:
                        if ("layout/fragment_live_catalog_0".equals(tag)) {
                            return new t(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_live_catalog is invalid. Received: " + tag);
                    case 11:
                        if ("layout/fragment_mission_tab_0".equals(tag)) {
                            return new v(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_mission_tab is invalid. Received: " + tag);
                    case 12:
                        if ("layout/fragment_search_0".equals(tag)) {
                            return new z(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
                    case 13:
                        if ("layout/fragment_search_app_0".equals(tag)) {
                            return new x(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_search_app is invalid. Received: " + tag);
                    case 14:
                        if ("layout/fragment_search_live_0".equals(tag)) {
                            return new b0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_search_live is invalid. Received: " + tag);
                    case 15:
                        if ("layout/fragment_search_user_0".equals(tag)) {
                            return new d0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_search_user is invalid. Received: " + tag);
                    case 16:
                        if ("layout/tab_item_group_shot_gallery_0".equals(tag)) {
                            return new f0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for tab_item_group_shot_gallery is invalid. Received: " + tag);
                    case 17:
                        if ("layout/view_app_myapp_0".equals(tag)) {
                            return new h0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_app_myapp is invalid. Received: " + tag);
                    case 18:
                        if ("layout/view_apps_0".equals(tag)) {
                            return new j0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_apps is invalid. Received: " + tag);
                    case 19:
                        if ("layout/view_holder_catalog_banner_0".equals(tag)) {
                            return new l0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_banner is invalid. Received: " + tag);
                    case 20:
                        if ("layout/view_holder_catalog_carousel_0".equals(tag)) {
                            return new n0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_carousel is invalid. Received: " + tag);
                    case 21:
                        if ("layout/view_holder_catalog_group_shot_0".equals(tag)) {
                            return new p0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_group_shot is invalid. Received: " + tag);
                    case 22:
                        if ("layout/view_holder_catalog_group_shot_list_0".equals(tag)) {
                            return new r0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_group_shot_list is invalid. Received: " + tag);
                    case 23:
                        if ("layout/view_holder_catalog_live_announcement_0".equals(tag)) {
                            return new t0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_live_announcement is invalid. Received: " + tag);
                    case 24:
                        if ("layout/view_holder_catalog_live_large_0".equals(tag)) {
                            return new v0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_live_large is invalid. Received: " + tag);
                    case 25:
                        if ("layout/view_holder_catalog_live_small_0".equals(tag)) {
                            return new x0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_live_small is invalid. Received: " + tag);
                    case 26:
                        if ("layout/view_holder_catalog_mirrativ_q_0".equals(tag)) {
                            return new z0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_mirrativ_q is invalid. Received: " + tag);
                    case 27:
                        if ("layout/view_holder_catalog_private_live_small_0".equals(tag)) {
                            return new b1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_private_live_small is invalid. Received: " + tag);
                    case 28:
                        if ("layout/view_holder_catalog_web_banner_0".equals(tag)) {
                            return new d1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_catalog_web_banner is invalid. Received: " + tag);
                    case 29:
                        if ("layout/view_holder_group_shot_gallery_empty_0".equals(tag)) {
                            return new t8.f1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_group_shot_gallery_empty is invalid. Received: " + tag);
                    case 30:
                        if ("layout/view_holder_group_shot_gallery_large_0".equals(tag)) {
                            return new h1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_group_shot_gallery_large is invalid. Received: " + tag);
                    case 31:
                        if ("layout/view_holder_group_shot_gallery_small_0".equals(tag)) {
                            return new j1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_group_shot_gallery_small is invalid. Received: " + tag);
                    case 32:
                        if ("layout/view_holder_group_shot_gallery_vertical_0".equals(tag)) {
                            return new l1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_group_shot_gallery_vertical is invalid. Received: " + tag);
                    case 33:
                        if ("layout/view_holder_mission_tab_header_0".equals(tag)) {
                            return new n1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_mission_tab_header is invalid. Received: " + tag);
                    case 34:
                        if ("layout/view_holder_mission_tab_item_0".equals(tag)) {
                            return new p1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_mission_tab_item is invalid. Received: " + tag);
                    case 35:
                        if ("layout/view_holder_my_app_has_outline_0".equals(tag)) {
                            return new t1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_my_app_has_outline is invalid. Received: " + tag);
                    case 36:
                        if ("layout/view_holder_my_app_has_outline_add_0".equals(tag)) {
                            return new r1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_my_app_has_outline_add is invalid. Received: " + tag);
                    case 37:
                        if ("layout/view_holder_private_live_catalog_more_users_0".equals(tag)) {
                            return new v1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_private_live_catalog_more_users is invalid. Received: " + tag);
                    case 38:
                        if ("layout/view_holder_private_live_catalog_viewer_0".equals(tag)) {
                            return new x1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_private_live_catalog_viewer is invalid. Received: " + tag);
                    case 39:
                        if ("layout/view_holder_special_mission_0".equals(tag)) {
                            return new b2(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_special_mission is invalid. Received: " + tag);
                    case 40:
                        if ("layout/view_holder_special_mission_app_0".equals(tag)) {
                            return new z1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_special_mission_app is invalid. Received: " + tag);
                    case 41:
                        if ("layout/view_live_catalog_small_streamer_0".equals(tag)) {
                            return new d2(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_live_catalog_small_streamer is invalid. Received: " + tag);
                    case 42:
                        if ("layout/view_live_game_new_balloon_0".equals(tag)) {
                            return new f2(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_live_game_new_balloon is invalid. Received: " + tag);
                    case 43:
                        if ("layout/view_live_preview_0".equals(tag)) {
                            return new h2(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_live_preview is invalid. Received: " + tag);
                    case 44:
                        if ("layout/view_mission_item_0".equals(tag)) {
                            return new j2(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_mission_item is invalid. Received: " + tag);
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
        if (str == null || (num = b.f20388a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20386a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
