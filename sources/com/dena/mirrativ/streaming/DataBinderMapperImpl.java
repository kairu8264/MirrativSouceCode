package com.dena.mirrativ.streaming;

import ac.a2;
import ac.a3;
import ac.a4;
import ac.a5;
import ac.a6;
import ac.a7;
import ac.b0;
import ac.b1;
import ac.c2;
import ac.c3;
import ac.c4;
import ac.c5;
import ac.c6;
import ac.c7;
import ac.d0;
import ac.d1;
import ac.e2;
import ac.e3;
import ac.e4;
import ac.e5;
import ac.e6;
import ac.e7;
import ac.f;
import ac.f0;
import ac.f1;
import ac.g2;
import ac.g3;
import ac.g4;
import ac.g5;
import ac.g6;
import ac.g7;
import ac.h;
import ac.h0;
import ac.h1;
import ac.i2;
import ac.i3;
import ac.i4;
import ac.i5;
import ac.i6;
import ac.i7;
import ac.j;
import ac.j0;
import ac.j1;
import ac.k2;
import ac.k3;
import ac.k4;
import ac.k5;
import ac.k6;
import ac.l;
import ac.l0;
import ac.l1;
import ac.m2;
import ac.m3;
import ac.m4;
import ac.m5;
import ac.m6;
import ac.n;
import ac.n0;
import ac.n1;
import ac.o2;
import ac.o3;
import ac.o4;
import ac.o5;
import ac.o6;
import ac.p0;
import ac.p1;
import ac.q2;
import ac.q3;
import ac.q4;
import ac.q5;
import ac.q6;
import ac.r;
import ac.r0;
import ac.r1;
import ac.s2;
import ac.s3;
import ac.s4;
import ac.s5;
import ac.s6;
import ac.t;
import ac.t0;
import ac.t1;
import ac.u1;
import ac.u2;
import ac.u3;
import ac.u4;
import ac.u5;
import ac.u6;
import ac.v;
import ac.v0;
import ac.w1;
import ac.w2;
import ac.w3;
import ac.w4;
import ac.w5;
import ac.w6;
import ac.x;
import ac.x0;
import ac.y1;
import ac.y2;
import ac.y3;
import ac.y4;
import ac.y5;
import ac.y6;
import ac.z;
import ac.z0;
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
import xb.p;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f22989a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f22990a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(36);
            f22990a = sparseArray;
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
        public static final HashMap<String, Integer> f22991a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(109);
            f22991a = hashMap;
            hashMap.put("layout/activity_broadcast_result_0", Integer.valueOf(p.activity_broadcast_result));
            hashMap.put("layout/activity_live_prepare_0", Integer.valueOf(p.activity_live_prepare));
            hashMap.put("layout/activity_live_prepare_for_friend_only_0", Integer.valueOf(p.activity_live_prepare_for_friend_only));
            hashMap.put("layout/activity_stream_emomo_0", Integer.valueOf(p.activity_stream_emomo));
            hashMap.put("layout/bottom_sheet_dialog_fragment_collab_candidate_viewers_0", Integer.valueOf(p.bottom_sheet_dialog_fragment_collab_candidate_viewers));
            hashMap.put("layout/bottom_sheet_dialog_fragment_live_detail_settings_0", Integer.valueOf(p.bottom_sheet_dialog_fragment_live_detail_settings));
            hashMap.put("layout/bottom_sheet_dialog_fragment_live_main_settings_0", Integer.valueOf(p.bottom_sheet_dialog_fragment_live_main_settings));
            hashMap.put("layout/bottom_sheet_dialog_fragment_live_option_menu_0", Integer.valueOf(p.bottom_sheet_dialog_fragment_live_option_menu));
            hashMap.put("layout/dialog_collab_setting_0", Integer.valueOf(p.dialog_collab_setting));
            hashMap.put("layout/dialog_fragment_became_cheerleader_0", Integer.valueOf(p.dialog_fragment_became_cheerleader));
            hashMap.put("layout/dialog_fragment_became_cheerleader_tutorial_0", Integer.valueOf(p.dialog_fragment_became_cheerleader_tutorial));
            hashMap.put("layout/dialog_fragment_confirm_access_setting_notification_0", Integer.valueOf(p.dialog_fragment_confirm_access_setting_notification));
            hashMap.put("layout/dialog_fragment_confirm_notification_guard_0", Integer.valueOf(p.dialog_fragment_confirm_notification_guard));
            hashMap.put("layout/dialog_fragment_custom_thanks_message_0", Integer.valueOf(p.dialog_fragment_custom_thanks_message));
            hashMap.put("layout/dialog_fragment_emokara_0", Integer.valueOf(p.dialog_fragment_emokara));
            hashMap.put("layout/dialog_fragment_emokara_headset_alert_0", Integer.valueOf(p.dialog_fragment_emokara_headset_alert));
            hashMap.put("layout/dialog_fragment_emokara_setting_0", Integer.valueOf(p.dialog_fragment_emokara_setting));
            hashMap.put("layout/dialog_fragment_favorite_live_settings_0", Integer.valueOf(p.dialog_fragment_favorite_live_settings));
            hashMap.put("layout/dialog_fragment_gift_app_event_ranking_rank_up_0", Integer.valueOf(p.dialog_fragment_gift_app_event_ranking_rank_up));
            hashMap.put("layout/dialog_fragment_gift_ranking_rank_up_sender_0", Integer.valueOf(p.dialog_fragment_gift_ranking_rank_up_sender));
            hashMap.put("layout/dialog_fragment_gift_ranking_rank_up_streamer_0", Integer.valueOf(p.dialog_fragment_gift_ranking_rank_up_streamer));
            hashMap.put("layout/dialog_fragment_group_shot_count_setting_0", Integer.valueOf(p.dialog_fragment_group_shot_count_setting));
            hashMap.put("layout/dialog_fragment_group_shot_gallery_comment_input_0", Integer.valueOf(p.dialog_fragment_group_shot_gallery_comment_input));
            hashMap.put("layout/dialog_fragment_group_shot_member_setting_0", Integer.valueOf(p.dialog_fragment_group_shot_member_setting));
            hashMap.put("layout/dialog_fragment_group_shot_result_0", Integer.valueOf(p.dialog_fragment_group_shot_result));
            hashMap.put("layout/dialog_fragment_group_shot_settings_0", Integer.valueOf(p.dialog_fragment_group_shot_settings));
            hashMap.put("layout/dialog_fragment_invite_collab_0", Integer.valueOf(p.dialog_fragment_invite_collab));
            hashMap.put("layout/dialog_fragment_mutual_gift_box_result_0", Integer.valueOf(p.dialog_fragment_mutual_gift_box_result));
            hashMap.put("layout/dialog_fragment_stop_screen_share_0", Integer.valueOf(p.dialog_fragment_stop_screen_share));
            hashMap.put("layout/floating_add_moderator_result_dialog_0", Integer.valueOf(p.floating_add_moderator_result_dialog));
            hashMap.put("layout/floating_collab_connected_message_0", Integer.valueOf(p.floating_collab_connected_message));
            hashMap.put("layout/floating_collab_reject_dialog_0", Integer.valueOf(p.floating_collab_reject_dialog));
            hashMap.put("layout/floating_comment_0", Integer.valueOf(p.floating_comment));
            hashMap.put("layout/floating_confirm_moderator_dialog_0", Integer.valueOf(p.floating_confirm_moderator_dialog));
            hashMap.put("layout/floating_control_edit_0", Integer.valueOf(p.floating_control_edit));
            int i10 = p.floating_controller;
            hashMap.put("layout-land/floating_controller_0", Integer.valueOf(i10));
            hashMap.put("layout/floating_controller_0", Integer.valueOf(i10));
            hashMap.put("layout/floating_live_link_broadcasters_0", Integer.valueOf(p.floating_live_link_broadcasters));
            hashMap.put("layout/floating_ranking_focus_event_help_0", Integer.valueOf(p.floating_ranking_focus_event_help));
            hashMap.put("layout/floating_report_dialog_0", Integer.valueOf(p.floating_report_dialog));
            hashMap.put("layout/floating_setting_recycler_view_0", Integer.valueOf(p.floating_setting_recycler_view));
            hashMap.put("layout/floating_setting_tts_0", Integer.valueOf(p.floating_setting_tts));
            hashMap.put("layout/floating_status_0", Integer.valueOf(p.floating_status));
            hashMap.put("layout/floating_top_toast_message_0", Integer.valueOf(p.floating_top_toast_message));
            hashMap.put("layout/floating_tutorial_live_link_dialog_0", Integer.valueOf(p.floating_tutorial_live_link_dialog));
            hashMap.put("layout/floating_view_user_profile_0", Integer.valueOf(p.floating_view_user_profile));
            hashMap.put("layout/floating_view_user_profile_menu_0", Integer.valueOf(p.floating_view_user_profile_menu));
            hashMap.put("layout/floating_viewer_list_0", Integer.valueOf(p.floating_viewer_list));
            hashMap.put("layout/fragment_emokara_artists_tab_0", Integer.valueOf(p.fragment_emokara_artists_tab));
            hashMap.put("layout/fragment_emokara_popular_tab_0", Integer.valueOf(p.fragment_emokara_popular_tab));
            hashMap.put("layout/fragment_emokara_search_0", Integer.valueOf(p.fragment_emokara_search));
            hashMap.put("layout/fragment_emokara_song_choice_0", Integer.valueOf(p.fragment_emokara_song_choice));
            hashMap.put("layout/fragment_emokara_songs_by_artist_0", Integer.valueOf(p.fragment_emokara_songs_by_artist));
            hashMap.put("layout/fragment_emokara_songs_by_genre_0", Integer.valueOf(p.fragment_emokara_songs_by_genre));
            hashMap.put("layout/fragment_group_shot_finish_0", Integer.valueOf(p.fragment_group_shot_finish));
            hashMap.put("layout/fragment_group_shot_snap_0", Integer.valueOf(p.fragment_group_shot_snap));
            hashMap.put("layout/item_app_grid_small_0", Integer.valueOf(p.item_app_grid_small));
            hashMap.put("layout/item_emokara_artist_icon_0", Integer.valueOf(p.item_emokara_artist_icon));
            hashMap.put("layout/item_emokara_artists_0", Integer.valueOf(p.item_emokara_artists));
            hashMap.put("layout/item_emokara_genre_0", Integer.valueOf(p.item_emokara_genre));
            hashMap.put("layout/item_emokara_genres_0", Integer.valueOf(p.item_emokara_genres));
            hashMap.put("layout/item_emokara_list_0", Integer.valueOf(p.item_emokara_list));
            hashMap.put("layout/item_emokara_search_empty_0", Integer.valueOf(p.item_emokara_search_empty));
            hashMap.put("layout/item_emokara_search_history_0", Integer.valueOf(p.item_emokara_search_history));
            hashMap.put("layout/item_emokara_singer_0", Integer.valueOf(p.item_emokara_singer));
            hashMap.put("layout/item_emokara_title_0", Integer.valueOf(p.item_emokara_title));
            hashMap.put("layout/item_floating_setting_button_0", Integer.valueOf(p.item_floating_setting_button));
            hashMap.put("layout/item_floating_setting_switch_0", Integer.valueOf(p.item_floating_setting_switch));
            hashMap.put("layout/item_floating_setting_thumbnail_0", Integer.valueOf(p.item_floating_setting_thumbnail));
            hashMap.put("layout/item_live_link_broadcaster_0", Integer.valueOf(p.item_live_link_broadcaster));
            hashMap.put("layout/view_broadcast_result_badge_0", Integer.valueOf(p.view_broadcast_result_badge));
            hashMap.put("layout/view_broadcast_result_picture_0", Integer.valueOf(p.view_broadcast_result_picture));
            hashMap.put("layout/view_bulk_send_0", Integer.valueOf(p.view_bulk_send));
            hashMap.put("layout/view_collab_user_setting_0", Integer.valueOf(p.view_collab_user_setting));
            hashMap.put("layout/view_copy_and_paste_0", Integer.valueOf(p.view_copy_and_paste));
            hashMap.put("layout/view_dialog_alert_0", Integer.valueOf(p.view_dialog_alert));
            hashMap.put("layout/view_floating_collab_member_0", Integer.valueOf(p.view_floating_collab_member));
            hashMap.put("layout/view_floating_custom_message_0", Integer.valueOf(p.view_floating_custom_message));
            hashMap.put("layout/view_floating_custom_yes_no_0", Integer.valueOf(p.view_floating_custom_yes_no));
            hashMap.put("layout/view_floating_gift_0", Integer.valueOf(p.view_floating_gift));
            hashMap.put("layout/view_floating_loading_0", Integer.valueOf(p.view_floating_loading));
            hashMap.put("layout/view_floating_yes_no_with_image_0", Integer.valueOf(p.view_floating_yes_no_with_image));
            hashMap.put("layout/view_gift_nameplate_0", Integer.valueOf(p.view_gift_nameplate));
            hashMap.put("layout/view_group_shot_background_setting_0", Integer.valueOf(p.view_group_shot_background_setting));
            hashMap.put("layout/view_holder_broadcast_user_0", Integer.valueOf(p.view_holder_broadcast_user));
            hashMap.put("layout/view_holder_collab_candidate_viewer_0", Integer.valueOf(p.view_holder_collab_candidate_viewer));
            hashMap.put("layout/view_holder_current_user_gift_ranking_0", Integer.valueOf(p.view_holder_current_user_gift_ranking));
            hashMap.put("layout/view_holder_favorite_live_setting_0", Integer.valueOf(p.view_holder_favorite_live_setting));
            hashMap.put("layout/view_holder_floating_comment_collab_request_0", Integer.valueOf(p.view_holder_floating_comment_collab_request));
            hashMap.put("layout/view_holder_floating_comment_end_0", Integer.valueOf(p.view_holder_floating_comment_end));
            hashMap.put("layout/view_holder_floating_comment_gift_0", Integer.valueOf(p.view_holder_floating_comment_gift));
            hashMap.put("layout/view_holder_floating_comment_image_and_message_0", Integer.valueOf(p.view_holder_floating_comment_image_and_message));
            hashMap.put("layout/view_holder_floating_comment_live_comment_0", Integer.valueOf(p.view_holder_floating_comment_live_comment));
            hashMap.put("layout/view_holder_floating_comment_text_0", Integer.valueOf(p.view_holder_floating_comment_text));
            hashMap.put("layout/view_holder_floating_one_line_comment_collab_request_0", Integer.valueOf(p.view_holder_floating_one_line_comment_collab_request));
            hashMap.put("layout/view_holder_gift_ranking_current_user_rank_0", Integer.valueOf(p.view_holder_gift_ranking_current_user_rank));
            hashMap.put("layout/view_holder_gift_ranking_rank_up_roulette_dummy_user_0", Integer.valueOf(p.view_holder_gift_ranking_rank_up_roulette_dummy_user));
            hashMap.put("layout/view_holder_gift_ranking_rank_up_roulette_user_0", Integer.valueOf(p.view_holder_gift_ranking_rank_up_roulette_user));
            hashMap.put("layout/view_holder_group_shot_background_setting_from_gallery_0", Integer.valueOf(p.view_holder_group_shot_background_setting_from_gallery));
            hashMap.put("layout/view_holder_group_shot_background_setting_gallery_image_0", Integer.valueOf(p.view_holder_group_shot_background_setting_gallery_image));
            hashMap.put("layout/view_holder_group_shot_background_setting_image_0", Integer.valueOf(p.view_holder_group_shot_background_setting_image));
            hashMap.put("layout/view_holder_group_shot_member_0", Integer.valueOf(p.view_holder_group_shot_member));
            hashMap.put("layout/view_holder_group_shot_viewer_0", Integer.valueOf(p.view_holder_group_shot_viewer));
            hashMap.put("layout/view_holder_ranking_focus_event_0", Integer.valueOf(p.view_holder_ranking_focus_event));
            hashMap.put("layout/view_holder_stream_collab_live_gift_comment_0", Integer.valueOf(p.view_holder_stream_collab_live_gift_comment));
            hashMap.put("layout/view_holder_stream_comment_collab_end_0", Integer.valueOf(p.view_holder_stream_comment_collab_end));
            hashMap.put("layout/view_holder_stream_comment_collab_recommend_live_0", Integer.valueOf(p.view_holder_stream_comment_collab_recommend_live));
            hashMap.put("layout/view_holder_thumbnail_frame_v2_0", Integer.valueOf(p.view_holder_thumbnail_frame_v2));
            hashMap.put("layout/view_memo_broadcast_0", Integer.valueOf(p.view_memo_broadcast));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(108);
        f22989a = sparseIntArray;
        sparseIntArray.put(p.activity_broadcast_result, 1);
        sparseIntArray.put(p.activity_live_prepare, 2);
        sparseIntArray.put(p.activity_live_prepare_for_friend_only, 3);
        sparseIntArray.put(p.activity_stream_emomo, 4);
        sparseIntArray.put(p.bottom_sheet_dialog_fragment_collab_candidate_viewers, 5);
        sparseIntArray.put(p.bottom_sheet_dialog_fragment_live_detail_settings, 6);
        sparseIntArray.put(p.bottom_sheet_dialog_fragment_live_main_settings, 7);
        sparseIntArray.put(p.bottom_sheet_dialog_fragment_live_option_menu, 8);
        sparseIntArray.put(p.dialog_collab_setting, 9);
        sparseIntArray.put(p.dialog_fragment_became_cheerleader, 10);
        sparseIntArray.put(p.dialog_fragment_became_cheerleader_tutorial, 11);
        sparseIntArray.put(p.dialog_fragment_confirm_access_setting_notification, 12);
        sparseIntArray.put(p.dialog_fragment_confirm_notification_guard, 13);
        sparseIntArray.put(p.dialog_fragment_custom_thanks_message, 14);
        sparseIntArray.put(p.dialog_fragment_emokara, 15);
        sparseIntArray.put(p.dialog_fragment_emokara_headset_alert, 16);
        sparseIntArray.put(p.dialog_fragment_emokara_setting, 17);
        sparseIntArray.put(p.dialog_fragment_favorite_live_settings, 18);
        sparseIntArray.put(p.dialog_fragment_gift_app_event_ranking_rank_up, 19);
        sparseIntArray.put(p.dialog_fragment_gift_ranking_rank_up_sender, 20);
        sparseIntArray.put(p.dialog_fragment_gift_ranking_rank_up_streamer, 21);
        sparseIntArray.put(p.dialog_fragment_group_shot_count_setting, 22);
        sparseIntArray.put(p.dialog_fragment_group_shot_gallery_comment_input, 23);
        sparseIntArray.put(p.dialog_fragment_group_shot_member_setting, 24);
        sparseIntArray.put(p.dialog_fragment_group_shot_result, 25);
        sparseIntArray.put(p.dialog_fragment_group_shot_settings, 26);
        sparseIntArray.put(p.dialog_fragment_invite_collab, 27);
        sparseIntArray.put(p.dialog_fragment_mutual_gift_box_result, 28);
        sparseIntArray.put(p.dialog_fragment_stop_screen_share, 29);
        sparseIntArray.put(p.floating_add_moderator_result_dialog, 30);
        sparseIntArray.put(p.floating_collab_connected_message, 31);
        sparseIntArray.put(p.floating_collab_reject_dialog, 32);
        sparseIntArray.put(p.floating_comment, 33);
        sparseIntArray.put(p.floating_confirm_moderator_dialog, 34);
        sparseIntArray.put(p.floating_control_edit, 35);
        sparseIntArray.put(p.floating_controller, 36);
        sparseIntArray.put(p.floating_live_link_broadcasters, 37);
        sparseIntArray.put(p.floating_ranking_focus_event_help, 38);
        sparseIntArray.put(p.floating_report_dialog, 39);
        sparseIntArray.put(p.floating_setting_recycler_view, 40);
        sparseIntArray.put(p.floating_setting_tts, 41);
        sparseIntArray.put(p.floating_status, 42);
        sparseIntArray.put(p.floating_top_toast_message, 43);
        sparseIntArray.put(p.floating_tutorial_live_link_dialog, 44);
        sparseIntArray.put(p.floating_view_user_profile, 45);
        sparseIntArray.put(p.floating_view_user_profile_menu, 46);
        sparseIntArray.put(p.floating_viewer_list, 47);
        sparseIntArray.put(p.fragment_emokara_artists_tab, 48);
        sparseIntArray.put(p.fragment_emokara_popular_tab, 49);
        sparseIntArray.put(p.fragment_emokara_search, 50);
        sparseIntArray.put(p.fragment_emokara_song_choice, 51);
        sparseIntArray.put(p.fragment_emokara_songs_by_artist, 52);
        sparseIntArray.put(p.fragment_emokara_songs_by_genre, 53);
        sparseIntArray.put(p.fragment_group_shot_finish, 54);
        sparseIntArray.put(p.fragment_group_shot_snap, 55);
        sparseIntArray.put(p.item_app_grid_small, 56);
        sparseIntArray.put(p.item_emokara_artist_icon, 57);
        sparseIntArray.put(p.item_emokara_artists, 58);
        sparseIntArray.put(p.item_emokara_genre, 59);
        sparseIntArray.put(p.item_emokara_genres, 60);
        sparseIntArray.put(p.item_emokara_list, 61);
        sparseIntArray.put(p.item_emokara_search_empty, 62);
        sparseIntArray.put(p.item_emokara_search_history, 63);
        sparseIntArray.put(p.item_emokara_singer, 64);
        sparseIntArray.put(p.item_emokara_title, 65);
        sparseIntArray.put(p.item_floating_setting_button, 66);
        sparseIntArray.put(p.item_floating_setting_switch, 67);
        sparseIntArray.put(p.item_floating_setting_thumbnail, 68);
        sparseIntArray.put(p.item_live_link_broadcaster, 69);
        sparseIntArray.put(p.view_broadcast_result_badge, 70);
        sparseIntArray.put(p.view_broadcast_result_picture, 71);
        sparseIntArray.put(p.view_bulk_send, 72);
        sparseIntArray.put(p.view_collab_user_setting, 73);
        sparseIntArray.put(p.view_copy_and_paste, 74);
        sparseIntArray.put(p.view_dialog_alert, 75);
        sparseIntArray.put(p.view_floating_collab_member, 76);
        sparseIntArray.put(p.view_floating_custom_message, 77);
        sparseIntArray.put(p.view_floating_custom_yes_no, 78);
        sparseIntArray.put(p.view_floating_gift, 79);
        sparseIntArray.put(p.view_floating_loading, 80);
        sparseIntArray.put(p.view_floating_yes_no_with_image, 81);
        sparseIntArray.put(p.view_gift_nameplate, 82);
        sparseIntArray.put(p.view_group_shot_background_setting, 83);
        sparseIntArray.put(p.view_holder_broadcast_user, 84);
        sparseIntArray.put(p.view_holder_collab_candidate_viewer, 85);
        sparseIntArray.put(p.view_holder_current_user_gift_ranking, 86);
        sparseIntArray.put(p.view_holder_favorite_live_setting, 87);
        sparseIntArray.put(p.view_holder_floating_comment_collab_request, 88);
        sparseIntArray.put(p.view_holder_floating_comment_end, 89);
        sparseIntArray.put(p.view_holder_floating_comment_gift, 90);
        sparseIntArray.put(p.view_holder_floating_comment_image_and_message, 91);
        sparseIntArray.put(p.view_holder_floating_comment_live_comment, 92);
        sparseIntArray.put(p.view_holder_floating_comment_text, 93);
        sparseIntArray.put(p.view_holder_floating_one_line_comment_collab_request, 94);
        sparseIntArray.put(p.view_holder_gift_ranking_current_user_rank, 95);
        sparseIntArray.put(p.view_holder_gift_ranking_rank_up_roulette_dummy_user, 96);
        sparseIntArray.put(p.view_holder_gift_ranking_rank_up_roulette_user, 97);
        sparseIntArray.put(p.view_holder_group_shot_background_setting_from_gallery, 98);
        sparseIntArray.put(p.view_holder_group_shot_background_setting_gallery_image, 99);
        sparseIntArray.put(p.view_holder_group_shot_background_setting_image, 100);
        sparseIntArray.put(p.view_holder_group_shot_member, 101);
        sparseIntArray.put(p.view_holder_group_shot_viewer, 102);
        sparseIntArray.put(p.view_holder_ranking_focus_event, 103);
        sparseIntArray.put(p.view_holder_stream_collab_live_gift_comment, 104);
        sparseIntArray.put(p.view_holder_stream_comment_collab_end, 105);
        sparseIntArray.put(p.view_holder_stream_comment_collab_recommend_live, 106);
        sparseIntArray.put(p.view_holder_thumbnail_frame_v2, 107);
        sparseIntArray.put(p.view_memo_broadcast, 108);
    }

    public final ViewDataBinding a(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_broadcast_result_0".equals(obj)) {
                    return new ac.b(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_broadcast_result is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_live_prepare_0".equals(obj)) {
                    return new ac.d(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_live_prepare is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_live_prepare_for_friend_only_0".equals(obj)) {
                    return new f(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_live_prepare_for_friend_only is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_stream_emomo_0".equals(obj)) {
                    return new h(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_stream_emomo is invalid. Received: " + obj);
            case 5:
                if ("layout/bottom_sheet_dialog_fragment_collab_candidate_viewers_0".equals(obj)) {
                    return new j(eVar, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_collab_candidate_viewers is invalid. Received: " + obj);
            case 6:
                if ("layout/bottom_sheet_dialog_fragment_live_detail_settings_0".equals(obj)) {
                    return new l(eVar, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_live_detail_settings is invalid. Received: " + obj);
            case 7:
                if ("layout/bottom_sheet_dialog_fragment_live_main_settings_0".equals(obj)) {
                    return new n(eVar, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_live_main_settings is invalid. Received: " + obj);
            case 8:
                if ("layout/bottom_sheet_dialog_fragment_live_option_menu_0".equals(obj)) {
                    return new ac.p(eVar, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_live_option_menu is invalid. Received: " + obj);
            case 9:
                if ("layout/dialog_collab_setting_0".equals(obj)) {
                    return new r(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_collab_setting is invalid. Received: " + obj);
            case 10:
                if ("layout/dialog_fragment_became_cheerleader_0".equals(obj)) {
                    return new t(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_became_cheerleader is invalid. Received: " + obj);
            case 11:
                if ("layout/dialog_fragment_became_cheerleader_tutorial_0".equals(obj)) {
                    return new v(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_became_cheerleader_tutorial is invalid. Received: " + obj);
            case 12:
                if ("layout/dialog_fragment_confirm_access_setting_notification_0".equals(obj)) {
                    return new x(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_confirm_access_setting_notification is invalid. Received: " + obj);
            case 13:
                if ("layout/dialog_fragment_confirm_notification_guard_0".equals(obj)) {
                    return new z(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_confirm_notification_guard is invalid. Received: " + obj);
            case 14:
                if ("layout/dialog_fragment_custom_thanks_message_0".equals(obj)) {
                    return new b0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_custom_thanks_message is invalid. Received: " + obj);
            case 15:
                if ("layout/dialog_fragment_emokara_0".equals(obj)) {
                    return new d0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_emokara is invalid. Received: " + obj);
            case 16:
                if ("layout/dialog_fragment_emokara_headset_alert_0".equals(obj)) {
                    return new f0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_emokara_headset_alert is invalid. Received: " + obj);
            case 17:
                if ("layout/dialog_fragment_emokara_setting_0".equals(obj)) {
                    return new h0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_emokara_setting is invalid. Received: " + obj);
            case 18:
                if ("layout/dialog_fragment_favorite_live_settings_0".equals(obj)) {
                    return new j0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_favorite_live_settings is invalid. Received: " + obj);
            case 19:
                if ("layout/dialog_fragment_gift_app_event_ranking_rank_up_0".equals(obj)) {
                    return new l0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_gift_app_event_ranking_rank_up is invalid. Received: " + obj);
            case 20:
                if ("layout/dialog_fragment_gift_ranking_rank_up_sender_0".equals(obj)) {
                    return new n0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_gift_ranking_rank_up_sender is invalid. Received: " + obj);
            case 21:
                if ("layout/dialog_fragment_gift_ranking_rank_up_streamer_0".equals(obj)) {
                    return new p0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_gift_ranking_rank_up_streamer is invalid. Received: " + obj);
            case 22:
                if ("layout/dialog_fragment_group_shot_count_setting_0".equals(obj)) {
                    return new r0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_group_shot_count_setting is invalid. Received: " + obj);
            case 23:
                if ("layout/dialog_fragment_group_shot_gallery_comment_input_0".equals(obj)) {
                    return new t0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_group_shot_gallery_comment_input is invalid. Received: " + obj);
            case 24:
                if ("layout/dialog_fragment_group_shot_member_setting_0".equals(obj)) {
                    return new v0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_group_shot_member_setting is invalid. Received: " + obj);
            case 25:
                if ("layout/dialog_fragment_group_shot_result_0".equals(obj)) {
                    return new x0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_group_shot_result is invalid. Received: " + obj);
            case 26:
                if ("layout/dialog_fragment_group_shot_settings_0".equals(obj)) {
                    return new z0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_group_shot_settings is invalid. Received: " + obj);
            case 27:
                if ("layout/dialog_fragment_invite_collab_0".equals(obj)) {
                    return new b1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_invite_collab is invalid. Received: " + obj);
            case 28:
                if ("layout/dialog_fragment_mutual_gift_box_result_0".equals(obj)) {
                    return new d1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_mutual_gift_box_result is invalid. Received: " + obj);
            case 29:
                if ("layout/dialog_fragment_stop_screen_share_0".equals(obj)) {
                    return new f1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_stop_screen_share is invalid. Received: " + obj);
            case 30:
                if ("layout/floating_add_moderator_result_dialog_0".equals(obj)) {
                    return new h1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_add_moderator_result_dialog is invalid. Received: " + obj);
            case 31:
                if ("layout/floating_collab_connected_message_0".equals(obj)) {
                    return new j1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_collab_connected_message is invalid. Received: " + obj);
            case 32:
                if ("layout/floating_collab_reject_dialog_0".equals(obj)) {
                    return new l1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_collab_reject_dialog is invalid. Received: " + obj);
            case 33:
                if ("layout/floating_comment_0".equals(obj)) {
                    return new n1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_comment is invalid. Received: " + obj);
            case 34:
                if ("layout/floating_confirm_moderator_dialog_0".equals(obj)) {
                    return new p1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_confirm_moderator_dialog is invalid. Received: " + obj);
            case 35:
                if ("layout/floating_control_edit_0".equals(obj)) {
                    return new r1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_control_edit is invalid. Received: " + obj);
            case 36:
                if ("layout-land/floating_controller_0".equals(obj)) {
                    return new u1(eVar, view);
                }
                if ("layout/floating_controller_0".equals(obj)) {
                    return new t1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_controller is invalid. Received: " + obj);
            case 37:
                if ("layout/floating_live_link_broadcasters_0".equals(obj)) {
                    return new w1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_live_link_broadcasters is invalid. Received: " + obj);
            case 38:
                if ("layout/floating_ranking_focus_event_help_0".equals(obj)) {
                    return new y1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_ranking_focus_event_help is invalid. Received: " + obj);
            case 39:
                if ("layout/floating_report_dialog_0".equals(obj)) {
                    return new a2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_report_dialog is invalid. Received: " + obj);
            case 40:
                if ("layout/floating_setting_recycler_view_0".equals(obj)) {
                    return new c2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_setting_recycler_view is invalid. Received: " + obj);
            case 41:
                if ("layout/floating_setting_tts_0".equals(obj)) {
                    return new e2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_setting_tts is invalid. Received: " + obj);
            case 42:
                if ("layout/floating_status_0".equals(obj)) {
                    return new g2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_status is invalid. Received: " + obj);
            case 43:
                if ("layout/floating_top_toast_message_0".equals(obj)) {
                    return new i2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_top_toast_message is invalid. Received: " + obj);
            case 44:
                if ("layout/floating_tutorial_live_link_dialog_0".equals(obj)) {
                    return new k2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_tutorial_live_link_dialog is invalid. Received: " + obj);
            case 45:
                if ("layout/floating_view_user_profile_0".equals(obj)) {
                    return new m2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_view_user_profile is invalid. Received: " + obj);
            case 46:
                if ("layout/floating_view_user_profile_menu_0".equals(obj)) {
                    return new o2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_view_user_profile_menu is invalid. Received: " + obj);
            case 47:
                if ("layout/floating_viewer_list_0".equals(obj)) {
                    return new q2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for floating_viewer_list is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_emokara_artists_tab_0".equals(obj)) {
                    return new s2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_artists_tab is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_emokara_popular_tab_0".equals(obj)) {
                    return new u2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_popular_tab is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_emokara_search_0".equals(obj)) {
                    return new w2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_search is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding b(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/fragment_emokara_song_choice_0".equals(obj)) {
                    return new y2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_song_choice is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_emokara_songs_by_artist_0".equals(obj)) {
                    return new a3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_songs_by_artist is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_emokara_songs_by_genre_0".equals(obj)) {
                    return new c3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emokara_songs_by_genre is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_group_shot_finish_0".equals(obj)) {
                    return new e3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_group_shot_finish is invalid. Received: " + obj);
            case 55:
                if ("layout/fragment_group_shot_snap_0".equals(obj)) {
                    return new g3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_group_shot_snap is invalid. Received: " + obj);
            case 56:
                if ("layout/item_app_grid_small_0".equals(obj)) {
                    return new i3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_app_grid_small is invalid. Received: " + obj);
            case 57:
                if ("layout/item_emokara_artist_icon_0".equals(obj)) {
                    return new k3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_artist_icon is invalid. Received: " + obj);
            case 58:
                if ("layout/item_emokara_artists_0".equals(obj)) {
                    return new m3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_artists is invalid. Received: " + obj);
            case 59:
                if ("layout/item_emokara_genre_0".equals(obj)) {
                    return new o3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_genre is invalid. Received: " + obj);
            case 60:
                if ("layout/item_emokara_genres_0".equals(obj)) {
                    return new q3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_genres is invalid. Received: " + obj);
            case 61:
                if ("layout/item_emokara_list_0".equals(obj)) {
                    return new s3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_list is invalid. Received: " + obj);
            case 62:
                if ("layout/item_emokara_search_empty_0".equals(obj)) {
                    return new u3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_search_empty is invalid. Received: " + obj);
            case 63:
                if ("layout/item_emokara_search_history_0".equals(obj)) {
                    return new w3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_search_history is invalid. Received: " + obj);
            case 64:
                if ("layout/item_emokara_singer_0".equals(obj)) {
                    return new y3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_singer is invalid. Received: " + obj);
            case 65:
                if ("layout/item_emokara_title_0".equals(obj)) {
                    return new a4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_emokara_title is invalid. Received: " + obj);
            case 66:
                if ("layout/item_floating_setting_button_0".equals(obj)) {
                    return new c4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_floating_setting_button is invalid. Received: " + obj);
            case 67:
                if ("layout/item_floating_setting_switch_0".equals(obj)) {
                    return new e4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_floating_setting_switch is invalid. Received: " + obj);
            case 68:
                if ("layout/item_floating_setting_thumbnail_0".equals(obj)) {
                    return new g4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_floating_setting_thumbnail is invalid. Received: " + obj);
            case 69:
                if ("layout/item_live_link_broadcaster_0".equals(obj)) {
                    return new i4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_live_link_broadcaster is invalid. Received: " + obj);
            case 70:
                if ("layout/view_broadcast_result_badge_0".equals(obj)) {
                    return new k4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_broadcast_result_badge is invalid. Received: " + obj);
            case 71:
                if ("layout/view_broadcast_result_picture_0".equals(obj)) {
                    return new m4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_broadcast_result_picture is invalid. Received: " + obj);
            case 72:
                if ("layout/view_bulk_send_0".equals(obj)) {
                    return new o4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_bulk_send is invalid. Received: " + obj);
            case 73:
                if ("layout/view_collab_user_setting_0".equals(obj)) {
                    return new q4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_collab_user_setting is invalid. Received: " + obj);
            case 74:
                if ("layout/view_copy_and_paste_0".equals(obj)) {
                    return new s4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_copy_and_paste is invalid. Received: " + obj);
            case 75:
                if ("layout/view_dialog_alert_0".equals(obj)) {
                    return new u4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_dialog_alert is invalid. Received: " + obj);
            case 76:
                if ("layout/view_floating_collab_member_0".equals(obj)) {
                    return new w4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_collab_member is invalid. Received: " + obj);
            case 77:
                if ("layout/view_floating_custom_message_0".equals(obj)) {
                    return new y4(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_custom_message is invalid. Received: " + obj);
            case 78:
                if ("layout/view_floating_custom_yes_no_0".equals(obj)) {
                    return new a5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_custom_yes_no is invalid. Received: " + obj);
            case 79:
                if ("layout/view_floating_gift_0".equals(obj)) {
                    return new c5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_gift is invalid. Received: " + obj);
            case 80:
                if ("layout/view_floating_loading_0".equals(obj)) {
                    return new e5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_loading is invalid. Received: " + obj);
            case 81:
                if ("layout/view_floating_yes_no_with_image_0".equals(obj)) {
                    return new g5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_floating_yes_no_with_image is invalid. Received: " + obj);
            case 82:
                if ("layout/view_gift_nameplate_0".equals(obj)) {
                    return new i5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_gift_nameplate is invalid. Received: " + obj);
            case 83:
                if ("layout/view_group_shot_background_setting_0".equals(obj)) {
                    return new k5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_group_shot_background_setting is invalid. Received: " + obj);
            case 84:
                if ("layout/view_holder_broadcast_user_0".equals(obj)) {
                    return new m5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_broadcast_user is invalid. Received: " + obj);
            case 85:
                if ("layout/view_holder_collab_candidate_viewer_0".equals(obj)) {
                    return new o5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_collab_candidate_viewer is invalid. Received: " + obj);
            case 86:
                if ("layout/view_holder_current_user_gift_ranking_0".equals(obj)) {
                    return new q5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_current_user_gift_ranking is invalid. Received: " + obj);
            case 87:
                if ("layout/view_holder_favorite_live_setting_0".equals(obj)) {
                    return new s5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_favorite_live_setting is invalid. Received: " + obj);
            case 88:
                if ("layout/view_holder_floating_comment_collab_request_0".equals(obj)) {
                    return new u5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_collab_request is invalid. Received: " + obj);
            case 89:
                if ("layout/view_holder_floating_comment_end_0".equals(obj)) {
                    return new w5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_end is invalid. Received: " + obj);
            case 90:
                if ("layout/view_holder_floating_comment_gift_0".equals(obj)) {
                    return new y5(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_gift is invalid. Received: " + obj);
            case 91:
                if ("layout/view_holder_floating_comment_image_and_message_0".equals(obj)) {
                    return new a6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_image_and_message is invalid. Received: " + obj);
            case 92:
                if ("layout/view_holder_floating_comment_live_comment_0".equals(obj)) {
                    return new c6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_live_comment is invalid. Received: " + obj);
            case 93:
                if ("layout/view_holder_floating_comment_text_0".equals(obj)) {
                    return new e6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_comment_text is invalid. Received: " + obj);
            case 94:
                if ("layout/view_holder_floating_one_line_comment_collab_request_0".equals(obj)) {
                    return new g6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_floating_one_line_comment_collab_request is invalid. Received: " + obj);
            case 95:
                if ("layout/view_holder_gift_ranking_current_user_rank_0".equals(obj)) {
                    return new i6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_gift_ranking_current_user_rank is invalid. Received: " + obj);
            case 96:
                if ("layout/view_holder_gift_ranking_rank_up_roulette_dummy_user_0".equals(obj)) {
                    return new k6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_gift_ranking_rank_up_roulette_dummy_user is invalid. Received: " + obj);
            case 97:
                if ("layout/view_holder_gift_ranking_rank_up_roulette_user_0".equals(obj)) {
                    return new m6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_gift_ranking_rank_up_roulette_user is invalid. Received: " + obj);
            case 98:
                if ("layout/view_holder_group_shot_background_setting_from_gallery_0".equals(obj)) {
                    return new o6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_group_shot_background_setting_from_gallery is invalid. Received: " + obj);
            case 99:
                if ("layout/view_holder_group_shot_background_setting_gallery_image_0".equals(obj)) {
                    return new q6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_group_shot_background_setting_gallery_image is invalid. Received: " + obj);
            case 100:
                if ("layout/view_holder_group_shot_background_setting_image_0".equals(obj)) {
                    return new s6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_group_shot_background_setting_image is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding c(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 101:
                if ("layout/view_holder_group_shot_member_0".equals(obj)) {
                    return new u6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_group_shot_member is invalid. Received: " + obj);
            case 102:
                if ("layout/view_holder_group_shot_viewer_0".equals(obj)) {
                    return new w6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_group_shot_viewer is invalid. Received: " + obj);
            case 103:
                if ("layout/view_holder_ranking_focus_event_0".equals(obj)) {
                    return new y6(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_ranking_focus_event is invalid. Received: " + obj);
            case 104:
                if ("layout/view_holder_stream_collab_live_gift_comment_0".equals(obj)) {
                    return new a7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_stream_collab_live_gift_comment is invalid. Received: " + obj);
            case 105:
                if ("layout/view_holder_stream_comment_collab_end_0".equals(obj)) {
                    return new c7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_stream_comment_collab_end is invalid. Received: " + obj);
            case 106:
                if ("layout/view_holder_stream_comment_collab_recommend_live_0".equals(obj)) {
                    return new e7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_stream_comment_collab_recommend_live is invalid. Received: " + obj);
            case 107:
                if ("layout/view_holder_thumbnail_frame_v2_0".equals(obj)) {
                    return new g7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_thumbnail_frame_v2 is invalid. Received: " + obj);
            case 108:
                if ("layout/view_memo_broadcast_0".equals(obj)) {
                    return new i7(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_memo_broadcast is invalid. Received: " + obj);
            default:
                return null;
        }
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
        return a.f22990a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f22989a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i12 = (i11 - 1) / 50;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            return null;
                        }
                        return c(eVar, view, i11, tag);
                    }
                    return b(eVar, view, i11, tag);
                }
                return a(eVar, view, i11, tag);
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.d
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f22991a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f22989a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
