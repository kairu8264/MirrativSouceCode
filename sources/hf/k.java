package hf;

import ce.l;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.EmomoRunGameGift;
import com.dena.mirrorman.net.api.response.EmomoRunState;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.bcsvr.response.AnnouncementPopup;
import com.dena.mirrorman.net.bcsvr.response.ChangeModerator;
import com.dena.mirrorman.net.bcsvr.response.CheerLevelUpCommentBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabClosedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabEndNotFollowUserResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByStreamerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByViewerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabInvitedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabReadyMatchingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabRecommendLiveBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabRequest;
import com.dena.mirrorman.net.bcsvr.response.CollabRequestCanceledBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.CollabStartByMatchingResponse;
import com.dena.mirrorman.net.bcsvr.response.Comment;
import com.dena.mirrorman.net.bcsvr.response.CommentAppUserDetail;
import com.dena.mirrorman.net.bcsvr.response.EmomoQuestGameStateBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUsers;
import com.dena.mirrorman.net.bcsvr.response.LiveChangedResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameConnectBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameDisconnectBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameEndBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGameInterruptibleBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveGamePlayingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveLinkedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveUrlSharedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.LiveViewerNum;
import com.dena.mirrorman.net.bcsvr.response.LuckyPrizeBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingCollabCanceledBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingLiveBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MatchingStarterToStarterBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MutualGiftAchievedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.MutualGiftReceivableRewardsBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingRequestFinishedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.UpdateEmomoVisibleBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.UserLevelUpdate;
import com.dena.mirrorman.net.quiz.QuizMessage;
import com.google.gson.JsonSyntaxException;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k implements j {
    @Override // hf.j
    public ce.l a(String str, String str2) {
        JSONObject jSONObject;
        xm.e b10;
        int i10;
        jo.p.h(str, "channelName");
        jo.p.h(str2, "json");
        try {
            jSONObject = new JSONObject(str2);
            b10 = new xm.f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b();
            i10 = jSONObject.getInt(TopicConstant.PACKET_TYPE_TEXT);
        } catch (JsonSyntaxException e10) {
            g9.a.c(e10);
        } catch (JSONException e11) {
            g9.a.c(e11);
        }
        if (i10 == 3) {
            Comment comment = (Comment) b10.i(str2, Comment.class);
            jo.p.g(comment, "comment");
            return new l.m0(str, comment);
        } else if (i10 == 4) {
            Comment comment2 = (Comment) b10.i(str2, Comment.class);
            jo.p.g(comment2, "comment");
            return new l.m1(str, comment2);
        } else if (i10 == 65) {
            EmomoRunState emomoRunState = (EmomoRunState) b10.i(str2, EmomoRunState.class);
            jo.p.g(emomoRunState, "emomoRunState");
            return new l.u(str, emomoRunState);
        } else if (i10 != 66) {
            switch (i10) {
                case 1:
                    Comment comment3 = (Comment) b10.i(str2, Comment.class);
                    jo.p.g(comment3, "comment");
                    return new l.f0(str, comment3);
                case 16:
                    LiveUrlSharedBcsvrResponse liveUrlSharedBcsvrResponse = (LiveUrlSharedBcsvrResponse) b10.i(str2, LiveUrlSharedBcsvrResponse.class);
                    jo.p.g(liveUrlSharedBcsvrResponse, "response");
                    return new l.q0(str, liveUrlSharedBcsvrResponse);
                case 19:
                    Comment comment4 = (Comment) b10.i(str2, Comment.class);
                    jo.p.g(comment4, "comment");
                    return new l.w0(str, comment4);
                case 23:
                    LiveViewerNum liveViewerNum = (LiveViewerNum) b10.i(str2, LiveViewerNum.class);
                    jo.p.g(liveViewerNum, "liveViewerNum");
                    return new l.r0(str, liveViewerNum);
                case 35:
                    GiftItem giftItem = (GiftItem) b10.i(str2, GiftItem.class);
                    jo.p.g(giftItem, "giftItem");
                    return new l.y(str, giftItem);
                case 49:
                    CommentAppUserDetail commentAppUserDetail = (CommentAppUserDetail) b10.i(str2, CommentAppUserDetail.class);
                    jo.p.g(commentAppUserDetail, "appUserDetail");
                    return new l.a(str, commentAppUserDetail);
                case 51:
                    ChangeModerator changeModerator = (ChangeModerator) b10.i(str2, ChangeModerator.class);
                    jo.p.g(changeModerator, "changeModerator");
                    return new l.x0(str, changeModerator);
                case 56:
                    FeverValue feverValue = (FeverValue) b10.i(str2, FeverValue.class);
                    jo.p.g(feverValue, "response");
                    return new l.w(str, feverValue);
                case 106:
                    ShooterMatchingBcsvrResponse shooterMatchingBcsvrResponse = (ShooterMatchingBcsvrResponse) b10.i(str2, ShooterMatchingBcsvrResponse.class);
                    jo.p.g(shooterMatchingBcsvrResponse, "response");
                    return new l.j1(str, shooterMatchingBcsvrResponse);
                case 107:
                    ShooterMatchingRequestFinishedBcsvrResponse shooterMatchingRequestFinishedBcsvrResponse = (ShooterMatchingRequestFinishedBcsvrResponse) b10.i(str2, ShooterMatchingRequestFinishedBcsvrResponse.class);
                    jo.p.g(shooterMatchingRequestFinishedBcsvrResponse, "response");
                    return new l.g1(str, shooterMatchingRequestFinishedBcsvrResponse);
                case 108:
                    UpdateEmomoVisibleBcsvrResponse updateEmomoVisibleBcsvrResponse = (UpdateEmomoVisibleBcsvrResponse) b10.i(str2, UpdateEmomoVisibleBcsvrResponse.class);
                    jo.p.g(updateEmomoVisibleBcsvrResponse, "response");
                    return new l.v(str, updateEmomoVisibleBcsvrResponse);
                case 109:
                    EmomoQuestGameStateBcsvrResponse emomoQuestGameStateBcsvrResponse = (EmomoQuestGameStateBcsvrResponse) b10.i(str2, EmomoQuestGameStateBcsvrResponse.class);
                    jo.p.g(emomoQuestGameStateBcsvrResponse, "response");
                    return new l.s(str, emomoQuestGameStateBcsvrResponse);
                case 110:
                    return new l.r(str, str2);
                case 111:
                    MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse = (MutualGiftAchievedBcsvrResponse) b10.i(str2, MutualGiftAchievedBcsvrResponse.class);
                    jo.p.g(mutualGiftAchievedBcsvrResponse, "response");
                    return new l.y0(str, mutualGiftAchievedBcsvrResponse);
                case 112:
                    MutualGiftReceivableRewardsBcsvrResponse mutualGiftReceivableRewardsBcsvrResponse = (MutualGiftReceivableRewardsBcsvrResponse) b10.i(str2, MutualGiftReceivableRewardsBcsvrResponse.class);
                    jo.p.g(mutualGiftReceivableRewardsBcsvrResponse, "response");
                    return new l.z0(str, mutualGiftReceivableRewardsBcsvrResponse);
                case 113:
                    LuckyPrizeBcsvrResponse luckyPrizeBcsvrResponse = (LuckyPrizeBcsvrResponse) b10.i(str2, LuckyPrizeBcsvrResponse.class);
                    jo.p.g(luckyPrizeBcsvrResponse, "prize");
                    return new l.s0(str, luckyPrizeBcsvrResponse);
                case 114:
                    LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse = (LiveGameInterruptibleBcsvrResponse) b10.i(str2, LiveGameInterruptibleBcsvrResponse.class);
                    jo.p.g(liveGameInterruptibleBcsvrResponse, "response");
                    return new l.k0(str, liveGameInterruptibleBcsvrResponse);
                case 115:
                    LiveGamePlayingBcsvrResponse liveGamePlayingBcsvrResponse = (LiveGamePlayingBcsvrResponse) b10.i(str2, LiveGamePlayingBcsvrResponse.class);
                    jo.p.g(liveGamePlayingBcsvrResponse, "response");
                    return new l.l0(str, liveGamePlayingBcsvrResponse);
                case 116:
                    CheerLevelUpCommentBcsvrResponse cheerLevelUpCommentBcsvrResponse = (CheerLevelUpCommentBcsvrResponse) b10.i(str2, CheerLevelUpCommentBcsvrResponse.class);
                    jo.p.g(cheerLevelUpCommentBcsvrResponse, "response");
                    return new l.b(str, cheerLevelUpCommentBcsvrResponse);
                case 117:
                    return new l.x(str);
                default:
                    switch (i10) {
                        case 7:
                            LiveChangedResponse liveChangedResponse = (LiveChangedResponse) b10.i(str2, LiveChangedResponse.class);
                            jo.p.g(liveChangedResponse, "liveChangedResponse");
                            return new l.e0(str, liveChangedResponse);
                        case 8:
                            JSONObject optJSONObject = jSONObject.optJSONObject("delay");
                            return new l.g0(str, optJSONObject != null ? Double.valueOf(optJSONObject.getDouble("uniMin")) : null, optJSONObject != null ? Double.valueOf(optJSONObject.getDouble("uniMax")) : null, optJSONObject != null ? Double.valueOf(optJSONObject.getDouble("expMultiplier")) : null);
                        case 9:
                            String string = jSONObject.getString("u");
                            String string2 = jSONObject.getString(TopicConstant.PACKET_TYPE_AUDIO_AAC);
                            String string3 = jSONObject.getString("owner_name");
                            String string4 = jSONObject.has("iurl") ? jSONObject.getString("iurl") : "";
                            String string5 = jSONObject.has("burl") ? jSONObject.getString("burl") : "";
                            jo.p.g(string, "userId");
                            jo.p.g(string2, "userName");
                            jo.p.g(string3, "ownerName");
                            jo.p.g(string4, "profileImageUrl");
                            jo.p.g(string5, "badgeImageUrl");
                            return new l.o0(str, string, string2, string3, string4, string5);
                        case 10:
                            CollabRequest collabRequest = (CollabRequest) b10.i(str2, CollabRequest.class);
                            jo.p.g(collabRequest, "response");
                            return new l.p(str, collabRequest);
                        case 11:
                            String string6 = jSONObject.getString("u");
                            jo.p.g(string6, "acceptedUserId");
                            return new l.c(str, string6);
                        case 12:
                            CollabRequestCanceledBcsvrResponse collabRequestCanceledBcsvrResponse = (CollabRequestCanceledBcsvrResponse) b10.i(str2, CollabRequestCanceledBcsvrResponse.class);
                            jo.p.g(collabRequestCanceledBcsvrResponse, "response");
                            return new l.d(str, collabRequestCanceledBcsvrResponse);
                        case 13:
                            String string7 = jSONObject.getString("sender_id");
                            String string8 = jSONObject.getString("raw");
                            jo.p.g(string7, "sentUserId");
                            jo.p.g(string8, "raw");
                            return new l.n(str, string7, string8);
                        case 14:
                            CollabClosedBcsvrResponse collabClosedBcsvrResponse = (CollabClosedBcsvrResponse) b10.i(str2, CollabClosedBcsvrResponse.class);
                            jo.p.g(collabClosedBcsvrResponse, "response");
                            return new l.f(str, collabClosedBcsvrResponse);
                        default:
                            switch (i10) {
                                case 26:
                                    LiveLinkedBcsvrResponse liveLinkedBcsvrResponse = (LiveLinkedBcsvrResponse) b10.i(str2, LiveLinkedBcsvrResponse.class);
                                    jo.p.g(liveLinkedBcsvrResponse, "liveLinkedBcsvrResponse");
                                    return new l.n0(str, liveLinkedBcsvrResponse);
                                case 27:
                                    return new l.p0(str);
                                case 28:
                                    String string9 = jSONObject.getJSONObject("linked_live").getString(MRLog.PAYLOAD_KEY_LIVE_ID);
                                    String string10 = jSONObject.getJSONObject("linked_live").getString("owner_name");
                                    jo.p.g(string9, "liveId");
                                    jo.p.g(string10, "ownerName");
                                    return new l.d0(str, string9, string10);
                                case 29:
                                    QuizMessage quizMessage = (QuizMessage) b10.i(str2, QuizMessage.class);
                                    jo.p.g(quizMessage, "quizMessage");
                                    return new l.c1(str, quizMessage);
                                case 30:
                                    QuizMessage quizMessage2 = (QuizMessage) b10.i(str2, QuizMessage.class);
                                    jo.p.g(quizMessage2, "quizMessage");
                                    return new l.a1(str, quizMessage2);
                                case 31:
                                    return new l.b1(str);
                                default:
                                    switch (i10) {
                                        case 37:
                                            GiftRankingTopUser giftRankingTopUser = (GiftRankingTopUser) b10.i(str2, GiftRankingTopUser.class);
                                            jo.p.g(giftRankingTopUser, "response");
                                            return new l.c0(str, giftRankingTopUser);
                                        case 38:
                                            List<RankingUser> component2 = ((GiftRankingTopUsers) b10.i(str2, GiftRankingTopUsers.class)).component2();
                                            if (component2 == null) {
                                                component2 = xn.s.k();
                                            }
                                            return new l.b0(str, component2);
                                        case 39:
                                            AnnouncementPopup announcementPopup = (AnnouncementPopup) b10.i(str2, AnnouncementPopup.class);
                                            jo.p.g(announcementPopup, "popup");
                                            return new l.k1(str, announcementPopup);
                                        default:
                                            switch (i10) {
                                                case 60:
                                                    String string11 = jSONObject.getString("msg");
                                                    jo.p.g(string11, "message");
                                                    return new l.l1(str, string11);
                                                case 61:
                                                    return new l.z(str);
                                                case 62:
                                                    SimpleGiftGachaStock simpleGiftGachaStock = (SimpleGiftGachaStock) b10.i(str2, SimpleGiftGachaStock.class);
                                                    jo.p.g(simpleGiftGachaStock, "response");
                                                    return new l.d1(str, simpleGiftGachaStock);
                                                default:
                                                    switch (i10) {
                                                        case 69:
                                                            return new l.e1(str);
                                                        case 70:
                                                            CollabChangedBcsvrResponse collabChangedBcsvrResponse = (CollabChangedBcsvrResponse) b10.i(str2, CollabChangedBcsvrResponse.class);
                                                            jo.p.g(collabChangedBcsvrResponse, "collabChanged");
                                                            return new l.e(str, collabChangedBcsvrResponse);
                                                        case 71:
                                                            UserLevelUpdate userLevelUpdate = (UserLevelUpdate) b10.i(str2, UserLevelUpdate.class);
                                                            jo.p.g(userLevelUpdate, "userLevelUpdate");
                                                            return new l.n1(str, userLevelUpdate);
                                                        case 72:
                                                            String string12 = jSONObject.getString("u");
                                                            jo.p.g(string12, "jsonObj.getString(\"u\")");
                                                            return new l.f1(str, string12);
                                                        case 73:
                                                            CollabInvitedBcsvrResponse collabInvitedBcsvrResponse = (CollabInvitedBcsvrResponse) b10.i(str2, CollabInvitedBcsvrResponse.class);
                                                            jo.p.g(collabInvitedBcsvrResponse, "response");
                                                            return new l.j(str, collabInvitedBcsvrResponse);
                                                        case 74:
                                                            CollabInviteCanceledByStreamerBcsvrResponse collabInviteCanceledByStreamerBcsvrResponse = (CollabInviteCanceledByStreamerBcsvrResponse) b10.i(str2, CollabInviteCanceledByStreamerBcsvrResponse.class);
                                                            jo.p.g(collabInviteCanceledByStreamerBcsvrResponse, "response");
                                                            return new l.h(str, collabInviteCanceledByStreamerBcsvrResponse);
                                                        case 75:
                                                            CollabInviteCanceledByViewerBcsvrResponse collabInviteCanceledByViewerBcsvrResponse = (CollabInviteCanceledByViewerBcsvrResponse) b10.i(str2, CollabInviteCanceledByViewerBcsvrResponse.class);
                                                            jo.p.g(collabInviteCanceledByViewerBcsvrResponse, "response");
                                                            return new l.i(str, collabInviteCanceledByViewerBcsvrResponse);
                                                        case 76:
                                                            return new l.k(str);
                                                        case 77:
                                                            CollabRecommendLiveBcsvrResponse collabRecommendLiveBcsvrResponse = (CollabRecommendLiveBcsvrResponse) b10.i(str2, CollabRecommendLiveBcsvrResponse.class);
                                                            jo.p.g(collabRecommendLiveBcsvrResponse, "response");
                                                            return new l.o(str, collabRecommendLiveBcsvrResponse);
                                                        default:
                                                            switch (i10) {
                                                                case 81:
                                                                    ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse = (ShooterMemberStateChangedBcsvrResponse) b10.i(str2, ShooterMemberStateChangedBcsvrResponse.class);
                                                                    jo.p.g(shooterMemberStateChangedBcsvrResponse, "response");
                                                                    return new l.i1(str, shooterMemberStateChangedBcsvrResponse);
                                                                case 82:
                                                                    ShooterMatchingStateChangedBcsvrResponse shooterMatchingStateChangedBcsvrResponse = (ShooterMatchingStateChangedBcsvrResponse) b10.i(str2, ShooterMatchingStateChangedBcsvrResponse.class);
                                                                    jo.p.g(shooterMatchingStateChangedBcsvrResponse, "response");
                                                                    return new l.h1(str, shooterMatchingStateChangedBcsvrResponse);
                                                                case 83:
                                                                    MatchingCollabCanceledBcsvrResponse matchingCollabCanceledBcsvrResponse = (MatchingCollabCanceledBcsvrResponse) b10.i(str2, MatchingCollabCanceledBcsvrResponse.class);
                                                                    jo.p.g(matchingCollabCanceledBcsvrResponse, "response");
                                                                    return new l.u0(str, matchingCollabCanceledBcsvrResponse);
                                                                case 84:
                                                                    MatchingLiveBcsvrResponse matchingLiveBcsvrResponse = (MatchingLiveBcsvrResponse) b10.i(str2, MatchingLiveBcsvrResponse.class);
                                                                    jo.p.g(matchingLiveBcsvrResponse, "response");
                                                                    return new l.t0(str, matchingLiveBcsvrResponse);
                                                                case 85:
                                                                    CollabReadyMatchingBcsvrResponse collabReadyMatchingBcsvrResponse = (CollabReadyMatchingBcsvrResponse) b10.i(str2, CollabReadyMatchingBcsvrResponse.class);
                                                                    jo.p.g(collabReadyMatchingBcsvrResponse, "response");
                                                                    return new l.m(str, collabReadyMatchingBcsvrResponse);
                                                                case 86:
                                                                    return new l.C0151l(str);
                                                                case 87:
                                                                    CollabStartByMatchingResponse collabStartByMatchingResponse = (CollabStartByMatchingResponse) b10.i(str2, CollabStartByMatchingResponse.class);
                                                                    jo.p.g(collabStartByMatchingResponse, "response");
                                                                    return new l.q(str, collabStartByMatchingResponse);
                                                                case 88:
                                                                    CollabEndNotFollowUserResponse collabEndNotFollowUserResponse = (CollabEndNotFollowUserResponse) b10.i(str2, CollabEndNotFollowUserResponse.class);
                                                                    jo.p.g(collabEndNotFollowUserResponse, "response");
                                                                    return new l.g(str, collabEndNotFollowUserResponse);
                                                                case 89:
                                                                    GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse = (GiftRankingChangedBcsvrResponse) b10.i(str2, GiftRankingChangedBcsvrResponse.class);
                                                                    jo.p.g(giftRankingChangedBcsvrResponse, "response");
                                                                    return new l.a0(str, giftRankingChangedBcsvrResponse);
                                                                case 90:
                                                                    MatchingStarterToStarterBcsvrResponse matchingStarterToStarterBcsvrResponse = (MatchingStarterToStarterBcsvrResponse) b10.i(str2, MatchingStarterToStarterBcsvrResponse.class);
                                                                    jo.p.g(matchingStarterToStarterBcsvrResponse, "response");
                                                                    return new l.v0(str, matchingStarterToStarterBcsvrResponse);
                                                                default:
                                                                    switch (i10) {
                                                                        case 92:
                                                                            LiveGameConnectBcsvrResponse liveGameConnectBcsvrResponse = (LiveGameConnectBcsvrResponse) b10.i(str2, LiveGameConnectBcsvrResponse.class);
                                                                            jo.p.g(liveGameConnectBcsvrResponse, "response");
                                                                            return new l.h0(str, liveGameConnectBcsvrResponse);
                                                                        case 93:
                                                                            LiveGameDisconnectBcsvrResponse liveGameDisconnectBcsvrResponse = (LiveGameDisconnectBcsvrResponse) b10.i(str2, LiveGameDisconnectBcsvrResponse.class);
                                                                            jo.p.g(liveGameDisconnectBcsvrResponse, "response");
                                                                            return new l.i0(str, liveGameDisconnectBcsvrResponse);
                                                                        case 94:
                                                                            LiveGameEndBcsvrResponse liveGameEndBcsvrResponse = (LiveGameEndBcsvrResponse) b10.i(str2, LiveGameEndBcsvrResponse.class);
                                                                            jo.p.g(liveGameEndBcsvrResponse, "response");
                                                                            return new l.j0(str, liveGameEndBcsvrResponse);
                                                                    }
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            EmomoRunGameGift emomoRunGameGift = (EmomoRunGameGift) b10.i(str2, EmomoRunGameGift.class);
            jo.p.g(emomoRunGameGift, "emomoRunGameGift");
            return new l.t(str, emomoRunGameGift);
        }
    }
}
