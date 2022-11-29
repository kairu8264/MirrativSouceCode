package com.dena.mirrativ.emomo;

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
import q9.h;
import s9.b0;
import s9.b1;
import s9.d0;
import s9.d1;
import s9.f;
import s9.f0;
import s9.f1;
import s9.h0;
import s9.h1;
import s9.j;
import s9.j0;
import s9.j1;
import s9.l;
import s9.l0;
import s9.l1;
import s9.n;
import s9.n0;
import s9.n1;
import s9.p;
import s9.p0;
import s9.p1;
import s9.r;
import s9.r0;
import s9.r1;
import s9.t;
import s9.t0;
import s9.v;
import s9.v0;
import s9.x;
import s9.x0;
import s9.z;
import s9.z0;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f20798a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f20799a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(35);
            f20799a = sparseArray;
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
        public static final HashMap<String, Integer> f20800a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(35);
            f20800a = hashMap;
            hashMap.put("layout/activity_emomo_quest_game_0", Integer.valueOf(h.activity_emomo_quest_game));
            hashMap.put("layout/activity_emomo_run_0", Integer.valueOf(h.activity_emomo_run));
            hashMap.put("layout/activity_emomo_run_ranking_0", Integer.valueOf(h.activity_emomo_run_ranking));
            hashMap.put("layout/activity_gift_ranking_0", Integer.valueOf(h.activity_gift_ranking));
            hashMap.put("layout/activity_shooter_game_0", Integer.valueOf(h.activity_shooter_game));
            hashMap.put("layout/activity_shooter_ranking_0", Integer.valueOf(h.activity_shooter_ranking));
            hashMap.put("layout/dialog_emomo_run_ranking_0", Integer.valueOf(h.dialog_emomo_run_ranking));
            hashMap.put("layout/dialog_fragment_closet_confirm_destroy_0", Integer.valueOf(h.dialog_fragment_closet_confirm_destroy));
            hashMap.put("layout/dialog_fragment_closet_confirm_override_0", Integer.valueOf(h.dialog_fragment_closet_confirm_override));
            hashMap.put("layout/dialog_fragment_closet_picker_0", Integer.valueOf(h.dialog_fragment_closet_picker));
            hashMap.put("layout/dialog_fragment_closet_save_slot_picker_0", Integer.valueOf(h.dialog_fragment_closet_save_slot_picker));
            hashMap.put("layout/dialog_fragment_color_gradient_picker_0", Integer.valueOf(h.dialog_fragment_color_gradient_picker));
            hashMap.put("layout/dialog_fragment_emomo_dress_up_0", Integer.valueOf(h.dialog_fragment_emomo_dress_up));
            hashMap.put("layout/dialog_fragment_emomo_dress_up_complete_0", Integer.valueOf(h.dialog_fragment_emomo_dress_up_complete));
            hashMap.put("layout/dialog_fragment_emomo_dress_up_shop_0", Integer.valueOf(h.dialog_fragment_emomo_dress_up_shop));
            hashMap.put("layout/dialog_fragment_emomo_run_gift_gacha_open_dialog_0", Integer.valueOf(h.dialog_fragment_emomo_run_gift_gacha_open_dialog));
            hashMap.put("layout/dialog_fragment_shooter_dress_up_0", Integer.valueOf(h.dialog_fragment_shooter_dress_up));
            hashMap.put("layout/view_closet_about_this_item_0", Integer.valueOf(h.view_closet_about_this_item));
            hashMap.put("layout/view_emomo_closet_0", Integer.valueOf(h.view_emomo_closet));
            hashMap.put("layout/view_holder_closet_color_picker_0", Integer.valueOf(h.view_holder_closet_color_picker));
            hashMap.put("layout/view_holder_closet_parts_0", Integer.valueOf(h.view_holder_closet_parts));
            hashMap.put("layout/view_holder_closet_parts_space_0", Integer.valueOf(h.view_holder_closet_parts_space));
            hashMap.put("layout/view_holder_gift_ranking_expand_0", Integer.valueOf(h.view_holder_gift_ranking_expand));
            hashMap.put("layout/view_holder_gift_ranking_reward_0", Integer.valueOf(h.view_holder_gift_ranking_reward));
            hashMap.put("layout/view_holder_gift_ranking_term_0", Integer.valueOf(h.view_holder_gift_ranking_term));
            hashMap.put("layout/view_holder_gift_ranking_whole_ranking_user_0", Integer.valueOf(h.view_holder_gift_ranking_whole_ranking_user));
            hashMap.put("layout/view_holder_parts_category_0", Integer.valueOf(h.view_holder_parts_category));
            hashMap.put("layout/view_holder_shooter_closet_parts_0", Integer.valueOf(h.view_holder_shooter_closet_parts));
            hashMap.put("layout/view_holder_shooter_closet_parts_space_0", Integer.valueOf(h.view_holder_shooter_closet_parts_space));
            hashMap.put("layout/view_holder_shooter_parts_category_divider_0", Integer.valueOf(h.view_holder_shooter_parts_category_divider));
            hashMap.put("layout/view_holder_shooter_parts_category_item_0", Integer.valueOf(h.view_holder_shooter_parts_category_item));
            hashMap.put("layout/view_holder_shooter_parts_category_title_0", Integer.valueOf(h.view_holder_shooter_parts_category_title));
            hashMap.put("layout/view_parts_large_category_tab_item_0", Integer.valueOf(h.view_parts_large_category_tab_item));
            hashMap.put("layout/view_shooter_dress_up_detail_0", Integer.valueOf(h.view_shooter_dress_up_detail));
            hashMap.put("layout/view_shop_parts_0", Integer.valueOf(h.view_shop_parts));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(35);
        f20798a = sparseIntArray;
        sparseIntArray.put(h.activity_emomo_quest_game, 1);
        sparseIntArray.put(h.activity_emomo_run, 2);
        sparseIntArray.put(h.activity_emomo_run_ranking, 3);
        sparseIntArray.put(h.activity_gift_ranking, 4);
        sparseIntArray.put(h.activity_shooter_game, 5);
        sparseIntArray.put(h.activity_shooter_ranking, 6);
        sparseIntArray.put(h.dialog_emomo_run_ranking, 7);
        sparseIntArray.put(h.dialog_fragment_closet_confirm_destroy, 8);
        sparseIntArray.put(h.dialog_fragment_closet_confirm_override, 9);
        sparseIntArray.put(h.dialog_fragment_closet_picker, 10);
        sparseIntArray.put(h.dialog_fragment_closet_save_slot_picker, 11);
        sparseIntArray.put(h.dialog_fragment_color_gradient_picker, 12);
        sparseIntArray.put(h.dialog_fragment_emomo_dress_up, 13);
        sparseIntArray.put(h.dialog_fragment_emomo_dress_up_complete, 14);
        sparseIntArray.put(h.dialog_fragment_emomo_dress_up_shop, 15);
        sparseIntArray.put(h.dialog_fragment_emomo_run_gift_gacha_open_dialog, 16);
        sparseIntArray.put(h.dialog_fragment_shooter_dress_up, 17);
        sparseIntArray.put(h.view_closet_about_this_item, 18);
        sparseIntArray.put(h.view_emomo_closet, 19);
        sparseIntArray.put(h.view_holder_closet_color_picker, 20);
        sparseIntArray.put(h.view_holder_closet_parts, 21);
        sparseIntArray.put(h.view_holder_closet_parts_space, 22);
        sparseIntArray.put(h.view_holder_gift_ranking_expand, 23);
        sparseIntArray.put(h.view_holder_gift_ranking_reward, 24);
        sparseIntArray.put(h.view_holder_gift_ranking_term, 25);
        sparseIntArray.put(h.view_holder_gift_ranking_whole_ranking_user, 26);
        sparseIntArray.put(h.view_holder_parts_category, 27);
        sparseIntArray.put(h.view_holder_shooter_closet_parts, 28);
        sparseIntArray.put(h.view_holder_shooter_closet_parts_space, 29);
        sparseIntArray.put(h.view_holder_shooter_parts_category_divider, 30);
        sparseIntArray.put(h.view_holder_shooter_parts_category_item, 31);
        sparseIntArray.put(h.view_holder_shooter_parts_category_title, 32);
        sparseIntArray.put(h.view_parts_large_category_tab_item, 33);
        sparseIntArray.put(h.view_shooter_dress_up_detail, 34);
        sparseIntArray.put(h.view_shop_parts, 35);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.architecture.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.common.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.customview.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.featurecommon.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f20799a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f20798a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i11) {
                    case 1:
                        if ("layout/activity_emomo_quest_game_0".equals(tag)) {
                            return new s9.b(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_emomo_quest_game is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_emomo_run_0".equals(tag)) {
                            return new s9.d(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_emomo_run is invalid. Received: " + tag);
                    case 3:
                        if ("layout/activity_emomo_run_ranking_0".equals(tag)) {
                            return new f(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_emomo_run_ranking is invalid. Received: " + tag);
                    case 4:
                        if ("layout/activity_gift_ranking_0".equals(tag)) {
                            return new s9.h(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_gift_ranking is invalid. Received: " + tag);
                    case 5:
                        if ("layout/activity_shooter_game_0".equals(tag)) {
                            return new j(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_shooter_game is invalid. Received: " + tag);
                    case 6:
                        if ("layout/activity_shooter_ranking_0".equals(tag)) {
                            return new l(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_shooter_ranking is invalid. Received: " + tag);
                    case 7:
                        if ("layout/dialog_emomo_run_ranking_0".equals(tag)) {
                            return new n(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_emomo_run_ranking is invalid. Received: " + tag);
                    case 8:
                        if ("layout/dialog_fragment_closet_confirm_destroy_0".equals(tag)) {
                            return new p(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_closet_confirm_destroy is invalid. Received: " + tag);
                    case 9:
                        if ("layout/dialog_fragment_closet_confirm_override_0".equals(tag)) {
                            return new r(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_closet_confirm_override is invalid. Received: " + tag);
                    case 10:
                        if ("layout/dialog_fragment_closet_picker_0".equals(tag)) {
                            return new t(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_closet_picker is invalid. Received: " + tag);
                    case 11:
                        if ("layout/dialog_fragment_closet_save_slot_picker_0".equals(tag)) {
                            return new v(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_closet_save_slot_picker is invalid. Received: " + tag);
                    case 12:
                        if ("layout/dialog_fragment_color_gradient_picker_0".equals(tag)) {
                            return new x(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_color_gradient_picker is invalid. Received: " + tag);
                    case 13:
                        if ("layout/dialog_fragment_emomo_dress_up_0".equals(tag)) {
                            return new z(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_emomo_dress_up is invalid. Received: " + tag);
                    case 14:
                        if ("layout/dialog_fragment_emomo_dress_up_complete_0".equals(tag)) {
                            return new b0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_emomo_dress_up_complete is invalid. Received: " + tag);
                    case 15:
                        if ("layout/dialog_fragment_emomo_dress_up_shop_0".equals(tag)) {
                            return new d0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_emomo_dress_up_shop is invalid. Received: " + tag);
                    case 16:
                        if ("layout/dialog_fragment_emomo_run_gift_gacha_open_dialog_0".equals(tag)) {
                            return new f0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_emomo_run_gift_gacha_open_dialog is invalid. Received: " + tag);
                    case 17:
                        if ("layout/dialog_fragment_shooter_dress_up_0".equals(tag)) {
                            return new h0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_shooter_dress_up is invalid. Received: " + tag);
                    case 18:
                        if ("layout/view_closet_about_this_item_0".equals(tag)) {
                            return new j0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_closet_about_this_item is invalid. Received: " + tag);
                    case 19:
                        if ("layout/view_emomo_closet_0".equals(tag)) {
                            return new l0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_emomo_closet is invalid. Received: " + tag);
                    case 20:
                        if ("layout/view_holder_closet_color_picker_0".equals(tag)) {
                            return new n0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_closet_color_picker is invalid. Received: " + tag);
                    case 21:
                        if ("layout/view_holder_closet_parts_0".equals(tag)) {
                            return new p0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_closet_parts is invalid. Received: " + tag);
                    case 22:
                        if ("layout/view_holder_closet_parts_space_0".equals(tag)) {
                            return new r0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_closet_parts_space is invalid. Received: " + tag);
                    case 23:
                        if ("layout/view_holder_gift_ranking_expand_0".equals(tag)) {
                            return new t0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_gift_ranking_expand is invalid. Received: " + tag);
                    case 24:
                        if ("layout/view_holder_gift_ranking_reward_0".equals(tag)) {
                            return new v0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_gift_ranking_reward is invalid. Received: " + tag);
                    case 25:
                        if ("layout/view_holder_gift_ranking_term_0".equals(tag)) {
                            return new x0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_gift_ranking_term is invalid. Received: " + tag);
                    case 26:
                        if ("layout/view_holder_gift_ranking_whole_ranking_user_0".equals(tag)) {
                            return new z0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_gift_ranking_whole_ranking_user is invalid. Received: " + tag);
                    case 27:
                        if ("layout/view_holder_parts_category_0".equals(tag)) {
                            return new b1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_parts_category is invalid. Received: " + tag);
                    case 28:
                        if ("layout/view_holder_shooter_closet_parts_0".equals(tag)) {
                            return new d1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_shooter_closet_parts is invalid. Received: " + tag);
                    case 29:
                        if ("layout/view_holder_shooter_closet_parts_space_0".equals(tag)) {
                            return new f1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_shooter_closet_parts_space is invalid. Received: " + tag);
                    case 30:
                        if ("layout/view_holder_shooter_parts_category_divider_0".equals(tag)) {
                            return new h1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_shooter_parts_category_divider is invalid. Received: " + tag);
                    case 31:
                        if ("layout/view_holder_shooter_parts_category_item_0".equals(tag)) {
                            return new j1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_shooter_parts_category_item is invalid. Received: " + tag);
                    case 32:
                        if ("layout/view_holder_shooter_parts_category_title_0".equals(tag)) {
                            return new l1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_shooter_parts_category_title is invalid. Received: " + tag);
                    case 33:
                        if ("layout/view_parts_large_category_tab_item_0".equals(tag)) {
                            return new n1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_parts_large_category_tab_item is invalid. Received: " + tag);
                    case 34:
                        if ("layout/view_shooter_dress_up_detail_0".equals(tag)) {
                            return new p1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_shooter_dress_up_detail is invalid. Received: " + tag);
                    case 35:
                        if ("layout/view_shop_parts_0".equals(tag)) {
                            return new r1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_shop_parts is invalid. Received: " + tag);
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
        if (str == null || (num = b.f20800a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f20798a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
