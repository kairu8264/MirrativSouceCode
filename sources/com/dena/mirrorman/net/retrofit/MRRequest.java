package com.dena.mirrorman.net.retrofit;

import ao.d;
import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetsResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdateCompanionNameResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdatePartTextResponse;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.net.api.request.PurchaseAvatarsRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.AvailableRewardAdIdsResponse;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.CampaignShareInfoResponse;
import com.dena.mirrorman.net.api.response.Chat;
import com.dena.mirrorman.net.api.response.ChatThreadList;
import com.dena.mirrorman.net.api.response.ChatThreadMessages;
import com.dena.mirrorman.net.api.response.CollabMatchingStartResponse;
import com.dena.mirrorman.net.api.response.CollabRequestResponse;
import com.dena.mirrorman.net.api.response.ConnectAuthorizeResponse;
import com.dena.mirrorman.net.api.response.ConnectConfirmResponse;
import com.dena.mirrorman.net.api.response.ConnectedStreamingCollabLivesResponse;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.FavoriteLiveSettingResponse;
import com.dena.mirrorman.net.api.response.FavoriteLiveSettingsResponse;
import com.dena.mirrorman.net.api.response.Genres;
import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionReceiveResponse;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionResponse;
import com.dena.mirrorman.net.api.response.GiftGachaOpenResponse;
import com.dena.mirrorman.net.api.response.GiftGachaUserStocksResponse;
import com.dena.mirrorman.net.api.response.GiftPanelsResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResponse;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.Group;
import com.dena.mirrorman.net.api.response.GroupShotBackgroundsResponse;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.KaraokeSearch;
import com.dena.mirrorman.net.api.response.Karaokes;
import com.dena.mirrorman.net.api.response.LiveGiftRankingResponse;
import com.dena.mirrorman.net.api.response.LiveStreamingUrlResponse;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.MissionStatusResponse;
import com.dena.mirrorman.net.api.response.ModeratorResponse;
import com.dena.mirrorman.net.api.response.MutualGiftReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.NoticeCountsResponse;
import com.dena.mirrorman.net.api.response.PrivateLiveInvitationsResponse;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.api.response.RecommendSingers;
import com.dena.mirrorman.net.api.response.RewardAdCompleteResponse;
import com.dena.mirrorman.net.api.response.SanitizeTextResponse;
import com.dena.mirrorman.net.api.response.SeasonYellYelledUsersResponse;
import com.dena.mirrorman.net.api.response.Singers;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftConfigResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftEffectInfoResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftSlotsResponse;
import com.dena.mirrorman.net.api.response.UserCurrencyResponse;
import com.dena.mirrorman.net.api.response.ViewerAvatarsResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.RankingUserDetailResponse;
import com.dena.mirrorman.net.api.response.event.ShooterAcceptMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.api.response.live.AcceptedMatchedCollabResponse;
import com.dena.mirrorman.net.api.response.live.CampaignShareTweetResponse;
import com.dena.mirrorman.net.api.response.live.CollabInvitableUsersResponse;
import com.dena.mirrorman.net.api.response.live.GroupShotGalleryResponse;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncementResponse;
import com.dena.mirrorman.net.api.response.live.LiveArchiveDownloadUrlResponse;
import com.dena.mirrorman.net.api.response.live.LiveCaptureImageResponse;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveCommentsResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.api.response.live.LiveEndResponse;
import com.dena.mirrorman.net.api.response.live.LiveHeartbeatResponse;
import com.dena.mirrorman.net.api.response.live.LiveHistoriesResponse;
import com.dena.mirrorman.net.api.response.live.LiveOnlineUsersResponse;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import com.dena.mirrorman.net.api.response.live.LivePolling;
import com.dena.mirrorman.net.api.response.live.LiveRequestUsersResponse;
import com.dena.mirrorman.net.api.response.live.LiveWatchedUsersResponse;
import com.dena.mirrorman.net.api.response.live.LivesResponse;
import com.dena.mirrorman.net.api.response.live.MatchedLiveResponse;
import com.dena.mirrorman.net.api.response.live.PhotoCampaignPostStatusResponse;
import com.dena.mirrorman.net.api.response.live.PhotoCampaignStatusResponse;
import com.dena.mirrorman.net.api.response.live.RecommendLivesResponse;
import com.dena.mirrorman.net.api.response.live.SeasonYellStatusResponse;
import com.dena.mirrorman.net.api.response.live.ViewHistoriesResponse;
import com.dena.mirrorman.net.api.response.livegame.LiveGamePingResponse;
import com.dena.mirrorman.net.api.response.livegame.NewCountsResponse;
import com.dena.mirrorman.net.api.response.notice.NoticeCampaignResponse;
import com.dena.mirrorman.net.api.response.notice.NoticeNewsResponse;
import com.dena.mirrorman.net.api.response.notice.NoticePresentBoxResponse;
import com.dena.mirrorman.net.api.response.notice.NoticeYourResponse;
import com.dena.mirrorman.net.api.response.notice.NotificationPushSettingsV3Response;
import com.dena.mirrorman.net.api.response.user.PurchaseContinuousLiveHolidayResponse;
import com.dena.mirrorman.net.api.response.user.UrgeUsersResponse;
import com.dena.mirrorman.net.api.response.user.UserGroupsResponse;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import ep.c0;
import ep.e0;
import gr.a;
import gr.c;
import gr.e;
import gr.f;
import gr.i;
import gr.o;
import gr.t;
import gr.y;
import wn.v;

/* loaded from: classes2.dex */
public interface MRRequest {
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
        public static /* synthetic */ Object commentRequestAsync$default(MRRequest mRRequest, String str, String str2, String str3, Integer num, Float f10, Float f11, String str4, String str5, Integer num2, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.commentRequestAsync(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: commentRequestAsync");
        }

        public static /* synthetic */ Object connectAuthorizeRequest$default(MRRequest mRRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.connectAuthorizeRequest(str, (i10 & 2) != 0 ? "token id_token" : str2, str3, str4, (i10 & 16) != 0 ? "token openid" : str5, (i10 & 32) != 0 ? "nonce" : str6, (i10 & 64) != 0 ? "state" : str7, (i10 & 128) != 0 ? "accept" : str8, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectAuthorizeRequest");
        }

        public static /* synthetic */ Object connectConfirmRequest$default(MRRequest mRRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.connectConfirmRequest(str, (i10 & 2) != 0 ? "token id_token" : str2, str3, str4, (i10 & 16) != 0 ? "token openid" : str5, (i10 & 32) != 0 ? "nonce" : str6, (i10 & 64) != 0 ? "state" : str7, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectConfirmRequest");
        }

        public static /* synthetic */ Object getAppPage$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.getAppPage(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppPage");
        }

        public static /* synthetic */ Object getAppSearch$default(MRRequest mRRequest, String str, String str2, String str3, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.getAppSearch(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppSearch");
        }

        public static /* synthetic */ Object getEventNotice$default(MRRequest mRRequest, int i10, String str, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str = null;
                }
                return mRRequest.getEventNotice(i10, str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEventNotice");
        }

        public static /* synthetic */ Object getFollowingUsers$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.getFollowingUsers(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFollowingUsers");
        }

        public static /* synthetic */ Object getGroupShotGallery$default(MRRequest mRRequest, String str, int i10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    i10 = 0;
                }
                return mRRequest.getGroupShotGallery(str, i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGroupShotGallery");
        }

        public static /* synthetic */ Object getInvitableUsers$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.getInvitableUsers(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInvitableUsers");
        }

        public static /* synthetic */ Object getKaraokeSingers$default(MRRequest mRRequest, int i10, Integer num, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    num = null;
                }
                return mRRequest.getKaraokeSingers(i10, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKaraokeSingers");
        }

        public static /* synthetic */ Object getLiveCatalog$default(MRRequest mRRequest, String str, String str2, String str3, String str4, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.getLiveCatalog(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveCatalog");
        }

        public static /* synthetic */ Object getLiveGameCatalog$default(MRRequest mRRequest, String str, String str2, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return mRRequest.getLiveGameCatalog(str, str2, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveGameCatalog");
        }

        public static /* synthetic */ Object getLiveHistories$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.getLiveHistories(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveHistories");
        }

        public static /* synthetic */ Object getLiveOnlineUsers$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.getLiveOnlineUsers(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveOnlineUsers");
        }

        public static /* synthetic */ Object getLiveRequestUsers$default(MRRequest mRRequest, String str, String str2, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return mRRequest.getLiveRequestUsers(str, str2, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLiveRequestUsers");
        }

        public static /* synthetic */ Object getNoticeCampaign$default(MRRequest mRRequest, String str, String str2, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str2 = null;
                }
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return mRRequest.getNoticeCampaign(str, str2, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticeCampaign");
        }

        public static /* synthetic */ Object getNoticeNews$default(MRRequest mRRequest, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return mRRequest.getNoticeNews(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticeNews");
        }

        public static /* synthetic */ Object getNoticePresentBox$default(MRRequest mRRequest, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return mRRequest.getNoticePresentBox(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticePresentBox");
        }

        public static /* synthetic */ Object getNoticeYour$default(MRRequest mRRequest, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return mRRequest.getNoticeYour(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticeYour");
        }

        public static /* synthetic */ Object getRecommendedUsers$default(MRRequest mRRequest, String str, int i10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    i10 = 1;
                }
                return mRRequest.getRecommendedUsers(str, i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendedUsers");
        }

        public static /* synthetic */ Object getSearchUsers$default(MRRequest mRRequest, String str, String str2, Integer num, Integer num2, Integer num3, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.getSearchUsers(str, str2, num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchUsers");
        }

        public static /* synthetic */ Object getShooterEvent$default(MRRequest mRRequest, String str, int i10, int i11, String str2, d dVar, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 8) != 0) {
                    str2 = null;
                }
                return mRRequest.getShooterEvent(str, i10, i11, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShooterEvent");
        }

        public static /* synthetic */ Object getShooterOnlineUsers$default(MRRequest mRRequest, int i10, Long l10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    l10 = null;
                }
                return mRRequest.getShooterOnlineUsers(i10, l10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShooterOnlineUsers");
        }

        public static /* synthetic */ Object getSongListByGenre$default(MRRequest mRRequest, String str, String str2, int i10, Integer num, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    num = null;
                }
                return mRRequest.getSongListByGenre(str, str2, i10, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSongListByGenre");
        }

        public static /* synthetic */ Object getSongListBySinger$default(MRRequest mRRequest, String str, String str2, int i10, Integer num, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    num = null;
                }
                return mRRequest.getSongListBySinger(str, str2, i10, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSongListBySinger");
        }

        public static /* synthetic */ Object getStreamGiftRanking$default(MRRequest mRRequest, String str, String str2, String str3, String str4, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    str4 = null;
                }
                return mRRequest.getStreamGiftRanking(str, str2, str3, str4, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStreamGiftRanking");
        }

        public static /* synthetic */ Object getViewHistories$default(MRRequest mRRequest, String str, String str2, String str3, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return mRRequest.getViewHistories(str, str2, str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getViewHistories");
        }

        public static /* synthetic */ Object giftSend$default(MRRequest mRRequest, String str, String str2, int i10, String str3, String str4, Integer num, Integer num2, d dVar, int i11, Object obj) {
            if (obj == null) {
                return mRRequest.giftSend(str, str2, i10, str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: giftSend");
        }

        public static /* synthetic */ Object postChatBadReport$default(MRRequest mRRequest, String str, boolean z10, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return mRRequest.postChatBadReport(str, z10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postChatBadReport");
        }

        public static /* synthetic */ Object postCollabClose$default(MRRequest mRRequest, String str, String str2, String str3, String str4, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 16) != 0) {
                    num = null;
                }
                return mRRequest.postCollabClose(str, str2, str3, str4, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postCollabClose");
        }

        public static /* synthetic */ Object postCollabRequest$default(MRRequest mRRequest, String str, String str2, int i10, Integer num, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    num = null;
                }
                return mRRequest.postCollabRequest(str, str2, i10, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postCollabRequest");
        }

        public static /* synthetic */ Object postLiveComment$default(MRRequest mRRequest, String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, d dVar, int i11, Object obj) {
            if (obj == null) {
                return mRRequest.postLiveComment(str, str2, i10, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLiveComment");
        }

        public static /* synthetic */ Object postLiveEdit$default(MRRequest mRRequest, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.postLiveEdit(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : num2, (i10 & 128) != 0 ? null : num3, (i10 & 256) != 0 ? null : num4, (i10 & 512) != 0 ? null : num5, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLiveEdit");
        }

        public static /* synthetic */ Object postLiveEnd$default(MRRequest mRRequest, String str, String str2, Integer num, int i10, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    num = null;
                }
                return mRRequest.postLiveEnd(str, str2, num, i10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postLiveEnd");
        }

        public static /* synthetic */ Object postUserBroadcastSettings$default(MRRequest mRRequest, String str, Integer num, Integer num2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = null;
                }
                if ((i10 & 4) != 0) {
                    num2 = null;
                }
                return mRRequest.postUserBroadcastSettings(str, num, num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postUserBroadcastSettings");
        }

        public static /* synthetic */ Object requestClosetAvatar$default(MRRequest mRRequest, Integer num, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    num = null;
                }
                if ((i10 & 2) != 0) {
                    str = null;
                }
                return mRRequest.requestClosetAvatar(num, str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestClosetAvatar");
        }

        public static /* synthetic */ Object searchKaraoke$default(MRRequest mRRequest, String str, String str2, Integer num, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    num = null;
                }
                return mRRequest.searchKaraoke(str, str2, num, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchKaraoke");
        }

        public static /* synthetic */ Object twitterSignUpRequest$default(MRRequest mRRequest, String str, String str2, String str3, String str4, Integer num, String str5, String str6, d dVar, int i10, Object obj) {
            if (obj == null) {
                return mRRequest.twitterSignUpRequest(str, str2, str3, str4, num, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: twitterSignUpRequest");
        }

        public static /* synthetic */ Object updateShooterMemberStatus$default(MRRequest mRRequest, int i10, int i11, String str, int i12, Integer num, String str2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, d dVar, int i13, Object obj) {
            if (obj == null) {
                return mRRequest.updateShooterMemberStatus(i10, i11, str, i12, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : num2, (i13 & 128) != 0 ? null : num3, (i13 & 256) != 0 ? null : num4, (i13 & 512) != 0 ? null : num5, (i13 & 1024) != 0 ? null : num6, (i13 & 2048) != 0 ? null : num7, (i13 & 4096) != 0 ? null : num8, (i13 & 8192) != 0 ? null : num9, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateShooterMemberStatus");
        }

        public static /* synthetic */ Object updateShooterTeamStatus$default(MRRequest mRRequest, int i10, int i11, int i12, Integer num, String str, d dVar, int i13, Object obj) {
            if (obj == null) {
                return mRRequest.updateShooterTeamStatus(i10, i11, i12, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateShooterTeamStatus");
        }
    }

    @o("api/shooter/accept_matching")
    Object acceptShooterMatching(@i("x-referer") String str, d<? super ShooterAcceptMatchingResponse> dVar);

    @o("api/moderator/add")
    @e
    Object addModerator(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, d<? super ModeratorResponse> dVar);

    @o("api/shooter/cancel_matching")
    Object cancelShooterMatching(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/chat/post_thanks")
    @e
    Object chatPostThanksRequest(@i("x-referer") String str, @c("user_id") String str2, @c("live_id") String str3, @c("send_gacha_ticket") int i10, d<? super StatusResponse> dVar);

    @o("api/chat/post_thanks_to_live_watched_users")
    @e
    Object chatPostThanksToLiveWatchedUsersRequest(@i("x-referer") String str, @c("live_id") String str2, @c("custom_thanks_message") String str3, @c("target_type") String str4, @c("send_gacha_ticket") int i10, d<? super StatusResponse> dVar);

    @o("api/live/live_comment")
    @e
    Object commentRequestAsync(@i("x-referer") String str, @c("live_id") String str2, @c("comment") String str3, @c("type") Integer num, @c("s") Float f10, @c("l") Float f11, @c("target_live_id") String str4, @c("linked_live_id") String str5, @c("app_user_detail_type") Integer num2, d<? super StatusResponse> dVar);

    @o("connect/authorize")
    @e
    Object connectAuthorizeRequest(@i("x-referer") String str, @c("response_type") String str2, @c("client_id") String str3, @c("redirect_uri") String str4, @c("scope") String str5, @c("nonce") String str6, @c("state") String str7, @c("user_action") String str8, d<? super ConnectAuthorizeResponse> dVar);

    @o("connect/confirm")
    @e
    Object connectConfirmRequest(@i("x-referer") String str, @c("response_type") String str2, @c("client_id") String str3, @c("redirect_uri") String str4, @c("scope") String str5, @c("nonce") String str6, @c("state") String str7, d<? super ConnectConfirmResponse> dVar);

    @o("api/shooter/create_team")
    @e
    Object createShooterTeam(@c("season_id") int i10, d<? super ShooterUpdateTeamResponse> dVar);

    @o("api/app/delete_app_user_detail")
    @e
    Object deleteAppUserDetail(@i("x-referer") String str, @c("app_id") String str2, d<? super StatusResponse> dVar);

    @o("api/moderator/delete")
    @e
    Object deleteModerator(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, d<? super StatusResponse> dVar);

    @f("api/app/app_page")
    Object getAppPage(@i("x-referer") String str, @t("app_id") String str2, @t("page") Integer num, d<? super App.AppPage> dVar);

    @f("api/app/app")
    Object getAppRequest(@i("x-referer") String str, @t("app_id") String str2, d<? super App.AppParams> dVar);

    @f("api/app/search")
    Object getAppSearch(@i("x-referer") String str, @t("q") String str2, @t("selected_app_id") String str3, @t("page") Integer num, d<? super App.Apps> dVar);

    @f("api/app/user_apps")
    Object getAppUserApps(@t("user_id") String str, @t("cursor") String str2, d<? super App.Apps> dVar);

    @f("api/app/app_user_detail")
    Object getAppUserDetail(@i("x-referer") String str, @t("app_id") String str2, d<? super AppUserDetailResponse> dVar);

    @f("/api/reward_ad/available_reward_ad_ids")
    Object getAvailableRewardAdIds(@i("x-referer") String str, d<? super AvailableRewardAdIdsResponse> dVar);

    @f("api/graph/blocked_users")
    Object getBlockedUsers(@i("x-referer") String str, @t("page") Integer num, d<? super Graph.BlockedUserList> dVar);

    @f("/api/notice/campaign_detail")
    Object getCampaignDetail(@i("x-referer") String str, @t("id") String str2, d<? super CampaignDetailResponse> dVar);

    @f("api/user/campaign_share_info")
    Object getCampaignShareInfo(@t("campaign_id") String str, d<? super CampaignShareInfoResponse> dVar);

    @f
    Object getChatMessageFromDeeplinkHash(@i("x-referer") String str, @y String str2, d<? super ChatThreadMessages> dVar);

    @f("api/chat/thread")
    Object getChatThread(@i("x-referer") String str, @t("user_id") String str2, @t("group_id") String str3, @t("since_id") Long l10, @t("max_id") Long l11, d<? super ChatThreadMessages> dVar);

    @f("api/chat/threads")
    Object getChatThreads(@i("x-referer") String str, @t("page") Integer num, d<? super ChatThreadList> dVar);

    @f("api/collab/collaborating_users")
    Object getCollaboratingUsers(@i("x-referer") String str, @t("live_id") String str2, d<? super LiveOnlineUsersResponse> dVar);

    @f("/api/collab/connected_streaming_collab_lives")
    Object getConnectedStreamingCollabLives(@i("x-referer") String str, @t("live_id") String str2, d<? super ConnectedStreamingCollabLivesResponse> dVar);

    @f("api/gallery/current_photo_campaign")
    Object getCurrentPhotoCampaignStatus(@i("x-referer") String str, d<? super PhotoCampaignStatusResponse> dVar);

    @f("api/mission/daily")
    Object getDailyMissions(@i("x-referer") String str, d<? super MissionInfoResponse> dVar);

    @f("api/shooter/get_diarkis_auth_info")
    Object getDiarkisAuthInfo(d<? super DiarkisAuthInfoResponse> dVar);

    @f("api/event/notice")
    Object getEventNotice(@t("type") int i10, @t("live_id") String str, d<? super EventNoticeResponse> dVar);

    @f("api/user/favorite_live_setting")
    Object getFavoriteLiveSettings(@i("x-referer") String str, d<? super FavoriteLiveSettingsResponse> dVar);

    @f
    Object getFmeData(@y String str, d<? super e0> dVar);

    @f("api/graph/followers")
    Object getFollowers(@i("x-referer") String str, @t("user_id") String str2, @t("page") Integer num, d<? super Graph.FollowerList> dVar);

    @f("api/graph/followings")
    Object getFollowingUsers(@i("x-referer") String str, @t("user_id") String str2, @t("page") Integer num, d<? super Graph.FollowingList> dVar);

    @f("/api/gift_gacha/user_stocks")
    Object getGiftGachaUserStocks(@i("x-referer") String str, @t("live_id") String str2, d<? super GiftGachaUserStocksResponse> dVar);

    @f("/api/gift/panels")
    Object getGiftPanels(@t("live_id") String str, d<? super GiftPanelsResponse> dVar);

    @f("/api/notice/giftbox_gacha")
    Object getGiftboxGacha(@i("x-referer") String str, @t("user_giftbox_gacha_id") String str2, d<? super GiftboxGachaResponse> dVar);

    @f("api/graph/urge_users")
    Object getGraphUrgeUsers(@i("x-referer") String str, d<? super Graph.UrgeUserList> dVar);

    @f("api/avatar/group_shot_backgrounds")
    Object getGroupShotBackgrounds(@i("x-referer") String str, d<? super GroupShotBackgroundsResponse> dVar);

    @f("api/avatar/group_shot_gallery")
    Object getGroupShotGallery(@i("x-referer") String str, @t("page") int i10, d<? super GroupShotGalleryResponse> dVar);

    @f("api/group/users")
    Object getGroupUsers(@i("x-referer") String str, @t("group_id") String str2, d<? super UsersResponse> dVar);

    @f("api/collab/invitable_users")
    Object getInvitableUsers(@i("x-referer") String str, @t("live_id") String str2, @t("page") Integer num, d<? super CollabInvitableUsersResponse> dVar);

    @f("api/karaoke/genres")
    Object getKaraokeCategories(d<? super Genres> dVar);

    @f("api/karaoke/show")
    Object getKaraokeDetail(@i("x-referer") String str, @t("id") int i10, @t("live_id") String str2, d<? super KaraokeDetail> dVar);

    @f("api/karaoke/")
    Object getKaraokeList(@t("live_id") String str, d<? super Karaokes> dVar);

    @f("api/karaoke/singers")
    Object getKaraokeSingers(@t("page") int i10, @t("limit") Integer num, d<? super Singers> dVar);

    @f("api/graph/kicked_users")
    Object getKickedUsers(@i("x-referer") String str, @t("notice_id") String str2, d<? super Graph.KickedUserList> dVar);

    @f("api/live/archive_download_url")
    Object getLiveArchiveDownloadUrl(@i("x-referer") String str, @t("live_id") String str2, d<? super LiveArchiveDownloadUrlResponse> dVar);

    @f("api/live/broadcast_result")
    Object getLiveBroadcastResult(@i("x-referer") String str, @t("live_id") String str2, d<? super BroadcastResult> dVar);

    @f("api/live/catalog")
    Object getLiveCatalog(@i("x-referer") String str, @t("id") String str2, @t("app_id") String str3, @t("cursor") String str4, d<? super DashboardCatalog> dVar);

    @f("api/live/live_comments")
    Object getLiveComments(@i("x-referer") String str, @t("live_id") String str2, d<? super LiveCommentsResponse> dVar);

    @f("api/live/live")
    Object getLiveDetail(@i("x-referer") String str, @t("live_id") String str2, d<? super LiveDetailResponse> dVar);

    @f("api/live/live_game_catalog")
    Object getLiveGameCatalog(@i("x-referer") String str, @t("live_game_id") String str2, @t("cursor") String str3, d<? super DashboardCatalog> dVar);

    @f("api/live_game/new_counts")
    Object getLiveGameNewCounts(@i("x-referer") String str, @t("live_games") String str2, d<? super NewCountsResponse> dVar);

    @f("api/live/live_history")
    Object getLiveHistories(@i("x-referer") String str, @t("user_id") String str2, @t("page") Integer num, d<? super LiveHistoriesResponse> dVar);

    @f("api/live/online_users")
    Object getLiveOnlineUsers(@i("x-referer") String str, @t("live_id") String str2, @t("page") Integer num, d<? super LiveOnlineUsersResponse> dVar);

    @f("api/user/live_request_users")
    Object getLiveRequestUsers(@i("x-referer") String str, @t("notice_id") String str2, @t("cursor") String str3, d<? super LiveRequestUsersResponse> dVar);

    @f("api/live/search")
    Object getLiveSearch(@i("x-referer") String str, @t("q") String str2, @t("page") Integer num, @t("app_id") String str3, d<? super LivesResponse> dVar);

    @f("api/live/get_streaming_url")
    Object getLiveStreamingUrl(@i("x-referer") String str, @t("live_id") String str2, d<? super LiveStreamingUrlResponse> dVar);

    @f("api/live/watched_users")
    Object getLiveWatchedUsers(@i("x-referer") String str, @t("live_id") String str2, @t("page") Integer num, d<? super LiveWatchedUsersResponse> dVar);

    @f("api/collab/matched_live")
    Object getMatchedLive(@i("x-referer") String str, @t("live_id") String str2, d<? super MatchedLiveResponse> dVar);

    @f("api/mission/status")
    Object getMissionStatus(@i("x-referer") String str, d<? super MissionStatusResponse> dVar);

    @f("api/app/my_app")
    Object getMyApp(@i("x-referer") String str, @t("user_id") String str2, d<? super App.Apps> dVar);

    @f("api/graph/new_followers")
    Object getNewFollowers(@i("x-referer") String str, @t("notice_id") String str2, d<? super Graph.FollowerList> dVar);

    @f("api/notice/campaigns")
    Object getNoticeCampaign(@t("category") String str, @t("cursor") String str2, @t("ids") String str3, d<? super NoticeCampaignResponse> dVar);

    @f("api/notice/counts")
    Object getNoticeCounts(@i("x-referer") String str, @t("followee_lives") long j10, @t("chat") long j11, @t("present_boxes") long j12, @t("yours") long j13, @t("campaigns") long j14, @t("news") long j15, @t("recommend_campaigns") long j16, @t("emomo_campaigns") long j17, @t("app_campaigns") long j18, d<? super NoticeCountsResponse> dVar);

    @f("api/notice/news")
    Object getNoticeNews(@t("cursor") String str, d<? super NoticeNewsResponse> dVar);

    @f("api/notice/present_boxes")
    Object getNoticePresentBox(@t("cursor") String str, d<? super NoticePresentBoxResponse> dVar);

    @f("api/notice/yours_v2")
    Object getNoticeYour(@t("cursor") String str, d<? super NoticeYourResponse> dVar);

    @f("api/app/onlive_apps")
    Object getOnliveApps(@i("x-referer") String str, d<? super App.Apps> dVar);

    @f("api/gallery/photo_campaign")
    Object getPhotoCampaignStatus(@i("x-referer") String str, @t("id") String str2, @t("user_id") String str3, d<? super PhotoCampaignStatusResponse> dVar);

    @f("api/present/gift_code")
    Object getPresentGiftCode(@i("x-referer") String str, @t("user_gift_code_present_id") int i10, d<? super GiftCodeSelectionResponse> dVar);

    @f("/api/ranking/focusable")
    Object getRankingFocusable(@i("x-referer") String str, @t("app_id") String str2, d<? super RankingFocusableResponse> dVar);

    @f("api/ranking/user_detail")
    Object getRankingUserDetail(@i("x-referer") String str, @t("live_id") String str2, d<? super RankingUserDetailResponse> dVar);

    @f("api/app/recommend_apps")
    Object getRecommendApps(@i("x-referer") String str, d<? super App.Apps> dVar);

    @f("api/live/recommend_lives")
    Object getRecommendLives(@i("x-referer") String str, @t("live_id") String str2, d<? super RecommendLivesResponse> dVar);

    @f("api/karaoke/recommend_singers")
    Object getRecommendSingers(@t("live_id") String str, d<? super RecommendSingers> dVar);

    @f("api/karaoke/recommend_singers_by_singer")
    Object getRecommendSingersBySinger(@t("singer_id") String str, d<? super RecommendSingers> dVar);

    @f("api/graph/recommend_users")
    Object getRecommendedUsers(@i("x-referer") String str, @t("page") int i10, d<? super Graph.RecommendUserList> dVar);

    @f("api/graph/search")
    Object getSearchUsers(@i("x-referer") String str, @t("q") String str2, @t("page") Integer num, @t("type") Integer num2, @t("onlive") Integer num3, d<? super UsersResponse> dVar);

    @f("api/season_yell/status")
    Object getSeasonYellStatus(@i("x-referer") String str, @t("live_id") String str2, @t("user_id") String str3, @t("streamer_id") String str4, d<? super SeasonYellStatusResponse> dVar);

    @f("api/season_yell/viewers")
    Object getSeasonYellYelledUsers(@i("x-referer") String str, @t("live_id") String str2, @t("user_id") String str3, d<? super SeasonYellYelledUsersResponse> dVar);

    @f("api/shooter/event")
    Object getShooterEvent(@i("x-referer") String str, @t("season_id") int i10, @t("skip_raking") int i11, @t("streamer_id") String str2, d<? super ShooterEventResponse> dVar);

    @f("api/shooter/matching")
    Object getShooterMatching(@i("x-referer") String str, d<? super ShooterMatchingResponse> dVar);

    @f("api/shooter/get_member_avatars")
    Object getShooterMemberAvatars(@t("season_id") int i10, @t("group_id") int i11, @t("team_id") int i12, d<? super ShooterMemberAvatarsResponse> dVar);

    @f("api/shooter/get_online_viewers")
    Object getShooterOnlineUsers(@t("season_id") int i10, @t("cursor") Long l10, d<? super ShooterOnlineUsersResponse> dVar);

    @f("api/shooter/get_team_result")
    Object getShooterTeamResult(@i("x-referer") String str, @t("season_id") int i10, @t("group_id") int i11, @t("team_id") int i12, d<? super ShooterTeamResultResponse> dVar);

    @f("api/karaoke/by_genre")
    Object getSongListByGenre(@t("live_id") String str, @t("genre_id") String str2, @t("page") int i10, @t("limit") Integer num, d<? super Karaokes> dVar);

    @f("api/karaoke/by_singer")
    Object getSongListBySinger(@t("live_id") String str, @t("singer_id") String str2, @t("page") int i10, @t("limit") Integer num, d<? super Karaokes> dVar);

    @f("api/gift/ranking")
    Object getStreamGiftRanking(@i("x-referer") String str, @t("live_id") String str2, @t("type") String str3, @t("cursor") String str4, d<? super LiveGiftRankingResponse> dVar);

    @f("api/tooltip/start_live_button")
    Object getToolTipStartLiveButton(@i("x-referer") String str, d<? super ToolTipStartLiveButtonResponse> dVar);

    @f("api/gift/unique_emomo_gift_config")
    Object getUniqueEmomoGiftConfig(@i("x-referer") String str, d<? super UniqueEmomoGiftConfigResponse> dVar);

    @f("api/gift/unique_emomo_gift_effect_info")
    Object getUniqueEmomoGiftEffectInfo(@i("x-referer") String str, @t("user_id") String str2, @t("slot_id") String str3, d<? super UniqueEmomoGiftEffectInfoResponse> dVar);

    @f("api/gift/unique_emomo_gift_slots")
    Object getUniqueEmomoGiftSlots(@i("x-referer") String str, d<? super UniqueEmomoGiftSlotsResponse> dVar);

    @f("api/user/broadcast_settings")
    Object getUserBroadcastSettings(@i("x-referer") String str, d<? super BroadcastSettings> dVar);

    @f("api/user/currency")
    Object getUserCurrency(d<? super UserCurrencyResponse> dVar);

    @f("api/user/groups")
    Object getUserGroups(@i("x-referer") String str, @t("page") Integer num, d<? super UserGroupsResponse> dVar);

    @f("api/user/me")
    Object getUserMe(@i("x-referer") String str, d<? super UserMe> dVar);

    @f("api/user/private_live_invitations")
    Object getUserPrivateLiveInvitations(@i("x-referer") String str, d<? super PrivateLiveInvitationsResponse> dVar);

    @f("api/user/profile")
    Object getUserProfile(@i("x-referer") String str, @t("user_id") String str2, d<? super UserProfile> dVar);

    @f("api/user/search")
    Object getUserSearch(@i("x-referer") String str, @t("q") String str2, @t("page") Integer num, d<? super UrgeUsersResponse> dVar);

    @f("api/live/view_history")
    Object getViewHistories(@i("x-referer") String str, @t("user_id") String str2, @t("cursor") String str3, d<? super ViewHistoriesResponse> dVar);

    @f("api/avatar/viewer_avatars")
    Object getViewerAvatars(@i("x-referer") String str, @t("live_id") String str2, @t("type") String str3, @t("count") int i10, @t("user_ids") String str4, d<? super ViewerAvatarsResponse> dVar);

    @f("api/mission/weekly")
    Object getWeeklyMissions(@i("x-referer") String str, d<? super MissionInfoResponse> dVar);

    @f("api/gift/emomo_run_gifts")
    Object giftEmomoRunGifts(@i("x-referer") String str, d<? super Gift.EmomoRunGifts> dVar);

    @o("api/gift/send")
    @e
    Object giftSend(@i("x-referer") String str, @c("gift_id") String str2, @c("count") int i10, @c("live_id") String str3, @c("message") String str4, @c("panel_type") Integer num, @c("panel_reason_id") Integer num2, d<? super Gift.SendGift> dVar);

    @f("api/notification/push_settings_v3")
    Object notificationGetSettingsRequest(@i("x-referer") String str, d<? super NotificationPushSettingsV3Response> dVar);

    @o("api/notification/push_settings_v3")
    @e
    Object notificationPostSettingsRequest(@i("x-referer") String str, @c("live") int i10, d<? super NotificationPushSettingsV3Response> dVar);

    @o("api/notification/register_token_android")
    @e
    Object notificationRegisterTokenRequest(@i("x-referer") String str, @c("app_identifier") String str2, @c("token") String str3, d<? super StatusResponse> dVar);

    @o("api/live/live_polling")
    @e
    Object pollingRequest(@i("x-referer") String str, @c("live_id") String str2, @c("live_user_key") String str3, @c("is_ui_hidden") Integer num, d<? super LivePolling> dVar);

    @o("api/app/add_my_app")
    Object postAddMyApp(@i("x-referer") String str, @a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/app/post_app_user_detail")
    @e
    Object postAppUserDetail(@i("x-referer") String str, @c("app_id") String str2, @c("type") int i10, @c("value") String str3, @c("confirmed") int i11, d<? super AppUserDetailResponse> dVar);

    @o("api/graph/block")
    @e
    Object postBlock(@i("x-referer") String str, @c("user_id") String str2, d<? super StatusResponse> dVar);

    @o("api/campaign/receive_prizes")
    @e
    Object postCampaignReceivePrizes(@i("x-referer") String str, @c("campaign_id") String str2, @c("mission_id") int i10, d<? super CampaignMissionReceivePrizesResponse> dVar);

    @o("/api/campaign/post_share_tweet")
    @e
    Object postCampaignShareTweet(@c("campaign_id") String str, @c("text") String str2, d<? super CampaignShareTweetResponse> dVar);

    @o("api/chat/bad_report")
    @e
    Object postChatBadReport(@c("thread_message_id") String str, @c("is_chat_report") boolean z10, d<? super StatusResponse> dVar);

    @o("api/chat/join")
    @e
    Object postChatJoin(@i("x-referer") String str, @c("user_id") String str2, @c("group_id") String str3, d<? super Chat.Join> dVar);

    @o("api/chat/push_settings")
    @e
    Object postChatPushSettings(@i("x-referer") String str, @c("user_id") String str2, @c("group_id") String str3, @c("enabled") long j10, d<? super StatusResponse> dVar);

    @o("api/chat/read")
    @e
    Object postChatRead(@i("x-referer") String str, @c("user_id") String str2, @c("group_id") String str3, @c("last_message_id") long j10, d<? super StatusResponse> dVar);

    @o("api/chat/post_text")
    @e
    Object postChatText(@i("x-referer") String str, @c("user_id") String str2, @c("group_id") String str3, @c("text") String str4, d<? super StatusResponse> dVar);

    @o("api/chat/thread_visibility")
    @e
    Object postChatThreadVisibility(@i("x-referer") String str, @c("user_id") String str2, @c("group_id") String str3, @c("is_visible") int i10, d<? super StatusResponse> dVar);

    @o("api/collab/accept")
    @e
    Object postCollabAccept(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, @c("is_reconnect") int i10, d<? super StatusResponse> dVar);

    @o("api/collab/cancel")
    @e
    Object postCollabCancel(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, @c("error") String str4, d<? super StatusResponse> dVar);

    @o("api/collab/close")
    @e
    Object postCollabClose(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, @c("error") String str4, @c("on_purpose") Integer num, d<? super StatusResponse> dVar);

    @o("api/collab/invite_accept")
    @e
    Object postCollabInviteAccept(@i("x-referer") String str, @c("live_id") String str2, @c("collab_type") int i10, d<? super CollabRequestResponse> dVar);

    @o("api/collab/matching_accept_v2")
    @e
    Object postCollabMatchingAccept(@i("x-referer") String str, @c("matched_live_id") String str2, d<? super AcceptedMatchedCollabResponse> dVar);

    @o("api/collab/matching_cancel_v2")
    @e
    Object postCollabMatchingCancel(@i("x-referer") String str, @c("live_id") String str2, @c("is_matching_starter") int i10, d<? super StatusResponse> dVar);

    @o("api/collab/matching_enable")
    @e
    Object postCollabMatchingEnable(@i("x-referer") String str, @c("live_id") String str2, @c("enabled") int i10, d<? super StatusResponse> dVar);

    @o("api/collab/matching_start_v2")
    @e
    Object postCollabMatchingStart(@i("x-referer") String str, @c("live_id") String str2, @c("is_restart") int i10, d<? super CollabMatchingStartResponse> dVar);

    @o("api/collab/request")
    @e
    Object postCollabRequest(@i("x-referer") String str, @c("live_id") String str2, @c("collab_type") int i10, @c("is_reconnect") Integer num, d<? super CollabRequestResponse> dVar);

    @o("api/collab/send_to_peer")
    @e
    Object postCollabSendToPeer(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, @c("raw") String str4, d<? super StatusResponse> dVar);

    @o("api/collab/start")
    @e
    Object postCollabStart(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, @c("is_matching") int i10, d<? super StatusResponse> dVar);

    @o("api/live/delete_live_history")
    @e
    Object postDeleteLiveHistory(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/app/delete_my_app")
    Object postDeleteMyApp(@i("x-referer") String str, @a c0 c0Var, d<? super StatusResponse> dVar);

    @o("/api/user/post_demographic")
    @e
    Object postDemographic(@c("gender_type") int i10, @c("generation") int i11, d<? super StatusResponse> dVar);

    @o("api/giftbox_gacha/execute")
    @e
    Object postExecuteGiftboxGacha(@i("x-referer") String str, @c("user_giftbox_gacha_id") String str2, d<? super GiftboxGachaExecuteResponse> dVar);

    @o("api/feature/register_signature_jwt")
    Object postFeatureRegisterSignatureJwt(@i("x-referer") String str, @a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/graph/follow")
    @e
    Object postFollow(@i("x-referer") String str, @c("user_id") String str2, d<? super StatusResponse> dVar);

    @o("api/graph/follow_live_watched_users")
    @e
    Object postFollowLiveWatchedUsers(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/notification/follow_push")
    @e
    Object postFollowNotificationSetting(@i("x-referer") String str, @c("user_id") String str2, @c("enabled") int i10, d<? super StatusResponse> dVar);

    @o("social/twitter/follow_official_twitter")
    Object postFollowOfficialTwitter(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/gallery/photo")
    Object postGalleryPhoto(@i("x-referer") String str, @a c0 c0Var, d<? super PhotoCampaignPostStatusResponse> dVar);

    @o("/api/gift_gacha/open")
    @e
    Object postGiftGachaOpen(@i("x-referer") String str, @c("live_id") String str2, @c("sender_id") String str3, @c("collab_user_id") int i10, @c("count") int i11, @c("type") int i12, @c("gift_event_id") int i13, d<? super GiftGachaOpenResponse> dVar);

    @o("api/graph/bulk_follow")
    Object postGraphBulkFollow(@i("x-referer") String str, @a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/graph/follow")
    @e
    Object postGraphFollow(@i("x-referer") String str, @c("user_id") String str2, d<? super Graph.Follow> dVar);

    @o("api/graph/unfollow")
    @e
    Object postGraphUnfollow(@i("x-referer") String str, @c("user_id") String str2, d<? super StatusResponse> dVar);

    @o("api/group/edit")
    Object postGroupEdit(@i("x-referer") String str, @a c0 c0Var, d<? super Group.Edit> dVar);

    @o("api/group/invite_users")
    @e
    Object postGroupInviteUsers(@i("x-referer") String str, @c("group_id") String str2, @c("user_ids") String str3, d<? super Group.InviteUsers> dVar);

    @o("api/group/kick_users")
    @e
    Object postGroupKickUsers(@i("x-referer") String str, @c("group_id") String str2, @c("user_ids") String str3, d<? super StatusResponse> dVar);

    @o("api/group/leave")
    @e
    Object postGroupLeave(@i("x-referer") String str, @c("group_id") String str2, d<? super StatusResponse> dVar);

    @o("/api/avatar/group_shot_post")
    Object postGroupShot(@i("x-referer") String str, @a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/collab/invite")
    @e
    Object postInviteCollab(@i("x-referer") String str, @c("live_id") String str2, @c("invite_user_id") String str3, @c("collab_type") int i10, d<? super StatusResponse> dVar);

    @o("api/karaoke/end")
    Object postKaraokeEnd(@t("live_id") String str, d<? super v> dVar);

    @o("api/live/live_app_identifier_changed")
    @e
    Object postLiveAppIdentifierChanged(@i("x-referer") String str, @c("app_identifier") String str2, @c("live_id") String str3, d<? super StatusResponse> dVar);

    @o("api/live/live_capture_image")
    Object postLiveCaptureImage(@i("x-referer") String str, @a c0 c0Var, d<? super LiveCaptureImageResponse> dVar);

    @o("api/live/live_comment")
    @e
    Object postLiveComment(@i("x-referer") String str, @c("live_id") String str2, @c("type") int i10, @c("comment") String str3, @c("target_live_id") String str4, @c("linked_live_id") String str5, @c("where") String str6, @c("come_back_from_live_id") String str7, @c("streaming_collab_live_id") String str8, @c("from_catalog_id") String str9, @c("invited_live_game_id") String str10, d<? super LiveCommentResponse> dVar);

    @o("api/live/live_create")
    @e
    Object postLiveCreate(@i("x-referer") String str, @c("is_private") int i10, @c("is_omotenashi") int i11, d<? super LiveOwnedResponse> dVar);

    @o("api/live/live_edit")
    @e
    Object postLiveEdit(@i("x-referer") String str, @c("live_id") String str2, @c("title") String str3, @c("app_id") String str4, @c("description") String str5, @c("orientation") Integer num, @c("orientation_v2") Integer num2, @c("collab_enabled") Integer num3, @c("max_collab_user_num") Integer num4, @c("is_catalog_emomo_enabled") Integer num5, d<? super LiveOwnedResponse> dVar);

    @o("api/live/live_end")
    @e
    Object postLiveEnd(@i("x-referer") String str, @c("live_id") String str2, @c("is_wired_headset_connected") Integer num, @c("is_earphone_mode") int i10, d<? super LiveEndResponse> dVar);

    @o("api/live_game/connect_cancel")
    @e
    Object postLiveGameConnectCancel(@i("x-referer") String str, @c("live_id") String str2, @c("play_id") String str3, d<? super StatusResponse> dVar);

    @o("api/live_game/end")
    @e
    Object postLiveGameEnd(@i("x-referer") String str, @c("play_id") String str2, @c("live_id") String str3, d<? super StatusResponse> dVar);

    @o("api/live_game/ping")
    @e
    Object postLiveGamePing(@i("x-referer") String str, @c("play_id") String str2, @c("live_id") String str3, d<? super LiveGamePingResponse> dVar);

    @o("api/live/live_heartbeat")
    @e
    Object postLiveHeartbeat(@i("x-referer") String str, @c("live_id") String str2, @c("is_muted") int i10, @c("is_share_screen") int i11, @c("speech_synthesizer_enabled") int i12, @c("is_cast_mirroring") int i13, @c("is_emomo_visible") int i14, @c("is_app_foreground") int i15, @c("is_gift_overlay") int i16, @c("is_wired_headset_connected") int i17, @c("is_earphone_mode") int i18, @c("encoder_bitrate") Integer num, @c("network_bitrate") Integer num2, @c("buffering_size") Integer num3, @c("app_identifier") String str3, d<? super LiveHeartbeatResponse> dVar);

    @o("api/live/kick_out")
    @e
    Object postLiveKickOut(@i("x-referer") String str, @c("live_id") String str2, @c("user_id") String str3, d<? super StatusResponse> dVar);

    @o("api/live/leave")
    @e
    Object postLiveLeave(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/live/link")
    @e
    Object postLiveLink(@i("x-referer") String str, @c("live_id") String str2, @c("target_live_id") String str3, d<? super StatusResponse> dVar);

    @o("api/live/preview_end")
    @e
    Object postLivePreviewEnd(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/live/preview_polling")
    @e
    Object postLivePreviewPolling(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/live/preview_start")
    @e
    Object postLivePreviewStart(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/user/post_live_request")
    @e
    Object postLiveRequest(@i("x-referer") String str, @c("user_id") String str2, @c("count") long j10, @c("where") String str3, d<? super StatusResponse> dVar);

    @o("api/live/request_archive_download")
    @e
    Object postLiveRequestArchiveDownload(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/live/sanitize_text")
    @e
    Object postLiveSanitizeText(@i("x-referer") String str, @c("text") String str2, d<? super SanitizeTextResponse> dVar);

    @o("api/live/live_start")
    @e
    Object postLiveStart(@i("x-referer") String str, @c("live_id") String str2, @c("app_id") String str3, @c("is_muted") Integer num, @c("quality_level") String str4, @c("selected_thumbnail_frame_id") int i10, @c("is_wired_headset_connected") int i11, @c("is_earphone_mode") int i12, @c("speech_synthesizer_enabled") Integer num2, @c("tweet_hash_tags") String str5, @c("enabled_customize_hash_tags") int i13, @c("is_omotenashi") int i14, d<? super LiveOwnedResponse> dVar);

    @o("api/live/unlink")
    @e
    Object postLiveUnlink(@i("x-referer") String str, @c("live_id") String str2, d<? super StatusResponse> dVar);

    @o("api/live/update_archive_settings")
    @e
    Object postLiveUpdateArchiveSettings(@i("x-referer") String str, @c("live_id") String str2, @c("archive_hidden") int i10, d<? super StatusResponse> dVar);

    @o("api/live/update_emomo_visible")
    @e
    Object postLiveUpdateEmomoVisible(@c("live_id") String str, @c("is_visible") boolean z10, d<? super StatusResponse> dVar);

    @o("api/live/update_wipe_enabled")
    @e
    Object postLiveUpdateWipeEnabled(@c("live_id") String str, @c("is_emomo_wipe_enabled") int i10, d<? super StatusResponse> dVar);

    @o("api/mission/receive_reward")
    @e
    Object postMissionReceiveReward(@i("x-referer") String str, @c("mission_period") String str2, @c("mission_id") int i10, d<? super MissionReceiveRewardResponse> dVar);

    @o("api/app_mutual_gift_event/receive_reward")
    @e
    Object postMutualGiftReceiveReward(@c("event_id") int i10, @c("mutual_user_id") String str, d<? super MutualGiftReceiveRewardResponse> dVar);

    @o("api/notification/push_settings_v3")
    @e
    Object postNotificationPushSettings(@i("x-referer") String str, @c("is_enabled_lives") int i10, @c("is_enabled_present_boxes") int i11, @c("is_enabled_yours") int i12, @c("is_enabled_campaigns") int i13, @c("is_enabled_news") int i14, @c("is_enabled_chats") int i15, d<? super NotificationPushSettingsV3Response> dVar);

    @o("api/gift_appeal_popup/read")
    @e
    Object postPopupRead(@i("x-referer") String str, @c("gift_appeal_popup_id") int i10, d<? super StatusResponse> dVar);

    @o("api/avatar/purchase_avatars")
    Object postPurchaseAvatars(@i("x-referer") String str, @a PurchaseAvatarsRequest purchaseAvatarsRequest, d<? super PurchaseAvatarsResponse> dVar);

    @o("api/user/purchase_continuous_live_holiday")
    Object postPurchaseContinuousLiveHoliday(d<? super PurchaseContinuousLiveHolidayResponse> dVar);

    @o("api/quiz/post_answer")
    @e
    Object postQuizPostAnswer(@i("x-referer") String str, @c("id") String str2, @c("question_nth") int i10, @c("answer_nth") int i11, @c("use_life") int i12, d<? super StatusResponse> dVar);

    @o("api/ranking/update_focus")
    @e
    Object postRankingUpdateFocus(@i("x-referer") String str, @c("event_type") int i10, @c("event_id") String str2, d<? super StatusResponse> dVar);

    @o("api/present/receive_gift_code")
    @e
    Object postReceiveGiftCode(@i("x-referer") String str, @c("user_gift_code_present_id") int i10, @c("code_type") int i11, d<? super GiftCodeSelectionReceiveResponse> dVar);

    @o("/api/reward_ad/complete")
    @e
    Object postRewardAdCoinChallenge(@i("x-referer") String str, @c("reward_id") int i10, d<? super RewardAdCompleteResponse> dVar);

    @o("api/live/select_recommend_live")
    @e
    Object postSelectRecommendLive(@i("x-referer") String str, @c("live_id") String str2, @c("target_live_id") String str3, d<? super StatusResponse> dVar);

    @o("/social/twitter/post_tweet")
    @e
    Object postTweet(@i("x-referer") String str, @c("text") String str2, d<? super StatusResponse> dVar);

    @o("api/graph/unblock")
    @e
    Object postUnblock(@i("x-referer") String str, @c("user_id") String str2, d<? super StatusResponse> dVar);

    @o("api/graph/unfollow")
    @e
    Object postUnfollow(@i("x-referer") String str, @c("user_id") String str2, d<? super StatusResponse> dVar);

    @o("api/user/update_favorite_live_setting")
    @e
    Object postUpdateFavoriteLiveSetting(@i("x-referer") String str, @c("id") int i10, @c("title") String str2, @c("app_id") String str3, @c("memo") String str4, @c("live_thumbnail_image_url") String str5, d<? super FavoriteLiveSettingResponse> dVar);

    @o("api/user/update_recording_settings")
    @e
    Object postUpdateRecordSettings(@i("x-referer") String str, @c("enabled") int i10, d<? super StatusResponse> dVar);

    @o("api/user/use_favorite_live_setting")
    @e
    Object postUseFavoriteLiveSetting(@i("x-referer") String str, @c("live_id") String str2, @c("id") int i10, d<? super StatusResponse> dVar);

    @o("api/user/bad_report")
    @e
    Object postUserBadReport(@i("x-referer") String str, @c("user_id") String str2, @c("message") String str3, @c("category_id") String str4, @c("live_id") String str5, d<? super StatusResponse> dVar);

    @o("api/user/broadcast_settings")
    @e
    Object postUserBroadcastSettings(@i("x-referer") String str, @c("twitter_autopost") Integer num, @c("twitter_autopost_live_announcement") Integer num2, d<? super BroadcastSettings> dVar);

    @o("api/user/delete_live_announcement")
    Object postUserDeleteLiveAnnouncement(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/user/logout")
    Object postUserLogout(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("api/user/post_live_announcement")
    @e
    Object postUserPostLiveAnnouncement(@i("x-referer") String str, @c("body") String str2, @c("start_at") Integer num, @c("is_notified_to_follower") int i10, @c("app_id") String str3, d<? super LiveAnnouncementResponse> dVar);

    @o("api/user/profile_edit")
    Object postUserProfileEdit(@i("x-referer") String str, @a c0 c0Var, d<? super UserProfile> dVar);

    @o("api/user/update_private_live_invitations")
    @e
    Object postUserUpdatePrivateLiveInvitations(@i("x-referer") String str, @c("group_ids") String str2, @c("user_ids") String str3, @c("all_followers") Integer num, d<? super PrivateLiveInvitationsResponse> dVar);

    @o("api/app/publish_app_user_detail")
    @e
    Object publishAppUserDetail(@i("x-referer") String str, @c("app_id") String str2, @c("type") int i10, @c("is_publish") int i11, d<? super AppUserDetailResponse> dVar);

    @f("api/closet/avatar")
    Object requestClosetAvatar(@t("closet_id") Integer num, @t("user_id") String str, d<? super ClosetAvatarResponse> dVar);

    @f("api/closet/avatar_parts")
    Object requestClosetParts(d<? super ClosetAvatarPartsResponse> dVar);

    @f("api/closet/closets")
    Object requestClosets(d<? super ClosetsResponse> dVar);

    @o("api/shooter/request_matching")
    Object requestShooterMatching(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @f("api/karaoke/search")
    Object searchKaraoke(@t("live_id") String str, @t("q") String str2, @t("limit") Integer num, d<? super KaraokeSearch> dVar);

    @o("social/twitter/connect_twitter")
    @e
    Object twitterConnectRequest(@i("x-referer") String str, @c("oauth_token") String str2, @c("oauth_token_secret") String str3, @c("include_urge_users") Integer num, d<? super Social.SocialAccount> dVar);

    @o("social/twitter/disconnect_twitter")
    Object twitterDisconnectRequest(@i("x-referer") String str, d<? super StatusResponse> dVar);

    @o("social/twitter/sign_up")
    @e
    Object twitterSignUpRequest(@i("x-referer") String str, @c("type") String str2, @c("access_token") String str3, @c("access_token_secret") String str4, @c("include_urge_users") Integer num, @c("handover_code") String str5, @c("dynamic_link") String str6, d<? super Social.SocialAccount> dVar);

    @o("api/closet/update_closet_avatar")
    Object updateClosetAvatar(@a UpdateClosetAvatarRequest updateClosetAvatarRequest, d<? super ClosetAvatarResponse> dVar);

    @o("api/closet/update_closet_images")
    Object updateClosetImages(@a c0 c0Var, d<? super ClosetResponse> dVar);

    @o("api/closet/update_closet_name")
    Object updateClosetName(@a UpdateClosetNameRequest updateClosetNameRequest, d<? super ClosetResponse> dVar);

    @o("/api/closet/update_companion_name")
    @e
    Object updateCompanionName(@i("x-referer") String str, @c("avatar_part_id") String str2, @c("name") String str3, d<? super UpdateCompanionNameResponse> dVar);

    @o("api/user/update_handover_code")
    @e
    Object updateHandoverCode(@i("x-referer") String str, @c("code") String str2, d<? super StatusResponse> dVar);

    @o("/api/closet/upsert_part_text")
    @e
    Object updatePartText(@i("x-referer") String str, @c("avatar_part_id") String str2, @c("part_text") String str3, d<? super UpdatePartTextResponse> dVar);

    @o("api/shooter/update_member_status")
    @e
    Object updateShooterMemberStatus(@c("season_id") int i10, @c("team_id") int i11, @c("member_user_id") String str, @c("member_status") int i12, @c("current_time") Integer num, @c("hash") String str2, @c("group_id") Integer num2, @c("rank") Integer num3, @c("kick_num") Integer num4, @c("life") Integer num5, @c("game_team_rank") Integer num6, @c("game_team_point") Integer num7, @c("wave_flag_num") Integer num8, @c("drop_flag_num") Integer num9, d<? super ShooterUpdateMemberResponse> dVar);

    @o("api/shooter/update_team_status")
    @e
    Object updateShooterTeamStatus(@c("season_id") int i10, @c("team_id") int i11, @c("team_status") int i12, @c("group_id") Integer num, @c("room_id") String str, d<? super ShooterUpdateTeamResponse> dVar);

    @o("api/gift/update_rich_unique_emomo_gift")
    Object updateUniqueEmomoRichGiftSlot(@a c0 c0Var, d<? super StatusResponse> dVar);

    @o("api/gift/update_simple_unique_emomo_gift")
    Object updateUniqueEmomoStampGiftSlot(@a c0 c0Var, d<? super StatusResponse> dVar);
}
