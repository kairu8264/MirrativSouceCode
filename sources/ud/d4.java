package ud;

/* loaded from: classes2.dex */
public interface d4 {

    /* loaded from: classes2.dex */
    public enum a {
        VIEW_TYPE_COMMENT,
        VIEW_TYPE_SHARE_URL_REQUEST,
        VIEW_TYPE_GIFT,
        VIEW_TYPE_EVENT_NOTICE,
        VIEW_TYPE_APP_USED_ID,
        VIEW_TYPE_BOT,
        VIEW_TYPE_COLLAB_LIVE_GIFT,
        VIEW_TYPE_TEXT,
        VIEW_TYPE_URL_SHARED,
        VIEW_TYPE_COLLAB_REQUEST,
        VIEW_TYPE_LIVE_LINKED,
        VIEW_TYPE_COLLAB_MATCHING_START,
        VIEW_TYPE_COLLAB_END,
        VIEW_TYPE_COLLAB_RECOMMEND_LIVE,
        VIEW_TYPE_MESSAGE_GIFT,
        VIEW_TYPE_SHOOTER_MATCHING_VIEWER_ENTER,
        VIEW_TYPE_EMPTY,
        VIEW_TYPE_END,
        VIEW_TYPE_LUCKY_PRIZE,
        VIEW_TYPE_CHEER_LEVEL_UP,
        VIEW_TYPE_CHEERLEADER_ENTER
    }

    String a();

    String b();

    String c();

    int d();

    String e();

    String f();

    String g();

    a getType();

    String h();
}
