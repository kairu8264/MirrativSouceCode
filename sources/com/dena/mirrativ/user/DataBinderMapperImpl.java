package com.dena.mirrativ.user;

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
import nc.f;
import pc.b0;
import pc.b1;
import pc.b2;
import pc.b3;
import pc.d0;
import pc.d1;
import pc.d2;
import pc.d3;
import pc.f0;
import pc.f1;
import pc.f2;
import pc.f3;
import pc.h;
import pc.h0;
import pc.h1;
import pc.h2;
import pc.h3;
import pc.j;
import pc.j0;
import pc.j1;
import pc.j2;
import pc.j3;
import pc.l;
import pc.l0;
import pc.l1;
import pc.l2;
import pc.l3;
import pc.n;
import pc.n0;
import pc.n1;
import pc.n2;
import pc.n3;
import pc.p;
import pc.p0;
import pc.p1;
import pc.p2;
import pc.p3;
import pc.r;
import pc.r0;
import pc.r1;
import pc.r2;
import pc.t;
import pc.t0;
import pc.t1;
import pc.t2;
import pc.v;
import pc.v0;
import pc.v1;
import pc.v2;
import pc.x;
import pc.x0;
import pc.x1;
import pc.x2;
import pc.z;
import pc.z0;
import pc.z1;
import pc.z2;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f24076a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f24077a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(36);
            f24077a = sparseArray;
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
            sparseArray.put(20, "sectionTitle");
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
        public static final HashMap<String, Integer> f24078a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(60);
            f24078a = hashMap;
            hashMap.put("layout/activity_bank_select_0", Integer.valueOf(f.activity_bank_select));
            hashMap.put("layout/activity_contract_0", Integer.valueOf(f.activity_contract));
            hashMap.put("layout/activity_contract_detail_0", Integer.valueOf(f.activity_contract_detail));
            hashMap.put("layout/activity_contract_webview_0", Integer.valueOf(f.activity_contract_webview));
            hashMap.put("layout/activity_faq_0", Integer.valueOf(f.activity_faq));
            hashMap.put("layout/activity_home_emomo_0", Integer.valueOf(f.activity_home_emomo));
            hashMap.put("layout/activity_japan_postal_bank_caption_0", Integer.valueOf(f.activity_japan_postal_bank_caption));
            hashMap.put("layout/activity_monthly_ranking_0", Integer.valueOf(f.activity_monthly_ranking));
            hashMap.put("layout/activity_my_page_0", Integer.valueOf(f.activity_my_page));
            hashMap.put("layout/activity_profile_image_0", Integer.valueOf(f.activity_profile_image));
            hashMap.put("layout/activity_profile_user_list_0", Integer.valueOf(f.activity_profile_user_list));
            hashMap.put("layout/activity_user_profile_0", Integer.valueOf(f.activity_user_profile));
            hashMap.put("layout/activity_user_withdraw_0", Integer.valueOf(f.activity_user_withdraw));
            hashMap.put("layout/activity_web_view_with_toolbar_0", Integer.valueOf(f.activity_web_view_with_toolbar));
            hashMap.put("layout/bottom_sheet_dialog_fragment_cheers_0", Integer.valueOf(f.bottom_sheet_dialog_fragment_cheers));
            hashMap.put("layout/dialog_date_picker_0", Integer.valueOf(f.dialog_date_picker));
            hashMap.put("layout/dialog_datetime_picker_0", Integer.valueOf(f.dialog_datetime_picker));
            hashMap.put("layout/dialog_fragment_broadcast_result_exp_0", Integer.valueOf(f.dialog_fragment_broadcast_result_exp));
            hashMap.put("layout/dialog_fragment_confirm_contract_edit_identification_0", Integer.valueOf(f.dialog_fragment_confirm_contract_edit_identification));
            hashMap.put("layout/dialog_fragment_daily_given_reward_0", Integer.valueOf(f.dialog_fragment_daily_given_reward));
            hashMap.put("layout/dialog_fragment_edit_contract_identification_0", Integer.valueOf(f.dialog_fragment_edit_contract_identification));
            hashMap.put("layout/dialog_fragment_emomo_permission_0", Integer.valueOf(f.dialog_fragment_emomo_permission));
            hashMap.put("layout/dialog_fragment_holiday_purchase_0", Integer.valueOf(f.dialog_fragment_holiday_purchase));
            hashMap.put("layout/dialog_fragment_holiday_purchase_success_0", Integer.valueOf(f.dialog_fragment_holiday_purchase_success));
            hashMap.put("layout/dialog_fragment_live_announce_setting_0", Integer.valueOf(f.dialog_fragment_live_announce_setting));
            hashMap.put("layout/dialog_fragment_live_announce_setting_success_0", Integer.valueOf(f.dialog_fragment_live_announce_setting_success));
            hashMap.put("layout/dialog_fragment_new_terms_of_service_0", Integer.valueOf(f.dialog_fragment_new_terms_of_service));
            hashMap.put("layout/dialog_fragment_ranking_prize_0", Integer.valueOf(f.dialog_fragment_ranking_prize));
            hashMap.put("layout/dialog_fragment_sesason_rating_result_0", Integer.valueOf(f.dialog_fragment_sesason_rating_result));
            hashMap.put("layout/dialog_user_profile_0", Integer.valueOf(f.dialog_user_profile));
            hashMap.put("layout/fragment_bank_index_0", Integer.valueOf(f.fragment_bank_index));
            hashMap.put("layout/fragment_bank_list_0", Integer.valueOf(f.fragment_bank_list));
            hashMap.put("layout/fragment_chat_threads_0", Integer.valueOf(f.fragment_chat_threads));
            hashMap.put("layout/fragment_complete_edit_bank_account_0", Integer.valueOf(f.fragment_complete_edit_bank_account));
            hashMap.put("layout/fragment_contract_complete_0", Integer.valueOf(f.fragment_contract_complete));
            hashMap.put("layout/fragment_contract_edit_bank_account_0", Integer.valueOf(f.fragment_contract_edit_bank_account));
            hashMap.put("layout/fragment_contract_edit_identification_0", Integer.valueOf(f.fragment_contract_edit_identification));
            hashMap.put("layout/fragment_contract_register_identification_0", Integer.valueOf(f.fragment_contract_register_identification));
            hashMap.put("layout/fragment_contract_submit_identification_document_0", Integer.valueOf(f.fragment_contract_submit_identification_document));
            hashMap.put("layout/fragment_contract_terms_0", Integer.valueOf(f.fragment_contract_terms));
            hashMap.put("layout/fragment_emomo_full_screen_user_view_0", Integer.valueOf(f.fragment_emomo_full_screen_user_view));
            hashMap.put("layout/fragment_live_histories_0", Integer.valueOf(f.fragment_live_histories));
            hashMap.put("layout/fragment_my_page_0", Integer.valueOf(f.fragment_my_page));
            hashMap.put("layout/fragment_view_histories_0", Integer.valueOf(f.fragment_view_histories));
            hashMap.put("layout/view_broadcast_result_exp_rank_up_0", Integer.valueOf(f.view_broadcast_result_exp_rank_up));
            hashMap.put("layout/view_confirm_edit_bank_account_0", Integer.valueOf(f.view_confirm_edit_bank_account));
            hashMap.put("layout/view_confirm_edit_identification_0", Integer.valueOf(f.view_confirm_edit_identification));
            hashMap.put("layout/view_contract_edit_bank_account_0", Integer.valueOf(f.view_contract_edit_bank_account));
            hashMap.put("layout/view_contract_edit_caption_0", Integer.valueOf(f.view_contract_edit_caption));
            hashMap.put("layout/view_contract_edit_identification_0", Integer.valueOf(f.view_contract_edit_identification));
            hashMap.put("layout/view_contract_edit_section_0", Integer.valueOf(f.view_contract_edit_section));
            hashMap.put("layout/view_contract_step_0", Integer.valueOf(f.view_contract_step));
            hashMap.put("layout/view_holder_bank_index_0", Integer.valueOf(f.view_holder_bank_index));
            hashMap.put("layout/view_holder_my_chat_thread_0", Integer.valueOf(f.view_holder_my_chat_thread));
            hashMap.put("layout/view_holder_rank_table_0", Integer.valueOf(f.view_holder_rank_table));
            hashMap.put("layout/view_holder_select_bank_0", Integer.valueOf(f.view_holder_select_bank));
            hashMap.put("layout/view_home_emomo_operation_0", Integer.valueOf(f.view_home_emomo_operation));
            hashMap.put("layout/view_result_exp_info_0", Integer.valueOf(f.view_result_exp_info));
            hashMap.put("layout/view_season_rating_result_0", Integer.valueOf(f.view_season_rating_result));
            hashMap.put("layout/view_season_rating_start_0", Integer.valueOf(f.view_season_rating_start));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(60);
        f24076a = sparseIntArray;
        sparseIntArray.put(f.activity_bank_select, 1);
        sparseIntArray.put(f.activity_contract, 2);
        sparseIntArray.put(f.activity_contract_detail, 3);
        sparseIntArray.put(f.activity_contract_webview, 4);
        sparseIntArray.put(f.activity_faq, 5);
        sparseIntArray.put(f.activity_home_emomo, 6);
        sparseIntArray.put(f.activity_japan_postal_bank_caption, 7);
        sparseIntArray.put(f.activity_monthly_ranking, 8);
        sparseIntArray.put(f.activity_my_page, 9);
        sparseIntArray.put(f.activity_profile_image, 10);
        sparseIntArray.put(f.activity_profile_user_list, 11);
        sparseIntArray.put(f.activity_user_profile, 12);
        sparseIntArray.put(f.activity_user_withdraw, 13);
        sparseIntArray.put(f.activity_web_view_with_toolbar, 14);
        sparseIntArray.put(f.bottom_sheet_dialog_fragment_cheers, 15);
        sparseIntArray.put(f.dialog_date_picker, 16);
        sparseIntArray.put(f.dialog_datetime_picker, 17);
        sparseIntArray.put(f.dialog_fragment_broadcast_result_exp, 18);
        sparseIntArray.put(f.dialog_fragment_confirm_contract_edit_identification, 19);
        sparseIntArray.put(f.dialog_fragment_daily_given_reward, 20);
        sparseIntArray.put(f.dialog_fragment_edit_contract_identification, 21);
        sparseIntArray.put(f.dialog_fragment_emomo_permission, 22);
        sparseIntArray.put(f.dialog_fragment_holiday_purchase, 23);
        sparseIntArray.put(f.dialog_fragment_holiday_purchase_success, 24);
        sparseIntArray.put(f.dialog_fragment_live_announce_setting, 25);
        sparseIntArray.put(f.dialog_fragment_live_announce_setting_success, 26);
        sparseIntArray.put(f.dialog_fragment_new_terms_of_service, 27);
        sparseIntArray.put(f.dialog_fragment_ranking_prize, 28);
        sparseIntArray.put(f.dialog_fragment_sesason_rating_result, 29);
        sparseIntArray.put(f.dialog_user_profile, 30);
        sparseIntArray.put(f.fragment_bank_index, 31);
        sparseIntArray.put(f.fragment_bank_list, 32);
        sparseIntArray.put(f.fragment_chat_threads, 33);
        sparseIntArray.put(f.fragment_complete_edit_bank_account, 34);
        sparseIntArray.put(f.fragment_contract_complete, 35);
        sparseIntArray.put(f.fragment_contract_edit_bank_account, 36);
        sparseIntArray.put(f.fragment_contract_edit_identification, 37);
        sparseIntArray.put(f.fragment_contract_register_identification, 38);
        sparseIntArray.put(f.fragment_contract_submit_identification_document, 39);
        sparseIntArray.put(f.fragment_contract_terms, 40);
        sparseIntArray.put(f.fragment_emomo_full_screen_user_view, 41);
        sparseIntArray.put(f.fragment_live_histories, 42);
        sparseIntArray.put(f.fragment_my_page, 43);
        sparseIntArray.put(f.fragment_view_histories, 44);
        sparseIntArray.put(f.view_broadcast_result_exp_rank_up, 45);
        sparseIntArray.put(f.view_confirm_edit_bank_account, 46);
        sparseIntArray.put(f.view_confirm_edit_identification, 47);
        sparseIntArray.put(f.view_contract_edit_bank_account, 48);
        sparseIntArray.put(f.view_contract_edit_caption, 49);
        sparseIntArray.put(f.view_contract_edit_identification, 50);
        sparseIntArray.put(f.view_contract_edit_section, 51);
        sparseIntArray.put(f.view_contract_step, 52);
        sparseIntArray.put(f.view_holder_bank_index, 53);
        sparseIntArray.put(f.view_holder_my_chat_thread, 54);
        sparseIntArray.put(f.view_holder_rank_table, 55);
        sparseIntArray.put(f.view_holder_select_bank, 56);
        sparseIntArray.put(f.view_home_emomo_operation, 57);
        sparseIntArray.put(f.view_result_exp_info, 58);
        sparseIntArray.put(f.view_season_rating_result, 59);
        sparseIntArray.put(f.view_season_rating_start, 60);
    }

    public final ViewDataBinding a(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 1:
                if ("layout/activity_bank_select_0".equals(obj)) {
                    return new pc.b(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_bank_select is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_contract_0".equals(obj)) {
                    return new pc.d(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_contract is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_contract_detail_0".equals(obj)) {
                    return new pc.f(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_contract_detail is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_contract_webview_0".equals(obj)) {
                    return new h(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_contract_webview is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_faq_0".equals(obj)) {
                    return new j(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_faq is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_home_emomo_0".equals(obj)) {
                    return new l(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_home_emomo is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_japan_postal_bank_caption_0".equals(obj)) {
                    return new n(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_japan_postal_bank_caption is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_monthly_ranking_0".equals(obj)) {
                    return new p(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_monthly_ranking is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_my_page_0".equals(obj)) {
                    return new r(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_my_page is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_profile_image_0".equals(obj)) {
                    return new t(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_image is invalid. Received: " + obj);
            case 11:
                if ("layout/activity_profile_user_list_0".equals(obj)) {
                    return new v(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_profile_user_list is invalid. Received: " + obj);
            case 12:
                if ("layout/activity_user_profile_0".equals(obj)) {
                    return new x(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_user_profile is invalid. Received: " + obj);
            case 13:
                if ("layout/activity_user_withdraw_0".equals(obj)) {
                    return new z(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_user_withdraw is invalid. Received: " + obj);
            case 14:
                if ("layout/activity_web_view_with_toolbar_0".equals(obj)) {
                    return new b0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for activity_web_view_with_toolbar is invalid. Received: " + obj);
            case 15:
                if ("layout/bottom_sheet_dialog_fragment_cheers_0".equals(obj)) {
                    return new d0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_dialog_fragment_cheers is invalid. Received: " + obj);
            case 16:
                if ("layout/dialog_date_picker_0".equals(obj)) {
                    return new f0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_date_picker is invalid. Received: " + obj);
            case 17:
                if ("layout/dialog_datetime_picker_0".equals(obj)) {
                    return new h0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_datetime_picker is invalid. Received: " + obj);
            case 18:
                if ("layout/dialog_fragment_broadcast_result_exp_0".equals(obj)) {
                    return new j0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_broadcast_result_exp is invalid. Received: " + obj);
            case 19:
                if ("layout/dialog_fragment_confirm_contract_edit_identification_0".equals(obj)) {
                    return new l0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_confirm_contract_edit_identification is invalid. Received: " + obj);
            case 20:
                if ("layout/dialog_fragment_daily_given_reward_0".equals(obj)) {
                    return new n0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_daily_given_reward is invalid. Received: " + obj);
            case 21:
                if ("layout/dialog_fragment_edit_contract_identification_0".equals(obj)) {
                    return new p0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_edit_contract_identification is invalid. Received: " + obj);
            case 22:
                if ("layout/dialog_fragment_emomo_permission_0".equals(obj)) {
                    return new r0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_emomo_permission is invalid. Received: " + obj);
            case 23:
                if ("layout/dialog_fragment_holiday_purchase_0".equals(obj)) {
                    return new t0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_holiday_purchase is invalid. Received: " + obj);
            case 24:
                if ("layout/dialog_fragment_holiday_purchase_success_0".equals(obj)) {
                    return new v0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_holiday_purchase_success is invalid. Received: " + obj);
            case 25:
                if ("layout/dialog_fragment_live_announce_setting_0".equals(obj)) {
                    return new x0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_live_announce_setting is invalid. Received: " + obj);
            case 26:
                if ("layout/dialog_fragment_live_announce_setting_success_0".equals(obj)) {
                    return new z0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_live_announce_setting_success is invalid. Received: " + obj);
            case 27:
                if ("layout/dialog_fragment_new_terms_of_service_0".equals(obj)) {
                    return new b1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_new_terms_of_service is invalid. Received: " + obj);
            case 28:
                if ("layout/dialog_fragment_ranking_prize_0".equals(obj)) {
                    return new d1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_ranking_prize is invalid. Received: " + obj);
            case 29:
                if ("layout/dialog_fragment_sesason_rating_result_0".equals(obj)) {
                    return new f1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_fragment_sesason_rating_result is invalid. Received: " + obj);
            case 30:
                if ("layout/dialog_user_profile_0".equals(obj)) {
                    return new h1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_user_profile is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_bank_index_0".equals(obj)) {
                    return new j1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bank_index is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_bank_list_0".equals(obj)) {
                    return new l1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bank_list is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_chat_threads_0".equals(obj)) {
                    return new n1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_chat_threads is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_complete_edit_bank_account_0".equals(obj)) {
                    return new p1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_complete_edit_bank_account is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_contract_complete_0".equals(obj)) {
                    return new r1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_complete is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_contract_edit_bank_account_0".equals(obj)) {
                    return new t1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_edit_bank_account is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_contract_edit_identification_0".equals(obj)) {
                    return new v1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_edit_identification is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_contract_register_identification_0".equals(obj)) {
                    return new x1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_register_identification is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_contract_submit_identification_document_0".equals(obj)) {
                    return new z1(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_submit_identification_document is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_contract_terms_0".equals(obj)) {
                    return new b2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contract_terms is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_emomo_full_screen_user_view_0".equals(obj)) {
                    return new d2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_emomo_full_screen_user_view is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_live_histories_0".equals(obj)) {
                    return new f2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_live_histories is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_my_page_0".equals(obj)) {
                    return new h2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_my_page is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_view_histories_0".equals(obj)) {
                    return new j2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_view_histories is invalid. Received: " + obj);
            case 45:
                if ("layout/view_broadcast_result_exp_rank_up_0".equals(obj)) {
                    return new l2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_broadcast_result_exp_rank_up is invalid. Received: " + obj);
            case 46:
                if ("layout/view_confirm_edit_bank_account_0".equals(obj)) {
                    return new n2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_confirm_edit_bank_account is invalid. Received: " + obj);
            case 47:
                if ("layout/view_confirm_edit_identification_0".equals(obj)) {
                    return new p2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_confirm_edit_identification is invalid. Received: " + obj);
            case 48:
                if ("layout/view_contract_edit_bank_account_0".equals(obj)) {
                    return new r2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_edit_bank_account is invalid. Received: " + obj);
            case 49:
                if ("layout/view_contract_edit_caption_0".equals(obj)) {
                    return new t2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_edit_caption is invalid. Received: " + obj);
            case 50:
                if ("layout/view_contract_edit_identification_0".equals(obj)) {
                    return new v2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_edit_identification is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding b(e eVar, View view, int i10, Object obj) {
        switch (i10) {
            case 51:
                if ("layout/view_contract_edit_section_0".equals(obj)) {
                    return new x2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_edit_section is invalid. Received: " + obj);
            case 52:
                if ("layout/view_contract_step_0".equals(obj)) {
                    return new z2(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_step is invalid. Received: " + obj);
            case 53:
                if ("layout/view_holder_bank_index_0".equals(obj)) {
                    return new b3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_bank_index is invalid. Received: " + obj);
            case 54:
                if ("layout/view_holder_my_chat_thread_0".equals(obj)) {
                    return new d3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_my_chat_thread is invalid. Received: " + obj);
            case 55:
                if ("layout/view_holder_rank_table_0".equals(obj)) {
                    return new f3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_rank_table is invalid. Received: " + obj);
            case 56:
                if ("layout/view_holder_select_bank_0".equals(obj)) {
                    return new h3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_holder_select_bank is invalid. Received: " + obj);
            case 57:
                if ("layout/view_home_emomo_operation_0".equals(obj)) {
                    return new j3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_home_emomo_operation is invalid. Received: " + obj);
            case 58:
                if ("layout/view_result_exp_info_0".equals(obj)) {
                    return new l3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_result_exp_info is invalid. Received: " + obj);
            case 59:
                if ("layout/view_season_rating_result_0".equals(obj)) {
                    return new n3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_season_rating_result is invalid. Received: " + obj);
            case 60:
                if ("layout/view_season_rating_start_0".equals(obj)) {
                    return new p3(eVar, view);
                }
                throw new IllegalArgumentException("The tag for view_season_rating_start is invalid. Received: " + obj);
            default:
                return null;
        }
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
        return a.f24077a.get(i10);
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View view, int i10) {
        int i11 = f24076a.get(i10);
        if (i11 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i12 = (i11 - 1) / 50;
                if (i12 != 0) {
                    if (i12 != 1) {
                        return null;
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
        if (str == null || (num = b.f24078a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.d
    public ViewDataBinding getDataBinder(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f24076a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
