package p8;

import ab.e;
import ab.h;
import ad.f0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import ba.j;
import cc.u;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryActivity;
import com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity;
import com.dena.mirrativ.catalog.mission.MissionActivity;
import com.dena.mirrativ.catalog.search.SearchActivity;
import com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity;
import com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingActivity;
import com.dena.mirrativ.emomo.giftranking.GiftRankingActivity;
import com.dena.mirrativ.emomo.run.EmomoRunRankingActivity;
import com.dena.mirrativ.emomo.shooter.ShooterGameActivity;
import com.dena.mirrativ.emomo.shooter.ShooterRankingActivity;
import com.dena.mirrativ.livegame.LiveGameActivity;
import com.dena.mirrativ.livegame.detail.LiveGameDetailActivity;
import com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingActivity;
import com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity;
import com.dena.mirrativ.livegame.webview.TransparentLiveGameWebViewActivity;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameListItem;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrativ.otherfeature.cropimage.CropImageActivity;
import com.dena.mirrativ.otherfeature.onboarding.OnboardingActivity;
import com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity;
import com.dena.mirrativ.otherfeature.reward.RewardActivity;
import com.dena.mirrativ.player.PlayerActivity;
import com.dena.mirrativ.player.afterplay.AfterPlayActivity;
import com.dena.mirrativ.player.archive.ArchivePlayerActivity;
import com.dena.mirrativ.player.archive.ArchivePlayerService;
import com.dena.mirrativ.streaming.emomo.StreamEmomoActivity;
import com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity;
import com.dena.mirrativ.streaming.result.BroadcastResultActivity;
import com.dena.mirrativ.user.common.ProfileImageActivity;
import com.dena.mirrativ.user.common.ProfileUserListActivity;
import com.dena.mirrativ.user.emomo.HomeEmomoActivity;
import com.dena.mirrativ.user.mypage.FaqActivity;
import com.dena.mirrativ.user.mypage.MyPageActivity;
import com.dena.mirrativ.user.mypage.chat.ChatPageActivity;
import com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity;
import com.dena.mirrativ.user.mypage.contract.ContractActivity;
import com.dena.mirrativ.user.mypage.contract.WebViewWithToolbarActivity;
import com.dena.mirrativ.user.mypage.contract.monthlyranking.MonthlyRankingActivity;
import com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookActivity;
import com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookActivity;
import com.dena.mirrativ.user.mypage.setting.SettingActivity;
import com.dena.mirrativ.user.mypage.setting.SettingRootActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.ControlReceiver;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.fragment.EmomoGameViewFragment;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import com.dena.mirrorman.net.api.response.MutualGiftReward;
import com.dena.mirrorman.net.api.response.MutualGiftUser;
import com.dena.mirrorman.net.api.response.user.OnboardingLiveGame;
import ge.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import kc.i;
import ld.m;
import ma.d;
import md.c1;
import r8.w0;
import r9.f;
import r9.i2;
import r9.n1;
import r9.p1;
import r9.v;
import r9.w;
import rc.q;
import rc.z1;
import tb.c;
import ub.b;
import xn.t;
import ya.k;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final ServerConfig f46218a;

    public a(ServerConfig serverConfig) {
        p.h(serverConfig, "serverConfig");
        this.f46218a = serverConfig;
    }

    @Override // tb.c
    public Intent A(Context context, ub.a aVar) {
        p.h(context, "context");
        p.h(aVar, "transition");
        return ContractActivity.V.c(context, aVar);
    }

    @Override // tb.c
    public tb.a A0(Context context, b bVar) {
        p.h(context, "context");
        p.h(bVar, "data");
        return new tb.a(z1.Q0.a(bVar), "NewTermsOfServiceDialogFragment");
    }

    @Override // tb.c
    public tb.a B(String str, String str2, boolean z10) {
        p.h(str, "token");
        p.h(str2, "secretToken");
        return new tb.a(m.S0.a(str, str2, z10), "HandoverCodeConfirmDialog");
    }

    @Override // tb.c
    public Intent B0(Context context, int i10, String str) {
        p.h(context, "context");
        p.h(str, "referer");
        return EmomoRunRankingActivity.f21175c0.a(context, i10, str);
    }

    @Override // tb.c
    public tb.a C(String str) {
        p.h(str, "referer");
        return new tb.a(e.S0.a(str), "CoinPurchaseDialog");
    }

    @Override // tb.c
    public Intent C0(Context context) {
        p.h(context, "context");
        return CoinPassbookActivity.R.a(context);
    }

    @Override // tb.c
    public Intent D(Context context) {
        p.h(context, "context");
        return LiveGameActivity.R.a(context);
    }

    @Override // tb.c
    public tb.a D0() {
        return new tb.a(w.R0.a(), "ClosetSaveSlotPickerDialog");
    }

    @Override // tb.c
    public Intent E(Context context, int i10, Integer num, String str) {
        p.h(context, "context");
        p.h(str, "referer");
        return GiftRankingActivity.f20989j0.a(context, i10, num, str);
    }

    @Override // tb.c
    public tb.a F(String str) {
        p.h(str, "referer");
        return new tb.a(zc.a.Q0.a(str), "ChatConfirmationRequestDialog");
    }

    @Override // tb.c
    public Intent G(Context context, String str) {
        p.h(context, "context");
        p.h(str, "url");
        return ContractActivity.a.e(ContractActivity.V, context, str, false, 4, null);
    }

    @Override // tb.c
    public tb.a H(String str, String str2) {
        p.h(str, "referer");
        p.h(str2, "liveGameId");
        return new tb.a(d.R0.a(str, str2), "DIALOG_TAG_SEASON_RATING_RESULT");
    }

    @Override // tb.c
    public Intent I(Context context, String str, int i10) {
        p.h(context, "context");
        p.h(str, "userId");
        return ProfileUserListActivity.f24079g0.b(context, str, i10);
    }

    @Override // tb.c
    public Intent J(Context context, int i10, Integer num, String str) {
        p.h(context, "context");
        p.h(str, "referer");
        return ShooterRankingActivity.f21348h0.a(context, i10, num, str);
    }

    @Override // tb.c
    public Intent K(Context context, boolean z10, boolean z11, boolean z12) {
        p.h(context, "context");
        return TutorialEmomoActivity.f21813m0.a(context, z10, z11, z12);
    }

    @Override // tb.c
    public tb.a L(String str) {
        p.h(str, "referer");
        return new tb.a(xc.d.R0.a(str), "ChatConfirmationDatePickerDialog");
    }

    @Override // tb.c
    public Intent M(Context context, boolean z10, String str, String str2) {
        p.h(context, "context");
        return GroupShotGalleryActivity.Y.a(context, z10, str, str2);
    }

    @Override // tb.c
    public Intent N(Context context, String str, int i10, boolean z10) {
        p.h(context, "context");
        p.h(str, "prevReferer");
        return EmomoQuestRankingActivity.U.a(context, str, i10, z10);
    }

    @Override // tb.c
    public tb.a O(boolean z10) {
        return new tb.a(f.P0.a(z10), "ClosetConfirmDestroyDialog");
    }

    @Override // tb.c
    public tb.b P(boolean z10) {
        return new tb.b(StreamEmomoCommentFragment.B0.a(z10), "StreamEmomoCommentFragment");
    }

    @Override // tb.c
    public Intent Q(Context context, String str, String str2) {
        p.h(context, "context");
        p.h(str2, "playId");
        return EmomoQuestGameActivity.f20812l0.a(context, str, str2);
    }

    @Override // tb.c
    public tb.b R() {
        return new tb.b(EmomoGameViewFragment.f26056y0.a(), "EmomoGameViewFragment");
    }

    @Override // tb.c
    public Intent S(Context context, String str) {
        p.h(context, "context");
        p.h(str, "profileImageUrl");
        return ProfileImageActivity.O.a(context, str);
    }

    @Override // tb.c
    public tb.a T(String str, Integer num, boolean z10) {
        p.h(str, "referer");
        return new tb.a(n1.f50260o1.a(str, num, z10), "EmomoDressUpDialog");
    }

    @Override // tb.c
    public tb.a U(Parcelable parcelable, String str) {
        p.h(parcelable, "liveResult");
        p.h(str, "liveId");
        return new tb.a(f0.V0.a((SeasonRatingLiveResult) parcelable, str), "BroadcastResultExpDialogFragment");
    }

    @Override // tb.c
    public Intent V(Context context) {
        p.h(context, "context");
        Intent intent = new Intent(context, ControlReceiver.class);
        intent.setAction("cast_control");
        return intent;
    }

    @Override // tb.c
    public tb.a W(String str, String str2, String str3, boolean z10, boolean z11) {
        p.h(str, "streamerId");
        p.h(str2, "userId");
        p.h(str3, "referer");
        return new tb.a(c1.f40866b1.b(str2, str3, z10, z11, str), "UserProfileDialog");
    }

    @Override // tb.c
    public Intent X(Context context, String str, int i10) {
        p.h(context, "context");
        p.h(str, "referer");
        return RewardActivity.Z.a(context, str, i10);
    }

    @Override // tb.c
    public Intent Y(Context context, Parcelable parcelable) {
        p.h(context, "context");
        return OnboardingActivity.f21737e0.a(context, parcelable instanceof OnboardingLiveGame ? (OnboardingLiveGame) parcelable : null);
    }

    @Override // tb.c
    public Intent Z(Context context, Integer num, boolean z10, boolean z11) {
        p.h(context, "context");
        return HomeEmomoActivity.f24154o0.a(context, num, z10, z11);
    }

    @Override // tb.c
    public tb.b a(String str, String str2, wb.a aVar) {
        p.h(str, "actionId");
        p.h(str2, "referer");
        p.h(aVar, "getLiveCatalogParameters");
        return new tb.b(w0.P0.a(str, str2, aVar), "LiveCatalogFragment");
    }

    @Override // tb.c
    public Intent a0(Context context, boolean z10, boolean z11, int i10, int i11, int i12, String str, String str2) {
        p.h(context, "context");
        p.h(str, "stageId");
        return ShooterGameActivity.f21208h0.a(context, z10, z11, i10, i11, i12, str, str2);
    }

    @Override // tb.c
    public tb.a b() {
        return new tb.a(h.N0.a(), "CoinPurchaseErrorDialog");
    }

    @Override // tb.c
    public Intent b0(Context context) {
        p.h(context, "context");
        return ArchivePlayerService.L.a(context);
    }

    @Override // tb.c
    public tb.a c() {
        return new tb.a(v.W0.a(), "ClosetPickerDialog");
    }

    @Override // tb.c
    public tb.a c0(boolean z10) {
        return new tb.a(r9.f0.P0.a(z10), "EmomoDressUpCompleteDialog");
    }

    @Override // tb.c
    public Intent d(Context context, String str, Serializable serializable, boolean z10, boolean z11) {
        p.h(context, "context");
        p.h(str, "liveId");
        return BroadcastResultActivity.f23984o0.a(context, str, serializable instanceof df.a ? (df.a) serializable : null, z10, z11);
    }

    @Override // tb.c
    public Intent d0(Context context, String str) {
        p.h(context, "context");
        p.h(str, "referer");
        return MissionActivity.V.a(context, str);
    }

    @Override // tb.c
    public Intent e(Context context) {
        p.h(context, "context");
        return WebViewActivity.X.a(context, ApiUtil.INSTANCE.urlMaintenance(this.f46218a), false, true);
    }

    @Override // tb.c
    public tb.a e0(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3) {
        p.h(parcelable, "streamer");
        p.h(parcelable2, MRLog.TARGET_TYPE_VIEWER);
        p.h(parcelable3, "receivedItem");
        return new tb.a(ic.a.R0.a((MutualGiftUser) parcelable, (MutualGiftUser) parcelable2, (MutualGiftReward) parcelable3), "MutualGiftBoxResultDialogFragment");
    }

    @Override // tb.c
    public Intent f(Context context) {
        p.h(context, "context");
        return FaqActivity.U.a(context);
    }

    @Override // tb.c
    public tb.a f0(String str) {
        p.h(str, "referer");
        return new tb.a(wc.d.Q0.a(str), "ChatConfirmationAgreementDialog");
    }

    @Override // tb.c
    public tb.a g(boolean z10) {
        return new tb.a(f9.c.U0.a(z10), "CollabMatchingSettingDialog");
    }

    @Override // tb.c
    public Intent g0(Context context, String str, int i10, String str2) {
        p.h(context, "context");
        return ProfileUserListActivity.f24079g0.a(context, str, i10, str2);
    }

    @Override // tb.c
    public tb.a h(String str, boolean z10, int i10) {
        p.h(str, "topTitle");
        return new tb.a(i.U0.a(str, z10, i10), "ConfirmNotificationGuardDialog");
    }

    @Override // tb.c
    public tb.a h0(boolean z10) {
        return new tb.a(f9.a.S0.a(z10), "CollabMatchedDialog");
    }

    @Override // tb.c
    public Intent i(Context context, Parcelable parcelable) {
        p.h(context, "context");
        return GroupInvitationsActivity.f24624b0.a(context, (j) parcelable);
    }

    @Override // tb.c
    public tb.a i0(String str, String str2) {
        p.h(str, "referer");
        p.h(str2, "userId");
        return new tb.a(md.b.R0.a(str, str2), "CheersBottomSheetDialogFragment");
    }

    @Override // tb.c
    public tb.a j(String str) {
        return new tb.a(u.S0.a(str), "StopScreenShareDialog");
    }

    @Override // tb.c
    public tb.a j0(String str, Integer num, String str2, String str3, String str4, Parcelable parcelable, String str5, Parcelable parcelable2, boolean z10) {
        return new tb.a(bb.b.O0.a(str, num, str2, str3, str4, parcelable instanceof k9.a ? (k9.a) parcelable : null, str5, parcelable2 instanceof k9.a ? (k9.a) parcelable2 : null, z10), "CommonPopupDialogFragment");
    }

    @Override // tb.c
    public tb.a k() {
        return new tb.a(i2.f50166d1.a(), "ShooterDressUpDialog");
    }

    @Override // tb.c
    public Intent k0(Context context, String str, String str2) {
        p.h(context, "context");
        p.h(str, "title");
        p.h(str2, "url");
        return WebViewWithToolbarActivity.R.a(context, str, str2);
    }

    @Override // tb.c
    public Intent l(Context context) {
        p.h(context, "context");
        return SettingRootActivity.f24843a0.a(context);
    }

    @Override // tb.c
    public tb.a l0() {
        return new tb.a(p1.U0.a(), "EmomoDressUpShopDialog");
    }

    @Override // tb.c
    public tb.a m(String str, String str2, boolean z10, boolean z11) {
        p.h(str, "userId");
        p.h(str2, "referer");
        return new tb.a(c1.f40866b1.a(str, str2, z10, z11), "UserProfileDialog");
    }

    @Override // tb.c
    public Intent m0(Context context) {
        p.h(context, "context");
        return LiveGameDailyRankingActivity.T.a(context);
    }

    @Override // tb.c
    public tb.a n(ub.c cVar) {
        p.h(cVar, "rankingPrizeData");
        return new tb.a(dd.j.R0.a(cVar), "DIALOG_TAG_RANKING_PRIZE");
    }

    @Override // tb.c
    public Intent n0(Context context) {
        p.h(context, "context");
        return ContractMemberPassBookActivity.T.a(context);
    }

    @Override // tb.c
    public Intent o(Context context, Integer num) {
        p.h(context, "context");
        return StreamEmomoActivity.Q0.a(context, num);
    }

    @Override // tb.c
    public Intent o0(Context context) {
        p.h(context, "context");
        return WebViewActivity.X.a(context, ApiUtil.INSTANCE.urlForceUpdate(this.f46218a), true, false);
    }

    @Override // tb.c
    public tb.a p(String str, String str2, String str3, boolean z10) {
        p.h(str, "title");
        return new tb.a(gb.f.P0.a(str, str2, str3, z10), "RewardPostResultDialogFragment");
    }

    @Override // tb.c
    public tb.a p0(Context context, Parcelable parcelable) {
        p.h(context, "context");
        p.h(parcelable, "seasonRatingStatus");
        return new tb.a(kd.c.O0.a((SeasonRatingStatusResponse) parcelable), "DIALOG_TAG_SEASON_RATING_RESULT");
    }

    @Override // tb.c
    public Intent q(Context context) {
        p.h(context, "context");
        Intent intent = new Intent();
        intent.setAction("com.dena.mirrorman.action.STOP_PLAYING");
        return intent;
    }

    @Override // tb.c
    public Intent q0(Context context) {
        p.h(context, "context");
        return MonthlyRankingActivity.V.a(context);
    }

    @Override // tb.c
    public Intent r(Context context, Parcelable parcelable, boolean z10) {
        p.h(context, "context");
        p.h(parcelable, "liveGameListItem");
        return LiveGameDetailActivity.f21465e0.a(context, na.d.M.a((LiveGameListItem) parcelable, z10));
    }

    @Override // tb.c
    public Intent r0(Context context, Integer num, String str, String str2) {
        p.h(context, "context");
        return SearchActivity.Q.a(context, c9.u.Companion.a(num), str, str2);
    }

    @Override // tb.c
    public Intent s(Context context, String str, String str2) {
        p.h(context, "context");
        p.h(str, "userId");
        p.h(str2, "refererOfLauncher");
        return UserProfileActivity.f24944g0.a(context, str, str2);
    }

    @Override // tb.c
    public tb.a s0(List<? extends Parcelable> list, String str, boolean z10, int i10) {
        p.h(list, "giftGachaResults");
        j.a aVar = ba.j.S0;
        ArrayList arrayList = new ArrayList(t.u(list, 10));
        for (Parcelable parcelable : list) {
            p.f(parcelable, "null cannot be cast to non-null type com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult");
            arrayList.add((EmomoRunGiftGachaResult) parcelable);
        }
        return new tb.a(aVar.a(arrayList, str, z10, i10), "EmomoRunGiftGachaOpenDialog");
    }

    @Override // tb.c
    public Intent t(Context context, String str, Parcelable parcelable) {
        p.h(context, "context");
        return ChatPageActivity.A0.a(context, str, (ge.j) parcelable);
    }

    @Override // tb.c
    public Intent t0(Context context, String str, String str2, String str3, String str4, boolean z10, String str5) {
        p.h(context, "context");
        p.h(str, "referer");
        p.h(str2, "gameId");
        p.h(str3, "gameUrl");
        p.h(str4, "playId");
        return TransparentLiveGameWebViewActivity.f21594b0.a(context, str, str2, str3, str4, z10, str5);
    }

    @Override // tb.c
    public Intent u(Context context, String str, String str2, String str3, String str4, boolean z10, String str5) {
        p.h(context, "context");
        p.h(str, "referer");
        p.h(str2, "gameId");
        p.h(str3, "gameUrl");
        p.h(str4, "playId");
        return LiveGameWebViewActivity.f21544b0.a(context, str, str2, str3, str4, z10, str5);
    }

    @Override // tb.c
    public Intent u0(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        p.h(context, "context");
        p.h(str, "liveId");
        p.h(str2, "referer");
        return PlayerActivity.f21956s1.a(context, str, str2, str3, str4, z10, z11, z12, z13, str5);
    }

    @Override // tb.c
    public Intent v(Context context, String str, String str2) {
        p.h(context, "context");
        return LivePrepareActivity.f23740h0.a(context, str, str2);
    }

    @Override // tb.c
    public Intent v0(Context context, Uri uri, float f10, float f11, boolean z10) {
        p.h(context, "context");
        p.h(uri, "source");
        return CropImageActivity.O.a(context, uri, f10, f11, z10);
    }

    @Override // tb.c
    public tb.a w(String str) {
        p.h(str, "referer");
        return new tb.a(yc.e.Q0.a(str), "ChatConfirmationGenerationPickerDialog");
    }

    @Override // tb.c
    public Intent w0(Context context, String str) {
        p.h(context, "context");
        p.h(str, "liveId");
        return ArchivePlayerActivity.f22590a0.a(context, str);
    }

    @Override // tb.c
    public Intent x(Context context, String str, Intent intent) {
        p.h(context, "context");
        p.h(str, "referer");
        return AfterPlayActivity.Z.a(context, str, intent);
    }

    @Override // tb.c
    public Intent x0(Context context) {
        p.h(context, "context");
        return SettingActivity.f24773g0.a(context);
    }

    @Override // tb.c
    public tb.a y(String str, String str2) {
        p.h(str, "fromReferer");
        p.h(str2, "campaignId");
        return new tb.a(k.f61450d1.a(str, str2), "CampaignDetailBottomSheetDialogFragment");
    }

    @Override // tb.c
    public Intent y0(Context context) {
        p.h(context, "context");
        return PhotoCampaignPostActivity.f20528a0.a(context);
    }

    @Override // tb.c
    public tb.a z(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "referer");
        p.h(str2, "appId");
        p.h(str3, "appIconUrl");
        p.h(str4, "appTitle");
        p.h(str5, "shortTitle");
        return new tb.a(q.W0.a(str, str2, str3, str4, str5), "LiveAnnounceSettingDialog");
    }

    @Override // tb.c
    public Intent z0(Context context) {
        p.h(context, "context");
        return MyPageActivity.P.a(context);
    }
}
