package od;

import com.dena.mirrorman.net.api.response.Feature;
import com.dena.mirrorman.net.api.response.user.TimeMachine;
import pd.m;

/* loaded from: classes2.dex */
public final class j implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44940w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.i f44941x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44942y;

    public j(q8.a aVar, kf.i iVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(iVar, "featurePreference");
        this.f44940w = aVar;
        this.f44941x = iVar;
        this.f44942y = uo.r0.b();
    }

    public final void a(Feature.Capabilities capabilities) {
        jo.p.h(capabilities, "capabilities");
        kf.i iVar = this.f44941x;
        String offerWallUrl = capabilities.getOfferWallUrl();
        if (offerWallUrl == null) {
            offerWallUrl = "";
        }
        iVar.e3(offerWallUrl);
        this.f44941x.z1(capabilities.getCollaboEmomoEnabled());
        kf.i iVar2 = this.f44941x;
        Feature.Share share = capabilities.getShare();
        iVar2.Z4((share == null || (r1 = share.getPopupTitle()) == null) ? "" : "");
        kf.i iVar3 = this.f44941x;
        Feature.Share share2 = capabilities.getShare();
        iVar3.P0((share2 == null || (r1 = share2.getPopupDescription()) == null) ? "" : "");
        this.f44941x.j1(capabilities.getMailSupportEnabled());
        this.f44941x.x4(capabilities.getLivePrepareTutorialEnabled());
        this.f44941x.m5(capabilities.getDemographicEnabled());
        this.f44941x.e(capabilities.getDemographicLastShownTime());
        this.f44941x.R4(capabilities.getUserMeCacheExpire());
        this.f44941x.e4(capabilities.getNoticeCountsCacheExpire());
        this.f44941x.V2(capabilities.getHomeRewardAdButtonEnabled());
        this.f44941x.h4(capabilities.isInviteCollabSupported());
        kf.i iVar4 = this.f44941x;
        String signature_verify_nonce = capabilities.getSignature_verify_nonce();
        if (signature_verify_nonce == null) {
            signature_verify_nonce = "";
        }
        iVar4.X1(signature_verify_nonce);
        this.f44941x.M1(capabilities.getPackageUsageStatsInterval());
        kf.i iVar5 = this.f44941x;
        Feature.TweetHashTags tweetHashTags = capabilities.getTweetHashTags();
        String s10 = tweetHashTags != null ? new xm.e().s(tweetHashTags) : null;
        if (s10 == null) {
            s10 = "";
        }
        iVar5.O1(s10);
        kf.i iVar6 = this.f44941x;
        TimeMachine timeMachine = capabilities.getTimeMachine();
        String s11 = timeMachine != null ? new xm.e().s(timeMachine) : null;
        if (s11 == null) {
            s11 = "";
        }
        iVar6.W3(s11);
        kf.i iVar7 = this.f44941x;
        String seasonRatingInfoUrl = capabilities.getSeasonRatingInfoUrl();
        iVar7.w5(seasonRatingInfoUrl != null ? seasonRatingInfoUrl : "");
        this.f44940w.a(new m.a(capabilities));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44942y.getCoroutineContext();
    }
}
