package ud;

/* loaded from: classes2.dex */
public interface r2 {

    /* loaded from: classes2.dex */
    public enum a {
        VIEW_TYPE_COMMENT,
        VIEW_TYPE_SHARE_URL_REQUEST,
        VIEW_TYPE_MEMO_BROADCAST,
        VIEW_TYPE_GIFT,
        VIEW_TYPE_EVENT_NOTICE,
        VIEW_TYPE_APP_USED_ID,
        VIEW_TYPE_CHECK_PROFILE,
        VIEW_TYPE_BOT,
        VIEW_TYPE_COLLAB_LIVE_GIFT,
        VIEW_TYPE_LIVE_GAME_INVITED,
        VIEW_TYPE_LUCKY_PRIZE,
        VIEW_TYPE_CHEER_LEVEL_UP,
        VIEW_TYPE_CHEERLEADER_ENTER
    }

    String a();

    String c();

    int d();

    String e();

    a getType();
}
