package vd;

import android.content.Context;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.AdClick;
import com.dena.mirrorman.clientlog.logs.AdImp;
import com.dena.mirrorman.clientlog.logs.Adjust;
import com.dena.mirrorman.clientlog.logs.AppPage;
import com.dena.mirrorman.clientlog.logs.Archive;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.BottomNavigation;
import com.dena.mirrorman.clientlog.logs.BulkSendLog;
import com.dena.mirrorman.clientlog.logs.DurationFromPlayStartLog;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.Home;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.clientlog.logs.Launch;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.OpenDeeplink;
import com.dena.mirrorman.clientlog.logs.OpenYouTube;
import com.dena.mirrorman.clientlog.logs.Profile;
import com.dena.mirrorman.clientlog.logs.Quiz;
import com.dena.mirrorman.clientlog.logs.RegCancel;
import com.dena.mirrorman.clientlog.logs.RegDone;
import com.dena.mirrorman.clientlog.logs.RegStep;
import com.dena.mirrorman.clientlog.logs.Review;
import com.dena.mirrorman.clientlog.logs.Tutorial;
import com.dena.mirrorman.clientlog.logs.UrgeUsers;
import jo.p;
import k8.a;
import wd.d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f57301a = new c();

    public final k8.a a(Context context) {
        k8.a a10 = new a.b(context).b(new d()).c(ActionLogBase.class, new wd.a()).c(Launch.class, new wd.a()).c(Launch.FirstLaunch.class, new wd.a()).c(Launch.DynamicLinksInstall.class, new wd.a()).c(Launch.DynamicLinksData.class, new wd.a()).c(RegStep.class, new wd.a()).c(RegDone.class, new wd.a()).c(RegCancel.class, new wd.a()).c(Tutorial.Introduction.class, new wd.a()).c(Tutorial.Dashboard.class, new wd.a()).c(Tutorial.PlayLive.class, new wd.a()).c(Tutorial.CommentGuide.class, new wd.a()).c(Live.ViewEnd.class, new wd.a()).c(Live.CollabError.class, new wd.a()).c(Live.ViewBackgroundStart.class, new wd.a()).c(Live.ViewBackgroundEnd.class, new wd.a()).c(Live.ViewForeground.class, new wd.a()).c(Live.ViewReconnect.class, new wd.a()).c(Live.Share.class, new wd.a()).c(Live.ShowRecommendLive.class, new wd.a()).c(Live.ClickRecommendLive.class, new wd.a()).c(Live.imp_comment_share_request.class, new wd.a()).c(Live.click_comment_share_request.class, new wd.a()).c(Live.imp_share_panel.class, new wd.a()).c(Live.click_share_panel.class, new wd.a()).c(Live.ImpGiftPanel.class, new wd.a()).c(BulkSendLog.class, new wd.a()).c(Avatar.AvatarGesture.class, new wd.a()).c(Avatar.AvatarCloseCloset.class, new wd.a()).c(Avatar.EmomoTabTutorial.class, new wd.a()).c(Avatar.EmomoTabPermission.class, new wd.a()).c(Avatar.AvatarTakePicture.class, new wd.a()).c(Avatar.AvatarUpdateProfile.class, new wd.a()).c(Avatar.AvatarSelectPose.class, new wd.a()).c(Avatar.LaunchEmomoTab.class, new wd.a()).c(Avatar.AvatarZoom.class, new wd.a()).c(Review.class, new wd.a()).c(Archive.ViewStart.class, new wd.a()).c(Archive.ViewEnd.class, new wd.a()).c(Archive.ViewBackgroundStart.class, new wd.a()).c(Archive.ViewBackgroundEnd.class, new wd.a()).c(Archive.ViewForeground.class, new wd.a()).c(Archive.Share.class, new wd.a()).c(AdImp.class, new wd.b()).c(AdClick.class, new wd.b()).c(Profile.Launch.class, new wd.a()).c(AppPage.Launch.class, new wd.a()).c(UrgeUsers.Launch.class, new wd.a()).c(UrgeUsers.Follow.class, new wd.a()).c(Home.LaunchTab.class, new wd.a()).c(Home.ClickRecommendTag.class, new wd.a()).c(Home.ClickApp.class, new wd.a()).c(Home.ClickPlusApp.class, new wd.a()).c(BottomNavigation.LaunchTab.class, new wd.a()).c(Quiz.Imp.class, new wd.a()).c(Quiz.Click.class, new wd.a()).c(Adjust.AttributionChanged.class, new wd.a()).c(OpenDeeplink.class, new wd.a()).c(OpenYouTube.class, new wd.a()).c(Live.CastCommentTypeChanged.class, new wd.a()).c(KaraokeLog.class, new wd.a()).c(DurationFromPlayStartLog.class, new wd.a()).c(Live.RenderStart.class, new wd.a()).c(EventBannerLog.class, new wd.a()).c(Live.PlayerStart.class, new wd.a()).c(Live.PlayerEnd.class, new wd.a()).a();
        a10.c();
        p.g(a10, "conf");
        return a10;
    }

    public final void b(Context context) {
        p.h(context, "context");
        Puree.c(a(context));
    }
}
