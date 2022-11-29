package jf;

/* loaded from: classes2.dex */
public enum k {
    STOP_PLAY,
    STOP_CAST,
    STOP_COLLAB,
    ON_SERVICE_DESTROY,
    REQUEST_ERROR,
    TIMEOUT,
    RECONNECT_TIMEOUT,
    MATCHING_TIMEOUT,
    PHONE_CALL,
    CLOSE_BUTTON_TAPPED,
    ICE_CONNECTION_FAILED,
    ICE_CONNECTION_CLOSED,
    CANCEL_COLLAB_LIVE,
    PLAYER_SHOW_RECOMMEND_LIVE,
    PLAYER_COLLAB_CANCEL_FROM_DIALOG,
    PLAYER_LINKED_LIVE_VIEW,
    PLAYER_LINKED_LIVE_BACK_VIEW,
    HANDLE_COLLAB_CANCEL,
    HANDLE_COLLAB_CLOSE;

    public final boolean c() {
        return (this == STOP_CAST || this == STOP_COLLAB || this == ON_SERVICE_DESTROY || this == CANCEL_COLLAB_LIVE || this == PLAYER_COLLAB_CANCEL_FROM_DIALOG || this == HANDLE_COLLAB_CANCEL || this == MATCHING_TIMEOUT || this == CLOSE_BUTTON_TAPPED) ? false : true;
    }

    public final boolean e() {
        return this == CLOSE_BUTTON_TAPPED || this == TIMEOUT;
    }
}
