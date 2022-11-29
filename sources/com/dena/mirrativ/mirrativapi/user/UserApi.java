package com.dena.mirrativ.mirrativapi.user;

import ao.d;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import gr.c;
import gr.e;
import gr.f;
import gr.i;
import gr.o;
import gr.t;

/* loaded from: classes2.dex */
public interface UserApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String REFERER = "x-referer";

        private Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getRewardHistory$default(UserApi userApi, String str, String str2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return userApi.getRewardHistory(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRewardHistory");
        }

        public static /* synthetic */ Object getSeasonRatingStatus$default(UserApi userApi, String str, String str2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                return userApi.getSeasonRatingStatus(str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSeasonRatingStatus");
        }

        public static /* synthetic */ Object postContractKyc$default(UserApi userApi, String str, int i10, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, d dVar, int i11, Object obj) {
            if (obj == null) {
                return userApi.postContractKyc(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postContractKyc");
        }
    }

    @f("api/contract/banks")
    Object getContractBanks(@i("x-referer") String str, @t("index") int i10, d<? super ContractBanksResponse> dVar);

    @f("api/contract/kyc")
    Object getContractKyc(@i("x-referer") String str, d<? super ContractKycResponse> dVar);

    @f("api/contract/live_result")
    Object getContractLiveResult(@i("x-referer") String str, @t("live_id") String str2, d<? super ContractLiveResultResponse> dVar);

    @f("api/contract/latest_reward")
    Object getLatestReward(@i("x-referer") String str, d<? super LatestRewardResponse> dVar);

    @f("api/contract/reward_history")
    Object getRewardHistory(@i("x-referer") String str, @t("cursor") String str2, d<? super RewardHistoryResponse> dVar);

    @f("api/season_rating/live_result")
    Object getSeasonRatingLiveResult(@i("x-referer") String str, @t("live_id") String str2, d<? super SeasonRatingLiveResult> dVar);

    @f("api/season_rating/status")
    Object getSeasonRatingStatus(@i("x-referer") String str, @t("user_id") String str2, d<? super SeasonRatingStatusResponse> dVar);

    @f("api/contract/summary")
    Object getSummary(@i("x-referer") String str, d<? super ContractSummaryResponse> dVar);

    @f("api/user/tos")
    Object getTos(@i("x-referer") String str, d<? super TosResponse> dVar);

    @o("api/contract/account_status")
    Object postAccountStatus(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/chat/update_birthday")
    @e
    Object postBirthday(@i("x-referer") String str, @c("birthday") String str2, d<? super ChatConfirmationResponse> dVar);

    @o("api/chat/agree")
    @e
    Object postChatConfirmationAgreement(@i("x-referer") String str, @c("is_agreed") boolean z10, d<? super ChatConfirmationResponse> dVar);

    @o("api/contract/kyc")
    @e
    Object postContractKyc(@i("x-referer") String str, @c("type") int i10, @c("family_name") String str2, @c("given_name") String str3, @c("family_name_kana") String str4, @c("given_name_kana") String str5, @c("birthday") Integer num, @c("post_code") String str6, @c("address") String str7, @c("bank_code") String str8, @c("branch_code") String str9, @c("account_number") String str10, d<? super ContractKycResponse> dVar);

    @o("api/contract/payment_type")
    @e
    Object postContractPaymentType(@i("x-referer") String str, @c("payment_type") int i10, d<? super StatusResponse> dVar);

    @o("api/contract/contract_status")
    Object postContractStatus(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/chat/update_generation")
    @e
    Object postGeneration(@i("x-referer") String str, @c("generation") String str2, d<? super ChatConfirmationResponse> dVar);

    @o("api/contract/kyc_status")
    Object postKycStatus(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/user/tos")
    @e
    Object postTos(@i("x-referer") String str, @c("version_id") int i10, d<? super StatusResponse> dVar);

    @o("api/user/withdraw")
    Object postUserWithdraw(@i("x-referer") String str, d<? super StatusResponse> dVar);
}
