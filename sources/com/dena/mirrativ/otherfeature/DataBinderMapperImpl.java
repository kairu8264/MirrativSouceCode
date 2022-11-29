package com.dena.mirrativ.otherfeature;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import com.dena.mirrorman.net.api.Referer;
import db.b0;
import db.d0;
import db.f0;
import db.h;
import db.h0;
import db.j;
import db.l;
import db.n;
import db.p;
import db.r;
import db.t;
import db.v;
import db.x;
import db.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wa.f;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f21724a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f21725a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(35);
            f21725a = sparseArray;
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
        public static final HashMap<String, Integer> f21726a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(17);
            f21726a = hashMap;
            hashMap.put("layout/activity_onboarding_0", Integer.valueOf(f.activity_onboarding));
            hashMap.put("layout/activity_reward_0", Integer.valueOf(f.activity_reward));
            hashMap.put("layout/activity_tutorial_emomo_0", Integer.valueOf(f.activity_tutorial_emomo));
            hashMap.put("layout/bottom_sheet_dialog_fragment_campaign_detail_0", Integer.valueOf(f.bottom_sheet_dialog_fragment_campaign_detail));
            hashMap.put("layout/dialog_campaign_twitter_share_0", Integer.valueOf(f.dialog_campaign_twitter_share));
            hashMap.put("layout/dialog_fragment_campaign_mission_receive_prizes_result_0", Integer.valueOf(f.dialog_fragment_campaign_mission_receive_prizes_result));
            hashMap.put("layout/fragment_make_emomo_onboarding_0", Integer.valueOf(f.fragment_make_emomo_onboarding));
            hashMap.put("layout/view_campaign_prize_0", Integer.valueOf(f.view_campaign_prize));
            hashMap.put("layout/view_holder_campaign_detail_app_user_id_edit_0", Integer.valueOf(f.view_holder_campaign_detail_app_user_id_edit));
            hashMap.put("layout/view_holder_campaign_detail_app_user_id_setting_0", Integer.valueOf(f.view_holder_campaign_detail_app_user_id_setting));
            hashMap.put("layout/view_holder_campaign_detail_broadcast_award_0", Integer.valueOf(f.view_holder_campaign_detail_broadcast_award));
            hashMap.put("layout/view_holder_campaign_detail_footer_0", Integer.valueOf(f.view_holder_campaign_detail_footer));
            hashMap.put("layout/view_holder_campaign_detail_header_0", Integer.valueOf(f.view_holder_campaign_detail_header));
            hashMap.put("layout/view_holder_campaign_detail_share_award_0", Integer.valueOf(f.view_holder_campaign_detail_share_award));
            hashMap.put("layout/view_holder_campaign_detail_view_award_0", Integer.valueOf(f.view_holder_campaign_detail_view_award));
            hashMap.put("layout/view_holder_campaign_mission_date_0", Integer.valueOf(f.view_holder_campaign_mission_date));
            hashMap.put("layout/view_holder_campaign_mission_progress_bar_0", Integer.valueOf(f.view_holder_campaign_mission_progress_bar));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(17);
        f21724a = sparseIntArray;
        sparseIntArray.put(f.activity_onboarding, 1);
        sparseIntArray.put(f.activity_reward, 2);
        sparseIntArray.put(f.activity_tutorial_emomo, 3);
        sparseIntArray.put(f.bottom_sheet_dialog_fragment_campaign_detail, 4);
        sparseIntArray.put(f.dialog_campaign_twitter_share, 5);
        sparseIntArray.put(f.dialog_fragment_campaign_mission_receive_prizes_result, 6);
        sparseIntArray.put(f.fragment_make_emomo_onboarding, 7);
        sparseIntArray.put(f.view_campaign_prize, 8);
        sparseIntArray.put(f.view_holder_campaign_detail_app_user_id_edit, 9);
        sparseIntArray.put(f.view_holder_campaign_detail_app_user_id_setting, 10);
        sparseIntArray.put(f.view_holder_campaign_detail_broadcast_award, 11);
        sparseIntArray.put(f.view_holder_campaign_detail_footer, 12);
        sparseIntArray.put(f.view_holder_campaign_detail_header, 13);
        sparseIntArray.put(f.view_holder_campaign_detail_share_award, 14);
        sparseIntArray.put(f.view_holder_campaign_detail_view_award, 15);
        sparseIntArray.put(f.view_holder_campaign_mission_date, 16);
        sparseIntArray.put(f.view_holder_campaign_mission_progress_bar, 17);
    }

    @Override // androidx.databinding.d
    public List<d> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.architecture.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.common.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.customview.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.featurecommon.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.mirrativapi.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.resource.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrativ.router.DataBinderMapperImpl());
        arrayList.add(new com.dena.mirrorman.DataBinderMapperImpl());
        arrayList.add(new com.twitter.sdk.android.core.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public String convertBrIdToString(int i10) {
        return a.f21725a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f21724a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i11) {
                    case 1:
                        if ("layout/activity_onboarding_0".equals(tag)) {
                            return new db.b(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_onboarding is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_reward_0".equals(tag)) {
                            return new db.d(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_reward is invalid. Received: " + tag);
                    case 3:
                        if ("layout/activity_tutorial_emomo_0".equals(tag)) {
                            return new db.f(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_tutorial_emomo is invalid. Received: " + tag);
                    case 4:
                        if ("layout/bottom_sheet_dialog_fragment_campaign_detail_0".equals(tag)) {
                            return new h(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_campaign_detail is invalid. Received: " + tag);
                    case 5:
                        if ("layout/dialog_campaign_twitter_share_0".equals(tag)) {
                            return new j(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_campaign_twitter_share is invalid. Received: " + tag);
                    case 6:
                        if ("layout/dialog_fragment_campaign_mission_receive_prizes_result_0".equals(tag)) {
                            return new l(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_campaign_mission_receive_prizes_result is invalid. Received: " + tag);
                    case 7:
                        if ("layout/fragment_make_emomo_onboarding_0".equals(tag)) {
                            return new n(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_make_emomo_onboarding is invalid. Received: " + tag);
                    case 8:
                        if ("layout/view_campaign_prize_0".equals(tag)) {
                            return new p(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_campaign_prize is invalid. Received: " + tag);
                    case 9:
                        if ("layout/view_holder_campaign_detail_app_user_id_edit_0".equals(tag)) {
                            return new r(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_app_user_id_edit is invalid. Received: " + tag);
                    case 10:
                        if ("layout/view_holder_campaign_detail_app_user_id_setting_0".equals(tag)) {
                            return new t(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_app_user_id_setting is invalid. Received: " + tag);
                    case 11:
                        if ("layout/view_holder_campaign_detail_broadcast_award_0".equals(tag)) {
                            return new v(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_broadcast_award is invalid. Received: " + tag);
                    case 12:
                        if ("layout/view_holder_campaign_detail_footer_0".equals(tag)) {
                            return new x(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_footer is invalid. Received: " + tag);
                    case 13:
                        if ("layout/view_holder_campaign_detail_header_0".equals(tag)) {
                            return new z(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_header is invalid. Received: " + tag);
                    case 14:
                        if ("layout/view_holder_campaign_detail_share_award_0".equals(tag)) {
                            return new b0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_share_award is invalid. Received: " + tag);
                    case 15:
                        if ("layout/view_holder_campaign_detail_view_award_0".equals(tag)) {
                            return new d0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_detail_view_award is invalid. Received: " + tag);
                    case 16:
                        if ("layout/view_holder_campaign_mission_date_0".equals(tag)) {
                            return new f0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_mission_date is invalid. Received: " + tag);
                    case 17:
                        if ("layout/view_holder_campaign_mission_progress_bar_0".equals(tag)) {
                            return new h0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_campaign_mission_progress_bar is invalid. Received: " + tag);
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
        if (str == null || (num = b.f21726a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f21724a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
