package com.dena.mirrorman.net;

import android.net.Uri;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import jo.h;
import oq.a;
import wn.f;
import wn.g;

/* loaded from: classes2.dex */
public abstract class MRUrl implements a {
    public static final int $stable = 8;
    private final f serverConfig$delegate;
    private final Uri uriValue;
    private final String url;

    /* loaded from: classes2.dex */
    public static final class CoinPurchaseNotice extends MRUrl {
        public static final int $stable = 0;
        public static final CoinPurchaseNotice INSTANCE = new CoinPurchaseNotice();

        private CoinPurchaseNotice() {
            super("page/coin", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContinuousHoliday extends MRUrl {
        public static final int $stable = 0;
        public static final ContinuousHoliday INSTANCE = new ContinuousHoliday();

        private ContinuousHoliday() {
            super("notice/holiday_right", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContinuousLive extends MRUrl {
        public static final int $stable = 0;
        public static final ContinuousLive INSTANCE = new ContinuousLive();

        private ContinuousLive() {
            super("notice/continuous_streamer", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DeerDeveloper extends MRUrl {
        public static final int $stable = 0;
        public static final DeerDeveloper INSTANCE = new DeerDeveloper();

        private DeerDeveloper() {
            super("notice/deeplink", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Diamond extends MRUrl {
        public static final int $stable = 0;
        public static final Diamond INSTANCE = new Diamond();

        private Diamond() {
            super("notice/diamond", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Faq extends MRUrl {
        public static final int $stable = 0;
        public static final Faq INSTANCE = new Faq();

        private Faq() {
            super("faq_ja", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Feedback extends MRUrl {
        public static final int $stable = 0;
        public static final Feedback INSTANCE = new Feedback();

        private Feedback() {
            super("customers_voice", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class GameId extends MRUrl {
        public static final int $stable = 0;
        public static final GameId INSTANCE = new GameId();

        private GameId() {
            super("notice/game_id", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Guideline extends MRUrl {
        public static final int $stable = 0;
        public static final Guideline INSTANCE = new Guideline();

        private Guideline() {
            super("page/guideline", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class HelpCollab extends MRUrl {
        public static final int $stable = 0;
        public static final HelpCollab INSTANCE = new HelpCollab();

        private HelpCollab() {
            super("help_collab", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class MatchingCollabCampaign extends MRUrl {
        public static final int $stable = 0;
        public static final MatchingCollabCampaign INSTANCE = new MatchingCollabCampaign();

        private MatchingCollabCampaign() {
            super("matching_collab_campaign", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Moderator extends MRUrl {
        public static final int $stable = 0;
        public static final Moderator INSTANCE = new Moderator();

        private Moderator() {
            super("notice/moderator", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TermsForStreamer extends MRUrl {
        public static final int $stable = 0;
        public static final TermsForStreamer INSTANCE = new TermsForStreamer();

        private TermsForStreamer() {
            super("terms_for_streamer", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TipsOfStreaming extends MRUrl {
        public static final int $stable = 0;
        public static final TipsOfStreaming INSTANCE = new TipsOfStreaming();

        private TipsOfStreaming() {
            super("notice/tipsofstreaming", null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TroubleshootCollab extends MRUrl {
        public static final int $stable = 0;
        public static final TroubleshootCollab INSTANCE = new TroubleshootCollab();

        private TroubleshootCollab() {
            super("troubleshoot_collab", null);
        }
    }

    private MRUrl(String str) {
        this.serverConfig$delegate = g.b(cr.a.f28611a.b(), new MRUrl$special$$inlined$inject$default$1(this, null, null));
        String str2 = getServerConfig().getServerURLwithBasicAuth() + '/' + str;
        this.url = str2;
        this.uriValue = Uri.parse(str2);
    }

    public /* synthetic */ MRUrl(String str, h hVar) {
        this(str);
    }

    private final ServerConfig getServerConfig() {
        return (ServerConfig) this.serverConfig$delegate.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final Uri getUriValue() {
        return this.uriValue;
    }

    public final String getUrl() {
        return this.url;
    }
}
