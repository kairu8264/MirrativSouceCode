package com.dena.mirrativ.player;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import com.dena.mirrorman.net.api.Referer;
import hb.x1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kb.a0;
import kb.b1;
import kb.c;
import kb.c0;
import kb.d1;
import kb.e0;
import kb.f1;
import kb.g;
import kb.g0;
import kb.h1;
import kb.i;
import kb.i0;
import kb.j1;
import kb.k;
import kb.k0;
import kb.l1;
import kb.m;
import kb.m0;
import kb.n1;
import kb.o;
import kb.o0;
import kb.p0;
import kb.p1;
import kb.q;
import kb.r0;
import kb.r1;
import kb.s;
import kb.t0;
import kb.u;
import kb.v;
import kb.v0;
import kb.x;
import kb.x0;
import kb.y;
import kb.z0;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f21943a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f21944a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(36);
            f21944a = sparseArray;
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
            sparseArray.put(16, "panel");
            sparseArray.put(17, "profileImageFrameDrawable");
            sparseArray.put(18, "profileImageUrl");
            sparseArray.put(19, "registeredAt");
            sparseArray.put(20, "ribbonImageUrl");
            sparseArray.put(21, "twitterScreenName");
            sparseArray.put(22, "userId");
            sparseArray.put(23, "userName");
            sparseArray.put(24, "viewModel");
            sparseArray.put(25, "visibleApps");
            sparseArray.put(26, "visibleBio");
            sparseArray.put(27, "visibleBirthday");
            sparseArray.put(28, "visibleBlock");
            sparseArray.put(29, "visibleFollow");
            sparseArray.put(30, "visibleModeratorProfileImageDecoration");
            sparseArray.put(31, "visibleModeratorProfileImageDrawable");
            sparseArray.put(32, "visibleMutualFollowee");
            sparseArray.put(33, "visibleOthersMenu");
            sparseArray.put(34, "visibleRibbons");
            sparseArray.put(35, "visibleTwitter");
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f21945a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(37);
            f21945a = hashMap;
            int i10 = x1.activity_archive_player;
            hashMap.put("layout-land/activity_archive_player_0", Integer.valueOf(i10));
            hashMap.put("layout/activity_archive_player_0", Integer.valueOf(i10));
            hashMap.put("layout/activity_player_0", Integer.valueOf(x1.activity_player));
            hashMap.put("layout/bottom_sheet_dialog_fragment_live_info_0", Integer.valueOf(x1.bottom_sheet_dialog_fragment_live_info));
            hashMap.put("layout/dialog_fragment_live_request_0", Integer.valueOf(x1.dialog_fragment_live_request));
            hashMap.put("layout/dialog_fragment_recommend_next_live_0", Integer.valueOf(x1.dialog_fragment_recommend_next_live));
            hashMap.put("layout/dialog_fragment_urge_follow_streamer_0", Integer.valueOf(x1.dialog_fragment_urge_follow_streamer));
            hashMap.put("layout/fragment_emomo_wipe_view_0", Integer.valueOf(x1.fragment_emomo_wipe_view));
            hashMap.put("layout/fragment_live_request_followed_user_0", Integer.valueOf(x1.fragment_live_request_followed_user));
            hashMap.put("layout/fragment_live_request_not_followed_user_0", Integer.valueOf(x1.fragment_live_request_not_followed_user));
            int i11 = x1.fragment_player_comment_gift;
            hashMap.put("layout/fragment_player_comment_gift_0", Integer.valueOf(i11));
            hashMap.put("layout-land/fragment_player_comment_gift_0", Integer.valueOf(i11));
            int i12 = x1.item_player_gift_pager;
            hashMap.put("layout/item_player_gift_pager_0", Integer.valueOf(i12));
            hashMap.put("layout-land/item_player_gift_pager_0", Integer.valueOf(i12));
            hashMap.put("layout/item_player_gift_pager_cell_0", Integer.valueOf(x1.item_player_gift_pager_cell));
            hashMap.put("layout/view_emomo_run_gifts_0", Integer.valueOf(x1.view_emomo_run_gifts));
            hashMap.put("layout/view_focused_gift_0", Integer.valueOf(x1.view_focused_gift));
            hashMap.put("layout/view_gift_notification_0", Integer.valueOf(x1.view_gift_notification));
            hashMap.put("layout/view_gift_notification_list_0", Integer.valueOf(x1.view_gift_notification_list));
            hashMap.put("layout/view_gift_panel_0", Integer.valueOf(x1.view_gift_panel));
            hashMap.put("layout/view_gift_panel_tab_0", Integer.valueOf(x1.view_gift_panel_tab));
            int i13 = x1.view_holder_giftpanel_banner;
            hashMap.put("layout-land/view_holder_giftpanel_banner_0", Integer.valueOf(i13));
            hashMap.put("layout/view_holder_giftpanel_banner_0", Integer.valueOf(i13));
            hashMap.put("layout/view_holder_giftpanel_gacha_ticket_0", Integer.valueOf(x1.view_holder_giftpanel_gacha_ticket));
            hashMap.put("layout/view_holder_giftpanel_gift_0", Integer.valueOf(x1.view_holder_giftpanel_gift));
            hashMap.put("layout/view_holder_giftpanel_space_0", Integer.valueOf(x1.view_holder_giftpanel_space));
            hashMap.put("layout/view_holder_live_info_no_app_0", Integer.valueOf(x1.view_holder_live_info_no_app));
            hashMap.put("layout/view_holder_live_info_with_app_0", Integer.valueOf(x1.view_holder_live_info_with_app));
            hashMap.put("layout/view_holder_live_viewer_0", Integer.valueOf(x1.view_holder_live_viewer));
            hashMap.put("layout/view_holder_live_viewers_info_0", Integer.valueOf(x1.view_holder_live_viewers_info));
            hashMap.put("layout/view_holder_player_gift_ranking_user_rank_0", Integer.valueOf(x1.view_holder_player_gift_ranking_user_rank));
            hashMap.put("layout/view_message_gift_0", Integer.valueOf(x1.view_message_gift));
            hashMap.put("layout/view_player_ad_app_0", Integer.valueOf(x1.view_player_ad_app));
            hashMap.put("layout/view_player_gift_0", Integer.valueOf(x1.view_player_gift));
            hashMap.put("layout/view_player_linked_live_0", Integer.valueOf(x1.view_player_linked_live));
            hashMap.put("layout/view_player_linked_live_back_0", Integer.valueOf(x1.view_player_linked_live_back));
            hashMap.put("layout/view_quiz_question_container_0", Integer.valueOf(x1.view_quiz_question_container));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(33);
        f21943a = sparseIntArray;
        sparseIntArray.put(x1.activity_archive_player, 1);
        sparseIntArray.put(x1.activity_player, 2);
        sparseIntArray.put(x1.bottom_sheet_dialog_fragment_live_info, 3);
        sparseIntArray.put(x1.dialog_fragment_live_request, 4);
        sparseIntArray.put(x1.dialog_fragment_recommend_next_live, 5);
        sparseIntArray.put(x1.dialog_fragment_urge_follow_streamer, 6);
        sparseIntArray.put(x1.fragment_emomo_wipe_view, 7);
        sparseIntArray.put(x1.fragment_live_request_followed_user, 8);
        sparseIntArray.put(x1.fragment_live_request_not_followed_user, 9);
        sparseIntArray.put(x1.fragment_player_comment_gift, 10);
        sparseIntArray.put(x1.item_player_gift_pager, 11);
        sparseIntArray.put(x1.item_player_gift_pager_cell, 12);
        sparseIntArray.put(x1.view_emomo_run_gifts, 13);
        sparseIntArray.put(x1.view_focused_gift, 14);
        sparseIntArray.put(x1.view_gift_notification, 15);
        sparseIntArray.put(x1.view_gift_notification_list, 16);
        sparseIntArray.put(x1.view_gift_panel, 17);
        sparseIntArray.put(x1.view_gift_panel_tab, 18);
        sparseIntArray.put(x1.view_holder_giftpanel_banner, 19);
        sparseIntArray.put(x1.view_holder_giftpanel_gacha_ticket, 20);
        sparseIntArray.put(x1.view_holder_giftpanel_gift, 21);
        sparseIntArray.put(x1.view_holder_giftpanel_space, 22);
        sparseIntArray.put(x1.view_holder_live_info_no_app, 23);
        sparseIntArray.put(x1.view_holder_live_info_with_app, 24);
        sparseIntArray.put(x1.view_holder_live_viewer, 25);
        sparseIntArray.put(x1.view_holder_live_viewers_info, 26);
        sparseIntArray.put(x1.view_holder_player_gift_ranking_user_rank, 27);
        sparseIntArray.put(x1.view_message_gift, 28);
        sparseIntArray.put(x1.view_player_ad_app, 29);
        sparseIntArray.put(x1.view_player_gift, 30);
        sparseIntArray.put(x1.view_player_linked_live, 31);
        sparseIntArray.put(x1.view_player_linked_live_back, 32);
        sparseIntArray.put(x1.view_quiz_question_container, 33);
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
        return a.f21944a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f21943a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i11) {
                    case 1:
                        if ("layout-land/activity_archive_player_0".equals(tag)) {
                            return new c(eVar, view);
                        }
                        if ("layout/activity_archive_player_0".equals(tag)) {
                            return new kb.b(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_archive_player is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_player_0".equals(tag)) {
                            return new kb.e(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_player is invalid. Received: " + tag);
                    case 3:
                        if ("layout/bottom_sheet_dialog_fragment_live_info_0".equals(tag)) {
                            return new g(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_live_info is invalid. Received: " + tag);
                    case 4:
                        if ("layout/dialog_fragment_live_request_0".equals(tag)) {
                            return new i(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_live_request is invalid. Received: " + tag);
                    case 5:
                        if ("layout/dialog_fragment_recommend_next_live_0".equals(tag)) {
                            return new k(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_recommend_next_live is invalid. Received: " + tag);
                    case 6:
                        if ("layout/dialog_fragment_urge_follow_streamer_0".equals(tag)) {
                            return new m(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dialog_fragment_urge_follow_streamer is invalid. Received: " + tag);
                    case 7:
                        if ("layout/fragment_emomo_wipe_view_0".equals(tag)) {
                            return new o(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_emomo_wipe_view is invalid. Received: " + tag);
                    case 8:
                        if ("layout/fragment_live_request_followed_user_0".equals(tag)) {
                            return new q(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_live_request_followed_user is invalid. Received: " + tag);
                    case 9:
                        if ("layout/fragment_live_request_not_followed_user_0".equals(tag)) {
                            return new s(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_live_request_not_followed_user is invalid. Received: " + tag);
                    case 10:
                        if ("layout/fragment_player_comment_gift_0".equals(tag)) {
                            return new u(eVar, view);
                        }
                        if ("layout-land/fragment_player_comment_gift_0".equals(tag)) {
                            return new v(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_player_comment_gift is invalid. Received: " + tag);
                    case 11:
                        if ("layout/item_player_gift_pager_0".equals(tag)) {
                            return new x(eVar, view);
                        }
                        if ("layout-land/item_player_gift_pager_0".equals(tag)) {
                            return new y(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for item_player_gift_pager is invalid. Received: " + tag);
                    case 12:
                        if ("layout/item_player_gift_pager_cell_0".equals(tag)) {
                            return new a0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for item_player_gift_pager_cell is invalid. Received: " + tag);
                    case 13:
                        if ("layout/view_emomo_run_gifts_0".equals(tag)) {
                            return new c0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_emomo_run_gifts is invalid. Received: " + tag);
                    case 14:
                        if ("layout/view_focused_gift_0".equals(tag)) {
                            return new e0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_focused_gift is invalid. Received: " + tag);
                    case 15:
                        if ("layout/view_gift_notification_0".equals(tag)) {
                            return new g0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_gift_notification is invalid. Received: " + tag);
                    case 16:
                        if ("layout/view_gift_notification_list_0".equals(tag)) {
                            return new i0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_gift_notification_list is invalid. Received: " + tag);
                    case 17:
                        if ("layout/view_gift_panel_0".equals(tag)) {
                            return new k0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_gift_panel is invalid. Received: " + tag);
                    case 18:
                        if ("layout/view_gift_panel_tab_0".equals(tag)) {
                            return new m0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_gift_panel_tab is invalid. Received: " + tag);
                    case 19:
                        if ("layout-land/view_holder_giftpanel_banner_0".equals(tag)) {
                            return new p0(eVar, view);
                        }
                        if ("layout/view_holder_giftpanel_banner_0".equals(tag)) {
                            return new o0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_giftpanel_banner is invalid. Received: " + tag);
                    case 20:
                        if ("layout/view_holder_giftpanel_gacha_ticket_0".equals(tag)) {
                            return new r0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_giftpanel_gacha_ticket is invalid. Received: " + tag);
                    case 21:
                        if ("layout/view_holder_giftpanel_gift_0".equals(tag)) {
                            return new t0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_giftpanel_gift is invalid. Received: " + tag);
                    case 22:
                        if ("layout/view_holder_giftpanel_space_0".equals(tag)) {
                            return new v0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_giftpanel_space is invalid. Received: " + tag);
                    case 23:
                        if ("layout/view_holder_live_info_no_app_0".equals(tag)) {
                            return new x0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_live_info_no_app is invalid. Received: " + tag);
                    case 24:
                        if ("layout/view_holder_live_info_with_app_0".equals(tag)) {
                            return new z0(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_live_info_with_app is invalid. Received: " + tag);
                    case 25:
                        if ("layout/view_holder_live_viewer_0".equals(tag)) {
                            return new b1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_live_viewer is invalid. Received: " + tag);
                    case 26:
                        if ("layout/view_holder_live_viewers_info_0".equals(tag)) {
                            return new d1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_live_viewers_info is invalid. Received: " + tag);
                    case 27:
                        if ("layout/view_holder_player_gift_ranking_user_rank_0".equals(tag)) {
                            return new f1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_holder_player_gift_ranking_user_rank is invalid. Received: " + tag);
                    case 28:
                        if ("layout/view_message_gift_0".equals(tag)) {
                            return new h1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_message_gift is invalid. Received: " + tag);
                    case 29:
                        if ("layout/view_player_ad_app_0".equals(tag)) {
                            return new j1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_player_ad_app is invalid. Received: " + tag);
                    case 30:
                        if ("layout/view_player_gift_0".equals(tag)) {
                            return new l1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_player_gift is invalid. Received: " + tag);
                    case 31:
                        if ("layout/view_player_linked_live_0".equals(tag)) {
                            return new p1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_player_linked_live is invalid. Received: " + tag);
                    case 32:
                        if ("layout/view_player_linked_live_back_0".equals(tag)) {
                            return new n1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_player_linked_live_back is invalid. Received: " + tag);
                    case 33:
                        if ("layout/view_quiz_question_container_0".equals(tag)) {
                            return new r1(eVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_quiz_question_container is invalid. Received: " + tag);
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
        if (str == null || (num = b.f21945a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f21943a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
